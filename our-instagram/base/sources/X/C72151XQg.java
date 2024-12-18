package X;

import com.aiplatform.processors.segmentanything.SegmentAnythingOnDeviceProcessorV2;
import com.aiplatform.processors.smartcrop.SaliencyDetectionProcessor;

/* renamed from: X.XQg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72151XQg extends AbstractC72053XLu implements YPY {
    public SegmentAnythingOnDeviceProcessorV2 A00;
    public SaliencyDetectionProcessor A01;
    public C72685XlC A02;
    public String A03;
    public String A04;
    public final C8EC A05;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0457, code lost:
    
        if (r11 <= 0.01f) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03a1, code lost:
    
        if (r12 > 0.01f) goto L98;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x04e5. Please report as an issue. */
    @Override // X.YPY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC223599u2 E57(X.ACP r36, java.util.List r37) {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72151XQg.E57(X.ACP, java.util.List):X.9u2");
    }

    @Override // X.YPY
    public final boolean CbZ() {
        if (this.A03 != null && this.A04 != null && this.A00 != null && this.A01 != null && A08()) {
            return true;
        }
        return false;
    }

    @Override // X.YPY
    public final void Chb() {
        AbstractC72053XLu.A05(this.A05, this, 2);
    }

    public C72151XQg(C8EC c8ec) {
        this.A05 = c8ec;
    }

    @Override // X.YPY
    public final void Eag(C72685XlC c72685XlC) {
        this.A02 = c72685XlC;
    }
}
