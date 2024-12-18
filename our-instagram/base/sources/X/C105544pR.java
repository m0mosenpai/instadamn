package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105544pR extends AbstractC105554pS {
    public final int A00;
    public final Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractMap, java.util.HashMap] */
    public C105544pR(String str, int i) {
        ?? r5;
        String next;
        this.A00 = i < 1 ? 10 : i;
        try {
            r5 = new HashMap();
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(' ');
            simpleStringSplitter.setString(str);
            while (simpleStringSplitter.hasNext() && (next = simpleStringSplitter.next()) != null) {
                int lastIndexOf = next.lastIndexOf(47);
                if (lastIndexOf >= 1) {
                    String substring = next.substring(0, lastIndexOf);
                    int parseInt = Integer.parseInt(next.substring(lastIndexOf + 1));
                    if (parseInt >= 1) {
                        r5.put(substring, Integer.valueOf(parseInt));
                    }
                }
            }
        } catch (Exception e) {
            C0K8.A08(AbstractC105564pT.class, "Failed to parse downsample string: %s", e, str);
            r5 = Collections.EMPTY_MAP;
        }
        this.A01 = r5;
    }
}
