package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.24g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C447624g {
    public long A00 = 838600141;
    public long A01 = 518922243;
    public long A02 = 518917599;
    public final C24Q A03;

    public final void A0A(String str) {
        C14360o3.A0B(str, 0);
        this.A01 = this.A03.A07(str, "", 518922243, this.A01);
    }

    public final void A00() {
        C24Q c24q = this.A03;
        c24q.A0C("create_gif_texture_failed", this.A00);
        c24q.A0C("create_gif_texture_failed", this.A02);
    }

    public final void A01() {
        C24Q c24q = this.A03;
        c24q.A0D("create_gif_texture_requested", this.A00, null, null, null, null);
        c24q.A0D("create_gif_texture_requested", this.A02, null, null, null, null);
    }

    public final void A02() {
        C24Q c24q = this.A03;
        c24q.A0D("create_gif_texture_success", this.A00, null, null, null, null);
        c24q.A0D("create_gif_texture_success", this.A02, null, null, null, null);
    }

    public final void A03() {
        C24Q c24q = this.A03;
        c24q.A0C("create_image_texture_failed", this.A00);
        c24q.A0C("create_image_texture_failed", this.A02);
    }

    public final void A04() {
        C24Q c24q = this.A03;
        c24q.A0D("create_image_texture_requested", this.A00, null, null, null, null);
        c24q.A0D("create_image_texture_requested", this.A02, null, null, null, null);
    }

    public final void A05() {
        C24Q c24q = this.A03;
        c24q.A0D("create_image_texture_success", this.A00, null, null, null, null);
        c24q.A0D("create_image_texture_success", this.A02, null, null, null, null);
    }

    public final void A06() {
        C24Q c24q = this.A03;
        c24q.A0C("create_sticker_texture_failed", this.A00);
        c24q.A0C("create_sticker_texture_failed", this.A02);
    }

    public final void A07() {
        C24Q c24q = this.A03;
        c24q.A0D("create_sticker_texture_requested", this.A00, null, null, null, null);
        c24q.A0D("create_sticker_texture_requested", this.A02, null, null, null, null);
    }

    public final void A08() {
        C24Q c24q = this.A03;
        c24q.A0D("create_sticker_texture_success", this.A00, null, null, null, null);
        c24q.A0D("create_sticker_texture_success", this.A02, null, null, null, null);
    }

    public final void A09() {
        C24Q c24q = this.A03;
        long A04 = c24q.A04(null, null, 518917599, 15000L);
        this.A02 = A04;
        c24q.A0B(A04, "use_case", "publish_story", false);
    }

    public C447624g(UserSession userSession) {
        this.A03 = new C24Q(userSession);
    }
}
