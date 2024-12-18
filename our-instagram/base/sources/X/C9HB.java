package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: X.9HB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9HB implements XP9 {
    public boolean A00;
    public boolean A01;
    public final C6PU A02;

    @Override // X.XP9
    public final void ClC(int i, Integer num) {
        C6PU c6pu;
        String valueOf;
        String str;
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 2) {
            c6pu = this.A02;
            valueOf = String.valueOf(i);
            str = "asset_fetch_error_recovery_%s_fail";
        } else {
            c6pu = this.A02;
            valueOf = String.valueOf(i);
            str = "document_fetch_error_recovery_%s_fail";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf);
        C14360o3.A07(formatStrLocaleSafe);
        C6PU.A00(c6pu, formatStrLocaleSafe, null);
    }

    @Override // X.XP9
    public final void ClD(Integer num, Map map, int i) {
        C6PU c6pu;
        String valueOf;
        String str;
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 2) {
            c6pu = this.A02;
            valueOf = String.valueOf(i);
            str = "asset_fetch_error_recovery_%s_start";
        } else {
            c6pu = this.A02;
            valueOf = String.valueOf(i);
            str = "document_fetch_error_recovery_%s_start";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf);
        C14360o3.A07(formatStrLocaleSafe);
        C6PU.A01(c6pu, new C9G3(c6pu, map, formatStrLocaleSafe, 0, c6pu.A01.currentMonotonicTimestampNanos()));
    }

    @Override // X.XP9
    public final void ClE(int i, Integer num) {
        C6PU c6pu;
        String valueOf;
        String str;
        C14360o3.A0B(num, 1);
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 2) {
            c6pu = this.A02;
            valueOf = String.valueOf(i);
            str = "asset_fetch_error_recovery_%s_success";
        } else {
            c6pu = this.A02;
            valueOf = String.valueOf(i);
            str = "document_fetch_error_recovery_%s_success";
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, valueOf);
        C14360o3.A07(formatStrLocaleSafe);
        C6PU.A00(c6pu, formatStrLocaleSafe, null);
    }

    @Override // X.XP9
    public final void CxU(String str, int i) {
        C14360o3.A0B(str, 0);
        boolean z = this.A01;
        C6PU c6pu = this.A02;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("load_source", str);
        String A00 = A00("byte_size", String.valueOf(i), A1G);
        if (z) {
            C6PU.A00(c6pu, "extra_assets_fetch_success", A00);
        } else {
            C6PU.A00(c6pu, "assets_fetch_success", A00);
            this.A00 = true;
        }
    }

    @Override // X.XP9
    public final void DnK(ImmutableMap immutableMap, Integer num, String str) {
        C14360o3.A0B(num, 0);
        C6PU c6pu = this.A02;
        QuickPerformanceLogger quickPerformanceLogger = c6pu.A01;
        C9H8 c9h8 = c6pu.A00;
        C9HA c9ha = c6pu.A02;
        ExecutorService executorService = c6pu.A03;
        if (!executorService.isTerminated() && !executorService.isShutdown()) {
            executorService.execute(new RunnableC24891Azq(c9h8, quickPerformanceLogger, c9ha, immutableMap, num, str, quickPerformanceLogger.currentMonotonicTimestampNanos()));
        } else {
            C0w9.A03("ShowreelNativeErrorReporter", AbstractC111324zv.A00(3788));
        }
    }

    @Override // X.XP9
    public final void Cuv(String str) {
        C6PU.A00(this.A02, "active_request_reuse", A00(AbstractC58354Ptu.A00(), str, AbstractC166987dD.A1G()));
    }

    @Override // X.XP9
    public final void CxS(Throwable th) {
        boolean z = this.A01;
        C6PU c6pu = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("error", "general_error");
        String A00 = A00("error_msg", message, A1G);
        if (z) {
            C6PU.A00(c6pu, "extra_assets_fetch_fail", A00);
        } else {
            C6PU.A00(c6pu, "assets_fetch_fail", A00);
            this.A00 = true;
        }
    }

    @Override // X.XP9
    public final void CxT() {
        boolean z = this.A00;
        C6PU c6pu = this.A02;
        if (z) {
            C6PU.A00(c6pu, "extra_assets_fetch_start", null);
            this.A01 = true;
        } else {
            C6PU.A00(c6pu, "assets_fetch_start", null);
        }
    }

    @Override // X.XP9
    public final void DBB(Throwable th) {
        C6PU c6pu = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("error", "general_error");
        C6PU.A00(c6pu, "document_fetch_fail", A00("error_msg", message, A1G));
    }

    @Override // X.XP9
    public final void DBC() {
        C6PU.A00(this.A02, "document_fetch_start", null);
    }

    @Override // X.XP9
    public final void DBD(String str, int i) {
        C6PU c6pu = this.A02;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("load_source", str);
        C6PU.A00(c6pu, "document_fetch_success", A00("byte_size", String.valueOf(i), A1G));
    }

    @Override // X.XP9
    public final void DXj(boolean z) {
        C6PU c6pu = this.A02;
        C6PU.A01(c6pu, new C207119Eq(0, c6pu, z));
    }

    @Override // X.XP9
    public final void DaO(Throwable th) {
        C6PU c6pu = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("error", "general_error");
        C6PU.A00(c6pu, AbstractC111324zv.A00(5078), A00("error_msg", message, A1G));
    }

    @Override // X.XP9
    public final void DaP() {
        C6PU.A00(this.A02, "prepare_render_start", null);
    }

    @Override // X.XP9
    public final void DaQ() {
        C6PU.A00(this.A02, "prepare_render_success", null);
    }

    @Override // X.XP9
    public final void Dfl() {
        C6PU c6pu = this.A02;
        C6PU.A01(c6pu, new C207039Ei(c6pu, c6pu.A01.currentMonotonicTimestampNanos(), 0));
    }

    @Override // X.XP9
    public final void Dfv(Throwable th) {
        C6PU c6pu = this.A02;
        Integer num = C05F.A00;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C6PU.A01(c6pu, new C9G3(c6pu, num, message, 1, c6pu.A01.currentMonotonicTimestampNanos()));
    }

    @Override // X.XP9
    public final void DgF() {
        this.A02.A02();
    }

    public C9HB(C6PU c6pu) {
        this.A02 = c6pu;
    }

    public static String A00(Object obj, Object obj2, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        String obj3 = new JSONObject(abstractMap).toString();
        C14360o3.A07(obj3);
        return obj3;
    }
}
