package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7DM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DM {
    public final C18920wW A00;

    public C7DM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public final void A00(EnumC53362NjD enumC53362NjD, long j, long j2) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "audio_clips_playback_resume");
        if (A00.isSampled()) {
            A00.A9K("position", Long.valueOf(j));
            A00.A9K("duration", Long.valueOf(j2));
            A00.AAP("attachment_id", null);
            A00.A7v("has_access_token", false);
            if (enumC53362NjD != null) {
                A00.A8R(enumC53362NjD, "source_click_category");
            }
            A00.Cht();
        }
    }

    public final void A01(Throwable th) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "audio_clips_creation_failed");
        if (A00.isSampled()) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            A00.AAP("error_message", message);
            A00.Cht();
        }
    }

    public C7DM() {
    }
}
