package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SQS {
    public static final void A01(Object obj, String str, StringBuilder sb, int i) {
        String A00;
        if (obj instanceof List) {
            Iterator A1J = AbstractC25226BEj.A1J(obj);
            while (A1J.hasNext()) {
                A01(A1J.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator A15 = AbstractC166997dE.A15((Map) obj);
            while (A15.hasNext()) {
                A01(A15.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            InterfaceC65298ThW interfaceC65298ThW = AbstractC58387PuR.A01;
            A00 = Rr6.A00(new C58386PuQ(((String) obj).getBytes(AbstractC58376PuG.A03)));
        } else if (obj instanceof AbstractC58387PuR) {
            sb.append(": \"");
            A00 = Rr6.A00((AbstractC58387PuR) obj);
        } else {
            String str2 = "}";
            if (obj instanceof AbstractC58374PuE) {
                sb.append(" {");
                A00((AbstractC58375PuF) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                A01(entry.getKey(), "key", sb, i4);
                A01(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i4);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
            } else {
                sb.append(": ");
                str2 = obj.toString();
            }
            sb.append(str2);
            return;
        }
        sb.append(A00);
        sb.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[LOOP:2: B:21:0x006c->B:23:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128 A[LOOP:3: B:59:0x0122->B:61:0x0128, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(X.InterfaceC65625Tpl r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQS.A00(X.Tpl, java.lang.StringBuilder, int):void");
    }
}
