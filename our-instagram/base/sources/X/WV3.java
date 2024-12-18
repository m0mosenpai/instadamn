package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rsys.dominantspeaker.gen.DominantSpeakerModel;
import com.facebook.rsys.roomtypecalling.gen.CallingAppContext;
import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.rsys.videorender.gen.VideoRenderProxy;
import com.instagram.rtc.rsys.models.IGMediaStats;

/* loaded from: classes11.dex */
public final class WV3 implements C2N9 {
    public final int A00;

    public WV3(int i) {
        this.A00 = i;
    }

    @Override // X.C2N9
    public final /* bridge */ /* synthetic */ Object AJz(McfReference mcfReference) {
        switch (this.A00) {
            case 0:
                return CryptoE2eeModel.createFromMcfType(mcfReference);
            case 1:
                return DominantSpeakerModel.createFromMcfType(mcfReference);
            case 2:
                return CallingAppContext.createFromMcfType(mcfReference);
            case 3:
                return TurnAllocationCallback.CProxy.createFromMcfType(mcfReference);
            case 4:
                return TurnAllocationProxy.CProxy.createFromMcfType(mcfReference);
            case 5:
                return VideoRenderProxy.CProxy.createFromMcfType(mcfReference);
            default:
                return IGMediaStats.createFromMcfType(mcfReference);
        }
    }

    @Override // X.C2N9
    public final Class BUQ() {
        switch (this.A00) {
            case 0:
                return CryptoE2eeModel.class;
            case 1:
                return DominantSpeakerModel.class;
            case 2:
                return CallingAppContext.class;
            case 3:
                return TurnAllocationCallback.class;
            case 4:
                return TurnAllocationProxy.class;
            case 5:
                return VideoRenderProxy.class;
            default:
                return IGMediaStats.class;
        }
    }

    @Override // X.C2N9
    public final long CBx() {
        switch (this.A00) {
            case 0:
                long j = CryptoE2eeModel.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long nativeGetMcfTypeId = CryptoE2eeModel.nativeGetMcfTypeId();
                CryptoE2eeModel.sMcfTypeId = nativeGetMcfTypeId;
                return nativeGetMcfTypeId;
            case 1:
                long j2 = DominantSpeakerModel.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long nativeGetMcfTypeId2 = DominantSpeakerModel.nativeGetMcfTypeId();
                DominantSpeakerModel.sMcfTypeId = nativeGetMcfTypeId2;
                return nativeGetMcfTypeId2;
            case 2:
                long j3 = CallingAppContext.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long nativeGetMcfTypeId3 = CallingAppContext.nativeGetMcfTypeId();
                CallingAppContext.sMcfTypeId = nativeGetMcfTypeId3;
                return nativeGetMcfTypeId3;
            case 3:
                long j4 = TurnAllocationCallback.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long nativeGetMcfTypeId4 = TurnAllocationCallback.CProxy.nativeGetMcfTypeId();
                TurnAllocationCallback.CProxy.sMcfTypeId = nativeGetMcfTypeId4;
                return nativeGetMcfTypeId4;
            case 4:
                long j5 = TurnAllocationProxy.CProxy.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long nativeGetMcfTypeId5 = TurnAllocationProxy.CProxy.nativeGetMcfTypeId();
                TurnAllocationProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId5;
                return nativeGetMcfTypeId5;
            case 5:
                long j6 = VideoRenderProxy.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long nativeGetMcfTypeId6 = VideoRenderProxy.CProxy.nativeGetMcfTypeId();
                VideoRenderProxy.CProxy.sMcfTypeId = nativeGetMcfTypeId6;
                return nativeGetMcfTypeId6;
            default:
                long j7 = IGMediaStats.sMcfTypeId;
                if (j7 == 0) {
                    long nativeGetMcfTypeId7 = IGMediaStats.nativeGetMcfTypeId();
                    IGMediaStats.sMcfTypeId = nativeGetMcfTypeId7;
                    return nativeGetMcfTypeId7;
                }
                return j7;
        }
    }
}
