package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.user.model.User;

/* renamed from: X.PIu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56803PIu implements InterfaceC58171Pqb {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C51745MtU A05;
    public LiveUserPaySupportTier A06;
    public EnumC84933qh A07 = EnumC84933qh.A09;
    public User A08;
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    @Override // X.InterfaceC58171Pqb
    public final long Asb() {
        return this.A03;
    }

    @Override // X.InterfaceC58171Pqb
    public final EnumC53264Nh2 BO3() {
        return EnumC53264Nh2.A0A;
    }

    @Override // X.InterfaceC58171Pqb
    public final User CDj() {
        return this.A08;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C56803PIu) {
            C56803PIu c56803PIu = (C56803PIu) obj;
            if (C14360o3.A0K(getPk(), c56803PIu.getPk()) && this.A06 == c56803PIu.A06 && this.A01 == c56803PIu.A01 && this.A02 == c56803PIu.A02) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getPk() {
        String str = this.A0A;
        if (str == null) {
            return String.valueOf(super.hashCode());
        }
        return str;
    }

    @Override // X.InterfaceC58171Pqb
    public final String getText() {
        return this.A0D;
    }

    public final int hashCode() {
        return AbstractC31177DnL.A04(this.A0A);
    }
}
