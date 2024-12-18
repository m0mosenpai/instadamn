package X;

import java.util.Map;

/* renamed from: X.2ZW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2ZW extends C2ZT {
    public final boolean A00;
    public final int A01;
    public final String A02;

    @Override // X.C2ZT
    public final int A00() {
        return 3;
    }

    @Override // X.C2ZT
    public final String A03() {
        return "foreground";
    }

    @Override // X.C2ZT
    public final Map A04() {
        String str;
        C09530e4 c09530e4 = new C09530e4("is_cold_start", Boolean.valueOf(this.A00));
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "unknown";
                    } else {
                        str = "deeplink";
                    }
                } else {
                    str = "shortcut";
                }
            } else {
                str = "push notification";
            }
        } else {
            str = "app icon";
        }
        return AbstractC06930Yk.A06(c09530e4, new C09530e4("trigger", str), new C09530e4("destination", this.A02));
    }

    @Override // X.C2ZT
    public final void A05(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A00);
        sb.append("|");
        sb.append(this.A01);
        sb.append("|");
        sb.append(this.A02);
    }

    @Override // X.C2ZT
    public final String A01() {
        if (this.A00) {
            return "cold_start";
        }
        return "foreground";
    }

    @Override // X.C2ZT
    public final String A02() {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        int i = this.A01;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str3 = "unknown";
                    } else {
                        str3 = "deeplink";
                    }
                } else {
                    str3 = "shortcut";
                }
            } else {
                str3 = "push notification";
            }
            str = AnonymousClass001.A0g(str3, " to ", this.A02);
        } else {
            str = "app icon";
        }
        if (this.A00) {
            sb = new StringBuilder();
            str2 = "user cold started the app from ";
        } else {
            sb = new StringBuilder();
            str2 = "user foregrounded the app from ";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public C2ZW(String str, String str2, int i, long j, boolean z) {
        super(j, str);
        this.A00 = z;
        this.A01 = i;
        this.A02 = str2 == null ? "unknown" : str2;
    }
}
