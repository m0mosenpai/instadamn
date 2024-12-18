package com.instagram.fanclub.memberlist.repository;

import X.AbstractC166997dE;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C14360o3;
import X.C16930sl;
import X.C65974TxR;
import X.C9JQ;
import X.GFZ;
import X.InterfaceC15070pN;
import X.InterfaceC19390xP;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes6.dex */
public final class FanClubMemberListRepository {
    public final InterfaceC19390xP A00;
    public final InterfaceC15070pN A01;
    public final C0UO A02;
    public final FanClubApi A03;
    public final GFZ A04;

    public FanClubMemberListRepository(FanClubApi fanClubApi, GFZ gfz, String str) {
        C14360o3.A0B(str, 3);
        this.A03 = fanClubApi;
        this.A04 = gfz;
        this.A02 = gfz.A06;
        this.A01 = gfz.A05;
        this.A00 = gfz.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 25
            boolean r0 = X.MAJ.A01(r6, r3)
            if (r0 == 0) goto L60
            r4 = r6
            X.MAJ r4 = (X.MAJ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L52
            if (r0 != r2) goto L73
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L49
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.3DC r0 = (X.C3DC) r0
            java.lang.Object r0 = r0.F7f()
            X.E5m r0 = (X.C32034E5m) r0
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L3c
            X.0sl r0 = X.C16930sl.A00
        L3c:
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L40:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L68
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            return r1
        L49:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L52:
            X.AbstractC09560e7.A00(r3)
            com.instagram.fanclub.api.FanClubApi r0 = r5.A03
            r4.A00 = r2
            java.lang.Object r3 = r0.A0T(r4, r2, r2)
            if (r3 != r1) goto L24
            return r1
        L60:
            r0 = 42
            X.MAJ r4 = new X.MAJ
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L68:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L6e
            r1 = 0
            return r1
        L6e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L73:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository.A00(X.1Ds):java.lang.Object");
    }

    public final void A01(String str) {
        GFZ gfz = this.A04;
        if (str == null) {
            str = "";
        }
        if (!str.equals(gfz.A01)) {
            gfz.A01 = str;
            gfz.A04.Egh(C16930sl.A00);
            gfz.A00 = null;
        } else if (AbstractC166997dE.A1Z(gfz.A00, false) || gfz.A02.A04()) {
            return;
        }
        C65974TxR c65974TxR = gfz.A02;
        C9JQ BjP = c65974TxR.A06.BjP(str);
        if (gfz.A00 != null) {
            c65974TxR.A03(gfz.A01);
            return;
        }
        if (BjP.A01 == C05F.A0C) {
            C05A c05a = gfz.A04;
            Object obj = BjP.A06;
            if (obj == null) {
                obj = C16930sl.A00;
            }
            c05a.Egh(obj);
            return;
        }
        c65974TxR.A06(gfz.A01);
    }
}
