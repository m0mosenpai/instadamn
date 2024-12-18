package X;

import java.util.HashSet;

/* loaded from: classes8.dex */
public final class LA9 {
    public String A00;
    public final C18920wW A01;
    public final HashSet A02 = AbstractC166987dD.A1H();

    public final void A00(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, boolean z) {
        String str6;
        String str7;
        String str8;
        String str9;
        AbstractC167007dF.A1H(str, 0, num2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC111324zv.A00(3986));
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            long j = 0;
            c0Zx.A05(AbstractC111324zv.A00(533), Long.valueOf(AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str2))));
            if (num2.intValue() != 0) {
                str6 = "static";
            } else {
                str6 = "animated_sticker";
            }
            c0Zx.A06("sticker_type", str6);
            c0Zx.A05("sticker_rank", AbstractC31171DnF.A0V(i3));
            c0Zx.A05("sticker_page_index", AbstractC31171DnF.A0V(i4));
            JQ0.A1A(c0Zx, i, i2);
            int intValue = num3.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    str7 = "quick_reaction";
                } else {
                    str7 = "story";
                }
            } else {
                str7 = "message_thread";
            }
            c0Zx.A06("referrer_surface", str7);
            if (num4.intValue() != 0) {
                str8 = "story";
            } else {
                str8 = "message_thread";
            }
            c0Zx.A06(AbstractC111324zv.A00(5406), str8);
            Long A0k = AbstractC003100w.A0k(10, str3);
            if (A0k != null) {
                j = A0k.longValue();
            }
            c0Zx.A05(AbstractC111324zv.A00(5405), Long.valueOf(j));
            c0Zx.A03("is_social_sticker", Boolean.valueOf(z));
            c0Zx.A06("search_query", str4);
            c0Zx.A06(AbstractC111324zv.A00(270), str5);
            if (AbstractC003100w.A0k(10, str3) == null) {
                c0Zx.A06("sticker_usage_id_extra", str3);
            }
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            if (num.intValue() != 0) {
                str9 = "search";
            } else {
                str9 = "ranking";
            }
            AbstractC43593JPy.A1I(A0f, str9);
        }
    }

    public final void A01(Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, boolean z) {
        String str5;
        String str6;
        String str7;
        AbstractC167007dF.A1G(str, 0, num2);
        HashSet hashSet = this.A02;
        if (!hashSet.contains(str2)) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC111324zv.A00(3984));
            if (A0f.isSampled()) {
                hashSet.add(str2);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A05(AbstractC111324zv.A00(533), Long.valueOf(AbstractC167027dH.A03(str2)));
                JQ0.A1A(c0Zx, i, i2);
                if (num2.intValue() != 0) {
                    str5 = "static";
                } else {
                    str5 = "animated_sticker";
                }
                c0Zx.A06("sticker_type", str5);
                c0Zx.A05("sticker_rank", AbstractC31171DnF.A0V(i3));
                c0Zx.A05("sticker_page_index", AbstractC31171DnF.A0V(i4));
                c0Zx.A05("result_size", AbstractC31171DnF.A0V(i5));
                int intValue = num3.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        str6 = "quick_reaction";
                    } else {
                        str6 = "story";
                    }
                } else {
                    str6 = "message_thread";
                }
                c0Zx.A06("referrer_surface", str6);
                c0Zx.A03("is_social_sticker", Boolean.valueOf(z));
                c0Zx.A06("search_query", str3);
                c0Zx.A06(AbstractC111324zv.A00(270), str4);
                AbstractC43593JPy.A1G(A0f, c0Zx, str);
                if (num.intValue() != 0) {
                    str7 = "search";
                } else {
                    str7 = "ranking";
                }
                AbstractC43593JPy.A1I(A0f, str7);
            }
        }
    }

    public final void A02(Integer num, Integer num2, String str) {
        String str2;
        String str3;
        C14360o3.A0B(str, 0);
        if (!C14360o3.A0K(this.A00, str)) {
            this.A00 = str;
            this.A02.clear();
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, AbstractC111324zv.A00(3985));
        C0Zx c0Zx = new C0Zx();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                str2 = "quick_reaction";
            } else {
                str2 = "story";
            }
        } else {
            str2 = "message_thread";
        }
        c0Zx.A06("referrer_surface", str2);
        if (num2.intValue() != 0) {
            str3 = "message_reply";
        } else {
            str3 = "story_composer";
        }
        c0Zx.A06("ui_component", str3);
        if (A0f.isSampled()) {
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            AbstractC43593JPy.A1I(A0f, "navigation");
        }
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "avatar_stickers_measurement_avatar_sticker_tray_exit");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_query", str2);
        if (A0f.isSampled()) {
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            AbstractC43593JPy.A1I(A0f, "navigation");
        }
    }

    public final void A04(String str, String str2, String str3, int i) {
        C14360o3.A0B(str3, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "avatar_stickers_measurement_avatar_sticker_tray_search");
        C0Zx c0Zx = new C0Zx();
        c0Zx.A06("search_query", str2);
        c0Zx.A06("search_locale", str3);
        c0Zx.A05("result_size", AbstractC31171DnF.A0V(i));
        if (A0f.isSampled()) {
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            AbstractC43593JPy.A1I(A0f, "search");
        }
    }

    public LA9(C18920wW c18920wW) {
        this.A01 = c18920wW;
    }
}
