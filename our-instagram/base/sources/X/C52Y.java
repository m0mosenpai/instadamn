package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.52Y, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52Y extends C0T6 implements C52Z {
    public final String A00;
    public final String A01;

    public C52Y(String str, String str2) {
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.C52Z
    public final C52Y Exs() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52Y) {
                C52Y c52y = (C52Y) obj;
                if (!C14360o3.A0K(this.A00, c52y.A00) || !C14360o3.A0K(this.A01, c52y.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode();
    }

    @Override // X.C52Z
    public final String AqO() {
        return this.A00;
    }

    @Override // X.C52Z
    public final String BAz() {
        return this.A01;
    }

    @Override // X.C52Z
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProactiveWarningHarmInfo", AbstractC31408DrD.A00(this));
    }
}
