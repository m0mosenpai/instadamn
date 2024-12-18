package com.instagram.util.jpeg;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NativeImage {
    public final int bufferId;
    public final long bufferPtr;
    public final int height;
    public final int width;

    public final int getBufferId() {
        return this.bufferId;
    }

    public final long getBufferPtr() {
        return this.bufferPtr;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public NativeImage(int i, int i2, int i3, long j) {
        this.bufferId = i;
        this.width = i2;
        this.height = i3;
        this.bufferPtr = j;
    }

    public /* synthetic */ NativeImage(int i, int i2, int i3, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? 0L : j);
    }
}
