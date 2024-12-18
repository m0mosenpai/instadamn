package X;

import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Azq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24891Azq implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C9H8 A01;
    public final /* synthetic */ QuickPerformanceLogger A02;
    public final /* synthetic */ C9HA A03;
    public final /* synthetic */ ImmutableMap A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;

    public RunnableC24891Azq(C9H8 c9h8, QuickPerformanceLogger quickPerformanceLogger, C9HA c9ha, ImmutableMap immutableMap, Integer num, String str, long j) {
        this.A02 = quickPerformanceLogger;
        this.A01 = c9h8;
        this.A00 = j;
        this.A03 = c9ha;
        this.A05 = num;
        this.A06 = str;
        this.A04 = immutableMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        int i;
        QuickPerformanceLogger quickPerformanceLogger = this.A02;
        C9H8 c9h8 = this.A01;
        int hashCode = c9h8.hashCode();
        long j = this.A00;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC58354Ptu.A00(), c9h8.A05);
        A1G.put("client_name", c9h8.A02);
        A1G.put("placement", c9h8.A04);
        A1G.put("template_name", c9h8.A06);
        A1G.put("logging_info", c9h8.A03);
        A1G.put(TraceFieldType.ContentLength, String.valueOf(c9h8.A01));
        A1G.put("custom_logging_info", this.A03.A00());
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 0:
            case 1:
                str = "network";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                str = "data";
                break;
            case 6:
            case 7:
                str = "rendering";
                break;
        }
        A1G.put(AbstractC111324zv.A00(2317), str);
        switch (intValue) {
            case 1:
                str2 = "ASSETS_FETCH_FAIL";
                break;
            case 2:
                str2 = "IMAGE_DIM_MISMATCH";
                break;
            case 3:
            case 4:
            case 5:
            default:
                str2 = "DOCUMENT_FETCH_FAIL";
                break;
            case 6:
            case 7:
                str2 = "PREPARE_RENDER_FAIL";
                break;
        }
        A1G.put("error_name", str2);
        switch (intValue) {
            case 0:
                i = 200;
                break;
            case 1:
                i = 210;
                break;
            case 2:
                i = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
                break;
            case 3:
                i = 310;
                break;
            case 4:
                i = 311;
                break;
            case 5:
                i = 312;
                break;
            case 6:
                i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                break;
            default:
                i = 401;
                break;
        }
        A1G.put(TraceFieldType.ErrorCode, String.valueOf(i));
        A1G.put("error_message", this.A06);
        ImmutableMap immutableMap = this.A04;
        C14360o3.A0C(immutableMap, AbstractC43591JPw.A00(48));
        A1G.put("error_data", new JSONObject(immutableMap).toString());
        C139446Sz.A03(quickPerformanceLogger, A1G, timeUnit, 51527556, hashCode, j);
        ImmutableMap immutableMap2 = RegularImmutableMap.A02;
        C14360o3.A07(immutableMap2);
        C139446Sz.A04(quickPerformanceLogger, immutableMap2, timeUnit, 51527556, hashCode, j, (short) 2);
    }
}
