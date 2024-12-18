package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Scw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63096Scw {
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
    public static void A00(X.InterfaceC65255Tgl r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63096Scw.A00(X.Tgl, java.lang.StringBuilder, int):void");
    }

    public static void A01(Object obj, String str, StringBuilder sb, int i) {
        AbstractC64536TIs abstractC64536TIs;
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
        int i2 = i;
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(A00, 0, i3);
            i2 -= i3;
        }
        if (!str.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            AbstractC58321PtD.A1R(A1C, AbstractC58318PtA.A00(str));
            for (int i4 = 1; i4 < str.length(); i4++) {
                AbstractC58321PtD.A1R(A1C, AbstractC58323PtF.A01(str, A1C, i4));
            }
            str = A1C.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            AbstractC64536TIs abstractC64536TIs2 = AbstractC64536TIs.A01;
            abstractC64536TIs = new RLN(((String) obj).getBytes(AbstractC62394S9t.A03));
        } else if (obj instanceof AbstractC64536TIs) {
            sb.append(": \"");
            abstractC64536TIs = (AbstractC64536TIs) obj;
        } else {
            if (obj instanceof RLJ) {
                sb.append(" {");
                A00((AbstractC64248T5x) obj, sb, i + 2);
            } else if (obj instanceof Map.Entry) {
                int i5 = i + 2;
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                A01(entry.getKey(), "key", sb, i5);
                A01(entry.getValue(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE, sb, i5);
            } else {
                sb.append(": ");
                sb.append(obj);
                return;
            }
            sb.append("\n");
            while (i > 0) {
                int i6 = 80;
                if (i <= 80) {
                    i6 = i;
                }
                sb.append(A00, 0, i6);
                i -= i6;
            }
            sb.append("}");
            return;
        }
        sb.append(S2U.A00(abstractC64536TIs));
        sb.append('\"');
    }
}
