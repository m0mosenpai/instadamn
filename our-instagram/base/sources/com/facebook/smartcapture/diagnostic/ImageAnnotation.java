package com.facebook.smartcapture.diagnostic;

import X.AbstractC167007dF;
import android.graphics.Point;

/* loaded from: classes10.dex */
public final class ImageAnnotation {
    public final int bytesPerRow;
    public final int displayHeight;
    public final Point displayOrigin;
    public final int displayWidth;
    public final int height;
    public final byte[] image;
    public final int width;

    public ImageAnnotation(byte[] bArr, int i, int i2, int i3, Point point, int i4, int i5) {
        AbstractC167007dF.A1G(bArr, 1, point);
        this.image = bArr;
        this.bytesPerRow = i;
        this.width = i2;
        this.height = i3;
        this.displayOrigin = point;
        this.displayWidth = i4;
        this.displayHeight = i5;
    }

    public final int getBytesPerRow() {
        return this.bytesPerRow;
    }

    public final int getDisplayHeight() {
        return this.displayHeight;
    }

    public final Point getDisplayOrigin() {
        return this.displayOrigin;
    }

    public final int getDisplayWidth() {
        return this.displayWidth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final byte[] getImage() {
        return this.image;
    }

    public final int getWidth() {
        return this.width;
    }
}
