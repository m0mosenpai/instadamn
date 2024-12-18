package com.google.ar.core;

import java.util.Locale;

/* loaded from: classes12.dex */
public class Quaternion {
    public static final Quaternion a = new Quaternion();
    public float w;
    public float x;
    public float y;
    public float z;

    public final String toString() {
        return String.format(Locale.ROOT, "[%.3f, %.3f, %.3f, %.3f]", Float.valueOf(this.x), Float.valueOf(this.y), Float.valueOf(this.z), Float.valueOf(this.w));
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 1.0f;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }

    public Quaternion() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 1.0f;
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 1.0f;
    }
}
