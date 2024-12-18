package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class URM extends C0T6 implements InterfaceC43574JMi {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    @Override // X.InterfaceC43574JMi
    public final URM F1U() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URM) {
                URM urm = (URM) obj;
                if (!C14360o3.A0K(this.A02, urm.A02) || !C14360o3.A0K(this.A04, urm.A04) || !C14360o3.A0K(this.A05, urm.A05) || !C14360o3.A0K(this.A00, urm.A00) || !C14360o3.A0K(this.A06, urm.A06) || !C14360o3.A0K(this.A0B, urm.A0B) || !C14360o3.A0K(this.A07, urm.A07) || !C14360o3.A0K(this.A08, urm.A08) || !C14360o3.A0K(this.A09, urm.A09) || !C14360o3.A0K(this.A0C, urm.A0C) || !C14360o3.A0K(this.A0A, urm.A0A) || !C14360o3.A0K(this.A03, urm.A03) || !C14360o3.A0K(this.A01, urm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43574JMi
    public final Integer Arx() {
        return this.A02;
    }

    @Override // X.InterfaceC43574JMi
    public final String AwK() {
        return this.A04;
    }

    @Override // X.InterfaceC43574JMi
    public final Boolean B6X() {
        return this.A00;
    }

    @Override // X.InterfaceC43574JMi
    public final List BZN() {
        return this.A0B;
    }

    @Override // X.InterfaceC43574JMi
    public final String Bjo() {
        return this.A08;
    }

    @Override // X.InterfaceC43574JMi
    public final List C5D() {
        return this.A0C;
    }

    @Override // X.InterfaceC43574JMi
    public final Integer CFy() {
        return this.A03;
    }

    @Override // X.InterfaceC43574JMi
    public final Boolean CG0() {
        return this.A01;
    }

    @Override // X.InterfaceC43574JMi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryQuizDict", AbstractC40312HuH.A00(this));
    }

    @Override // X.InterfaceC43574JMi
    public final String getEndBackgroundColor() {
        return this.A05;
    }

    @Override // X.InterfaceC43574JMi
    public final String getId() {
        return this.A06;
    }

    @Override // X.InterfaceC43574JMi
    public final String getQuestion() {
        return this.A07;
    }

    @Override // X.InterfaceC43574JMi
    public final String getStartBackgroundColor() {
        return this.A09;
    }

    @Override // X.InterfaceC43574JMi
    public final String getTextColor() {
        return this.A0A;
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((((((((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31;
        Boolean bool = this.A01;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0M + i;
    }

    public URM(Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2) {
        this.A02 = num;
        this.A04 = str;
        this.A05 = str2;
        this.A00 = bool;
        this.A06 = str3;
        this.A0B = list;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A0C = list2;
        this.A0A = str7;
        this.A03 = num2;
        this.A01 = bool2;
    }
}
