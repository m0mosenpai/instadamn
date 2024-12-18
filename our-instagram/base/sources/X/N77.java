package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N77 extends AbstractC59962oe implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "IgLiveFundraiserDonorListBottomSheetFragment";
    public QIz A01;
    public C51151Miu A02;
    public String A03;
    public RecyclerView A04;
    public float A00 = 0.4f;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final boolean A06 = true;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "live_fundraiser_donor_list";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        if (r11 != true) goto L14;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r15 = 0
            r8 = r21
            X.C14360o3.A0B(r8, r15)
            r4 = r20
            r0 = r22
            super.onViewCreated(r8, r0)
            r0 = 2131432028(0x7f0b125c, float:1.8485802E38)
            androidx.recyclerview.widget.RecyclerView r2 = X.AbstractC43592JPx.A0B(r8, r0)
            android.content.Context r1 = r4.requireContext()
            r7 = 1
            com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager r0 = new com.instagram.common.ui.widget.recyclerview.FastScrollingLinearLayoutManager
            r0.<init>(r1)
            r2.setLayoutManager(r0)
            X.Miu r0 = r4.A02
            if (r0 != 0) goto L2d
            X.AbstractC31171DnF.A0t()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L2d:
            r2.setAdapter(r0)
            r4.A04 = r2
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.widget.ImageView r3 = X.AbstractC31171DnF.A08(r8, r0)
            r0 = 2131434179(0x7f0b1ac3, float:1.8490165E38)
            android.view.View r2 = r8.findViewById(r0)
            r0 = 2131434178(0x7f0b1ac2, float:1.8490163E38)
            android.view.View r0 = r8.findViewById(r0)
            r1 = 2131434182(0x7f0b1ac6, float:1.849017E38)
            android.widget.TextView r1 = X.AbstractC166987dD.A0e(r8, r1)
            r5 = 2131434176(0x7f0b1ac0, float:1.8490159E38)
            android.widget.TextView r5 = X.AbstractC166987dD.A0e(r8, r5)
            r6 = 2131434177(0x7f0b1ac1, float:1.849016E38)
            android.widget.TextView r6 = X.AbstractC166987dD.A0e(r8, r6)
            android.content.Context r11 = r8.getContext()
            android.content.res.Resources r9 = X.AbstractC31180DnO.A02(r4, r11)
            r8 = 2131165236(0x7f070034, float:1.7944683E38)
            int r13 = r9.getDimensionPixelSize(r8)
            android.content.Context r8 = r4.requireContext()
            int r14 = X.AbstractC167017dG.A04(r8)
            r12 = 0
            r18 = -1
            X.BOM r10 = new X.BOM
            r16 = r15
            r17 = r15
            r19 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.setImageDrawable(r10)
            X.QIz r9 = r4.A01
            if (r9 == 0) goto Lef
            java.lang.Object r10 = r9.A02
            com.instagram.common.typedurl.ImageUrl r10 = (com.instagram.common.typedurl.ImageUrl) r10
            r8 = 0
            if (r10 == 0) goto L9c
            java.lang.String r10 = r10.getUrl()
            if (r10 == 0) goto L9c
            boolean r11 = X.AbstractC25225BEi.A1Y(r10)
            r10 = 1
            if (r11 == r7) goto L9d
        L9c:
            r10 = 0
        L9d:
            r7 = 8
            if (r10 == 0) goto Lf0
            r3.setVisibility(r15)
            r2.setVisibility(r7)
            r0.setVisibility(r7)
            java.lang.Object r0 = r9.A02
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            if (r0 == 0) goto Lb3
            X.AbstractC38055Goi.A00(r3, r0, r12)
        Lb3:
            java.lang.String r0 = r9.A06
            r1.setText(r0)
            android.content.res.Resources r7 = X.AbstractC166997dE.A0N(r4)
            r4 = 2131965405(0x7f1335dd, float:1.9567619E38)
            java.lang.String r3 = r9.A07
            java.lang.Object r2 = r9.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = ""
            if (r2 == 0) goto Ld5
            java.lang.String r0 = r2.getFullName()
            if (r0 != 0) goto Ld6
            java.lang.String r0 = r2.getShortName()
            if (r0 != 0) goto Ld6
        Ld5:
            r0 = r1
        Ld6:
            java.lang.String[] r0 = new java.lang.String[]{r3, r0}
            android.text.Spanned r0 = X.AbstractC07900bA.A01(r7, r0, r4)
            r6.setText(r0)
            r5.setText(r1)
            int r0 = r1.length()
            if (r0 != 0) goto Lec
            r8 = 8
        Lec:
            r5.setVisibility(r8)
        Lef:
            return
        Lf0:
            r3.setVisibility(r7)
            r2.setVisibility(r15)
            r0.setVisibility(r15)
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N77.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return this.A00;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A06;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return this.A00;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A04;
        if (recyclerView == null || AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        QIz qIz;
        int A02 = C0f9.A02(-690793487);
        super.onCreate(bundle);
        this.A03 = requireArguments().getString("IgLiveCapture.CAPTURE_FRAGMENT_ARGUMENTS_KEY_BROADCAST_ID");
        InterfaceC09390do interfaceC09390do = this.A05;
        C46h c46h = (C46h) ((O95) OYB.A02(AbstractC166987dD.A0r(interfaceC09390do)).A01.getValue()).A00.A0W();
        if (c46h != null) {
            qIz = (QIz) c46h.A04();
        } else {
            qIz = null;
        }
        this.A01 = qIz;
        OYB.A02(AbstractC166987dD.A0r(interfaceC09390do)).A01.getValue();
        this.A02 = new C51151Miu(this, AbstractC166987dD.A0r(interfaceC09390do), this);
        String str = this.A03;
        if (str != null) {
            C25621Ms A0M = AbstractC31177DnL.A0M(AbstractC31178DnM.A0M(interfaceC09390do));
            A0M.A0L("live/%s/charity_donations/", str);
            C1ON A0R = AbstractC31172DnG.A0R(null, A0M, C52089N2p.class, OQK.class, true);
            C50689MZh.A00(A0R, this, 28);
            schedule(A0R);
        }
        C0f9.A09(-1127771596, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(266916651);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_iglive_fundraiser_donor_list, false);
        C0f9.A09(-1509282899, A02);
        return A0R;
    }
}
