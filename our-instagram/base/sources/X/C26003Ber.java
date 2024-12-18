package X;

import java.util.List;

/* renamed from: X.Ber, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26003Ber extends C0T6 {
    public final int A00;
    public final EnumC39618HeS A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final List A07;

    public C26003Ber(EnumC39618HeS enumC39618HeS, String str, String str2, List list, List list2, int i, boolean z, boolean z2) {
        AbstractC167007dF.A1I(list, 4, list2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A07 = list;
        this.A01 = enumC39618HeS;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26003Ber) {
                C26003Ber c26003Ber = (C26003Ber) obj;
                if (!C14360o3.A0K(this.A03, c26003Ber.A03) || !C14360o3.A0K(this.A02, c26003Ber.A02) || this.A00 != c26003Ber.A00 || !C14360o3.A0K(this.A07, c26003Ber.A07) || this.A01 != c26003Ber.A01 || this.A05 != c26003Ber.A05 || this.A06 != c26003Ber.A06 || !C14360o3.A0K(this.A04, c26003Ber.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A04, AbstractC167007dF.A0D(this.A06, AbstractC167007dF.A0D(this.A05, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A07, (AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A03)) + this.A00) * 31)))));
    }
}
