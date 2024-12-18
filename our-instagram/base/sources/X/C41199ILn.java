package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.List;

/* renamed from: X.ILn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41199ILn {
    public final C41219IMi A00 = new Object();
    public final IKU A01;
    public final HJD A02;
    public final InterfaceC11380iw A03;

    public final void A00(List list) {
        ReboundViewPager reboundViewPager;
        EnumC74213Va enumC74213Va;
        HJD hjd = this.A02;
        hjd.A00.addAll(list);
        C0fA.A00(hjd, 2040035095);
        int count = hjd.getCount();
        IKU iku = this.A01;
        if (count > 1) {
            CirclePageIndicator circlePageIndicator = iku.A09;
            circlePageIndicator.setVisibility(0);
            circlePageIndicator.A01(0, hjd.getCount());
            reboundViewPager = iku.A06;
            enumC74213Va = EnumC74213Va.A03;
        } else {
            iku.A09.setVisibility(8);
            reboundViewPager = iku.A06;
            enumC74213Va = EnumC74213Va.A02;
        }
        reboundViewPager.setScrollMode(enumC74213Va);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.IMi, java.lang.Object] */
    public C41199ILn(View view, InterfaceC11380iw interfaceC11380iw) {
        this.A03 = interfaceC11380iw;
        this.A02 = new HJD(interfaceC11380iw);
        this.A01 = new IKU(view);
    }
}
