package X;

/* renamed from: X.FSz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34760FSz {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorSubscriberThreadInfo] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, X.5eh] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, com.instagram.direct.model.thread.CreatorBroadcastThreadInfo] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C122045fw A00(X.C59889QqZ r51) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34760FSz.A00(X.QqZ):X.5fw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005b, code lost:
    
        if (r4.getCoercedIntField(7, r1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.user.model.User A01(X.Qq7 r4) {
        /*
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR
            java.lang.String r0 = "pk"
            java.lang.String r1 = r4.A07(r0)
            java.lang.String r0 = X.AbstractC50529MSi.A00()
            java.lang.String r0 = r4.A08(r0)
            com.instagram.user.model.User r2 = new com.instagram.user.model.User
            r2.<init>(r1, r0)
            java.lang.String r0 = "full_name"
            java.lang.String r0 = r4.A09(r0)
            r2.A0q(r0)
            r1 = 3
            java.lang.String r0 = "is_verified"
            boolean r0 = r4.getCoercedBooleanField(r1, r0)
            r2.A1C(r0)
            r1 = 4
            java.lang.String r0 = "is_private"
            boolean r0 = r4.getCoercedBooleanField(r1, r0)
            if (r0 == 0) goto Lfb
            java.lang.Integer r0 = X.C05F.A0C
        L33:
            r2.A0n(r0)
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r0 = r4.A0C(r0)
            r2.A0r(r0)
            r1 = 6
            java.lang.String r0 = "interop_user_type"
            int r0 = r4.getCoercedIntField(r1, r0)
            r2.A0b(r0)
            r0 = 841(0x349, float:1.178E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            boolean r0 = r4.hasFieldValue(r1)
            if (r0 == 0) goto L5d
            r0 = 7
            int r1 = r4.getCoercedIntField(r0, r1)
            r0 = 1
            if (r1 != 0) goto L5e
        L5d:
            r0 = 0
        L5e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.17P r0 = r2.A03
            r0.EU5(r1)
            r0 = 296(0x128, float:4.15E-43)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            java.lang.String r0 = r4.A0D(r0)
            java.lang.Long r0 = X.AbstractC25233BEq.A0n(r0)
            r2.A0p(r0)
            r1 = 9
            java.lang.String r0 = "context_line"
            java.lang.String r1 = r4.getOptionalStringField(r1, r0)
            X.17P r0 = r2.A03
            r0.ES7(r1)
            r1 = 11
            r0 = 2615(0xa37, float:3.664E-42)
            java.lang.String r3 = X.AbstractC111324zv.A00(r0)
            java.lang.Boolean r1 = X.AbstractC31174DnI.A0o(r4, r3, r1)
            X.17P r0 = r2.A03
            r0.EVA(r1)
            r1 = 12
            r0 = 2589(0xa1d, float:3.628E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Boolean r1 = X.AbstractC31174DnI.A0o(r4, r0, r1)
            X.17P r0 = r2.A03
            r0.EPp(r1)
            r1 = 13
            java.lang.String r0 = "account_type"
            int r0 = r4.getCoercedIntField(r1, r0)
            X.16a r0 = X.C16Z.A00(r0)
            r2.A0l(r0)
            r1 = 14
            r0 = 453(0x1c5, float:6.35E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Boolean r1 = X.AbstractC31174DnI.A0o(r4, r0, r1)
            X.17P r0 = r2.A03
            r0.EQf(r1)
            r1 = 15
            r0 = 3312(0xcf0, float:4.641E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            java.lang.Boolean r1 = X.AbstractC31174DnI.A0o(r4, r0, r1)
            if (r1 == 0) goto Lda
            X.17P r0 = r2.A03
            r0.EhJ(r1)
        Lda:
            r1 = 16
            r0 = 3313(0xcf1, float:4.643E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            int r0 = r4.getCoercedIntField(r1, r0)
            X.17P r1 = r2.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.EhK(r0)
            r0 = 11
            java.lang.Boolean r1 = X.AbstractC31174DnI.A0o(r4, r3, r0)
            X.17P r0 = r2.A03
            r0.EVA(r1)
            return r2
        Lfb:
            java.lang.Integer r0 = X.C05F.A01
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34760FSz.A01(X.Qq7):com.instagram.user.model.User");
    }
}
