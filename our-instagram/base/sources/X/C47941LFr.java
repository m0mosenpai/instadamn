package X;

/* renamed from: X.LFr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47941LFr {
    public final String A00;
    public final String A01;

    public final boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }

    public C47941LFr(C47941LFr... c47941LFrArr) {
        String str = "";
        String str2 = "";
        int i = 0;
        do {
            C47941LFr c47941LFr = c47941LFrArr[i];
            str = AnonymousClass001.A0R(str, c47941LFr.A01);
            str2 = AnonymousClass001.A0R(str2, c47941LFr.A00);
            i++;
        } while (i < 2);
        this.A01 = str;
        this.A00 = str2;
    }

    public C47941LFr(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
