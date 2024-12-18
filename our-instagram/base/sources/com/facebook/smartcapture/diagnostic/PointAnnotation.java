package com.facebook.smartcapture.diagnostic;

import X.AbstractC167017dG;
import android.graphics.Point;

/* loaded from: classes10.dex */
public final class PointAnnotation {
    public final Color color;
    public final Point point;
    public final int radius;

    public final Color getColor() {
        return this.color;
    }

    public final Point getPoint() {
        return this.point;
    }

    public final int getRadius() {
        return this.radius;
    }

    public PointAnnotation(Point point, Color color, int i) {
        AbstractC167017dG.A1P(point, color);
        this.point = point;
        this.color = color;
        this.radius = i;
    }
}
