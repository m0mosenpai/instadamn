package X;

import java.util.List;

/* renamed from: X.VNs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68358VNs {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        List A0Q = AbstractC001900j.A0Q(str, new char[]{':'}, 0);
        if (A0Q.size() > 2) {
            return (String) A0Q.get(2);
        }
        return "";
    }
}
