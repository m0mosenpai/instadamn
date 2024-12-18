package X;

import com.instagram.api.schemas.MediaReminder;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gdj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37403Gdj {
    public static Map A00(MediaReminder mediaReminder) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (mediaReminder.B36() != null) {
            A1I.put("expected_send_time", mediaReminder.B36());
        }
        if (mediaReminder.Cbn() != null) {
            A1I.put("is_reminder_set", mediaReminder.Cbn());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
