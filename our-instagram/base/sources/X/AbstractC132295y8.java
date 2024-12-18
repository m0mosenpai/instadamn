package X;

/* renamed from: X.5y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC132295y8 {
    public static C51758Mth A00() {
        return new C51758Mth((C50679MYx) null, 3, false);
    }

    public static String A01(InterfaceC132245y2 interfaceC132245y2, String str, String str2) {
        String str3;
        C14360o3.A0B(str2, 3);
        StringBuilder sb = new StringBuilder();
        String replace = str.replace('_', '-');
        C14360o3.A07(replace);
        sb.append(replace);
        sb.append('_');
        C132175xv Bet = interfaceC132245y2.Bet();
        sb.append(Bet.A06);
        sb.append('_');
        sb.append(str2);
        String str4 = Bet.A04;
        if (str4 != null) {
            str3 = AnonymousClass001.A0D(str4, '_');
        } else {
            str3 = "";
        }
        sb.append(str3);
        return sb.toString();
    }
}
