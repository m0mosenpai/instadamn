package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URB extends C0T6 implements XGA {
    public final Float A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    @Override // X.XGA
    public final URB ExD() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URB) {
                URB urb = (URB) obj;
                if (!C14360o3.A0K(this.A01, urb.A01) || !C14360o3.A0K(this.A02, urb.A02) || !C14360o3.A0K(this.A03, urb.A03) || !C14360o3.A0K(this.A04, urb.A04) || !C14360o3.A0K(this.A00, urb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGA
    public final Integer BEp() {
        return this.A01;
    }

    @Override // X.XGA
    public final Integer BEw() {
        return this.A02;
    }

    @Override // X.XGA
    public final Float C6F() {
        return this.A00;
    }

    @Override // X.XGA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardText", AbstractC68382VOq.A00(this));
    }

    @Override // X.XGA
    public final String getText() {
        return this.A03;
    }

    @Override // X.XGA
    public final String getTextColor() {
        return this.A04;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
        Float f = this.A00;
        if (f != null) {
            i = f.hashCode();
        }
        return A0M + i;
    }

    public URB(Float f, Integer num, Integer num2, String str, String str2) {
        this.A01 = num;
        this.A02 = num2;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = f;
    }
}
