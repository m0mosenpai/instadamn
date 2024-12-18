package X;

import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.9fj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215079fj extends AbstractC223669uB {
    public final float A00;
    public final int A01;
    public final String A02;

    public C215079fj(String str, float f) {
        this.A00 = f;
        this.A02 = str;
        this.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
    }

    public C215079fj() {
        this(null, 0.0f);
    }
}
