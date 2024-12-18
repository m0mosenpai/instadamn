package X;

import android.graphics.Rect;

/* renamed from: X.CrG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29027CrG implements C2YT {
    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        AbstractC78423f8 abstractC78423f8;
        AbstractC78423f8 abstractC78423f82;
        int A03 = C78613fT.A03(j);
        if (A03 == C78613fT.A01(j)) {
            abstractC78423f8 = C78413f7.A00;
        } else if (A03 == 0) {
            abstractC78423f8 = C78433f9.A00;
        } else {
            abstractC78423f8 = C26670Bq5.A00;
        }
        int i = abstractC78423f8.A01.A01;
        int A02 = C78613fT.A02(j);
        if (A02 == C78613fT.A00(j)) {
            abstractC78423f82 = C78413f7.A00;
        } else if (A02 == 0) {
            abstractC78423f82 = C78433f9.A00;
        } else {
            abstractC78423f82 = C26670Bq5.A00;
        }
        long A022 = AbstractC78873ft.A02(j, i, abstractC78423f82.A01.A01);
        return new C2YU(A022, new Rect(0, 0, AbstractC78683fa.A00(A022), AbstractC25228BEl.A02(A022)));
    }
}
