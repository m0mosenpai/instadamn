package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class EHR extends AbstractC72463Mt {
    public static final String __redex_internal_original_name = "LoginBypassActionHandlerFragment";
    public Integer A00;
    public String A01;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A07 = "login_bypass_action_loading_screen";
    public InterfaceC16820sZ A02 = GU7.A00;
    public final AtomicBoolean A03 = AbstractC166997dE.A17();
    public final Handler A05 = AbstractC167007dF.A0J();
    public final Runnable A06 = new GLZ(this);

    @Override // X.AbstractC72463Mt, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C1Z0 A00 = AbstractC34209F7h.A00();
        Context context = getContext();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        A00.A00(context, window, true, true);
    }

    @Override // X.AbstractC72463Mt
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0M() {
        return AbstractC166987dD.A0o(this.A04);
    }

    public static final void A01(EHR ehr) {
        Window window;
        C1Z0 A00 = AbstractC34209F7h.A00();
        FragmentActivity activity = ehr.getActivity();
        if (activity != null) {
            window = activity.getWindow();
        } else {
            window = null;
        }
        A00.A01(window);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2040895768);
        Context context = getContext();
        if (context != null) {
            View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.login_bypass_loading_indicator_view);
            C0f9.A09(1882272235, A02);
            return A0C;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1850923249, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1937423472);
        super.onPause();
        A07();
        this.A05.removeCallbacks(this.A06);
        A01(this);
        C0f9.A09(-761505720, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(457670951);
        super.onResume();
        FragmentActivity activity = getActivity();
        Handler handler = this.A05;
        Runnable runnable = this.A06;
        InterfaceC09390do interfaceC09390do = this.A04;
        handler.postDelayed(runnable, C18U.A01(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36605847350482273L));
        if (activity != null) {
            Integer num = this.A00;
            if (num == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            C09530e4 A1L = AbstractC166987dD.A1L("fbid", null);
            switch (num.intValue()) {
                case 1:
                    str = "tag_mention";
                    break;
                case 2:
                    str = "bff_netego_banner";
                    break;
                case 3:
                    str = "xav_switcher_client";
                    break;
                default:
                    str = "profile_links";
                    break;
            }
            LinkedHashMap A0r = AbstractC31180DnO.A0r("launch_url", this.A01, A1L, AbstractC166987dD.A1L("caller", str), AbstractC166987dD.A1L("obid", null));
            C62862tP A0O = AbstractC31172DnG.A0O(activity, this, AbstractC166987dD.A0o(interfaceC09390do));
            C69618VsL c69618VsL = new C69618VsL("com.bloks.www.xav.ig_x_fb.bypass_login.endpoint_generator");
            c69618VsL.A04 = AbstractC191768eY.A01(A0r);
            c69618VsL.A02 = new C36028FvQ(this, 2);
            c69618VsL.A00(activity, A0O);
        } else {
            A07();
        }
        C0f9.A09(-798459661, A02);
    }
}
