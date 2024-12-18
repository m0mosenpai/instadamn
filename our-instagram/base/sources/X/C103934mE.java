package X;

import com.instagram.feed.ui.text.BulletAwareTextView;

/* renamed from: X.4mE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103934mE implements C2YT {
    public final C51532Yb A00;
    public final Boolean A01;
    public final CharSequence A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;

    public C103934mE(C51532Yb c51532Yb, Boolean bool, CharSequence charSequence, Float f, Integer num, Integer num2) {
        C14360o3.A0B(c51532Yb, 1);
        C14360o3.A0B(charSequence, 2);
        this.A00 = c51532Yb;
        this.A02 = charSequence;
        this.A03 = f;
        this.A01 = bool;
        this.A05 = num;
        this.A04 = num2;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        C14360o3.A0B(obj, 1);
        return AbstractC78713fd.A03(this, obj);
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        BulletAwareTextView bulletAwareTextView = (BulletAwareTextView) this.A00.ALq(c2yr.A00.A04);
        Float f = this.A03;
        int i = 0;
        if (f != null) {
            bulletAwareTextView.setTextSize(0, f.floatValue());
        }
        Boolean bool = this.A01;
        if (bool != null) {
            bulletAwareTextView.setIncludeFontPadding(bool.booleanValue());
        }
        Integer num = this.A05;
        if (num != null) {
            bulletAwareTextView.setSpacingAdd(num.intValue());
        }
        bulletAwareTextView.setText(this.A02);
        bulletAwareTextView.measure(AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
        int measuredWidth = bulletAwareTextView.getMeasuredWidth();
        Integer num2 = this.A04;
        if (num2 != null) {
            i = num2.intValue();
        }
        bulletAwareTextView.setMinWidth(measuredWidth + i);
        bulletAwareTextView.measure(AbstractC78603fS.A01(j), AbstractC78603fS.A00(j));
        return new C2YU(AbstractC78673fZ.A00(Math.max(C78613fT.A03(j), bulletAwareTextView.getMeasuredWidth()), Math.max(C78613fT.A02(j), bulletAwareTextView.getMeasuredHeight())), null);
    }
}
