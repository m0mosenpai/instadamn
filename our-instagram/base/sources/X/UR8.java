package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UR8 extends C0T6 implements XGC {
    public final Float A00;
    public final Float A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    @Override // X.XGC
    public final UR8 ExB() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR8) {
                UR8 ur8 = (UR8) obj;
                if (!C14360o3.A0K(this.A04, ur8.A04) || !C14360o3.A0K(this.A00, ur8.A00) || !C14360o3.A0K(this.A01, ur8.A01) || !C14360o3.A0K(this.A02, ur8.A02) || !C14360o3.A0K(this.A05, ur8.A05) || !C14360o3.A0K(this.A03, ur8.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XGC
    public final String AhM() {
        return this.A04;
    }

    @Override // X.XGC
    public final Float AhO() {
        return this.A00;
    }

    @Override // X.XGC
    public final Float Ars() {
        return this.A01;
    }

    @Override // X.XGC
    public final Integer BDS() {
        return this.A02;
    }

    @Override // X.XGC
    public final Integer CHg() {
        return this.A03;
    }

    @Override // X.XGC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardPhoto", AbstractC68376VOk.A00(this));
    }

    @Override // X.XGC
    public final String getUrl() {
        return this.A05;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return A0O + i;
    }

    public UR8(Float f, Float f2, Integer num, Integer num2, String str, String str2) {
        this.A04 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = num;
        this.A05 = str2;
        this.A03 = num2;
    }
}
