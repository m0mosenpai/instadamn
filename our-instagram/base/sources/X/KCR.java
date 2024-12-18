package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class KCR extends AbstractC59962oe implements InterfaceC60072op, MSL {
    public static final String __redex_internal_original_name = "DirectStickerTabFragment";
    public C47933LFf A00;
    public String A01;
    public C48733Lh1 A02;
    public EnumC46186KcO A03;
    public C7IK A04;
    public DirectThreadKey A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final InterfaceC09390do A0J = AbstractC60492pY.A02(this);
    public boolean A0I = true;

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
        C14360o3.A0B(c7ik, 0);
        this.A04 = c7ik;
        C48733Lh1 c48733Lh1 = this.A02;
        if (c48733Lh1 != null) {
            c48733Lh1.A0A = c7ik;
            c48733Lh1.A0K.A00.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r1 == r0) goto L10;
     */
    @Override // X.MSL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DjQ(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            X.Lh1 r4 = r5.A02
            if (r4 == 0) goto L28
            int r2 = r6.length()
            if (r2 != 0) goto L29
            X.JxY r3 = r4.A09
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.C05F.A00
            boolean r0 = X.AbstractC167007dF.A1X(r1, r0)
            if (r0 != 0) goto L29
            java.lang.Integer r0 = X.C05F.A00
        L1c:
            java.util.List r2 = r3.A02
            java.util.List r1 = r3.A04
            X.C48733Lh1.A03(r4, r3, r0, r2, r1)
        L23:
            X.L8v r0 = r4.A0R
            r0.A00(r6)
        L28:
            return
        L29:
            if (r2 <= 0) goto L23
            X.JxY r3 = r4.A09
            java.lang.Integer r1 = r3.A00
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L1c
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KCR.DjQ(java.lang.String):void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_sticker_tab_tray_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        GiphyRequestSurface giphyRequestSurface;
        C3DN c3dn;
        String str;
        C47933LFf c47933LFf;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession A0r = AbstractC166987dD.A0r(this.A0J);
        InterfaceC56392iX A0D = AbstractC37301Gc2.A0D(view, R.id.direct_stickers_container_stub);
        Context requireContext = requireContext();
        C07Y.A00(this);
        C47325Kva c47325Kva = new C47325Kva(this);
        boolean z = this.A0I;
        boolean z2 = this.A0F;
        boolean z3 = this.A08;
        boolean z4 = this.A0B;
        boolean z5 = this.A0G;
        boolean z6 = this.A0H;
        boolean z7 = this.A0C;
        boolean z8 = this.A07;
        boolean z9 = this.A0A;
        boolean z10 = this.A0E;
        boolean z11 = this.A0D;
        EnumC46186KcO enumC46186KcO = this.A03;
        if (enumC46186KcO == EnumC46186KcO.A05) {
            giphyRequestSurface = GiphyRequestSurface.A05;
        } else {
            giphyRequestSurface = GiphyRequestSurface.A07;
        }
        String str2 = this.A01;
        if (str2 == null) {
            str = "bottomSheetSessionId";
        } else {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                c3dn = AbstractC31172DnG.A0r(activity);
            } else {
                c3dn = null;
            }
            String str3 = this.A06;
            str = "initialSearchTerm";
            if (str3 != null) {
                C48733Lh1 c48733Lh1 = new C48733Lh1(requireContext, giphyRequestSurface, this, A0r, this, A0D, c47325Kva, enumC46186KcO, this.A05, c3dn, str2, str3, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
                this.A02 = c48733Lh1;
                c48733Lh1.A0A = this.A04;
                c48733Lh1.A0K.A00.notifyDataSetChanged();
                C48733Lh1 c48733Lh12 = this.A02;
                if (c48733Lh12 != null) {
                    String str4 = this.A06;
                    if (str4 != null) {
                        c48733Lh12.A0H.setVisibility(0);
                        c48733Lh12.A0R.A00(str4);
                    }
                }
                if (this.A03 == EnumC46186KcO.A0H && (c47933LFf = this.A00) != null) {
                    c47933LFf.A01();
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0J);
    }

    @Override // X.MSL
    public final boolean isScrolledToTop() {
        C48733Lh1 c48733Lh1 = this.A02;
        if (c48733Lh1 != null && !AbstractC110854yx.A03(c48733Lh1.A0E)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C48733Lh1 c48733Lh1 = this.A02;
        if (c48733Lh1 != null) {
            C45104JxY c45104JxY = c48733Lh1.A09;
            if (c45104JxY.A01()) {
                C48733Lh1.A03(c48733Lh1, c45104JxY, C05F.A00, c45104JxY.A02, c45104JxY.A04);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C48733Lh1 c48733Lh1;
        super.onActivityResult(i, i2, intent);
        if (i == 1109 && i2 == -1 && (c48733Lh1 = this.A02) != null) {
            AbstractC47789L8v abstractC47789L8v = c48733Lh1.A0R;
            if (abstractC47789L8v instanceof KQN) {
                abstractC47789L8v.A01("");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1016385388);
        super.onCreate(bundle);
        this.A06 = requireArguments().getString("param_extra_initial_search_term", "");
        this.A01 = requireArguments().getString("param_extra_bottom_sheet_session_id", "");
        this.A0I = requireArguments().getBoolean("param_extra_show_like_sticker", true);
        this.A09 = requireArguments().getBoolean("param_extra_is_broadcast_thread", false);
        this.A0F = requireArguments().getBoolean("param_extra_is_poll_enabled", false);
        this.A08 = requireArguments().getBoolean("param_extra_ai_sticker_enabled", false);
        this.A0B = requireArguments().getBoolean("param_extra_imagine_enabled", false);
        this.A0G = requireArguments().getBoolean("param_extra_saved_sticker_enabled", false);
        this.A0H = requireArguments().getBoolean("param_extra_sticker_packs_enabled", false);
        this.A0C = requireArguments().getBoolean("param_extra_is_location_sticker_enabled", false);
        this.A07 = requireArguments().getBoolean("param_extra_is_add_yours_sticker_enabled", false);
        this.A0A = requireArguments().getBoolean("param_extra_is_cutout_sticker_enabled", false);
        this.A0E = requireArguments().getBoolean("param_extra_is_music_sticker_enabled", false);
        this.A0D = requireArguments().getBoolean("param_extra_is_msys_thread", false);
        this.A05 = (DirectThreadKey) requireArguments().getParcelable("param_extra_direct_thread_key");
        Serializable serializable = requireArguments().getSerializable("param_extra_sticker_tray_entrypoint");
        if (serializable instanceof EnumC46186KcO) {
            this.A03 = (EnumC46186KcO) serializable;
        }
        C0f9.A09(1552354072, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(594082672);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_tab_tray, false);
        C0f9.A09(-26991330, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1657547180);
        super.onDestroy();
        this.A00 = null;
        C0f9.A09(1216349639, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-802209643);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(1497456760, A02);
    }
}
