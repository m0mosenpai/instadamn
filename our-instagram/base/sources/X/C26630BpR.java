package X;

import android.widget.SeekBar;

/* renamed from: X.BpR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26630BpR extends AbstractC77583di {
    public static final C51532Yb A04 = AbstractC25230BEn.A0i(C28992Cqh.A00, 4);
    public final SeekBar.OnSeekBarChangeListener A00;
    public final C79743hP A01;
    public final C79553h6 A02;
    public final C51722Yv A03;

    public C26630BpR(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C51722Yv c51722Yv, C79743hP c79743hP, C79553h6 c79553h6) {
        AbstractC25233BEq.A0w(1, c79743hP, onSeekBarChangeListener, c51722Yv);
        this.A01 = c79743hP;
        this.A02 = c79553h6;
        this.A00 = onSeekBarChangeListener;
        this.A03 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A03, C29053Crg.A00, AbstractC25229BEm.A0c(c77993eR, A04, C29787DCf.A00, new C43362JEd(this, 49)));
    }
}
