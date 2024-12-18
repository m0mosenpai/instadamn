package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9PO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9PO {
    public final /* synthetic */ C175887s2 A00;

    public C9PO(C175887s2 c175887s2) {
        this.A00 = c175887s2;
    }

    public final void A00(long j, HashMap hashMap) {
        String str;
        C175887s2 c175887s2 = this.A00;
        if (!hashMap.isEmpty()) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                A1C.append(AbstractC224539ve.A00(AbstractC166987dD.A0H(A1K.getKey())));
                A1C.append("(");
                A1C.append(A1K.getValue());
                A1C.append(");");
            }
            C212399b8 c212399b8 = new C212399b8("Failures during input capture");
            c212399b8.A00("input_capture_error_codes", A1C.toString());
            c212399b8.A00("input_capture_total_frames", String.valueOf(j));
            InterfaceC178407wE interfaceC178407wE = c175887s2.A0L;
            long A0M = AbstractC166987dD.A0M(c175887s2);
            Map map = c212399b8.A00;
            if (map != null) {
                str = AbstractC166987dD.A1A("fba_error_code", map);
            } else {
                str = null;
            }
            interfaceC178407wE.CiQ(c212399b8, "audio_pipeline_error", "AudioPipelineController", "debug", "InputCaptureErrors", str, A0M);
        }
    }

    public final void A01(AH7 ah7, boolean z) {
        int i;
        C175887s2 c175887s2 = this.A00;
        HashMap hashMap = new HashMap(6);
        if (ah7.A06 > 30) {
            hashMap.put(AbstractC111324zv.A00(1225), String.valueOf(ah7.A01()));
            long j = ah7.A01;
            if (j > -1) {
                hashMap.put(AbstractC111324zv.A00(1227), String.valueOf(j));
            }
            hashMap.put(AbstractC111324zv.A00(1230), String.valueOf(ah7.A0A));
            hashMap.put(AbstractC111324zv.A00(1226), String.valueOf(Math.round(((float) ah7.A0C) / 1000000.0f)));
            hashMap.put(AbstractC111324zv.A00(1228), String.valueOf(ah7.A06));
            hashMap.put(AbstractC111324zv.A00(1229), String.valueOf(ah7.A0B));
            hashMap.put("render_fba_profile_info", ah7.A08);
            InterfaceC178407wE interfaceC178407wE = c175887s2.A0L;
            if (z) {
                i = 1958;
            } else {
                i = 1957;
            }
            interfaceC178407wE.CiR(AbstractC166987dD.A0M(c175887s2), AbstractC111324zv.A00(i), "AudioPipelineController", hashMap);
        }
    }
}
