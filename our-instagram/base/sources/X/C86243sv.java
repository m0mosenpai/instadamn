package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.3sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86243sv implements InterfaceC81103jf {
    public final InterfaceC86223st A00;
    public final C81303k0 A01;
    public final C81133ji A02;

    public C86243sv(Context context, C38321qM c38321qM, InterfaceC86223st interfaceC86223st, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(interfaceC86223st, 2);
        C14360o3.A0B(c38321qM, 4);
        C14360o3.A0B(c75113Zb, 5);
        this.A00 = interfaceC86223st;
        this.A01 = c81303k0;
        this.A02 = new C81133ji(context, c38321qM, new InterfaceC81123jh() { // from class: X.3sw
            @Override // X.AnonymousClass370
            public final JG7 BQm() {
                return C86243sv.this.A00.BQm();
            }

            @Override // X.InterfaceC81123jh
            public final void DBY(C38321qM c38321qM2, C37905Gm2 c37905Gm2, C75113Zb c75113Zb2, int i2) {
                C86243sv c86243sv = C86243sv.this;
                c86243sv.A00.DBR(c38321qM2, c37905Gm2, c86243sv.A01, c75113Zb2, i2);
            }

            @Override // X.InterfaceC81123jh
            public final void Dmj(C38321qM c38321qM2, C37905Gm2 c37905Gm2, C75113Zb c75113Zb2, int i2) {
                C86243sv c86243sv = C86243sv.this;
                c86243sv.A00.Dmb(c38321qM2, c37905Gm2, c86243sv.A01, c75113Zb2, i2);
            }
        }, c75113Zb, c81303k0.A0T, i);
    }

    @Override // X.InterfaceC81103jf
    public final boolean DGb(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A02.DGb(motionEvent);
    }
}
