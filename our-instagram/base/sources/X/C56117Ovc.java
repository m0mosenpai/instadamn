package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;

/* renamed from: X.Ovc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56117Ovc implements InterfaceC66482zP {
    public SpannableStringBuilder A00;
    public final Typeface A01;
    public final Drawable A02;
    public final Drawable A03;
    public final View.OnClickListener A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String str = this.A06;
        if (str == null) {
            return String.valueOf(this.A00);
        }
        return str;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56117Ovc c56117Ovc = (C56117Ovc) obj;
        C14360o3.A0B(c56117Ovc, 0);
        return AbstractC167007dF.A1M(C14360o3.A0K(this.A06, c56117Ovc.A06) ? 1 : 0);
    }

    public C56117Ovc(Typeface typeface, Drawable drawable, Drawable drawable2, SpannableStringBuilder spannableStringBuilder, View.OnClickListener onClickListener, String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A06 = str;
        this.A00 = spannableStringBuilder;
        this.A01 = typeface;
        this.A05 = str2;
        this.A03 = drawable;
        this.A02 = drawable2;
        this.A04 = onClickListener;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
    }
}
