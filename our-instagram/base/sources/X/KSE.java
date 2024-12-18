package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import java.util.List;

/* loaded from: classes8.dex */
public final class KSE extends AbstractC158757Al {
    public final int A00;
    public final Drawable A01;
    public final SpannableString A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSE(Drawable drawable, SpannableString spannableString, String str, List list, int i, boolean z, boolean z2, boolean z3) {
        super(drawable, spannableString, null, list);
        AbstractC167017dG.A1R(spannableString, list);
        this.A03 = str;
        this.A02 = spannableString;
        this.A04 = list;
        this.A05 = z;
        this.A07 = z2;
        this.A01 = drawable;
        this.A00 = i;
        this.A06 = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KSE) {
                KSE kse = (KSE) obj;
                if (!C14360o3.A0K(this.A03, kse.A03) || !C14360o3.A0K(this.A02, kse.A02) || !C14360o3.A0K(this.A04, kse.A04) || this.A05 != kse.A05 || this.A07 != kse.A07 || !C14360o3.A0K(this.A01, kse.A01) || this.A00 != kse.A00 || this.A06 != kse.A06) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC158757Al
    public final int A00() {
        return this.A00;
    }

    @Override // X.AbstractC158757Al
    public final Drawable A01() {
        return this.A01;
    }

    @Override // X.AbstractC158757Al
    public final SpannableString A02() {
        return this.A02;
    }

    @Override // X.AbstractC158757Al
    public final InterfaceC42241xE A03() {
        return null;
    }

    @Override // X.AbstractC158757Al
    public final String A04() {
        return this.A03;
    }

    @Override // X.AbstractC158757Al
    public final List A05() {
        return this.A04;
    }

    @Override // X.AbstractC158757Al
    public final boolean A06() {
        return this.A05;
    }

    @Override // X.AbstractC158757Al
    public final boolean A07() {
        return this.A06;
    }

    @Override // X.AbstractC158757Al
    public final boolean A08() {
        return this.A07;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, (((AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03))))) + AbstractC167017dG.A0M(this.A01)) * 31) + this.A00) * 31);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        KSE kse = (KSE) obj;
        String str2 = this.A03;
        if (kse != null) {
            str = kse.A03;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str)) {
            if (AbstractC31174DnI.A1a(kse.A02, this.A02.toString()) && C14360o3.A0K(this.A04, kse.A04) && this.A05 == kse.A05 && this.A07 == kse.A07 && C14360o3.A0K(this.A01, kse.A01) && this.A00 == kse.A00 && this.A06 == kse.A06) {
                return true;
            }
        }
        return false;
    }
}
