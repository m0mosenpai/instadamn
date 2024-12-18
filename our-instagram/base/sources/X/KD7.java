package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.StickerPack;

/* loaded from: classes8.dex */
public final class KD7 extends AbstractC59962oe implements InterfaceC189488aT, InterfaceC50436MOq, MQw {
    public static final String __redex_internal_original_name = "DirectStickerPackViewerFragment";
    public C47346Kvv A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final boolean A0B;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public final InterfaceC11380iw A01 = AbstractC31171DnF.A0D("direct_sticker_pack_viewer_fragment");

    @Override // X.InterfaceC50436MOq
    public final void ADq(C7IK c7ik) {
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.8f;
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
        return "direct_sticker_pack_viewer_fragment";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A06;
        ((RecyclerView) interfaceC09390do.getValue()).setLayoutManager((AbstractC70663Fe) this.A04.getValue());
        ((RecyclerView) interfaceC09390do.getValue()).A10(AbstractC46752Km9.A00(requireContext(), null, 0, false, AbstractC31178DnM.A1a(this.A08)));
        ((RecyclerView) interfaceC09390do.getValue()).setAdapter(((L3M) this.A02.getValue()).A01);
        String A13 = AbstractC31172DnG.A13(requireArguments(), "sticker_pack_id");
        InterfaceC09390do interfaceC09390do2 = this.A0A;
        C44479Jll c44479Jll = (C44479Jll) interfaceC09390do2.getValue();
        C14360o3.A0A(A13);
        Resources A09 = AbstractC31177DnL.A09(this);
        C14360o3.A0B(A13, 0);
        C05A c05a = c44479Jll.A02;
        c05a.Egh(new C51761Mtk((StickerPack) ((C51761Mtk) c05a.getValue()).A02, C05F.A01));
        C47555KzQ c47555KzQ = c44479Jll.A01;
        C43783JXw A18 = AbstractC43592JPx.A18(c44479Jll, 21);
        C43783JXw A182 = AbstractC43592JPx.A18(c44479Jll, 22);
        int dimensionPixelSize = A09.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        UserSession userSession = c47555KzQ.A00;
        int A00 = AbstractC46755KmC.A00(A09, userSession);
        int dimensionPixelSize2 = A09.getDimensionPixelSize(R.dimen.ai_agent_embodiment_video_container_size);
        boolean z = !C18U.A06(C06090Tz.A05, userSession, 36329612234015158L);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        A0b.A03("pack_icon_size", valueOf);
        boolean A1W = AbstractC167007dF.A1W(valueOf);
        Integer valueOf2 = Integer.valueOf(A00);
        A0b.A03("sticker_preview_size", valueOf2);
        boolean A1W2 = AbstractC167007dF.A1W(valueOf2);
        Integer valueOf3 = Integer.valueOf(dimensionPixelSize2);
        A0b.A03("sticker_full_size", valueOf3);
        boolean A1W3 = AbstractC167007dF.A1W(valueOf3);
        Boolean valueOf4 = Boolean.valueOf(z);
        A0b.A02("sticker_preview_force_static_image", valueOf4);
        boolean A1W4 = AbstractC167007dF.A1W(valueOf4);
        A0b.A01("sticker_full_force_static_image");
        A0b.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A13);
        C18C.A0E(A1W);
        C18C.A0E(A1W2);
        C18C.A0E(A1W3);
        C48146LSv.A00(new LT8(c47555KzQ, A18, A182, A00, dimensionPixelSize2, z), new PandoGraphQLRequest(AbstractC25227BEk.A0U(A1W4), "IGStickerPack", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59440Qeb.class, false, null, 0, null, "fetch__XIGStickerStorePack", AbstractC166987dD.A1E()), c47555KzQ.A01, A182, 21);
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), ((C44479Jll) interfaceC09390do2.getValue()).A00, new C50359MLl(this, 3), 35);
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
    public final boolean CQm() {
        return this.A0B;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return AbstractC110854yx.A03((LinearLayoutManager) this.A04.getValue());
    }

    public KD7() {
        C50249MHe c50249MHe = new C50249MHe(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50249MHe(new C50249MHe(this, 16), 17));
        this.A0A = AbstractC25225BEi.A0a(new C50249MHe(A00, 18), c50249MHe, new C37018GSz(15, A00, null), AbstractC25225BEi.A1D(C44479Jll.class));
        this.A09 = C50249MHe.A00(this, 19);
        this.A06 = C50249MHe.A00(this, 14);
        this.A05 = C50249MHe.A00(this, 13);
        this.A03 = C50249MHe.A00(this, 11);
        this.A02 = C50249MHe.A00(this, 10);
        this.A08 = C50249MHe.A00(this, 15);
        this.A04 = C50249MHe.A00(this, 12);
        this.A0B = true;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.8f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1586583630);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_sticker_pack, false);
        C0f9.A09(-926916637, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1841537618);
        super.onDestroy();
        this.A00 = null;
        C0f9.A09(1530801108, A02);
    }
}
