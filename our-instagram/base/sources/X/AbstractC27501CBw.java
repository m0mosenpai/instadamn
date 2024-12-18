package X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.CBw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27501CBw {
    public static final ValueAnimator A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE interfaceC103384lE = ((C1344465q) c6fw.A03(0)).A00;
        InterfaceC103384lE interfaceC103384lE2 = ((C1344465q) c6fw.A03(1)).A00;
        Object A03 = c6fw.A03(2);
        String A00 = AbstractC111324zv.A00(38);
        C14360o3.A0C(A03, A00);
        float A09 = AbstractC166987dD.A09(A03);
        Object A032 = c6fw.A03(3);
        C14360o3.A0C(A032, A00);
        float A092 = AbstractC166987dD.A09(A032);
        Object A033 = c6fw.A03(4);
        C14360o3.A0C(A033, A00);
        float A093 = AbstractC166987dD.A09(A033);
        ValueAnimator valueAnimator = new ValueAnimator();
        C6FW A0f = AbstractC25227BEk.A0f(AbstractC25225BEi.A0s(), valueAnimator, 0);
        valueAnimator.addUpdateListener(new C28524CiI(0, c6fq, interfaceC103384lE, A0f));
        valueAnimator.addListener(new C28514Ci8(0, c6fq, A0f, interfaceC103384lE2));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setFloatValues(A09, A092);
        valueAnimator.setDuration(A093 * 1000.0f);
        return valueAnimator;
    }
}
