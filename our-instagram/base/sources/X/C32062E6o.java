package X;

import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* renamed from: X.E6o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32062E6o extends C0T6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C32062E6o(ImageUrl imageUrl, Reel reel, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = reel;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C32062E6o) {
                    C32062E6o c32062E6o = (C32062E6o) obj;
                    if (c32062E6o.A00 == 1 && C14360o3.A0K(this.A03, c32062E6o.A03) && C14360o3.A0K(this.A02, c32062E6o.A02) && this.A05 == c32062E6o.A05 && this.A04 == c32062E6o.A04) {
                        obj2 = this.A01;
                        obj3 = c32062E6o.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C32062E6o)) {
                return false;
            }
            C32062E6o c32062E6o2 = (C32062E6o) obj;
            if (c32062E6o2.A00 != 0 || !C14360o3.A0K(this.A03, c32062E6o2.A03) || !C14360o3.A0K(this.A01, c32062E6o2.A01) || this.A05 != c32062E6o2.A05 || this.A04 != c32062E6o2.A04) {
                return false;
            }
            obj2 = this.A02;
            obj3 = c32062E6o2.A02;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D;
        Object obj;
        int i = this.A00;
        int A0J = AbstractC166987dD.A0J(this.A03);
        if (i != 0) {
            A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A02, A0J)));
            obj = this.A01;
        } else {
            A0D = AbstractC167007dF.A0D(this.A04, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A01, A0J)));
            obj = this.A02;
        }
        return AbstractC166987dD.A0I(obj, A0D);
    }

    public C32062E6o(View.OnClickListener onClickListener, ImageUrl imageUrl, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A02 = imageUrl;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = onClickListener;
    }
}
