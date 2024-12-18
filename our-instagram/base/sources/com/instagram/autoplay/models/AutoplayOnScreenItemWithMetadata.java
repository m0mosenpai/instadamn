package com.instagram.autoplay.models;

import X.C14360o3;
import X.C38321qM;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AutoplayOnScreenItemWithMetadata extends AutoplayScreenItemWithoutMetadata {
    public int height;
    public float percentageVisible;
    public int width;
    public int x;
    public int y;

    public /* synthetic */ AutoplayOnScreenItemWithMetadata(C38321qM c38321qM, long j, int i, int i2, int i3, int i4, float f, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38321qM, j, i, i2, i3, i4, (i5 & 64) != 0 ? 0.0f : f);
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getPercentageVisible() {
        return this.percentageVisible;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setPercentageVisible(float f) {
        this.percentageVisible = f;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final void setX(int i) {
        this.x = i;
    }

    public final void setY(int i) {
        this.y = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoplayOnScreenItemWithMetadata(C38321qM c38321qM, long j, int i, int i2, int i3, int i4, float f) {
        super(c38321qM, j);
        C14360o3.A0B(c38321qM, 1);
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
        this.percentageVisible = f;
    }
}
