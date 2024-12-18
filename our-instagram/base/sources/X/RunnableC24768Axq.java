package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Axq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24768Axq implements Runnable {
    public final /* synthetic */ C194808jg A00;
    public final /* synthetic */ C23630AdP A01;
    public final /* synthetic */ boolean A02;

    public RunnableC24768Axq(C194808jg c194808jg, C23630AdP c23630AdP, boolean z) {
        this.A01 = c23630AdP;
        this.A00 = c194808jg;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C23630AdP c23630AdP = this.A01;
        if (c23630AdP.A0H.getVisibility() == 0) {
            C218239kv c218239kv = c23630AdP.A05;
            if (c218239kv == null) {
                str = "snapPickerController";
            } else {
                VES[] values = VES.values();
                boolean z = this.A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (VES ves : values) {
                    if (z || ves != VES.A09) {
                        A1E.add(ves);
                    }
                }
                ArrayList A0q = AbstractC167017dG.A0q(A1E);
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    A0q.add(new C23571AcP((VES) it.next()));
                }
                c218239kv.A01.A05(A0q);
                AbstractC13880nE.A0u(((C8J9) c218239kv).A01.A0P, new PUT(c218239kv, 0, 0));
                C23630AdP.A06(c23630AdP);
                InterfaceC25221BDv interfaceC25221BDv = c23630AdP.A06;
                if (interfaceC25221BDv != null) {
                    interfaceC25221BDv.F8C(c23630AdP.A0F);
                }
                C23630AdP.A09(c23630AdP, C05F.A01);
                View view = c23630AdP.A02;
                if (view == null) {
                    str = "stickerPreview";
                } else {
                    view.setBackground(new C9SF(this.A00));
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
