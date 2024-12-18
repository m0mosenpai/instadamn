package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.repository.WallPostComposerRepository;

/* renamed from: X.BsX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26809BsX extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "WallPostComposerFragment";
    public final C8BM A00;
    public final C8BK A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final String A08;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57168PZm(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 37), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Object value;
        C27915CSa c27915CSa;
        User user;
        C5C3 c5c3;
        InterfaceC58259Ps3 interfaceC58259Ps3;
        C5Hc c5Hc;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str3;
        C25868BcP c25868BcP = (C25868BcP) this.A03.getValue();
        WallPostComposerRepository wallPostComposerRepository = c25868BcP.A03;
        String str4 = (String) wallPostComposerRepository.A09.getValue();
        Object value2 = wallPostComposerRepository.A08.getValue();
        C0UO c0uo = c25868BcP.A07;
        if (((C26019Bf8) c0uo.getValue()).A0A && (str3 = ((C26019Bf8) c0uo.getValue()).A05) != null && str3.length() != 0) {
            c25868BcP.A01();
            return true;
        }
        if (str4.length() <= 0 && value2 == null) {
            C25868BcP.A00(C29437CyD.A00, c25868BcP);
            return true;
        }
        c25868BcP.A02(false);
        C05A c05a = c25868BcP.A06;
        do {
            value = c05a.getValue();
            C26019Bf8 c26019Bf8 = (C26019Bf8) value;
            c27915CSa = new C27915CSa();
            c27915CSa.A03 = 2131960929;
            c27915CSa.A02 = 2131976959;
            c27915CSa.A00 = new C27901CRm(AbstractC25228BEl.A10(2131956564), C05F.A0C, C29892DGg.A00(c25868BcP, 13));
            c27915CSa.A01 = new C27901CRm(AbstractC25228BEl.A10(2131954754), C05F.A00, DE2.A00);
            c27915CSa.A04 = C29892DGg.A00(c25868BcP, 14);
            user = c26019Bf8.A01;
            c5c3 = c26019Bf8.A00;
            interfaceC58259Ps3 = c26019Bf8.A03;
            c5Hc = c26019Bf8.A06;
            z = c26019Bf8.A07;
            str = c26019Bf8.A04;
            z2 = c26019Bf8.A0B;
            str2 = c26019Bf8.A05;
            z3 = c26019Bf8.A0A;
            z4 = c26019Bf8.A09;
            z5 = c26019Bf8.A08;
            C14360o3.A0B(user, 0);
            AbstractC167007dF.A1E(c5c3, 1, c5Hc);
            C14360o3.A0B(str, 5);
        } while (!c05a.AIi(value, new C26019Bf8(c5c3, user, c27915CSa, interfaceC58259Ps3, str, str2, c5Hc, z, z2, z3, z4, z5)));
        return true;
    }

    public C26809BsX() {
        DGU dgu = new DGU(this, 40);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DGU(new DGU(this, 45), 46));
        this.A03 = AbstractC25225BEi.A0a(new DGU(A00, 47), dgu, new C29895DGj(30, null, A00), AbstractC25225BEi.A1D(C25868BcP.class));
        this.A02 = C1XM.A00(new DGU(this, 39));
        this.A06 = AbstractC60492pY.A02(this);
        this.A07 = C1XM.A00(new DGU(this, 48));
        this.A08 = "wonder_wall_post_creation";
        this.A01 = new C23884Ahd(C30179DRk.A01(this, 25));
        this.A00 = new C29227CuW(new DGU(this, 43));
        this.A04 = C1XM.A00(new DGU(this, 41));
        this.A05 = C1XM.A00(new DGU(this, 42));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        InterfaceC09390do interfaceC09390do = this.A07;
        if (((WallInfo) interfaceC09390do.getValue()).A03) {
            string = getString(2131952397);
        } else {
            string = getString(2131952412, ((WallInfo) interfaceC09390do.getValue()).A00.getUsername());
        }
        interfaceC56362iU.setTitle(string);
        interfaceC56362iU.Ect(getString(2131952265), ViewOnClickListenerC28666ClE.A00(this, 48));
        ((C56352iT) this.A02.getValue()).ARk(A10 ? 1 : 0, ((C26019Bf8) ((C25868BcP) this.A03.getValue()).A07.getValue()).A07);
        C7JA.A00(requireActivity(), interfaceC56362iU.C94(), AbstractC166987dD.A0r(this.A06), "Wall Composer", AbstractC16960so.A1Q("composer_action_media_enabled", "composer_action_reshare_enabled", "composer_action_music_enabled", "composer_action_gif_enabled", "gallery_video_enabled"), C7J9.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(562228628);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30482DbR.A00(this, 36), 2090348408);
        C0f9.A09(-1094608721, A02);
        return A00;
    }
}
