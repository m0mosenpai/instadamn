package X;

/* renamed from: X.FTg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34761FTg {
    public static final String A00(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() != 0 && AbstractC001900j.A0a(str, "_", false) && AbstractC31178DnM.A1b(str, "_").length >= 2) {
            String substring = str.substring(AbstractC001900j.A08(str, "_", 0, false) + 1);
            C14360o3.A07(substring);
            return ((String[]) AbstractC31178DnM.A1b(substring, "&"))[0];
        }
        return "";
    }

    public static final String A01(String str) {
        C14360o3.A0B(str, 0);
        if (str.length() != 0 && AbstractC001900j.A0a(str, "_", false)) {
            return ((String[]) AbstractC31178DnM.A1b(str, "_"))[0];
        }
        return "";
    }
}
