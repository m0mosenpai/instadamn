package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.VQu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68438VQu {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C102884kP c102884kP = (C102884kP) c6fw.A01();
        C102884kP c102884kP2 = (C102884kP) c6fw.A02();
        Map map = (Map) c6fw.A00();
        C6FG A09 = C6BQ.A09(c6fq);
        C65981Txa A04 = U6D.A04(A09, c102884kP2);
        IgBloksScreenConfig A01 = U5E.A01(C6BQ.A06(c6fq), A09, c6fq, c102884kP);
        C1338462s A00 = VR1.A00(c6fq, c102884kP);
        if (A01.A07 == null) {
            A01.A07 = A00;
        }
        A01.A0R = U5E.A06(c102884kP);
        A01.A0C = A04;
        if (c102884kP != null && U5E.A0C(c102884kP)) {
            A01.A0A = U5E.A05(c102884kP);
        }
        C66277U6x c66277U6x = new C66277U6x(C6BQ.A0H(map), Collections.EMPTY_MAP, U5E.A07(c102884kP));
        c66277U6x.A00 = U5E.A00(c102884kP);
        c66277U6x.A03 = c102884kP;
        c66277U6x.A08(U5E.A0A(c6fq, c102884kP));
        if (AbstractC167007dF.A1P(c102884kP.A05, 13784)) {
            str = c102884kP.A0L(55);
        } else {
            str = null;
        }
        c66277U6x.A05 = str;
        c66277U6x.A07(C6BQ.A04(c6fq), A01, null, 32, false);
        return null;
    }
}
