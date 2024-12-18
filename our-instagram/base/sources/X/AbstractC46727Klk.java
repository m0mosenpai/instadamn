package X;

/* renamed from: X.Klk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46727Klk {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "instagram://details/toggle_disappearing_messages?active=false";
            } else {
                str2 = "instagram://details/toggle_disappearing_messages?active=true";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
