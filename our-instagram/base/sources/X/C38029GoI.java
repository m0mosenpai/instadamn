package X;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GoI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38029GoI implements InterfaceC154766xR {
    public final /* synthetic */ C37434GeE A00;

    @Override // X.InterfaceC154766xR
    public final void DRa(String str, Long l) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.JIJ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC154766xR
    public final void DRd(Context context, C51758Mth c51758Mth, C123645id c123645id, EnumC125775mS enumC125775mS, boolean z, boolean z2) {
        ?? r0;
        List list;
        ?? r4;
        if (z) {
            C37434GeE c37434GeE = this.A00;
            c37434GeE.A0A.clear();
            c37434GeE.A02.putBoolean("arg_user_feed_is_first_page", true);
        }
        C37434GeE c37434GeE2 = this.A00;
        C154786xT c154786xT = c37434GeE2.A08;
        String str = c123645id.A02;
        C154806xV c154806xV = c154786xT.A03.A03;
        c154806xV.A09 = str;
        c154806xV.A08 = c123645id.A01;
        List list2 = c123645id.A03;
        if (list2 != null) {
            r0 = AbstractC166987dD.A1E();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C37771pE c37771pE = ((C38748H4o) it.next()).A02;
                if (c37771pE != null) {
                    r0.add(c37771pE);
                }
            }
        } else {
            r0 = C16930sl.A00;
        }
        if (!AbstractC166987dD.A1b(r0) || (list = c123645id.A03) == null) {
            list = C16930sl.A00;
        }
        List list3 = c123645id.A03;
        if (list3 != null) {
            r4 = AbstractC166987dD.A1E();
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                C38321qM c38321qM = ((C38748H4o) it2.next()).A01;
                if (c38321qM != null) {
                    r4.add(c38321qM);
                }
            }
        } else {
            r4 = c123645id.A06;
            C14360o3.A0A(r4);
        }
        Iterator it3 = r4.iterator();
        while (it3.hasNext()) {
            c37434GeE2.A0A.add(AbstractC31172DnG.A0i(it3).getId());
        }
        c37434GeE2.A06.DgU(c123645id.A02, c123645id.A04, r4, list, false, z);
    }

    public C38029GoI(C37434GeE c37434GeE) {
        this.A00 = c37434GeE;
    }

    @Override // X.InterfaceC154766xR
    public final void DRX(AbstractC115105If abstractC115105If, EnumC125775mS enumC125775mS) {
        this.A00.A06.Dfp();
    }

    @Override // X.InterfaceC154766xR
    public final void DRZ(EnumC125775mS enumC125775mS) {
        this.A00.A06.Dfz();
    }

    @Override // X.InterfaceC154766xR
    public final void DRc(EnumC125775mS enumC125775mS, boolean z, boolean z2, boolean z3) {
        this.A00.A06.DgF();
    }
}
