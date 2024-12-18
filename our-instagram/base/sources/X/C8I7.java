package X;

import android.content.Context;
import android.view.Window;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.8I7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8I7 implements C8I8 {
    public final /* synthetic */ C8HI A00;
    public final /* synthetic */ C1813582n A01;

    @Override // X.C8I8
    public final void DoI(boolean z) {
        C8JL c8jl;
        C89F c89f;
        C8JN c8jn;
        C8HI c8hi = this.A00;
        C8XV c8xv = c8hi.A0B;
        if (c8xv.A05.A08.A00 instanceof C81V) {
            c8xv.A0M.DoH();
        } else {
            C8HI c8hi2 = c8xv.A0B;
            if (c8hi2.A0W() || c8hi2.A18.A00().CWR()) {
                c8xv.A0K.A00().DoI(false);
            }
        }
        InterfaceC25209BDh interfaceC25209BDh = c8xv.A0I.A01;
        C8JL c8jl2 = null;
        if (interfaceC25209BDh != null) {
            c8jl = interfaceC25209BDh.BNn();
        } else {
            c8jl = null;
        }
        if (c8jl instanceof C8JN) {
            if (interfaceC25209BDh != null) {
                c8jl2 = interfaceC25209BDh.BNn();
            }
            if ((c8jl2 instanceof C8JN) && (c8jn = (C8JN) c8jl2) != null) {
                UserSession userSession = c8jn.A08;
                Context context = c8jn.A07;
                if (AbstractC195888lY.A01(context.getApplicationContext(), userSession)) {
                    C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, new Am3(c8jn), "GlassesStoryViewListener_SEND_STREAM_STARTING_LIFECYCLE_EVENT_ON_VIDEO_START_CALLBACK");
                }
            }
        }
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = c8xv.A0N;
        if (viewOnTouchListenerC1829389o != null) {
            BE6 be6 = viewOnTouchListenerC1829389o.A03;
            if (be6 != null) {
                be6.CMp();
            }
            c89f = viewOnTouchListenerC1829389o.A0G;
        } else {
            c89f = c8xv.A06;
        }
        if (c89f.A0B()) {
            c89f.A0P.A05("start");
        }
        AbstractC183338Bg.A00(c8hi.A0f).A0F("recording_started");
    }

    public C8I7(C8HI c8hi, C1813582n c1813582n) {
        this.A00 = c8hi;
        this.A01 = c1813582n;
    }

    @Override // X.C8I8
    public final boolean COr() {
        C8HI c8hi = this.A00;
        C82K c82k = c8hi.A0u.A00;
        if (!((InterfaceC184358Fz) c82k.A00()).CdL()) {
            ((InterfaceC184358Fz) c82k.A00()).DmE();
            return true;
        }
        return c8hi.A1C.CRB(EnumC1810181d.A1O);
    }

    @Override // X.C8I8
    public final void D1w(String str, String str2) {
        C8HI c8hi = this.A00;
        if (c8hi.A0g.A08.A00 == C128535rM.A00) {
            MYZ A01 = MX1.A01(c8hi.A0f);
            A01.A08 = A01.A0B.A06(str, str2, 288428278, A01.A08);
        }
        C183348Bh A00 = AbstractC183338Bg.A00(c8hi.A0f);
        A00.A05 = A00.A0K.A06(str, str2, 17636574, A00.A05);
    }

    @Override // X.C8I8
    public final void DmC() {
        C174757qB c174757qB;
        Integer num;
        C8HI c8hi = this.A00;
        if (c8hi.A1U && C8HI.A02(c8hi).booleanValue() && !C1H6.A03()) {
            ShutterButton shutterButton = c8hi.A1I;
            Context context = AbstractC12290kX.A00;
            shutterButton.setShutterButtonSingularColor(context.getColor(AbstractC53242c7.A04(context)));
        }
        C8FG c8fg = c8hi.A14;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.DmC();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        CameraConfiguration A08 = c8hi.A0g.A08();
        UserSession userSession = c8hi.A0f;
        if (AbstractC209669Pc.A06(A08)) {
            c8hi.A1I.setHandsFreeRecordingEnabled(false);
        }
        C177677v1 c177677v1 = c8hi.A0m.A03;
        if (c177677v1 != null && (c174757qB = c8hi.A06) != null && c174757qB.CWZ()) {
            C174757qB c174757qB2 = c8hi.A06;
            int i = c177677v1.A00;
            C196818nB c196818nB = new C196818nB(this);
            BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) C174757qB.A02(c174757qB2);
            if (i == 1) {
                num = basicCameraOutputController.A02;
            } else {
                if (i == 0) {
                    num = basicCameraOutputController.A03;
                }
                BasicCameraOutputController.A00(basicCameraOutputController).BYB(new C200988uf(basicCameraOutputController, c196818nB, i), i);
                return;
            }
            if (num != null) {
                BasicCameraOutputController.A03(BasicCameraOutputController.A00(basicCameraOutputController).Ajq(), c196818nB, num);
                return;
            }
            BasicCameraOutputController.A00(basicCameraOutputController).BYB(new C200988uf(basicCameraOutputController, c196818nB, i), i);
            return;
        }
        AnonymousClass229.A01(userSession).A0f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0154, code lost:
    
        if (X.C3ER.A00().A02(r6.A0A, r3) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028d  */
    @Override // X.C8I8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DoG(java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8I7.DoG(java.lang.String):void");
    }

    @Override // X.C8I8
    public final void Dp3(int i, String str) {
        C8HI c8hi = this.A00;
        C8IE c8ie = c8hi.A0m;
        UserSession userSession = c8ie.A0H;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        C24Q c24q = A00.A0K;
        c24q.A0C("recording_stop_requested", A00.A05);
        c24q.A09(A00.A05, "recorded_duration", String.valueOf(i));
        c24q.A09(A00.A05, "stop_source", str);
        Window window = c8ie.A0A.getWindow();
        window.getClass();
        window.clearFlags(128);
        ShutterButton shutterButton = c8ie.A0V;
        shutterButton.setButtonActionsEnabled(true);
        C1810981l c1810981l = c8ie.A0I;
        if (AbstractC209669Pc.A06(c1810981l.A08())) {
            shutterButton.setHandsFreeRecordingEnabled(true);
        }
        C81W c81w = C81W.A0B;
        if (c1810981l.A0W(c81w)) {
            shutterButton.setEnabled(true);
        }
        if (c1810981l.A0W(C81W.A0M) || C8IE.A04(c8ie)) {
            c8ie.A0K.A09(0);
            if (c8ie.A0X) {
                AnonymousClass835 anonymousClass835 = c8ie.A0M;
                anonymousClass835.getClass();
                anonymousClass835.setEnabled(true);
                anonymousClass835.EPa(1.0f);
            }
            c8ie.A08 = false;
        }
        InterfaceC184638He interfaceC184638He = c8ie.A05;
        if (interfaceC184638He != null) {
            String name = interfaceC184638He.getName();
            c8ie.A05 = null;
            c8ie.A0S.E4u(new Object());
            String A0R = AnonymousClass001.A0R("Video Recording Stop - PendingVideoRecordingInterceptor ", name);
            AbstractC183338Bg.A00(userSession).A0N(A0R, C8IE.A00(c8ie));
            if (c1810981l.A08.A00 == C128535rM.A00) {
                MX1.A01(userSession).A0C(false, A0R);
            }
            c8ie.A04.A03();
        } else {
            C1811981v c1811981v = c1810981l.A08;
            if (c1811981v.A00 != C208509Kk.A00) {
                c8ie.A0S.E4u(new C187818Ty(i));
            }
            if (c1810981l.A0W(c81w)) {
                C8HI c8hi2 = c8ie.A0J.A00;
                c8hi2.A08.A08();
                if (c8hi2.A1S) {
                    Context context = c8hi2.A0T.getContext();
                    C14360o3.A0B(context, 0);
                    if (C6PX.A00(context)) {
                        ((AnonymousClass834) c8hi2.A0s).EhF(true, false);
                    }
                }
            } else {
                C8IC c8ic = c8ie.A0W;
                C0fX.A00(c8ic, c8ic.A03);
                c8ic.A00 = -1L;
                C174757qB c174757qB = c8ie.A01;
                if (c174757qB == null) {
                    AbstractC12120kG.A01("IgCameraViewRecordingController", "mCameraController was null when calling performStopVideoRecording()");
                } else {
                    c174757qB.A0R(C05F.A00);
                }
            }
            if (c1811981v.A00 == C128535rM.A00) {
                MX1.A01(userSession).A0C(true, null);
            }
        }
        c8hi.A0B.A0I.A08(true);
    }

    @Override // X.C8I8
    public final void Dzi(float f) {
        C8XV c8xv = this.A00.A0B;
        if (c8xv.A05.A08.A00 instanceof C81V) {
            c8xv.A0M.Dzi(f);
        }
    }
}
