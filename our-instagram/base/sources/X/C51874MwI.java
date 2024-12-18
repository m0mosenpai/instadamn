package X;

import java.util.Arrays;

/* renamed from: X.MwI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51874MwI extends C0T6 implements InterfaceC57855PlL {
    public final long A00;
    public final Integer A01;
    public final Integer A02;
    public final boolean A03;
    public final String[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51874MwI) {
                C51874MwI c51874MwI = (C51874MwI) obj;
                if (this.A01 != c51874MwI.A01 || this.A00 != c51874MwI.A00 || !C14360o3.A0K(this.A04, c51874MwI.A04) || this.A02 != c51874MwI.A02 || this.A03 != c51874MwI.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        Integer num = this.A01;
        int A01 = (AbstractC25236BEt.A01(this.A00, AbstractC25230BEn.A0C(num, AbstractC54173NxA.A00(num)) * 31) + Arrays.hashCode(this.A04)) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "HIGH";
                break;
            case 2:
                str = "GUARANTEED";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return AbstractC166987dD.A0K(this.A03, AbstractC25231BEo.A0H(str, intValue, A01));
    }

    public C51874MwI(Integer num, Integer num2, String[] strArr, long j, boolean z) {
        this.A01 = num;
        this.A00 = j;
        this.A04 = strArr;
        this.A02 = num2;
        this.A03 = z;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallSystemMessageModel(message=");
        Integer num = this.A01;
        if (num != null) {
            str = AbstractC54173NxA.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", messageTimeMs=");
        A1C.append(this.A00);
        A1C.append(", messageArguments=");
        A1C.append(Arrays.toString(this.A04));
        A1C.append(", priority=");
        Integer num2 = this.A02;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "HIGH";
                    break;
                case 2:
                    str2 = "GUARANTEED";
                    break;
                default:
                    str2 = "DEFAULT";
                    break;
            }
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", longDuration=");
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
