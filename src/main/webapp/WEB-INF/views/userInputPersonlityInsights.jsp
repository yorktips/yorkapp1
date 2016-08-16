<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${title_message}</title>
</head>
<body>

	<div class="tab-panels" role="tabpanel">
        <span class="input--reset icon-hyperlink">
          <span class="icon icon-reset"></span>
          <button class="base--a icon-hyperlink--button icon-hyperlink--button_BLANK input--reset-button" href="" type="reset">
            Reset
          </button> |
          <a class="base--a" href="/terms-of-use">Terms of use</a>
        </span>
        
        <ul class="tab-panels--tab-list" role="tablist">
          <li class="tab-panels--tab-list-item base--li" role="presentation">
            <a class="tab-panels--tab base--a active" href="#twitter-panel" aria-controls="twitter-panel" role="tab">Tweets and Replies</a>
          </li>
          <li class="tab-panels--tab-list-item base--li" role="presentation">
            <a class="tab-panels--tab base--a" href="#text-panel" aria-controls="text-panel" role="tab">Body of Text</a>
          </li>
          <li class="tab-panels--tab-list-item base--li" role="presentation">
            <a class="tab-panels--tab base--a" id="self-analysis-tab" href="#your-twitter-panel" aria-controls="text-panel" role="tab">Your Twitter Personality</a>
          </li>
        </ul>
        
          <div id="twitter-panel" class="tab-panels--tab-pane active" role="tab-panel">
            <form class="input--form1">

              <div class="base--h5 input--choose">Choose:</div>

              <input role="radio" class="base--radio" type="radio" id="twitter-Oprah" name="twitter" value="Oprah" data-lang="en">
              <label class="base--inline-label input--radio" for="twitter-Oprah">
                <img class="input--thumb" src="/images/twitter/oprah.png">@Oprah (EN)</label>

              <input role="radio" class="base--radio" type="radio" id="twitter-KingJames" name="twitter" value="KingJames" data-lang="en">
              <label class="base--inline-label input--radio" for="twitter-KingJames">
                <img class="input--thumb" src="/images/twitter/kingjames.jpg">@KingJames (EN)</label>

              <input role="radio" class="base--radio" type="radio" id="twitter-DonFranciscoTV" name="twitter" value="DonFranciscoTV" data-lang="es">
              <label class="base--inline-label input--radio" for="twitter-DonFranciscoTV">
                <img class="input--thumb" src="/images/twitter/DonFranciscoTV.jpg">@DonFranciscoTV (ES)</label>

              <input role="radio" class="base--radio" type="radio" id="twitter-pontifex_es" name="twitter" value="pontifex_es" data-lang="es">
              <label class="base--inline-label input--radio" for="twitter-pontifex_es">
                <img class="input--thumb" src="/images/twitter/pontifex_es.jpg">@pontifex_es (ES)</label>

              <input role="radio" class="base--radio" type="radio" id="twitter-trikaofficial" name="twitter" value="trikaofficial" data-lang="ar">
              <label class="base--inline-label input--radio" for="twitter-trikaofficial">
                <img class="input--thumb" src="/images/twitter/trikaofficial.jpg">@trikaofficial (AR)</label>

              <input role="radio" class="base--radio" type="radio" id="twitter-faridyu" name="twitter" value="faridyu" data-lang="ja">
              <label class="base--inline-label input--radio" for="twitter-faridyu">
                <img class="input--thumb" src="/images/twitter/faridyu.jpg">@faridyu (JA)</label>

              <div class="input--button-container">
                <button type="submit" class="base--button input--submit-button1">Analyze</button>
              </div>
            </form>
          </div>
          
          <div id="text-panel" class="tab-panels--tab-pane" role="tab-panel">
            <form class="input--form2">

              <div class="base--h5 input--choose">Choose:</div>

              <input role="radio" class="base--radio" type="radio" id="text-sample1" name="text-sample" data-file="sample1" data-lang="en" data-orientation="" />
              <label class="base--inline-label input--radio" for="text-sample1">2012 Debate - Barack Obama (EN)</label>

              <input role="radio" class="base--radio" type="radio" id="text-sample2" name="text-sample" data-file="sample2" data-lang="en" data-orientation="" />
              <label class="base--inline-label input--radio" for="text-sample2">Reflection - Gandhi (EN)</label>

              <input role="radio" class="base--radio" type="radio" id="text-ja" name="text-sample" data-file="ja" data-lang="ja" data-orientation="" />
              <label class="base--inline-label input--radio" for="text-ja">Michikusa - Natsume (JA)</label>

              <input role="radio" class="base--radio" type="radio" id="text-custom" name="text-sample" style="display:none"/>
              <label class="base--inline-label input--radio smartphone-hidden" for="text-custom">Your own text</label>

              <textarea id="inputText" class="base--textarea input--text-area" placeholder="Please enter text to analyze (minimum of 100 words)...">
              </textarea>
              <div class="input--button-container">
                <div id="languageChooser" class="input--language-chooser smartphone-hidden" style="display:none">
                  <div class="base--h5 input--choose">Choose language:</div>

                  <input role="radio" class="base--radio" type="radio" id="lang-en" name="text-lang" value="en"/>
                  <label class="base--inline-label" for="lang-en">English</label>
                  <input role="radio" class="base--radio" type="radio" id="lang-es" name="text-lang" value="es"/>
                  <label class="base--inline-label" for="lang-es">Spanish</label>
                  <input role="radio" class="base--radio" type="radio" id="lang-ar" name="text-lang" value="ar"/>
                  <label class="base--inline-label" for="lang-ar">Arabic</label>
                  <input role="radio" class="base--radio" type="radio" id="lang-ja" name="text-lang" value="ja"/>
                  <label class="base--inline-label" for="lang-ja">Japanese</label>
                </div>

                <button type="submit" class="base--button input--submit-button2">Analyze</button>
              </div>

            </form>
          </div>          
      </div> 
      
      <p/>
          <a href = "/yorkapp/" class = "tooltip-test" data-toggle = "tooltip" data-placement = "left" title = "Back the main page">Back</a>
      
</body>
</html>