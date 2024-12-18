package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.ItI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42599ItI implements C3A8 {
    public final Fragment A00;
    public final ReelViewerFragment A01;

    @Override // X.C3A8
    public final void FDq(C3AB c3ab, C3A9 c3a9) {
        InterfaceC147266kB interfaceC147266kB;
        if (this.A00.isResumed() && (interfaceC147266kB = this.A01.mViewPager) != null) {
            C147256kA c147256kA = (C147256kA) interfaceC147266kB;
            if (c147256kA.A05.getCount() != 0 && c147256kA.A04.getAdapter() != null) {
                ReboundViewPager reboundViewPager = ((C147256kA) interfaceC147266kB).A04;
                int i = reboundViewPager.A08;
                int i2 = reboundViewPager.A09;
                int i3 = reboundViewPager.A0A;
                if (i - i2 < 0) {
                    i3 = i2;
                } else if (i3 - i < 0) {
                    i2 = i3;
                }
                while (i2 <= i3) {
                    c3a9.A02(c3ab, i2);
                    i2++;
                }
            }
        }
    }

    public C42599ItI(Fragment fragment, ReelViewerFragment reelViewerFragment) {
        this.A00 = fragment;
        this.A01 = reelViewerFragment;
    }
}
