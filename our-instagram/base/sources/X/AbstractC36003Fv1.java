package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.DpActionContent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fv1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36003Fv1 implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "DynamicFlowControllerBusinessLogic";
    public AbstractC34718FRf A00;
    public AbstractC34714FQz A01;
    public final Object A03;
    public final Map A04 = AbstractC166987dD.A1I();
    public java.util.Set A02 = AbstractC166987dD.A1H();

    public final void ATj() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        if (r11.A04.containsKey(r5) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00() {
        /*
            r11 = this;
            X.FQz r0 = r11.A01
            X.FRf r5 = r0.A00()
            r11.A00 = r5
            if (r5 != 0) goto L2a
            java.util.Set r1 = r11.A02
            java.util.HashSet r0 = X.AbstractC166987dD.A1H()
            r11.A02 = r0
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.next()
            X.GY7 r0 = (X.GY7) r0
            r0.onFinished()
            goto L16
        L26:
            r11.A01()
            return
        L2a:
            X.Erv r4 = X.EnumC33522Erv.A06
            X.Erv r3 = X.EnumC33522Erv.A07
            X.Erv r2 = X.EnumC33522Erv.A0A
            X.Erv r1 = X.EnumC33522Erv.A08
            X.Erv r0 = X.EnumC33522Erv.A09
            X.Erv[] r0 = new X.EnumC33522Erv[]{r4, r3, r2, r1, r0}
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            java.util.Set r1 = X.AbstractC001800i.A0k(r0)
            X.GWs r2 = r5.A00
            X.Erv r2 = (X.EnumC33522Erv) r2
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.nux.impl.dynamicflow.onboarding.OnboardingStep"
            X.C14360o3.A0C(r2, r0)
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L7b
            java.util.Iterator r4 = r1.iterator()
        L53:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r3 = r4.next()
            java.util.Map r0 = r11.A04
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r1 = r0.iterator()
        L67:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            X.FRf r0 = (X.AbstractC34718FRf) r0
            X.GWs r0 = r0.A00
            if (r3 != r0) goto L67
        L77:
            r11.A00()
            return
        L7b:
            java.util.Map r0 = r11.A04
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L84
            goto L77
        L84:
            boolean r0 = r5.A00()
            if (r0 != 0) goto L8f
            r0 = -1
            r11.CnE(r0)
            return
        L8f:
            r1 = r11
            X.Egp r1 = (X.C33002Egp) r1
            java.lang.Object r0 = r1.A03
            X.FrJ r0 = (X.C35781FrJ) r0
            X.EqI r0 = r0.A01
            X.0ll r10 = r1.A02
            if (r0 == 0) goto La0
            java.lang.String r9 = r0.A00
            if (r9 != 0) goto La2
        La0:
            java.lang.String r9 = ""
        La2:
            java.lang.String r8 = r2.name()
            boolean r7 = X.AbstractC167007dF.A1U(r8)
            double r5 = X.AbstractC31171DnF.A01()
            double r2 = X.AbstractC31171DnF.A00()
            X.0wW r1 = X.AbstractC12220kQ.A02(r10)
            java.lang.String r0 = "ig_dynamic_onboarding_step"
            X.0Ai r4 = X.AbstractC166987dD.A0f(r1, r0)
            X.AbstractC31179DnN.A16(r4, r5, r2)
            X.AbstractC31171DnF.A19(r4, r9)
            java.lang.String r0 = "onboarding_step"
            r4.AAP(r0, r8)
            X.AbstractC35274Fh9.A06(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "skipped"
            r4.A7v(r0, r1)
            X.AbstractC31176DnK.A1J(r4, r2)
            X.AbstractC31179DnN.A15(r4)
            X.AbstractC35274Fh9.A08(r4, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC36003Fv1.A00():void");
    }

    public final void A01() {
        String str;
        boolean z;
        Boolean AbE;
        C33002Egp c33002Egp = (C33002Egp) this;
        C35036Fc9 c35036Fc9 = C33002Egp.A03;
        C35781FrJ c35781FrJ = (C35781FrJ) c33002Egp.A03;
        synchronized (c35036Fc9) {
            HashMap hashMap = C33002Egp.A04;
            UserSession userSession = c35781FrJ.A00;
            if (userSession != null) {
                str = userSession.userId;
            } else {
                str = null;
            }
            hashMap.remove(str);
            UserSession userSession2 = c35781FrJ.A00;
            if (userSession2 != null) {
                userSession2.A03(DpActionContent.class);
            }
        }
        UserSession userSession3 = c35781FrJ.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC31178DnM.A1X(c06090Tz, userSession3, 36330634435642310L)) {
            Context context = c33002Egp.A01;
            AbstractC12990ll abstractC12990ll = c33002Egp.A02;
            UserSession userSession4 = c35781FrJ.A00;
            if (userSession4 == null || ((AbE = AbstractC166997dE.A0Y(userSession4).A03.AbE()) != null && AbE.booleanValue())) {
                z = true;
            } else {
                z = false;
            }
            C1GJ.A03(AbstractC34271F9r.A00(context, abstractC12990ll, c35781FrJ.A01, C05F.A0C, c35781FrJ.A02, AbstractC31180DnO.A0n(c33002Egp.A04), z, c35781FrJ.A00(), AbstractC23851Es.A03(), AbstractC167007dF.A1W(c35781FrJ.A00), false));
        }
        if (userSession3 != null && C18U.A06(c06090Tz, userSession3, 36331012393223284L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession3);
            AbstractC167007dF.A1L(A00, A00.A7o, C23031Ai.A8c, 37, true);
        }
    }

    public final boolean CUt() {
        Object obj;
        AbstractC34714FQz abstractC34714FQz = this.A01;
        int i = 0;
        List list = abstractC34714FQz.A01;
        if (0 < list.size()) {
            obj = list.get(0);
        } else {
            obj = null;
            i = list.size();
        }
        abstractC34714FQz.A00 = i;
        if (obj == null || !obj.equals(this.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.FQy, java.lang.Object] */
    public void CnE(int i) {
        AbstractC34718FRf abstractC34718FRf = this.A00;
        if (abstractC34718FRf != null) {
            InterfaceC37107GWs interfaceC37107GWs = abstractC34718FRf.A00;
            C35781FrJ c35781FrJ = (C35781FrJ) this.A03;
            if (((EnumC33522Erv) interfaceC37107GWs) instanceof C33003Egq) {
                C14360o3.A0B(c35781FrJ, 0);
            }
            Map map = this.A04;
            InterfaceC37107GWs interfaceC37107GWs2 = abstractC34718FRf.A00;
            ?? obj = new Object();
            String name = ((EnumC33522Erv) interfaceC37107GWs2).name();
            C14360o3.A0B(name, 0);
            obj.A01 = name;
            obj.A00 = i;
            map.put(abstractC34718FRf, obj);
        }
        A00();
    }

    public AbstractC36003Fv1(AbstractC34714FQz abstractC34714FQz, Object obj) {
        this.A01 = abstractC34714FQz;
        this.A00 = abstractC34714FQz.A00();
        this.A03 = obj;
    }

    public void A02(AbstractC34714FQz abstractC34714FQz, boolean z) {
        if (!C11T.A08()) {
            C11T.A02(new RunnableC36947GPq(this, abstractC34714FQz, z));
            return;
        }
        this.A01 = abstractC34714FQz;
        if (!z) {
            return;
        }
        this.A00 = abstractC34714FQz.A00();
    }
}
