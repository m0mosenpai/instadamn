package X;

import android.os.SystemClock;

/* renamed from: X.4JQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JQ extends C1KR {
    public final boolean A00;
    public final float A01;

    @Override // X.C1KP
    public final String A00() {
        return "Scroll Stop";
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.A00) {
            str = "Vertical";
        } else {
            str = "Horizontal";
        }
        sb.append(str);
        sb.append(" scroll Animation Stopped on ");
        sb.append(((C1KP) this).A01);
        sb.append(" with ");
        sb.append(this.A01);
        sb.append(" dp scroll distance");
        return sb.toString();
    }

    public C4JQ(C1KO c1ko, String str, float f, boolean z) {
        super(c1ko, str, str, SystemClock.uptimeMillis());
        this.A01 = f;
        this.A00 = z;
    }
}
