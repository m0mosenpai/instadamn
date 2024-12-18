package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collections;

/* renamed from: X.9G5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9G5 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9G5(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A04 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget = (DirectShareTarget) this.A02;
                if (interfaceC83713oG instanceof InterfaceC2056098k) {
                    directShareTarget = new DirectShareTarget(interfaceC83713oG, (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0));
                }
                AbstractC140396Wt.A02((UserSession) this.A03, directShareTarget).ENB((C38321qM) this.A01, directShareTarget, this.A04, false);
                return C0eB.A00;
            case 1:
                InterfaceC83713oG interfaceC83713oG2 = (InterfaceC83713oG) obj;
                if (interfaceC83713oG2 instanceof InterfaceC2056098k) {
                    new DirectShareTarget(interfaceC83713oG2, (PendingRecipient) Collections.unmodifiableList(((DirectShareTarget) this.A02).A0Q).get(0));
                }
                UserSession userSession = (UserSession) this.A03;
                DirectShareTarget directShareTarget2 = (DirectShareTarget) this.A02;
                AbstractC140396Wt.A02(userSession, directShareTarget2).ENF((C84923qg) this.A01, directShareTarget2, this.A04, false);
                return C0eB.A00;
            case 2:
                InterfaceC83713oG interfaceC83713oG3 = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget3 = (DirectShareTarget) this.A02;
                if (interfaceC83713oG3 instanceof InterfaceC2056098k) {
                    directShareTarget3 = new DirectShareTarget(interfaceC83713oG3, (PendingRecipient) Collections.unmodifiableList(directShareTarget3.A0Q).get(0));
                }
                AbstractC140396Wt.A02((UserSession) this.A03, directShareTarget3).ENQ((C38321qM) this.A01, directShareTarget3, this.A04, false, false);
                return C0eB.A00;
            case 3:
                InterfaceC83713oG interfaceC83713oG4 = (InterfaceC83713oG) obj;
                DirectShareTarget directShareTarget4 = (DirectShareTarget) this.A02;
                boolean z = false;
                if (interfaceC83713oG4 instanceof InterfaceC2056098k) {
                    directShareTarget4 = new DirectShareTarget(interfaceC83713oG4, (PendingRecipient) Collections.unmodifiableList(directShareTarget4.A0Q).get(0));
                }
                if (!(interfaceC83713oG4 instanceof C23974Ak9)) {
                    z = C35143Fek.A00.A01((UserSession) this.A03, directShareTarget4);
                }
                AbstractC140396Wt.A02((UserSession) this.A03, directShareTarget4).EOD((C38321qM) this.A01, directShareTarget4, this.A04, z);
                return C0eB.A00;
            default:
                MWW mww = (MWW) obj;
                C155666yv c155666yv = ((C155656yu) this.A01).A00;
                if (c155666yv != null) {
                    if (c155666yv.A0B != mww) {
                        c155666yv.A0B = mww;
                        c155666yv.A00();
                    }
                    if (mww != null) {
                        UserSession userSession2 = ((C155526yh) this.A03).A04;
                        C14360o3.A0B(userSession2, 0);
                        ((C31508Dss) userSession2.A01(C31508Dss.class, new C37057GUn(userSession2, 28))).A00((C18920wW) this.A02, this.A04, mww.A02.A0B);
                    }
                    return C0eB.A00;
                }
                C14360o3.A0F("headerAdapter");
                throw C00O.createAndThrow();
        }
    }
}
