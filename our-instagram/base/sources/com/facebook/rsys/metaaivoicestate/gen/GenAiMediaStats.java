package com.facebook.rsys.metaaivoicestate.gen;

import X.AbstractC25228BEl;
import X.AnonymousClass001;
import X.C2N9;
import X.YAM;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class GenAiMediaStats {
    public static C2N9 CONVERTER = YAM.A00(5);
    public static long sMcfTypeId;
    public final long serverToClientAudioCtpLatencyMs;

    public static native GenAiMediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GenAiMediaStats) && this.serverToClientAudioCtpLatencyMs == ((GenAiMediaStats) obj).serverToClientAudioCtpLatencyMs;
        }
        return true;
    }

    public int hashCode() {
        return 527 + AbstractC25228BEl.A03(this.serverToClientAudioCtpLatencyMs);
    }

    public String toString() {
        return AnonymousClass001.A0e("GenAiMediaStats{serverToClientAudioCtpLatencyMs=", "}", this.serverToClientAudioCtpLatencyMs);
    }

    public GenAiMediaStats(long j) {
        this.serverToClientAudioCtpLatencyMs = j;
    }
}
