package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class G49 implements InterfaceC129525tH {
    public final long A00;
    public final C7QV A01;
    public final C2EY A02;
    public final MessageIdentifier A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ boolean ARd() {
        return C7BP.A01(this);
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier ArP() {
        return null;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ int BJB() {
        return 0;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String BxY() {
        return null;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String CCL() {
        return C7BP.A00(this);
    }

    @Override // X.InterfaceC129525tH
    public final boolean Cd1() {
        return false;
    }

    public G49(C32050E6c c32050E6c, String str, String str2) {
        String str3;
        long j;
        boolean A1a = AbstractC31175DnJ.A1a(str2);
        User user = c32050E6c.A02;
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = null;
        }
        boolean equals = str2.equals(str3);
        this.A05 = equals;
        String str4 = c32050E6c.A05;
        if (str4 != null) {
            this.A03 = new MessageIdentifier(str4, str);
            if (c32050E6c.A04 != null) {
                j = TimeUnit.SECONDS.toMillis(r0.intValue());
            } else {
                j = 0;
            }
            this.A00 = j;
            this.A02 = C2EY.A0z;
            this.A07 = A1a;
            String str5 = c32050E6c.A07;
            this.A06 = str5 != null;
            this.A01 = new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, !equals, equals, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
            this.A04 = str5 != null ? AbstractC166987dD.A1J(str5) : null;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC129525tH
    public final boolean BCt() {
        int intValue;
        if ((this instanceof C32716Eah) && ((intValue = ((C32716Eah) this).A07.intValue()) == 1 || intValue == 2)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String C0c() {
        return this.A01.A06;
    }

    @Override // X.InterfaceC129525tH
    public final C2EY Ar9() {
        return this.A02;
    }

    @Override // X.InterfaceC129525tH
    public final List AuO() {
        return this.A04;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ C7P3 AxY() {
        return C7P3.A0S;
    }

    @Override // X.InterfaceC129525tH
    public final C7QV BPA() {
        return this.A01;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier BSy() {
        return this.A03;
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
    public final boolean CVC() {
        return this.A05;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CXQ() {
        return this.A06;
    }

    @Override // X.InterfaceC129525tH
    public final boolean CYW() {
        return this.A07;
    }
}
