package X;

import android.content.Intent;

/* renamed from: X.7VO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VO extends C7VI implements C7VM {
    public final InterfaceC09390do A00;

    @Override // X.C7VM
    public final void D6n(C7DC c7dc) {
        String A02;
        C14360o3.A0B(c7dc, 0);
        C7VP c7vp = (C7VP) this.A00.getValue();
        if (!c7vp.A00 && c7dc.A03()) {
            C150866ql c150866ql = c7vp.A02;
            if (c7dc.A02(c150866ql) != null) {
                if (C18U.A06(C06090Tz.A05, c7vp.A01, 36323672293780959L) && (A02 = c7dc.A02(c150866ql)) != null) {
                    c7vp.A00 = true;
                    AbstractC23641Du.A05(AnonymousClass191.A00, new PYc(c7vp, A02, null, 9), AbstractC141776au.A00(c7vp));
                }
            }
        }
    }

    @Override // X.C7VM
    public final void DAP(C7IM c7im) {
    }

    @Override // X.C7VM
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public C7VO(C7VG c7vg) {
        super(c7vg);
        this.A00 = new C60842q8(new C206959Ea(this, 13), new C206959Ea(c7vg, 14), C149636oG.A00, new C0YZ(C7VP.class));
    }
}
