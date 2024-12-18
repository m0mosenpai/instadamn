package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H4O extends C0T6 implements InterfaceC43576JMk {
    public final C38237Grg A00;
    public final C38011pl A01;
    public final long A02;
    public final C38321qM A03;
    public final Boolean A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;

    public H4O(C38237Grg c38237Grg, C38321qM c38321qM, C38011pl c38011pl, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j, boolean z) {
        C14360o3.A0B(c38011pl, 6);
        AbstractC25229BEm.A1O(str5, 12, str7);
        C14360o3.A0B(str9, 17);
        this.A03 = c38321qM;
        this.A05 = l;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = c38011pl;
        this.A0F = list;
        this.A04 = bool;
        this.A0G = z;
        this.A09 = str4;
        this.A02 = j;
        this.A0A = str5;
        this.A0B = str6;
        this.A00 = c38237Grg;
        this.A0C = str7;
        this.A0D = str8;
        this.A0E = str9;
    }

    @Override // X.InterfaceC43576JMk
    public final H4O ExF(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4O) {
                H4O h4o = (H4O) obj;
                if (!C14360o3.A0K(this.A03, h4o.A03) || !C14360o3.A0K(this.A05, h4o.A05) || !C14360o3.A0K(this.A06, h4o.A06) || !C14360o3.A0K(this.A07, h4o.A07) || !C14360o3.A0K(this.A08, h4o.A08) || !C14360o3.A0K(this.A01, h4o.A01) || !C14360o3.A0K(this.A0F, h4o.A0F) || !C14360o3.A0K(this.A04, h4o.A04) || this.A0G != h4o.A0G || !C14360o3.A0K(this.A09, h4o.A09) || this.A02 != h4o.A02 || !C14360o3.A0K(this.A0A, h4o.A0A) || !C14360o3.A0K(this.A0B, h4o.A0B) || !C14360o3.A0K(this.A00, h4o.A00) || !C14360o3.A0K(this.A0C, h4o.A0C) || !C14360o3.A0K(this.A0D, h4o.A0D) || !C14360o3.A0K(this.A0E, h4o.A0E)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43576JMk
    public final C38321qM Af1() {
        return this.A03;
    }

    @Override // X.InterfaceC43576JMk
    public final Long AiY() {
        return this.A05;
    }

    @Override // X.InterfaceC43576JMk
    public final String Aiz() {
        return this.A06;
    }

    @Override // X.InterfaceC43576JMk
    public final String Aj0() {
        return this.A07;
    }

    @Override // X.InterfaceC43576JMk
    public final String Aj7() {
        return this.A08;
    }

    @Override // X.InterfaceC43576JMk
    public final /* bridge */ /* synthetic */ InterfaceC38021pm Anu() {
        return this.A01;
    }

    @Override // X.InterfaceC43576JMk
    public final boolean BBT() {
        return this.A0G;
    }

    @Override // X.InterfaceC43576JMk
    public final long BKA() {
        return this.A02;
    }

    @Override // X.InterfaceC43576JMk
    public final /* bridge */ /* synthetic */ InterfaceC43509JJv BWZ() {
        return this.A00;
    }

    @Override // X.InterfaceC43576JMk
    public final String BWe() {
        return this.A0C;
    }

    @Override // X.InterfaceC43576JMk
    public final String CAR() {
        return this.A0E;
    }

    @Override // X.InterfaceC43576JMk
    public final String getMediaId() {
        return this.A0A;
    }

    @Override // X.InterfaceC43576JMk
    public final String getMessage() {
        return this.A0B;
    }

    @Override // X.InterfaceC43576JMk
    public final String getTitle() {
        return this.A0D;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A0E, (AbstractC166997dE.A0K(this.A0C, (((AbstractC166997dE.A0K(this.A0A, AbstractC25236BEt.A01(this.A02, (AbstractC167007dF.A0D(this.A0G, (((AbstractC166997dE.A0J(this.A01, ((((((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31)) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A0D)) * 31);
    }

    @Override // X.InterfaceC43576JMk
    public final InterfaceC43576JMk E9Q(C1DY c1dy) {
        return this;
    }
}
