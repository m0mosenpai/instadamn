package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.LpD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49196LpD implements InterfaceC50438MOs {
    public final List A00;

    public C49196LpD(Context context, BJF bjf, UserSession userSession, C98K c98k, AnonymousClass988 anonymousClass988, C7IM c7im) {
        C47763L7j c47763L7j = new C47763L7j(userSession, anonymousClass988, c7im, new L1Z(userSession, anonymousClass988));
        C49187Lp4 c49187Lp4 = new C49187Lp4(context, bjf, userSession, anonymousClass988, c7im);
        C45953KVf c45953KVf = new C45953KVf(context, userSession, c98k, anonymousClass988, c7im);
        C45955KVi c45955KVi = new C45955KVi(context, userSession, c98k, anonymousClass988, c7im);
        C45958KVl c45958KVl = new C45958KVl(context, userSession, anonymousClass988, c7im);
        C45956KVj c45956KVj = new C45956KVj(context, userSession, anonymousClass988, c7im);
        C45957KVk c45957KVk = new C45957KVk(context, userSession, anonymousClass988, c7im);
        C45954KVg c45954KVg = new C45954KVg(context, userSession, anonymousClass988, c7im);
        C45952KVe c45952KVe = new C45952KVe(context, userSession, anonymousClass988, c7im);
        C45951KVd c45951KVd = new C45951KVd(context, userSession, anonymousClass988, c7im);
        C49186Lp3 c49186Lp3 = new C49186Lp3(anonymousClass988, c7im);
        KVh kVh = new KVh(context, userSession, anonymousClass988, c7im);
        C45950KVc c45950KVc = new C45950KVc(context, userSession, anonymousClass988, c7im);
        C49185Lp2 c49185Lp2 = new C49185Lp2(userSession);
        C49193LpA c49193LpA = new C49193LpA(context, userSession, c98k, anonymousClass988, c7im, c47763L7j);
        C45963KVq c45963KVq = new C45963KVq(context, userSession, c98k, anonymousClass988, c7im);
        C45962KVp c45962KVp = new C45962KVp(context, userSession, c98k, anonymousClass988, c7im);
        C45961KVo c45961KVo = new C45961KVo(context, userSession, c98k, anonymousClass988, c7im);
        C45964KVr c45964KVr = new C45964KVr(context, userSession, c98k, anonymousClass988, c7im);
        C45965KVs c45965KVs = new C45965KVs(context, userSession, c98k, anonymousClass988, c7im);
        C49190Lp7 c49190Lp7 = new C49190Lp7(context, userSession, c98k, anonymousClass988, c7im, c47763L7j);
        C49194LpB c49194LpB = new C49194LpB(context, userSession, c98k, anonymousClass988, c7im);
        C49189Lp6 c49189Lp6 = new C49189Lp6(context, userSession, anonymousClass988, c7im);
        C45959KVm c45959KVm = new C45959KVm(context, userSession, c98k, anonymousClass988, c7im);
        C45960KVn c45960KVn = new C45960KVn(context, userSession, c98k, anonymousClass988, c7im);
        C49188Lp5 c49188Lp5 = new C49188Lp5(context, userSession, anonymousClass988, c7im);
        this.A00 = AbstractC001800i.A0S(AbstractC16960so.A1Q(c49187Lp4, c45953KVf, c45955KVi, c45958KVl, c45956KVj, c45957KVk, c45954KVg, c45952KVe, c45951KVd, c49186Lp3, kVh, c45950KVc, c49185Lp2, c49188Lp5), AbstractC16960so.A1Q(c49193LpA, c45963KVq, c45962KVp, c45961KVo, c45964KVr, c45965KVs, c49190Lp7, c49194LpB, c49189Lp6, c45959KVm, c45960KVn));
    }

    @Override // X.InterfaceC50438MOs
    public final ArrayList AWt(Context context, C51760Mtj c51760Mtj, C99E c99e, MessagingUser messagingUser, L8R l8r, InterfaceC50520MRx interfaceC50520MRx, InterfaceC50520MRx interfaceC50520MRx2, Map map, java.util.Set set, java.util.Set set2) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int count = interfaceC50520MRx.getCount();
        for (int i = 0; i < count; i++) {
            if (interfaceC50520MRx.BTA(i) == 0) {
                Iterator it = this.A00.iterator();
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC50469MPx interfaceC50469MPx = (InterfaceC50469MPx) it.next();
                        if (interfaceC50469MPx.AFd(c99e, interfaceC50520MRx, i)) {
                            C47908LEc AWs = interfaceC50469MPx.AWs(context, c51760Mtj, c99e, messagingUser, l8r, interfaceC50520MRx, map, set2, i, false);
                            if (AWs != null) {
                                A1E.add(AWs);
                            }
                        }
                    }
                }
            }
        }
        int count2 = interfaceC50520MRx2.getCount();
        for (int i2 = 0; i2 < count2; i2++) {
            if (interfaceC50520MRx2.BTA(i2) == 0) {
                Iterator it2 = this.A00.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC50469MPx interfaceC50469MPx2 = (InterfaceC50469MPx) it2.next();
                        if (interfaceC50469MPx2.AFd(c99e, interfaceC50520MRx2, i2)) {
                            C47908LEc AWs2 = interfaceC50469MPx2.AWs(context, c51760Mtj, c99e, messagingUser, l8r, interfaceC50520MRx2, map, set2, i2, true);
                            if (AWs2 != null) {
                                A1E.add(AWs2);
                            }
                        }
                    }
                }
            }
        }
        return A1E;
    }
}
