package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.TifuViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

/* renamed from: X.9Dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206849Dp extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206849Dp(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC16660sJ interfaceC16660sJ;
        boolean z;
        InterfaceC16660sJ interfaceC16660sJ2;
        Object valueOf;
        InterfaceC16820sZ interfaceC16820sZ;
        InterfaceC16660sJ interfaceC16660sJ3;
        InterfaceC1132159j interfaceC1132159j;
        float floatValue;
        Object value;
        String str;
        String str2;
        Integer num;
        C5Hc c5Hc;
        C5Hc c5Hc2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        C2YN c2yn;
        Object[] objArr;
        int i;
        C120735dJ c120735dJ;
        switch (this.A00) {
            case 0:
                String str3 = (String) obj;
                C14360o3.A0B(str3, 0);
                ((InterfaceC80043ht) this.A01).DK7(str3);
                return C0eB.A00;
            case 1:
                C2YJ c2yj = (C2YJ) obj;
                C14360o3.A0B(c2yj, 0);
                View view = c2yj.A00;
                C14360o3.A06(view);
                C85453ra c85453ra = (C85453ra) this.A01;
                C85233rE c85233rE = c85453ra.A00;
                boolean z6 = !c85233rE.A0G;
                Context context = view.getContext();
                int i2 = 2131976161;
                if (z6) {
                    i2 = 2131965112;
                }
                String string = context.getString(i2);
                C14360o3.A0A(string);
                view.announceForAccessibility(string);
                c85233rE.A05.A0A.invoke(new DGY(c2yj, 25));
                interfaceC16660sJ2 = c85453ra.A01;
                if (interfaceC16660sJ2 != null) {
                    valueOf = Boolean.valueOf(z6);
                    interfaceC16660sJ2.invoke(valueOf);
                }
                return C0eB.A00;
            case 2:
                interfaceC16820sZ = ((C85453ra) this.A01).A00.A05.A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 3:
                final C85233rE c85233rE2 = (C85233rE) this.A01;
                InterfaceC14020nS A00 = C14120nc.A00();
                C14360o3.A07(A00);
                A00.ATO(new AbstractRunnableC14200nk() { // from class: X.3uF
                    @Override // java.lang.Runnable
                    public final void run() {
                        C85233rE.this.A05.A06.invoke();
                    }

                    {
                        super(1874505567, 3, false, false);
                    }
                });
                return C0eB.A00;
            case 4:
                ((C85233rE) this.A01).A05.A04.invoke();
                z = true;
                return Boolean.valueOf(z);
            case 5:
                interfaceC16820sZ = ((C85233rE) this.A01).A05.A03;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 6:
                interfaceC16820sZ = ((C85103qy) ((InterfaceC74963Ym) this.A01).getValue()).A00;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 7:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ3 = ((C85103qy) ((InterfaceC74963Ym) this.A01).getValue()).A0B;
                interfaceC16660sJ3.invoke(obj);
                return C0eB.A00;
            case 8:
                interfaceC16820sZ = ((C85103qy) ((InterfaceC74963Ym) this.A01).getValue()).A03;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 9:
                interfaceC16820sZ = ((C85103qy) ((InterfaceC74963Ym) this.A01).getValue()).A04;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 10:
                C14360o3.A0B(obj, 0);
                C77133cz.A00("onCommentButtonVisible", new D8M(21, obj, this.A01));
                return C0eB.A00;
            case 11:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ3 = ((C85473rc) this.A01).A00;
                interfaceC16660sJ3.invoke(obj);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                return interfaceC16660sJ.invoke(obj);
            case 14:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ3 = ((C85473rc) this.A01).A02;
                interfaceC16660sJ3.invoke(obj);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ = ((C85473rc) this.A01).A01;
                return interfaceC16660sJ.invoke(obj);
            case 16:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ = ((C85473rc) this.A01).A03;
                return interfaceC16660sJ.invoke(obj);
            case 17:
                C14360o3.A0B(obj, 0);
                ((InterfaceC74953Yl) this.A01).Egh(obj);
                return C0eB.A00;
            case 18:
                interfaceC1132159j = (InterfaceC1132159j) obj;
                C14360o3.A0B(interfaceC1132159j, 0);
                floatValue = 1.0f - ((Number) ((C5Y1) this.A01).A04.getValue()).floatValue();
                interfaceC1132159j.Ed7(floatValue);
                interfaceC1132159j.Ed8(floatValue);
                interfaceC1132159j.EPa(floatValue);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                interfaceC1132159j = (InterfaceC1132159j) obj;
                C14360o3.A0B(interfaceC1132159j, 0);
                C5Y2 c5y2 = ((C5Y1) this.A01).A04;
                interfaceC1132159j.Ed7(((Number) c5y2.getValue()).floatValue());
                interfaceC1132159j.Ed8(((Number) c5y2.getValue()).floatValue());
                floatValue = ((Number) c5y2.getValue()).floatValue();
                interfaceC1132159j.EPa(floatValue);
                return C0eB.A00;
            case 20:
                C3QU c3qu = (C3QU) obj;
                C14360o3.A0B(c3qu, 0);
                ((C75113Zb) this.A01).A0P(c3qu);
                return C0eB.A00;
            case 21:
                interfaceC16820sZ = (InterfaceC16820sZ) ((C206259Bi) ((C89693zA) this.A01).A00.A00).A02;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 22:
                interfaceC16820sZ = (InterfaceC16820sZ) ((C206209Bd) ((C89673z8) this.A01).A00.A01).A00;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 23:
                C3QU c3qu2 = (C3QU) obj;
                C14360o3.A0B(c3qu2, 0);
                ((C75113Zb) this.A01).A0Q(c3qu2);
                return C0eB.A00;
            case 24:
                C07X c07x = (C07X) obj;
                C14360o3.A0A(c07x);
                AbstractC23641Du.A05(AnonymousClass191.A00, new MCG(this.A01, c07x, (InterfaceC23621Ds) null, 27), C07Y.A00(c07x));
                return C0eB.A00;
            case 25:
                String str4 = (String) obj;
                C14360o3.A0B(str4, 0);
                TifuViewModel tifuViewModel = (TifuViewModel) this.A01;
                C132125xp c132125xp = tifuViewModel.A07;
                C4dV c4dV = tifuViewModel.A09;
                c132125xp.A00(str4, c4dV.A06, c4dV.A07);
                return C0eB.A00;
            case 26:
                C14360o3.A0B(obj, 0);
                TifuViewModel tifuViewModel2 = (TifuViewModel) this.A01;
                C0UO c0uo = tifuViewModel2.A0G;
                Iterator it = ((C132335yC) c0uo.getValue()).A06.iterator();
                int i3 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!C14360o3.A0K(((C9C6) it.next()).A03, obj)) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                C132135xq c132135xq = tifuViewModel2.A02;
                String A0O = AnonymousClass001.A0O("tifu_post_", i3);
                C14360o3.A0B(A0O, 0);
                if (c132135xq.A00.add(A0O)) {
                    C5Hc c5Hc3 = ((C132335yC) c0uo.getValue()).A06;
                    C9C6 c9c6 = (C9C6) c5Hc3.get(i3);
                    InterfaceC132105xl interfaceC132105xl = tifuViewModel2.A06;
                    String str5 = c9c6.A03;
                    C4dV c4dV2 = tifuViewModel2.A09;
                    String str6 = c4dV2.A06;
                    String str7 = c4dV2.A07;
                    interfaceC132105xl.CmJ(Integer.valueOf(i3), Integer.valueOf(tifuViewModel2.A0A.getPosition() + 1), str5, str6, str7, ((C38321qM) c9c6.A00).A0C.getLoggingInfoToken(), AbstractC123875j1.A00(tifuViewModel2.A0E), null, null, c5Hc3.size());
                    if (c4dV2.B5n() == C1XV.A10) {
                        C23031Ai c23031Ai = tifuViewModel2.A0B;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        InterfaceC19610xo ARD = c23031Ai.A01.ARD();
                        ARD.E7G(AbstractC111324zv.A00(1072), currentTimeMillis);
                        ARD.apply();
                    }
                }
                return C0eB.A00;
            case 27:
                int intValue = ((Number) obj).intValue();
                TifuViewModel tifuViewModel3 = (TifuViewModel) this.A01;
                C05A c05a = tifuViewModel3.A0F;
                do {
                    value = c05a.getValue();
                    C132335yC c132335yC = (C132335yC) value;
                    str = c132335yC.A03;
                    str2 = c132335yC.A04;
                    num = c132335yC.A02;
                    c5Hc = c132335yC.A06;
                    c5Hc2 = c132335yC.A05;
                    z2 = c132335yC.A0A;
                    z3 = c132335yC.A07;
                    z4 = c132335yC.A08;
                    z5 = c132335yC.A09;
                    bool = c132335yC.A01;
                    C14360o3.A0B(str, 0);
                    C14360o3.A0B(str2, 1);
                    C14360o3.A0B(num, 2);
                    C14360o3.A0B(c5Hc, 3);
                    C14360o3.A0B(c5Hc2, 4);
                } while (!c05a.AIi(value, new C132335yC(bool, num, str, str2, c5Hc, c5Hc2, intValue, z2, z3, z4, z5)));
                tifuViewModel3.A0A.A01 = intValue;
                return C0eB.A00;
            case 28:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ3 = ((C132345yD) this.A01).A00;
                if (interfaceC16660sJ3 == null) {
                    C14360o3.A0F("onTifuALikeClick");
                    throw C00O.createAndThrow();
                }
                interfaceC16660sJ3.invoke(obj);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return new C0YZ(((List) this.A01).get(((Number) obj).intValue()).getClass());
            case 30:
                C86863ty c86863ty = (C86863ty) this.A01;
                ((InterfaceC16820sZ) c86863ty.A02.A01.A00).invoke();
                C75113Zb c75113Zb = c86863ty.A03;
                if (true != c75113Zb.A25) {
                    c75113Zb.A25 = true;
                }
                return C0eB.A00;
            case 31:
                C2XB c2xb = (C2XB) obj;
                C14360o3.A0B(c2xb, 0);
                C86553tT c86553tT = C86553tT.A00;
                C80323iM c80323iM = (C80323iM) this.A01;
                C9C6 c9c62 = c80323iM.A00;
                C75113Zb c75113Zb2 = c80323iM.A01;
                View view2 = c2xb.A01;
                C14360o3.A06(view2);
                MotionEvent motionEvent = c2xb.A00;
                C14360o3.A06(motionEvent);
                z = c86553tT.A01(motionEvent, view2, c9c62, c75113Zb2);
                return Boolean.valueOf(z);
            case 32:
                C107314sc c107314sc = (C107314sc) this.A01;
                InterfaceC89793zL interfaceC89793zL = C107314sc.A04;
                interfaceC16820sZ = c107314sc.A03.A0C.A03.A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 33:
                int intValue2 = ((Number) obj).intValue() + 1;
                C107314sc c107314sc2 = (C107314sc) this.A01;
                InterfaceC89793zL interfaceC89793zL2 = C107314sc.A04;
                return Integer.valueOf(intValue2 % ((List) c107314sc2.A01.A00).size());
            case 34:
            case 38:
            default:
                C2YJ c2yj2 = (C2YJ) obj;
                C14360o3.A0B(c2yj2, 0);
                ((View.OnClickListener) this.A01).onClick(c2yj2.A00);
                return C0eB.A00;
            case 35:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ3 = (InterfaceC16660sJ) this.A01;
                interfaceC16660sJ3.invoke(obj);
                return C0eB.A00;
            case 36:
                C08730cb c08730cb = C17060sy.A01;
                C3e5 c3e5 = (C3e5) this.A01;
                UserSession userSession = c3e5.A01;
                if (c08730cb.A01(userSession).getId().equals(c3e5.A04.getId())) {
                    C18920wW A02 = AbstractC12220kQ.A02(userSession);
                    InterfaceC02590Ai A002 = A02.A00(A02.A00, AbstractC111324zv.A00(2560));
                    if (A002.isSampled()) {
                        A002.AAP("tool", "");
                        A002.AAP("debug", "");
                        A002.Cht();
                    }
                }
                c3e5.A02.A00(c3e5.A00, c3e5.A03);
                return C0eB.A00;
            case 37:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 39:
                C2XB c2xb2 = (C2XB) obj;
                z = false;
                C14360o3.A0B(c2xb2, 0);
                View.OnTouchListener onTouchListener = (View.OnTouchListener) this.A01;
                if (onTouchListener != null) {
                    z = onTouchListener.onTouch(c2xb2.A01, c2xb2.A00);
                }
                return Boolean.valueOf(z);
            case 40:
                C2YF c2yf = (C2YF) obj;
                C14360o3.A0B(c2yf, 0);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
                View view3 = c2yf.A01;
                C14360o3.A06(view3);
                MotionEvent motionEvent2 = c2yf.A00;
                C14360o3.A06(motionEvent2);
                return interfaceC16620sF.invoke(view3, motionEvent2);
            case Seq.NULL_REFNUM /* 41 */:
                C2YJ c2yj3 = (C2YJ) obj;
                C14360o3.A0B(c2yj3, 0);
                interfaceC16660sJ2 = (InterfaceC16660sJ) this.A01;
                valueOf = c2yj3.A00;
                C14360o3.A06(valueOf);
                interfaceC16660sJ2.invoke(valueOf);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                C14360o3.A0B(obj, 0);
                ((AnonymousClass399) this.A01).A00.remove(obj);
                return C0eB.A00;
            case 43:
                C3YD c3yd = (C3YD) obj;
                C14360o3.A0B(c3yd, 0);
                ((C80093hy) this.A01).A02.A0A.A01 = c3yd;
                return C0eB.A00;
            case 44:
                c2yn = (C2YN) obj;
                C14360o3.A0B(c2yn, 0);
                C120735dJ c120735dJ2 = (C120735dJ) this.A01;
                objArr = new Object[]{c120735dJ2.A04.A0l};
                i = 18;
                c120735dJ = c120735dJ2;
                c2yn.A02(new C30191DRw(c120735dJ, i), objArr);
                return C0eB.A00;
            case 45:
                C77123cy c77123cy = (C77123cy) this.A01;
                C2XV.A00();
                ((Timer) c77123cy.A00).cancel();
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                interfaceC16820sZ = ((C104604nQ) this.A01).A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 47:
                c2yn = (C2YN) obj;
                C14360o3.A0B(c2yn, 0);
                C104644nU c104644nU = (C104644nU) this.A01;
                objArr = new Object[]{c104644nU.A04, Boolean.valueOf(c104644nU.A05), Integer.valueOf(c104644nU.A02.A03)};
                i = 20;
                c120735dJ = c104644nU;
                c2yn.A02(new C30191DRw(c120735dJ, i), objArr);
                return C0eB.A00;
            case 48:
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ3 = ((C79723hN) this.A01).A0A.A0M;
                interfaceC16660sJ3.invoke(obj);
                return C0eB.A00;
            case 49:
                C14360o3.A0B(obj, 0);
                ((C79723hN) this.A01).A0A.A0N.invoke(obj);
                return C0eB.A00;
        }
    }
}
