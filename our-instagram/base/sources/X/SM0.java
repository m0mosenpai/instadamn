package X;

import android.net.Uri;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SM0 {
    public final java.util.Set A02 = AbstractC31171DnF.A0l();
    public long A01 = Long.MAX_VALUE;
    public long A00 = Long.MIN_VALUE;

    public final String A00() {
        long j = this.A01;
        long j2 = this.A00;
        java.util.Set set = this.A02;
        String str = null;
        if (!(!set.isEmpty())) {
            set = null;
        }
        if (set == null) {
            return null;
        }
        try {
            JSONObject A17 = AbstractC58318PtA.A17("{\n    \"aggregateList\": [],\n    \"b_constraints\": [\n      []\n    ],\n    \"c_constraints\": [\n      []\n    ],\n    \"cols\": [],\n    \"derivedCols\": [],\n    \"enumCols\": [],\n    \"filterMode\": \"DEFAULT\",\n    \"hideEmptyColumns\": false,\n    \"ignoreGroupByInComparison\": false,\n    \"is_timeseries\": false,\n    \"mappedCols\": [],\n    \"metrik_view_params\": {\n      \"columns_skip_formatting\": [],\n      \"connect_nulls\": true,\n      \"fitToContent\": false,\n      \"height\": \"100%\",\n      \"legend_mode\": \"nongrid\",\n      \"tableID\": \"ls_mci_trace_events_unrestricted\",\n      \"timezone\": \"America/Los_Angeles\",\n      \"timezone_offset\": 480,\n      \"use_y_axis_hints_as_limits\": true,\n      \"width\": \"100%\",\n      \"y_min_hint\": 0\n    },\n    \"modifiers\": [],\n    \"num_samples\": \"100\",\n    \"order\": \"none\",\n    \"order_desc\": true,\n    \"param_dimensions\": [],\n    \"purposes\": [],\n    \"return_remainder\": false,\n    \"sampleCols\": [\n      \"check_point_list\",\n      \"time\",\n      \"trace_id\",\n      \"trace_type\"\n    ],\n    \"samplingRatio\": \"1\",\n    \"should_pivot\": false,\n    \"timezone\": \"America/Los_Angeles\"\n  }");
            String A0g = AnonymousClass001.A0g("[", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", set, C65068Tcx.A00), "]");
            C14360o3.A07(A0g);
            JSONArray A0p = AbstractC31171DnF.A0p();
            JSONObject A0q = AbstractC31171DnF.A0q();
            JSONArray A0p2 = AbstractC31171DnF.A0p();
            JSONArray A0p3 = AbstractC31171DnF.A0p();
            A0p.put(A0g);
            A0q.put("column", "trace_id");
            A0q.put("op", "eq");
            A0q.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0p);
            A0p3.put(A0q);
            A0p2.put(A0p3);
            A17.put("constraints", A0p2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(MSV.A00(608), Locale.US);
            A17.put("start", AbstractC43593JPy.A10(simpleDateFormat, j - 86400000));
            A17.put("end", AbstractC43593JPy.A10(simpleDateFormat, j2 + 86400000));
            str = new Uri.Builder().scheme("https").authority("www.internalfb.com").appendPath("intern").appendPath("scuba").appendPath("query").appendQueryParameter("dataset", "ls_mci_trace_events_unrestricted").appendQueryParameter("pool", "uber").appendQueryParameter("silica_token", "ScubaTable/ls_mci_trace_events_unrestricted:uber").appendQueryParameter("view", "samples_client").appendQueryParameter("drillstate", A17.toString()).toString();
            return str;
        } catch (JSONException unused) {
            return str;
        }
    }
}
