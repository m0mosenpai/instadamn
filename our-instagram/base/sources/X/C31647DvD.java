package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;
import java.util.List;

/* renamed from: X.DvD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31647DvD implements InterfaceC50462MPq {
    public final UserSession A00;
    public final C31606DuY A01;
    public final C31646DvC A02;

    @Override // X.InterfaceC50462MPq
    public final void Crw(C31446Drq c31446Drq, C3o9 c3o9, Integer num, Integer num2, String str, List list) {
        C14360o3.A0B(c3o9, 0);
        this.A01.Crw(c31446Drq, c3o9, null, null, str, list);
    }

    @Override // X.InterfaceC50462MPq
    public final void Cs0(C31446Drq c31446Drq, C3o9 c3o9, Integer num, String str, int i) {
        C31606DuY c31606DuY;
        C3o9 c3o92 = c3o9;
        if (c3o9 instanceof DirectThreadKey) {
            c31606DuY = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            C31646DvC.A00(c31446Drq, this.A02, c3o9, num);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31606DuY = this.A01;
            c3o92 = ((DirectMsysMixedThreadKey) c3o92).A00;
        }
        c31606DuY.Cs0(c31446Drq, c3o92, num, str, i);
    }

    public C31647DvD(UserSession userSession, C31606DuY c31606DuY, C31646DvC c31646DvC) {
        AbstractC167017dG.A1P(c31606DuY, c31646DvC);
        this.A01 = c31606DuY;
        this.A02 = c31646DvC;
        this.A00 = userSession;
    }
}
