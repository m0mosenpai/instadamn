package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KC9 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "CutoutStickerGalleryCreationFragment";
    public Integer A00;
    public boolean A01;
    public C48596LeY A02;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC186098Nd A05 = new C48587LeP(this);
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(new MHQ(this, 26), new MHQ(this, 25), new B61(12, null, this), AbstractC25225BEi.A1D(C44447JlF.class));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cutout_sticker_gallery_creation";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("args_entry_point");
        } else {
            str = null;
        }
        this.A00 = AbstractC46681Kky.A00(str);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("args_from_create_btn");
        } else {
            z = false;
        }
        this.A01 = z;
        AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.A0u(new C55553Oln(7, parentFragmentManager, this), requireActivity(), "cutout_sticker_creation_fragment_request_key");
        ViewStub viewStub = (ViewStub) AbstractC166997dE.A0S(view, R.id.cutout_sticker_gallery_creation_stub);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A04);
        C08790ch A00 = AbstractC018607g.A00(this);
        requireContext().getColor(R.color.black_30_transparent);
        int width = AbstractC58002lE.A01(requireContext()).getWidth();
        InterfaceC186098Nd interfaceC186098Nd = this.A05;
        Integer num = this.A00;
        if (num == null) {
            C14360o3.A0F("entryPoint");
            throw C00O.createAndThrow();
        }
        C48596LeY c48596LeY = new C48596LeY(requireActivity, requireContext, viewStub, A00, this, A0r, interfaceC186098Nd, num, null, width, false, this.A01);
        this.A02 = c48596LeY;
        c48596LeY.E2K();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C48596LeY c48596LeY = this.A02;
        if (c48596LeY == null) {
            C14360o3.A0F("cutoutStickerGalleryController");
            throw C00O.createAndThrow();
        }
        return c48596LeY.CJQ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(616710871);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_gallery_creation_fragment, viewGroup, false);
        C0f9.A09(244329022, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-349148251);
        super.onDestroyView();
        C48596LeY c48596LeY = this.A02;
        if (c48596LeY == null) {
            C14360o3.A0F("cutoutStickerGalleryController");
            throw C00O.createAndThrow();
        }
        c48596LeY.close();
        C0f9.A09(-1543981916, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1781516558);
        super.onResume();
        JQ1.A0Z(this, 8);
        AbstractC145016gM.A03(requireActivity(), null, AbstractC166987dD.A0r(this.A04), false, false);
        C48596LeY c48596LeY = this.A02;
        if (c48596LeY == null) {
            C14360o3.A0F("cutoutStickerGalleryController");
            throw C00O.createAndThrow();
        }
        if (c48596LeY.A07 != null) {
            C48596LeY.A06(c48596LeY, false, false);
        }
        C0f9.A09(-2121751427, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1976387686);
        super.onStop();
        JQ1.A0Z(this, 0);
        if (!this.A01) {
            AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A04), false, false);
        }
        C0f9.A09(1438942664, A02);
    }
}
