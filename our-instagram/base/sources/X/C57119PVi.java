package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57119PVi implements InterfaceC73823Sp {
    public static final C57119PVi A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        IgBgFetchJob igBgFetchJob = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        j = ADQ.AOC(serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    igBgFetchJob = (IgBgFetchJob) ADQ.AOF(igBgFetchJob, C57116PVf.A00, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new IgBgFetchPendingJob(igBgFetchJob, i, j);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVi, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob", obj, 2);
        c73833Sq.A00("job");
        c73833Sq.A00("timeScheduled");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C57116PVf.A00, C3RJ.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchPendingJob igBgFetchPendingJob = (IgBgFetchPendingJob) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igBgFetchPendingJob);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(igBgFetchPendingJob.A01, C57116PVf.A00, serialDescriptor, 0);
        ADR.ASE(serialDescriptor, A1R ? 1 : 0, igBgFetchPendingJob.A00);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
