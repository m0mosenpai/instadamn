package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.794, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass794 extends C0T6 implements InterfaceC129555tK {
    public final C163137Ry A00;
    public final C163117Rw A01;
    public final C163147Rz A02;
    public final C163127Rx A03;
    public final MessageIdentifier A04;
    public final Integer A05;
    public final HashSet A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final int A0A;
    public final AnonymousClass988 A0B;
    public final C7IH A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass794) {
                AnonymousClass794 anonymousClass794 = (AnonymousClass794) obj;
                if (!C14360o3.A0K(this.A04, anonymousClass794.A04) || !C14360o3.A0K(this.A07, anonymousClass794.A07) || !C14360o3.A0K(this.A01, anonymousClass794.A01) || !C14360o3.A0K(this.A00, anonymousClass794.A00) || !C14360o3.A0K(this.A03, anonymousClass794.A03) || !C14360o3.A0K(this.A02, anonymousClass794.A02) || !C14360o3.A0K(this.A0B, anonymousClass794.A0B) || !C14360o3.A0K(this.A0C, anonymousClass794.A0C) || !C14360o3.A0K(this.A05, anonymousClass794.A05) || this.A0A != anonymousClass794.A0A || !C14360o3.A0K(this.A06, anonymousClass794.A06) || this.A09 != anonymousClass794.A09 || this.A08 != anonymousClass794.A08) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14360o3.A0B(obj, 0);
        return equals(obj);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        MessageIdentifier messageIdentifier = this.A04;
        int i = 0;
        if (messageIdentifier == null) {
            hashCode = 0;
        } else {
            hashCode = messageIdentifier.hashCode();
        }
        int hashCode7 = ((hashCode * 31) + this.A07.hashCode()) * 31;
        C163117Rw c163117Rw = this.A01;
        if (c163117Rw == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c163117Rw.hashCode();
        }
        int i2 = (hashCode7 + hashCode2) * 31;
        C163137Ry c163137Ry = this.A00;
        if (c163137Ry == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c163137Ry.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        C163127Rx c163127Rx = this.A03;
        if (c163127Rx == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c163127Rx.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        C163147Rz c163147Rz = this.A02;
        if (c163147Rz == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c163147Rz.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        AnonymousClass988 anonymousClass988 = this.A0B;
        if (anonymousClass988 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = anonymousClass988.hashCode();
        }
        int hashCode8 = (((i5 + hashCode6) * 31) + this.A0C.hashCode()) * 31;
        Integer num = this.A05;
        if (num != null) {
            i = num.hashCode();
        }
        int hashCode9 = (((((hashCode8 + i) * 31) + this.A0A) * 31) + this.A06.hashCode()) * 31;
        int i6 = 1237;
        if (this.A09) {
            i6 = 1231;
        }
        int i7 = (hashCode9 + i6) * 31;
        int i8 = 1237;
        if (this.A08) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public AnonymousClass794(AnonymousClass988 anonymousClass988, C7IH c7ih, C163137Ry c163137Ry, C163117Rw c163117Rw, C163147Rz c163147Rz, C163127Rx c163127Rx, MessageIdentifier messageIdentifier, Integer num, HashSet hashSet, List list, int i, boolean z, boolean z2) {
        this.A04 = messageIdentifier;
        this.A07 = list;
        this.A01 = c163117Rw;
        this.A00 = c163137Ry;
        this.A03 = c163127Rx;
        this.A02 = c163147Rz;
        this.A0B = anonymousClass988;
        this.A0C = c7ih;
        this.A05 = num;
        this.A0A = i;
        this.A06 = hashSet;
        this.A09 = z;
        this.A08 = z2;
    }
}
