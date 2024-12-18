package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.MhI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51062MhI extends AbstractC51063MhJ {
    public final C25844Bbz A00;
    public final C19L A01;
    public final UserSession A02;
    public final String A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C51062MhI r7, java.lang.String r8, X.InterfaceC23621Ds r9, X.InterfaceC16620sF r10) {
        /*
            r3 = 30
            boolean r0 = X.C57147PWz.A02(r9, r3)
            if (r0 == 0) goto La6
            r5 = r9
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L76
            if (r0 != r4) goto Lb2
            java.lang.Object r10 = r5.A02
            X.0sF r10 = (X.InterfaceC16620sF) r10
            java.lang.Object r7 = r5.A01
            X.MhI r7 = (X.C51062MhI) r7
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6d
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r2 = r1.A00
            X.5jj r2 = (X.InterfaceC124295jj) r2
            java.lang.String r1 = r2.getNextMaxId()
            if (r1 == 0) goto L45
            java.util.List r0 = r2.AoP()
            r10.invoke(r1, r0)
        L45:
            boolean r0 = r2.CQG()
            if (r0 != 0) goto L52
            X.Bbz r0 = r7.A00
            X.05A r0 = r0.A0C
            X.AbstractC43594JPz.A1T(r0)
        L52:
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L56:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L6a
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lad
            X.Bbz r1 = r7.A00
            X.05A r0 = r1.A0C
            X.AbstractC43594JPz.A1T(r0)
            X.05A r0 = r1.A0B
            X.AbstractC166997dE.A1Y(r0, r4)
        L6a:
            X.0eB r6 = X.C0eB.A00
            return r6
        L6d:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L56
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L76:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r3 = r7.A02
            java.lang.String r2 = r7.A03
            X.1Ms r1 = X.AbstractC31179DnN.A0C(r3)
            java.lang.String r0 = "clips/recipe_sheet_clips/"
            r1.A0B(r0)
            java.lang.String r0 = "music_canonical_id"
            r1.A0H(r0, r2)
            java.lang.String r0 = "max_id"
            r1.A0H(r0, r8)
            java.lang.Class<X.Gdq> r0 = X.C37410Gdq.class
            X.AbstractC37302Gc3.A1M(r1, r3, r0)
            X.1ON r1 = r1.A0N()
            X.C57147PWz.A00(r7, r10, r5, r4)
            r0 = 770071300(0x2de65b04, float:2.6188392E-11)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L2c
            return r6
        La6:
            X.PWz r5 = new X.PWz
            r5.<init>(r7, r9, r3)
            goto L16
        Lad:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51062MhI.A00(X.MhI, java.lang.String, X.1Ds, X.0sF):java.lang.Object");
    }

    public C51062MhI(UserSession userSession, C25844Bbz c25844Bbz, String str, C19L c19l) {
        AbstractC37302Gc3.A1U(c19l, c25844Bbz);
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = c19l;
        this.A00 = c25844Bbz;
    }
}
