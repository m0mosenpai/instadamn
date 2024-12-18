package X;

/* renamed from: X.E8v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32097E8v extends C0T6 implements InterfaceC66482zP {
    public boolean A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32097E8v) {
                C32097E8v c32097E8v = (C32097E8v) obj;
                if (!C14360o3.A0K(this.A07, c32097E8v.A07) || !C14360o3.A0K(this.A05, c32097E8v.A05) || !C14360o3.A0K(this.A04, c32097E8v.A04) || !C14360o3.A0K(this.A06, c32097E8v.A06) || this.A01 != c32097E8v.A01 || !C14360o3.A0K(this.A03, c32097E8v.A03) || this.A08 != c32097E8v.A08 || this.A00 != c32097E8v.A00 || this.A02 != c32097E8v.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = AbstractC167007dF.A0D(this.A00, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0K(this.A03, (AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0J(this.A07)))) + this.A01) * 31)));
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = "DEFAULT";
        } else {
            str = "INVITED_SECTION";
        }
        return A0D + str.hashCode() + intValue;
    }

    public C32097E8v(Integer num, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2) {
        this.A07 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A01 = i;
        this.A03 = str5;
        this.A08 = z;
        this.A00 = z2;
        this.A02 = num;
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
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BroadcastChannelActivityV2RowViewModel(threadTitle=");
        A1C.append(this.A07);
        A1C.append(", subtitle=");
        AbstractC25235BEs.A1K(A1C, this.A05);
        A1C.append(this.A04);
        A1C.append(", threadId=");
        A1C.append(this.A06);
        A1C.append(AbstractC111324zv.A00(1397));
        A1C.append(this.A01);
        A1C.append(", creatorUsername=");
        A1C.append(this.A03);
        A1C.append(", showVerifiedBadge=");
        A1C.append(this.A08);
        A1C.append(", isUnread=");
        A1C.append(this.A00);
        A1C.append(MSV.A00(297));
        Integer num = this.A02;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "DEFAULT";
            } else {
                str = "INVITED_SECTION";
            }
        } else {
            str = "null";
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}
