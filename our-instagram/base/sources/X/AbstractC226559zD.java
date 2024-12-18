package X;

import android.view.View;
import com.facebook.R;

/* renamed from: X.9zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226559zD {
    public static final void A00(View view) {
        C14360o3.A0A(view.getContext());
        float A01 = (AbstractC13890nF.A01(r6) - (((float) Math.ceil(2.8499999046325684d)) * AbstractC167017dG.A04(r6))) / 2.85f;
        int i = (int) A01;
        AbstractC13880nE.A0h(view, i, i);
        float f = -A01;
        view.requireViewById(R.id.label).setTranslationY(0.1333f * f);
        View requireViewById = view.requireViewById(R.id.icon_background);
        float f2 = f * 0.4f;
        requireViewById.setTranslationY(f2);
        float f3 = 0.4f * A01;
        int i2 = (int) f3;
        AbstractC13880nE.A0h(requireViewById, i2, i2);
        View requireViewById2 = view.requireViewById(R.id.icon);
        requireViewById2.setTranslationY(f2 - (f3 * 0.25f));
        int i3 = (int) (A01 * 0.2f);
        AbstractC13880nE.A0h(requireViewById2, i3, i3);
    }
}
