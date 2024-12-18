package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* loaded from: classes8.dex */
public final class JWS implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public JWS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        Long l;
        Object c132955zK;
        switch (this.A00) {
            case 0:
                return C142456c7.A04((C142456c7) this.A01, (InterfaceC23621Ds) obj);
            case 1:
                C52254NAu c52254NAu = (C52254NAu) this.A01;
                C5L6 c5l6 = (C5L6) obj;
                if (c52254NAu.A0D != c5l6) {
                    c52254NAu.A0D = c5l6;
                    c52254NAu.A0S.A05 = c5l6;
                    C52254NAu.A08(c52254NAu);
                    C52254NAu.A0C(c52254NAu, c52254NAu.A0D);
                    C52254NAu.A05(c52254NAu);
                    C52254NAu.A09(c52254NAu);
                    return null;
                }
                return null;
            case 2:
                UserSession userSession = (UserSession) this.A01;
                JXC jxc = (JXC) obj;
                if (!jxc.A00.isEmpty()) {
                    C183348Bh A00 = AbstractC183338Bg.A00(userSession);
                    A00.A0K.A09(A00.A01, "validation_error", jxc.toString());
                    MX1.A01(userSession).A07(jxc.toString());
                }
                return C0eB.A00;
            case 3:
                C1346766r c1346766r = (C1346766r) this.A01;
                C47494KyN c47494KyN = (C47494KyN) obj;
                Number number = c47494KyN.A01;
                if (number == null) {
                    c132955zK = new C48496Lcn(AbstractC166987dD.A18("create_secure_thread: Group creation failed"));
                } else {
                    long longValue = number.longValue();
                    Number number2 = c47494KyN.A00;
                    if (number2 != null) {
                        l = Long.valueOf(number2.longValue());
                    } else {
                        l = null;
                    }
                    c132955zK = new C132955zK(new MsysThreadId(EnumC92794Ds.A04, l, longValue));
                }
                c1346766r.A02(c132955zK);
                c1346766r.A00();
                return C0eB.A00;
            case 4:
                return C164447Xj.A02((C164447Xj) this.A01, (InterfaceC23621Ds) obj);
            default:
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                AbstractC167017dG.A1N(interfaceC16660sJ, obj);
                interfaceC16660sJ.invoke(obj);
                return C0eB.A00;
        }
    }
}
