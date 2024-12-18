package X;

import com.facebook.quicklog.EventBuilder;

/* loaded from: classes9.dex */
public final class PQz implements Runnable {
    public final /* synthetic */ C70243Di A00;
    public final /* synthetic */ String A01;

    public PQz(C70243Di c70243Di, String str) {
        this.A00 = c70243Di;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EventBuilder level;
        String str;
        C70243Di c70243Di = this.A00;
        C006802i c006802i = c70243Di.A09;
        c006802i.markerStart(728437378);
        String str2 = C55772hI.A00(c70243Di.A0A).A0C;
        if (str2 != null) {
            String str3 = this.A01;
            if (C14360o3.A0K(str3, str2)) {
                level = c006802i.markEventBuilder(728433975, "AppEntryResetUserNavigationBehavior").setLevel(7);
                str = "AppEntryMovedBackToLastVisited";
            } else {
                boolean equals = str2.equals("feed_timeline");
                EventBuilder markEventBuilder = c006802i.markEventBuilder(728433975, "AppEntryResetUserNavigationBehavior");
                if (equals) {
                    level = markEventBuilder.setLevel(7);
                    str = "AppEntryHoldOnFeed";
                } else {
                    markEventBuilder.setLevel(7).annotate("AppEntrySwitchedToAnotherSurface", AnonymousClass001.A0g(str3, "->", str2)).report();
                    c006802i.markerAnnotate(728437378, "AppEntrySwitchedToAnotherSurface", AnonymousClass001.A0g(str3, "->", str2));
                }
            }
            level.annotate(str, str3).report();
            c006802i.markerAnnotate(728437378, str, str3);
        }
        c006802i.markerEnd(728437378, (short) 2);
    }
}
