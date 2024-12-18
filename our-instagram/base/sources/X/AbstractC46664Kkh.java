package X;

import android.os.Bundle;

/* renamed from: X.Kkh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46664Kkh {
    public static final KCK A00(String str, String str2, String str3, String str4, boolean z) {
        KCK kck = new KCK();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("original_audio_current_title", str);
        A0b.putString("original_audio_media_id", str2);
        A0b.putString("audio_asset_id", str3);
        A0b.putString("source_media_tap_token", str4);
        A0b.putBoolean("audio_page_via_notification", z);
        kck.setArguments(A0b);
        return kck;
    }
}
