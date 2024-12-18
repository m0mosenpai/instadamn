package X;

/* renamed from: X.4Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97224Yh {
    public final C4WV A00;
    public final int[] A01;

    public C97224Yh(C4WV c4wv, int... iArr) {
        if (iArr.length == 0) {
            AbstractC46512Bo.A05("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.A00 = c4wv;
        this.A01 = iArr;
    }
}
