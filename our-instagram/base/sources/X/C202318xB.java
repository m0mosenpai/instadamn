package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;

/* renamed from: X.8xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202318xB extends C6RB implements InterfaceC133125ze, InterfaceC133135zf {
    public String A00;

    @Override // X.InterfaceC133135zf
    public final void AGx(EnumC222529rt enumC222529rt, int i) {
        C14360o3.A0B(enumC222529rt, 0);
        Spannable spannable = this.A0F;
        C14360o3.A07(spannable);
        Resources resources = this.A0Z.getResources();
        C14360o3.A07(resources);
        AMr.A09(resources, spannable, Math.round(super.A00), enumC222529rt.A00(i), enumC222529rt.A01(i));
        A0R();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.8xB, X.6RB, android.graphics.drawable.Drawable] */
    @Override // X.InterfaceC133135zf
    public final Drawable AKx(String str) {
        C14360o3.A0B(str, 0);
        Context context = this.A0Z;
        C14360o3.A07(context);
        ?? c6rb = new C6RB(context, this.A07);
        TextPaint textPaint = this.A0b;
        c6rb.A0I(textPaint.getTypeface());
        float textSize = textPaint.getTextSize();
        float f = super.A00;
        float f2 = this.A01;
        c6rb.A09();
        c6rb.A0A(textSize);
        c6rb.A0C(f, f2);
        c6rb.A0L(new SpannableString(this.A0F.toString()));
        c6rb.A00 = str;
        return c6rb;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        String str = this.A00;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
