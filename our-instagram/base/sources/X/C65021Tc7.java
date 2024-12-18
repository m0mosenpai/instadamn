package X;

import androidx.compose.ui.Alignment;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.Tc7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65021Tc7 extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65021Tc7(long j, Object obj, Object obj2, int i) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A03 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                Alignment alignment = ((C28712Cm4) this.A03).A01;
                C59W c59w = (C59W) this.A02;
                ((C5AW) obj).A06(c59w, 0.0f, alignment.AB9(AnonymousClass583.Ltr, AbstractC119215ad.A00(c59w.A01, c59w.A00), this.A01));
                break;
            case 1:
                C62678SLr c62678SLr = (C62678SLr) obj;
                if (c62678SLr != null) {
                    Q8D q8d = (Q8D) this.A03;
                    C58252li c58252li = q8d.A07;
                    c58252li.A0D((C2GT) this.A02);
                    Throwable th = c62678SLr.A02;
                    if (th == null) {
                        q8d.A02 = q8d.A0E.A04();
                        Q8D.A01(q8d, q8d.A0D.now() - this.A01);
                        break;
                    } else {
                        c58252li.A0B(EnumC61121Rfb.A02);
                        C2GS c2gs = q8d.A08;
                        HashSet hashSet = W39.A0C;
                        c2gs.A0B(new QIk(null, new W39(q8d.A0D(), th), null, -1L, -1L, -1L, -1L));
                        break;
                    }
                }
                break;
            case 2:
            case 3:
            case 4:
            default:
                C25531Mh c25531Mh = (C25531Mh) obj;
                C0Zx c0Zx = new C0Zx();
                AbstractC43594JPz.A1E(c0Zx, (LoggingContext) this.A03);
                c0Zx.A05("paypal_billing_agreement_id", Long.valueOf(this.A01));
                c25531Mh.A0N(c0Zx, "event_payload");
                AbstractC43593JPy.A1M(c25531Mh, this.A02);
                return c25531Mh;
            case 5:
                InterfaceC1132159j interfaceC1132159j = (InterfaceC1132159j) obj;
                C14360o3.A0B(interfaceC1132159j, 0);
                InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A03;
                interfaceC1132159j.Ed7(AbstractC166987dD.A09(interfaceC74963Ym.getValue()));
                interfaceC1132159j.Ed8(AbstractC166987dD.A09(interfaceC74963Ym.getValue()));
                interfaceC1132159j.EPa(AbstractC166987dD.A09(((InterfaceC74963Ym) this.A02).getValue()));
                interfaceC1132159j.EgB(this.A01);
                break;
            case 6:
                return ((C47616L1b) this.A03).A00.A0L(new C43597JQd(54, new C50267MHw(this.A01, 1, AbstractC166987dD.A1a(AbstractC47132Ef.A00((UserSession) this.A02).A0H.A00()))));
            case 7:
                return ((C133255zr) this.A03).A00(null, this.A01, ((C133215zn) this.A02).A04);
            case 8:
                ((C60302pD) this.A03).A01.post(new TQM((InterfaceC65459TkV) this.A02, AbstractC166987dD.A0N(obj), this.A01));
                return C0eB.A00;
        }
        return C0eB.A00;
    }
}
