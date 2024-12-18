package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.BrQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26744BrQ extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiSearchFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final String A07;

    public static final void A00(C26744BrQ c26744BrQ) {
        Object parcelable;
        String str;
        AbstractC25226BEj.A0p(c26744BrQ.A00).A03("ai_home_search");
        int i = Build.VERSION.SDK_INT;
        UtmMetadata utmMetadata = null;
        Bundle bundle = c26744BrQ.mArguments;
        if (i >= 33) {
            if (bundle != null) {
                parcelable = bundle.getParcelable("utm_metadata", UtmMetadata.class);
                utmMetadata = (UtmMetadata) parcelable;
            }
        } else if (bundle != null) {
            parcelable = bundle.getParcelable("utm_metadata");
            utmMetadata = (UtmMetadata) parcelable;
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("AiStudioArgumentKeys.creation_entry_point", "ai_home_search");
        A0b.putParcelable("utm_metadata", utmMetadata);
        InterfaceC09390do interfaceC09390do = c26744BrQ.A04;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        boolean A06 = C18U.A06(AbstractC166997dE.A0U(A0r), A0r, 36330101860090558L);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        FragmentActivity activity = c26744BrQ.getActivity();
        if (A06) {
            str = "AI_CREATION_CUSTOM_AI";
        } else {
            str = "AI_CREATION_TEMPLATES";
        }
        AbstractC25230BEn.A1A(c26744BrQ, C6XJ.A03(activity, A0b, A0o, ModalActivity.class, str));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C26744BrQ() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = DH6.A01(this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, enumC09460dv, 13);
        this.A03 = DH6.A01(this, "search_box_placeholder_text", enumC09460dv, 14);
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C29646D5o(this));
        this.A07 = "search_fragment";
        DGX A00 = DGX.A00(this, 48);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, DGX.A00(DGX.A00(this, 45), 46));
        this.A06 = AbstractC25225BEi.A0a(DGX.A00(A002, 47), A00, new C29897DGl(16, null, A002), AbstractC25225BEi.A1D(C25847Bc2.class));
        this.A01 = AbstractC09440dt.A01(DGX.A00(this, 44));
        this.A00 = C1XM.A00(DGX.A00(this, 43));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1098392490);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 10), -1982844107);
        C0f9.A09(-1742901644, A02);
        return A00;
    }
}
