package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public final class G97 implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;

    public G97(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C146106i8 c146106i8, Object obj, int i) {
        c146106i8.A0A = new G97(obj, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0162, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC58152PqH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onButtonClick(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G97.onButtonClick(android.view.View):void");
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        InterfaceC37219GaU interfaceC37219GaU;
        if (15 - this.A00 == 0 && (interfaceC37219GaU = (InterfaceC37219GaU) this.A01) != null) {
            interfaceC37219GaU.DqX();
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C41645Ibb c41645Ibb;
        UserSession userSession;
        InterfaceC60442pS interfaceC60442pS;
        C38321qM c38321qM;
        int A0H;
        switch (this.A00) {
            case 4:
                InterfaceC19630xq A0x = AbstractC166987dD.A0x(V1R.A00((V1R) this.A01));
                String A00 = AbstractC111324zv.A00(2446);
                AbstractC167007dF.A18(A0x, A00, AbstractC31172DnG.A01(A0x, A00) + 1);
                return;
            case 5:
            case 6:
            case 7:
            case 8:
            default:
                return;
            case 9:
                EUT eut = (EUT) this.A01;
                c41645Ibb = (C41645Ibb) eut.A02;
                userSession = c41645Ibb.A02;
                interfaceC60442pS = c41645Ibb.A03;
                interfaceC60442pS.getClass();
                c38321qM = (C38321qM) eut.A03;
                A0H = eut.A01;
                break;
            case 10:
                C32500ETa c32500ETa = (C32500ETa) this.A01;
                if (((SavedCollection) c32500ETa.A02).A07 != EnumC33416Epn.A0C) {
                    return;
                }
                c41645Ibb = (C41645Ibb) c32500ETa.A01;
                userSession = c41645Ibb.A02;
                interfaceC60442pS = c41645Ibb.A03;
                interfaceC60442pS.getClass();
                c38321qM = (C38321qM) c32500ETa.A03;
                A0H = AbstractC166987dD.A0H(c32500ETa.A04);
                break;
        }
        AbstractC35273Fh8.A06(userSession, c38321qM, interfaceC60442pS, c41645Ibb.A04, A0H);
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
