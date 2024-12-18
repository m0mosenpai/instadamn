package X;

import android.content.Intent;

/* renamed from: X.Rsr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61736Rsr {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Tmi, java.lang.Object] */
    public static final InterfaceC65562Tmi A00(Intent intent) {
        C14360o3.A0B(intent, 0);
        if (!intent.getBooleanExtra("BrowserLiteIntent.EXTRA_IS_FROM_E2EE_THREAD", false) && !intent.getBooleanExtra("BrowserLiteIntent.EXTRA_SHOULD_LOG_OPEN_SWB_EVENTS_AS_E2EE", false)) {
            return new C63949SwO(AbstractC12220kQ.A01(new C19270xB("safe_browsing"), C023409i.A0A.A06(AbstractC13580mk.A00(intent))));
        }
        return new Object();
    }
}
