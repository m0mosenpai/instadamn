package X;

import com.facebook.msys.mci.Analytics;
import com.facebook.msys.mci.EventLogSubscriber;
import java.util.List;
import java.util.Map;

/* renamed from: X.1vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41031vA implements Analytics {
    public static C41031vA A02;
    public EventLogSubscriber A01 = null;
    public InterfaceC11360iu A00 = AbstractC11060iN.A00(AbstractC12960li.A00);

    @Override // com.facebook.msys.mci.Analytics
    public final EventLogSubscriber getTalEventSubscriber() {
        EventLogSubscriber eventLogSubscriber = this.A01;
        if (eventLogSubscriber == null) {
            synchronized (this) {
                EventLogSubscriber eventLogSubscriber2 = EventLogSubscriber.$redex_init_class;
                final String[] strArr = {"AdvancedCrypto", "CarrierMessaging", "FBBroker", "TAM", "FBLegacyBroker", "Interop"};
                eventLogSubscriber = new EventLogSubscriber(strArr) { // from class: X.4Mw
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
                    
                        if (r3.A03 != null) goto L41;
                     */
                    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002b. Please report as an issue. */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.HashMap] */
                    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.AbstractMap, java.util.HashMap] */
                    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
                    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
                    @Override // com.facebook.msys.mci.EventLogSubscriber
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onLogTalEvent(com.facebook.msys.mci.EventLoggingData r13) {
                        /*
                            Method dump skipped, instructions count: 440
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C94444Mw.onLogTalEvent(com.facebook.msys.mci.EventLoggingData):void");
                    }
                };
            }
            this.A01 = eventLogSubscriber;
        }
        return eventLogSubscriber;
    }

    @Override // com.facebook.msys.mci.Analytics
    public final void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list) {
        this.A00.EHW(AbstractC126045mw.A00(str, str2, list, map, map2, i, i2, j, z));
    }
}
