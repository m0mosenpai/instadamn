package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VQf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68423VQf {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String valueOf;
        String str;
        C1338462s A00;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        Map map = (Map) c6fw.A02();
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC25233BEq.A0v(0, A04, c102884kP, map);
        Object A002 = C102884kP.A00(c102884kP, 43);
        if (A002 instanceof String) {
            valueOf = (String) A002;
        } else {
            valueOf = String.valueOf(A002);
        }
        String A0E = c102884kP.A0E();
        Integer num = null;
        if (A0E != null) {
            try {
                num = Integer.valueOf(C6BE.A05(A0E));
            } catch (C41M e) {
                AbstractC25241Le.A03("IgBloksScreenActionUtils", e);
            }
        }
        String A0G = c102884kP.A0G();
        HashMap A0H = C6BQ.A0H(map);
        C102884kP A08 = c102884kP.A08(40);
        C102884kP A082 = c102884kP.A08(41);
        boolean A0S = c102884kP.A0S(44, false);
        String str2 = TraceEventType.Push;
        String A0L = c102884kP.A0L(57);
        if (A0L != null) {
            str2 = A0L;
        }
        boolean A0S2 = c102884kP.A0S(54, false);
        boolean A0S3 = c102884kP.A0S(46, false);
        boolean A0S4 = c102884kP.A0S(53, false);
        boolean A0S5 = c102884kP.A0S(50, false);
        C62862tP A06 = C6BQ.A06(c6fq);
        if (A082 != null) {
            str = A082.A0E();
        } else {
            str = null;
        }
        if (A08 == null) {
            A00 = null;
        } else {
            A00 = C1338462s.A00(c6fq, A08);
        }
        Integer A003 = VR2.A00(str2);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        U5K A01 = U5L.A01(c6fq, A082);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(A0B);
        if (A01 != null) {
            igBloksScreenConfig.A06(A01);
        }
        igBloksScreenConfig.A07 = A00;
        igBloksScreenConfig.A0l = A0S;
        igBloksScreenConfig.A0f = A0S3;
        igBloksScreenConfig.A0h = A0S4;
        igBloksScreenConfig.A0g = A0S5;
        igBloksScreenConfig.A0c = A06.A00;
        igBloksScreenConfig.A0P = A003;
        if (num != null) {
            igBloksScreenConfig.A00 = num.intValue();
        }
        if (A0S2) {
            igBloksScreenConfig.A0Z = false;
        }
        igBloksScreenConfig.A0S = valueOf;
        igBloksScreenConfig.A0R = str;
        C66277U6x A012 = C66277U6x.A01(A0G, A0H);
        A012.A00 = 719983200;
        A012.A04(A04, igBloksScreenConfig);
        return null;
    }
}
