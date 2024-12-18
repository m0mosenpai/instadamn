package com.instagram.arlink.model;

import X.AbstractC166987dD;
import X.AbstractC43594JPz;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;

/* loaded from: classes8.dex */
public class ArLinkTextBox {
    public final float mRotationDegree;
    public final Point mSize;
    public final RectF mTextRect;

    public static int getDistance(float f, float f2, float f3, float f4) {
        return (int) AbstractC43594JPz.A00(f3 - f, f4 - f2);
    }

    public float getRotationDegree() {
        return this.mRotationDegree;
    }

    public Point getSize() {
        return this.mSize;
    }

    public RectF getTextRect() {
        return this.mTextRect;
    }

    public ArLinkTextBox(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        RectF A0X = AbstractC166987dD.A0X();
        this.mTextRect = A0X;
        Point point = new Point();
        this.mSize = point;
        Path A0T = AbstractC166987dD.A0T();
        A0T.moveTo(f, f2);
        A0T.lineTo(f3, f4);
        A0T.lineTo(f7, f8);
        A0T.lineTo(f5, f6);
        A0T.close();
        A0T.computeBounds(A0X, true);
        float f9 = f3 - f;
        point.x = (int) AbstractC43594JPz.A00(f9, f4 - f2);
        point.y = (int) AbstractC43594JPz.A00(f5 - f, f6 - f2);
        this.mRotationDegree = (float) Math.toDegrees(Math.atan2(f2 - f4, f9));
    }
}
