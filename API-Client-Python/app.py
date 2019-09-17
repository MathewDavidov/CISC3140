import urllib
import json
import urllib.request
import requests
from urllib.request import urlopen
from flask import Flask, render_template
app = Flask(__name__)

url = "https://stats.nba.com/stats/leagueleaders?ActiveFlag=&LeagueID=00&PerMode=Totals&Scope=S&Season=2018-19&SeasonType=Regular+Season&StatCategory=PTS"
obj = urllib.request.urlopen(url)
read = obj.read()
data = json.loads(read.decode('utf-8'))


@app.route('/')
@app.route('/home')
def home():
    return render_template('index.html', info=data)


if __name__ == '__main__':
    app.run(debug=True)
