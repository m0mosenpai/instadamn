package X;

import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Iq3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42402Iq3 implements MQS {
    public final /* synthetic */ C145176gc A00;
    public final /* synthetic */ String A01;

    public C42402Iq3(C145176gc c145176gc, String str) {
        this.A00 = c145176gc;
        this.A01 = str;
    }

    @Override // X.MQS
    public final void CmB() {
        String str;
        C145176gc c145176gc = this.A00;
        C41551w4 c41551w4 = ((ReelViewerFragment) c145176gc.A18).A0a;
        if (c41551w4 != null && (str = this.A01) != null) {
            C145826hf c145826hf = c145176gc.A0L;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            c145826hf.A0O(c41551w4, str);
        }
    }

    @Override // X.MQS
    public final void CmC(boolean z) {
        String str;
        C145176gc c145176gc = this.A00;
        C41551w4 c41551w4 = ((ReelViewerFragment) c145176gc.A18).A0a;
        if (c41551w4 != null && (str = this.A01) != null) {
            C145826hf c145826hf = c145176gc.A0L;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            c145826hf.A0Q(c41551w4, null, str, 0.0f, 0.0f);
        }
    }

    @Override // X.MQS
    public final void CmF() {
        C145176gc c145176gc = this.A00;
        C41551w4 c41551w4 = ((ReelViewerFragment) c145176gc.A18).A0a;
        if (c41551w4 != null) {
            C145826hf c145826hf = c145176gc.A0L;
            if (c145826hf == null) {
                C14360o3.A0F("reelViewerLogger");
                throw C00O.createAndThrow();
            }
            c145826hf.A0O(c41551w4, MSV.A00(101));
        }
    }
}
