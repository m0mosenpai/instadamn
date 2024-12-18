package X;

import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct;
import com.instagram.api.schemas.MonetizationEligibilityDecision;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.4n4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104384n4 extends C0T6 {
    public final C38688GzT A00;
    public final InterfaceC104374n3 A01;
    public final CanUseCreatorMonetizationProduct A02;
    public final InterfaceC108164u1 A03;
    public final HasOnboardedCreatorMonetizationProduct A04;
    public final MonetizationEligibilityDecision A05;
    public final InterfaceC108174u2 A06;
    public final UserMonetizationProductType A07;
    public final boolean A08;
    public final boolean A09;
    public final C9BH A0A;

    public C104384n4(C9BH c9bh, C38688GzT c38688GzT, InterfaceC104374n3 interfaceC104374n3, CanUseCreatorMonetizationProduct canUseCreatorMonetizationProduct, InterfaceC108164u1 interfaceC108164u1, HasOnboardedCreatorMonetizationProduct hasOnboardedCreatorMonetizationProduct, MonetizationEligibilityDecision monetizationEligibilityDecision, InterfaceC108174u2 interfaceC108174u2, UserMonetizationProductType userMonetizationProductType, boolean z, boolean z2) {
        C14360o3.A0B(canUseCreatorMonetizationProduct, 2);
        C14360o3.A0B(hasOnboardedCreatorMonetizationProduct, 4);
        C14360o3.A0B(userMonetizationProductType, 9);
        this.A01 = interfaceC104374n3;
        this.A02 = canUseCreatorMonetizationProduct;
        this.A03 = interfaceC108164u1;
        this.A04 = hasOnboardedCreatorMonetizationProduct;
        this.A08 = z;
        this.A05 = monetizationEligibilityDecision;
        this.A06 = interfaceC108174u2;
        this.A0A = c9bh;
        this.A07 = userMonetizationProductType;
        this.A00 = c38688GzT;
        this.A09 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104384n4) {
                C104384n4 c104384n4 = (C104384n4) obj;
                if (!C14360o3.A0K(this.A01, c104384n4.A01) || this.A02 != c104384n4.A02 || !C14360o3.A0K(this.A03, c104384n4.A03) || this.A04 != c104384n4.A04 || this.A08 != c104384n4.A08 || this.A05 != c104384n4.A05 || !C14360o3.A0K(this.A06, c104384n4.A06) || !C14360o3.A0K(this.A0A, c104384n4.A0A) || this.A07 != c104384n4.A07 || !C14360o3.A0K(this.A00, c104384n4.A00) || this.A09 != c104384n4.A09) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        InterfaceC104374n3 interfaceC104374n3 = this.A01;
        int i = 0;
        if (interfaceC104374n3 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC104374n3.hashCode();
        }
        int hashCode6 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        InterfaceC108164u1 interfaceC108164u1 = this.A03;
        if (interfaceC108164u1 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = interfaceC108164u1.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode2) * 31) + this.A04.hashCode()) * 31;
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        int i3 = (hashCode7 + i2) * 31;
        MonetizationEligibilityDecision monetizationEligibilityDecision = this.A05;
        if (monetizationEligibilityDecision == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = monetizationEligibilityDecision.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        InterfaceC108174u2 interfaceC108174u2 = this.A06;
        if (interfaceC108174u2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = interfaceC108174u2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        C9BH c9bh = this.A0A;
        if (c9bh == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c9bh.hashCode();
        }
        int hashCode8 = (((i5 + hashCode5) * 31) + this.A07.hashCode()) * 31;
        C38688GzT c38688GzT = this.A00;
        if (c38688GzT != null) {
            i = c38688GzT.hashCode();
        }
        int i6 = (hashCode8 + i) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        return i6 + i7;
    }
}
