package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.camera.mpfacade.touch.TouchEventForwardingView;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8HI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HI implements InterfaceC11380iw, C8HJ, InterfaceC1821886c, InterfaceC60022ok, C8HK, C8HL, InterfaceC1810781j, AnonymousClass851, C85H {
    public static final C55942hf A1q = C55942hf.A04(40.0d, 7.0d);
    public static final String __redex_internal_original_name = "IgCameraViewController";
    public float A00;
    public long A01;
    public C4PX A03;
    public InterfaceC25160BBf A04;
    public C54845OMq A05;
    public C174757qB A06;
    public C8IA A07;
    public AbstractC184988In A08;
    public C8XV A0B;
    public C208769Lk A0C;
    public C9R2 A0D;
    public C8HB A0E;
    public C6WQ A0F;
    public Integer A0G;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public ColorDrawable A0N;
    public boolean A0O;
    public final Activity A0P;
    public final View A0R;
    public final View A0S;
    public final ViewGroup A0T;
    public final ViewGroup A0U;
    public final Fragment A0V;
    public final C07X A0W;
    public final C55982hj A0Y;
    public final C1815283f A0Z;
    public final TouchEventForwardingView A0a;
    public final TouchEventForwardingView A0b;
    public final C85E A0c;
    public final InterfaceC41501vz A0d;
    public final UserSession A0f;
    public final C1810981l A0g;
    public final C8IY A0h;
    public final C1828689h A0i;
    public final InterfaceC171997lU A0j;
    public final C184748Hp A0k;
    public final C8IE A0m;
    public final C184658Hg A0n;
    public final C184848Hz A0o;
    public final AnonymousClass835 A0p;
    public final AnonymousClass835 A0q;
    public final AnonymousClass835 A0r;
    public final AnonymousClass835 A0s;
    public final AnonymousClass835 A0t;
    public final C184328Fw A0u;
    public final C1821786b A0v;
    public final AnonymousClass840 A0w;
    public final C83C A0x;
    public final CameraPreCaptureUtilityMenu A0y;
    public final C8GG A0z;
    public final C1813582n A10;
    public final C184518Gr A11;
    public final C8HY A12;
    public final C8C0 A13;
    public final C8FG A14;
    public final C1824987o A15;
    public final C184628Hd A16;
    public final C1813982r A17;
    public final C8GE A18;
    public final C1814382v A19;
    public final C8GF A1A;
    public final C8HG A1B;
    public final InterfaceC1810081c A1C;
    public final C1828389e A1D;
    public final C89E A1E;
    public final AnonymousClass856 A1F;
    public final AnonymousClass825 A1G;
    public final ViewOnTouchListenerC1829389o A1H;
    public final ShutterButton A1I;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final boolean A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;
    public final boolean A1W;
    public final long A1X;
    public final View A1Y;
    public final ImageView A1Z;
    public final ConstraintLayout A1a;
    public final AnonymousClass845 A1c;
    public final C8IA A1d;
    public final C8IA A1e;
    public final C1GL A1f;
    public final C57012jc A1g;
    public final TargetViewSizeProvider A1h;
    public final C1820485o A1j;
    public final C8FE A1k;
    public final C8A0 A1l;
    public final C1814582x A1m;
    public final C1821585z A1n;
    public final boolean A1o;
    public final boolean A1p;
    public final Runnable A1K = new Runnable() { // from class: X.8HM
        @Override // java.lang.Runnable
        public final void run() {
            C8HI.A07(C8HI.this);
        }
    };
    public C8HN A0A = null;
    public final Runnable A1J = new C8HO(this);
    public final InterfaceC1814282u A0X = new InterfaceC1814282u() { // from class: X.8HP
        @Override // X.InterfaceC1814282u
        public final void DEf(Exception exc) {
            C8HI c8hi = C8HI.this;
            if (c8hi.A0I) {
                AbstractC189688an.A03(c8hi.A0f, "first_frame_rendered", false);
                InterfaceC171997lU interfaceC171997lU = c8hi.A0j;
                if (interfaceC171997lU != null) {
                    interfaceC171997lU.D1U();
                }
                if (exc != null) {
                    AbstractC12120kG.A01("Camera initialization failure", AbstractC174697q4.A03(exc));
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0348, code lost:
        
            if (r15.A0S() == false) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1, types: [android.widget.FrameLayout, android.view.View, android.view.ViewGroup, X.9Tc] */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, X.7ut] */
        @Override // X.InterfaceC1814282u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void DM7(X.C177447ue r19) {
            /*
                Method dump skipped, instructions count: 859
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C8HP.DM7(X.7ue):void");
        }
    };
    public final InterfaceC1814282u A1b = new InterfaceC1814282u() { // from class: X.8HQ
        @Override // X.InterfaceC1814282u
        public final void DEf(Exception exc) {
            AbstractC12120kG.A01("Camera initialization failure", AbstractC174697q4.A03(exc));
        }

        @Override // X.InterfaceC1814282u
        public final void DM7(C177447ue c177447ue) {
            C8HI c8hi = C8HI.this;
            C8HI.A03((C176877tj) c177447ue.A03.A02(AbstractC176797tb.A0y), c8hi);
            c8hi.A0m.A06(c177447ue);
        }
    };
    public final C8HR A0l = new C8HR(this);
    public final C8HS A1i = new C8HS(this);
    public final InterfaceC12870lZ A0e = new InterfaceC12870lZ() { // from class: X.8HU
        @Override // X.InterfaceC12870lZ
        public final void onAppBackgrounded() {
            int A03 = C0f9.A03(1991556794);
            C8HI c8hi = C8HI.this;
            c8hi.A0Q.removeCallbacks(c8hi.A1J);
            c8hi.A1L.set(false);
            C218914p.A06(c8hi.A0e);
            C0f9.A0A(724000895, A03);
        }

        @Override // X.InterfaceC12870lZ
        public final void onAppForegrounded() {
            C0f9.A0A(-1197318343, C0f9.A03(-1889910526));
        }
    };
    public final Handler A0Q = new Handler(Looper.getMainLooper());
    public final AtomicBoolean A1L = new AtomicBoolean(false);
    public TextView A02 = null;
    public C8HV A09 = null;
    public String A0H = "not_initialized";
    public boolean A0M = false;

    public final Integer A0N() {
        try {
            C174757qB c174757qB = this.A06;
            if (c174757qB == null || !c174757qB.CWZ()) {
                return null;
            }
            return Integer.valueOf(this.A06.A07());
        } catch (C6M2 unused) {
            return null;
        }
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        C8JL c8jl;
        C8JN c8jn;
        C8JL c8jl2;
        C8JN c8jn2;
        C184658Hg c184658Hg;
        Integer A05;
        double d = f;
        this.A00 = (float) Math.min(Math.max(d, 0.0d), 1.0d);
        if (f2 >= 0.0f) {
            if (f > 0.0f || this.A0N != null) {
                A0C(this, (int) AbstractC70163Da.A04(d, 0.0d, 1.0d, 0.0d, 255.0d));
            }
            float f3 = this.A00;
            if (f3 > 0.5f) {
                if (!this.A0O && (A05 = (c184658Hg = this.A0n).A05()) != null && A05.intValue() == 3) {
                    c184658Hg.A09(0);
                    this.A0O = true;
                }
                InterfaceC25209BDh interfaceC25209BDh = this.A0B.A0I.A01;
                C8JL c8jl3 = null;
                if (interfaceC25209BDh != null) {
                    c8jl2 = interfaceC25209BDh.BNn();
                } else {
                    c8jl2 = null;
                }
                if (c8jl2 instanceof C8JN) {
                    if (interfaceC25209BDh != null) {
                        c8jl3 = interfaceC25209BDh.BNn();
                    }
                    if ((c8jl3 instanceof C8JN) && (c8jn2 = (C8JN) c8jl3) != null && !c8jn2.A04) {
                        c8jn2.A04 = true;
                        AbstractC55106ObM A00 = C8JN.A00(c8jn2);
                        if (A00 != null) {
                            A00.A0D(true);
                        }
                        c8jn2.A05 = true;
                        AbstractC55106ObM A002 = C8JN.A00(c8jn2);
                        if (A002 != null && A002.A0J()) {
                            A002.A02();
                            c8jn2.DYJ();
                        }
                    }
                }
            } else if (f3 == 0.0f) {
                if (this.A0O) {
                    this.A0n.A09(3);
                    this.A0O = false;
                }
                InterfaceC25209BDh interfaceC25209BDh2 = this.A0B.A0I.A01;
                C8JL c8jl4 = null;
                if (interfaceC25209BDh2 != null) {
                    c8jl = interfaceC25209BDh2.BNn();
                } else {
                    c8jl = null;
                }
                if (c8jl instanceof C8JN) {
                    if (interfaceC25209BDh2 != null) {
                        c8jl4 = interfaceC25209BDh2.BNn();
                    }
                    if ((c8jl4 instanceof C8JN) && (c8jn = (C8JN) c8jl4) != null && c8jn.A04) {
                        if (c8jn.A05) {
                            AbstractC55106ObM A003 = C8JN.A00(c8jn);
                            if (A003 != null) {
                                A003.A0D(false);
                            }
                            c8jn.A05 = false;
                        }
                        c8jn.A04 = false;
                    }
                }
            }
            if (this.A1C.AuH() == EnumC1810381f.A03) {
                A07(this);
                C4PX c4px = this.A03;
                if (this.A00 == 0.0f && c4px != null) {
                    A0R(c4px);
                }
            }
        }
    }

    @Override // X.InterfaceC1821886c
    public final void onResume() {
        if (this.A1C.AuH() == EnumC1810381f.A03) {
            A0E(this, false);
        }
    }

    public static C208769Lk A00(C8HI c8hi) {
        C208769Lk c208769Lk = c8hi.A0C;
        if (c208769Lk == null) {
            C174757qB c174757qB = c8hi.A06;
            if (c174757qB != null && c174757qB.CWZ()) {
                UserSession userSession = c8hi.A0f;
                Activity activity = c8hi.A0P;
                String moduleName = c8hi.getModuleName();
                InterfaceC1810081c interfaceC1810081c = c8hi.A1C;
                C174757qB c174757qB2 = c8hi.A06;
                c174757qB2.getClass();
                C1815383g A00 = c8hi.A0Z.A00();
                C8C0 c8c0 = c8hi.A13;
                C1810981l c1810981l = c8hi.A0g;
                C1GL c1gl = c8hi.A1f;
                ViewGroup viewGroup = c8hi.A0T;
                TouchEventForwardingView touchEventForwardingView = c8hi.A0a;
                ShutterButton shutterButton = c8hi.A1I;
                AnonymousClass825 anonymousClass825 = c8hi.A1G;
                TargetViewSizeProvider targetViewSizeProvider = c8hi.A1h;
                C208769Lk c208769Lk2 = new C208769Lk(activity, viewGroup, c8hi.A0V, c174757qB2, A00, touchEventForwardingView, userSession, c1gl, c8hi.A1g, c1810981l, targetViewSizeProvider, c8hi, c8c0, interfaceC1810081c, anonymousClass825, shutterButton, moduleName);
                c8hi.A0C = c208769Lk2;
                return c208769Lk2;
            }
            return null;
        }
        return c208769Lk;
    }

    public static C9R2 A01(final C8HI c8hi) {
        C9R2 c9r2 = c8hi.A0D;
        if (c9r2 == null) {
            C174757qB c174757qB = c8hi.A06;
            if (c174757qB != null && c174757qB.CWZ()) {
                Activity activity = c8hi.A0P;
                UserSession userSession = c8hi.A0f;
                C174757qB c174757qB2 = c8hi.A06;
                InterfaceC1810081c interfaceC1810081c = c8hi.A1C;
                C9R2 c9r22 = new C9R2(activity, c8hi.A0T, c174757qB2, userSession, c8hi.A1h, interfaceC1810081c, new Runnable() { // from class: X.9R1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8HI.A09(C8HI.this);
                    }
                }, new InterfaceC16620sF() { // from class: X.9R0
                    @Override // X.InterfaceC16620sF
                    public final Object invoke(Object obj, Object obj2) {
                        return Boolean.valueOf(C8HI.this.A0Z((Runnable) obj, (Runnable) obj2));
                    }
                });
                c8hi.A0D = c9r22;
                return c9r22;
            }
            return null;
        }
        return c9r2;
    }

    public static Boolean A02(C8HI c8hi) {
        boolean z;
        UserSession userSession = c8hi.A0f;
        if (C4AC.A0D(userSession) || (c8hi.A1Q && C18U.A06(C06090Tz.A05, userSession, 36321722382362390L))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static void A03(C176877tj c176877tj, C8HI c8hi) {
        if (c176877tj == null) {
            C0f5 AEp = C18950wb.A01.AEp(__redex_internal_original_name, 817900894);
            AEp.ABW(DialogModule.KEY_MESSAGE, "mCameraVideoSize is null");
            AEp.ERI(new Exception());
            AEp.report();
            return;
        }
        AnonymousClass825 anonymousClass825 = c8hi.A1G;
        String A0B = new Gson().A0B(C75I.A01(anonymousClass825.A06, c176877tj.A02, c176877tj.A01));
        C14360o3.A07(A0B);
        InterfaceC19610xo ARD = anonymousClass825.A07.ARD();
        ARD.E7K("KEY_CAMERA_SPEC", A0B);
        ARD.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (A0K(r12) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
    
        if (r3 != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(com.instagram.creation.cameraconfiguration.CameraConfiguration r11, X.C8HI r12) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A04(com.instagram.creation.cameraconfiguration.CameraConfiguration, X.8HI):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (A02(r4).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A05(X.C55U r5, java.util.Set r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C81V
            if (r0 != 0) goto L4f
            X.81W r0 = X.C81W.A0M
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L4f
            boolean r0 = A0J(r4)
            if (r0 != 0) goto L4f
            X.81q r0 = X.C1811481q.A00
            if (r5 != r0) goto L43
            com.instagram.common.session.UserSession r3 = r4.A0f
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320468248371733(0x81094600052215, double:3.03254859883246E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L38
            boolean r0 = r4.A1Q
            if (r0 == 0) goto L43
            r0 = 36321722382427927(0x810a6a003c2717, double:3.0333417182595893E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L43
        L38:
            java.lang.Boolean r0 = A02(r4)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 == 0) goto L44
        L43:
            r0 = 0
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L50
        L4f:
            r1 = 1
        L50:
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r4.A1I
            r0.setHandsFreeRecordingEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A05(X.55U, java.util.Set):void");
    }

    public static void A06(C8HI c8hi) {
        String str;
        String str2;
        C131425wZ c131425wZ;
        String str3;
        C54845OMq c54845OMq;
        Bitmap bitmap;
        float f;
        float f2;
        boolean z;
        int i;
        int i2;
        InterfaceC171187kA A00;
        View view;
        View view2;
        CameraAREffect cameraAREffect = c8hi.A0Z.A00().A05.A09;
        C1810981l c1810981l = c8hi.A0g;
        C1811981v c1811981v = c1810981l.A08;
        c8hi.A05((C55U) c1811981v.A00, (java.util.Set) c1810981l.A09.A00);
        EnumC114925Hg enumC114925Hg = ((C55U) c1811981v.A00).A00;
        UserSession userSession = c8hi.A0f;
        C22C A01 = AnonymousClass229.A01(userSession);
        AnonymousClass249 anonymousClass249 = AnonymousClass249.PHOTO;
        EnumC50631MWs A08 = AbstractC50677MYv.A08(c1810981l.A0A(), true);
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
            str2 = cameraAREffect.A0M;
        } else {
            str = null;
            str2 = null;
        }
        A01.A0y(enumC114925Hg, anonymousClass249, A08, str, str2);
        C82K c82k = c8hi.A0u.A00;
        if (((InterfaceC184358Fz) c82k.A00()).CdL()) {
            InterfaceC1810081c interfaceC1810081c = c8hi.A1C;
            if (!interfaceC1810081c.CRB(EnumC1810181d.A18)) {
                Object obj = c1811981v.A00;
                C81R c81r = C81R.A00;
                if (obj == c81r) {
                    C8HC.A03(C24002Akg.A00, (C8HC) c8hi.A0E.A0F.getValue());
                } else {
                    C1821786b c1821786b = c8hi.A0v;
                    c1821786b.A0B = true;
                    C1821786b.A06(c1821786b);
                }
                AnonymousClass835 anonymousClass835 = c8hi.A0p;
                anonymousClass835.setEnabled(false);
                if (!c1810981l.A0S() && AbstractC27671Vv.A00 != null && C3ER.A00().A02(c8hi.A0P, userSession)) {
                    c8hi.A0m.A05();
                    c8hi.A1I.A04(CancelReason.SYSTEM_CANCELLED, "Single Tap in Video Call");
                    return;
                }
                if (c1811981v.A00 == c81r) {
                    C8HB c8hb = c8hi.A0E;
                    UserSession userSession2 = c8hb.A04;
                    if (AbstractC70453Ee.A00(userSession2).booleanValue() && C18U.A06(C06090Tz.A05, userSession2, 2342168493984199789L)) {
                        Bitmap A0M = c8hi.A0M();
                        if (A0M != null) {
                            c8hb.A01(A0M);
                        } else {
                            C198058pG c198058pG = new C198058pG(c8hi);
                            C174757qB c174757qB = c8hi.A06;
                            if (c174757qB != null) {
                                view = c174757qB.A0H.A00();
                            } else {
                                view = c8hi.A0T;
                            }
                            int width = view.getWidth();
                            C174757qB c174757qB2 = c8hi.A06;
                            if (c174757qB2 != null) {
                                view2 = c174757qB2.A0H.A00();
                            } else {
                                view2 = c8hi.A0T;
                            }
                            int height = view2.getHeight();
                            C174757qB c174757qB3 = c8hi.A06;
                            if (c174757qB3 != null) {
                                c174757qB3.A0K(c198058pG, width, height);
                            }
                        }
                        if (!c1810981l.A0W(C81W.A0p) || c1811981v.A00 == c81r) {
                            C2UY.A01.A03();
                        }
                        c8hi.A1F.A00().A00();
                        return;
                    }
                }
                if (c1811981v.A00 == C81S.A00) {
                    AbstractC183338Bg.A00(userSession).A0G("live_tapped");
                    C172047lZ c172047lZ = c8hi.A0B.A0J;
                    if (c172047lZ != null && (A00 = c172047lZ.A00()) != null) {
                        A00.DLG();
                    }
                } else {
                    if (c1810981l.A0W(C81W.A0B)) {
                        c8hi.A08.A0A = true;
                        ShutterButton shutterButton = c8hi.A1I;
                        shutterButton.setEnabled(false);
                        c131425wZ = shutterButton.A0i;
                        str3 = "start_boomerang_recording";
                    } else {
                        boolean z2 = c8hi.A1U;
                        if ((!z2 || A02(c8hi).booleanValue()) && !c1810981l.A0W(C81W.A0M)) {
                            EnumC1810181d enumC1810181d = EnumC1810181d.A1O;
                            if (interfaceC1810081c.CRB(enumC1810181d)) {
                                AbstractC183338Bg.A00(userSession).A0G("video_layout_complete");
                                C208769Lk A002 = A00(c8hi);
                                CameraSpec A003 = c8hi.A1G.A00();
                                if (A002 != null) {
                                    int i3 = A003.A03;
                                    int i4 = A003.A02;
                                    ArrayList arrayList = new ArrayList();
                                    LinkedList linkedList = A002.A0M.A08;
                                    int size = linkedList.size();
                                    for (int i5 = 0; i5 < size; i5++) {
                                        AAF aaf = (AAF) linkedList.get(i5);
                                        C22918A8o A04 = A002.A0P.A04(A002.A01, i5);
                                        C195868lW c195868lW = aaf.A05;
                                        if (c195868lW != null) {
                                            c195868lW.A02().A03 = aaf.A07;
                                        }
                                        C195868lW c195868lW2 = aaf.A05;
                                        if (c195868lW2 != null) {
                                            C195868lW c195868lW3 = aaf.A05;
                                            C22918A8o c22918A8o = aaf.A04;
                                            float f3 = c22918A8o.A03;
                                            float f4 = A002.A06;
                                            float f5 = i3;
                                            float f6 = (f3 / f4) * f5;
                                            float f7 = c22918A8o.A00;
                                            float f8 = A002.A05;
                                            float f9 = i4;
                                            float f10 = (f7 / f8) * f9;
                                            float f11 = (c22918A8o.A01 / f4) * f5;
                                            float f12 = (c22918A8o.A02 / f8) * f9;
                                            float f13 = 0.0f;
                                            float f14 = 1.0f;
                                            if (c195868lW3 != null) {
                                                int i6 = c195868lW3.A09;
                                                if (i6 != 90 && i6 != 270) {
                                                    z = false;
                                                    i = c195868lW3.A0K;
                                                } else {
                                                    z = true;
                                                    i = c195868lW3.A08;
                                                }
                                                float f15 = i;
                                                if (z) {
                                                    i2 = c195868lW3.A0K;
                                                } else {
                                                    i2 = c195868lW3.A08;
                                                }
                                                float f16 = i2;
                                                if (C208769Lk.A0J(A002)) {
                                                    EnumC172837mv enumC172837mv = A002.A01;
                                                    int i7 = enumC172837mv.A00;
                                                    int i8 = enumC172837mv.A03 / i7;
                                                    float f17 = i7 * f6;
                                                    float f18 = i8;
                                                    if (f15 / f16 > (f17 / f10) / f18) {
                                                        float f19 = (f18 * f10) / f16;
                                                        float f20 = f15 * f19;
                                                        f13 = (0.5f - ((f17 / 2.0f) / f20)) + (f11 / f20);
                                                        float f21 = f19 * f16;
                                                        f = f12 / f21;
                                                        f2 = (f10 / f21) + f;
                                                        f14 = (f6 / f20) + f13;
                                                    } else {
                                                        float f22 = f17 / f15;
                                                        float f23 = f16 * f22;
                                                        f = (f12 / f23) + (0.5f - (((f18 * f10) / 2.0f) / f23));
                                                        f2 = (f10 / f23) + f;
                                                        float f24 = f22 * f15;
                                                        float f25 = f11 / f24;
                                                        f14 = f25 + (f6 / f24);
                                                        f13 = f25;
                                                    }
                                                } else if (f15 / f16 > f6 / f10) {
                                                    float f26 = 0.5f - ((f6 / 2.0f) / ((f10 / f16) * f15));
                                                    f14 = 1.0f - f26;
                                                    f13 = f26;
                                                } else {
                                                    float f27 = 0.5f - ((f10 / 2.0f) / ((f6 / f15) * f16));
                                                    f2 = 1.0f - f27;
                                                    f = f27;
                                                }
                                                RectF rectF = new RectF(f13, f, f14, f2);
                                                float f28 = A04.A01 / f4;
                                                float f29 = A04.A02 / f8;
                                                arrayList.add(new C69168Vix(rectF, new RectF(f28, f29, (A04.A03 / f4) + f28, (A04.A00 / f8) + f29), c195868lW2));
                                            }
                                            f = 0.0f;
                                            f2 = 1.0f;
                                            RectF rectF2 = new RectF(f13, f, f14, f2);
                                            float f282 = A04.A01 / f4;
                                            float f292 = A04.A02 / f8;
                                            arrayList.add(new C69168Vix(rectF2, new RectF(f282, f292, (A04.A03 / f4) + f282, (A04.A00 / f8) + f292), c195868lW2));
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    }
                                    A002.A0Q.A05.Egh(arrayList);
                                }
                            } else {
                                Object obj2 = c1811981v.A00;
                                if (((obj2 instanceof C81U) || (obj2 instanceof C1811181n)) && !interfaceC1810081c.CRB(enumC1810181d)) {
                                    if (A00(c8hi) != null) {
                                        ShutterButton shutterButton2 = c8hi.A1I;
                                        shutterButton2.A07 = A00(c8hi).A01.A03;
                                        shutterButton2.A06 = A00(c8hi).A0M.getItemCount();
                                    }
                                    c131425wZ = c8hi.A1I.A0i;
                                    str3 = "start_clips_recording";
                                } else if (c1810981l.A0W(C81W.A0C)) {
                                    AbstractC183338Bg.A00(userSession).A0G("text_mode_next_tapped");
                                    C8XV c8xv = c8hi.A0B;
                                    AbstractC197108nf.A00(c8xv.A0L);
                                    c8xv.A0E.A04();
                                } else if (c1810981l.A0W(C81W.A0T)) {
                                    C208769Lk A004 = A00(c8hi);
                                    A004.getClass();
                                    AbstractC183338Bg.A00(userSession).A0G("layout_tap");
                                    C66017TyF c66017TyF = A004.A0M;
                                    if (c66017TyF.getItemCount() == 0) {
                                        A004.A0R.E4u(new Object());
                                    }
                                    InterfaceC1810081c interfaceC1810081c2 = A004.A0R;
                                    if (interfaceC1810081c2.CRB(EnumC1810181d.A0g)) {
                                        C66486UJo c66486UJo = c66017TyF.A00;
                                        if (c66486UJo != null) {
                                            c66486UJo.A03();
                                            c66017TyF.A00 = null;
                                        }
                                        MultiTouchRecyclerView multiTouchRecyclerView = A004.A0N;
                                        Bitmap createBitmap = Bitmap.createBitmap(multiTouchRecyclerView.getWidth(), multiTouchRecyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                                        C14360o3.A07(createBitmap);
                                        multiTouchRecyclerView.draw(new Canvas(createBitmap));
                                        ArrayList arrayList2 = new ArrayList();
                                        ImmutableList.Builder builder = ImmutableList.builder();
                                        String str4 = null;
                                        while (true) {
                                            String str5 = str4;
                                            for (Object obj3 : c66017TyF.A08) {
                                                C14360o3.A07(obj3);
                                                AAF aaf2 = (AAF) obj3;
                                                C3AY c3ay = aaf2.A03;
                                                Object obj4 = c3ay.A00;
                                                if (obj4 != null) {
                                                    int intValue = ((Number) obj4).intValue();
                                                    UserSession userSession3 = A004.A0H;
                                                    arrayList2.add(C6Q1.A00(userSession3, intValue));
                                                    Object obj5 = c3ay.A01;
                                                    if (obj5 != null) {
                                                        builder.add((Object) ((CameraAREffect) obj5).A0K);
                                                    }
                                                    str4 = aaf2.A07;
                                                    if (str4 == null || (str5 != null && AbstractC178007vZ.A01(userSession3, str5, C16930sl.A00) == null)) {
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            }
                                            boolean contains = arrayList2.contains("3");
                                            A004.A0I.schedule(new C196808nA(A004.A08, createBitmap, null, null, null, null, null, null, builder.build(), null, new MediaUploadMetadata(null, str5, null, null, null, null, null, null, null, null, null, false), A004.A0H, A004.A0K, A004, null, null, null, null, null, null, null, null, null, null, null, "unknown", "layout", null, A004.A01.A05, arrayList2, null, null, contains ? 1 : 0, true, false, false));
                                            InterfaceC09390do interfaceC09390do = A004.A0Y;
                                            if (!((Dialog) interfaceC09390do.getValue()).isShowing()) {
                                                C0fJ.A00((Dialog) interfaceC09390do.getValue());
                                            }
                                            C208769Lk.A09(A004);
                                        }
                                    } else if (interfaceC1810081c2.CRB(EnumC1810181d.A0f)) {
                                        C210089Qx c210089Qx = A004.A0P;
                                        EnumC172837mv enumC172837mv2 = A004.A01;
                                        C14360o3.A0B(enumC172837mv2, 0);
                                        List list = (List) c210089Qx.A02.get(enumC172837mv2);
                                        if (list != null && c66017TyF.getItemCount() < list.size()) {
                                            C22918A8o A012 = C208769Lk.A01(A004);
                                            C174757qB c174757qB4 = A004.A0E;
                                            C174747qA c174747qA = c174757qB4.A0H;
                                            boolean z3 = false;
                                            if (c174747qA.A00 != null) {
                                                z3 = true;
                                            }
                                            double d = A012.A03;
                                            double d2 = A004.A04;
                                            double d3 = d / d2;
                                            if (z3) {
                                                c174757qB4.A0K(new C198018pC(A004), (int) d3, (int) (A012.A00 / d2));
                                            } else {
                                                int i9 = (int) d3;
                                                int i10 = (int) (A012.A00 / d2);
                                                TextureView textureView = c174747qA.A01;
                                                if (textureView != null) {
                                                    bitmap = textureView.getBitmap(i9, i10);
                                                } else {
                                                    bitmap = null;
                                                }
                                                C208769Lk.A03(bitmap, A004, null);
                                            }
                                        }
                                    }
                                    anonymousClass835.setEnabled(true);
                                } else {
                                    if (c1810981l.A0W(C81W.A0w)) {
                                        AbstractC183338Bg.A00(userSession).A0G("stop_motion_take_photo");
                                        View view3 = c8hi.A0n.A0A;
                                        view3.setVisibility(0);
                                        view3.animate().cancel();
                                        view3.setAlpha(0.25f);
                                        view3.animate().alpha(0.0f).setDuration(71L).start();
                                    } else if (A0J(c8hi)) {
                                        c8hi.A16.A03 = true;
                                        c131425wZ = c8hi.A1I.A0i;
                                        str3 = "start_effect_handsfree_recording";
                                    } else {
                                        AbstractC183338Bg.A00(userSession).A0G("normal_take_photo");
                                        if (A0K(c8hi) && (c1811981v.A00 instanceof C208509Kk) && (c54845OMq = c8hi.A05) != null) {
                                            c54845OMq.A05(EnumC223469td.A07);
                                        }
                                    }
                                    A09(c8hi);
                                }
                            }
                        } else {
                            if (z2 && !C1H6.A03()) {
                                ShutterButton shutterButton3 = c8hi.A1I;
                                Context context = AbstractC12290kX.A00;
                                shutterButton3.setShutterButtonSingularColor(context.getColor(AbstractC53242c7.A04(context)));
                            }
                            c8hi.A16.A03 = true;
                            c8hi.A1I.A0i.A01("start_handsfree_recording");
                            if (z2) {
                                C14360o3.A0B(userSession, 0);
                                C06090Tz c06090Tz = C06090Tz.A05;
                                if ((C18U.A06(c06090Tz, userSession, 36320468248371733L) || (c8hi.A1Q && C18U.A06(c06090Tz, userSession, 36321722382427927L))) && !C4AC.A0D(userSession)) {
                                    c8hi.A1F.A00().A01(c8hi.A0T, c8hi.A1a, EnumC199188rL.A0Z);
                                }
                            }
                        }
                    }
                    c131425wZ.A01(str3);
                }
                if (!c1810981l.A0W(C81W.A0p)) {
                }
                C2UY.A01.A03();
                c8hi.A1F.A00().A00();
                return;
            }
        }
        ((InterfaceC184358Fz) c82k.A00()).DmE();
        AbstractC183338Bg.A00(userSession).A0G("tapped_when_disabled");
    }

    public static void A07(C8HI c8hi) {
        InterfaceC25160BBf interfaceC25160BBf;
        c8hi.A0Q.removeCallbacks(c8hi.A1K);
        C85E c85e = c8hi.A0c;
        if (c85e != null && !c8hi.A0L) {
            C174757qB c174757qB = c8hi.A06;
            if (c174757qB != null && (interfaceC25160BBf = c8hi.A04) != null) {
                c174757qB.EFz(interfaceC25160BBf);
                c8hi.A04 = null;
            }
            c85e.A01();
        }
    }

    public static void A08(C8HI c8hi) {
        c8hi.A0B.A03();
        AbstractC12120kG.A03(__redex_internal_original_name, "onBurstFramesCaptureFailure");
        C9GR.A0F(c8hi.A0P, "boomerang_capture_error", 2131953977);
        c8hi.A1C.E4u(new Object());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r1 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A09(X.C8HI r8) {
        /*
            X.81l r0 = r8.A0g
            X.81v r0 = r0.A08
            java.lang.Object r5 = r0.A00
            X.55U r5 = (X.C55U) r5
            com.instagram.common.session.UserSession r4 = r8.A0f
            X.22C r0 = X.AnonymousClass229.A01(r4)
            X.22M r0 = r0.A04
            java.lang.String r2 = r0.A0L
            X.22C r0 = X.AnonymousClass229.A01(r4)
            java.lang.String r1 = r0.A0R()
            r0 = 17642914(0x10d35a2, float:2.593609E-38)
            X.AbstractC189688an.A02(r4, r5, r2, r1, r0)
            X.8Hg r7 = r8.A0n
            boolean r3 = r7.A05
            X.7qB r0 = r8.A06
            r0.getClass()
            boolean r0 = r0.A0W()
            if (r0 != 0) goto L46
            if (r3 != 0) goto L46
            X.7qB r0 = r8.A06
            boolean r0 = r0.A0V()
            if (r0 == 0) goto La7
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322731696269757(0x810b55000729bd, double:3.033980012397343E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto La7
        L46:
            r1 = 1
        L47:
            boolean r0 = r5 instanceof X.C128535rM
            if (r0 == 0) goto L7d
            if (r1 != 0) goto L7f
            X.MYZ r6 = X.MX1.A01(r4)
            X.82n r0 = r8.A10
            X.81Z r0 = r0.A00
            X.22P r5 = r0.A01
            X.24Q r4 = r6.A0B
            r2 = 288434727(0x11312a27, float:1.3975827E-28)
            r0 = 5000(0x1388, double:2.4703E-320)
            long r2 = r4.A03(r2, r0)
            r6.A08 = r2
            if (r5 == 0) goto L6f
            java.lang.String r1 = r5.name()
            java.lang.String r0 = "entry_point"
            r4.A0A(r2, r0, r1)
        L6f:
            X.8Hp r1 = r8.A0k
            r1.getClass()
            X.Aqk r0 = new X.Aqk
            r0.<init>()
            r7.A0B(r0)
            return
        L7d:
            if (r1 == 0) goto L6f
        L7f:
            X.7qB r0 = r8.A06
            boolean r0 = r0.A0W()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            X.7qB r0 = r8.A06
            boolean r0 = r0.A0V()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "takePhoto() isTakingPhoto=%s mAwaitingFakeSelfieFlash=%s isRecordingVideo=%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "IgCameraViewController"
            A0F(r0, r1)
            return
        La7:
            r1 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A09(X.8HI):void");
    }

    public static void A0A(C8HI c8hi) {
        EnumC131445wb enumC131445wb;
        C184658Hg c184658Hg = c8hi.A0n;
        c184658Hg.A0G.A01(c184658Hg.A0A);
        C1813982r c1813982r = c8hi.A17;
        c1813982r.A03(c8hi.A0X);
        if (!A0K(c8hi)) {
            c8hi.A0s.setEnabled(true);
        }
        ShutterButton shutterButton = c8hi.A1I;
        shutterButton.setEnabled(true);
        c8hi.A0p.setEnabled(true);
        C174757qB c174757qB = c8hi.A06;
        if (c174757qB != null) {
            c174757qB.A0H.A00().setEnabled(true);
        }
        if (c8hi.A1O) {
            AnonymousClass835 anonymousClass835 = c8hi.A0r;
            anonymousClass835.getClass();
            anonymousClass835.setEnabled(true);
        }
        c8hi.A0q.setEnabled(true);
        C1810981l c1810981l = c8hi.A0g;
        C1811981v c1811981v = c1810981l.A08;
        Object obj = c1811981v.A00;
        C81S c81s = C81S.A00;
        boolean z = true;
        if (obj != c81s) {
            if (c1810981l.A0W(C81W.A0T, C81W.A0z)) {
                enumC131445wb = EnumC131445wb.A05;
            } else {
                enumC131445wb = EnumC131445wb.A04;
            }
            shutterButton.setMode(enumC131445wb);
        } else {
            c184658Hg.A08(0);
        }
        View view = c8hi.A1Y;
        ViewGroup viewGroup = c8hi.A0T;
        view.setLayoutParams(new FrameLayout.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        boolean z2 = true;
        if (c1810981l.A08().A02 || c1811981v.A00 == c81s || ((!((java.util.Set) c1810981l.A09.A00).isEmpty() && c1810981l.A0W(C81W.A0C, C81W.A0T, C81W.A0w)) || c8hi.A1N || c1811981v.A00 == C81R.A00)) {
            z2 = false;
        }
        shutterButton.setVideoRecordingEnabled(z2);
        if ((c8hi.A1U && !C4AC.A0D(c8hi.A0f)) || c8hi.A1p) {
            z = false;
        }
        shutterButton.setLongPressEnabled(z);
        c1813982r.A03(c8hi.A1b);
    }

    public static void A0B(C8HI c8hi, int i) {
        C174757qB c174757qB = c8hi.A06;
        c174757qB.getClass();
        c174757qB.A00 = i;
        Activity activity = c8hi.A0P;
        int i2 = 2131975065;
        if (i == 1) {
            i2 = 2131975049;
        }
        String string = activity.getString(i2);
        AnonymousClass834 anonymousClass834 = (AnonymousClass834) c8hi.A0s;
        C14360o3.A0B(string, 0);
        anonymousClass834.getView().setContentDescription(string);
    }

    public static void A0C(C8HI c8hi, int i) {
        C174757qB c174757qB = c8hi.A06;
        if (c174757qB != null) {
            View A00 = c174757qB.A0H.A00();
            if (A00.getWidth() > 0 && A00.getHeight() > 0) {
                ColorDrawable colorDrawable = c8hi.A0N;
                if (colorDrawable == null) {
                    colorDrawable = new ColorDrawable(c8hi.A0T.getContext().getColor(R.color.black));
                    c8hi.A0N = colorDrawable;
                }
                boolean z = true;
                boolean z2 = false;
                if (i > 0) {
                    z2 = true;
                }
                colorDrawable.setVisible(z2, false);
                ImageView imageView = c8hi.A1Z;
                int i2 = 4;
                if (z2) {
                    i2 = 0;
                }
                imageView.setVisibility(i2);
                if (i < 255) {
                    z = false;
                }
                imageView.setEnabled(z);
                imageView.setImageDrawable(c8hi.A0N);
                imageView.setImageAlpha(Math.min((int) AbstractC70163Da.A04(i, 0.0d, 127.5d, 0.0d, 255.0d), 255));
            }
        }
    }

    public static void A0D(C8HI c8hi, String str) {
        C14360o3.A0B(c8hi.A0f, 0);
        C006802i.A0p.markerDrop(android.R.bool.config_carDockEnablesAccelerometer);
        AbstractC189688an.A02.clear();
        AbstractC189688an.A01 = false;
        c8hi.A0I = false;
        c8hi.A0H = str;
        C1813982r c1813982r = c8hi.A17;
        C174757qB c174757qB = c1813982r.A02;
        if (c174757qB != null) {
            c174757qB.A03 = null;
        }
        C184938Ii c184938Ii = c1813982r.A04;
        if (c184938Ii != null) {
            C184528Gs c184528Gs = (C184528Gs) c184938Ii.A00.A1A.A00.A00();
            if (c184528Gs.A09 && c184528Gs.A08) {
                C177497uj c177497uj = c184528Gs.A06;
                if (c177497uj != null) {
                    InterfaceC184558Gw interfaceC184558Gw = c184528Gs.A0F;
                    C14360o3.A0B(interfaceC184558Gw, 0);
                    c177497uj.A00.A0G(interfaceC184558Gw);
                }
                RoundedCornerFrameLayout roundedCornerFrameLayout = c184528Gs.A0N;
                AbstractC125325le.A00(roundedCornerFrameLayout).A0G();
                roundedCornerFrameLayout.setVisibility(4);
                c184528Gs.A09 = false;
            }
        }
        c1813982r.A0H.A00();
        c1813982r.A0A = false;
        C8HR c8hr = c8hi.A0l;
        c8hr.A00 = false;
        C8HY c8hy = c8hr.A01.A12;
        if (c8hy.A00 != null || c8hy.A02 != null) {
            c8hy.DEu();
            InterfaceC203868zv interfaceC203868zv = c8hy.A00;
            if (interfaceC203868zv != null) {
                interfaceC203868zv.onTextEditComplete("");
            }
            c8hy.A00 = null;
            C8HY.A00(c8hy);
        }
        C174757qB c174757qB2 = c8hi.A06;
        if (c174757qB2 != null) {
            c174757qB2.A0C();
            C174757qB c174757qB3 = c8hi.A06;
            if (c174757qB3 != null) {
                c174757qB3.A0H.A00().setVisibility(8);
            }
            c174757qB2.A0G(c8hr);
            c174757qB2.A0I.A00 = null;
            A07(c8hi);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (X.AbstractC189418aK.A02(r1) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r3.A00 <= 0.0f) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r4.CcA() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bc, code lost:
    
        if (X.AbstractC23021Ah.A00(r0).A1v() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014c, code lost:
    
        if (((java.lang.Boolean) r3.A0y.CES(r3, X.C23031Ai.A8c[68])).booleanValue() != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(X.C8HI r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A0E(X.8HI, boolean):void");
    }

    public static void A0F(String str, String str2) {
        C0f5 AEp = C18950wb.A01.AEp(str, 817900894);
        AEp.ABW(DialogModule.KEY_MESSAGE, str2);
        AEp.report();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if (r1.A0W(X.C81W.A0T) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if ((r4 instanceof X.C81T) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0G(X.C55U r4, X.C8HI r5) {
        /*
            boolean r0 = r4 instanceof X.C128535rM
            r3 = 0
            if (r0 != 0) goto Le
            boolean r0 = r4 instanceof X.C208509Kk
            if (r0 != 0) goto Le
            boolean r0 = r4 instanceof X.C81T
            r2 = 0
            if (r0 == 0) goto Lf
        Le:
            r2 = 1
        Lf:
            X.81l r1 = r5.A0g
            X.81W r0 = X.C81W.A0M
            X.81W[] r0 = new X.C81W[]{r0}
            boolean r0 = r1.A0W(r0)
            if (r0 != 0) goto L36
            X.81W r0 = X.C81W.A0B
            X.81W[] r0 = new X.C81W[]{r0}
            boolean r0 = r1.A0W(r0)
            if (r0 != 0) goto L36
            X.81W r0 = X.C81W.A0T
            X.81W[] r0 = new X.C81W[]{r0}
            boolean r1 = r1.A0W(r0)
            r0 = 1
            if (r1 == 0) goto L37
        L36:
            r0 = 0
        L37:
            if (r2 == 0) goto L3c
            if (r0 == 0) goto L3c
            r3 = 1
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A0G(X.55U, X.8HI):boolean");
    }

    public static boolean A0H(C8HI c8hi) {
        C8FG c8fg = c8hi.A14;
        if (c8fg != null && c8fg.A0D() != null && c8fg.A0D().A04 == C88Z.A04) {
            return true;
        }
        return false;
    }

    public static boolean A0I(final C8HI c8hi) {
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o;
        if (!c8hi.A0M) {
            return false;
        }
        C174757qB c174757qB = c8hi.A06;
        if (c174757qB != null && c174757qB.CWZ() && ((viewOnTouchListenerC1829389o = c8hi.A0B.A0N) == null || viewOnTouchListenerC1829389o.A0f)) {
            return true;
        }
        Activity activity = c8hi.A0P;
        if (activity != null) {
            UserSession userSession = c8hi.A0f;
            if (AbstractC195888lY.A01(activity.getApplicationContext(), userSession)) {
                C37101o8.A00(AbstractC195888lY.A00()).A00(activity.getApplicationContext(), userSession, new InterfaceC57997Pnh() { // from class: X.Aly
                    @Override // X.InterfaceC57997Pnh
                    public final void Dd6(C54845OMq c54845OMq) {
                        C8HI.this.A05 = c54845OMq;
                    }
                }, __redex_internal_original_name);
            }
        }
        C54845OMq c54845OMq = c8hi.A05;
        if (c54845OMq == null || !c54845OMq.A0B.isStreaming()) {
            return false;
        }
        return true;
    }

    public static boolean A0J(C8HI c8hi) {
        CameraAREffect cameraAREffect = c8hi.A0Z.A00().A05.A09;
        if (cameraAREffect != null && cameraAREffect.A0i) {
            return true;
        }
        return false;
    }

    public static boolean A0K(C8HI c8hi) {
        C190298bn A01 = C190298bn.A03.A01(c8hi.A0f);
        if (A01 != null && A01.A00().A0J()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r1.contains(r3, r2) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0L(X.C8HI r6, float r7, float r8, float r9, float r10) {
        /*
            X.7qB r0 = r6.A06
            r5 = 0
            if (r0 == 0) goto L4f
            boolean r0 = r0.CWZ()
            if (r0 == 0) goto L4f
            boolean r0 = r6.A0K
            if (r0 != 0) goto L4f
            X.81c r1 = r6.A1C
            X.81d r0 = X.EnumC1810181d.A0f
            boolean r0 = r1.CRB(r0)
            if (r0 == 0) goto L31
            int r3 = (int) r7
            int r2 = (int) r8
            X.9Lk r0 = r6.A0C
            if (r0 == 0) goto L4f
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.7qB r0 = r0.A0E
            android.view.View r0 = r0.A0F
            r0.getHitRect(r1)
            boolean r0 = r1.contains(r3, r2)
            if (r0 == 0) goto L4f
        L31:
            X.83C r0 = r6.A0x
            if (r0 == 0) goto L3d
            X.8Z9 r1 = r0.A00()
            r0 = 1
            r1.A04(r0)
        L3d:
            boolean r0 = r6.A0W()
            if (r0 == 0) goto L50
            X.8GE r0 = r6.A18
            X.8ay r0 = r0.A00()
            boolean r0 = r0.CZS()
            if (r0 == 0) goto L50
        L4f:
            return r5
        L50:
            X.83f r0 = r6.A0Z
            X.83g r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r1 = r0.A09
            if (r1 == 0) goto L66
            java.lang.String r0 = r1.A0A
            if (r0 == 0) goto L66
            java.lang.Integer r1 = r1.A09
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L4f
        L66:
            X.7qB r0 = r6.A06
            com.instagram.camera.capture.IgCameraFocusView r4 = r0.A05
            if (r4 == 0) goto L4f
            r3 = 1
            r4.A01 = r3
            android.graphics.PointF r0 = r4.A03
            r0.set(r9, r10)
            X.2hj r2 = r4.A04
            r0 = 0
            r2.A08(r0, r3)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A06(r0)
            r4.invalidate()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A0L(X.8HI, float, float, float, float):boolean");
    }

    public final Bitmap A0M() {
        this.A0n.A09(0);
        C174757qB c174757qB = this.A06;
        if (c174757qB != null) {
            C178577wV c178577wV = c174757qB.A0G;
            if (c178577wV.A08()) {
                C179717yL c179717yL = (C179717yL) ((InterfaceC179727yM) c178577wV.A01(InterfaceC179727yM.A00));
                InterfaceC178407wE interfaceC178407wE = c179717yL.A00;
                AbstractC196588mo.A00(interfaceC178407wE, C05F.A01, "BasicPhotoCaptureCoordinator", c179717yL.hashCode());
                C175007qa c175007qa = c179717yL.A04;
                if (c175007qa != null) {
                    Bitmap Bfm = c175007qa.A0O.Bfm();
                    AbstractC196788n8.A01(interfaceC178407wE, "BasicPhotoCaptureCoordinator", c179717yL.hashCode());
                    return Bfm;
                }
                AbstractC196788n8.A00(new AbstractC223559ty(10000, "CameraViewController is released"), interfaceC178407wE, "BasicPhotoCaptureCoordinator", "high", c179717yL.hashCode());
                return null;
            }
            AbstractC12120kG.A01("OneCameraController", "Trying to take a photo while CameraService is not connected");
            TextureView textureView = c174757qB.A0H.A01;
            if (textureView != null) {
                return textureView.getBitmap();
            }
            return null;
        }
        return null;
    }

    public final String A0O() {
        C1810981l c1810981l = this.A0g;
        if (c1810981l.A08.A00 == C208509Kk.A00) {
            C81W c81w = C81W.A0M;
            if (!c1810981l.A0W(c81w)) {
                c81w = C81W.A0B;
                if (!c1810981l.A0W(c81w)) {
                    c81w = C81W.A0T;
                    if (!c1810981l.A0W(c81w)) {
                        return null;
                    }
                }
            }
            return c81w.A01;
        }
        return null;
    }

    public final void A0P() {
        Bundle bundle = new Bundle();
        bundle.putSerializable(AbstractC111324zv.A00(3493), EnumC46157Kbv.A02);
        UserSession userSession = this.A0f;
        Activity activity = this.A0P;
        C6XJ c6xj = new C6XJ(activity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(4055));
        c6xj.A07();
        c6xj.A0C(activity);
    }

    public final void A0Q() {
        this.A0n.A09(0);
        if (!A0Y()) {
            C1810981l c1810981l = this.A0g;
            Iterator it = new HashSet((Collection) c1810981l.A09.A00).iterator();
            while (it.hasNext()) {
                C81W c81w = (C81W) it.next();
                Object obj = c1810981l.A08.A00;
                List list = AbstractC190348bs.A01;
                C14360o3.A0B(obj, 0);
                List list2 = (List) AbstractC190348bs.A00.get(obj);
                if (list2 == null) {
                    list2 = C16930sl.A00;
                }
                if (!list2.contains(c81w)) {
                    c1810981l.A0N(c81w);
                }
            }
        }
    }

    public final void A0R(C4PX c4px) {
        this.A03 = c4px;
        if (C4PY.A00(c4px) != null && AbstractC94954Pb.A01(this.A0P) == C05F.A0C) {
            float f = 1.0f;
            Object obj = this.A0g.A08.A00;
            if (C4PY.A01(c4px) == C8A3.A04 && (obj == C208509Kk.A00 || (obj instanceof C81V))) {
                f = AbstractC94954Pb.A00(this.A0S, c4px);
            }
            View view = this.A0S;
            if (view != null) {
                AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                A01.A0G();
                AbstractC125325le A0F = A01.A0F(true);
                A0F.A0P(f, view.getWidth() / 2.0f);
                A0F.A0Q(f, 0.0f);
                A0F.A0H();
            }
            AnonymousClass825 anonymousClass825 = this.A1G;
            if (anonymousClass825 != null) {
                anonymousClass825.A03.A0B(new C3AY(Float.valueOf(f), true));
            }
            this.A1B.A00().ESY(f);
            this.A1j.A00 = f;
            if (this.A0n != null) {
                float A00 = AbstractC94954Pb.A00(this.A0T, c4px);
                View view2 = this.A1Y;
                if (view2 != null) {
                    AbstractC125325le A012 = AbstractC125325le.A01(view2, 0);
                    A012.A0G();
                    AbstractC125325le A0F2 = A012.A0F(true);
                    A0F2.A0P(1.0f, 0.0f);
                    A0F2.A0Q(A00, 0.0f);
                    A0F2.A0H();
                }
            }
        }
    }

    public final void A0S(final EnumC223359tS enumC223359tS) {
        UserSession userSession = this.A0f;
        UpcomingEvent A00 = AbstractC171517kh.A00(userSession).A00(userSession);
        if (this.A0g.A08.A00 == C81S.A00 && A00 != null) {
            Fragment fragment = this.A0V;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.AOG
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C8HI.A06(this);
                }
            };
            C14360o3.A0B(fragment, 0);
            C14360o3.A0B(userSession, 1);
            Context requireContext = fragment.requireContext();
            C193328hC c193328hC = new C193328hC(requireContext);
            c193328hC.A05 = requireContext.getString(2131964116, A00.getTitle());
            c193328hC.A09(2131964112);
            c193328hC.A0J(onClickListener, 2131964113);
            c193328hC.A0H(null, 2131964114);
            c193328hC.A0I(new AOY(fragment, this, userSession, A00), 2131964115);
            C0fJ.A00(c193328hC.A02());
            return;
        }
        A06(this);
    }

    public final void A0T(PickerConfiguration.ItemConfiguration itemConfiguration) {
        String str;
        C1821585z c1821585z = this.A1n;
        if (this.A1R && c1821585z != null && (str = itemConfiguration.mId) != null) {
            c1821585z.A04();
            c1821585z.A0K.put(c1821585z.A05, str);
            Product A04 = c1821585z.A04();
            ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = c1821585z.A02;
            if (shoppingCameraSurveyMetadata != null && A04 != null) {
                HashSet hashSet = shoppingCameraSurveyMetadata.A06;
                hashSet.add(A04.A0H);
                shoppingCameraSurveyMetadata.A00 = hashSet.size();
            }
            boolean isEmpty = str.isEmpty();
            C8FG c8fg = this.A14;
            c8fg.getClass();
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.Eba(A04);
                c8fp.Ebe(!isEmpty);
                C8GF c8gf = this.A1A;
                if (c8gf != null) {
                    c8gf.A00().FBk();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0U(final AbstractC184688Hj abstractC184688Hj) {
        C174757qB c174757qB = this.A06;
        if (c174757qB == null) {
            this.A17.A04(new C8HL() { // from class: X.8dH
                @Override // X.C8HL
                public final void D1Z() {
                    C8HI c8hi = this;
                    AbstractC184688Hj abstractC184688Hj2 = abstractC184688Hj;
                    C174757qB c174757qB2 = c8hi.A17.A02;
                    c174757qB2.getClass();
                    c174757qB2.A0I(new C176417sz(abstractC184688Hj2, c8hi.A0f));
                }
            });
        } else {
            c174757qB.A0I(new C176417sz(abstractC184688Hj, this.A0f));
        }
    }

    public final boolean A0V() {
        C88X A0D;
        CameraAREffect A00;
        C8FG c8fg = this.A14;
        if (c8fg != null && (A0D = c8fg.A0D()) != null && (A00 = A0D.A00()) != null && A00.A0J()) {
            return true;
        }
        return false;
    }

    public final boolean A0X() {
        CameraAREffect cameraAREffect = this.A0Z.A00().A05.A09;
        if (!A0Y()) {
            C174757qB c174757qB = this.A06;
            if (c174757qB != null && c174757qB.A0W()) {
                return false;
            }
            if ((cameraAREffect == null || "SUPERZOOMV3".equals(CameraAREffect.A00(cameraAREffect.A09)) || cameraAREffect.A09 == C05F.A01) && !this.A0g.A0W(C81W.A0o, C81W.A0p)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A1C.CRB(EnumC1810181d.A1Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r2.A1C.CRB(X.EnumC1810181d.A0G) != false) goto L6;
     */
    @Override // X.C85H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A7D(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            X.81d r0 = X.EnumC1810181d.A08
            if (r3 != r0) goto Lf
            X.81c r1 = r2.A1C
            X.81d r0 = X.EnumC1810181d.A0G
            boolean r1 = r1.CRB(r0)
            r0 = 1
            if (r1 == 0) goto L10
        Lf:
            r0 = 0
        L10:
            r1 = r0 ^ 1
            java.lang.String r0 = "State transitioning to CAPTURE without being in CONFIGURE_CAMERA first."
            X.C02R.A06(r1, r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.A7D(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // X.C8HK
    public final C174757qB Ajx() {
        return this.A06;
    }

    @Override // X.C8HK
    public final boolean CfS() {
        if (this.A1C.AuH() != EnumC1810381f.A03) {
            return false;
        }
        return true;
    }

    @Override // X.C8HJ
    public final void Cyc(String str) {
        AnonymousClass229.A01(this.A0f).A1l(str);
    }

    @Override // X.C8HL
    public final void D1Z() {
        if (this.A06 == null) {
            C174757qB c174757qB = this.A17.A02;
            this.A06 = c174757qB;
            c174757qB.getClass();
            this.A0m.A01 = this.A06;
            A0E(this, false);
            UserSession userSession = this.A0f;
            Integer num = this.A0G;
            C1810981l c1810981l = this.A0g;
            A0B(this, AbstractC174837qJ.A00(userSession, (C55U) c1810981l.A08.A00, num, c1810981l.A0W(C81W.A0C)));
            this.A0G = null;
        }
        C8HR c8hr = this.A0l;
        if (!c8hr.A00) {
            this.A06.A0F(c8hr);
        }
        C174757qB c174757qB2 = this.A06;
        c174757qB2.getClass();
        c174757qB2.A0H.A00().setEnabled(true);
        C174757qB c174757qB3 = this.A06;
        c174757qB3.A0H.A00().post(new Runnable() { // from class: X.7sy
            @Override // java.lang.Runnable
            public final void run() {
                C174757qB c174757qB4 = C8HI.this.A06;
                c174757qB4.getClass();
                c174757qB4.A0H.A00().requestLayout();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r17.A00().CcN() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (1 != r3.intValue()) goto L11;
     */
    /* JADX WARN: Type inference failed for: r11v2, types: [X.01p, java.util.Map] */
    @Override // X.C8HJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DA5(X.C88X r17, java.util.Map r18) {
        /*
            r16 = this;
            r2 = r17
            X.88Z r0 = r2.A04
            if (r0 != 0) goto L8
            X.88Z r0 = X.C88Z.A0G
        L8:
            int r0 = r0.ordinal()
            r13 = 2
            if (r0 != r13) goto L89
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            r0.getClass()
            java.lang.String r7 = r0.A0K
            r1 = r16
            java.lang.Integer r3 = r1.A0N()
            com.instagram.common.session.UserSession r0 = r1.A0f
            X.22C r4 = X.AnonymousClass229.A01(r0)
            r8 = 0
            X.MWs r6 = X.EnumC50631MWs.A0J
            X.81l r0 = r1.A0g
            X.81v r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.55U r0 = (X.C55U) r0
            X.5Hg r5 = X.AbstractC191238dS.A00(r0)
            r1 = 1
            if (r3 == 0) goto L3d
            int r0 = r3.intValue()
            r12 = 1
            if (r1 == r0) goto L3e
        L3d:
            r12 = 2
        L3e:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            r11 = 0
            if (r0 == 0) goto L8a
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            java.lang.String r9 = r0.A0B
        L4b:
            com.instagram.model.shopping.ProductItemWithAR r0 = r2.A06
            if (r0 == 0) goto L71
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r3 = X.AbstractC38048Gob.A01(r0)
            r0 = 0
            X.0yX r11 = new X.0yX
            r11.<init>(r0)
            java.lang.String r1 = r3.A0H
            java.lang.String r0 = "product_id"
            r11.put(r0, r1)
            com.instagram.user.model.User r0 = r3.A0B
            if (r0 == 0) goto L71
            java.lang.String r1 = X.AbstractC76433bn.A00(r0)
            if (r1 == 0) goto L71
            java.lang.String r0 = "merchant_id"
            r11.put(r0, r1)
        L71:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            if (r0 == 0) goto L82
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            boolean r0 = r0.CcN()
            r14 = 1
            if (r0 != 0) goto L83
        L82:
            r14 = 0
        L83:
            r15 = 0
            r10 = r18
            r4.A13(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L89:
            return
        L8a:
            r9 = r8
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.DA5(X.88X, java.util.Map):void");
    }

    @Override // X.C8HJ
    public final void DA7(C88X c88x) {
        C8HN c8hn;
        String str;
        this.A1c.A00.A00(new C9CJ(__redex_internal_original_name, AnonymousClass001.A0R("onDialElementSelected ", c88x.getId())));
        AnonymousClass825 anonymousClass825 = this.A1G;
        boolean z = false;
        if (c88x.A04 == C88Z.A04) {
            z = true;
        }
        anonymousClass825.A09.Egh(Boolean.valueOf(z));
        C8FG c8fg = this.A14;
        if (c8fg != null) {
            ShutterButton shutterButton = this.A1I;
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                str = c8fp.Aqw(c88x);
            } else {
                str = "";
            }
            shutterButton.setContentDescription(str);
        }
        C8XV c8xv = this.A0B;
        C8TN.A06(c8xv.A09);
        C1821786b c1821786b = c8xv.A0C;
        c1821786b.A03 = c88x;
        C1821786b.A06(c1821786b);
        if (A0H(this) && (c8hn = this.A0A) != null) {
            c8hn.A02();
        }
        C8GF c8gf = this.A1A;
        if (c8gf != null) {
            c8gf.A00().FBk();
        }
    }

    @Override // X.C8HJ
    public final void DA9(C88X c88x) {
        C8XV c8xv = this.A0B;
        c8xv.A09.A09(c88x);
        C1821786b c1821786b = c8xv.A0C;
        c1821786b.A03 = c88x;
        C1821786b.A06(c1821786b);
    }

    @Override // X.C8HK
    public final void DYP(String str) {
        if (this.A0g.A08.A00 instanceof C128535rM) {
            MYZ A01 = MX1.A01(this.A0f);
            A01.A08 = A01.A0B.A07(String.valueOf(str), "", 288434727, A01.A08);
        }
    }

    @Override // X.C8HK
    public final void DYQ(C183978Ee c183978Ee) {
        if (this.A0g.A08.A00 instanceof C128535rM) {
            MYZ A01 = MX1.A01(this.A0f);
            A01.A08 = A01.A0B.A02(288434727, A01.A08);
        }
        this.A0w.A02.A08(C05F.A00);
        this.A0B.A04(c183978Ee);
    }

    @Override // X.C8HJ
    public final void Dl0(boolean z) {
        this.A1I.setEnabled(z);
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        C208769Lk A00;
        InterfaceC1810081c interfaceC1810081c;
        Object c187578Ta;
        Bitmap bitmap;
        String str;
        EnumC1810181d enumC1810181d = (EnumC1810181d) obj;
        EnumC1810181d enumC1810181d2 = (EnumC1810181d) obj2;
        int ordinal = enumC1810181d.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 10) {
                    if (A0J(this)) {
                        C1814983c c1814983c = this.A0Z.A00().A05.A0M;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("action", "reset_effect");
                            jSONObject.put("platform", "android");
                            C1814983c.A00(c1814983c, jSONObject);
                        } catch (JSONException e) {
                            if (e.getMessage() != null) {
                                str = e.getMessage();
                            } else {
                                str = "";
                            }
                            AbstractC12120kG.A01("PlatformEventsController::fireResetEffectEvent", str);
                        }
                    }
                    if (this.A0g.A0W(C81W.A0M) || A0J(this)) {
                        C184628Hd c184628Hd = this.A16;
                        c184628Hd.A03 = false;
                        if (c184628Hd.A02) {
                            c184628Hd.A02 = false;
                            View requireViewById = c184628Hd.A04.getView().requireViewById(R.id.hands_free_timer);
                            C14360o3.A07(requireViewById);
                            CountdownTimerView countdownTimerView = (CountdownTimerView) requireViewById;
                            GradientSpinner gradientSpinner = countdownTimerView.A04;
                            C14360o3.A0A(gradientSpinner);
                            gradientSpinner.A08();
                            C14360o3.A0A(gradientSpinner);
                            gradientSpinner.setVisibility(8);
                            C185458Kn c185458Kn = countdownTimerView.A05;
                            if (c185458Kn != null) {
                                c185458Kn.A02.removeCallbacksAndMessages(null);
                                countdownTimerView.A05 = null;
                            }
                            countdownTimerView.A03 = null;
                        }
                    }
                    if (A0W() || this.A18.A00().CWR()) {
                        this.A18.A00().DF0();
                    }
                }
            } else {
                if (enumC1810181d2 != EnumC1810181d.A08) {
                    A07(this);
                }
                C83C c83c = this.A0x;
                if (c83c != null) {
                    c83c.A00().A04(false);
                }
                C174757qB c174757qB = this.A06;
                if (c174757qB != null) {
                    c174757qB.EUn(false);
                }
            }
        } else if (enumC1810181d2 != EnumC1810181d.A11) {
            A07(this);
        }
        int ordinal2 = enumC1810181d2.ordinal();
        if (ordinal2 != 3) {
            if (ordinal2 != 1) {
                if (ordinal2 != 0) {
                    if (ordinal2 != 48) {
                        if (ordinal2 == 49) {
                            final C9R2 A01 = A01(this);
                            A01.getClass();
                            A01.A01 = false;
                            C174757qB c174757qB2 = A01.A06;
                            C174747qA c174747qA = c174757qB2.A0H;
                            boolean z = false;
                            if (c174747qA.A00 != null) {
                                z = true;
                            }
                            InterfaceC09390do interfaceC09390do = A01.A0D;
                            int measuredWidth = ((View) interfaceC09390do.getValue()).getMeasuredWidth();
                            int measuredHeight = ((View) interfaceC09390do.getValue()).getMeasuredHeight();
                            if (z) {
                                c174757qB2.A0K(new C198008pB(A01), measuredWidth, measuredHeight);
                            } else {
                                TextureView textureView = c174747qA.A01;
                                if (textureView != null) {
                                    bitmap = textureView.getBitmap(measuredWidth, measuredHeight);
                                } else {
                                    bitmap = null;
                                }
                                C9R2.A00(bitmap, A01);
                            }
                            A01.A0J.invoke(new Runnable() { // from class: X.Arb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9R2 c9r2 = C9R2.this;
                                    B8Q b8q = new B8Q(c9r2, 10);
                                    c9r2.A01 = false;
                                    C174757qB c174757qB3 = c9r2.A06;
                                    c174757qB3.A0H.A00().setVisibility(4);
                                    View view = c174757qB3.A0F;
                                    C14360o3.A07(view);
                                    float f = c9r2.A03;
                                    int i = (int) f;
                                    AbstractC13880nE.A0h(view, i, i);
                                    AbstractC185998Mt.A01(view, c9r2.A02, 0);
                                    view.setX((c9r2.A05 - f) / 2.0f);
                                    view.setY((c9r2.A04 - f) / 2.0f);
                                    C11T.A04(new RunnableC24771Axt(c174757qB3, c9r2, b8q), 170L);
                                }
                            }, new Runnable() { // from class: X.Arc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C9R2 c9r2 = C9R2.this;
                                    c9r2.A01 = true;
                                    c9r2.A00 = false;
                                    ((C208779Ll) c9r2.A0I.getValue()).A00();
                                    c9r2.A0B.E4u(new Object());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (!this.A0I) {
                        onResume();
                    }
                    this.A0n.A09(0);
                    return;
                }
                AbstractC25651Mw.A00(this.A0f).A02(this.A0d, C191178dG.class);
                C218914p.A06(this.A0e);
                return;
            }
            if (enumC1810181d == EnumC1810181d.A11 && (obj3 instanceof C187588Tb)) {
                interfaceC1810081c = this.A1C;
                c187578Ta = new Object();
            } else {
                if (enumC1810181d == EnumC1810181d.A1Q) {
                    A0A(this);
                } else if (this.A0g.A0W(C81W.A0T, C81W.A0z) && (A00 = A00(this)) != null) {
                    A00.A0K(true);
                }
                interfaceC1810081c = this.A1C;
                c187578Ta = new C187578Ta(obj3);
            }
            interfaceC1810081c.E4u(c187578Ta);
            return;
        }
        AbstractC189688an.A03(this.A0f, "ui_ready_to_interact", true);
        A0A(this);
    }

    @Override // X.C8HJ
    public final void EkQ() {
        View view;
        ReboundViewPager reboundViewPager;
        AnonymousClass856 anonymousClass856 = this.A1F;
        if (!anonymousClass856.A00().A01 && (view = this.A0V.mView) != null && (reboundViewPager = (ReboundViewPager) view.findViewById(R.id.ar_effect_picker_pager)) != null) {
            C1809080s A00 = anonymousClass856.A00();
            ViewGroup viewGroup = this.A0T;
            ShutterButton shutterButton = this.A1I;
            EnumC199188rL enumC199188rL = EnumC199188rL.A0C;
            UserSession userSession = this.A0f;
            if (A00.A02(viewGroup, shutterButton, enumC199188rL, C21B.A00(userSession), null, reboundViewPager.getPageSize() / 2, false)) {
                C18920wW c18920wW = AnonymousClass229.A01(userSession).A05.A01;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "avatar_effect_in_live_tooltip_impression");
                if (A002.isSampled()) {
                    A002.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        Object obj = this.A0g.A08.A00;
        if (obj instanceof C81T) {
            return "direct_precapture_camera";
        }
        if (obj instanceof C1811481q) {
            return "note_precapture_camera";
        }
        return "reel_composer_camera";
    }

    @Override // X.InterfaceC1821886c
    public final void onPause() {
        if (this.A1P) {
            this.A0Y.A08(1.0d, true);
        }
        if (this.A08.A0M.get() == 1) {
            AbstractC12120kG.A03(__redex_internal_original_name, "mBoomerangCaptureController.isRecording() = true");
            this.A08.A0E(false);
        }
        C8IE c8ie = this.A0m;
        if (c8ie.A0V.A0i.A0A || c8ie.A0S.CRB(EnumC1810181d.A1Q)) {
            C8IE.A02(c8ie, "onPause");
        }
        C184658Hg c184658Hg = this.A0n;
        c184658Hg.A0G.A01(c184658Hg.A0A);
        A0D(this, "on_pause");
        IgCameraEffectsController igCameraEffectsController = this.A0Z.A00().A05;
        CameraAREffect cameraAREffect = igCameraEffectsController.A09;
        InterfaceC149836oc interfaceC149836oc = igCameraEffectsController.A0L;
        if (interfaceC149836oc != null && cameraAREffect != null) {
            interfaceC149836oc.EoY(cameraAREffect.A0K);
        }
        InterfaceC1810081c interfaceC1810081c = this.A1C;
        if (interfaceC1810081c.CRB(EnumC1810181d.A0r)) {
            this.A1I.A02();
            interfaceC1810081c.E4u(new Object());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if ((r1 instanceof X.C1811381p) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r1.A00().A01().A0K() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ff, code lost:
    
        if (r1.A0i.A09 != false) goto L65;
     */
    @Override // X.InterfaceC60022ok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onVolumeKeyPressed(X.EnumC37329GcX r8, android.view.KeyEvent r9) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HI.onVolumeKeyPressed(X.GcX, android.view.KeyEvent):boolean");
    }

    public final boolean A0W() {
        if (A0V() && this.A18.A00().CLx()) {
            return true;
        }
        return false;
    }

    public final boolean A0Z(Runnable runnable, Runnable runnable2) {
        C174757qB c174757qB;
        if ((A0Y() && !this.A1W) || (c174757qB = this.A06) == null || !c174757qB.CWZ() || !this.A06.A0H.A00().isEnabled() || !this.A0I || !((AnonymousClass834) this.A0s).getView().isEnabled()) {
            return false;
        }
        this.A0K = true;
        C174757qB c174757qB2 = this.A06;
        c174757qB2.getClass();
        c174757qB2.Epe(new C196838nD(this, runnable, runnable2));
        return true;
    }

    @Override // X.C8HJ
    public final void CuD(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        C8GJ c8gj;
        C8GR c8gr;
        C177447ue c177447ue;
        A07(this);
        UserSession userSession = this.A0f;
        boolean z = false;
        if (C17060sy.A01.A01(userSession).A2I()) {
            C1811981v c1811981v = this.A0g.A08;
            if (c1811981v.A00 == C208509Kk.A00 && cameraAREffect != null && CameraAREffect.A00(cameraAREffect.A09).equals("DEFAULT") && C18U.A06(C06090Tz.A05, userSession, 36319115333475269L)) {
                boolean z2 = false;
                if (System.currentTimeMillis() - AbstractC23021Ah.A00(userSession).A01.getLong("time_last_seen_boost_story_effects_toast", 0L) > TimeUnit.HOURS.toMillis(24L)) {
                    z2 = true;
                }
                int i = AbstractC23021Ah.A00(userSession).A01.getInt("boost_story_effects_toast_view_count", 0);
                boolean z3 = false;
                if (i < 3) {
                    z3 = true;
                }
                if (z2 && z3) {
                    C9GR.A08(this.A0P, 2131961694, 1);
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    InterfaceC19610xo ARD = A00.A01.ARD();
                    ARD.E7G("time_last_seen_boost_story_effects_toast", currentTimeMillis);
                    ARD.apply();
                    InterfaceC19610xo ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD2.E7D("boost_story_effects_toast_view_count", i + 1);
                    ARD2.apply();
                    AnonymousClass229.A01(userSession).A1b((C55U) c1811981v.A00);
                }
            }
        }
        boolean z4 = false;
        if (cameraAREffect2 != null) {
            z4 = true;
        }
        if (cameraAREffect != null) {
            z = true;
        }
        if (z4) {
            C184658Hg c184658Hg = this.A0n;
            if (C184658Hg.A01(c184658Hg) && C184658Hg.A03(c184658Hg) && (((c177447ue = c184658Hg.A02) == null || c177447ue.A01 != 1) && C14360o3.A0K(c184658Hg.A0F.A08.A00, C208509Kk.A00))) {
                if (c184658Hg.A0I.contains(3)) {
                    c184658Hg.A09(3);
                } else {
                    C174757qB c174757qB = c184658Hg.A03;
                    if (c174757qB == null) {
                        C14360o3.A0F("cameraController");
                        throw C00O.createAndThrow();
                    }
                    int A08 = c174757qB.A08();
                    if (A08 == 3) {
                        c184658Hg.A08(A08);
                    }
                }
            }
        } else {
            C184658Hg c184658Hg2 = this.A0n;
            if (c184658Hg2.A00 == 3) {
                c184658Hg2.A09(c184658Hg2.A01);
            }
        }
        this.A18.A00().CuD(cameraAREffect, cameraAREffect2);
        this.A1m.A00();
        C8C0 c8c0 = this.A13;
        C8CD c8cd = c8c0.A0Q;
        if (c8c0.A0B && c8c0.A0T && c8cd != null) {
            c8c0.A0P.A15(c8c0.A0N);
            c8cd.A02(c8c0.A0O);
            C8C0.A07(c8c0, false);
            c8c0.A0B = false;
        }
        if (cameraAREffect2 != null && cameraAREffect2.A0Z.get("nativeUIControlPicker") == null && c8c0.A0D(cameraAREffect2)) {
            if (c8c0.A0D) {
                NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = c8c0.A0P;
                nestableSnapPickerRecyclerView.A14(c8c0.A0N);
                AbstractC13880nE.A0r(nestableSnapPickerRecyclerView, c8c0.A0S);
            } else {
                C8C0.A07(c8c0, true);
            }
        }
        C8GH A002 = this.A0z.A00();
        A002.A01 = z4;
        if (z4 && (c8gj = A002.A00) != null && (c8gr = (C8GR) c8gj.A0D.get(c8gj.A03)) != null) {
            c8gr.A05();
        }
        if (z && !z4) {
            C1820485o c1820485o = this.A1j;
            c1820485o.A05(true);
            c1820485o.A06(true);
            return;
        }
        ((C8JA) this.A1k.A00.A00()).CMH(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v67, types: [X.8Hq, java.lang.Object] */
    public C8HI(ViewGroup viewGroup, AnonymousClass845 anonymousClass845, C1815283f c1815283f, C85E c85e, C1GL c1gl, C1810981l c1810981l, C1828689h c1828689h, TargetViewSizeProvider targetViewSizeProvider, C184328Fw c184328Fw, C1821786b c1821786b, AnonymousClass840 anonymousClass840, C83C c83c, CameraPreCaptureUtilityMenu cameraPreCaptureUtilityMenu, C8GG c8gg, C81J c81j, C1813582n c1813582n, C184518Gr c184518Gr, C8C0 c8c0, C1820485o c1820485o, C8FG c8fg, C8FE c8fe, C1824987o c1824987o, C8A0 c8a0, C1814582x c1814582x, C1813982r c1813982r, C8GE c8ge, C1814382v c1814382v, C8GF c8gf, C8HG c8hg, InterfaceC1810081c interfaceC1810081c, C89E c89e, AnonymousClass856 anonymousClass856, AnonymousClass825 anonymousClass825, ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o, C8HB c8hb) {
        int i;
        Product A03;
        this.A0y = cameraPreCaptureUtilityMenu;
        this.A0g = c1810981l;
        c1810981l.A0G(new AnonymousClass822() { // from class: X.8HW
            @Override // X.AnonymousClass822
            public final void onChanged(Object obj) {
                C8HI.A04((CameraConfiguration) obj, C8HI.this);
            }
        });
        c1810981l.A0H(new AnonymousClass822() { // from class: X.8HX
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
            
                if (X.C8HI.A0H(r4) != false) goto L8;
             */
            @Override // X.AnonymousClass822
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r6) {
                /*
                    r5 = this;
                    X.8HI r4 = X.C8HI.this
                    X.55U r6 = (X.C55U) r6
                    X.7qB r3 = r4.A06
                    if (r3 == 0) goto L31
                    boolean r0 = r6 instanceof X.C81V
                    if (r0 == 0) goto L13
                    boolean r0 = X.C8HI.A0H(r4)
                    r2 = 1
                    if (r0 == 0) goto L14
                L13:
                    r2 = 0
                L14:
                    r1 = 0
                    X.7yZ r0 = X.C174757qB.A02(r3)
                    com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
                    X.7qa r0 = r0.A04
                    if (r0 == 0) goto L24
                    X.7qg r0 = r0.A0N
                    r0.EVB(r1, r2)
                L24:
                    boolean r0 = X.C8HI.A0G(r6, r4)
                    if (r0 != 0) goto L31
                    X.8HN r0 = r4.A0A
                    if (r0 == 0) goto L31
                    r0.A02()
                L31:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8HX.onChanged(java.lang.Object):void");
            }
        });
        this.A0w = anonymousClass840;
        this.A1C = interfaceC1810081c;
        interfaceC1810081c.A82(this);
        Activity activity = c81j.A05;
        this.A0P = activity;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe = c81j.A0M;
        this.A0V = abstractC59962oe;
        final UserSession userSession = c81j.A0S;
        this.A0f = userSession;
        this.A0T = viewGroup;
        this.A0U = (ViewGroup) viewGroup.requireViewById(R.id.pre_capture_controls_content_container);
        this.A0S = viewGroup.requireViewById(R.id.camera_stub_constraint_layout);
        this.A19 = c1814382v;
        this.A15 = c1824987o;
        this.A13 = c8c0;
        this.A1g = new C57012jc((ViewStub) viewGroup.requireViewById(R.id.layout_format_capture_recycler_stub));
        this.A0v = c1821786b;
        this.A0u = c184328Fw;
        this.A1E = c89e;
        this.A18 = c8ge;
        this.A0z = c8gg;
        this.A0Z = c1815283f;
        this.A0c = c85e;
        this.A1P = c81j.A3J;
        boolean z = c81j.A3F;
        this.A1O = z;
        this.A0j = c81j.A0f;
        this.A14 = c8fg;
        this.A0G = c81j.A26;
        this.A1k = c8fe;
        this.A17 = c1813982r;
        this.A1W = C6PX.A00(activity);
        this.A1l = c8a0;
        this.A12 = new C8HY(viewGroup);
        this.A10 = c1813582n;
        this.A1T = c81j.A3k;
        boolean z2 = c81j.A3d;
        this.A1R = z2;
        this.A1j = c1820485o;
        this.A1f = c1gl;
        boolean z3 = c81j.A35;
        this.A1M = z3;
        this.A1m = c1814582x;
        this.A1h = targetViewSizeProvider;
        this.A1H = viewOnTouchListenerC1829389o;
        this.A0E = c8hb;
        this.A1S = c81j.A3j;
        C1816283r c1816283r = c81j.A18;
        C81W c81w = c81j.A0X;
        if (c81w == null || c81w != C81W.A0o) {
            if (viewOnTouchListenerC1829389o != null && c1816283r != null) {
                long j = c1816283r.A01.A00;
                if (j > 0) {
                    i = Math.min((int) j, 60000);
                }
            }
            if (c81j.A3m) {
                i = Long.valueOf(C18U.A01(C06090Tz.A05, this.A0f, 36601943224816027L)).intValue();
            } else {
                i = c81j.A0b != null ? 61500 : 60000;
            }
        } else {
            i = 3000;
        }
        long j2 = i;
        this.A1X = j2;
        this.A1F = anonymousClass856;
        this.A1G = anonymousClass825;
        ImageView imageView = (ImageView) viewGroup.requireViewById(R.id.camera_preview_overlay);
        this.A1Z = imageView;
        C0fQ.A00(new View.OnClickListener() { // from class: X.8Hc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                C8XV c8xv = C8HI.this.A0B;
                C194648jP A00 = C8XV.A00(c8xv);
                if (A00 != null && A00.A00 != 0.0f) {
                    C188798Xv c188798Xv = c8xv.A01;
                    if (c188798Xv == null) {
                        str = "creationGallerySurfaceControllerProvider";
                    } else {
                        C193838i4 c193838i4 = c188798Xv.A00().A02;
                        if (c193838i4 == null) {
                            AbstractC12120kG.A07("IgCameraViewControllerDelegateImpl", "onCameraOverlayClick() but GalleryController has not been created", null);
                            return;
                        }
                        if (AbstractC110854yx.A03(c193838i4.A0V)) {
                            str = "creationGallerySurfaceControllerProvider";
                            if (c8xv.A01 != null) {
                                if (!r0.A00().A0Q()) {
                                    AnonymousClass229.A01(c8xv.A04).A0b();
                                    C188798Xv c188798Xv2 = c8xv.A01;
                                    if (c188798Xv2 != null) {
                                        c188798Xv2.A00().A0L(true);
                                        return;
                                    }
                                }
                            }
                        }
                        if (!c193838i4.A09) {
                            AbstractC110854yx.A01(c193838i4.A0X, true);
                            return;
                        }
                        return;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
        }, imageView);
        this.A1N = c81j.A3E;
        this.A1U = c81j.A3m;
        this.A1p = c81j.A3R;
        c81j.A0M.getClass();
        AbstractC59962oe abstractC59962oe2 = c81j.A0M;
        this.A0W = abstractC59962oe2;
        this.A0i = c1828689h;
        this.A1Q = c81j.A3T;
        C184628Hd c184628Hd = new C184628Hd((ViewStub) viewGroup.requireViewById(R.id.hands_free_countdown_stub), userSession, (int) j2);
        this.A16 = c184628Hd;
        this.A0d = new InterfaceC41501vz() { // from class: X.8Hf
            @Override // X.InterfaceC41501vz
            public final void onEvent(Object obj) {
                C191178dG c191178dG = (C191178dG) obj;
                C208769Lk A00 = C8HI.A00(C8HI.this);
                if (A00 == null) {
                    C8HI.A0F(C8HI.__redex_internal_original_name, "getLayoutCaptureController() returned null in mLayoutGalleryPhotoSelectedEventListener");
                    return;
                }
                Bitmap bitmap = c191178dG.A00;
                String str = c191178dG.A01;
                if (A00.A01 == EnumC172837mv.A0I) {
                    A00.A0K(true);
                }
                C66017TyF c66017TyF = A00.A0M;
                if (c66017TyF.getItemCount() == 0) {
                    A00.A0R.E4u(new Object());
                }
                if (c66017TyF.getItemCount() >= A00.A01.A03) {
                    return;
                }
                C208769Lk.A03(BlurUtil.blur(bitmap, 0.25f, 10), A00, str);
            }
        };
        View requireViewById = viewGroup.requireViewById(R.id.selfie_flash_overlay);
        this.A1Y = requireViewById;
        AnonymousClass835 B6y = c1814382v.A00().B6y();
        if (AnonymousClass836.A00(userSession) && cameraPreCaptureUtilityMenu != null && (this.A0g.A08.A00 instanceof C81U)) {
            B6y = cameraPreCaptureUtilityMenu.getCameraFlashButton();
        }
        this.A1a = (ConstraintLayout) viewGroup.requireViewById(R.id.camera_shutter_button_container);
        ShutterButton shutterButton = (ShutterButton) viewGroup.requireViewById(R.id.camera_shutter_button);
        this.A1I = shutterButton;
        shutterButton.A08 = j2;
        shutterButton.setEnabled(false);
        B6y.getClass();
        C184658Hg c184658Hg = new C184658Hg(AbstractC12290kX.A00, requireViewById, abstractC59962oe2, c1815283f.A00(), userSession, c1810981l, B6y, anonymousClass825);
        this.A0n = c184658Hg;
        C1815383g A00 = c1815283f.A00();
        C1821585z c1821585z = c81j.A1p;
        C184758Hq c184758Hq = null;
        c184758Hq = null;
        if (c1821585z != null && (A03 = c1821585z.A03()) != null) {
            String str = A03.A0H;
            User user = A03.A0B;
            String str2 = (user == null || (str2 = AbstractC76433bn.A00(user)) == null) ? "" : str2;
            C14360o3.A0B(str, 1);
            ?? obj = new Object();
            obj.A01 = str;
            obj.A00 = str2;
            c184758Hq = obj;
        }
        this.A0k = new C184748Hp(activity, A00, userSession, c1gl, c1810981l, targetViewSizeProvider, this, c184658Hg, interfaceC1810081c, c184758Hq, shutterButton);
        this.A11 = c184518Gr;
        C1821585z c1821585z2 = c81j.A1p;
        this.A1n = c1821585z2;
        this.A0x = c83c;
        this.A1B = c8hg;
        this.A1c = anonymousClass845;
        shutterButton.setLoggingListener(new C184778Hs(this));
        shutterButton.setCameraInitialisedDelegate(new C184798Hu(this));
        shutterButton.setOnSingleTapCaptureListener(new InterfaceC184828Hx() { // from class: X.8Hw
            @Override // X.InterfaceC184828Hx
            public final void DmU() {
                C8HI c8hi = C8HI.this;
                C8FG c8fg2 = c8hi.A14;
                if (c8fg2 != null) {
                    C88X A0D = c8fg2.A0D();
                    if (!c8hi.A0g.A0W(C81W.A0C) && A0D != null && A0D.A04 == C88Z.A0E) {
                        AbstractC183338Bg.A00(c8hi.A0f).A0G("effect_gallery_button_tap");
                        if (c8hi.A10.A00.A01 == C22P.A2X) {
                            Activity activity2 = c8hi.A15.A00;
                            activity2.setResult(60572);
                            activity2.finish();
                            return;
                        }
                        c8hi.A15.A00(1);
                        return;
                    }
                }
                c8hi.A0S(EnumC223359tS.BUTTON);
            }
        });
        AbstractC010103p.A0B(this.A1I, new C02V() { // from class: X.8Hy
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
            
                if (r1 != false) goto L11;
             */
            @Override // X.C02V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void A0Y(android.view.View r7, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8) {
                /*
                    r6 = this;
                    super.A0Y(r7, r8)
                    java.lang.Integer r0 = X.C05F.A01
                    X.AbstractC56952jT.A05(r8, r0)
                    X.04r r0 = X.C012804r.A08
                    X.8HI r1 = X.C8HI.this
                    X.81l r0 = r1.A0g
                    X.81v r5 = r0.A08
                    java.lang.Object r0 = r5.A00
                    X.81S r4 = X.C81S.A00
                    if (r0 == r4) goto L4a
                    boolean r0 = r0 instanceof X.C81V
                    if (r0 != 0) goto L4a
                    android.app.Activity r2 = r1.A0P
                    r0 = 2131974083(0x7f1357c3, float:1.958522E38)
                L1f:
                    java.lang.String r1 = r2.getString(r0)
                    r0 = 16
                    X.04r r3 = new X.04r
                    r3.<init>(r0, r1)
                    java.lang.Object r0 = r5.A00
                    if (r0 == r4) goto L35
                    boolean r1 = r0 instanceof X.C81V
                    r0 = 2131974084(0x7f1357c4, float:1.9585222E38)
                    if (r1 == 0) goto L38
                L35:
                    r0 = 2131974082(0x7f1357c2, float:1.9585218E38)
                L38:
                    java.lang.String r2 = r2.getString(r0)
                    r1 = 32
                    X.04r r0 = new X.04r
                    r0.<init>(r1, r2)
                    r8.addAction(r3)
                    r8.addAction(r0)
                    return
                L4a:
                    android.app.Activity r2 = r1.A0P
                    r0 = 2131974082(0x7f1357c2, float:1.9585218E38)
                    goto L1f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C184838Hy.A0Y(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
        if (z3) {
            Rect rect = new Rect();
            shutterButton.getGlobalVisibleRect(rect);
            C184848Hz c184848Hz = new C184848Hz(rect, ViewConfiguration.get(activity.getBaseContext()), abstractC59962oe2, c1815283f.A00(), userSession, c1820485o);
            this.A0o = c184848Hz;
            shutterButton.A0E = c184848Hz;
        } else {
            this.A0o = null;
        }
        shutterButton.A0D = new C8I4() { // from class: X.8I3
            @Override // X.C8I4
            public final void DmD(float f, float f2) {
                C8HI c8hi = C8HI.this;
                C1814382v c1814382v2 = c8hi.A19;
                ViewGroup BrT = c1814382v2.A00().BrT();
                if (BrT != null) {
                    BrT.setTranslationY(-f2);
                }
                if (c8hi.A0g.A08.A00 instanceof C81V) {
                    if (AbstractC13620mo.A02(c8hi.A0T.getContext())) {
                        f2 *= -1.0f;
                    }
                    View AoS = c1814382v2.A00().AoS();
                    if (AoS != null) {
                        AoS.setTranslationX(f2);
                        AoS.setAlpha(1.0f - f);
                    }
                    View AoH = c1814382v2.A00().AoH();
                    if (AoH != null) {
                        AoH.setTranslationX(-f2);
                        AoH.setAlpha(1.0f - f);
                    }
                }
            }
        };
        shutterButton.setOnTakingLowLightPhotoListener(new C8I5(this));
        shutterButton.setOnRecordVideoListener(new C8I7(this, c1813582n));
        shutterButton.setVideoRecordingEnabled(true);
        this.A0b = (TouchEventForwardingView) viewGroup.requireViewById(R.id.container_touch_event_forwarding_view);
        this.A1e = new C8IA() { // from class: X.8I9
            @Override // X.C8IA
            public final boolean Eii(MotionEvent motionEvent) {
                C8IA c8ia = C8HI.this.A07;
                if (c8ia != null) {
                    return c8ia.Eii(motionEvent);
                }
                return false;
            }
        };
        this.A0a = (TouchEventForwardingView) viewGroup.requireViewById(R.id.camera_preview_touch_event_forwarding_view);
        this.A1d = new C8IA() { // from class: X.8IB
            @Override // X.C8IA
            public final boolean Eii(MotionEvent motionEvent) {
                C208769Lk c208769Lk;
                AnonymousClass834 anonymousClass834;
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                C8HI c8hi = C8HI.this;
                C1810981l c1810981l2 = c8hi.A0g;
                if (c1810981l2.A0W(C81W.A0T)) {
                    if (!c8hi.A19.A00().AJh((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), c8hi.A1C.CRB(EnumC1810181d.A0f)) && (c208769Lk = c8hi.A0C) != null) {
                        Rect rect2 = new Rect();
                        c208769Lk.A0E.A0F.getHitRect(rect2);
                        if (!rect2.contains(rawX, rawY) && ((anonymousClass834 = c8hi.A0C.A00) == null || !anonymousClass834.AJh(rawX, rawY, AbstractC13440mV.A07()))) {
                            return true;
                        }
                    }
                } else if ((c1810981l2.A0S() || c8hi.A1T || c1810981l2.A0W(C81W.A0B, C81W.A0M) || C8HI.A0J(c8hi)) && c8hi.A0Y() && ((c8hi.A1V || c8hi.A0Z.A00().A05.A09 != null) && (motionEvent.getAction() != 0 || !c8hi.A19.A00().AJh((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), c8hi.A1C.CRB(EnumC1810181d.A0f))))) {
                    return true;
                }
                return false;
            }
        };
        if (!z) {
            this.A0r = null;
        } else {
            C172407m9 Bu0 = c1814382v.A00().Bu0();
            this.A0r = Bu0;
            C184708Hl Csh = Bu0.Csh();
            Csh.A00 = new InterfaceC184728Hn() { // from class: X.7mA
                @Override // X.InterfaceC184728Hn
                public final boolean D3S() {
                    C8HI c8hi = C8HI.this;
                    AnonymousClass229.A01(c8hi.A0f).A1c((C55U) c8hi.A0g.A08.A00);
                    c8hi.A0P();
                    return true;
                }
            };
            Csh.A00();
        }
        C8IE c8ie = new C8IE(activity, c1815283f, userSession, c1810981l, c1828689h, new C8ID(this), c184658Hg, this.A0o, this.A0r, c1821786b, anonymousClass840, c8c0, c8fg, c8ge, c8hg, interfaceC1810081c, anonymousClass856, anonymousClass825, c1821585z2, shutterButton, new C8IC(activity), j2, z, z2, c81j.A18 != null);
        this.A0m = c8ie;
        AnonymousClass835 BEH = c1814382v.A00().BEH();
        this.A0q = BEH;
        C184708Hl Csh2 = BEH.Csh();
        Csh2.A00 = new InterfaceC184728Hn() { // from class: X.8IJ
            @Override // X.InterfaceC184728Hn
            public final boolean D3S() {
                C8HI.this.A0B.A02();
                return true;
            }
        };
        Csh2.A00();
        C184708Hl Csh3 = c1814382v.A00().BmT().Csh();
        Csh3.A00 = new InterfaceC184728Hn() { // from class: X.8IK
            @Override // X.InterfaceC184728Hn
            public final boolean D3S() {
                C8XV c8xv = C8HI.this.A0B;
                ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o2 = c8xv.A0N;
                if (viewOnTouchListenerC1829389o2 != null && !viewOnTouchListenerC1829389o2.A0f) {
                    if (!viewOnTouchListenerC1829389o2.A0f) {
                        viewOnTouchListenerC1829389o2.A06();
                        return true;
                    }
                    return true;
                }
                c8xv.A0A.A0q(true);
                return true;
            }
        };
        Csh3.A00();
        AnonymousClass835 Acp = c1814382v.A00().Acp();
        if (Acp != null) {
            C184708Hl Csh4 = Acp.Csh();
            Csh4.A00 = new InterfaceC184728Hn() { // from class: X.8IL
                @Override // X.InterfaceC184728Hn
                public final boolean D3S() {
                    C8HI.this.A1C.E4u(new Object());
                    return true;
                }
            };
            Csh4.A00();
        }
        c8gg.A00().A02(new AnonymousClass822() { // from class: X.8IM
            @Override // X.AnonymousClass822
            public final void onChanged(Object obj2) {
                C8HI.this.A1C.E4u(new Object());
            }
        }, C81W.A0v);
        InterfaceC184728Hn interfaceC184728Hn = new InterfaceC184728Hn() { // from class: X.8IN
            @Override // X.InterfaceC184728Hn
            public final boolean D3S() {
                C8HI c8hi = C8HI.this;
                AbstractC50677MYv.A0H(c8hi.A0f, c8hi.A0N());
                c8hi.A0Z(null, null);
                return true;
            }
        };
        AnonymousClass835 C4f = c1814382v.A00().C4f();
        this.A0s = C4f;
        C184708Hl Csh5 = C4f.Csh();
        Csh5.A02 = false;
        Csh5.A00 = interfaceC184728Hn;
        Csh5.A00();
        this.A0t = c1814382v.A00().C4g();
        c8gg.A00().A09.add(new AnonymousClass822() { // from class: X.8IO
            @Override // X.AnonymousClass822
            public final void onChanged(Object obj2) {
                View A05;
                C1809080s A002;
                ViewGroup viewGroup2;
                EnumC199188rL enumC199188rL;
                C8HI c8hi = C8HI.this;
                if (((Boolean) obj2).booleanValue()) {
                    C8GG c8gg2 = c8hi.A0z;
                    C8GH A003 = c8gg2.A00();
                    C81W c81w2 = C81W.A0o;
                    C8GJ c8gj = A003.A00;
                    if (c8gj != null && (A05 = c8gj.A05(c81w2)) != null && (c8hi.A0g.A08.A00 instanceof C81T)) {
                        A002 = c8hi.A1F.A00();
                        viewGroup2 = c8hi.A0T;
                        enumC199188rL = EnumC199188rL.A0w;
                    } else {
                        if (!c8hi.A18.A00().CaA()) {
                            return;
                        }
                        C8GH A004 = c8gg2.A00();
                        C81W c81w3 = C81W.A0g;
                        C8GJ c8gj2 = A004.A00;
                        if (c8gj2 == null || (A05 = c8gj2.A05(c81w3)) == null) {
                            return;
                        }
                        A002 = c8hi.A1F.A00();
                        viewGroup2 = c8hi.A0T;
                        enumC199188rL = EnumC199188rL.A0l;
                    }
                    A002.A01(viewGroup2, A05, enumC199188rL);
                }
            }
        });
        this.A0R = viewGroup.requireViewById(R.id.camera_cover);
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(A1q);
        A02.A06 = true;
        A02.A0A(new C668630d() { // from class: X.8IP
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                int round = Math.round(((float) c55982hj.A09.A00) * 255.0f);
                View[] viewArr = {C8HI.this.A0R};
                if (round > 0) {
                    AbstractC125325le.A04(null, viewArr, false);
                } else {
                    AbstractC125325le.A05(viewArr, false);
                }
            }
        });
        this.A0Y = A02;
        final AnonymousClass835 B9P = c1814382v.A00().B9P();
        B9P.getClass();
        this.A0p = B9P;
        final Context context = viewGroup.getContext();
        C14360o3.A0B(userSession, 0);
        InterfaceC19630xq A002 = C8IQ.A00();
        C14360o3.A0A(A002);
        String string = A002.getString("GalleryThumbnailMedium", "");
        try {
            Medium parseFromJson = C8IR.parseFromJson(C16V.A00(string));
            if (parseFromJson != null) {
                String str3 = parseFromJson.A0a;
                if (str3 != null && str3.length() != 0) {
                    C1NJ c1nj = new C1NJ(context, userSession, B9P) { // from class: X.9KL
                        public final int A00;
                        public final UserSession A01;
                        public final WeakReference A02;
                        public final WeakReference A03;

                        @Override // X.C1NJ
                        public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                            C14360o3.A0B(c73033Pe, 1);
                            C8IQ.A02.remove(this);
                            Context context2 = (Context) this.A02.get();
                            AnonymousClass835 anonymousClass835 = (AnonymousClass835) this.A03.get();
                            if (context2 != null && anonymousClass835 != null) {
                                Resources resources = context2.getResources();
                                boolean A0L = AbstractC53242c7.A0L(context2, R.attr.quickCaptureControllerGalleryButtonCircular, false);
                                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
                                int A08 = AbstractC166997dE.A08(resources);
                                int i2 = this.A00;
                                Bitmap bitmap = c73033Pe.A01;
                                C14360o3.A0A(bitmap);
                                anonymousClass835.EW1(new C193568hb(context2, bitmap, dimensionPixelSize, A08, i2, 0, A0L));
                            }
                        }

                        @Override // X.C1NJ
                        public final void DLW(InterfaceC59502nt interfaceC59502nt, int i2) {
                        }

                        @Override // X.C1NJ
                        public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                            AbstractC12120kG.A0A("GalleryThumbnailCacheUtil", "Failed to load gallery button", null);
                            C8IQ.A02.remove(this);
                        }

                        {
                            this.A01 = userSession;
                            this.A02 = new WeakReference(context);
                            this.A03 = new WeakReference(B9P);
                            if (context != null) {
                                this.A00 = AbstractC166987dD.A0C(context, 34);
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    };
                    C8IQ.A02.add(c1nj);
                    C1OG A0J = C25821No.A00().A0J(AbstractC81033jX.A02(new File(str3), -1, -1), null);
                    A0J.A0I = false;
                    A0J.A02(c1nj);
                    A0J.A01 = parseFromJson.A06;
                    A0J.A01();
                } else {
                    AbstractC12120kG.A0A("GalleryThumbnailCacheUtil", "Thumbnail path is null", null);
                }
            }
        } catch (IOException e) {
            AbstractC12120kG.A0A("GalleryThumbnailCacheUtil", AnonymousClass001.A0R("Loading gallery thumbnail failed, media: ", string), e);
        }
        this.A1V = C18U.A06(C06090Tz.A05, userSession, 36312857565988125L);
        this.A1A = c8gf;
        if (!C11T.A08()) {
            viewGroup.post(new Runnable() { // from class: X.Aql
                @Override // java.lang.Runnable
                public final void run() {
                    C8HI c8hi = C8HI.this;
                    AnonymousClass825 anonymousClass8252 = c8hi.A1G;
                    C75M.A00(AbstractC58232lf.A00(AnonymousClass191.A00, new C1820985t(anonymousClass8252, anonymousClass8252.A0B))).A06(c8hi.A0W, new C8IV(c8hi));
                }
            });
        } else {
            C75M.A00(AbstractC58232lf.A00(AnonymousClass191.A00, new C1820985t(anonymousClass825, anonymousClass825.A0B))).A06(abstractC59962oe2, new C8IV(this));
        }
        AbstractC58232lf.A00(AnonymousClass191.A00, new C15430py(((C8IW) new C52942bb(abstractC59962oe).A00(C8IW.class)).A06)).A06(abstractC59962oe2, new InterfaceC58362lv() { // from class: X.8IX
            @Override // X.InterfaceC58362lv
            public final void onChanged(Object obj2) {
                C09530e4 c09530e4 = (C09530e4) obj2;
                C174757qB c174757qB = C8HI.this.A06;
                if (c174757qB != null) {
                    boolean booleanValue = ((Boolean) c09530e4.A01).booleanValue();
                    C176427t0 c176427t0 = new C176427t0();
                    if (booleanValue) {
                        c174757qB.A0M(c176427t0, false);
                    } else {
                        c174757qB.A0N(c176427t0, false);
                    }
                }
            }
        });
        InterfaceC018407e interfaceC018407e = (InterfaceC018407e) activity;
        this.A0h = (C8IY) new C52942bb(interfaceC018407e).A00(C8IY.class);
        this.A1D = (C1828389e) new C52942bb(new C89d(userSession), interfaceC018407e).A00(C1828389e.class);
        c8ie.A0C.put(C81W.A0M, c184628Hd);
        this.A1o = c81j.A03 == 7;
    }
}
