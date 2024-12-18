package X;

import android.window.BackEvent;

/* renamed from: X.002, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass002 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackEventCompat{touchX=");
        sb.append(this.A01);
        sb.append(", touchY=");
        sb.append(this.A02);
        sb.append(", progress=");
        sb.append(this.A00);
        sb.append(", swipeEdge=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass002(BackEvent backEvent) {
        float A01 = AnonymousClass000.A01(backEvent);
        float A02 = AnonymousClass000.A02(backEvent);
        float A00 = AnonymousClass000.A00(backEvent);
        int A03 = AnonymousClass000.A03(backEvent);
        this.A01 = A01;
        this.A02 = A02;
        this.A00 = A00;
        this.A03 = A03;
    }
}
