package com.equalize.emoji

import com.vdurmont.emoji.EmojiParser

//Reference:
// Zero Width Joiner - https://en.wikipedia.org/wiki/Zero-width_joiner
// Emoji Java library - https://github.com/vdurmont/emoji-java
class EmojiHandler {
    final String ZERO_WIDTH_JOINER = '\u200D'

    String removeJoiner(String emoji) {
        return emoji.replaceAll(ZERO_WIDTH_JOINER, '')
    }

    String addJoiner(String emojis) {
        return EmojiParser.extractEmojis(emojis).join(ZERO_WIDTH_JOINER)
    }
}