package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.7DN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DN extends Handler {
    public long A00;
    public long A01;
    public long A02;
    public final C7DM A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7DN(Looper looper, C7DM c7dm) {
        super(looper);
        C14360o3.A0B(looper, 1);
        C14360o3.A0B(c7dm, 2);
        this.A03 = c7dm;
        this.A02 = -1L;
        this.A01 = -1L;
        this.A00 = -1L;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        if (message.what == 1) {
            C7DM c7dm = this.A03;
            long j = this.A02;
            long j2 = this.A00;
            C18920wW c18920wW = c7dm.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "audio_clips_playback_scrub");
            if (A00.isSampled()) {
                A00.A9K("position", Long.valueOf(j));
                A00.A9K("duration", Long.valueOf(j2));
                A00.AAP("attachment_id", null);
                A00.A7v("has_access_token", false);
                A00.Cht();
            }
            c7dm.A00(null, this.A01, this.A00);
            this.A02 = -1L;
            this.A01 = -1L;
            this.A00 = -1L;
        }
    }
}
