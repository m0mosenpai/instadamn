package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Bob, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26578Bob extends AbstractC51572Yf {
    public static final HashMap A03 = AbstractC166987dD.A1G();
    public static final HashSet A04 = AbstractC166987dD.A1H();
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C120985dq A02;

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0225, code lost:
    
        if (r0.isEmpty() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0373, code lost:
    
        if (r8.contains(r7.A03) != true) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0552  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r72) {
        /*
            Method dump skipped, instructions count: 1619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26578Bob.A0Y(X.3bS):X.2Vc");
    }

    public C26578Bob(C120985dq c120985dq, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167027dH.A13(interfaceC60442pS, c120985dq, userSession);
        this.A01 = interfaceC60442pS;
        this.A02 = c120985dq;
        this.A00 = userSession;
    }

    public static final void A03(C2XE c2xe, C51762Yz c51762Yz, IKS iks, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, HashSet hashSet) {
        if (AbstractC25226BEj.A1b(hashSet)) {
            HashSet hashSet2 = A04;
            if (!hashSet2.contains(str)) {
                hashSet2.add(str);
                AbstractC167007dF.A1D(userSession, 0, interfaceC60442pS);
                C41120IIl c41120IIl = null;
                if (iks != null && iks.A06.length() != 0) {
                    List list = iks.A09;
                    if (list != null) {
                        c41120IIl = (C41120IIl) AbstractC001800i.A0O(list, 0);
                    }
                    String A0R = AnonymousClass001.A0R("instagram_ad_", AbstractC111324zv.A00(1320));
                    if (c41120IIl != null && A0R != null) {
                        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, A0R);
                        c82713mZ.A7Q = iks.A08;
                        c82713mZ.A6e = c41120IIl.A01;
                        c82713mZ.A8A = AbstractC166987dD.A1F(hashSet);
                        c82713mZ.A73 = "in_feed_survey";
                        C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
                    }
                }
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A02();
                Context context = c2xe.A0C;
                c146106i8.A04 = context.getDrawable(R.drawable.instagram_check_pano_outline_24);
                AbstractC25226BEj.A1N(context, c146106i8, 2131954143);
                c146106i8.A06();
                AbstractC166997dE.A1O(c41451vu, c146106i8.A00());
            }
        }
        c51762Yz.A03(DR2.A00);
    }
}
