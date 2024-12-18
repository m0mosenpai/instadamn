package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Jxb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45107Jxb extends C0T6 {
    public final int A00;
    public final C22P A01;
    public final EnumC40111tc A02;
    public final ShareType A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C45107Jxb(C22P c22p, EnumC40111tc enumC40111tc, ShareType shareType, String str, String str2, String str3, int i) {
        AbstractC167027dH.A0a(1, str, str2, enumC40111tc, shareType);
        this.A06 = str;
        this.A04 = str2;
        this.A02 = enumC40111tc;
        this.A03 = shareType;
        this.A01 = c22p;
        this.A05 = str3;
        this.A00 = i;
    }

    public final C48532Kv A00() {
        int i = 0;
        C09530e4[] c09530e4Arr = {AbstractC166987dD.A1L("USER_SESSION_KEY", this.A06), AbstractC166987dD.A1L("PENDING_MEDIA_KEY", this.A04), AbstractC166987dD.A1L("PENDING_MEDIA_TYPE_KEY", this.A02.name()), AbstractC166987dD.A1L("PENDING_SHARE_TYPE_KEY", this.A03.name()), AbstractC166987dD.A1L("CAMERA_ENTRY_POINT_KEY", String.valueOf(this.A01)), AbstractC166987dD.A1L("SOURCE_KEY", this.A05), AbstractC166987dD.A1L("RUN_COUNT_KEY", Integer.valueOf(this.A00))};
        C48552Kx c48552Kx = new C48552Kx();
        do {
            C09530e4 c09530e4 = c09530e4Arr[i];
            c48552Kx.A01(c09530e4.A01, (String) c09530e4.A00);
            i++;
        } while (i < 7);
        return c48552Kx.A00();
    }

    public final boolean equals(Object obj) {
        C45107Jxb c45107Jxb;
        String str = this.A04;
        String str2 = null;
        if ((obj instanceof C45107Jxb) && (c45107Jxb = (C45107Jxb) obj) != null) {
            str2 = c45107Jxb.A04;
        }
        return C14360o3.A0K(str, str2);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Payload(mediaKey=");
        A1C.append(this.A04);
        A1C.append(", shareType=");
        A1C.append(this.A03);
        A1C.append(", source=");
        A1C.append(this.A05);
        A1C.append(AbstractC58317Pt9.A00(437));
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C45107Jxb(X.C47Z r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r8 = this;
            r4 = r10
            X.AbstractC167017dG.A1P(r10, r9)
            java.lang.String r5 = r9.A35
            X.1tc r2 = r9.A1G
            com.instagram.pendingmedia.model.constants.ShareType r3 = r9.A0D()
            X.22P r1 = r9.A0i
            r0 = r8
            r6 = r11
            r7 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45107Jxb.<init>(X.47Z, java.lang.String, java.lang.String, int):void");
    }
}
