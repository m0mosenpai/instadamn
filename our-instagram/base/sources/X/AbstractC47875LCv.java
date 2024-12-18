package X;

/* renamed from: X.LCv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47875LCv {
    public static final EnumC46183KcL A00(String str) {
        C14360o3.A0B(str, 0);
        EnumC46183KcL enumC46183KcL = (EnumC46183KcL) EnumC46183KcL.A00.get(str);
        if (enumC46183KcL != null) {
            return enumC46183KcL;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0g("Provided TemplateId ", str, " not supported"));
    }

    public static final String A01(EnumC46183KcL enumC46183KcL) {
        switch (enumC46183KcL.ordinal()) {
            case 0:
                return "intro";
            case 1:
                return "supportive_superstar";
            case 2:
                return "most_tagged";
            case 3:
                return "longest_follower";
            case 4:
                return "most_liked_post";
            case 5:
                return "top_creator";
            case 6:
                return "end";
            default:
                throw B4Z.A00();
        }
    }
}
