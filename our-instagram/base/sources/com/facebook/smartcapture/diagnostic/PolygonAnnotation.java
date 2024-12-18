package com.facebook.smartcapture.diagnostic;

import X.AbstractC167017dG;
import X.C14360o3;
import android.graphics.Point;

/* loaded from: classes10.dex */
public final class PolygonAnnotation {
    public final Color borderColor;
    public final int borderWidth;
    public final Color fillColor;
    public final Point[] points;

    public final Color getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidth() {
        return this.borderWidth;
    }

    public final Color getFillColor() {
        return this.fillColor;
    }

    public final Point[] getPoints() {
        return this.points;
    }

    public PolygonAnnotation(Point[] pointArr, Color color, int i, Color color2) {
        AbstractC167017dG.A1P(pointArr, color);
        C14360o3.A0B(color2, 4);
        this.points = pointArr;
        this.borderColor = color;
        this.borderWidth = i;
        this.fillColor = color2;
    }
}
