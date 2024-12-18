package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.StickerTraySectionCTAType;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.assethub.viewmodel.ClipsAssetHubViewModel;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.Serializable;

/* renamed from: X.KCj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45494KCj extends AbstractC59962oe implements C8NZ {
    public static final String __redex_internal_original_name = "ClipsAssetHubFragment";
    public JT7 A00;
    public ClipsAssetHubViewModel A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC11380iw A06 = new LXW(this);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new MHQ(this, 48));
    public EnumC46156Kbu A01 = EnumC46156Kbu.A03;
    public final AbstractC59962oe A05 = this;

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
    public final /* synthetic */ void CxL(View view, InterfaceC148316m1 interfaceC148316m1) {
    }

    @Override // X.InterfaceC150196pR
    public final void CxM(Drawable drawable, View view, InterfaceC148316m1 interfaceC148316m1) {
        C148276lx c148276lx;
        C14360o3.A0B(interfaceC148316m1, 0);
        ClipsAssetHubViewModel clipsAssetHubViewModel = this.A02;
        if (clipsAssetHubViewModel != null) {
            clipsAssetHubViewModel.A00 = drawable;
            C148276lx C0S = interfaceC148316m1.C0S();
            if (C0S != null) {
                String str = C0S.A0Z;
                C206409Bx c206409Bx = (C206409Bx) C75B.A00((C75B) this.A03.getValue()).get(str);
                if (c206409Bx != null) {
                    c148276lx = (C148276lx) c206409Bx.A00;
                } else {
                    c148276lx = null;
                }
                clipsAssetHubViewModel.A01 = c148276lx;
                ClipsAssetHubViewModel clipsAssetHubViewModel2 = this.A02;
                if (clipsAssetHubViewModel2 != null) {
                    C50120MBu.A01(clipsAssetHubViewModel2, str, AbstractC141776au.A00(clipsAssetHubViewModel2), 36);
                    C448624q c448624q = AbstractC43593JPy.A0T(this.A04).A0E;
                    C25531Mh A0A = C25531Mh.A0A(c448624q.A01);
                    if (AbstractC25226BEj.A1Z(A0A)) {
                        A0A.A0M(C81X.A1a, "tool_type");
                        C448624q.A00(A0A, c448624q);
                        A0A.A0a(c448624q.A0J());
                        A0A.A0M(c448624q.A0I(), "capture_type");
                        A0A.A0R("sticker_id", str);
                        C22M c22m = c448624q.A04;
                        AbstractC167007dF.A14(A0A, c22m);
                        A0A.A0c(c22m.A0A);
                        AbstractC167007dF.A13(A0A);
                        AbstractC167017dG.A1D(A0A);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("clipsAssetHubViewModel");
        throw C00O.createAndThrow();
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

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        JT7 jt7 = new JT7(requireContext(), view, this.A06, AbstractC166987dD.A0r(this.A04), C81U.A00, this, this.A01);
        this.A00 = jt7;
        jt7.E2K();
        if (this.A01 == EnumC46156Kbu.A03) {
            A00();
        }
    }

    public final void A00() {
        JT7 jt7 = this.A00;
        if (jt7 != null) {
            jt7.A06 = true;
            JT7.A00(jt7, null);
            MediaPlayer mediaPlayer = jt7.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            jt7.A00 = null;
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A01 == EnumC46156Kbu.A03) {
            return "clips_asset_hub_saved";
        }
        return "clips_asset_hub_trending";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC46156Kbu enumC46156Kbu;
        int A02 = C0f9.A02(-1121648836);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        Serializable serializable = null;
        if (bundle2 != null) {
            serializable = bundle2.getSerializable("arg_asset_entry_point");
        }
        if ((serializable instanceof EnumC46156Kbu) && (enumC46156Kbu = (EnumC46156Kbu) serializable) != null) {
            this.A01 = enumC46156Kbu;
        }
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        this.A02 = (ClipsAssetHubViewModel) new C52942bb(new C86V(AbstractC25231BEo.A0L(this), AbstractC166987dD.A0r(this.A04)), requireActivity).A00(ClipsAssetHubViewModel.class);
        C0f9.A09(1737278693, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-323059422);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_asset_hub_subfragment_layout, viewGroup, false);
        C0f9.A09(-1870194854, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(99603011);
        super.onDestroyView();
        JT7 jt7 = this.A00;
        if (jt7 != null) {
            jt7.close();
        }
        this.A00 = null;
        C0f9.A09(-1727519944, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1835430169);
        super.onPause();
        JT7 jt7 = this.A00;
        if (jt7 != null) {
            JT7.A00(jt7, null);
            MediaPlayer mediaPlayer = jt7.A00;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            jt7.A00 = null;
        }
        C0f9.A09(1038191351, A02);
    }
}
