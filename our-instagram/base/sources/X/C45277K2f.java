package X;

import com.facebook.msys.mci.AuthData;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.K2f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45277K2f extends C0T6 implements MNO {
    public final int A00;
    public final int A01;
    public final C51760Mtj A02;
    public final AuthData A03;
    public final MessagingUser A04;
    public final C47654L2n A05;
    public final MsysThreadId A06;
    public final Integer A07;
    public final Long A08;
    public final Long A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45277K2f) {
                C45277K2f c45277K2f = (C45277K2f) obj;
                if (!C14360o3.A0K(this.A06, c45277K2f.A06) || !C14360o3.A0K(this.A04, c45277K2f.A04) || !C14360o3.A0K(this.A03, c45277K2f.A03) || this.A07 != c45277K2f.A07 || this.A01 != c45277K2f.A01 || this.A00 != c45277K2f.A00 || !C14360o3.A0K(this.A09, c45277K2f.A09) || !C14360o3.A0K(this.A08, c45277K2f.A08) || !C14360o3.A0K(this.A05, c45277K2f.A05) || !C14360o3.A0K(this.A02, c45277K2f.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0G(this.A06)));
        Integer num = this.A07;
        return (AbstractC25236BEt.A05(this.A05, (((((((AbstractC167017dG.A0L(num, AbstractC46865Kny.A00(num), A0J) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C45277K2f(C51760Mtj c51760Mtj, AuthData authData, MessagingUser messagingUser, C47654L2n c47654L2n, MsysThreadId msysThreadId, Integer num, Long l, Long l2, int i, int i2) {
        AbstractC167027dH.A13(msysThreadId, messagingUser, authData);
        C14360o3.A0B(c47654L2n, 9);
        this.A06 = msysThreadId;
        this.A04 = messagingUser;
        this.A03 = authData;
        this.A07 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A09 = l;
        this.A08 = l2;
        this.A05 = c47654L2n;
        this.A02 = c51760Mtj;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LoadLocalMessagesSideEffect(msysThreadId=");
        A1C.append(this.A06);
        A1C.append(", currentUser=");
        A1C.append(this.A04);
        A1C.append(", authData=");
        A1C.append(this.A03);
        A1C.append(", loadType=");
        Integer num = this.A07;
        if (num != null) {
            str = AbstractC46865Kny.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", limitOlder=");
        A1C.append(this.A01);
        A1C.append(", limitNewer=");
        A1C.append(this.A00);
        A1C.append(", minLoadedSortOrder=");
        A1C.append(this.A09);
        A1C.append(", maxLoadedSortOrder=");
        A1C.append(this.A08);
        A1C.append(", viewModelGenerators=");
        A1C.append(this.A05);
        A1C.append(", fetchNullStateHeaderOnly=");
        A1C.append(false);
        A1C.append(", messageHighlightModel=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
