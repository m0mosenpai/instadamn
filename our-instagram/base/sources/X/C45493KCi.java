package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KCi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45493KCi extends AbstractC59962oe implements C8NZ {
    public static final String __redex_internal_original_name = "DirectCutoutStickerGridFragment";
    public JT7 A00;
    public C47327Kvc A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final AbstractC59962oe A05 = this;
    public final InterfaceC11380iw A02 = new LXY(this);
    public final boolean A06 = true;
    public final String A03 = "";

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void Chi(Medium medium, long j, long j2, boolean z) {
    }

    @Override // X.InterfaceC186108Ne
    public final /* synthetic */ void Coa(View view, StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    @Override // X.InterfaceC186088Nc
    public final /* synthetic */ void Cu9(View view, C148286ly c148286ly, String str) {
    }

    @Override // X.InterfaceC186118Nf
    public final /* synthetic */ void Cuu(C214499en c214499en) {
    }

    @Override // X.InterfaceC186088Nc
    public final /* synthetic */ void CwB() {
    }

    @Override // X.InterfaceC186088Nc
    public final /* synthetic */ void CwD(C148286ly c148286ly, String str) {
    }

    @Override // X.InterfaceC150196pR
    public final void CxL(View view, InterfaceC148316m1 interfaceC148316m1) {
        Context context;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC148316m1, view);
        C148276lx C0S = interfaceC148316m1.C0S();
        if (C0S != null && (context = getContext()) != null) {
            if (C0S.A00() != EnumC150226pU.A0M && C0S.A00() != EnumC150226pU.A0L) {
                return;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            String str = C0S.A0Z;
            A1E.add(new WjJ(new C48697LgR(context, interfaceC148316m1, C0S, this), str));
            if (AbstractC166987dD.A1b(C0S.A0O) && this.A06) {
                InterfaceC09390do interfaceC09390do = this.A04;
                if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36325102518022886L)) {
                    boolean A03 = LJL.A03(AbstractC166987dD.A0r(interfaceC09390do), str);
                    C148286ly c148286ly = (C148286ly) C0S.A0O.get(0);
                    C14360o3.A0B(c148286ly, 0);
                    A1E.add(new WjK(new C45105JxZ(new JWd(c148286ly, "", 8), A1R ? 1 : 0), new C48698LgS(0, context, this), A03));
                }
            }
            AbstractC46756KmD.A00(view, AbstractC166987dD.A0r(this.A04), A1E);
        }
    }

    @Override // X.InterfaceC150196pR
    public final void CxM(Drawable drawable, View view, InterfaceC148316m1 interfaceC148316m1) {
        C47327Kvc c47327Kvc;
        C14360o3.A0B(interfaceC148316m1, 0);
        C148276lx C0S = interfaceC148316m1.C0S();
        if (C0S != null) {
            List list = C0S.A0O;
            if (AbstractC166987dD.A1b(list) && (c47327Kvc = this.A01) != null) {
                C148286ly c148286ly = (C148286ly) list.get(0);
                C14360o3.A0B(c148286ly, 0);
                MRR mrr = c47327Kvc.A00.A02;
                if (mrr != null) {
                    mrr.D96(c148286ly);
                }
            }
        }
    }

    @Override // X.C8NZ
    public final /* synthetic */ void CyY() {
    }

    @Override // X.C8NZ
    public final /* synthetic */ void Cya() {
    }

    @Override // X.C8NZ
    public final /* synthetic */ void Cyl(Drawable drawable, InterfaceC148316m1 interfaceC148316m1) {
    }

    @Override // X.C8NZ
    public final /* synthetic */ void Cym() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D5Y() {
    }

    @Override // X.InterfaceC186128Ng
    public final /* synthetic */ void D7t(AlC alC) {
    }

    @Override // X.InterfaceC186128Ng
    public final /* synthetic */ void D87() {
    }

    @Override // X.InterfaceC186098Nd
    public final /* synthetic */ void D92() {
    }

    @Override // X.InterfaceC186098Nd
    public final /* synthetic */ void D93(Medium medium, Integer num) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D94(Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D95() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D97() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D98(C9ZM c9zm) {
    }

    @Override // X.C7OC
    public final /* synthetic */ void DDL(Drawable drawable, View view, C148336m3 c148336m3) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DEz() {
    }

    @Override // X.C8NZ
    public final /* synthetic */ void DHT(C9QC c9qc, C148276lx c148276lx) {
    }

    @Override // X.InterfaceC186118Nf
    public final /* synthetic */ void DIl(User user, String str) {
    }

    @Override // X.InterfaceC186138Nh
    public final /* synthetic */ void DIz(Medium medium, boolean z) {
    }

    @Override // X.InterfaceC186098Nd
    public final /* synthetic */ void DSY(Medium medium) {
    }

    @Override // X.C8NZ
    public final /* synthetic */ void DSk(Drawable drawable, InterfaceC148316m1 interfaceC148316m1) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DWm() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DY4(Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC186148Ni
    public final /* synthetic */ void DZR(Medium medium) {
    }

    @Override // X.InterfaceC186078Nb
    public final /* synthetic */ void DoY(View view, C148276lx c148276lx) {
    }

    @Override // X.InterfaceC186078Nb
    public final /* synthetic */ void DoZ(Drawable drawable, C148276lx c148276lx, Long l) {
    }

    @Override // X.InterfaceC186078Nb
    public final /* synthetic */ void Doa(Drawable drawable, C148276lx c148276lx, Long l, boolean z) {
    }

    @Override // X.InterfaceC186158Nj
    public final /* synthetic */ void Doj() {
    }

    @Override // X.InterfaceC186108Ne
    public final /* synthetic */ void Don(StickerTraySectionCTAType stickerTraySectionCTAType) {
    }

    @Override // X.InterfaceC186168Nk
    public final /* synthetic */ void Dwv(UpcomingEvent upcomingEvent) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_cutout_sticker_grid_fragment_module";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A04);
        AbstractC53242c7.A0H(getContext(), R.attr.igds_color_elevated_background);
        JT7 jt7 = new JT7(requireContext, view, this.A02, A0r, null, this, EnumC46156Kbu.A02);
        this.A00 = jt7;
        jt7.E2K();
        View findViewById = view.findViewById(R.id.sticker_grid_back_button);
        if (findViewById != null) {
            ViewOnClickListenerC48072LPx.A01(findViewById, 23, this);
        }
    }

    @Override // X.InterfaceC150206pS
    public final /* synthetic */ long Ayc() {
        return 0L;
    }

    @Override // X.InterfaceC150206pS
    public final AbstractC59962oe Baj() {
        return this.A05;
    }

    @Override // X.C8NZ
    public final /* synthetic */ boolean Bvk() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final /* synthetic */ boolean CXU() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final /* synthetic */ boolean CYO() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final /* synthetic */ boolean CZ3() {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final /* synthetic */ boolean Cb5(boolean z) {
        return false;
    }

    @Override // X.InterfaceC150206pS
    public final /* synthetic */ boolean CdE() {
        return false;
    }

    @Override // X.InterfaceC186078Nb
    public final /* synthetic */ boolean Cdj() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2117469064);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_cutout_sticker_grid_fragment, viewGroup, false);
        C0f9.A09(-1630064557, A02);
        return inflate;
    }
}
