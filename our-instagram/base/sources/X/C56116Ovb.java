package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;

/* renamed from: X.Ovb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56116Ovb implements InterfaceC66482zP {
    public SpannableStringBuilder A00;
    public final Drawable A01;
    public final View.OnClickListener A02;
    public final InterfaceC190658cN A03;
    public final EnumC53237Nga A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A08;
        if (str == null) {
            return String.valueOf(this.A00);
        }
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56116Ovb c56116Ovb = (C56116Ovb) obj;
        C14360o3.A0B(c56116Ovb, 0);
        return AbstractC167007dF.A1M(C14360o3.A0K(this.A08, c56116Ovb.A08) ? 1 : 0);
    }

    public C56116Ovb(Drawable drawable, SpannableStringBuilder spannableStringBuilder, View.OnClickListener onClickListener, InterfaceC190658cN interfaceC190658cN, EnumC53237Nga enumC53237Nga, Integer num, Integer num2, String str, String str2) {
        this.A08 = str;
        this.A00 = spannableStringBuilder;
        this.A07 = str2;
        this.A01 = drawable;
        this.A06 = num;
        this.A04 = enumC53237Nga;
        this.A02 = onClickListener;
        this.A03 = interfaceC190658cN;
        this.A05 = num2;
    }
}
