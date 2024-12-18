package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public final class W28 {
    public static final Map A02;
    public final C70128W5p A00;
    public final List A01 = new ArrayList();

    static {
        String[] strArr = {"alevent:navigation_event", "alevent:instagram_open_application"};
        C14360o3.A0B(strArr, 0);
        C09530e4 c09530e4 = new C09530e4("alevent:media_metric_event", AbstractC009903n.A0K(strArr));
        java.util.Set singleton = Collections.singleton("alevent:media_metric_event");
        C14360o3.A07(singleton);
        C09530e4 c09530e42 = new C09530e4("alevent:instagram_open_application", singleton);
        java.util.Set singleton2 = Collections.singleton("alevent:media_metric_event");
        C14360o3.A07(singleton2);
        A02 = AbstractC25232BEp.A1F("alevent:navigation_event", singleton2, c09530e4, c09530e42);
    }

    public W28(C70128W5p c70128W5p) {
        this.A00 = c70128W5p;
    }
}
