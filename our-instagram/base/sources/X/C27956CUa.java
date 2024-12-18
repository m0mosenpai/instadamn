package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.CUa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27956CUa {
    public long A00;

    /* JADX WARN: Code restructure failed: missing block: B:65:0x02e2, code lost:
    
        if (X.C18U.A06(r7, r21, 36326081770305159L) == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.app.Activity r18, X.InterfaceC43399JFo r19, X.C26025BfE r20, com.instagram.common.session.UserSession r21, X.InterfaceC1119153d r22, X.InterfaceC16820sZ r23, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27956CUa.A00(android.app.Activity, X.JFo, X.BfE, com.instagram.common.session.UserSession, X.53d, X.0sZ, boolean, boolean, boolean):void");
    }

    public final void A01(FragmentActivity fragmentActivity, EnumC120785dO enumC120785dO, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC25233BEq.A0v(1, userSession, interfaceC60442pS, str);
        if (z2) {
            C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            A0r.A08();
            IgFragmentFactoryImpl.A00();
            C35028Fc1 c35028Fc1 = new C35028Fc1();
            c35028Fc1.A0B = str;
            c35028Fc1.A0E = interfaceC60442pS.getModuleName();
            c35028Fc1.A02 = AnonymousClass341.A0U;
            c35028Fc1.A0N = true;
            c35028Fc1.A09 = str2;
            c35028Fc1.A0G = str2;
            c35028Fc1.A0H = str3;
            c35028Fc1.A0T = z4;
            c35028Fc1.A0S = z;
            c35028Fc1.A0V = z5;
            A0r.A0D(c35028Fc1.A02());
            A0r.A04();
            return;
        }
        A00(fragmentActivity, null, new C26025BfE(enumC120785dO, null, 0, 0, null, null, null, str, null, interfaceC60442pS.getModuleName(), str2, null, null, null, null, null, null, null, null, null, null, 0, z, interfaceC60442pS.isOrganicEligible(), interfaceC60442pS.isSponsoredEligible(), false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, z3, z5, false, false, false, false, false, false), userSession, null, null, C18U.A06(C06090Tz.A05, userSession, 36318741671516604L), true, z6);
    }
}
