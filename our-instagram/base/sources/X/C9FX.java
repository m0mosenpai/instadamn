package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.core.app.ComponentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9FX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FX extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FX(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        String str;
        int i;
        View view;
        Object obj3;
        InterfaceC74953Yl interfaceC74953Yl;
        C127055oj c127055oj;
        switch (this.A00) {
            case 0:
                C62T c62t = (C62T) obj;
                C5Y1 c5y1 = (C5Y1) this.A04;
                C5Y2 c5y2 = c5y1.A04;
                SuspendAnimationKt.A06(c62t, c5y2);
                InterfaceC74953Yl interfaceC74953Yl2 = c62t.A06;
                Object A00 = C5Y1.A00(c5y1, interfaceC74953Yl2.getValue());
                if (!C14360o3.A0K(A00, interfaceC74953Yl2.getValue())) {
                    c5y2.A05.Egh(A00);
                    ((C5Y2) this.A03).A05.Egh(A00);
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                    if (interfaceC16660sJ != null) {
                        interfaceC16660sJ.invoke(c5y1);
                    }
                    c62t.A00();
                    ((C14510oO) this.A02).A00 = true;
                    return C0eB.A00;
                }
                obj3 = this.A01;
                c127055oj = c5y1;
                break;
            case 1:
                C127055oj c127055oj2 = (C127055oj) obj;
                C14360o3.A0B(c127055oj2, 0);
                InterfaceC74953Yl interfaceC74953Yl3 = (InterfaceC74953Yl) this.A01;
                C127035oh c127035oh = c127055oj2.A03;
                int i2 = c127035oh.A02;
                interfaceC74953Yl3.Egh(Integer.valueOf(i2));
                C6H8 c6h8 = (C6H8) this.A04;
                if (c127055oj2.A0A() && c127055oj2.A04.A01 == 1) {
                    InterfaceC74953Yl interfaceC74953Yl4 = c6h8.A04;
                    if (interfaceC74953Yl4.getValue() == EnumC132255y4.A05) {
                        int i3 = c6h8.A01 - 1;
                        int i4 = i2 - 1;
                        if (i3 > i4) {
                            i3 = i4;
                        }
                        int A03 = c127055oj2.A03(i3);
                        int A07 = c127035oh.A07(i3, true);
                        String str2 = c6h8.A07;
                        int length = A07 - (str2.length() + 4);
                        if (length < A03) {
                            length = A03;
                        }
                        C5C8 c5c8 = c6h8.A05;
                        for (C127015of c127015of : c5c8.A03(A03, length)) {
                            if (c127015of.A00 > length && AbstractC136836Hm.A00.contains(c127015of.A03)) {
                                length = c127015of.A01;
                            }
                        }
                        C5C8 subSequence = c5c8.subSequence(0, length);
                        C6C7 c6c7 = new C6C7(16);
                        c6c7.A09(str2);
                        Iterator it = AbstractC136836Hm.A01.A04(str2).iterator();
                        while (it.hasNext()) {
                            C117315Sq c117315Sq = (C117315Sq) it.next();
                            c6c7.A06(new C5W3(null, null, null, null, null, 65534, c6h8.A02, 0L, 0L), c117315Sq.A01().A00, c117315Sq.A01().A01 + 1);
                            c6c7.A0A("expand_text_span", "", c117315Sq.A01().A00, c117315Sq.A01().A01 + 1);
                        }
                        c6h8.A00 = subSequence.A01(c6c7.A02());
                        EnumC132255y4 enumC132255y4 = EnumC132255y4.A02;
                        interfaceC74953Yl4.Egh(enumC132255y4);
                        C5C8 c5c82 = c6h8.A00;
                        if (c5c82 != null && (interfaceC74953Yl = c6h8.A03) != null) {
                            interfaceC74953Yl.Egh(c5c82);
                        }
                        InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A03;
                        if (interfaceC16660sJ2 != null) {
                            interfaceC16660sJ2.invoke(enumC132255y4);
                        }
                    }
                }
                obj3 = this.A02;
                c127055oj = c127055oj2;
                break;
            case 2:
                C14360o3.A0B(obj, 0);
                AbstractC86463tJ abstractC86463tJ = (AbstractC86463tJ) this.A04;
                Object obj4 = this.A01;
                Object obj5 = this.A02;
                InterfaceC60442pS interfaceC60442pS = (InterfaceC60442pS) this.A03;
                return new ViewOnClickListenerC77633dn(abstractC86463tJ.A00, null, null, new C207279Fg(8, obj5, abstractC86463tJ, AbstractC60952qJ.A01(MSV.A00(1269), interfaceC60442pS.isOrganicEligible(), interfaceC60442pS.isSponsoredEligible()), obj, obj4), true);
            case 3:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) obj;
                C14360o3.A0B(interfaceC16820sZ, 0);
                JG2 BRu = ((C77133cz) this.A04).A01.BRu();
                C38321qM c38321qM = (C38321qM) this.A01;
                C75113Zb c75113Zb = (C75113Zb) this.A02;
                BRu.DOu(c38321qM, c75113Zb, ((InterfaceC11380iw) this.A03).getModuleName(), interfaceC16820sZ, c75113Zb.getPosition());
                return C0eB.A00;
            case 4:
                C33P c33p = (C33P) obj;
                C14360o3.A0B(c33p, 0);
                C96464Vf c96464Vf = (C96464Vf) ((C691939f) this.A03).A0L.getValue();
                C38321qM c38321qM2 = (C38321qM) this.A01;
                C75113Zb c75113Zb2 = (C75113Zb) this.A02;
                C691539b c691539b = (C691539b) this.A04;
                return c96464Vf.A01(c691539b.A00, c38321qM2, c691539b.A09, c75113Zb2, c33p);
            case 5:
                EnumC65592xv enumC65592xv = (EnumC65592xv) obj;
                C14360o3.A0B(enumC65592xv, 0);
                C5LQ c5lq = (C5LQ) ((C691939f) this.A03).A0S.getValue();
                C38321qM c38321qM3 = (C38321qM) this.A01;
                C75113Zb c75113Zb3 = (C75113Zb) this.A02;
                C691539b c691539b2 = (C691539b) this.A04;
                switch (enumC65592xv.ordinal()) {
                    case 1:
                        obj2 = new Object();
                        break;
                    case 2:
                        obj2 = new Object();
                        break;
                    case 3:
                        obj2 = new Object();
                        break;
                    case 10:
                        obj2 = new Object();
                        break;
                    case 27:
                        obj2 = new C42476IrH(c691539b2.A02);
                        break;
                    case 31:
                        obj2 = new Object();
                        break;
                    case 40:
                    case Seq.NULL_REFNUM /* 41 */:
                        obj2 = new Object();
                        break;
                    case 56:
                        obj2 = new C42477IrI(c691539b2.A02);
                        break;
                    case 57:
                        obj2 = new C76793cR(c691539b2.A02);
                        break;
                    case 66:
                        obj2 = new C42478IrJ(c691539b2.A02);
                        break;
                    case 69:
                        obj2 = new C42479IrK(c691539b2.A02);
                        break;
                    case 77:
                        obj2 = new Aj2(c691539b2.A03.CD9());
                        break;
                    case 78:
                        obj2 = new Aj3(c691539b2.A03.CDB());
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("No CTA provider for itemType ");
                        sb.append(enumC65592xv);
                        throw new IllegalArgumentException(sb.toString());
                }
                return c5lq.A00((InterfaceC76813cT) obj2, c38321qM3, c691539b2.A09, c75113Zb3);
            case 6:
                InterfaceC65702y7 interfaceC65702y7 = (InterfaceC65702y7) obj;
                C14360o3.A0B(interfaceC65702y7, 0);
                Object value = ((C691939f) this.A03).A0V.getValue();
                C38321qM c38321qM4 = (C38321qM) this.A01;
                C75113Zb c75113Zb4 = (C75113Zb) this.A02;
                InterfaceC60442pS interfaceC60442pS2 = ((C691539b) this.A04).A09;
                C14360o3.A0B(c38321qM4, 0);
                C14360o3.A0B(c75113Zb4, 1);
                C76733cL c76733cL = new C76733cL(c38321qM4);
                float A0m = c38321qM4.A0m();
                JMX BAo = c38321qM4.A0C.BAo();
                int position = c75113Zb4.getPosition();
                int position2 = c75113Zb4.getPosition();
                C30536DcJ c30536DcJ = new C30536DcJ(21, c75113Zb4, value, c38321qM4);
                C30176DRg c30176DRg = new C30176DRg(position2, 11, c38321qM4, c75113Zb4, value);
                return new C38666Gz7(new C26082BgB(7, c30536DcJ, new C43362JEd(value, 34), new C50364MLq(34, c75113Zb4, c38321qM4, value), new C50268MHx(35, c38321qM4, value), c30176DRg), interfaceC65702y7, BAo, interfaceC60442pS2, c75113Zb4, c76733cL, A0m, position);
            case 7:
                C76293bZ c76293bZ = (C76293bZ) obj;
                C14360o3.A0B(c76293bZ, 0);
                C75563aN A01 = ((C691939f) this.A03).A01();
                C38321qM c38321qM5 = (C38321qM) this.A01;
                C75113Zb c75113Zb5 = (C75113Zb) this.A02;
                C691539b c691539b3 = (C691539b) this.A04;
                return A01.A04(c691539b3.A00, c38321qM5, c691539b3.A09, c76293bZ, c75113Zb5, c691539b3.A0G);
            case 8:
                C41A c41a = (C41A) ((C691939f) this.A03).A0C.getValue();
                C38321qM c38321qM6 = (C38321qM) this.A01;
                C75113Zb c75113Zb6 = (C75113Zb) this.A02;
                int position3 = c75113Zb6.getPosition();
                C691539b c691539b4 = (C691539b) this.A04;
                Context context = c691539b4.A00;
                InterfaceC60442pS interfaceC60442pS3 = c691539b4.A09;
                C56352iT A002 = C56342iS.A00((Activity) obj);
                if (A002 != null) {
                    i = A002.AYS();
                } else {
                    i = 0;
                }
                return c41a.A00(context, c38321qM6, interfaceC60442pS3, c75113Zb6, position3, i);
            case 9:
                C38321qM c38321qM7 = (C38321qM) obj;
                C14360o3.A0B(c38321qM7, 0);
                ((InterfaceC80023hr) this.A01).DOY((InterfaceC11380iw) this.A02, (C38321qM) this.A03, c38321qM7, (C75113Zb) this.A04);
                return C0eB.A00;
            case 10:
                C14360o3.A0B(obj, 0);
                ((C76173bM) this.A04).A02.getValue();
                C38321qM c38321qM8 = (C38321qM) this.A02;
                Object obj6 = this.A03;
                InterfaceC60442pS interfaceC60442pS4 = (InterfaceC60442pS) this.A01;
                C14360o3.A0B(c38321qM8, 0);
                C14360o3.A0B(obj6, 1);
                C14360o3.A0B(interfaceC60442pS4, 3);
                C60962qK A003 = AbstractC60952qJ.A00(interfaceC60442pS4);
                boolean CdW = c38321qM8.CdW();
                boolean A5P = c38321qM8.A5P();
                boolean A5R = c38321qM8.A5R();
                User CDj = c38321qM8.A0C.CDj();
                if (CDj == null || (str = AbstractC76433bn.A00(CDj)) == null) {
                    str = "";
                }
                return new C86883u1(new C206309Bn(new C9F4(21, obj, c38321qM8), new C9FQ(20, obj, obj6, c38321qM8), new C9F4(22, obj, c38321qM8), new C9FX(9, obj, obj6, c38321qM8, A003), new C207219Fa(10, obj6, A003, obj, c38321qM8), new C207219Fa(11, obj6, A003, obj, c38321qM8), new C207219Fa(12, obj6, A003, obj, c38321qM8)), str, CdW, A5P, A5R);
            case 11:
                C14360o3.A0B(obj, 0);
                C86823tu c86823tu = (C86823tu) ((C76173bM) this.A04).A01.getValue();
                C38321qM c38321qM9 = (C38321qM) this.A02;
                Object obj7 = this.A03;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A01;
                C14360o3.A0B(c38321qM9, 0);
                C14360o3.A0B(obj7, 1);
                C14360o3.A0B(interfaceC11380iw, 3);
                String id = c38321qM9.getId();
                if (id != null) {
                    UserSession userSession = c86823tu.A00;
                    String A072 = AbstractC41071vF.A07(userSession, c38321qM9);
                    String BNT = c38321qM9.A0C.BNT();
                    InterfaceC104834np B5i = c38321qM9.A0C.B5i();
                    long A0l = (long) c38321qM9.A0l();
                    UserSession userSession2 = AbstractC65512xn.A00(userSession).A00;
                    C06090Tz c06090Tz = C06090Tz.A05;
                    boolean A06 = C18U.A06(c06090Tz, userSession2, 36329238572056795L);
                    double A004 = C18U.A00(c06090Tz, AbstractC65512xn.A00(userSession).A00, 37173663502238308L);
                    boolean z = false;
                    if (C86833tv.A00(userSession, c38321qM9, interfaceC11380iw.getModuleName(), false) != EnumC86843tw.A05) {
                        z = true;
                    }
                    return new C86853tx(new C206209Bd(14, new C9FY(29, c38321qM9, obj7, interfaceC11380iw, obj), new C9F4(20, obj, c38321qM9), new C9FQ(19, obj, obj7, c38321qM9)), B5i, id, A072, BNT, A004, A0l, A06, z);
                }
                throw new IllegalStateException("Required value was null.");
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                View view2 = (View) obj;
                C14360o3.A0B(view2, 0);
                C77963eO c77963eO = (C77963eO) this.A03;
                C77903eI c77903eI = (C77903eI) this.A04;
                Context context2 = view2.getContext();
                C14360o3.A07(context2);
                InterfaceC75453aC interfaceC75453aC = (InterfaceC75453aC) this.A01;
                C81283jy c81283jy = (C81283jy) this.A02;
                c77963eO.A01(context2, c81283jy.A0I.A0C, interfaceC75453aC, c77903eI, c81283jy);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C76353bf c76353bf = ((C76563c1) ((InterfaceC76583c3) this.A02)).A00;
                boolean A2N = ((User) this.A01).A2N();
                C77643do c77643do = (C77643do) ((C77043cq) this.A04).A0A.getValue();
                int position4 = ((C75113Zb) this.A03).getPosition();
                if (A2N) {
                    c77643do.A01(c76353bf, position4);
                } else {
                    c77643do.A02(c76353bf, position4);
                }
                return C0eB.A00;
            case 14:
                C51222Wv c51222Wv = (C51222Wv) obj;
                C14360o3.A0B(c51222Wv, 0);
                InterfaceC75453aC interfaceC75453aC2 = ((C76943cg) this.A04).A02;
                C76853cX c76853cX = (C76853cX) this.A03;
                interfaceC75453aC2.CzQ(c76853cX.A09, c76853cX.A0E);
                Object obj8 = c51222Wv.A00;
                View view3 = null;
                if ((obj8 instanceof View) && (view = (View) obj8) != null) {
                    view3 = view.findViewWithTag(Integer.valueOf(R.id.media_option_button));
                }
                Object obj9 = this.A01;
                if (obj9 != EnumC77813e7.A04) {
                    ((InterfaceC16610sE) c76853cX.A02.A08).invoke(obj9, AbstractC13330mJ.A00(AbstractC77363dM.A00((C76223bS) this.A02)), view3);
                }
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                View view4 = (View) obj;
                C14360o3.A0B(view4, 0);
                Context context3 = view4.getContext();
                C14360o3.A07(context3);
                AbstractC86923u6.A00(context3, view4, ((C79293ga) this.A04).A00, (C38321qM) this.A02, (InterfaceC60442pS) this.A01, (C75113Zb) this.A03);
                return C0eB.A00;
            case 16:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Context context4 = (Context) this.A01;
                C79293ga c79293ga = (C79293ga) this.A04;
                UserSession userSession3 = c79293ga.A00;
                C38321qM c38321qM10 = (C38321qM) this.A03;
                Resources resources = context4.getResources();
                C14360o3.A07(resources);
                return AbstractC79753hQ.A01(context4, resources, (InterfaceC11380iw) this.A02, userSession3, c38321qM10, c79293ga.A02, booleanValue);
            default:
                List list = (List) obj;
                C14360o3.A0B(list, 0);
                C93L c93l = C93L.A00;
                ComponentActivity componentActivity = (ComponentActivity) this.A01;
                C07X c07x = (C07X) this.A03;
                UserSession userSession4 = (UserSession) this.A04;
                C75E c75e = (C75E) this.A02;
                if (componentActivity != null && c07x != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C9J0 c9j0 = (C9J0) it2.next();
                            if (c9j0.A00()) {
                                long hours = TimeUnit.SECONDS.toHours(System.currentTimeMillis() / 1000) - TimeUnit.MILLISECONDS.toHours(((C9J0) AbstractC001800i.A0I(list)).A02);
                                C06090Tz c06090Tz2 = C06090Tz.A05;
                                if (hours >= C18U.A01(c06090Tz2, userSession4, 36597240235625236L) && hours <= C18U.A01(c06090Tz2, userSession4, 36597240235821845L)) {
                                    Context baseContext = componentActivity.getBaseContext();
                                    C14360o3.A07(baseContext);
                                    A0J.A00(baseContext, userSession4, C05F.A0C).A02(c07x, c9j0.A09, new C30177DRh(32, userSession4, componentActivity, c9j0, c93l));
                                }
                            }
                        }
                    }
                    c75e.A01.A05(componentActivity);
                }
                return C0eB.A00;
        }
        InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) obj3;
        if (interfaceC16660sJ3 != null) {
            interfaceC16660sJ3.invoke(c127055oj);
        }
        return C0eB.A00;
    }
}
