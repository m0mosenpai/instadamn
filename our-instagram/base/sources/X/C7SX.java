package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.7SX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SX extends AbstractC129515tG implements InterfaceC129545tJ, InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final C45117Jxm A02;
    public final C7QX A03;
    public final C7QL A04;
    public final EnumC92794Ds A05;
    public final C38321qM A06;
    public final DirectMessageIdentifier A07;
    public final Integer A08;
    public final Integer A09;
    public final Long A0A;
    public final Long A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7SX) {
                C7SX c7sx = (C7SX) obj;
                if (!C14360o3.A0K(this.A0A, c7sx.A0A) || !C14360o3.A0K(this.A0C, c7sx.A0C) || !C14360o3.A0K(this.A07, c7sx.A07) || !C14360o3.A0K(this.A0D, c7sx.A0D) || this.A00 != c7sx.A00 || !C14360o3.A0K(this.A06, c7sx.A06) || this.A01 != c7sx.A01 || !C14360o3.A0K(this.A0F, c7sx.A0F) || !C14360o3.A0K(this.A04, c7sx.A04) || !C14360o3.A0K(this.A03, c7sx.A03) || this.A05 != c7sx.A05 || this.A0G != c7sx.A0G || !C14360o3.A0K(this.A0B, c7sx.A0B) || this.A0I != c7sx.A0I || this.A0H != c7sx.A0H || this.A08 != c7sx.A08 || this.A09 != c7sx.A09 || !C14360o3.A0K(this.A0E, c7sx.A0E) || !C14360o3.A0K(this.A02, c7sx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7SX(C45117Jxm c45117Jxm, C7QX c7qx, C7QL c7ql, EnumC92794Ds enumC92794Ds, C38321qM c38321qM, DirectMessageIdentifier directMessageIdentifier, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(c7qx);
        C14360o3.A0B(enumC92794Ds, 11);
        this.A0A = l;
        this.A0C = str;
        this.A07 = directMessageIdentifier;
        this.A0D = str2;
        this.A00 = i;
        this.A06 = c38321qM;
        this.A01 = i2;
        this.A0F = list;
        this.A04 = c7ql;
        this.A03 = c7qx;
        this.A05 = enumC92794Ds;
        this.A0G = z;
        this.A0B = l2;
        this.A0I = z2;
        this.A0H = z3;
        this.A08 = num;
        this.A09 = num2;
        this.A0E = str3;
        this.A02 = c45117Jxm;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVa() {
        return this.A04.A00;
    }

    @Override // X.InterfaceC129545tJ
    public final boolean CVb() {
        return this.A04.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        Long l = this.A0A;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.A0C;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode8 = (((i2 + hashCode2) * 31) + this.A07.hashCode()) * 31;
        String str2 = this.A0D;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (((hashCode8 + hashCode3) * 31) + this.A00) * 31;
        C38321qM c38321qM = this.A06;
        if (c38321qM == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c38321qM.hashCode();
        }
        int i4 = (((i3 + hashCode4) * 31) + this.A01) * 31;
        List list = this.A0F;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int hashCode9 = (((((((i4 + hashCode5) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A05.hashCode()) * 31;
        int i5 = 1237;
        if (this.A0G) {
            i5 = 1231;
        }
        int i6 = (hashCode9 + i5) * 31;
        Long l2 = this.A0B;
        if (l2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l2.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        int i8 = 1237;
        if (this.A0I) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0H) {
            i10 = 1231;
        }
        int A00 = (((((i9 + i10) * 31) + AbstractC46708KlR.A00(this.A08)) * 31) + AbstractC46709KlS.A00(this.A09)) * 31;
        String str3 = this.A0E;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i11 = (A00 + hashCode7) * 31;
        C45117Jxm c45117Jxm = this.A02;
        if (c45117Jxm != null) {
            i = c45117Jxm.hashCode();
        }
        return i11 + i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
