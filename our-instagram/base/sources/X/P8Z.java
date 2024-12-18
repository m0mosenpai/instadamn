package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class P8Z implements InterfaceC140686Xw {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AbstractC52526NLv A01;
    public final /* synthetic */ C34644FOb A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ boolean A04;

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }

    public P8Z(AbstractC52526NLv abstractC52526NLv, C34644FOb c34644FOb, ArrayList arrayList, long j, boolean z) {
        this.A01 = abstractC52526NLv;
        this.A03 = arrayList;
        this.A00 = j;
        this.A04 = z;
        this.A02 = c34644FOb;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.6ab] */
    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        AbstractC52526NLv abstractC52526NLv = this.A01;
        if (!abstractC52526NLv.A01.isResumed()) {
            onCancel();
            return;
        }
        C1OU c1ou = C1OU.$redex_init_class;
        ?? obj = new Object();
        ArrayList arrayList = this.A03;
        UserSession userSession = abstractC52526NLv.A02;
        obj.A02(userSession, str, arrayList);
        obj.A03(abstractC52526NLv.A03);
        obj.A08(abstractC52526NLv.A06);
        obj.A01 = this.A00;
        obj.A0d = this.A04;
        C140966Yy A0N = AbstractC31174DnI.A0N(ITS.A01(obj.A00()), ((C31253Dob) abstractC52526NLv).A00, userSession);
        A0N.A0A = AbstractC111324zv.A00(94);
        A0N.A04();
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
        this.A02.A0E.setVisibility(0);
    }
}
