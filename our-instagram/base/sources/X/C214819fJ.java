package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig;

/* renamed from: X.9fJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214819fJ extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "OpenCarouselCameraFragment";
    public OpenCarouselCaptureConfig A00;
    public C81Y A01;
    public C81I A02;
    public final InterfaceC25214BDm A03 = new C23765Afc(this, 4);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2826);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C81I c81i = new C81I();
        this.A02 = c81i;
        registerLifecycleListener(c81i);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.camera_container);
        C14360o3.A0A(viewGroup);
        C81J c81j = new C81J();
        InterfaceC25214BDm interfaceC25214BDm = this.A03;
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        InterfaceC09390do interfaceC09390do = this.A04;
        C81J.A0L(c81j, interfaceC09390do);
        C81J.A03(getRootActivity(), this, c81j);
        C81J.A0C((UserSession) interfaceC09390do.getValue(), C81O.A02, C128535rM.A00, c81j);
        c81j.A3h = true;
        c81j.A0R = this.volumeKeyPressController;
        C81I c81i2 = this.A02;
        c81i2.getClass();
        c81j.A0t = c81i2;
        viewGroup.getClass();
        c81j.A09 = viewGroup;
        c81j.A0B = C22P.A3k;
        c81j.A0O = this;
        c81j.A3H = true;
        c81j.A3Q = false;
        c81j.A3G = false;
        c81j.A3i = true;
        c81j.A3t = false;
        c81j.A3s = false;
        c81j.A44 = false;
        c81j.A47 = true;
        c81j.A3L = false;
        c81j.A28 = C05F.A1F;
        c81j.A0b = this.A00;
        c81j.A3J = true;
        C14360o3.A07(c81j);
        AbstractC167007dF.A0z(this, new RunnableC24692AwY(c81j, this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A04.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A01;
        if (c81y == null || !c81y.A06()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1924332934);
        super.onCreate(bundle);
        this.A00 = (OpenCarouselCaptureConfig) requireArguments().getParcelable(AbstractC43591JPw.A00(1229));
        C0f9.A09(392891048, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1340028374);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.open_carousel_camera_fragment_layout, viewGroup, false);
        C0f9.A09(1035225685, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1179465257);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        C81I c81i = this.A02;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A02 = null;
        C0f9.A09(116018960, A02);
    }
}
