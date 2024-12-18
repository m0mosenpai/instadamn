package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Glc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37882Glc implements InterfaceC43457JHv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4E4 A01;
    public final /* synthetic */ C76403bk A02;
    public final /* synthetic */ boolean A03;

    public C37882Glc(C4E4 c4e4, C76403bk c76403bk, int i, boolean z) {
        this.A01 = c4e4;
        this.A02 = c76403bk;
        this.A03 = z;
        this.A00 = i;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3n() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3o() {
        C28091Xn A0Q;
        String id;
        C38321qM c38321qM;
        C4E4 c4e4 = this.A01;
        InterfaceC60442pS interfaceC60442pS = c4e4.A01;
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "IMPRESSION");
        C76403bk c76403bk = this.A02;
        boolean z = this.A03;
        int i = this.A00;
        c82713mZ.A4y = interfaceC60442pS.getModuleName();
        c82713mZ.A3c = AbstractC25228BEl.A13(c76403bk.getId());
        c82713mZ.A0d = EnumC130265uW.REELS_IN_FEED_UNIT;
        if (z) {
            C111034zF c111034zF = (C111034zF) AbstractC001800i.A0O(c76403bk.A0M, i);
            Long l = null;
            if (c111034zF != null && (c38321qM = c111034zF.A00) != null) {
                id = c38321qM.A2u();
                if (id != null) {
                    l = AbstractC25228BEl.A13(id);
                }
            } else {
                id = null;
            }
            c82713mZ.A3d = l;
            A0Q = AbstractC37302Gc3.A0Q(c4e4.A00);
        } else {
            c82713mZ.A0T(Integer.valueOf(i));
            List list = c76403bk.A0M;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((C111034zF) it.next()).A00.getId());
            }
            c82713mZ.A7c = AbstractC166987dD.A1F(AbstractC001800i.A0X(A0q));
            A0Q = AbstractC37302Gc3.A0Q(c4e4.A00);
            id = c76403bk.getId();
        }
        c82713mZ.A14 = Boolean.valueOf(A0Q.A03(id));
        return new C82753md(c82713mZ);
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 B3p() {
        return null;
    }

    @Override // X.InterfaceC43457JHv
    public final /* bridge */ /* synthetic */ InterfaceC82443m8 BrL() {
        return null;
    }
}
