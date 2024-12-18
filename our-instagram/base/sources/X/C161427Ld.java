package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.facebook.R;

/* renamed from: X.7Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161427Ld implements InterfaceC66482zP, C7VC {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C162297Or A05;
    public final CharSequence A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // X.C7VC
    public final int getType() {
        return 35;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C161427Ld A00(Context context, C162297Or c162297Or, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        String str;
        String string;
        String str2;
        int i3;
        if (z3) {
            String string2 = context.getString(2131965052);
            Resources resources = context.getResources();
            int i4 = 2131964606;
            if (z4) {
                i4 = 2131973918;
            }
            String string3 = resources.getString(i4, string2);
            SpannableString spannableString = new SpannableString(string3);
            int indexOf = string3.indexOf(string2);
            int length = indexOf + string2.length();
            spannableString.setSpan(new StyleSpan(1), indexOf, length, 17);
            spannableString.setSpan(new ForegroundColorSpan(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text))), indexOf, length, 17);
            str = spannableString;
        } else {
            Resources resources2 = context.getResources();
            if (z5) {
                i2 = 2131973915;
            } else {
                i2 = 2131964605;
                if (z4) {
                    i2 = 2131973917;
                }
            }
            str = resources2.getString(i2);
        }
        Resources resources3 = context.getResources();
        if (z) {
            string = resources3.getString(2131964607);
            str2 = str;
        } else {
            string = resources3.getString(2131964603);
            str2 = null;
        }
        context.getString(2131973920);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
        if (z) {
            i3 = context.getColor(AbstractC53242c7.A07(context));
        } else {
            i3 = -1;
        }
        return new C161427Ld(c162297Or, str2, string, dimensionPixelSize, i3, context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text)), i, j, z3, z, z2, z5);
    }

    @Override // X.InterfaceC66492zQ
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final boolean isContentSame(C161427Ld c161427Ld) {
        if (this.A04 == c161427Ld.A04 && this.A01 == c161427Ld.A01 && AbstractC50102Ry.A00(this.A07, c161427Ld.A07) && AbstractC50102Ry.A00(this.A06, c161427Ld.A06) && this.A02 == c161427Ld.A02 && this.A03 == c161427Ld.A03 && this.A00 == c161427Ld.A00 && this.A0A == c161427Ld.A0A && this.A0B == c161427Ld.A0B) {
            return true;
        }
        return false;
    }

    @Override // X.C7VC
    public final long C8f() {
        return this.A04;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05.toString();
    }

    public C161427Ld(C162297Or c162297Or, CharSequence charSequence, String str, int i, int i2, int i3, int i4, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A07 = str;
        this.A06 = charSequence;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A04 = j;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A05 = c162297Or;
        this.A0B = z4;
    }
}
