package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57117PVg implements InterfaceC73823Sp {
    public static final C57117PVg A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz != 2) {
                            if (ANz == 3) {
                                j = ADQ.AOC(serialDescriptor, 3);
                                i2 |= 8;
                            } else {
                                throw new X6K(ANz);
                            }
                        } else {
                            j3 = ADQ.AOC(serialDescriptor, 2);
                            i2 |= 4;
                        }
                    } else {
                        j2 = ADQ.AOC(serialDescriptor, 1);
                        i2 |= 2;
                    }
                } else {
                    i = ADQ.AO9(serialDescriptor, 0);
                    i2 |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new IgBgFetchJobRun(i2, i, j2, j3, j);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVg, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun", obj, 4);
        c73833Sq.A00("jobId");
        c73833Sq.A00("timeScheduled");
        c73833Sq.A01("timeStarted", true);
        c73833Sq.A01("timeCompleted", true);
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C192398fh c192398fh = C192398fh.A00;
        C3RJ c3rj = C3RJ.A00;
        return new C3R9[]{c192398fh, c3rj, c3rj, c3rj};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchJobRun igBgFetchJobRun = (IgBgFetchJobRun) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igBgFetchJobRun);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASC(serialDescriptor, 0, igBgFetchJobRun.A02);
        ADR.ASE(serialDescriptor, A1R ? 1 : 0, igBgFetchJobRun.A03);
        if (ADR.EiY(serialDescriptor, 2) || igBgFetchJobRun.A01 != -1) {
            ADR.ASE(serialDescriptor, 2, igBgFetchJobRun.A01);
        }
        if (ADR.EiY(serialDescriptor, 3) || igBgFetchJobRun.A00 != -1) {
            ADR.ASE(serialDescriptor, 3, igBgFetchJobRun.A00);
        }
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
