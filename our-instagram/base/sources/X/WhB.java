package X;

import com.instagram.api.schemas.BoostedActionStatus;

/* loaded from: classes11.dex */
public final class WhB implements InterfaceC66482zP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final BoostedActionStatus A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A0C;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        WhB whB = (WhB) obj;
        String str2 = this.A0C;
        if (whB != null) {
            str = whB.A0C;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && this.A08 == whB.A08 && C14360o3.A0K(this.A0D, whB.A0D) && C14360o3.A0K(this.A0B, whB.A0B) && C14360o3.A0K(this.A0A, whB.A0A) && this.A09 == whB.A09 && this.A00 == whB.A00 && this.A01 == whB.A01 && this.A02 == whB.A02 && this.A03 == whB.A03 && this.A04 == whB.A04 && this.A05 == whB.A05 && this.A06 == whB.A06 && this.A07 == whB.A07) {
            return true;
        }
        return false;
    }

    public WhB(BoostedActionStatus boostedActionStatus, Integer num, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.A0C = str;
        this.A08 = j;
        this.A0D = str2;
        this.A0B = str3;
        this.A0A = num;
        this.A09 = boostedActionStatus;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
    }
}
