package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.9K5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9K5 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC25175BBx {
    public static final String __redex_internal_original_name = "DirectQuickReplyCameraFragment";
    public RectF A00;
    public RectF A01;
    public C22P A02;
    public C69613Av A03;
    public C88X A04;
    public UserSession A05;
    public CameraConfiguration A06;
    public C81Y A07;
    public C81I A08;
    public C22926A8w A09;
    public DirectCameraViewModel A0A;
    public C3o9 A0B;
    public String A0C;
    public String A0D;
    public String A0E = "direct_quick_camera_fragment";
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public JQS A0O;

    @Override // X.AbstractC59962oe, X.InterfaceC60042om
    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    @Override // X.InterfaceC25175BBx
    public final void DJ3(boolean z) {
        String str;
        if (z != this.A0I) {
            this.A0I = z;
            if (z) {
                str = "direct_gallery";
            } else {
                str = "direct_quick_camera_fragment";
            }
            this.A0E = str;
            if (!this.A0G) {
                this.A0G = true;
                C1KM.A04(this);
            }
            C1KM.A09.A0D(this);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0E;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A07;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a0, code lost:
    
        if (r3.A0Y(r13.A05.userId) == false) goto L9;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9K5.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1094063899);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_quick_camera_fragment_layout);
        C0f9.A09(1903519434, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(481000542);
        super.onDestroyView();
        C81Y c81y = this.A07;
        if (c81y != null) {
            c81y.A00();
            this.A07 = null;
        }
        unregisterLifecycleListener(this.A08);
        this.A08.onDestroyView();
        this.A08 = null;
        C0f9.A09(-460219361, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(685566133);
        super.onResume();
        this.A0O.A0J("destination", this.A0E);
        if (!this.A0K) {
            Activity rootActivity = getRootActivity();
            rootActivity.getClass();
            AbstractC65987Txg.A00(rootActivity);
        }
        C0f9.A09(1159869657, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.A0K) {
            C30D.A03(requireActivity());
        }
        final ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.direct_quick_camera_container);
        C81I c81i = new C81I();
        this.A08 = c81i;
        registerLifecycleListener(c81i);
        Runnable runnable = new Runnable() { // from class: X.9K6
            /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
            
                if (r1 != false) goto L14;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 321
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C9K6.run():void");
            }
        };
        C57982lB.A0B.A05(requireActivity(), runnable);
    }
}
