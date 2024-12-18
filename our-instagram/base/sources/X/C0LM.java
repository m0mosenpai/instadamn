package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0LM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LM extends C0YY implements InterfaceC16660sJ {
    public static final C0LM A00 = new C0LM();

    public C0LM() {
        super(1);
    }

    public static final List A00(Context context) {
        C14360o3.A0B(context, 0);
        List singletonList = Collections.singletonList(JQM.A00(AbstractC009903n.A0K(new String[]{"last_app_task_removal_timestamp", "last_app_task_removal_unixtime", "last_app_background_timestamp", "last_app_background_unixtime", "last_navigation_source", "last_navigation_destination", "last_navigation_fragment_classname", "last_navigation_timestamp", "last_navigation_history", "last_nav_chain", "last_bug_report_id", "last_bug_report_unixtime"}), new C0AP(context, 0)));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00((Context) obj);
    }
}
