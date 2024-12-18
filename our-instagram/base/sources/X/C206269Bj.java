package X;

import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import java.util.List;

/* renamed from: X.9Bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206269Bj extends C0T6 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C206269Bj(C191258dU c191258dU, Integer num, Long l, List list) {
        this.A00 = 0;
        C14360o3.A0B(c191258dU, 1);
        C14360o3.A0B(list, 2);
        this.A01 = c191258dU;
        this.A02 = list;
        this.A03 = num;
        this.A04 = l;
        this.A05 = num != C05F.A0Y;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206269Bj) {
                    C206269Bj c206269Bj = (C206269Bj) obj;
                    if (c206269Bj.A00 != 1 || this.A05 != c206269Bj.A05 || !C14360o3.A0K(this.A01, c206269Bj.A01) || !C14360o3.A0K(this.A02, c206269Bj.A02) || !C14360o3.A0K(this.A04, c206269Bj.A04) || this.A03 != c206269Bj.A03) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C206269Bj)) {
                return false;
            }
            C206269Bj c206269Bj2 = (C206269Bj) obj;
            if (c206269Bj2.A00 != 0 || !C14360o3.A0K(this.A01, c206269Bj2.A01) || !C14360o3.A0K(this.A02, c206269Bj2.A02) || this.A03 != c206269Bj2.A03 || !C14360o3.A0K(this.A04, c206269Bj2.A04)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        Object obj;
        int i;
        int hashCode2;
        int hashCode3;
        if (this.A00 != 0) {
            int i2 = 1237;
            if (this.A05) {
                i2 = 1231;
            }
            int i3 = i2 * 31;
            Object obj2 = this.A01;
            int i4 = 0;
            if (obj2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj2.hashCode();
            }
            int i5 = (i3 + hashCode2) * 31;
            Object obj3 = this.A02;
            if (obj3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj3.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            Object obj4 = this.A04;
            if (obj4 != null) {
                i4 = obj4.hashCode();
            }
            hashCode = (i6 + i4) * 31;
            obj = this.A03;
        } else {
            int hashCode4 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
            int intValue = ((Number) this.A03).intValue();
            switch (intValue) {
                case 1:
                    str = "IN_MEMORY_CACHE";
                    break;
                case 2:
                    str = "DB";
                    break;
                case 3:
                    str = "EXPIRED_DB";
                    break;
                case 4:
                    str = "NETWORK";
                    break;
                case 5:
                    str = "PARTIAL_CACHE";
                    break;
                default:
                    str = "HTTP_CACHE";
                    break;
            }
            hashCode = (hashCode4 + str.hashCode() + intValue) * 31;
            obj = this.A04;
            if (obj == null) {
                i = 0;
                return hashCode + i;
            }
        }
        i = obj.hashCode();
        return hashCode + i;
    }

    public C206269Bj(C81543kP c81543kP, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, List list, boolean z) {
        this.A00 = 1;
        EnumC160877Iv enumC160877Iv = EnumC160877Iv.A03;
        this.A00 = 1;
        this.A05 = z;
        this.A01 = creatorSubscriberThreadInfo;
        this.A02 = c81543kP;
        this.A04 = list;
        this.A03 = enumC160877Iv;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206269Bj(C191258dU c191258dU, List list) {
        this(c191258dU, C05F.A0Y, (Long) null, list);
        this.A00 = 0;
    }
}
