package X;

import com.instagram.user.model.UpcomingEvent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.6bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141986bH implements InterfaceC13000lm {
    public final Map A00 = new LinkedHashMap();
    public final java.util.Set A01 = new LinkedHashSet();

    public final UpcomingEvent A00(String str) {
        C14360o3.A0B(str, 0);
        if (this.A01.contains(str)) {
            return null;
        }
        return (UpcomingEvent) this.A00.get(str);
    }

    public final void A01(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 0);
        this.A00.put(upcomingEvent.getId(), upcomingEvent);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }
}
