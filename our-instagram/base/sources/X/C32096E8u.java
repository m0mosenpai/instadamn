package X;

/* renamed from: X.E8u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32096E8u extends C0T6 implements InterfaceC66482zP {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32096E8u) {
                C32096E8u c32096E8u = (C32096E8u) obj;
                if (!C14360o3.A0K(this.A04, c32096E8u.A04) || !C14360o3.A0K(this.A02, c32096E8u.A02) || !C14360o3.A0K(this.A01, c32096E8u.A01) || !C14360o3.A0K(this.A03, c32096E8u.A03) || !C14360o3.A0K(this.A00, c32096E8u.A00) || this.A05 != c32096E8u.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A04))))));
    }

    public C32096E8u(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A00 = str5;
        this.A05 = z;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SectionItemViewModel(threadTitle=");
        A1C.append(this.A04);
        A1C.append(", subtitle=");
        AbstractC25235BEs.A1K(A1C, this.A02);
        A1C.append(this.A01);
        A1C.append(", threadId=");
        A1C.append(this.A03);
        A1C.append(", creatorUsername=");
        A1C.append(this.A00);
        A1C.append(", showVerifiedBadge=");
        A1C.append(this.A05);
        return AbstractC167017dG.A0p(A1C);
    }
}
