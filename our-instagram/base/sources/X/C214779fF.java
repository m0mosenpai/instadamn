package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.9fF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214779fF extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectAddYoursCameraFragment";
    public C81Y A01;
    public C81I A02;
    public C22P A00 = C22P.A2D;
    public final InterfaceC25214BDm A03 = new C23764Afb(2);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_add_yours_camera_fragment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x006b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, (X.AbstractC12990ll) r10.A04.getValue(), 36324071726329725L) == false) goto L9;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r6 = 0
            X.C14360o3.A0B(r11, r6)
            super.onViewCreated(r11, r12)
            android.os.Bundle r2 = r10.requireArguments()
            X.81I r0 = new X.81I
            r0.<init>()
            r10.A02 = r0
            r10.registerLifecycleListener(r0)
            r0 = 10
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.22P r0 = X.AbstractC167027dH.A0D(r2, r0)
            r10.A00 = r0
            r0 = 2131431740(0x7f0b113c, float:1.8485218E38)
            android.view.View r9 = r11.findViewById(r0)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r0 = 7
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            android.os.Parcelable r5 = r2.getParcelable(r0)
            com.instagram.model.direct.camera.DirectCameraViewModel r5 = (com.instagram.model.direct.camera.DirectCameraViewModel) r5
            r0 = 1352(0x548, float:1.895E-42)
            java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r0 = r2.getString(r1)
            if (r0 == 0) goto Lea
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r0 = "UTF-8"
            java.lang.String r8 = java.net.URLDecoder.decode(r1, r0)
        L4b:
            r0 = 2822(0xb06, float:3.954E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            if (r0 == 0) goto L6d
            X.0do r0 = r10.A04
            java.lang.Object r3 = r0.getValue()
            X.0ll r3 = (X.AbstractC12990ll) r3
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324071726329725(0x810c8d000b2f7d, double:3.034827452803135E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r7 = 1
            if (r0 != 0) goto L6e
        L6d:
            r7 = 0
        L6e:
            X.81J r4 = new X.81J
            r4.<init>()
            X.BDm r0 = r10.A03
            r0.getClass()
            r4.A0l = r0
            X.0do r1 = r10.A04
            X.C81J.A0L(r4, r1)
            android.app.Activity r0 = r10.getRootActivity()
            X.C81J.A03(r0, r10, r4)
            X.81P r2 = X.C81O.A02
            java.lang.Object r0 = r1.getValue()
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r3 = 1
            X.81T r1 = X.C81T.A00
            X.C81J.A0C(r0, r2, r1, r4)
            r4.A3h = r3
            X.2q0 r0 = r10.volumeKeyPressController
            r4.A0R = r0
            X.81I r0 = r10.A02
            r0.getClass()
            r4.A0t = r0
            r9.getClass()
            r4.A09 = r9
            X.22P r0 = r10.A00
            r4.A0B = r0
            r4.A0O = r10
            r4.A3H = r3
            r4.A1I = r5
            r4.A3Q = r3
            r4.A3G = r3
            r4.A3i = r3
            r4.A3t = r6
            r4.A3s = r3
            r4.A44 = r6
            r4.A47 = r3
            r4.A3L = r6
            r0 = 3
            r4.A03 = r0
            java.lang.Integer r0 = X.C05F.A01
            r4.A28 = r0
            r4.A3b = r3
            r4.A2O = r8
            r4.A46 = r7
            r4.A3J = r3
            X.81W[] r0 = new X.C81W[r6]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r2 = X.C82R.A00(r1, r0)
            if (r5 == 0) goto Ldf
            int r1 = r5.A00
            r0 = 9
            if (r1 != r0) goto Ldf
            r2.A02 = r3
        Ldf:
            r4.A0V = r2
            X.AwI r0 = new X.AwI
            r0.<init>(r4, r10)
            X.AbstractC167007dF.A0z(r10, r0)
            return
        Lea:
            r8 = 0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214779fF.onViewCreated(android.view.View, android.os.Bundle):void");
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(266301787);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        C0f9.A09(502099686, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-2033973308);
        super.onDestroyView();
        this.A01 = null;
        unregisterLifecycleListener(this.A02);
        C81I c81i = this.A02;
        if (c81i != null) {
            c81i.onDestroyView();
        }
        this.A02 = null;
        C0f9.A09(-1809811321, A02);
    }
}
