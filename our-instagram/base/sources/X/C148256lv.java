package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.UUID;

/* renamed from: X.6lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148256lv {
    public K8S A00;
    public String A01;
    public boolean A02;
    public final C18920wW A03;
    public final HashSet A04;
    public final UserSession A05;

    public final void A00(String str) {
        Long l;
        if (!this.A02) {
            C18920wW c18920wW = this.A03;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "avatar_stickers_measurement_avatar_sticker_tray_launch");
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("referrer_surface", "quick_reaction");
            c0Zx.A06(AbstractC43591JPw.A00(1379), "story_view");
            if (A00.isSampled()) {
                A00.AAQ(c0Zx, "event_data");
                A00.AAP("avatar_session_id", this.A01);
                if (str != null) {
                    l = AbstractC003100w.A0k(10, str);
                } else {
                    l = null;
                }
                A00.A9K("avatar_id", l);
                A00.AAP("product", "navigation");
                A00.Cht();
                this.A02 = true;
            }
        }
    }

    public C148256lv(C18920wW c18920wW, UserSession userSession) {
        this.A05 = userSession;
        this.A03 = c18920wW;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A01 = obj;
        this.A04 = new HashSet();
    }
}
