package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7QX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7QX extends C0T6 implements InterfaceC129525tH {
    public final long A00;
    public final C26084BgD A01;
    public final C7QV A02;
    public final C7P3 A03;
    public final C2EY A04;
    public final MessageIdentifier A05;
    public final MessageIdentifier A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ boolean ARd() {
        return C7BP.A01(this);
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String CCL() {
        return C7BP.A00(this);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7QX) {
                C7QX c7qx = (C7QX) obj;
                if (!C14360o3.A0K(this.A06, c7qx.A06) || this.A00 != c7qx.A00 || this.A0B != c7qx.A0B || this.A08 != c7qx.A08 || this.A0A != c7qx.A0A || !C14360o3.A0K(this.A02, c7qx.A02) || !C14360o3.A0K(this.A07, c7qx.A07) || this.A04 != c7qx.A04 || this.A09 != c7qx.A09 || this.A0C != c7qx.A0C || !C14360o3.A0K(this.A05, c7qx.A05) || !C14360o3.A0K(this.A01, c7qx.A01) || this.A03 != c7qx.A03) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC129525tH
    public final C2EY Ar9() {
        return this.A04;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier ArP() {
        return this.A05;
    }

    @Override // X.InterfaceC129525tH
    public final List AuO() {
        return this.A07;
    }

    @Override // X.InterfaceC129525tH
    public final C7P3 AxY() {
        return this.A03;
    }

    @Override // X.InterfaceC129525tH
    public final boolean BCt() {
        return this.A08;
    }

    @Override // X.InterfaceC129525tH
    public final int BJB() {
        C26084BgD c26084BgD = this.A01;
        if (c26084BgD == null) {
            return 0;
        }
        return ((InterfaceC50520MRx) c26084BgD.A03).BJC(c26084BgD.A01);
    }

    @Override // X.InterfaceC129525tH
    public final C7QV BPA() {
        return this.A02;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier BSy() {
        return this.A06;
    }

    @Override // X.InterfaceC129525tH
    public final long BT8() {
        return this.A00;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ AnonymousClass541 BfF() {
        return AnonymousClass541.A0J;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String BxY() {
        return null;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String C0c() {
        return this.A02.A06;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CVC() {
        return this.A09;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CXQ() {
        return this.A0A;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CYW() {
        return this.A0B;
    }

    @Override // X.InterfaceC129525tH
    public final boolean Cd1() {
        return this.A0C;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A06.hashCode() * 31;
        long j = this.A00;
        int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        int i2 = 1237;
        if (this.A0B) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        int i4 = 1237;
        if (this.A08) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int hashCode4 = (((i5 + i6) * 31) + this.A02.hashCode()) * 31;
        List list = this.A07;
        int i7 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode) * 31) + this.A04.hashCode()) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        int i9 = (hashCode5 + i8) * 31;
        int i10 = 1237;
        if (this.A0C) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        MessageIdentifier messageIdentifier = this.A05;
        if (messageIdentifier == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = messageIdentifier.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        C26084BgD c26084BgD = this.A01;
        if (c26084BgD != null) {
            i7 = c26084BgD.hashCode();
        }
        return ((i12 + i7) * 31) + this.A03.hashCode();
    }

    public C7QX(C26084BgD c26084BgD, C7QV c7qv, C7P3 c7p3, C2EY c2ey, MessageIdentifier messageIdentifier, MessageIdentifier messageIdentifier2, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = messageIdentifier;
        this.A00 = j;
        this.A0B = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A02 = c7qv;
        this.A07 = list;
        this.A04 = c2ey;
        this.A09 = z4;
        this.A0C = z5;
        this.A05 = messageIdentifier2;
        this.A01 = c26084BgD;
        this.A03 = c7p3;
    }
}
