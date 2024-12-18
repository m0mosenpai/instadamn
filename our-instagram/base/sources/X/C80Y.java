package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.80Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C80Y implements InterfaceC66482zP {
    public final Typeface A00;
    public final Drawable A01;
    public final Float A02;
    public final Float A03;
    public final Float A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public C80Y(Typeface typeface, Drawable drawable, Float f, Float f2, Float f3, String str, String str2, boolean z) {
        C14360o3.A0B(str, 1);
        this.A06 = str;
        this.A05 = str2;
        this.A01 = drawable;
        this.A00 = typeface;
        this.A03 = f;
        this.A02 = f2;
        this.A04 = f3;
        this.A07 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A06;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C80Y c80y = (C80Y) obj;
        C14360o3.A0B(c80y, 0);
        return C14360o3.A0K(this.A06, c80y.A06);
    }
}
