package X;

import com.instagram.model.rtc.RtcCallKey;

/* renamed from: X.MwP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51881MwP extends C0T6 implements InterfaceC57855PlL {
    public final RtcCallKey A00;
    public final Integer A01;
    public final Integer A02;

    public C51881MwP(RtcCallKey rtcCallKey, Integer num, Integer num2) {
        C14360o3.A0B(num2, 3);
        this.A00 = rtcCallKey;
        this.A01 = num;
        this.A02 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51881MwP) {
                C51881MwP c51881MwP = (C51881MwP) obj;
                if (!C14360o3.A0K(this.A00, c51881MwP.A00) || this.A01 != c51881MwP.A01 || this.A02 != c51881MwP.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        Integer num = this.A01;
        if (num != C05F.A0C && num != C05F.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        Integer num = this.A01;
        return AbstractC167017dG.A0L(num, Nx9.A00(num), A0M) + AbstractC54901OPx.A00(this.A02);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RtcCallStateModel(callKey=");
        A1C.append(this.A00);
        A1C.append(", callState=");
        Integer num = this.A01;
        if (num != null) {
            str = Nx9.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", callType=");
        return AbstractC25236BEt.A0Y(AbstractC54901OPx.A01(this.A02), A1C);
    }
}
