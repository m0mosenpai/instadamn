package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ShV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63321ShV {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0062 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.InterfaceC65665Tqv r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63321ShV.A01(X.Tqv, java.lang.StringBuilder, int):void");
    }

    public static void A02(Object obj, String str, StringBuilder sb, int i) {
        AbstractC64539TIv abstractC64539TIv;
        if (obj instanceof List) {
            Iterator A1J = AbstractC25226BEj.A1J(obj);
            while (A1J.hasNext()) {
                A02(A1J.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator A15 = AbstractC166997dE.A15((Map) obj);
            while (A15.hasNext()) {
                A02(A15.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        A03(sb, i);
        if (!str.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            AbstractC58321PtD.A1R(A1C, AbstractC58318PtA.A00(str));
            for (int i2 = 1; i2 < str.length(); i2++) {
                AbstractC58321PtD.A1R(A1C, AbstractC58323PtF.A01(str, A1C, i2));
            }
            str = A1C.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC64539TIv abstractC64539TIv2 = AbstractC64539TIv.A01;
            abstractC64539TIv = new ROE(((String) obj).getBytes(AbstractC63328Shc.A03));
        } else if (obj instanceof AbstractC64539TIv) {
            sb.append(": \"");
            abstractC64539TIv = (AbstractC64539TIv) obj;
        } else {
            if (obj instanceof RO8) {
                sb.append(" {");
                A01((AbstractC64251T6a) obj, sb, i + 2);
            } else if (obj instanceof Map.Entry) {
                int i3 = i + 2;
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                A02(entry.getKey(), "key", sb, i3);
                A02(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i3);
            } else {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            sb.append("\n");
            A03(sb, i);
            sb.append("}");
            return;
        }
        sb.append(AbstractC62222S2s.A00(abstractC64539TIv));
        sb.append('\"');
    }

    public static void A03(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(A00, 0, i2);
            i -= i2;
        }
    }

    public static String A00(InterfaceC65665Tqv interfaceC65665Tqv, String str) {
        StringBuilder A0u = AbstractC58323PtF.A0u(str);
        A01(interfaceC65665Tqv, A0u, 0);
        return A0u.toString();
    }
}
