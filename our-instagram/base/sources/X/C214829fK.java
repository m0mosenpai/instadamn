package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import java.io.File;

/* renamed from: X.9fK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214829fK extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ArCameraMediaShareFragment";
    public C22P A00;
    public C81Y A01;
    public C81I A02;
    public File A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07 = true;
    public final InterfaceC25214BDm A08 = new C23765Afc(this, 0);
    public final InterfaceC09390do A09 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "AR_COMMERCE_CAMERA_SHARE";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.media_share_container);
        C81I c81i = new C81I();
        this.A02 = c81i;
        registerLifecycleListener(c81i);
        AbstractC167007dF.A0z(this, new RunnableC24582Aud(A0C, this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A09.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A01;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1448506131);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = new File(AbstractC153636vY.A01(requireArguments, "preset_medium_file_path"));
        this.A00 = AbstractC167027dH.A0D(requireArguments, "camera_entry_point");
        String string = requireArguments.getString("media_type");
        AbstractC153636vY.A03(requireArguments, string, "media_type");
        this.A06 = string;
        String string2 = requireArguments.getString("effect_id");
        AbstractC153636vY.A03(requireArguments, string2, "effect_id");
        this.A05 = string2;
        this.A07 = requireArguments.getBoolean("use_effect_attribution");
        this.A04 = requireArguments.getString("ads_client_token");
        C0f9.A09(1528834868, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(880188566);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_share_layout, viewGroup, false);
        C0f9.A09(2119675686, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-650693094);
        super.onDestroyView();
        C81Y c81y = this.A01;
        if (c81y != null) {
            c81y.A00();
        }
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        C81I c81i = this.A02;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A02 = null;
        C0f9.A09(-418977121, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(458308995);
        super.onResume();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(8);
        }
        Activity rootActivity2 = getRootActivity();
        C14360o3.A0A(rootActivity2);
        this.A09.getValue();
        AbstractC65987Txg.A00(rootActivity2);
        C0f9.A09(-1267719355, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        int A02 = C0f9.A02(223622185);
        super.onStop();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(0);
        }
        Activity rootActivity2 = getRootActivity();
        if (rootActivity2 != null && (window = rootActivity2.getWindow()) != null) {
            AbstractC56402iY.A07(window.getDecorView(), window, true);
        }
        C0f9.A09(1283360824, A02);
    }
}
