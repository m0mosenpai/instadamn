package X;

/* renamed from: X.CBf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27484CBf {
    public static String A00(int i) {
        String str;
        String str2;
        String str3;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LineBreak(strategy=");
        int i2 = i & 255;
        if (i2 == 1) {
            str = "Strategy.Simple";
        } else if (i2 == 2) {
            str = "Strategy.HighQuality";
        } else if (i2 == 3) {
            str = "Strategy.Balanced";
        } else if (i2 == 0) {
            str = "Strategy.Unspecified";
        } else {
            str = "Invalid";
        }
        A1C.append((Object) str);
        A1C.append(", strictness=");
        int i3 = (i >> 8) & 255;
        if (i3 == 1) {
            str2 = "Strictness.None";
        } else if (i3 == 2) {
            str2 = "Strictness.Loose";
        } else if (i3 == 3) {
            str2 = "Strictness.Normal";
        } else if (i3 == 4) {
            str2 = "Strictness.Strict";
        } else if (i3 == 0) {
            str2 = "Strictness.Unspecified";
        } else {
            str2 = "Invalid";
        }
        A1C.append((Object) str2);
        A1C.append(", wordBreak=");
        int i4 = (i >> 16) & 255;
        if (i4 == 1) {
            str3 = "WordBreak.None";
        } else if (i4 == 2) {
            str3 = "WordBreak.Phrase";
        } else if (i4 == 0) {
            str3 = "WordBreak.Unspecified";
        } else {
            str3 = "Invalid";
        }
        return AbstractC167017dG.A0o(str3, A1C);
    }
}
