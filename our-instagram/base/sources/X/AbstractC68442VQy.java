package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VQy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68442VQy {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C71172WpA c71172WpA;
        InterfaceC103384lE A0B;
        boolean z = false;
        Object obj = c6fw.A00.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) obj;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP2 = (C102884kP) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>");
        HashMap hashMap = (HashMap) A00;
        C6FG A002 = C103064kh.A00(c6fq, c6fw, 3);
        Map A0B2 = U5E.A0B(c6fq, c102884kP2, 38);
        C102884kP A04 = U5E.A04(U5E.A09(c102884kP), 15932);
        if (A04 != null && (A0B = A04.A0B(40)) != null) {
            c71172WpA = new C71172WpA(c6fq, A0B, 3);
        } else {
            c71172WpA = null;
        }
        C62862tP A06 = C6BQ.A06(c6fq);
        int A003 = AbstractC68280VKs.A00(A04);
        String A07 = U5E.A07(c102884kP);
        String A062 = U5E.A06(c102884kP);
        Object A004 = VM9.A00(hashMap);
        if (A004 == null) {
            A004 = AbstractC06930Yk.A0E();
        }
        C14360o3.A0C(A004, MSV.A00(21));
        C66273U6s c66273U6s = new C66273U6s(null, null, null, null, null, A07, null, null, (HashMap) A004, new ArrayList(), null, A0B2, A0B2, -1, U5E.A00(c102884kP), -1L, -1L, false, false);
        IgBloksScreenConfig A01 = U5E.A01(A06, A002, c6fq, c102884kP);
        C1338462s A005 = VR1.A00(c6fq, c102884kP);
        if (A01.A07 == null) {
            A01.A07 = A005;
        }
        A01.A0R = A062;
        if (U5E.A0C(c102884kP)) {
            A01.A0A = U5E.A05(c102884kP);
        }
        String str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        String A0G = c102884kP2.A0G();
        if (A0G != null) {
            str = A0G;
        }
        Integer A006 = U63.A00(str);
        C14360o3.A07(A006);
        if (A04 != null && A04.A0S(48, false)) {
            z = true;
        }
        WGI.A02(C6BQ.A04(c6fq), c66273U6s, A01.A07, A01.A04(), new VBp(null, c71172WpA, A006, A003, z), U5E.A08(c102884kP));
        return null;
    }
}
