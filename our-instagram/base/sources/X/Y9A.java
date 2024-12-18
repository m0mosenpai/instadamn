package X;

import com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2;
import com.aiplatform.processors.smartcrop.SaliencyDetectionProcessor;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y9A implements C8EF {
    public final int A00;
    public final Object A01;

    public Y9A(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C8EF
    public final void D6b(Exception exc, List list) {
        try {
            switch (this.A00) {
                case 0:
                    C14360o3.A0B(list, 0);
                    if (!AbstractC166987dD.A1b(list)) {
                        return;
                    }
                    C72150XQf c72150XQf = (C72150XQf) this.A01;
                    c72150XQf.A00 = A00(list, 0);
                    list.get(0);
                    if (c72150XQf.A01 != null || !c72150XQf.A08()) {
                        return;
                    }
                    A6P A00 = A6P.A00(c72150XQf.A00, 0);
                    A00.A00.loadMethod("forward");
                    c72150XQf.A01 = A00;
                    return;
                case 1:
                    C14360o3.A0B(list, 0);
                    if (!AbstractC166987dD.A1b(list)) {
                        return;
                    }
                    C72154XQj c72154XQj = (C72154XQj) this.A01;
                    c72154XQj.A01 = A00(list, 0);
                    list.get(0);
                    if (c72154XQj.A02 != null || !c72154XQj.A08()) {
                        return;
                    }
                    A6P A002 = A6P.A00(c72154XQj.A01, 0);
                    A002.A00.loadMethod("forward");
                    c72154XQj.A02 = A002;
                    return;
                case 2:
                    C14360o3.A0B(list, 0);
                    if (!(!list.isEmpty())) {
                        return;
                    }
                    C72151XQg c72151XQg = (C72151XQg) this.A01;
                    c72151XQg.A03 = A00(list, 0);
                    c72151XQg.A04 = A00(list, 1);
                    Integer num = ((C184028Eq) list.get(1)).A00;
                    if ((num != null && num.intValue() < 9020) || !c72151XQg.A08()) {
                        return;
                    }
                    String str = c72151XQg.A03;
                    if (str != null) {
                        SaliencyDetectionProcessor saliencyDetectionProcessor = new SaliencyDetectionProcessor(new C23291AUc(AbstractC166987dD.A1J(str)));
                        c72151XQg.A01 = saliencyDetectionProcessor;
                        saliencyDetectionProcessor.A02.AV9(new Y9A(saliencyDetectionProcessor, 4), true);
                    }
                    String str2 = c72151XQg.A04;
                    if (str2 == null) {
                        return;
                    }
                    SegmentAnythingOnDeviceProcessorV2 segmentAnythingOnDeviceProcessorV2 = new SegmentAnythingOnDeviceProcessorV2(new C23291AUc(AbstractC166987dD.A1J(str2)));
                    c72151XQg.A00 = segmentAnythingOnDeviceProcessorV2;
                    segmentAnythingOnDeviceProcessorV2.Chb();
                    return;
                case 3:
                    C14360o3.A0B(list, 0);
                    if (!AbstractC166987dD.A1b(list)) {
                        return;
                    }
                    SegmentAnythingOnDeviceProcessorV2 segmentAnythingOnDeviceProcessorV22 = (SegmentAnythingOnDeviceProcessorV2) this.A01;
                    segmentAnythingOnDeviceProcessorV22.A01 = A00(list, 0);
                    list.get(0);
                    if (segmentAnythingOnDeviceProcessorV22.A02 != null || !segmentAnythingOnDeviceProcessorV22.A08()) {
                        return;
                    }
                    segmentAnythingOnDeviceProcessorV22.A02 = AbstractC193188gy.A00(segmentAnythingOnDeviceProcessorV22.A01);
                    return;
                case 4:
                    C14360o3.A0B(list, 0);
                    if (!AbstractC166987dD.A1b(list)) {
                        return;
                    }
                    SaliencyDetectionProcessor saliencyDetectionProcessor2 = (SaliencyDetectionProcessor) this.A01;
                    String A003 = A00(list, 0);
                    saliencyDetectionProcessor2.A00 = A003;
                    if (saliencyDetectionProcessor2.A01 != null) {
                        return;
                    }
                    saliencyDetectionProcessor2.A01 = AbstractC193188gy.A00(A003);
                    return;
                case 5:
                    C14360o3.A0B(list, 0);
                    if (!AbstractC166987dD.A1b(list)) {
                        return;
                    }
                    C72153XQi c72153XQi = (C72153XQi) this.A01;
                    c72153XQi.A00 = A00(list, 0);
                    if (c72153XQi.A01 != null || !c72153XQi.CbZ()) {
                        return;
                    }
                    c72153XQi.A01 = AbstractC193188gy.A00(c72153XQi.A00);
                    return;
                default:
                    C14360o3.A0B(list, 0);
                    if ((!list.isEmpty()) && list.size() > 1) {
                        C72152XQh c72152XQh = (C72152XQh) this.A01;
                        c72152XQh.A04 = A00(list, 0);
                        c72152XQh.A03 = A00(list, 1);
                        if (c72152XQh.A08()) {
                            String str3 = c72152XQh.A04;
                            if (str3 != null) {
                                C72153XQi c72153XQi2 = new C72153XQi(new C23291AUc(AbstractC166987dD.A1J(str3)));
                                c72152XQh.A01 = c72153XQi2;
                                c72153XQi2.Chb();
                            }
                            String str4 = c72152XQh.A03;
                            if (str4 != null) {
                                C72154XQj c72154XQj2 = new C72154XQj(new C23291AUc(AbstractC166987dD.A1J(str4)));
                                c72152XQh.A00 = c72154XQj2;
                                c72154XQj2.Chb();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        } catch (Exception unused) {
        }
    }

    public static String A00(List list, int i) {
        return ((C184028Eq) list.get(i)).A01;
    }
}
