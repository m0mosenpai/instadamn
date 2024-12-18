package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.49l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C918349l {
    public final C55732hE A00;
    public final String A01;

    public C918349l(C55732hE c55732hE) {
        String obj;
        C14360o3.A0B(c55732hE, 1);
        this.A00 = c55732hE;
        ImmutableMap immutableMap = c55732hE.A00;
        if (immutableMap.isEmpty()) {
            obj = null;
        } else {
            StringBuilder sb = new StringBuilder();
            for (String str : AbstractC001800i.A0Z(immutableMap.keySet())) {
                if (sb.length() > 0) {
                    sb.append("|");
                }
                sb.append(str);
                sb.append(":");
                sb.append((String) immutableMap.get(str));
            }
            obj = sb.toString();
        }
        this.A01 = obj;
    }
}
