package X;

import android.os.SystemClock;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: X.N0x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52046N0x extends AbstractC51451Mnx {
    public final ImmutableMap A00;
    public final List A01;
    public final List A02;

    public C52046N0x(C52028N0a c52028N0a, String str, String str2, String str3, String str4, List list, List list2, int i, int i2, long j) {
        super(c52028N0a, Boolean.TYPE);
        JSONArray jSONArray;
        this.A01 = list;
        this.A02 = list2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        C09530e4 A1L = AbstractC166987dD.A1L("target_provider", "instagram");
        C09530e4 A1L2 = AbstractC166987dD.A1L(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        C09530e4 A1L3 = AbstractC166987dD.A1L("caller_id", str2);
        C09530e4 A1L4 = AbstractC166987dD.A1L("caller_name", str3);
        C09530e4 A1L5 = AbstractC166987dD.A1L("group_name", str4);
        if (list != null) {
            jSONArray = new JSONArray((Collection) list);
        } else {
            jSONArray = null;
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(A1L, A1L2, A1L3, A1L4, A1L5, AbstractC166987dD.A1L("group_participant_id", jSONArray), AbstractC166987dD.A1L("group_participant_name", list2 != null ? new JSONArray((Collection) list2) : null), AbstractC166987dD.A1L("call_state", Integer.valueOf(i)), AbstractC166987dD.A1L("call_type", Integer.valueOf(i2)), AbstractC166987dD.A1L("notification_time_ms", Long.valueOf(j)), AbstractC166987dD.A1L("request_sent_timestamp", Long.valueOf(SystemClock.elapsedRealtime())));
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A14 = AbstractC166997dE.A14(A07);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            if (A1K.getValue() != null) {
                AbstractC43594JPz.A1S(A1I, A1K);
            }
        }
        builder.putAll(A1I);
        this.A00 = builder.buildOrThrow();
    }
}
