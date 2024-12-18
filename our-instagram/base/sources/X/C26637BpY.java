package X;

import android.text.method.MovementMethod;

/* renamed from: X.BpY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26637BpY extends AbstractC77583di {
    public static final C51532Yb A07 = AbstractC25232BEp.A1A(C29003Cqs.A00);
    public final MovementMethod A00;
    public final C51722Yv A01;
    public final C2Z3 A02;
    public final C2Z3 A03;
    public final Boolean A04;
    public final CharSequence A05;
    public final Integer A06;

    public C26637BpY(MovementMethod movementMethod, C51722Yv c51722Yv, C2Z3 c2z3, C2Z3 c2z32, Boolean bool, CharSequence charSequence, Integer num) {
        C14360o3.A0B(charSequence, 1);
        this.A05 = charSequence;
        this.A03 = c2z3;
        this.A06 = num;
        this.A00 = movementMethod;
        this.A04 = bool;
        this.A02 = c2z32;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        Float f;
        Integer num;
        C14360o3.A0B(c77993eR, 0);
        if (this.A03 != null) {
            f = Float.valueOf(AbstractC25228BEl.A0A(c77993eR, r0.A00));
        } else {
            f = null;
        }
        C2Z3 c2z3 = this.A02;
        if (c2z3 != null) {
            num = Integer.valueOf(AbstractC25228BEl.A0A(c77993eR, c2z3.A00));
        } else {
            num = null;
        }
        C51532Yb c51532Yb = A07;
        CharSequence charSequence = this.A05;
        Boolean bool = this.A04;
        return new C78053eX(this.A01, new C2YM(new C103934mE(c51532Yb, bool, charSequence, f, num, null), AbstractC25229BEm.A0c(c77993eR, c51532Yb, C103944mF.A00, new C25241BEz(3, null, f, bool, charSequence, this.A06, this.A00, num))));
    }
}
