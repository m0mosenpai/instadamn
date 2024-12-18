package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;

/* renamed from: X.KCm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45497KCm extends AbstractC59962oe implements MSL {
    public static final String __redex_internal_original_name = "DirectThreadGifsTabFragment";
    public InterfaceC159877Ez A00;
    public DirectThreadKey A01;
    public LIE A02;
    public EnumC46186KcO A03;
    public boolean A05;
    public boolean A06;
    public String A04 = "";
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
    }

    @Override // X.MSL
    public final void DjQ(String str) {
        String str2;
        String str3;
        C14360o3.A0B(str, 0);
        LIE lie = this.A02;
        if (lie == null) {
            str2 = "directThreadGifsTrayController";
        } else {
            boolean equals = str.equals("");
            str2 = "directGifCategoriesTabsManager";
            if (equals && AbstractC167007dF.A1Z(lie.A0F)) {
                if (lie.A0H) {
                    str3 = lie.A0C;
                } else {
                    L3N l3n = lie.A03;
                    if (l3n != null) {
                        str3 = ((C32073E6z) l3n.A03.get(l3n.A00)).A05;
                    }
                }
                C47770L7s c47770L7s = lie.A08;
                L3N l3n2 = lie.A03;
                if (l3n2 != null) {
                    c47770L7s.A00((EnumC46159Kbx) ((C32073E6z) l3n2.A03.get(l3n2.A00)).A04, str3);
                    L3N l3n3 = lie.A03;
                    if (l3n3 != null) {
                        l3n3.A02.A00(l3n3.A00, true);
                    }
                }
            } else {
                lie.A08.A00(EnumC46159Kbx.A05, str);
            }
            if (AbstractC167007dF.A1Z(lie.A0F)) {
                L3N l3n4 = lie.A03;
                if (l3n4 != null) {
                    l3n4.A02.setVisibility(AbstractC167007dF.A05(equals ? 1 : 0));
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_gif_tray_fragment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            r20 = this;
            r3 = 0
            r4 = r21
            X.C14360o3.A0B(r4, r3)
            r9 = r20
            r0 = r22
            super.onViewCreated(r4, r0)
            X.KcO r0 = r9.A03
            if (r0 != 0) goto Laa
            r0 = -1
        L12:
            r2 = 1
            r1 = 3
            if (r0 == r1) goto L1b
            if (r0 == r3) goto L1b
            r5 = 0
            if (r0 != r2) goto L1c
        L1b:
            r5 = 1
        L1c:
            X.0do r6 = r9.A07
            com.instagram.common.session.UserSession r10 = X.AbstractC166987dD.A0r(r6)
            com.instagram.model.direct.DirectThreadKey r15 = r9.A01
            r0 = 2131431839(0x7f0b119f, float:1.8485419E38)
            X.2iX r12 = X.AbstractC31173DnH.A0U(r4, r0)
            android.content.Context r7 = r9.requireContext()
            X.7Ez r13 = r9.A00
            X.KcO r1 = r9.A03
            X.KcO r0 = X.EnumC46186KcO.A05
            if (r1 != r0) goto La7
            com.instagram.api.schemas.GiphyRequestSurface r8 = com.instagram.api.schemas.GiphyRequestSurface.A05
        L39:
            boolean r4 = r9.A05
            if (r5 == 0) goto L4f
            com.instagram.model.direct.DirectThreadKey r5 = r9.A01
            if (r5 == 0) goto L50
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r6)
            java.lang.Integer r0 = X.C05F.A06
            X.7Cz r1 = X.AbstractC159387Cy.A04(r1, r5, r0)
            X.7Cz r0 = X.EnumC159397Cz.A06
            if (r1 == r0) goto L50
        L4f:
            r2 = 0
        L50:
            java.lang.String r1 = r9.A04
            boolean r0 = r9.A06
            X.KcO r14 = r9.A03
            if (r14 != 0) goto L5a
            X.KcO r14 = X.EnumC46186KcO.A0L
        L5a:
            X.LIE r6 = new X.LIE
            r11 = r9
            r17 = r4
            r18 = r2
            r19 = r0
            r16 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r9.A02 = r6
            X.KcO r1 = r9.A03
            X.KcO r0 = X.EnumC46186KcO.A0A
            java.lang.String r5 = "directThreadGifsTrayController"
            if (r1 != r0) goto Lb9
            X.KcO r2 = X.EnumC46186KcO.A07
            r9.A03 = r2
            android.os.Bundle r1 = r9.mArguments
            if (r1 == 0) goto L7f
            java.lang.String r0 = "param_extra_sticker_tray_entrypoint"
            r1.putSerializable(r0, r2)
        L7f:
            X.LIE r4 = r9.A02
            if (r4 == 0) goto L9f
            X.2iX r0 = r4.A07
            r0.setVisibility(r3)
            X.0do r0 = r4.A0F
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto Lca
            X.L7s r2 = r4.A08
            X.Kbx r1 = X.EnumC46159Kbx.A04
            java.lang.String r0 = ""
            r2.A00(r1, r0)
            X.L3N r2 = r4.A03
            if (r2 != 0) goto Lb0
            java.lang.String r5 = "directGifCategoriesTabsManager"
        L9f:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        La7:
            com.instagram.api.schemas.GiphyRequestSurface r8 = com.instagram.api.schemas.GiphyRequestSurface.A07
            goto L39
        Laa:
            int r0 = r0.ordinal()
            goto L12
        Lb0:
            X.Jkg r1 = r2.A02
            r0 = 1
            r1.A00(r0, r0)
            r2.A00 = r0
            return
        Lb9:
            java.lang.String r2 = r9.A04
            X.C14360o3.A0B(r2, r3)
            X.2iX r0 = r6.A07
            r0.setVisibility(r3)
            X.L7s r1 = r6.A08
            X.Kbx r0 = X.EnumC46159Kbx.A05
            r1.A00(r0, r2)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45497KCm.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.MSL
    public final boolean isScrolledToTop() {
        LIE lie = this.A02;
        if (lie == null) {
            C14360o3.A0F("directThreadGifsTrayController");
            throw C00O.createAndThrow();
        }
        RecyclerView recyclerView = lie.A01;
        if (recyclerView != null && recyclerView.getChildCount() == 0) {
            return true;
        }
        RecyclerView recyclerView2 = lie.A01;
        if (recyclerView2 != null && recyclerView2.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(505332704);
        super.onCreate(bundle);
        this.A01 = (DirectThreadKey) requireArguments().getParcelable("param_extra_direct_thread_key");
        this.A04 = AbstractC31172DnG.A13(requireArguments(), "param_extra_initial_search_term");
        this.A06 = requireArguments().getBoolean("param_extra_use_initial_search_term_if_no_query", false);
        this.A05 = requireArguments().getBoolean("param_extra_is_msys_thread", false);
        Serializable serializable = requireArguments().getSerializable("param_extra_sticker_tray_entrypoint");
        if (serializable instanceof EnumC46186KcO) {
            this.A03 = (EnumC46186KcO) serializable;
        }
        C0f9.A09(-380239687, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1388076711);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_gifs_tray, viewGroup, false);
        C0f9.A09(752071267, A02);
        return inflate;
    }
}
