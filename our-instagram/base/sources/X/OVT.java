package X;

import com.facebook.rtc.views.omnigrid.OmniGridLayoutManager;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* loaded from: classes9.dex */
public final class OVT {
    public final /* synthetic */ OmniGridView A00;

    public OVT(OmniGridView omniGridView) {
        this.A00 = omniGridView;
    }

    public final void A00(int i) {
        int i2;
        AbstractC51368MmT abstractC51368MmT;
        OmniGridView omniGridView = this.A00;
        OmniGridView.A02(omniGridView, i);
        AbstractC09800fd.A01("OmniGridView.updateTransparencyForLayoutPosition", 1296748016);
        try {
            C3OO A0W = omniGridView.A0G.A0W(i, false);
            if ((A0W instanceof AbstractC51368MmT) && (abstractC51368MmT = (AbstractC51368MmT) A0W) != null) {
                if (!abstractC51368MmT.equals(omniGridView.A03)) {
                    OmniGridLayoutManager omniGridLayoutManager = omniGridView.A0I;
                    C51727Mt4 c51727Mt4 = omniGridLayoutManager.A07;
                    float f = 1.0f;
                    if (AbstractC167007dF.A1M(c51727Mt4.A04)) {
                        float A00 = ((C51614Mr7) c51727Mt4.A09.get(i)).A02.A00(omniGridLayoutManager.A1a());
                        if (A00 < 0.5f) {
                            float f2 = (A00 * 1.4f) + 0.3f;
                            if (f2 < 0.3f) {
                                f = 0.3f;
                            } else if (f2 <= 1.0f) {
                                f = f2;
                            }
                        }
                    }
                    AbstractC09800fd.A01("GridItemViewHolder.setTransparency", -1866985560);
                    try {
                        abstractC51368MmT.A02.setAlpha(f);
                        AbstractC09800fd.A00(990969580);
                    } catch (Throwable th) {
                        AbstractC09800fd.A00(1973634028);
                        throw th;
                    }
                }
                i2 = -521769283;
            } else {
                i2 = 629145732;
            }
            AbstractC09800fd.A00(i2);
        } catch (Throwable th2) {
            AbstractC09800fd.A00(848211781);
            throw th2;
        }
    }

    public OVT() {
    }
}
