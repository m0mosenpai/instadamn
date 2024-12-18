package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.My4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51967My4 extends AbstractC184688Hj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51967My4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.AbstractC184688Hj
    public final void A01(Exception exc) {
        if (this.A00 == 0) {
            C14360o3.A0B(exc, 0);
            C0K8.A0F("IgLiveCameraCapturer", "Error starting camera preview", exc);
            OWY owy = (OWY) this.A02;
            if (owy.A04 != null) {
                InterfaceC174767qC interfaceC174767qC = owy.A08;
                if (interfaceC174767qC.EjF()) {
                    interfaceC174767qC.EbS(null, 0, 0);
                }
                interfaceC174767qC.disconnect();
                owy.A04 = null;
            }
            AbstractC70118W4q abstractC70118W4q = (AbstractC70118W4q) this.A01;
            if (!owy.A07) {
                exc = new RuntimeException(exc);
            }
            abstractC70118W4q.A03(exc);
        }
    }

    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        boolean CR9;
        View A0L;
        Context context;
        switch (this.A00) {
            case 0:
                C176877tj c176877tj = (C176877tj) obj;
                C14360o3.A0B(c176877tj, 0);
                OWY owy = (OWY) this.A02;
                owy.A08.EUf(null);
                OWY.A00(c176877tj, (AbstractC70118W4q) this.A01, owy);
                return;
            case 1:
                CR9 = ((InterfaceC174767qC) this.A01).CR9();
                InterfaceC09390do interfaceC09390do = ((C47982LJb) this.A02).A04;
                A0L = AbstractC167007dF.A0L(interfaceC09390do);
                context = AbstractC167007dF.A0L(interfaceC09390do).getContext();
                break;
            default:
                CR9 = ((InterfaceC174767qC) this.A01).CR9();
                PJ5 pj5 = (PJ5) this.A02;
                if (pj5.A05.isShowing()) {
                    A0L = pj5.A04;
                    context = A0L.getContext();
                    break;
                } else {
                    return;
                }
        }
        int i = 2131975065;
        if (CR9) {
            i = 2131975049;
        }
        AbstractC166997dE.A18(context, A0L, i);
    }
}
