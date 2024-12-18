package X;

/* renamed from: X.Fsj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35869Fsj implements MO4 {
    public final /* synthetic */ C31720DwP A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public C35869Fsj(C31720DwP c31720DwP, boolean z, boolean z2, boolean z3) {
        this.A00 = c31720DwP;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r2 == null) goto L18;
     */
    @Override // X.MO4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D6s(X.C154306wf r8, int r9) {
        /*
            r7 = this;
            r5 = 0
            r2 = 2131629806(0x7f0e16ee, float:1.8886943E38)
            X.6wg r0 = r8.A04
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r0)
            X.6wg r0 = r8.A04
            android.view.View r0 = r1.inflate(r2, r0, r5)
            r8.A03(r0)
            X.DwP r4 = r7.A00
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L24
            java.lang.String r6 = "viewPager"
        L1c:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            androidx.recyclerview.widget.RecyclerView r0 = r0.A04
            X.2UU r1 = r0.A0A
            boolean r0 = r1 instanceof X.C31726DwV
            if (r0 == 0) goto L42
            X.DwV r1 = (X.C31726DwV) r1
            if (r1 == 0) goto L42
            java.util.List r1 = r1.A05
            if (r9 < 0) goto Lcf
            int r0 = r1.size()
            if (r9 >= r0) goto Lcf
            java.lang.Object r2 = r1.get(r9)
        L3e:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r2 = (com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType) r2
            if (r2 != 0) goto L44
        L42:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r2 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04
        L44:
            android.view.View r1 = r8.A03
            if (r1 == 0) goto L51
            r0 = 2131438570(0x7f0b2bea, float:1.849907E38)
            android.view.View r3 = r1.findViewById(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = (com.instagram.common.ui.widget.imageview.CircularImageView) r3
        L51:
            int r2 = r2.ordinal()
            java.lang.String r6 = "tabLayout"
            r1 = 8
            if (r2 == r5) goto Lae
            r0 = 1
            if (r2 != r0) goto Ldb
            boolean r0 = r7.A02
            if (r0 == 0) goto Ld3
            if (r3 == 0) goto L7f
            android.content.Context r1 = r4.requireContext()
            r0 = 2131957626(0x7f13177a, float:1.9551841E38)
            X.AbstractC166997dE.A18(r1, r3, r0)
            android.content.Context r2 = r4.requireContext()
            boolean r1 = r7.A03
            r0 = 2131238349(0x7f081dcd, float:1.8092974E38)
            if (r1 == 0) goto L7c
            r0 = 2131238004(0x7f081c74, float:1.8092274E38)
        L7c:
            X.AbstractC166997dE.A19(r2, r3, r0)
        L7f:
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto Lac
            android.content.res.Resources r2 = r0.getResources()
            if (r2 == 0) goto Lac
            boolean r1 = r7.A03
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r1 == 0) goto L95
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
        L95:
            int r1 = r2.getDimensionPixelOffset(r0)
        L99:
            boolean r0 = r7.A03
            if (r0 == 0) goto La9
            if (r3 == 0) goto La8
            r3.setStrokeAlpha(r5)
            r3.clearColorFilter()
        La5:
            r3.setPadding(r1, r1, r1, r1)
        La8:
            return
        La9:
            if (r3 == 0) goto La8
            goto La5
        Lac:
            r1 = 0
            goto L99
        Lae:
            boolean r0 = r7.A01
            if (r0 != 0) goto Ld3
            if (r3 == 0) goto La8
            X.0do r0 = r4.A07
            X.0ll r0 = X.AbstractC166987dD.A0o(r0)
            com.instagram.user.model.User r0 = X.AbstractC08690cX.A00(r0)
            if (r0 == 0) goto Lc8
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bhu()
        Lc4:
            r3.setUrl(r0, r4)
            return
        Lc8:
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC25225BEi.A0t(r0)
            goto Lc4
        Lcf:
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r2 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04
            goto L3e
        Ld3:
            com.google.android.material.tabs.TabLayout r0 = r4.A02
            if (r0 == 0) goto L1c
            r0.setVisibility(r1)
            return
        Ldb:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35869Fsj.D6s(X.6wf, int):void");
    }
}
