package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.3je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81093je implements InterfaceC81103jf {
    public final InterfaceC81083jd A00;
    public final C79743hP A01;
    public final C81133ji A02;

    public C81093je(C38321qM c38321qM, InterfaceC81083jd interfaceC81083jd, C79743hP c79743hP, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(interfaceC81083jd, 1);
        C14360o3.A0B(c38321qM, 3);
        this.A00 = interfaceC81083jd;
        this.A01 = c79743hP;
        Context context = c79743hP.A00;
        if (context != null) {
            this.A02 = new C81133ji(context, c38321qM, new InterfaceC81123jh() { // from class: X.3jg
                @Override // X.AnonymousClass370
                public final JG7 BQm() {
                    return C81093je.this.A00.BQm();
                }

                @Override // X.InterfaceC81123jh
                public final void DBY(C38321qM c38321qM2, C37905Gm2 c37905Gm2, C75113Zb c75113Zb2, int i2) {
                    C81093je c81093je = C81093je.this;
                    c81093je.A00.DBW(c38321qM2, c37905Gm2, c81093je.A01, c75113Zb2, i2);
                }

                @Override // X.InterfaceC81123jh
                public final void Dmj(C38321qM c38321qM2, C37905Gm2 c37905Gm2, C75113Zb c75113Zb2, int i2) {
                    C81093je c81093je = C81093je.this;
                    c81093je.A00.Dmh(c38321qM2, c37905Gm2, c81093je.A01, c75113Zb2, i2);
                }
            }, c75113Zb, c79743hP.A01(), i);
            return;
        }
        throw new IllegalStateException(AbstractC111324zv.A00(845));
    }

    @Override // X.InterfaceC81103jf
    public final boolean DGb(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A02.DGb(motionEvent);
    }
}
