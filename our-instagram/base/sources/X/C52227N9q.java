package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.N9q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52227N9q extends C1P1 {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    public C52227N9q(Object obj, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
        this.A03 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-1606834000);
            C42090Ikx c42090Ikx = (C42090Ikx) this.A01;
            AbstractC55180Odl.A03(c42090Ikx.A0A, ShareType.A0H, "feed_share_later", null, this.A02);
            c42090Ikx.A0E.A4H(EnumC76753cN.A04);
            C9GR.A0F(c42090Ikx.A04.getContext(), "feed_share_auto_xpost_upsell_failure", 2131962508);
            i = 303964715;
        } else {
            A03 = C0f9.A03(86741630);
            C218069ke c218069ke = ((L13) this.A01).A01;
            C16930sl c16930sl = C16930sl.A00;
            c218069ke.A0A(this.A02, c16930sl, c16930sl, false);
            i = -1448887604;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        if (this.A00 != 0) {
            super.onStart();
            return;
        }
        int A03 = C0f9.A03(-39604829);
        C218069ke c218069ke = ((L13) this.A01).A01;
        c218069ke.A06 = false;
        AnonymousClass229.A01(c218069ke.A0C);
        C0f9.A0A(691734611, A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            if (r0 == 0) goto L88
            r0 = 1252926281(0x4aae2349, float:5706148.5)
            int r6 = X.C0f9.A03(r0)
            r0 = 689353820(0x2916b45c, float:3.3463128E-14)
            int r7 = X.C0f9.A03(r0)
            java.lang.Object r9 = r10.A01
            X.Ikx r9 = (X.C42090Ikx) r9
            com.instagram.common.session.UserSession r4 = r9.A0A
            com.instagram.pendingmedia.model.constants.ShareType r3 = com.instagram.pendingmedia.model.constants.ShareType.A0H
            java.lang.String r2 = r10.A02
            java.lang.String r1 = "feed_share_later"
            r0 = 0
            X.AbstractC55180Odl.A04(r4, r3, r1, r0, r2)
            X.1qM r2 = r9.A0E
            X.3cN r0 = X.EnumC76753cN.A05
            r2.A4H(r0)
            boolean r8 = r10.A03
            X.8lv r1 = X.C196068lw.A00(r4)
            com.facebook.common.callercontext.CallerContext r0 = r9.A08
            X.5xZ r0 = r1.A00(r0)
            java.lang.String r5 = r0.A05
            com.instagram.common.typedurl.ImageUrl r4 = r2.A1S()
            X.6i8 r3 = X.AbstractC31171DnF.A0K()
            r2 = 0
            androidx.fragment.app.Fragment r0 = r9.A04
            android.content.Context r1 = r0.getContext()
            if (r8 == 0) goto L82
            if (r1 == 0) goto L51
            r0 = 2131962512(0x7f132a90, float:1.9561751E38)
        L4d:
            java.lang.String r2 = r1.getString(r0)
        L51:
            r3.A0D = r2
            int r0 = r5.length()
            if (r0 <= 0) goto L77
            X.6bJ r0 = X.EnumC142006bJ.A03
            r3.A0B(r0)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC25225BEi.A0t(r5)
        L62:
            r3.A09 = r0
            r3.A06()
        L67:
            X.AbstractC31178DnM.A1S(r3)
            r0 = 27775424(0x1a7d1c0, float:6.164709E-38)
            X.C0f9.A0A(r0, r7)
            r0 = -1867919512(0xffffffff90a9cf68, float:-6.6978306E-29)
        L73:
            X.C0f9.A0A(r0, r6)
            return
        L77:
            if (r4 == 0) goto L67
            r3.A03()
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r4)
            goto L62
        L82:
            if (r1 == 0) goto L51
            r0 = 2131962511(0x7f132a8f, float:1.956175E38)
            goto L4d
        L88:
            r0 = -617570082(0xffffffffdb30a0de, float:-4.971647E16)
            int r6 = X.C0f9.A03(r0)
            X.K8R r11 = (X.K8R) r11
            r0 = 2095246901(0x7ce2ee35, float:9.426324E36)
            int r5 = X.AbstractC167017dG.A0N(r11, r0)
            X.KiI r0 = r11.A01
            java.util.List r0 = r0.A01()
            X.C14360o3.A07(r0)
            java.lang.Object r1 = r10.A01
            X.L13 r1 = (X.L13) r1
            java.lang.String r4 = r10.A02
            android.util.Pair r0 = X.AbstractC47040Kqx.A00(r0)
            java.lang.Object r3 = r0.first
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r0.second
            java.util.List r2 = (java.util.List) r2
            X.9ke r1 = r1.A01
            X.C14360o3.A0A(r3)
            X.C14360o3.A0A(r2)
            r0 = 1
            r1.A0A(r4, r3, r2, r0)
            r0 = 1721294785(0x6698dfc1, float:3.6096362E23)
            X.C0f9.A0A(r0, r5)
            r0 = 1417007691(0x5475d24b, float:4.2231805E12)
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52227N9q.onSuccess(java.lang.Object):void");
    }
}
