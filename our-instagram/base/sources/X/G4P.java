package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G4P implements InterfaceC165697aw {
    public final InterfaceC09390do A00;
    public final FragmentActivity A01;
    public final UserSession A02;

    public G4P(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 3);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = C37059GUt.A00(interfaceC08830cm, 49);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r0 != false) goto L6;
     */
    @Override // X.InterfaceC165697aw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AG2() {
        /*
            r3 = this;
            com.instagram.common.session.UserSession r2 = r3.A02
            X.0do r0 = r3.A00
            java.lang.Object r0 = r0.getValue()
            X.7U0 r0 = (X.C7U0) r0
            X.7Ux r1 = r0.C7r()
            java.lang.String r0 = r2.userId
            boolean r0 = r1.CPb(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = r2.userId
            boolean r0 = r1.CYt(r0)
            r2 = 0
            if (r0 == 0) goto L20
        L1f:
            r2 = 1
        L20:
            int r1 = X.AbstractC31172DnG.A00(r1)
            r0 = 29
            if (r1 != r0) goto L2b
            r0 = 1
            if (r2 != 0) goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G4P.AG2():boolean");
    }

    @Override // X.InterfaceC165697aw
    public final void Cr5(String str) {
        String A00 = AbstractC111324zv.A00(1578);
        InterfaceC83733oI CCa = ((C7U0) this.A00.getValue()).C7r().CCa();
        if (CCa != null) {
            UserSession userSession = this.A02;
            AbstractC31174DnI.A1M(AbstractC31174DnI.A0N(AbstractC34088F2q.A00(userSession, CCa, "hidden_reaction_nux"), this.A01, userSession), A00);
        }
    }
}
