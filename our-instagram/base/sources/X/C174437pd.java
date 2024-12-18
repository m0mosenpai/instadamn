package X;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174437pd extends C3Vd {
    public C89B A00;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final List A07;
    public Interpolator A01 = new LinearInterpolator();
    public final int A06 = 2;

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final void E4r(View view, ReboundViewPager reboundViewPager, float f, int i) {
        C14360o3.A0B(reboundViewPager, 0);
        C14360o3.A0B(view, 1);
        float abs = Math.abs(f);
        int i2 = (int) abs;
        float f2 = i2;
        int i3 = i2 + 1;
        if (f2 == abs) {
            i3 = i2;
        }
        List list = this.A07;
        if (i3 >= list.size()) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
            view.setVisibility(8);
            return;
        }
        C174427pc c174427pc = (C174427pc) list.get(i2);
        C174427pc c174427pc2 = (C174427pc) list.get(i3);
        float interpolation = this.A01.getInterpolation(abs - f2);
        float f3 = c174427pc.A01;
        float f4 = c174427pc2.A01;
        float A04 = (float) AbstractC70163Da.A04(interpolation, 0.0d, 1.0d, Math.min(f3, f4), Math.max(f3, f4));
        float f5 = 1.0f;
        if (f < 0.0f) {
            f5 = -1.0f;
        }
        float f6 = A04 * f5;
        double d = 1.0f - interpolation;
        float f7 = c174427pc.A02;
        float f8 = c174427pc2.A02;
        float A042 = (float) AbstractC70163Da.A04(d, 0.0d, 1.0d, Math.min(f7, f8), Math.max(f7, f8));
        float f9 = c174427pc.A00;
        float f10 = c174427pc2.A00;
        float A043 = (float) AbstractC70163Da.A04(d, 0.0d, 1.0d, Math.min(f9, f10), Math.max(f9, f10));
        float f11 = this.A05;
        float f12 = 1.0f;
        if (reboundViewPager.A0S()) {
            f12 = -1.0f;
        }
        float f13 = f6 + (f11 * f12);
        float f14 = this.A02 / 2.0f;
        float f15 = 1.0f;
        if (reboundViewPager.A0S()) {
            f15 = -1.0f;
        }
        view.setTranslationX(f13 - (f15 * f14));
        view.setTranslationY((this.A04 + this.A03) - f14);
        view.setAlpha(A043);
        view.setScaleX(A042);
        view.setScaleY(A042);
        int i4 = 0;
        if (A042 == 0.0f) {
            i4 = 8;
        }
        view.setVisibility(i4);
        C89B c89b = this.A00;
        if (c89b == null) {
            return;
        }
        c89b.DNk(view, f, i);
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final boolean F83(ReboundViewPager reboundViewPager, float f, float f2) {
        return true;
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final int AVv(ReboundViewPager reboundViewPager, float f) {
        int i = reboundViewPager.A07;
        int i2 = 1;
        float f2 = i;
        if (!reboundViewPager.A0S() ? f >= f2 : f <= f2) {
            i2 = 0;
        }
        return (i - 2) - i2;
    }

    @Override // X.C3Vd, X.InterfaceC74243Ve
    public final int Cgd(ReboundViewPager reboundViewPager, float f) {
        int i = reboundViewPager.A07;
        int i2 = 1;
        float f2 = i;
        if (!reboundViewPager.A0S() ? f <= f2 : f >= f2) {
            i2 = 0;
        }
        return i + 2 + i2;
    }

    public C174437pd(C174427pc[] c174427pcArr, float f, float f2, float f3, float f4) {
        this.A02 = f;
        this.A04 = f4;
        this.A05 = f2 / 2.0f;
        this.A03 = (f3 - f4) / 2.0f;
        ArrayList arrayList = new ArrayList();
        this.A07 = arrayList;
        arrayList.add(new C174427pc(0.0f, 1.0f, 1.0f));
        arrayList.addAll(AbstractC16960so.A1Q(Arrays.copyOf(c174427pcArr, 2)));
        arrayList.add(new C174427pc(c174427pcArr[1].A01, 0.0f, 0.0f));
    }
}
