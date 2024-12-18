package X;

/* loaded from: classes8.dex */
public final class L61 {
    public final C18920wW A00;

    public final void A00(Integer num, Integer num2, String str) {
        String str2;
        String str3;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "avatar_stickers_measurement_global_sticker_tray_launch");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            if (num.intValue() != 0) {
                str2 = "story";
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
            c0Zx.A03("from_avatar_tab", false);
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            AbstractC43593JPy.A1I(A0f, "navigation");
        }
    }

    public L61(C18920wW c18920wW) {
        this.A00 = c18920wW;
    }
}
