package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.PTr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57078PTr implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InterfaceC57902Pm6 A01;
    public final /* synthetic */ InterfaceC58099PpO A02;
    public final /* synthetic */ OUF A03;
    public final /* synthetic */ O1O A04;
    public final /* synthetic */ C54717OEu A05;
    public final /* synthetic */ HashMap A06;

    public RunnableC57078PTr(InterfaceC57902Pm6 interfaceC57902Pm6, InterfaceC58099PpO interfaceC58099PpO, OUF ouf, O1O o1o, C54717OEu c54717OEu, HashMap hashMap, long j) {
        this.A03 = ouf;
        this.A06 = hashMap;
        this.A02 = interfaceC58099PpO;
        this.A01 = interfaceC57902Pm6;
        this.A05 = c54717OEu;
        this.A04 = o1o;
        this.A00 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C53398Njn exc;
        try {
            OUF ouf = this.A03;
            C54505O6i c54505O6i = ouf.A00;
            HashMap hashMap = this.A06;
            InterfaceC57902Pm6 interfaceC57902Pm6 = this.A01;
            hashMap.put("extra_info", interfaceC57902Pm6.EqL());
            HashMap A12 = AbstractC31174DnI.A12("extra_info", "null");
            A12.put("input_media_info", "null");
            A12.put("integration_point", "null");
            A12.put("type_name", "null");
            A12.put("waterfall_id", "null");
            HashMap hashMap2 = c54505O6i.A01;
            A12.putAll(hashMap2);
            A12.putAll(hashMap);
            XC1 xc1 = c54505O6i.A00;
            if (xc1 != null) {
                xc1.logEvent("cvat_smartsdk_detection_started", A12);
            }
            InterfaceC58099PpO interfaceC58099PpO = this.A02;
            C54717OEu c54717OEu = this.A05;
            InterfaceC57792PkJ detectMediaEvents = interfaceC58099PpO.detectMediaEvents(interfaceC57902Pm6, c54717OEu);
            hashMap.putAll(interfaceC58099PpO.getLoggingParams());
            hashMap.put("processing_time", String.valueOf((int) MSZ.A0B(this.A00)));
            HashMap A122 = AbstractC31174DnI.A12("processing_time", "0");
            A122.put("video_duration", "0");
            A122.put(TraceFieldType.ErrorCode, "null");
            A122.put("integration_point", "null");
            A122.put("extra_info", "null");
            A122.put("type_name", "null");
            A122.put("waterfall_id", "null");
            A122.putAll(hashMap2);
            A122.putAll(hashMap);
            if (xc1 != null) {
                xc1.logEvent("cvat_smartsdk_detection_finished", A122);
            }
            ouf.A02.remove(this.A04);
            C50866Mdx c50866Mdx = c54717OEu.A04;
            MSW.A09(c50866Mdx.A06).post(new RunnableC57082PTv(detectMediaEvents, c50866Mdx, c54717OEu.A06, c54717OEu.A07, c54717OEu.A00, c54717OEu.A01, c54717OEu.A03, c54717OEu.A02));
        } catch (Throwable th) {
            if (th instanceof C53398Njn) {
                exc = th;
            } else {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                exc = new Exception(AnonymousClass001.A0R("Runtime Error: ", message), th);
            }
            OUF ouf2 = this.A03;
            C54505O6i c54505O6i2 = ouf2.A00;
            HashMap hashMap3 = this.A06;
            InterfaceC58099PpO interfaceC58099PpO2 = this.A02;
            long j = this.A00;
            hashMap3.putAll(interfaceC58099PpO2.getLoggingParams());
            hashMap3.put("processing_time", String.valueOf((int) MSZ.A0B(j)));
            String message2 = exc.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            hashMap3.put(TraceFieldType.ErrorCode, message2);
            String A0m = AbstractC50522MSa.A0m(exc);
            C14360o3.A07(A0m);
            hashMap3.put("error_trace", A0m);
            HashMap A123 = AbstractC31174DnI.A12("video_duration", "0");
            A123.put("processing_time", "0");
            A123.put(TraceFieldType.ErrorCode, "null");
            A123.put("error_trace", "null");
            A123.put("integration_point", "null");
            A123.put("extra_info", "null");
            A123.put("type_name", "null");
            A123.put("waterfall_id", "null");
            A123.putAll(c54505O6i2.A01);
            A123.putAll(hashMap3);
            XC1 xc12 = c54505O6i2.A00;
            if (xc12 != null) {
                xc12.logEvent("cvat_smartsdk_detection_failed", A123);
            }
            ouf2.A02.remove(this.A04);
            C54717OEu c54717OEu2 = this.A05;
            C50866Mdx c50866Mdx2 = c54717OEu2.A04;
            MSW.A09(c50866Mdx2.A06).post(new RunnableC57061PTa(exc, c50866Mdx2, c54717OEu2.A05, c54717OEu2.A06, c54717OEu2.A01));
        }
    }
}
