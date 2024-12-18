package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.V7w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68044V7w extends AbstractC154286wd {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0110, code lost:
    
        if (r1 != false) goto L28;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68044V7w.onSuccess(java.lang.Object):void");
    }

    public C68044V7w(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-155592959);
                C52171N7a c52171N7a = (C52171N7a) this.A01;
                C9GR.A07(c52171N7a.requireContext(), 2131968430);
                C52171N7a.A01(c52171N7a, false);
                i = -1140860733;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-882910095);
                ((C68043V7u) this.A01).A03.Dfp();
                i = -1234027652;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 576497726);
                C70851WiH c70851WiH = ((C71076WnY) this.A01).A02;
                C9GR.A0B(c70851WiH.A03, "UpcomingEventSticker_RequestFail");
                C66416UGk c66416UGk = c70851WiH.A00;
                if (c66416UGk != null) {
                    c66416UGk.notifyDataSetChanged();
                    C70851WiH.A00(c70851WiH);
                    i = -806144557;
                    C0f9.A0A(i, A03);
                    return;
                }
                throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(476151747);
                C52171N7a c52171N7a = (C52171N7a) this.A01;
                if (c52171N7a.mView != null) {
                    ((C3FR) c52171N7a.getScrollingViewProxy()).setIsLoading(false);
                }
                C52171N7a.A01(c52171N7a, false);
                i = -736342658;
                break;
            case 1:
                A03 = C0f9.A03(-1399032859);
                ((C68043V7u) this.A01).A03.Dfz();
                i = -376253039;
                break;
            default:
                A03 = C0f9.A03(-414936112);
                i = 802497054;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(873564335);
                C52171N7a c52171N7a = (C52171N7a) this.A01;
                if (c52171N7a.mView != null) {
                    ((C3FR) c52171N7a.getScrollingViewProxy()).setIsLoading(true);
                }
                C52171N7a.A01(c52171N7a, false);
                i = 1147493857;
                break;
            case 1:
                A03 = C0f9.A03(-674297360);
                ((C68043V7u) this.A01).A03.DgF();
                i = 1505944288;
                break;
            default:
                A03 = C0f9.A03(-1075328829);
                i = 1194790845;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1966093322);
                int A032 = C0f9.A03(498150465);
                InterfaceC09390do interfaceC09390do = ((C52171N7a) this.A01).A07;
                C4DU.A00((UserSession) interfaceC09390do.getValue(), new C4DT((UserSession) interfaceC09390do.getValue())).A03(true);
                C0f9.A0A(-1359426925, A032);
                i = -1801325973;
                break;
            case 1:
                A03 = C0f9.A03(-1144227899);
                C0f9.A0A(-2095923896, C0f9.A03(454769020));
                i = 1668186151;
                break;
            default:
                A03 = C0f9.A03(719156450);
                C0f9.A0A(1896905751, C0f9.A03(-1350103371));
                i = 2137174890;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
