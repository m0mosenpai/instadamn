package X;

/* loaded from: classes8.dex */
public final class LJI {
    public static final void A00(C18920wW c18920wW, String str, String str2, String str3) {
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "reels_view_direct_reply_bar_exit");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, str);
            AbstractC31171DnF.A1F(A0f, "");
            AbstractC31171DnF.A1G(A0f, str2);
            AbstractC31175DnJ.A15(A0f, str3);
        }
    }

    public static final void A01(C18920wW c18920wW, String str, String str2, String str3) {
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, AbstractC111324zv.A00(4272));
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, str);
            AbstractC31171DnF.A1F(A0f, str2);
            if (str3 != null) {
                l = AbstractC25228BEl.A13(str3);
            } else {
                l = null;
            }
            A0f.A9K("blend_id", l);
            A0f.Cht();
        }
    }

    public static final void A02(C18920wW c18920wW, String str, String str2, String str3, String str4, String str5) {
        Long l;
        C14360o3.A0B(str, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_direct_reply_bar_tap");
        if (A0f.isSampled()) {
            AbstractC25225BEi.A1O(A0f, str);
            A0f.AAP("media_id", str3);
            AbstractC31171DnF.A1G(A0f, str2);
            AbstractC31171DnF.A1C(A0f, "direct_reply_bar_tap");
            AbstractC31171DnF.A1F(A0f, str4);
            if (str5 != null) {
                l = AbstractC25228BEl.A13(str5);
            } else {
                l = null;
            }
            A0f.A9K("blend_id", l);
            A0f.Cht();
        }
    }
}
