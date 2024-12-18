package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BRb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25539BRb {
    public final InterfaceC19630xq A00;
    public final int A01;
    public final int A02;

    public final boolean A00() {
        InterfaceC19630xq interfaceC19630xq = this.A00;
        if (interfaceC19630xq.getBoolean("key_clips_fast_play_ui_shown_by_first_time_long_press", false)) {
            return false;
        }
        long millis = TimeUnit.DAYS.toMillis(this.A01);
        long currentTimeMillis = System.currentTimeMillis();
        boolean A1Q = AbstractC167007dF.A1Q(interfaceC19630xq.getInt("key_clips_fast_play_ui_shown_count", 0), this.A02);
        boolean A1O = AbstractC167007dF.A1O(((currentTimeMillis - interfaceC19630xq.getLong("key_clips_fast_play_ui_last_shown_timestamp_ms", 0L)) > millis ? 1 : ((currentTimeMillis - interfaceC19630xq.getLong("key_clips_fast_play_ui_last_shown_timestamp_ms", 0L)) == millis ? 0 : -1)));
        if (!A1Q || !A1O) {
            return false;
        }
        return true;
    }

    public C25539BRb(UserSession userSession, int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        this.A00 = C1AT.A01(userSession).A04(C1AV.A0j, getClass());
    }
}
