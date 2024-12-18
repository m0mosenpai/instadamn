package X;

import android.view.View;

/* renamed from: X.OwP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56157OwP implements C3PE {
    public final int A00;
    public final Object A01;

    public C56157OwP(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C3PE
    public final void DQY(View view) {
        C3PE c3pe;
        if (this.A00 == 0 && (c3pe = ((C51378Mmd) this.A01).A04) != null) {
            c3pe.DQY(view);
        }
    }

    @Override // X.C3PE
    public final boolean DsE(View view) {
        switch (this.A00) {
            case 0:
                C3PE c3pe = ((C51378Mmd) this.A01).A04;
                if (c3pe != null && c3pe.DsE(view)) {
                    return true;
                }
                return false;
            case 1:
                C31721DwQ.A0G((C31721DwQ) this.A01);
                return true;
            default:
                C51044Mgw A00 = C56049OuO.A00((C56049OuO) this.A01);
                C57164PZi.A03(A00, AbstractC141776au.A00(A00), 45);
                AbstractC166997dE.A1Y(A00.A0M, A00.A0W);
                return true;
        }
    }
}
