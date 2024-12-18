package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57116PVf implements InterfaceC73823Sp {
    public static final C57116PVf A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        j = ADQ.AOC(serialDescriptor, 1);
                        i2 |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    i = ADQ.AO9(serialDescriptor, 0);
                    i2 |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new IgBgFetchJob(i2, i, j);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVf, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.jobscheduler.bgfetch.IgBgFetchJob", obj, 2);
        c73833Sq.A00("jobId");
        c73833Sq.A00("earliestTimeToRun");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{C192398fh.A00, C3RJ.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchJob igBgFetchJob = (IgBgFetchJob) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igBgFetchJob);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASC(serialDescriptor, 0, igBgFetchJob.A00);
        ADR.ASE(serialDescriptor, A1R ? 1 : 0, igBgFetchJob.A01);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
