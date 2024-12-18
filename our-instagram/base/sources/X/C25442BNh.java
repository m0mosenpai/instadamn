package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.BNh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25442BNh implements JIH {
    public final /* synthetic */ C76223bS A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ BN0 A02;

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, list);
        BN0 bn0 = this.A02;
        C120985dq c120985dq2 = bn0.A00;
        if (!c120985dq.equals(c120985dq2)) {
            C0f5 AEp = C18950wb.A01.AEp("ClipsVideoSubtitlesCuingMismatch", 817902720);
            AEp.ABW(DialogModule.KEY_MESSAGE, "Cue caught for wrong media id in Litho impl.");
            AEp.report();
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (AbstractC166987dD.A1b(list) && AbstractC75343a1.A0B(c120985dq2.A02)) {
            UserSession userSession = bn0.A02;
            C14360o3.A0B(userSession, 0);
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC16530ry interfaceC16530ry = A00.A2M;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 30)) {
                A1C.insert(0, C41720Idr.A00(AbstractC77363dM.A00(this.A00), userSession));
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A2M, c0yrArr, 30, A1R);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (A1C.length() > 0) {
                A1C.append("\n");
            }
            A1C.append(charSequence);
        }
        this.A01.A01(A1C);
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public C25442BNh(C76223bS c76223bS, C51762Yz c51762Yz, BN0 bn0) {
        this.A02 = bn0;
        this.A00 = c76223bS;
        this.A01 = c51762Yz;
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }
}
