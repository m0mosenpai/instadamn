package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.LmM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC49034LmM implements InterfaceC129525tH {
    public final C7QV A00;
    public final C2EY A01;
    public final MessageIdentifier A02;
    public final long A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ boolean ARd() {
        return C7BP.A01(this);
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String CCL() {
        return C7BP.A00(this);
    }

    public AbstractC49034LmM(C83403nh c83403nh, String str) {
        boolean A01 = AbstractC162597Pw.A01(c83403nh, str);
        this.A05 = A01;
        this.A02 = c83403nh.A0V();
        this.A03 = TimeUnit.MICROSECONDS.toMillis(c83403nh.C8i());
        this.A01 = C2EY.A0z;
        this.A06 = c83403nh.A1k(new User(str, null));
        this.A00 = new C7QV(null, null, "", "", null, null, null, null, null, null, null, null, null, false, false, false, false, false, !A01, A01, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        List A0w = c83403nh.A0w();
        C14360o3.A07(A0w);
        ArrayList A0q = AbstractC167017dG.A0q(A0w);
        Iterator it = A0w.iterator();
        while (it.hasNext()) {
            String str2 = ((AnonymousClass441) it.next()).A02;
            if (str2 == null) {
                str2 = "";
            }
            A0q.add(str2);
        }
        this.A04 = A0q;
    }

    @Override // X.InterfaceC129525tH
    public final C2EY Ar9() {
        return this.A01;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier ArP() {
        return null;
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
    public final boolean BCt() {
        return false;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ int BJB() {
        return 0;
    }

    @Override // X.InterfaceC129525tH
    public final C7QV BPA() {
        return this.A00;
    }

    @Override // X.InterfaceC129525tH
    public final MessageIdentifier BSy() {
        return this.A02;
    }

    @Override // X.InterfaceC129525tH
    public final long BT8() {
        return this.A03;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ AnonymousClass541 BfF() {
        return AnonymousClass541.A0J;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String BxY() {
        return null;
    }

    @Override // X.InterfaceC129525tH
    public final /* synthetic */ String C0c() {
        return "";
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
        return true;
    }

    @Override // X.InterfaceC129525tH
    public final boolean Cd1() {
        return false;
    }
}
