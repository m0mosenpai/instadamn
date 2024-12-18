package X;

import com.facebook.rsys.filelogging.gen.LogFileStats;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.Ond, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55652Ond implements XE6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LogFileStats A01;
    public final /* synthetic */ C52014MzI A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.XE6
    public final void D6h(W63 w63) {
        Long l;
        Long l2;
        C14360o3.A0B(w63, 0);
        String str = w63.A03;
        C14360o3.A0B(str, 1);
        String optString = new JSONObject(str).optString("manifoldPath");
        InterfaceC02590Ai A0H = MSY.A0H(this.A02.A00, "rtc_large_log_upload");
        if (A0H.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0H, "log_type", i);
            } else {
                A0H.AAP("log_type", null);
            }
            AbstractC166997dE.A1N(A0H, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 6);
            AbstractC166997dE.A1N(A0H, "requestor", 1);
            A0H.AAP("manifold_path", optString);
            A0H.AAP("shared_call_id", this.A04);
            LogFileStats logFileStats = this.A01;
            Long l3 = null;
            if (logFileStats != null) {
                l = AbstractC31171DnF.A0V(logFileStats.logBytes);
            } else {
                l = null;
            }
            A0H.A9K("file_size_bytes", l);
            if (logFileStats != null) {
                l2 = AbstractC31171DnF.A0V(logFileStats.droppedLogsCount);
            } else {
                l2 = null;
            }
            A0H.A9K("dropped_logs_count", l2);
            if (logFileStats != null) {
                l3 = AbstractC31171DnF.A0V(logFileStats.droppedLogBytes);
            }
            A0H.A9K("dropped_log_bytes", l3);
            A0H.AAP("local_call_id", this.A03);
            A0H.Cht();
        }
    }

    @Override // X.XE6
    public final void Dbk(float f) {
    }

    public C55652Ond(LogFileStats logFileStats, C52014MzI c52014MzI, String str, String str2, int i) {
        this.A02 = c52014MzI;
        this.A00 = i;
        this.A04 = str;
        this.A01 = logFileStats;
        this.A03 = str2;
    }

    @Override // X.XE6
    public final void D1z() {
        InterfaceC02590Ai A0H = MSY.A0H(this.A02.A00, "rtc_large_log_upload");
        if (A0H.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0H, "log_type", i);
            } else {
                A0H.AAP("log_type", null);
            }
            AbstractC166997dE.A1N(A0H, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
            AbstractC166997dE.A1N(A0H, "requestor", 1);
            A0H.AAP("shared_call_id", this.A04);
            A0H.AAP("local_call_id", this.A03);
            A0H.Cht();
        }
    }

    @Override // X.XE6
    public final void DFz(VIA via) {
        InterfaceC02590Ai A0H = MSY.A0H(this.A02.A00, "rtc_large_log_upload");
        if (A0H.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0H, "log_type", i);
            } else {
                A0H.AAP("log_type", null);
            }
            AbstractC166997dE.A1N(A0H, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
            AbstractC166997dE.A1N(A0H, "requestor", 1);
            A0H.AAP("shared_call_id", this.A04);
            A0H.AAP("local_call_id", this.A03);
            A0H.Cht();
        }
    }

    @Override // X.XE6
    public final void onStart() {
        Long l;
        Long l2;
        InterfaceC02590Ai A0H = MSY.A0H(this.A02.A00, "rtc_large_log_upload");
        if (A0H.isSampled()) {
            int i = this.A00;
            if (i != Integer.MIN_VALUE) {
                AbstractC166997dE.A1N(A0H, "log_type", i);
            } else {
                A0H.AAP("log_type", null);
            }
            AbstractC166997dE.A1N(A0H, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 4);
            AbstractC166997dE.A1N(A0H, "requestor", 1);
            A0H.AAP("shared_call_id", this.A04);
            LogFileStats logFileStats = this.A01;
            Long l3 = null;
            if (logFileStats != null) {
                l = AbstractC31171DnF.A0V(logFileStats.logBytes);
            } else {
                l = null;
            }
            A0H.A9K("file_size_bytes", l);
            if (logFileStats != null) {
                l2 = AbstractC31171DnF.A0V(logFileStats.droppedLogsCount);
            } else {
                l2 = null;
            }
            A0H.A9K("dropped_logs_count", l2);
            if (logFileStats != null) {
                l3 = AbstractC31171DnF.A0V(logFileStats.droppedLogBytes);
            }
            A0H.A9K("dropped_log_bytes", l3);
            A0H.AAP("local_call_id", this.A03);
            A0H.Cht();
        }
    }
}
