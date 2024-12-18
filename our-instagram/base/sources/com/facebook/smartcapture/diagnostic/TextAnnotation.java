package com.facebook.smartcapture.diagnostic;

import X.AbstractC167027dH;
import X.C14360o3;
import android.graphics.Point;

/* loaded from: classes10.dex */
public final class TextAnnotation {
    public final Color backgroundColor;
    public final int fontSize;
    public final String text;
    public final Color textColor;
    public final Point topLeftPosition;

    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getText() {
        return this.text;
    }

    public final Color getTextColor() {
        return this.textColor;
    }

    public final Point getTopLeftPosition() {
        return this.topLeftPosition;
    }

    public TextAnnotation(String str, Point point, Color color, Color color2, int i) {
        AbstractC167027dH.A13(str, point, color);
        C14360o3.A0B(color2, 4);
        this.text = str;
        this.topLeftPosition = point;
        this.textColor = color;
        this.backgroundColor = color2;
        this.fontSize = i;
    }
}
