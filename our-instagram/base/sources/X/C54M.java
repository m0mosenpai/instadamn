package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.54M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C54M extends C0T6 implements C54N {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public C54M(String str, String str2, String str3, String str4, String str5, List list) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C14360o3.A0B(str5, 6);
        this.A05 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // X.C54N
    public final C54N E97(C1DY c1dy) {
        return this;
    }

    @Override // X.C54N
    public final C54M Etr(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C54M) {
                C54M c54m = (C54M) obj;
                if (!C14360o3.A0K(this.A05, c54m.A05) || !C14360o3.A0K(this.A00, c54m.A00) || !C14360o3.A0K(this.A01, c54m.A01) || !C14360o3.A0K(this.A02, c54m.A02) || !C14360o3.A0K(this.A03, c54m.A03) || !C14360o3.A0K(this.A04, c54m.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A05;
        return ((((((((((list == null ? 0 : list.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }

    @Override // X.C54N
    public final List B49() {
        return this.A05;
    }

    @Override // X.C54N
    public final String BgJ() {
        return this.A01;
    }

    @Override // X.C54N
    public final String CBn() {
        return this.A04;
    }

    @Override // X.C54N
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGenericSuggestionCard", AbstractC39941HnW.A00(this));
    }

    @Override // X.C54N
    public final String getId() {
        return this.A00;
    }

    @Override // X.C54N
    public final String getSubtitle() {
        return this.A02;
    }

    @Override // X.C54N
    public final String getTitle() {
        return this.A03;
    }
}
