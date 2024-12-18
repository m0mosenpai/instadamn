package X;

import com.instagram.quickpromotion.intf.Trigger;

/* renamed from: X.2hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55742hF {
    public static final Trigger A00(String str) {
        C14360o3.A0B(str, 0);
        for (Trigger trigger : Trigger.values()) {
            if (C14360o3.A0K(trigger.A01, str)) {
                return trigger;
            }
        }
        return null;
    }
}
