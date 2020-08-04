package com.equalize.emoji

import spock.lang.Specification

//Reference:
// List of emojis - https://unicode.org/emoji/charts/full-emoji-list.html

class EmojiHandlerSpec extends Specification {

    EmojiHandler emojiHandler

    def setup() {
        emojiHandler = new EmojiHandler()
    }

    def 'Remove joiner from woman technologist'() {
        expect:
        emojiHandler.removeJoiner('👩‍💻') == '👩💻'
    }

    def 'Remove joiners from family'() {
        expect:
        emojiHandler.removeJoiner('👨‍👩‍👧‍👦') == '👨👩👧👦'
    }

    def 'Remove joiner from main with red hair'() {
        expect:
        emojiHandler.removeJoiner('👨‍🦰') == '👨🦰'
    }

    def 'Remove joiner from woman on manual wheelchair'() {
        expect:
        emojiHandler.removeJoiner('👩‍🦽') == '👩🦽'
    }

    def 'Join woman with laptop'() {
        expect:
        emojiHandler.addJoiner('👩💻') == '👩‍💻'
    }

    def 'Join father and daughter'() {
        expect:
        emojiHandler.addJoiner('👨👧') == '👨‍👧'
    }

    def 'Join people holding hands'() {
        expect:
        emojiHandler.addJoiner('🧑🤝🧑') == '🧑‍🤝‍🧑'
    }

    def 'Join person with graduation cap'() {
        expect:
        emojiHandler.addJoiner('🧑🎓') == '🧑‍🎓'
    }
}
