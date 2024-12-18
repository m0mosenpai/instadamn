package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1V4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1V4 extends C1V5 {
    public static C1V4 A00;

    public static void A00(C68251VJn c68251VJn) {
        C0SG c0sg = (C0SG) c68251VJn.A03.getChildFragmentManager().A0Q("ProfileWizardPlugin_LoaderDialogFragmentName");
        if (c0sg != null) {
            c0sg.A08();
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, X.VJn] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X.WoP, X.XFg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, X.WoP, X.XFg] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, X.WoP, X.XFg] */
    public final void A07(FragmentActivity fragmentActivity, UserSession userSession) {
        Integer num = C05F.A00;
        C14360o3.A0B(userSession, 0);
        AbstractC69975Vyq.A01(userSession, num, null);
        User A002 = C08730cb.A00(userSession).A00();
        ?? obj = new Object();
        obj.A04 = A002;
        ArrayList arrayList = new ArrayList();
        VHn vHn = VHn.A06;
        C71138WoZ c71138WoZ = new C71138WoZ(fragmentActivity, userSession, obj, this);
        C69427VnC c69427VnC = new C69427VnC(vHn);
        c69427VnC.A06 = true;
        c69427VnC.A02 = c71138WoZ;
        InterfaceC72018XFg interfaceC72018XFg = InterfaceC72018XFg.A00;
        c69427VnC.A03 = interfaceC72018XFg;
        InterfaceC72016XFe interfaceC72016XFe = InterfaceC72016XFe.A00;
        c69427VnC.A00 = interfaceC72016XFe;
        InterfaceC72017XFf interfaceC72017XFf = InterfaceC72017XFf.A00;
        c69427VnC.A01 = interfaceC72017XFf;
        InterfaceC72019XFh interfaceC72019XFh = InterfaceC72019XFh.A00;
        c69427VnC.A05 = interfaceC72019XFh;
        arrayList.add(c69427VnC);
        VHn vHn2 = VHn.A07;
        C71139Woa c71139Woa = new C71139Woa(fragmentActivity, userSession, obj, this);
        C71131WoS c71131WoS = new C71131WoS(obj, this);
        C69427VnC c69427VnC2 = new C69427VnC(vHn2);
        c69427VnC2.A06 = true;
        c69427VnC2.A02 = c71139Woa;
        c69427VnC2.A03 = c71131WoS;
        c69427VnC2.A00 = interfaceC72016XFe;
        c69427VnC2.A01 = interfaceC72017XFf;
        c69427VnC2.A05 = interfaceC72019XFh;
        arrayList.add(c69427VnC2);
        VHn vHn3 = VHn.A04;
        C71127WoO c71127WoO = new C71127WoO(userSession, this);
        C71120WoH c71120WoH = new C71120WoH(fragmentActivity, userSession);
        C71134WoV c71134WoV = new C71134WoV(userSession, obj, this);
        C71142Wod c71142Wod = new C71142Wod(obj, this);
        ?? obj2 = new Object();
        obj2.A00 = userSession;
        C69427VnC c69427VnC3 = new C69427VnC(vHn3);
        c69427VnC3.A06 = false;
        c69427VnC3.A02 = c71134WoV;
        c69427VnC3.A03 = obj2;
        c69427VnC3.A00 = c71120WoH;
        c69427VnC3.A01 = c71127WoO;
        c69427VnC3.A05 = c71142Wod;
        arrayList.add(c69427VnC3);
        VHn vHn4 = VHn.A03;
        C71122WoJ c71122WoJ = new C71122WoJ(userSession, this);
        C71120WoH c71120WoH2 = new C71120WoH(fragmentActivity, userSession);
        C71135WoW c71135WoW = new C71135WoW(userSession, obj, this);
        C71143Woe c71143Woe = new C71143Woe(obj, this);
        ?? obj3 = new Object();
        obj3.A00 = userSession;
        C69427VnC c69427VnC4 = new C69427VnC(vHn4);
        c69427VnC4.A06 = false;
        c69427VnC4.A02 = c71135WoW;
        c69427VnC4.A03 = obj3;
        c69427VnC4.A00 = c71120WoH2;
        c69427VnC4.A01 = c71122WoJ;
        c69427VnC4.A05 = c71143Woe;
        arrayList.add(c69427VnC4);
        VHn vHn5 = VHn.A02;
        C71123WoK c71123WoK = new C71123WoK(userSession, this);
        C71120WoH c71120WoH3 = new C71120WoH(fragmentActivity, userSession);
        C71132WoT c71132WoT = new C71132WoT(userSession, obj, this);
        C71141Woc c71141Woc = new C71141Woc(obj, this);
        ?? obj4 = new Object();
        obj4.A00 = userSession;
        C69427VnC c69427VnC5 = new C69427VnC(vHn5);
        c69427VnC5.A06 = false;
        c69427VnC5.A02 = c71132WoT;
        c69427VnC5.A03 = obj4;
        c69427VnC5.A00 = c71120WoH3;
        c69427VnC5.A01 = c71123WoK;
        c69427VnC5.A05 = c71141Woc;
        arrayList.add(c69427VnC5);
        VHn vHn6 = VHn.A0A;
        C71124WoL c71124WoL = new C71124WoL(obj, this);
        C71130WoR c71130WoR = new C71130WoR(obj, this);
        C69427VnC c69427VnC6 = new C69427VnC(vHn6);
        c69427VnC6.A06 = true;
        c69427VnC6.A02 = c71130WoR;
        c69427VnC6.A03 = interfaceC72018XFg;
        c69427VnC6.A00 = interfaceC72016XFe;
        c69427VnC6.A01 = c71124WoL;
        c69427VnC6.A05 = interfaceC72019XFh;
        arrayList.add(c69427VnC6);
        VHn vHn7 = VHn.A08;
        C71125WoM c71125WoM = new C71125WoM(obj, this);
        C71136WoX c71136WoX = new C71136WoX(fragmentActivity, userSession, obj, this);
        C69427VnC c69427VnC7 = new C69427VnC(vHn7);
        c69427VnC7.A06 = true;
        c69427VnC7.A02 = c71136WoX;
        c69427VnC7.A03 = interfaceC72018XFg;
        c69427VnC7.A00 = interfaceC72016XFe;
        c69427VnC7.A01 = c71125WoM;
        c69427VnC7.A05 = interfaceC72019XFh;
        arrayList.add(c69427VnC7);
        Context applicationContext = fragmentActivity.getApplicationContext();
        VHn vHn8 = VHn.A09;
        C71126WoN c71126WoN = new C71126WoN(obj, this);
        C71137WoY c71137WoY = new C71137WoY(applicationContext, userSession, obj, this);
        C69427VnC c69427VnC8 = new C69427VnC(vHn8);
        c69427VnC8.A06 = true;
        c69427VnC8.A02 = c71137WoY;
        c69427VnC8.A03 = interfaceC72018XFg;
        c69427VnC8.A00 = interfaceC72016XFe;
        c69427VnC8.A01 = c71126WoN;
        c69427VnC8.A05 = interfaceC72019XFh;
        arrayList.add(c69427VnC8);
        VHn vHn9 = VHn.A05;
        C71133WoU c71133WoU = new C71133WoU(userSession, obj, this);
        C69427VnC c69427VnC9 = new C69427VnC(vHn9);
        c69427VnC9.A06 = true;
        c69427VnC9.A02 = c71133WoU;
        c69427VnC9.A03 = interfaceC72018XFg;
        c69427VnC9.A00 = interfaceC72016XFe;
        c69427VnC9.A01 = interfaceC72017XFf;
        c69427VnC9.A05 = interfaceC72019XFh;
        arrayList.add(c69427VnC9);
        C71118WoF c71118WoF = new C71118WoF();
        c71118WoF.A03 = Collections.unmodifiableList(arrayList);
        obj.A05 = c71118WoF;
        A04(new C69028Vg4(obj, this), c71118WoF, null, "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
    }
}
