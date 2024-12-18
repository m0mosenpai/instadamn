package X;

/* renamed from: X.I9v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40897I9v {
    public static void A00(InterfaceC02550Ad interfaceC02550Ad, EnumC39652Hih enumC39652Hih, String str, String str2, String str3, boolean z) {
        long j;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) interfaceC02550Ad, "instagram_user_tag_tap");
        if (A0f.isSampled()) {
            A0f.A8R(enumC39652Hih, "action_source");
            AbstractC31171DnF.A1I(A0f, str);
            A0f.AAP("media_compound_key", str2);
            A0f.AAK(C4SX.A00(str3), "target_id");
            A0f.A9K("has_category_label", Long.valueOf(j));
            A0f.Cht();
        }
    }
}
