package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;

/* renamed from: X.ItB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42592ItB implements InterfaceC77033cp {
    public InterfaceC690438q A00;
    public final InterfaceC38381qS A01;
    public final InterfaceC75143Ze A02;

    public final void A00(InterfaceC690438q interfaceC690438q, C3FQ c3fq) {
        this.A00 = interfaceC690438q;
        interfaceC690438q.DaJ();
        C41583IaW c41583IaW = new C41583IaW(this, c3fq);
        ArrayList A1E = AbstractC166987dD.A1E();
        C3FQ c3fq2 = c41583IaW.A02;
        int B6q = c3fq2.B6q();
        int i = 0;
        if (c3fq2.AZU() != null) {
            int i2 = 0;
            while (i < c3fq2.AnZ()) {
                int i3 = B6q + i;
                View AnU = c3fq2.AnU(i);
                if (i3 >= c3fq2.AZU().getCount()) {
                    C0w9.A03("ListViewItemTransformAnimationHelper", StringFormatUtil.formatStrLocaleSafe("IndexOutOfBounds in %s. Index %d, count is %d.", AbstractC31173DnH.A0q(c3fq2.AZU()), Integer.valueOf(i3), Integer.valueOf(c3fq2.AnZ())));
                } else {
                    Object item = c3fq2.AZU().getItem(i3);
                    c41583IaW.A03.put(AnonymousClass001.A0O(C41583IaW.A00(c41583IaW, i3), AnU.hashCode()), Integer.valueOf(AnU.getTop()));
                    if (item != null && c41583IaW.A01.CX9(item, AnU.getTag())) {
                        A1E.add(AnU);
                        i2 += AnU.getHeight();
                    }
                }
                i++;
            }
            i = i2;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(100L);
        duration.addListener(new C39409Hat(c41583IaW, A1E, i));
        duration.addUpdateListener(new C44249Jgt(7, c41583IaW, A1E));
        duration.start();
    }

    @Override // X.InterfaceC77033cp
    public final void AGt() {
        InterfaceC690438q interfaceC690438q = this.A00;
        interfaceC690438q.getClass();
        interfaceC690438q.Dti();
    }

    @Override // X.InterfaceC77033cp
    public final boolean CX4(Object obj, Object obj2) {
        if (this.A01 == obj && this.A02.Ceb()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC77033cp
    public final boolean CX9(Object obj, Object obj2) {
        return AbstractC167007dF.A1X(this.A01, obj);
    }

    @Override // X.InterfaceC77033cp
    public final void CwX() {
        InterfaceC690438q interfaceC690438q = this.A00;
        interfaceC690438q.getClass();
        interfaceC690438q.DGa(this.A01);
    }

    public C42592ItB(InterfaceC38381qS interfaceC38381qS, InterfaceC75143Ze interfaceC75143Ze) {
        this.A01 = interfaceC38381qS;
        this.A02 = interfaceC75143Ze;
    }
}
