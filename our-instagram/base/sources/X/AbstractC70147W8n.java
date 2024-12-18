package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: X.W8n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70147W8n {
    public static final Map A00;
    public static final Map A01;
    public static final Pattern A02 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A03 = Pattern.compile("(\\S+?):(\\S+)");

    static {
        HashMap hashMap = new HashMap();
        boolean A0C = AbstractC65704Tsa.A0C(hashMap);
        A01 = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        AbstractC65704Tsa.A0B(hashMap2, A0C ? 1 : 0);
        A00 = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.text.SpannableStringBuilder r9, X.C69082VhY r10, java.util.List r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC70147W8n.A00(android.text.SpannableStringBuilder, X.VhY, java.util.List, java.util.List):void");
    }

    public static void A01(List list) {
        ArrayList arrayList = new ArrayList();
        if (0 < list.size()) {
            list.get(0);
            throw new NullPointerException("getSpecificityScore");
        }
        Collections.sort(arrayList);
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw new NullPointerException("style");
        }
    }
}
