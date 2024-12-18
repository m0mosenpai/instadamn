package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.SingletonImmutableSet;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.9fM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214849fM extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectVisualReplyFragment";
    public RectF A00;
    public RectF A01;
    public C22P A02;
    public UserSession A03;
    public ImageUrl A04;
    public C81Y A05;
    public C81I A06;
    public C22926A8w A07;
    public DirectCameraViewModel A08;
    public C3o9 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public C3MJ A0L;
    public C3MT A0M;
    public G5I A0N;
    public String A0O;
    public boolean A0P;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(110);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A03;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C81Y c81y = this.A05;
        if (c81y != null && c81y.A06()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0164, code lost:
    
        if (r2.contains(0) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0176, code lost:
    
        if (r2.contains(1) == false) goto L25;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C214849fM.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(286263043);
        int i = requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THEME");
        if (i != 0) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, i);
        }
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_quick_camera_fragment_layout);
        C0f9.A09(1872248862, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1273598661);
        super.onDestroyView();
        C81Y c81y = this.A05;
        if (c81y != null) {
            c81y.A00();
        }
        this.A05 = null;
        unregisterLifecycleListener(this.A06);
        this.A06.onDestroyView();
        this.A06 = null;
        C0f9.A09(-1206769043, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1495862795);
        super.onPause();
        if (this.A07.A03) {
            C3MJ c3mj = this.A0L;
            C3MT c3mt = this.A0M;
            c3mt.getClass();
            c3mj.A06(c3mt);
            this.A0L.A04();
        }
        C0f9.A09(-1953756507, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-637518033);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        AbstractC65987Txg.A00(rootActivity);
        if (this.A07.A00 == null) {
            C0w9.A03(__redex_internal_original_name, "Reply Context Media is null");
            AbstractC25226BEj.A1P(this);
        }
        if (this.A07.A03) {
            this.A0L.A03();
            C3MT A00 = C3MJ.A00(new C48500Lcr(this.A03, this.A0N, this.A09, this.A0B, this.A0O, null, this.A0P));
            this.A0M = A00;
            this.A0L.A05(A00);
        }
        C0f9.A09(793697220, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1564290912);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(-1345034335, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1748974869);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(-144184214, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.direct_quick_camera_container);
        C81I c81i = new C81I();
        this.A06 = c81i;
        registerLifecycleListener(c81i);
        Runnable runnable = new Runnable() { // from class: X.AwL
            @Override // java.lang.Runnable
            public final void run() {
                C81O c81o;
                Integer num;
                C214849fM c214849fM = this;
                ViewGroup viewGroup = A0F;
                if (c214849fM.mView != null) {
                    C81T c81t = C81T.A00;
                    CameraConfiguration A00 = C82R.A00(c81t, new C81W[0]);
                    A00.A02 = c214849fM.A0K;
                    String str = c214849fM.A0C;
                    boolean equals = "story_remix_reply".equals(str);
                    boolean equals2 = "story_selfie_reply".equals(str);
                    C81J A01 = C81J.A01();
                    C23766Afd c23766Afd = new C23766Afd(c214849fM, 1);
                    c23766Afd.getClass();
                    A01.A0l = c23766Afd;
                    UserSession userSession = c214849fM.A03;
                    userSession.getClass();
                    A01.A0S = userSession;
                    C81J.A03(c214849fM.getRootActivity(), c214849fM, A01);
                    if (!equals && !equals2) {
                        c81o = C81O.A02.A00(c214849fM.A03, c81t);
                    } else {
                        c81o = new C81O(C16910sj.A00, new SingletonImmutableSet(C208509Kk.A00));
                    }
                    c81o.getClass();
                    A01.A0W = c81o;
                    A01.A3h = true;
                    A01.A0R = c214849fM.volumeKeyPressController;
                    C81I c81i2 = c214849fM.A06;
                    c81i2.getClass();
                    A01.A0t = c81i2;
                    viewGroup.getClass();
                    A01.A09 = viewGroup;
                    A01.A0B = c214849fM.A02;
                    A01.A0O = c214849fM;
                    A01.A1I = c214849fM.A08;
                    RectF rectF = c214849fM.A00;
                    RectF rectF2 = c214849fM.A01;
                    A01.A06 = rectF;
                    A01.A07 = rectF2;
                    A01.A3r = false;
                    A01.A3v = true;
                    A01.A33 = false;
                    A01.A04 = 0L;
                    String str2 = c214849fM.A0C;
                    C22926A8w c22926A8w = c214849fM.A07;
                    ImageInfo imageInfo = c22926A8w.A00;
                    String str3 = c22926A8w.A01;
                    boolean z = c214849fM.A0E;
                    boolean z2 = c214849fM.A0G;
                    A01.A2q = str2;
                    A01.A1K = imageInfo;
                    A01.A2l = str3;
                    A01.A37 = z;
                    A01.A3V = z2;
                    int i = 2;
                    if ("story_camera_reply".equals(str2)) {
                        i = 0;
                    }
                    A01.A03 = i;
                    A01.A3H = true;
                    A01.A47 = true;
                    boolean z3 = c214849fM.A0I;
                    if (z3) {
                        num = C05F.A01;
                    } else {
                        num = C05F.A0N;
                    }
                    A01.A28 = num;
                    A01.A17 = new C81L(2131960569, 2131960569, false, true, false, false);
                    A01.A0V = A00;
                    A01.A3Q = true;
                    A01.A3n = c214849fM.A0H;
                    A01.A3C = c214849fM.A0F;
                    A01.A3x = c214849fM.A0J;
                    A01.A3G = z3;
                    A01.A3D = z3;
                    A01.A3t = z3;
                    A01.A3s = z3;
                    A01.A3l = c214849fM.A0K;
                    if (AbstractC166997dE.A0c(C06090Tz.A05, c214849fM.A03, 36325033798283934L).booleanValue()) {
                        A01.A2P = c214849fM.A0A;
                    }
                    if (equals) {
                        C1816283r A012 = C37855Gl9.A01(c214849fM.A03, EnumC189548aZ.A06, c214849fM.A07.A01);
                        if (A012 != null) {
                            String str4 = c214849fM.A0C;
                            boolean z4 = c214849fM.A0E;
                            C38321qM c38321qM = A012.A04;
                            ImageInfo A1t = c38321qM.A1t();
                            String A38 = c38321qM.A38();
                            A01.A2q = str4;
                            A01.A1K = A1t;
                            A01.A2l = A38;
                            A01.A37 = z4;
                            A01.A3V = false;
                            A01.A18 = A012;
                            RectF rectF3 = c214849fM.A01;
                            A01.A06 = null;
                            A01.A07 = rectF3;
                            A01.A3r = false;
                            A01.A3v = true;
                            A01.A33 = false;
                            A01.A04 = 0L;
                            A01.A03 = 4;
                            A01.A3i = true;
                            A01.A26 = 1;
                        }
                    } else if (equals2) {
                        RectF rectF4 = c214849fM.A01;
                        A01.A06 = null;
                        A01.A07 = rectF4;
                        A01.A3r = false;
                        A01.A3v = true;
                        A01.A33 = false;
                        A01.A04 = 0L;
                        A01.A44 = false;
                        A01.A03 = 5;
                        A01.A3i = true;
                        A01.A26 = 1;
                        A01.A3t = false;
                        A01.A3s = false;
                        A01.A28 = C05F.A0C;
                    }
                    C81Y c81y = new C81Y(A01);
                    c214849fM.A05 = c81y;
                    if (c214849fM.isResumed()) {
                        c81y.A01();
                    }
                }
            }
        };
        C57982lB.A0B.A05(requireActivity(), runnable);
    }
}
