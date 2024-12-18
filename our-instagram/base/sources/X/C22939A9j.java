package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.ui.widget.drawing.EffectSlider;

/* renamed from: X.A9j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22939A9j {
    public float A00;
    public EffectSlider A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC58315Pt7 A04 = new JTC(0.0f, 1.0f);
    public final C05A A05;

    public C22939A9j(ViewStub viewStub, C19L c19l) {
        C008002u A00 = C10E.A00(Boolean.valueOf(this.A02));
        this.A05 = A00;
        View inflate = viewStub.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.drawing.EffectSlider");
        EffectSlider effectSlider = (EffectSlider) inflate;
        this.A01 = effectSlider;
        effectSlider.setProgress(this.A00);
        AbstractC18560vj.A03(c19l, new C15340po(new PYw(this, null, 9), AbstractC208910l.A02(A00)));
    }
}
