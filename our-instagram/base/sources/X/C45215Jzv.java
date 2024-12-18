package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.Jzv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45215Jzv extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final Drawable A01;
    public final View.OnLongClickListener A02;
    public final C7R2 A03;
    public final C83403nh A04;
    public final boolean A05;
    public final int A06;

    public C45215Jzv(Drawable drawable, View.OnLongClickListener onLongClickListener, C7R2 c7r2, C83403nh c83403nh, int i, int i2, boolean z) {
        AbstractC25233BEq.A0x(1, c83403nh, drawable, c7r2);
        this.A04 = c83403nh;
        this.A00 = i;
        this.A06 = i2;
        this.A01 = drawable;
        this.A03 = c7r2;
        this.A05 = z;
        this.A02 = onLongClickListener;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45215Jzv) {
                C45215Jzv c45215Jzv = (C45215Jzv) obj;
                if (!C14360o3.A0K(this.A04, c45215Jzv.A04) || this.A00 != c45215Jzv.A00 || this.A06 != c45215Jzv.A06 || !C14360o3.A0K(this.A01, c45215Jzv.A01) || this.A03 != c45215Jzv.A03 || this.A05 != c45215Jzv.A05 || !C14360o3.A0K(this.A02, c45215Jzv.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A04.A0i();
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, (((AbstractC166987dD.A0G(this.A04) + this.A00) * 31) + this.A06) * 31))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C83403nh c83403nh;
        C45215Jzv c45215Jzv = (C45215Jzv) obj;
        String A0i = this.A04.A0i();
        if (c45215Jzv != null && (c83403nh = c45215Jzv.A04) != null) {
            str = c83403nh.A0i();
        } else {
            str = null;
        }
        if (C14360o3.A0K(A0i, str) && this.A03 == c45215Jzv.A03) {
            return true;
        }
        return false;
    }
}
