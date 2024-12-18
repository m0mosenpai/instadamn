package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.rtc.service.OngoingCallServiceWithMic;

/* loaded from: classes9.dex */
public final class OGW {
    public final void A00(Context context, Long l, String str, boolean z) {
        Intent A08 = MSW.A08(context.getApplicationContext(), OngoingCallServiceWithMic.class);
        A08.putExtra("TITLE", str);
        A08.putExtra("IS_AUDIO_CALL", z);
        A08.putExtra("CALL_START_REAL_TIME", l);
        A08.setAction("SHOW");
        C12260kU.A00.A07().A0B(context, A08);
    }
}
