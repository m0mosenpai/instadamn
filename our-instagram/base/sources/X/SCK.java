package X;

import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.utils.CircularEventLog;

/* loaded from: classes10.dex */
public final class SCK {
    public final CircularEventLog A00;

    public SCK(EventBase eventBase, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = new CircularEventLog(eventBase, 100);
    }
}
