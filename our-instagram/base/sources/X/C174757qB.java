package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.facebook.onecamera.outputcontrollers.touchgesture.basic.BasicTouchGestureOutputController;
import com.instagram.camera.capture.IgCameraFocusView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174757qB implements InterfaceC174767qC {
    public AbstractC184688Hj A01;
    public C177447ue A02;
    public InterfaceC1814282u A03;
    public BDp A04;
    public IgCameraFocusView A05;
    public C196528mi A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public InterfaceC178407wE A0B;
    public InterfaceC174657pz A0C;
    public Boolean A0D;
    public final int A0E;
    public final View A0F;
    public final C178577wV A0G;
    public final C174747qA A0H;
    public final UserSession A0J;
    public final InterfaceC174637px A0L;
    public final InterfaceC1813882q A0M;
    public int A00 = 1;
    public boolean A0A = false;
    public final C174777qD A0N = new C174777qD(this);
    public final Runnable A0O = new Runnable() { // from class: X.7qE
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            C174757qB c174757qB = C174757qB.this;
            if (C174757qB.A06(c174757qB)) {
                ((InterfaceC179827yW) c174757qB.A0G.A02(InterfaceC179827yW.A00)).DIe();
                z = false;
            } else {
                z = true;
            }
            c174757qB.A08 = z;
        }
    };
    public final C174797qF A0I = new Object();
    public final ArrayList A0K = new ArrayList();

    public static boolean A05(EnumC222819sM enumC222819sM, C174757qB c174757qB) {
        String name = enumC222819sM.name();
        String.format("Processing toggleTo inputType: %s", name);
        C196518mh A01 = A01(c174757qB);
        if (A01 != null && A01.A01 != enumC222819sM) {
            boolean A0B = A01.A0B(enumC222819sM, false);
            BDp bDp = c174757qB.A04;
            if (bDp != null) {
                if (enumC222819sM.ordinal() != 0) {
                    c174757qB.A0A = true;
                    bDp.Dre();
                } else {
                    bDp.Drd();
                    return A0B;
                }
            }
            return A0B;
        }
        String.format("inputType is already %s, return early", name);
        return false;
    }

    public final void A0M(AbstractC184688Hj abstractC184688Hj, boolean z) {
        C175007qa c175007qa;
        if (A06(this) && (c175007qa = ((BasicCameraOutputController) A02(this)).A04) != null) {
            c175007qa.A0N.Chr(abstractC184688Hj, true, true, z);
        }
    }

    public final void A0N(AbstractC184688Hj abstractC184688Hj, boolean z) {
        C175007qa c175007qa;
        if (A06(this) && (c175007qa = ((BasicCameraOutputController) A02(this)).A04) != null) {
            c175007qa.A0N.F9E(abstractC184688Hj, true, true, z);
        }
    }

    @Override // X.InterfaceC174767qC
    public final void A9h(InterfaceC25160BBf interfaceC25160BBf, int i) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.A9h(interfaceC25160BBf, 1);
        }
    }

    @Override // X.InterfaceC174767qC
    public final void EYx(boolean z) {
        this.A0D = true;
    }

    @Override // X.InterfaceC174767qC
    public final boolean EjF() {
        return true;
    }

    @Override // X.InterfaceC174767qC
    public final void Eod(AbstractC184688Hj abstractC184688Hj) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.E3g(null);
        }
    }

    private C177267uM A00(String str) {
        C177257uL c177257uL;
        C174887qO c174887qO = new C174887qO();
        C177257uL c177257uL2 = AbstractC174897qP.A00;
        Integer valueOf = Integer.valueOf(this.A00);
        Map map = c174887qO.A00;
        map.put(c177257uL2, valueOf);
        map.put(AbstractC174897qP.A02, this.A0L);
        map.put(AbstractC174897qP.A01, this.A0C);
        map.put(C177267uM.A02, Boolean.valueOf(this.A07));
        map.put(C177267uM.A04, ((C22F) AnonymousClass229.A01(this.A0J)).A04.A0L);
        map.put(InterfaceC178617wZ.A00, this.A0N);
        if (str != null) {
            map.put(C177267uM.A01, str);
        }
        Boolean bool = this.A0D;
        if (bool != null) {
            map.put(AbstractC174897qP.A03, bool);
        }
        if (this.A0H.A00 != null) {
            c177257uL = InterfaceC180117z1.A00;
        } else {
            c177257uL = AbstractC174897qP.A04;
        }
        map.put(c177257uL, this.A0I);
        return new C177267uM(c174887qO);
    }

    public static C196518mh A01(C174757qB c174757qB) {
        InterfaceC175747ro interfaceC175747ro = (InterfaceC175747ro) c174757qB.A0G.A01(InterfaceC175747ro.A02);
        if (interfaceC175747ro instanceof C196518mh) {
            return (C196518mh) interfaceC175747ro;
        }
        return null;
    }

    public static InterfaceC179847yZ A02(C174757qB c174757qB) {
        return (InterfaceC179847yZ) c174757qB.A0G.A02(InterfaceC179847yZ.A00);
    }

    public static Object A03(C176807tc c176807tc, C174757qB c174757qB) {
        if (c174757qB.A02 != null) {
            if (!A06(c174757qB)) {
                AbstractC12120kG.A01("OneCameraController", "The camera has been disconnected, so this setting is stale.");
            }
            return c174757qB.A02.A03.A02(c176807tc);
        }
        throw new IllegalStateException("Can not get camera facing, the camera has not been initialised.");
    }

    public static void A04(C174757qB c174757qB) {
        C196518mh A01;
        int i;
        if (c174757qB.A04 != null && (A01 = A01(c174757qB)) != null) {
            A01.A0A();
            C9MM c9mm = new C9MM(true);
            EnumC222819sM enumC222819sM = EnumC222819sM.A04;
            BDp bDp = c174757qB.A04;
            Integer valueOf = Integer.valueOf(bDp.BI0());
            int BIB = bDp.BIB();
            Integer valueOf2 = Integer.valueOf(BIB);
            InterfaceC178067vf Aq0 = ((AbstractC179687yI) A01).A00.Aq0(enumC222819sM.A00);
            C14360o3.A07(Aq0);
            if (Aq0 instanceof C212349b3) {
                C212349b3 c212349b3 = (C212349b3) Aq0;
                if (valueOf != null) {
                    i = valueOf.intValue();
                } else {
                    i = c212349b3.A01;
                }
                c212349b3.A01 = i;
                if (valueOf2 == null) {
                    BIB = c212349b3.A02;
                }
                c212349b3.A02 = BIB;
                C177107u6 c177107u6 = new C177107u6(c9mm, new C179387xo());
                c177107u6.A02.A07 = true;
                c212349b3.A06 = c177107u6;
            }
            c174757qB.A04.DM2(new Surface(c9mm.getSurfaceTexture()));
        }
    }

    public static boolean A06(C174757qB c174757qB) {
        C175007qa c175007qa;
        C178577wV c178577wV = c174757qB.A0G;
        if (c178577wV.A08()) {
            C174907qQ c174907qQ = InterfaceC178617wZ.A01;
            C178187vs c178187vs = (C178187vs) c178577wV.A00;
            C178187vs.A01(c178187vs);
            C179767yQ c179767yQ = (C179767yQ) ((InterfaceC178617wZ) ((InterfaceC178627wa) c178187vs.A02.A00(c174907qQ)));
            if (c179767yQ.A03.get() && (c175007qa = c179767yQ.A00) != null && c175007qa.A0N.isConnected()) {
                return true;
            }
        }
        return false;
    }

    public final int A07() {
        if (this.A02 != null) {
            if (!A06(this)) {
                AbstractC12120kG.A01("OneCameraController", "messageThe camera has been disconnected, so this value is stale.");
            }
            return this.A02.A01;
        }
        return this.A00;
    }

    public final int A08() {
        C177447ue c177447ue = this.A02;
        if (c177447ue != null) {
            Object A02 = c177447ue.A03.A02(AbstractC176797tb.A0B);
            A02.getClass();
            return ((Number) A02).intValue();
        }
        return 0;
    }

    public final int A09() {
        Number number;
        C177447ue c177447ue = this.A02;
        if (c177447ue == null || (number = (Number) c177447ue.A03.A02(AbstractC176797tb.A0e)) == null) {
            return 0;
        }
        return number.intValue();
    }

    public final Rect A0A() {
        Rect rect = (Rect) A03(AbstractC176797tb.A0p, this);
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public final void A0B() {
        this.A0H.A00().setVisibility(0);
    }

    public final void A0C() {
        C178577wV c178577wV = this.A0G;
        if (c178577wV.A08()) {
            c178577wV.A05();
            Iterator it = this.A0K.iterator();
            while (it.hasNext()) {
                C174877qN c174877qN = (C174877qN) it.next();
                c174877qN.A00.onPaused();
                InterfaceC179827yW A00 = C174847qK.A00(c174877qN.A01);
                if (A00 != null) {
                    C16930sl c16930sl = C16930sl.A00;
                    InterfaceC179497xz interfaceC179497xz = ((C179797yT) A00).A00;
                    if (interfaceC179497xz != null) {
                        ((C179487xy) interfaceC179497xz).A03.A02(c16930sl);
                    }
                }
            }
        }
    }

    public final void A0D() {
        C196518mh A01;
        int i;
        if (this.A04 != null && (A01 = A01(this)) != null) {
            C9MM c9mm = new C9MM(true);
            EnumC222819sM enumC222819sM = EnumC222819sM.A04;
            BDp bDp = this.A04;
            Integer valueOf = Integer.valueOf(bDp.BI0());
            int BIB = bDp.BIB();
            Integer valueOf2 = Integer.valueOf(BIB);
            InterfaceC178067vf Aq0 = ((AbstractC179687yI) A01).A00.Aq0(enumC222819sM.A00);
            C14360o3.A07(Aq0);
            if (Aq0 instanceof C212349b3) {
                C212349b3 c212349b3 = (C212349b3) Aq0;
                if (valueOf != null) {
                    i = valueOf.intValue();
                } else {
                    i = c212349b3.A01;
                }
                c212349b3.A01 = i;
                if (valueOf2 == null) {
                    BIB = c212349b3.A02;
                }
                c212349b3.A02 = BIB;
                C177107u6 c177107u6 = new C177107u6(c9mm, new C179387xo());
                c177107u6.A02.A07 = true;
                c212349b3.A06 = c177107u6;
            }
            this.A04.EbR(new Surface(c9mm.getSurfaceTexture()));
        }
    }

    public final void A0G(InterfaceC184558Gw interfaceC184558Gw) {
        C175007qa c175007qa;
        if (this.A0G.A08() && (c175007qa = ((BasicCameraOutputController) A02(this)).A04) != null) {
            c175007qa.A0N.EG0(interfaceC184558Gw);
        }
    }

    public final void A0I(AbstractC184688Hj abstractC184688Hj) {
        Context context = this.A0H.A00().getContext();
        AbstractC175047qe.A00(context.getApplicationContext(), null, AnonymousClass820.A00(context), false).BYA(abstractC184688Hj);
    }

    public final void A0K(AbstractC184688Hj abstractC184688Hj, int i, int i2) {
        C175007qa c175007qa = ((C179717yL) ((InterfaceC179727yM) this.A0G.A01(InterfaceC179727yM.A00))).A04;
        if (c175007qa == null) {
            abstractC184688Hj.A01(new IllegalStateException("CameraViewController is null"));
        } else {
            c175007qa.A0O.Bfi(abstractC184688Hj, i, i2);
        }
    }

    public final void A0L(final AbstractC184688Hj abstractC184688Hj, final AbstractC184688Hj abstractC184688Hj2) {
        C177447ue c177447ue = this.A02;
        boolean z = false;
        if (c177447ue != null) {
            AbstractC176797tb abstractC176797tb = c177447ue.A03;
            C176807tc c176807tc = AbstractC176797tb.A0e;
            if (abstractC176797tb.A02(c176807tc) != null && (((Number) this.A02.A03.A02(c176807tc)).intValue() == 2 || ((Number) this.A02.A03.A02(c176807tc)).intValue() == 1)) {
                z = true;
            }
        }
        C196548mk c196548mk = new C196548mk();
        c196548mk.A01(C196548mk.A05, false);
        c196548mk.A01(C196548mk.A08, false);
        C196558ml c196558ml = C196548mk.A06;
        c196548mk.A01(c196558ml, Boolean.valueOf(z));
        InterfaceC179727yM interfaceC179727yM = (InterfaceC179727yM) this.A0G.A01(InterfaceC179727yM.A00);
        final InterfaceC196578mn interfaceC196578mn = new InterfaceC196578mn() { // from class: X.8mm
            @Override // X.InterfaceC196578mn
            public final void D2R() {
            }

            @Override // X.InterfaceC196578mn
            public final void DEF(Exception exc) {
                abstractC184688Hj.A01(exc);
            }

            @Override // X.InterfaceC196578mn
            public final void DYZ(C196748n4 c196748n4) {
                abstractC184688Hj.A02(c196748n4);
            }

            @Override // X.InterfaceC196578mn
            public final void Dbk(float f) {
                C196528mi c196528mi = this.A06;
                if (c196528mi != null) {
                    c196528mi.A00.A0F.setPhotoCaptureProgress(f);
                }
            }

            @Override // X.InterfaceC196578mn
            public final void Dtw(C196748n4 c196748n4) {
                abstractC184688Hj2.A02(c196748n4);
            }
        };
        final C179717yL c179717yL = (C179717yL) interfaceC179727yM;
        Integer num = C05F.A0C;
        if (Boolean.TRUE.equals(c196548mk.A00(c196558ml))) {
            num = C05F.A0Y;
        }
        InterfaceC178407wE interfaceC178407wE = c179717yL.A00;
        AbstractC196588mo.A00(interfaceC178407wE, num, "BasicPhotoCaptureCoordinator", c179717yL.hashCode());
        C175007qa c175007qa = c179717yL.A04;
        if (c175007qa != null) {
            c175007qa.A0D(new InterfaceC196578mn() { // from class: X.8mp
                @Override // X.InterfaceC196578mn
                public final void D2R() {
                    interfaceC196578mn.D2R();
                }

                @Override // X.InterfaceC196578mn
                public final void DEF(Exception exc) {
                    C179717yL c179717yL2 = C179717yL.this;
                    InterfaceC178407wE interfaceC178407wE2 = c179717yL2.A00;
                    AbstractC196788n8.A00(new AbstractC223559ty(10015, exc), interfaceC178407wE2, "BasicPhotoCaptureCoordinator", "high", c179717yL2.hashCode());
                    interfaceC178407wE2.EmV("OneCamera", exc, false);
                    interfaceC196578mn.DEF(exc);
                }

                @Override // X.InterfaceC196578mn
                public final void DYZ(C196748n4 c196748n4) {
                    interfaceC196578mn.DYZ(c196748n4);
                }

                @Override // X.InterfaceC196578mn
                public final void Dbk(float f) {
                    interfaceC196578mn.Dbk(f);
                }

                @Override // X.InterfaceC196578mn
                public final void Dtw(C196748n4 c196748n4) {
                    C179717yL c179717yL2 = C179717yL.this;
                    AbstractC196788n8.A01(c179717yL2.A00, "BasicPhotoCaptureCoordinator", c179717yL2.hashCode());
                    interfaceC196578mn.Dtw(c196748n4);
                }
            }, c196548mk);
            return;
        }
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(10015, "CameraViewController is null");
        AbstractC196788n8.A00(abstractC223559ty, interfaceC178407wE, "BasicPhotoCaptureCoordinator", "high", c179717yL.hashCode());
        interfaceC196578mn.DEF(abstractC223559ty);
    }

    public final void A0O(InterfaceC1814282u interfaceC1814282u) {
        if (interfaceC1814282u != null && CWZ()) {
            C177447ue c177447ue = this.A02;
            c177447ue.getClass();
            interfaceC1814282u.DM7(c177447ue);
        }
        this.A03 = interfaceC1814282u;
    }

    public final void A0P(C55U c55u, String str) {
        ViewGroup viewGroup;
        C178577wV c178577wV = this.A0G;
        UserSession userSession = this.A0J;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        String str2 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (c55u != null) {
            A00.A08(c55u, str2);
        }
        C174747qA c174747qA = this.A0H;
        SurfaceView surfaceView = c174747qA.A00;
        if (surfaceView != null && (viewGroup = c174747qA.A02) != null) {
            viewGroup.addView(surfaceView, 0);
            c174747qA.A02 = null;
        }
        InterfaceC178197vt interfaceC178197vt = c178577wV.A00;
        if (((C178187vs) interfaceC178197vt).A07 == 4) {
            c178577wV.A06();
            Iterator it = this.A0K.iterator();
            while (it.hasNext()) {
                ((C174877qN) it.next()).A00.onResumed();
            }
            return;
        }
        interfaceC178197vt.AJP(A00(str));
    }

    public final void A0Q(C55U c55u, String str) {
        C178577wV c178577wV = this.A0G;
        if (c178577wV.A08()) {
            c178577wV.A07(A00(str));
            return;
        }
        UserSession userSession = this.A0J;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        String str2 = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (c55u != null) {
            A00.A08(c55u, str2);
        }
        c178577wV.A00.AJP(A00(str));
    }

    public final void A0R(Integer num) {
        ((InterfaceC179747yO) this.A0G.A01(InterfaceC179747yO.A00)).Eoo(num);
    }

    public final void A0S(boolean z) {
        ViewOnTouchListenerC176317so viewOnTouchListenerC176317so = ((BasicTouchGestureOutputController) ((InterfaceC179857yb) this.A0G.A02(InterfaceC179857yb.A00))).A01;
        if (viewOnTouchListenerC176317so != null) {
            viewOnTouchListenerC176317so.A02.A00 = z;
        }
    }

    public final boolean A0U() {
        C196518mh A01;
        boolean z = false;
        if (((C178187vs) this.A0G.A00).A07 != 0) {
            z = true;
        }
        if (!z || (A01 = A01(this)) == null || A01.A01 != EnumC222819sM.A04) {
            return false;
        }
        return true;
    }

    public final boolean A0V() {
        return ((InterfaceC179747yO) this.A0G.A01(InterfaceC179747yO.A00)).Cbe();
    }

    public final boolean A0W() {
        C175007qa c175007qa;
        C178577wV c178577wV = this.A0G;
        if (((C178187vs) c178577wV.A00).A07 != 0 && (c175007qa = ((C179717yL) ((InterfaceC179727yM) c178577wV.A01(InterfaceC179727yM.A00))).A04) != null && c175007qa.A0N.CeD()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC174767qC
    public final void AJS(AbstractC184688Hj abstractC184688Hj, InterfaceC175497rP interfaceC175497rP, C55U c55u) {
        this.A01 = abstractC184688Hj;
        C178577wV c178577wV = this.A0G;
        if (c178577wV.A08()) {
            c178577wV.A07(A00(null));
            return;
        }
        UserSession userSession = this.A0J;
        C183348Bh A00 = AbstractC183338Bg.A00(userSession);
        String str = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (c55u != null) {
            A00.A08(c55u, str);
        }
        c178577wV.A00.AJP(A00(null));
    }

    @Override // X.InterfaceC174767qC
    public final InterfaceC178407wE B4Z() {
        InterfaceC178407wE interfaceC178407wE = this.A0B;
        if (interfaceC178407wE == null) {
            C178577wV c178577wV = this.A0G;
            InterfaceC178407wE interfaceC178407wE2 = (InterfaceC178407wE) c178577wV.A00.Aq1(InterfaceC178407wE.A00);
            this.A0B = interfaceC178407wE2;
            return interfaceC178407wE2;
        }
        return interfaceC178407wE;
    }

    @Override // X.InterfaceC174767qC
    public final void E1D() {
        this.A0M.Cau(this.A0O);
    }

    @Override // X.InterfaceC174767qC
    public final void EbS(SurfaceTexture surfaceTexture, int i, int i2) {
        AbstractC179687yI abstractC179687yI = (AbstractC179687yI) ((BEJ) this.A0G.A01(BEJ.A00));
        InterfaceC178067vf Aq0 = abstractC179687yI.A00.Aq0(InterfaceC179867yc.A00);
        C14360o3.A07(Aq0);
        ((InterfaceC179867yc) Aq0).EbQ(surfaceTexture, i, i2);
    }

    @Override // X.InterfaceC174767qC
    public final void EhV(float f) {
        C177447ue c177447ue = this.A02;
        if (c177447ue != null) {
            int intValue = ((Number) c177447ue.A02.A01(AbstractC176767tY.A0j)).intValue();
            int intValue2 = ((Number) c177447ue.A02.A01(AbstractC176767tY.A0l)).intValue();
            InterfaceC179847yZ A02 = A02(this);
            int min = Math.min(intValue, (int) Math.max(intValue * f, intValue2));
            C175007qa c175007qa = ((BasicCameraOutputController) A02).A04;
            if (c175007qa != null) {
                c175007qa.A0N.EhW(null, min);
            }
        }
    }

    @Override // X.InterfaceC174767qC
    public final void disconnect() {
        this.A0G.A04();
        C174747qA c174747qA = this.A0H;
        SurfaceView surfaceView = c174747qA.A00;
        if (surfaceView != null && c174747qA.A02 == null) {
            ViewGroup viewGroup = (ViewGroup) surfaceView.getParent();
            c174747qA.A02 = viewGroup;
            if (viewGroup != null) {
                viewGroup.removeView(surfaceView);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x013a, code lost:
    
        if (X.C18U.A06(r7, r17, 36317221253288914L) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01db  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.7qF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C174757qB(android.view.View r11, X.EnumC177227uI r12, X.InterfaceC174657pz r13, X.InterfaceC174637px r14, X.InterfaceC1813882q r15, X.C174747qA r16, com.instagram.common.session.UserSession r17, java.lang.String r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174757qB.<init>(android.view.View, X.7uI, X.7pz, X.7px, X.82q, X.7qA, com.instagram.common.session.UserSession, java.lang.String, int, boolean):void");
    }

    public final void A0E(AGu aGu, AbstractC184688Hj abstractC184688Hj, AbstractC184688Hj abstractC184688Hj2, AbstractC184688Hj abstractC184688Hj3, C23106AGs c23106AGs) {
        this.A0A = A0U();
        ((InterfaceC179747yO) this.A0G.A01(InterfaceC179747yO.A00)).EoA(aGu, c23106AGs, new C22912A8i(abstractC184688Hj, abstractC184688Hj3, abstractC184688Hj2, this));
    }

    public final void A0F(InterfaceC184558Gw interfaceC184558Gw) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.A9i(interfaceC184558Gw);
        }
    }

    public final void A0H(InterfaceC174807qG interfaceC174807qG) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.EG1(interfaceC174807qG);
        }
    }

    public final void A0J(AbstractC184688Hj abstractC184688Hj, int i) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            C176837tf c176837tf = new C176837tf();
            c176837tf.A01(AbstractC176797tb.A0B, Integer.valueOf(i));
            c175007qa.A0N.Cpo(abstractC184688Hj, c176837tf.A00());
        }
    }

    public final boolean A0T() {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null && c175007qa.A0G()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC174767qC
    public final C1819085a ALa() {
        return B4Z().ALa();
    }

    @Override // X.InterfaceC174767qC
    public final void ARY(HashMap hashMap, boolean z) {
        InterfaceC179847yZ A02 = A02(this);
        C176837tf c176837tf = new C176837tf();
        c176837tf.A01(AbstractC176797tb.A0M, Boolean.valueOf(z));
        c176837tf.A01(AbstractC176797tb.A02, hashMap);
        C177007tw A00 = c176837tf.A00();
        AbstractC184688Hj abstractC184688Hj = new AbstractC184688Hj() { // from class: X.8pM
        };
        C175007qa c175007qa = ((BasicCameraOutputController) A02).A04;
        if (c175007qa != null) {
            c175007qa.A0N.Cpo(abstractC184688Hj, A00);
        } else {
            abstractC184688Hj.A01(new RuntimeException("camera output controller is already released."));
        }
    }

    @Override // X.InterfaceC174767qC
    public final void CKl(AbstractC184688Hj abstractC184688Hj) {
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) A02(this);
        Boolean bool = basicCameraOutputController.A00;
        if (bool != null) {
            BasicCameraOutputController.A03(BasicCameraOutputController.A00(basicCameraOutputController).Ajq(), abstractC184688Hj, bool);
        } else {
            BasicCameraOutputController.A00(basicCameraOutputController).CKl(new C202788xw(basicCameraOutputController, abstractC184688Hj));
        }
    }

    @Override // X.InterfaceC174767qC
    public final void CKy(AbstractC184688Hj abstractC184688Hj) {
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) A02(this);
        Boolean bool = basicCameraOutputController.A01;
        if (bool != null) {
            BasicCameraOutputController.A03(BasicCameraOutputController.A00(basicCameraOutputController).Ajq(), abstractC184688Hj, bool);
        } else {
            BasicCameraOutputController.A00(basicCameraOutputController).CKy(new C202798xx(basicCameraOutputController, abstractC184688Hj));
        }
    }

    @Override // X.InterfaceC174767qC
    public final boolean CKz() {
        BasicCameraOutputController basicCameraOutputController = (BasicCameraOutputController) A02(this);
        Boolean bool = basicCameraOutputController.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        return BasicCameraOutputController.A00(basicCameraOutputController).CKn(1);
    }

    @Override // X.InterfaceC174767qC
    public final boolean CR9() {
        if (1 == A07()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC174767qC
    public final boolean CWZ() {
        if (A06(this) && this.A02 != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC174767qC
    public final void EFz(InterfaceC25160BBf interfaceC25160BBf) {
        C175007qa c175007qa;
        if (A06(this) && (c175007qa = ((BasicCameraOutputController) A02(this)).A04) != null) {
            c175007qa.A0N.EFz(interfaceC25160BBf);
        }
    }

    @Override // X.InterfaceC174767qC
    public final void EJk(Boolean bool) {
        C196518mh A01 = A01(this);
        if (A01 != null) {
            EnumC222819sM enumC222819sM = A01.A01;
            EnumC222819sM enumC222819sM2 = EnumC222819sM.A03;
            if (enumC222819sM != enumC222819sM2) {
                A01.A0B(enumC222819sM2, false);
                BDp bDp = this.A04;
                if (bDp != null && !bool.booleanValue()) {
                    bDp.Drd();
                }
            }
        }
    }

    @Override // X.InterfaceC174767qC
    public final void EUf(AbstractC184688Hj abstractC184688Hj) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.ARu(abstractC184688Hj);
        }
    }

    @Override // X.InterfaceC174767qC
    public final void EUn(boolean z) {
        if (A06(this)) {
            InterfaceC179847yZ A02 = A02(this);
            C176837tf c176837tf = new C176837tf();
            c176837tf.A01(AbstractC176797tb.A0U, Boolean.valueOf(z));
            C177007tw A00 = c176837tf.A00();
            AbstractC184688Hj abstractC184688Hj = new AbstractC184688Hj() { // from class: X.7t2
            };
            C175007qa c175007qa = ((BasicCameraOutputController) A02).A04;
            if (c175007qa != null) {
                c175007qa.A0N.Cpo(abstractC184688Hj, A00);
            } else {
                abstractC184688Hj.A01(new RuntimeException("camera output controller is already released."));
            }
        }
    }

    @Override // X.InterfaceC174767qC
    public final void Ecy(InterfaceC174657pz interfaceC174657pz) {
        this.A0C = interfaceC174657pz;
    }

    @Override // X.InterfaceC174767qC
    public final void Epe(AbstractC184688Hj abstractC184688Hj) {
        C175007qa c175007qa = ((BasicCameraOutputController) A02(this)).A04;
        if (c175007qa != null) {
            c175007qa.A0B(abstractC184688Hj);
        }
    }

    @Override // X.InterfaceC174767qC
    public final void setInitialCameraFacing(int i) {
        this.A00 = i;
    }
}
