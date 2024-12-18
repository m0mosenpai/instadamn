package X;

import android.content.DialogInterface;

/* renamed from: X.J0p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43024J0p implements C7XU {
    public final int A00;
    public final Object A01;

    public C43024J0p(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C7XU
    public final void DAy() {
        switch (this.A00) {
            case 0:
                ((DialogInterface.OnDismissListener) this.A01).onDismiss(null);
                return;
            case 1:
                C38909HBg c38909HBg = (C38909HBg) this.A01;
                JG8 jg8 = c38909HBg.A00;
                if (jg8 == null) {
                    return;
                }
                jg8.D03(c38909HBg.A03, c38909HBg.A01);
                return;
            case 2:
                ((C37605Gh0) this.A01).A0A.CvD();
                return;
            default:
                ((C43018J0j) this.A01).Czx();
                return;
        }
    }

    @Override // X.C7XU
    public final void DB3() {
    }
}
