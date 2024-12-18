package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class ESF extends AbstractC65632xz {
    public static final EnumC33405Epc A04 = EnumC33405Epc.A04;
    public final Activity A00;
    public final FNJ A01;
    public final UserSession A02;
    public final Context A03;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
        FNJ fnj = this.A01;
        EnumC33405Epc enumC33405Epc = A04;
        C14360o3.A0B(enumC33405Epc, 0);
        C63622uj c63622uj = fnj.A04;
        AbstractC31176DnK.A1V(fnj.A00, C59062n7.A00(enumC33405Epc, C0eB.A00, "discover_people_interstitial"), c63622uj, "discover_people_interstitial");
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ESF(Activity activity, Context context, FNJ fnj, UserSession userSession) {
        this.A02 = userSession;
        this.A03 = context;
        this.A00 = activity;
        this.A01 = fnj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36314837548075863L) == false) goto L6;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r8, android.view.View r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r7 = this;
            r0 = -803031597(0xffffffffd022b5d3, float:-1.09193E10)
            int r3 = X.C0f9.A03(r0)
            r6 = 1
            X.C14360o3.A0B(r9, r6)
            r4 = r9
            com.instagram.igds.components.headline.IgdsHeadline r4 = (com.instagram.igds.components.headline.IgdsHeadline) r4
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r5 = r7.A02
            com.instagram.user.model.User r0 = r0.A01(r5)
            boolean r0 = r0.A2I()
            if (r0 == 0) goto L2a
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314837548075863(0x81042700210b57, double:3.0289877212923413E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            r1 = 1
            if (r0 != 0) goto L2b
        L2a:
            r1 = 0
        L2b:
            r0 = 2131237741(0x7f081b6d, float:1.8091741E38)
            r4.setImageResource(r0)
            r4.A02 = r6
            r0 = 2131973706(0x7f13564a, float:1.9584455E38)
            if (r1 == 0) goto L3b
            r0 = 2131973707(0x7f13564b, float:1.9584457E38)
        L3b:
            r4.setHeadline(r0)
            r0 = 2131973704(0x7f135648, float:1.9584451E38)
            if (r1 == 0) goto L46
            r0 = 2131973705(0x7f135649, float:1.9584453E38)
        L46:
            r4.setBody(r0)
            r2 = 2131973703(0x7f135647, float:1.958445E38)
            r1 = 63
            X.Fp0 r0 = new X.Fp0
            r0.<init>(r7, r1)
            r4.EPC(r0, r2)
            X.FNJ r2 = r7.A01
            X.Epc r1 = X.ESF.A04
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.2uj r1 = r2.A04
            java.lang.String r0 = "discover_people_interstitial"
            X.2n7 r1 = r1.A00(r0)
            X.2n7 r0 = X.C59062n7.A07
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L73
            X.2jm r0 = r2.A03
            r0.A05(r9, r1)
        L73:
            r0 = 385058786(0x16f387e2, float:3.9344521E-25)
            X.C0f9.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ESF.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(367536412);
        IgdsHeadline igdsHeadline = new IgdsHeadline(this.A03, null, 0, 0);
        C0f9.A0A(-1466700910, A03);
        return igdsHeadline;
    }
}
