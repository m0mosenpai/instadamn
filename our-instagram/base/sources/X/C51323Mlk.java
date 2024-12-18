package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Mlk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51323Mlk extends C3OO {
    public O7A A00;
    public final View A01;
    public final C44376JjF A02;
    public final O4F A03;

    public C51323Mlk(View view, O4F o4f) {
        super(view);
        Context context = view.getContext();
        this.A03 = o4f;
        this.A01 = view;
        C44376JjF c44376JjF = new C44376JjF(context, 0.0f, 0.0f, AbstractC13880nE.A00(context, 16.0f), 0.2f, 0.6f, context.getColor(R.color.badge_color), 0, context.getColor(R.color.design_dark_default_color_on_background), 300L, true, true, true, false);
        this.A02 = c44376JjF;
        view.setBackgroundDrawable(c44376JjF);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A0B = true;
        A0s.A08 = false;
        A0s.A07 = false;
        A0s.A02 = 0.95f;
        C52374NFq.A00(A0s, this, 26);
    }
}
