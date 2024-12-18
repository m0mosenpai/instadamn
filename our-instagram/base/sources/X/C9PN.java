package X;

import java.util.Map;

/* renamed from: X.9PN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9PN {
    public final /* synthetic */ C175887s2 A00;

    public final void A00(C212399b8 c212399b8) {
        Object obj;
        String str;
        Map map = c212399b8.A00;
        if (map != null) {
            obj = map.get("fba_error_code");
        } else {
            obj = "null";
        }
        C0K8.A0L("AudioPipelineController", "PlatformOutputError %s", c212399b8, obj);
        C175887s2 c175887s2 = this.A00;
        InterfaceC178407wE interfaceC178407wE = c175887s2.A0L;
        long A0M = AbstractC166987dD.A0M(c175887s2);
        Map map2 = c212399b8.A00;
        if (map2 != null) {
            str = AbstractC166987dD.A1A("fba_error_code", map2);
        } else {
            str = null;
        }
        interfaceC178407wE.CiQ(c212399b8, "audio_pipeline_error", "AudioPipelineController", "debug", "PlatformOutputError", str, A0M);
    }

    public C9PN(C175887s2 c175887s2) {
        this.A00 = c175887s2;
    }
}
