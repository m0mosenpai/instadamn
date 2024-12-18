package X;

import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.BakeoffFeedPairSectionController;
import java.lang.ref.Reference;
import java.util.Map;

/* renamed from: X.Ikq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42083Ikq implements InterfaceC021908q {
    public int A00;
    public final /* synthetic */ BakeoffFeedPairSectionController A01;

    @Override // X.InterfaceC021908q
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC021908q
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C42083Ikq(BakeoffFeedPairSectionController bakeoffFeedPairSectionController) {
        this.A01 = bakeoffFeedPairSectionController;
    }

    @Override // X.InterfaceC021908q
    public final void onPageSelected(int i) {
        HDG hdg;
        HDG hdg2;
        int i2 = this.A00;
        if (i2 != i) {
            Map map = ((C38314Gt3) this.A01.pagerAdapter).A01;
            Reference reference = (Reference) AbstractC166997dE.A0m(map, i2);
            if (reference != null) {
                hdg = (HDG) reference.get();
            } else {
                hdg = null;
            }
            Reference reference2 = (Reference) AbstractC166997dE.A0m(map, i);
            if (reference2 != null) {
                hdg2 = (HDG) reference2.get();
            } else {
                hdg2 = null;
            }
            if (hdg != null) {
                C33P c33p = hdg.A00;
                if (c33p != null) {
                    c33p.A0C("fragment_paused");
                }
                C14360o3.A0F("feedVideoModule");
                throw C00O.createAndThrow();
            }
            if (hdg2 != null) {
                C33P c33p2 = hdg2.A00;
                if (c33p2 != null) {
                    c33p2.A0F.A0D.sendEmptyMessage(0);
                }
                C14360o3.A0F("feedVideoModule");
                throw C00O.createAndThrow();
            }
        }
        AdBakeOffFragment adBakeOffFragment = this.A01.A02;
        boolean z = false;
        if (this.A00 != i) {
            z = true;
        }
        AdBakeOffFragment.A04(adBakeOffFragment, i, z, false);
        this.A00 = i;
    }
}
