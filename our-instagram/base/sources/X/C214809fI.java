package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.9fI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214809fI extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectPermanentMediaCameraFragment";
    public C81Y A01;
    public C81I A02;
    public String A03;
    public C22P A00 = C22P.A2S;
    public final InterfaceC25214BDm A04 = new C23764Afb(4);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(2265);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C81I c81i = new C81I();
        this.A02 = c81i;
        registerLifecycleListener(c81i);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get(AbstractC43591JPw.A00(10));
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
        this.A00 = (C22P) obj;
        this.A03 = requireArguments.getString(AbstractC43591JPw.A00(598));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.direct_quick_camera_container);
        DirectCameraViewModel directCameraViewModel = (DirectCameraViewModel) requireArguments.getParcelable(AbstractC43591JPw.A00(7));
        C14360o3.A0A(viewGroup);
        C81J c81j = new C81J();
        InterfaceC25214BDm interfaceC25214BDm = this.A04;
        interfaceC25214BDm.getClass();
        c81j.A0l = interfaceC25214BDm;
        InterfaceC09390do interfaceC09390do = this.A05;
        C81J.A0L(c81j, interfaceC09390do);
        C81J.A03(getRootActivity(), this, c81j);
        C81J.A0C((UserSession) interfaceC09390do.getValue(), C81O.A02, C81T.A00, c81j);
        c81j.A3h = true;
        c81j.A0R = this.volumeKeyPressController;
        C81I c81i2 = this.A02;
        c81i2.getClass();
        c81j.A0t = c81i2;
        viewGroup.getClass();
        c81j.A09 = viewGroup;
        c81j.A0B = this.A00;
        c81j.A0O = this;
        c81j.A3H = true;
        c81j.A1I = directCameraViewModel;
        c81j.A3Q = false;
        c81j.A3G = false;
        c81j.A3i = true;
        c81j.A3t = false;
        c81j.A3s = false;
        c81j.A44 = false;
        c81j.A47 = true;
        c81j.A3L = false;
        c81j.A03 = 3;
        c81j.A28 = C05F.A0N;
        String str = this.A03;
        c81j.A2h = str;
        c81j.A3J = true;
        if (str != null) {
            c81j.A26 = 1;
        }
        C14360o3.A07(c81j);
        AbstractC167007dF.A0z(this, new RunnableC24679AwK(c81j, this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A05.getValue();
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1444823335);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        C0f9.A09(293197098, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1941543361);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        C81I c81i = this.A02;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A02 = null;
        C0f9.A09(-595862303, A02);
    }
}
