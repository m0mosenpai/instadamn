package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PVh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57118PVh implements InterfaceC73823Sp {
    public static final C57118PVh A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        C3R9[] c3r9Arr = IgBgFetchMetadata.A03;
        List list = null;
        long j = 0;
        List list2 = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz != 1) {
                        if (ANz == 2) {
                            list2 = (List) MSW.A12(list2, serialDescriptor, ADQ, c3r9Arr, 2);
                            i |= 4;
                        } else {
                            throw new X6K(ANz);
                        }
                    } else {
                        list = (List) MSW.A12(list, serialDescriptor, ADQ, c3r9Arr, 1);
                        i |= 2;
                    }
                } else {
                    j = ADQ.AOC(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new IgBgFetchMetadata(list, list2, i, j);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.PVh, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata", obj, 3);
        c73833Sq.A00("backgroundedTimestamp");
        c73833Sq.A00("completedRuns");
        c73833Sq.A00("pendingJobs");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        C3R9[] c3r9Arr = IgBgFetchMetadata.A03;
        return new C3R9[]{C3RJ.A00, c3r9Arr[1], c3r9Arr[2]};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchMetadata igBgFetchMetadata = (IgBgFetchMetadata) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, igBgFetchMetadata);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        C3R9[] c3r9Arr = IgBgFetchMetadata.A03;
        ADR.ASE(serialDescriptor, 0, igBgFetchMetadata.A00);
        ADR.ASH(igBgFetchMetadata.A01, c3r9Arr[A1R ? 1 : 0], serialDescriptor, A1R ? 1 : 0);
        ADR.ASH(igBgFetchMetadata.A02, c3r9Arr[2], serialDescriptor, 2);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
