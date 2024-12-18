package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H6W extends C0T6 implements InterfaceC43567JMb {
    public final H6V A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final List A09;

    @Override // X.InterfaceC43567JMb
    public final H6W F2l() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6W) {
                H6W h6w = (H6W) obj;
                if (!C14360o3.A0K(this.A01, h6w.A01) || !C14360o3.A0K(this.A02, h6w.A02) || !C14360o3.A0K(this.A00, h6w.A00) || !C14360o3.A0K(this.A03, h6w.A03) || !C14360o3.A0K(this.A07, h6w.A07) || !C14360o3.A0K(this.A04, h6w.A04) || !C14360o3.A0K(this.A08, h6w.A08) || !C14360o3.A0K(this.A09, h6w.A09) || !C14360o3.A0K(this.A05, h6w.A05) || !C14360o3.A0K(this.A06, h6w.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean B1Y() {
        return this.A01;
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean B1b() {
        return this.A02;
    }

    @Override // X.InterfaceC43567JMb
    public final /* bridge */ /* synthetic */ JMZ B3u() {
        return this.A00;
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean BCl() {
        return this.A03;
    }

    @Override // X.InterfaceC43567JMb
    public final Boolean BOW() {
        return this.A04;
    }

    @Override // X.InterfaceC43567JMb
    public final String BUl() {
        return this.A08;
    }

    @Override // X.InterfaceC43567JMb
    public final List Bjh() {
        return this.A09;
    }

    @Override // X.InterfaceC43567JMb
    public final Integer CCk() {
        return this.A05;
    }

    @Override // X.InterfaceC43567JMb
    public final Integer CEt() {
        return this.A06;
    }

    @Override // X.InterfaceC43567JMb
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyQuestionModuleDict", HvM.A00(this));
    }

    @Override // X.InterfaceC43567JMb
    public final String getId() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public H6W(H6V h6v, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, String str, String str2, List list) {
        this.A01 = bool;
        this.A02 = bool2;
        this.A00 = h6v;
        this.A03 = bool3;
        this.A07 = str;
        this.A04 = bool4;
        this.A08 = str2;
        this.A09 = list;
        this.A05 = num;
        this.A06 = num2;
    }
}
