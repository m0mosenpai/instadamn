package X;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Bsg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26818Bsg extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "YourAIsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final String A06 = "your_ais_fragment";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28370CfW A0p = AbstractC25226BEj.A0p(this.A00);
        Object value = this.A02.getValue();
        C14360o3.A0B(value, 0);
        C25531Mh A00 = C28370CfW.A00(A0p);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("your_ais_screen_shown");
            A00.A0w(AbstractC167007dF.A0n(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value));
            C28370CfW.A01(A00, A0p);
        }
    }

    public static final void A00(C26818Bsg c26818Bsg, UserSession userSession, String str) {
        Object parcelable;
        String str2;
        AbstractC25226BEj.A0p(c26818Bsg.A00).A03(str);
        int i = Build.VERSION.SDK_INT;
        UtmMetadata utmMetadata = null;
        Bundle bundle = c26818Bsg.mArguments;
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
        A0b.putString("AiStudioArgumentKeys.creation_entry_point", str);
        A0b.putParcelable("utm_metadata", utmMetadata);
        boolean A06 = C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36330101860090558L);
        FragmentActivity activity = c26818Bsg.getActivity();
        if (A06) {
            str2 = "AI_CREATION_CUSTOM_AI";
        } else {
            str2 = "AI_CREATION_TEMPLATES";
        }
        AbstractC25230BEn.A1A(c26818Bsg, C6XJ.A03(activity, A0b, userSession, ModalActivity.class, str2));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C28370CfW A0p = AbstractC25226BEj.A0p(this.A00);
        C25531Mh A00 = C28370CfW.A00(A0p);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("your_ais_back_clicked");
            C28370CfW.A01(A00, A0p);
            return false;
        }
        return false;
    }

    public C26818Bsg() {
        C50157MDk c50157MDk = new C50157MDk(this, 26);
        C50157MDk c50157MDk2 = new C50157MDk(this, 23);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C50157MDk(c50157MDk2, 24));
        this.A05 = AbstractC25225BEi.A0a(new C50157MDk(A00, 25), c50157MDk, new C29897DGl(17, null, A00), AbstractC25225BEi.A1D(C44473Jlf.class));
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C29647D5p(this));
        this.A00 = C1XM.A00(new C50157MDk(this, 21));
        this.A01 = C1XM.A00(new C50157MDk(this, 22));
        this.A02 = DH6.A01(this, "your_ais_entry_point", enumC09460dv, 17);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131977175);
        C3LO c3lo = new C3LO();
        c3lo.A06 = R.drawable.instagram_add_pano_outline_24;
        c3lo.A05 = 2131956966;
        ViewOnClickListenerC28667ClF.A02(c3lo, interfaceC56362iU, this, 14);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2125772851);
        super.onCreate(bundle);
        AbstractC25226BEj.A0r(this.A01).A06.markerStart(895690123);
        C0f9.A09(-494702032, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1676850123);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 11), -2047053145);
        C0f9.A09(1579512833, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1061648896);
        C7F6 A0r = AbstractC25226BEj.A0r(this.A01);
        A0r.A06.markerEnd(895690123, AbstractC25594BTh.A00(C05F.A0C));
        super.onDestroy();
        C0f9.A09(1430647016, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-225509806);
        super.onResume();
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A05);
        AbstractC166987dD.A1Z(new MCD(A0Z, null, 21), AbstractC141776au.A00(A0Z));
        C0f9.A09(1464543130, A02);
    }
}
