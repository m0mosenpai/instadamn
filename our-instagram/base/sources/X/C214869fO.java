package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableSet;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.DragToDismissView;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.HashSet;

/* renamed from: X.9fO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214869fO extends AbstractC59962oe implements InterfaceC60072op, InterfaceC11210ic {
    public static final String __redex_internal_original_name = "CameraBottomUpNavigationFragment";
    public C69459Vni A00;
    public C81Y A01;
    public C81I A02;
    public final float A03 = 1.0f;
    public final float A04 = 0.9f;
    public final InterfaceC25214BDm A06 = new C23765Afc(this, 1);
    public final A58 A05 = new A58(this);
    public final X8L A08 = new C70850WiG(this);
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick_camera_fragment_nav3_bottom_up_navigation";
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Afx, java.lang.Object, X.BBw, X.BBx] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C128535rM c128535rM;
        C81O A01;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DragToDismissView dragToDismissView = (DragToDismissView) view.requireViewById(R.id.quick_capture_fragment_container_drag);
        dragToDismissView.setDismissListener(this.A08);
        View findViewById = view.findViewById(R.id.quick_capture_fragment_container);
        if (findViewById != null) {
            dragToDismissView.A00 = findViewById;
            C81I c81i = new C81I();
            this.A02 = c81i;
            registerLifecycleListener(c81i);
            ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.quick_capture_fragment_container);
            Bundle requireArguments = requireArguments();
            CameraConfiguration cameraConfiguration = (CameraConfiguration) requireArguments.getParcelable(AbstractC111324zv.A00(16));
            String string = requireArguments.getString(AbstractC111324zv.A00(2023));
            boolean z = requireArguments.getBoolean("camera_open_mini_gallery", false);
            C22P c22p = C22P.A0a;
            PendingRecipient pendingRecipient = (PendingRecipient) requireArguments.getParcelable("targetGroupProfile");
            boolean z2 = requireArguments.getBoolean(MSV.A00(54), false);
            if (pendingRecipient != null) {
                C16910sj c16910sj = C16910sj.A00;
                c128535rM = C128535rM.A00;
                ImmutableSet A012 = ImmutableSet.A01(c128535rM, C208509Kk.A00, C81U.A00);
                C14360o3.A07(A012);
                A01 = new C81O(c16910sj, A012);
            } else {
                this.A07.getValue();
                HashSet hashSet = new HashSet();
                hashSet.add(C208509Kk.A00);
                hashSet.add(C81U.A00);
                hashSet.add(C81S.A00);
                c128535rM = C128535rM.A00;
                hashSet.add(c128535rM);
                A01 = C81O.A02.A01(hashSet);
            }
            C81J c81j = new C81J();
            InterfaceC25214BDm interfaceC25214BDm = this.A06;
            interfaceC25214BDm.getClass();
            c81j.A0l = interfaceC25214BDm;
            InterfaceC09390do interfaceC09390do = this.A07;
            C81J.A0L(c81j, interfaceC09390do);
            C81J.A03(getActivity(), this, c81j);
            A01.getClass();
            c81j.A0W = A01;
            c81j.A3h = true;
            c81j.A0R = this.volumeKeyPressController;
            C81I c81i2 = this.A02;
            if (c81i2 == null) {
                C14360o3.A0F("lifecycleDispatcher");
                throw C00O.createAndThrow();
            }
            c81j.A0t = c81i2;
            A0C.getClass();
            c81j.A09 = A0C;
            c81j.A0B = c22p;
            c81j.A0O = this;
            c81j.A2g = string;
            c81j.A3F = true;
            c81j.A3H = true;
            c81j.A47 = true;
            C81J.A0F(c81j);
            c81j.A3k = false;
            c81j.A44 = requireArguments.getBoolean("camera_should_show_more_options", true);
            c81j.A3Q = true;
            c81j.A41 = z;
            c81j.A3f = true;
            c81j.A0y = C81K.A02;
            c81j.A3g = true;
            c81j.A3N = true;
            c81j.A1S = pendingRecipient;
            c81j.A3c = z2;
            c81j.A3X = requireArguments.getBoolean(AbstractC111324zv.A00(777));
            setModuleNameV2("feed_precapture_camera");
            ?? obj = new Object();
            obj.A00 = c128535rM;
            obj.A03 = true;
            obj.A02 = "feed_precapture_camera";
            obj.A01 = new A57(this);
            c81j.A0i = new C23744AfH(this, obj);
            c81j.A0q = obj;
            c81j.A0r = obj;
            c81j.A0V = cameraConfiguration;
            C14360o3.A07(c81j);
            C22P c22p2 = c81j.A0B;
            C14360o3.A07(c22p2);
            interfaceC09390do.getValue();
            AbstractC189688an.A00(c22p2);
            AbstractC167007dF.A0z(this, new RunnableC24590Aul(this, c81j));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A07.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A01;
        if (c81y == null) {
            C14360o3.A0F("quickCaptureController");
            throw C00O.createAndThrow();
        }
        return c81y.A06();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2116995413);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_quick_capture_bottom_navigation, viewGroup, false);
        inflate.findViewById(R.id.quick_capture_fragment_container).setBackground(null);
        C0f9.A09(-1333465296, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-314867703);
        super.onDestroyView();
        if (this.mView != null) {
            C81Y c81y = this.A01;
            if (c81y == null) {
                str = "quickCaptureController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c81y.A00();
        }
        C81I c81i = this.A02;
        str = "lifecycleDispatcher";
        if (c81i != null) {
            unregisterLifecycleListener(c81i);
            C81I c81i2 = this.A02;
            if (c81i2 != null) {
                c81i2.onDestroyView();
                this.A00 = null;
                C0f9.A09(979546903, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1771526093);
        super.onResume();
        Activity rootActivity = getRootActivity();
        C14360o3.A0A(rootActivity);
        this.A07.getValue();
        AbstractC65987Txg.A00(rootActivity);
        C0f9.A09(346466594, A02);
    }
}
