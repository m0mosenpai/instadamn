package X;

import com.facebook.proxygen.RequestStats;
import com.facebook.proxygen.TraceEventType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.SLz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62685SLz {
    public String A00 = null;
    public final C1QY A01;
    public final List A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0043. Please report as an issue. */
    public final void A00(RequestStats requestStats) {
        int i;
        for (C62564SGp c62564SGp : this.A02) {
            C1QY c1qy = this.A01;
            String str = this.A00;
            C64122Szg c64122Szg = c62564SGp.A01;
            if (c64122Szg.A01) {
                Map flowTimeData = requestStats.getFlowTimeData();
                flowTimeData.put(AbstractC43591JPw.A00(458), str);
                flowTimeData.put("weight", String.valueOf(C64122Szg.A02));
                String str2 = c1qy.A0E;
                String str3 = "undefined";
                if (str2 == null) {
                    str2 = "undefined";
                }
                switch (c1qy.A09.ordinal()) {
                    case 1:
                        str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
                        break;
                    case 3:
                        str3 = "image";
                        break;
                    case 4:
                        str3 = "other";
                        break;
                    case 5:
                        str3 = "api";
                        break;
                    case 6:
                        str3 = "critical-api";
                        break;
                    case 7:
                        str3 = "media-upload";
                        break;
                    case 8:
                        str3 = "analytics";
                        break;
                    case 10:
                        str3 = c1qy.A0D;
                        break;
                }
                flowTimeData.put(MSV.A00(1548), AnonymousClass001.A0g(str2, ":", str3));
                switch (c62564SGp.A02.intValue()) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 0;
                        break;
                    default:
                        i = -1;
                        break;
                }
                flowTimeData.put("startup_status_on_added", String.valueOf(i));
                flowTimeData.put("http_stack", "Liger");
                C41371vm c41371vm = c62564SGp.A00;
                C19280xC A00 = C19280xC.A00(C41371vm.A01, "mobile_http_flow");
                Iterator A15 = AbstractC166997dE.A15(flowTimeData);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    A00.A0C(AbstractC31172DnG.A17(A1K), AbstractC58318PtA.A0p(A1K));
                }
                InterfaceC11360iu interfaceC11360iu = (InterfaceC11360iu) c41371vm.A00.get();
                if (interfaceC11360iu != null) {
                    interfaceC11360iu.EHW(A00);
                }
            }
            if (c64122Szg.A00) {
                Map certificateVerificationData = requestStats.getCertificateVerificationData();
                certificateVerificationData.put("weight", String.valueOf(5000));
                C41371vm c41371vm2 = c62564SGp.A00;
                C19280xC A002 = C19280xC.A00(C41371vm.A01, TraceEventType.CertVerification);
                Iterator A152 = AbstractC166997dE.A15(certificateVerificationData);
                while (A152.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                    A002.A0C(AbstractC31172DnG.A17(A1K2), AbstractC58318PtA.A0p(A1K2));
                }
                InterfaceC11360iu interfaceC11360iu2 = (InterfaceC11360iu) c41371vm2.A00.get();
                if (interfaceC11360iu2 != null) {
                    interfaceC11360iu2.EHW(A002);
                }
            }
        }
    }

    public C62685SLz(C1QY c1qy, C62564SGp c62564SGp) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = A1E;
        this.A01 = c1qy;
        A1E.add(c62564SGp);
    }
}
