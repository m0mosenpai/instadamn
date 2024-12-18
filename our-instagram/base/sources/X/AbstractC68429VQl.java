package X;

import com.facebook.R;

/* renamed from: X.VQl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68429VQl {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Integer num;
        String str;
        C1338462s c1338462s = (C1338462s) c6fw.A00.get(0);
        C6FG A09 = C6BQ.A09(c6fq);
        C102884kP A00 = VSB.A00(A09, c6fq, c1338462s.A02);
        C14360o3.A07(A00);
        String A0E = A00.A0E();
        if (A0E != null) {
            Integer[] A002 = C05F.A00(3);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    num = A002[i];
                    switch (num.intValue()) {
                        case 1:
                            str = "skip_step";
                            break;
                        case 2:
                            str = "revisit_step";
                            break;
                        default:
                            str = "mark_step_complete";
                            break;
                    }
                    if (!str.equals(A0E)) {
                        i++;
                    }
                } else {
                    num = null;
                }
            }
        } else {
            num = null;
        }
        XDG xdg = (XDG) A09.A01.get(R.id.safety_step_handler);
        if (xdg != null && num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        xdg.DhP();
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    xdg.Dmv();
                    return null;
                }
            } else {
                xdg.DR5();
                return null;
            }
        }
        return null;
    }
}
