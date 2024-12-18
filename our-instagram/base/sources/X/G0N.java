package X;

import com.facebook.common.dextricks.DexStore;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* loaded from: classes6.dex */
public final class G0N implements InterfaceC60152ox {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33166EkD A01;

    public G0N(C33166EkD c33166EkD, int i) {
        this.A01 = c33166EkD;
        this.A00 = i;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        C33166EkD c33166EkD = this.A01;
        java.util.Set set = Rb0.A07;
        SimpleWebViewConfig simpleWebViewConfig = c33166EkD.A00;
        if (simpleWebViewConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        if (!simpleWebViewConfig.A07) {
            i -= this.A00;
        }
        AbstractC13880nE.A0Y(c33166EkD.requireView(), Math.max(i, 0));
    }
}
