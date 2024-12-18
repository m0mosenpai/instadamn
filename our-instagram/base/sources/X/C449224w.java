package X;

import java.lang.ref.WeakReference;

/* renamed from: X.24w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C449224w {
    public long A00;
    public long A01;
    public final InterfaceC10180ga A02;
    public final C24Q A03;
    public final C006802i A04 = C006802i.A0p;
    public final Object A05 = new Object();

    public C449224w(C24Q c24q) {
        this.A03 = c24q;
        InterfaceC10180ga interfaceC10180ga = new InterfaceC10180ga() { // from class: X.24x
            @Override // X.InterfaceC10180ga
            public final void EHy(String str, String str2, String str3, String str4, WeakReference weakReference, boolean z) {
                long A02;
                boolean A0K = C14360o3.A0K(str2, "clips_postcapture_camera");
                C449224w c449224w = C449224w.this;
                if (A0K) {
                    C006802i c006802i = c449224w.A04;
                    if (!c006802i.isMarkerOn(838610423, 0)) {
                        c006802i.markerStart(838610423);
                    }
                    C24Q c24q2 = c449224w.A03;
                    if (!c24q2.A0E(838599736, c449224w.A01)) {
                        A02 = c24q2.A04(null, null, 838599736, 7200000L);
                    } else {
                        return;
                    }
                } else {
                    C006802i c006802i2 = c449224w.A04;
                    if (c006802i2.isMarkerOn(838610423, 0)) {
                        c006802i2.markerEnd(838610423, (short) 2);
                    }
                    C24Q c24q3 = c449224w.A03;
                    if (!c24q3.A0E(838599736, c449224w.A01)) {
                        return;
                    } else {
                        A02 = c24q3.A02(838599736, c449224w.A01);
                    }
                }
                c449224w.A01 = A02;
            }
        };
        this.A02 = interfaceC10180ga;
        this.A00 = 17638868L;
        this.A01 = 838599736L;
        C10190gb.A00().A00.add(interfaceC10180ga);
    }
}
