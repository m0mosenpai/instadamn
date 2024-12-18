package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import java.util.List;

/* renamed from: X.7Ak, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158747Ak extends AbstractC158757Al {
    public final int A00;
    public final Drawable A01;
    public final SpannableString A02;
    public final InterfaceC42241xE A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C158747Ak(Drawable drawable, SpannableString spannableString, InterfaceC42241xE interfaceC42241xE, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        super(drawable, spannableString, interfaceC42241xE, list);
        C14360o3.A0B(spannableString, 2);
        this.A04 = str;
        this.A02 = spannableString;
        this.A05 = list;
        this.A06 = z;
        this.A08 = z2;
        this.A01 = drawable;
        this.A00 = i;
        this.A07 = z3;
        this.A03 = interfaceC42241xE;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C158747Ak) {
                C158747Ak c158747Ak = (C158747Ak) obj;
                if (!C14360o3.A0K(this.A04, c158747Ak.A04) || !C14360o3.A0K(this.A02, c158747Ak.A02) || !C14360o3.A0K(this.A05, c158747Ak.A05) || this.A06 != c158747Ak.A06 || this.A08 != c158747Ak.A08 || !C14360o3.A0K(this.A01, c158747Ak.A01) || this.A00 != c158747Ak.A00 || this.A07 != c158747Ak.A07 || !C14360o3.A0K(this.A03, c158747Ak.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Drawable drawable = this.A01;
        int i5 = 0;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        int i6 = (((i4 + hashCode) * 31) + this.A00) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        InterfaceC42241xE interfaceC42241xE = this.A03;
        if (interfaceC42241xE != null) {
            i5 = interfaceC42241xE.hashCode();
        }
        return i8 + i5;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C158747Ak c158747Ak = (C158747Ak) obj;
        String str2 = this.A04;
        if (c158747Ak != null) {
            str = c158747Ak.A04;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A02.toString(), c158747Ak.A02.toString()) && C14360o3.A0K(this.A05, c158747Ak.A05) && this.A06 == c158747Ak.A06 && this.A08 == c158747Ak.A08 && C14360o3.A0K(this.A01, c158747Ak.A01) && this.A00 == c158747Ak.A00 && this.A07 == c158747Ak.A07) {
            return true;
        }
        return false;
    }
}
