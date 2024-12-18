package X;

import android.graphics.Bitmap;
import com.fbpay.w3c.W3CCardDetail;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.DHl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29923DHl extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29923DHl(int i, long j, long j2, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = j;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = j2;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
                interfaceC1129057z.AQf();
                interfaceC1129057z.AR0((C6L5) this.A03, null, (AbstractC119825bg) this.A04, 1.0f, 3, this.A01, this.A02);
                break;
            case 1:
                C62678SLr c62678SLr = (C62678SLr) obj;
                if (c62678SLr != null) {
                    Q8C q8c = (Q8C) this.A04;
                    C58252li c58252li = q8c.A03;
                    c58252li.A0D((C2GT) this.A03);
                    Throwable th = c62678SLr.A02;
                    if (AbstractC25229BEm.A1Z(th)) {
                        C2GS c2gs = q8c.A04;
                        Object obj2 = c62678SLr.A01;
                        if (obj2 != null) {
                            c2gs.A0B(new QIi(((W3CCardDetail) obj2).A00, null, null, q8c.A07.now() - this.A02, this.A01, C63021Sam.A02.now()));
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        List list = q8c.A02;
                        if (th != null) {
                            list.add(th);
                            long j = this.A02;
                            HashSet hashSet = W39.A0C;
                            W39 w39 = new W39(q8c.A0D(), th);
                            c58252li.A0B(EnumC61120Rfa.A02);
                            q8c.A04.A0B(new QIi(null, w39, null, q8c.A07.now() - j, -1L, -1L));
                            Q8C.A00(q8c);
                            break;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                }
                break;
            case 2:
                InterfaceC1129057z interfaceC1129057z2 = (InterfaceC1129057z) obj;
                AbstractC25230BEn.A19(interfaceC1129057z2);
                long Bxc = interfaceC1129057z2.Bxc();
                float A02 = C5YC.A02(Bxc) * 0.75f;
                long A00 = AbstractC119395aw.A00(C5YC.A02(Bxc) * 0.9f, C5YC.A00(Bxc) * 0.15f);
                long j2 = this.A01;
                float f = A02 / 2.0f;
                C119815bf c119815bf = C119815bf.A00;
                interfaceC1129057z2.AQe(null, c119815bf, f, 1.0f, 3, j2, A00);
                float EqT = interfaceC1129057z2.EqT(4.0f);
                float EqT2 = interfaceC1129057z2.EqT(6.0f);
                long Bxc2 = interfaceC1129057z2.Bxc();
                long A002 = AbstractC113765Bo.A00((int) ((C5YC.A02(Bxc2) * 0.9f) - f), (int) ((C5YC.A00(Bxc2) * 0.15f) - f));
                C47686L3t c47686L3t = (C47686L3t) this.A03;
                int A01 = (int) (AbstractC25232BEp.A01(c47686L3t.A01) * EqT);
                InterfaceC137546La interfaceC137546La = (InterfaceC137546La) this.A04;
                int i = A01 / 2;
                int i2 = (int) (0.5f * A02);
                long A012 = C119235af.A01(A002, AbstractC113765Bo.A00(((int) (0.25f * A02)) - i, i2 - i));
                long A003 = AbstractC119215ad.A00(A01, A01);
                long j3 = this.A02;
                C5YU c5yu = new C5YU(j3, 5);
                Bitmap bitmap = ((C6LZ) interfaceC137546La).A00;
                interfaceC1129057z2.AQk(c5yu, interfaceC137546La, c119815bf, 1.0f, 3, 1, 0L, AbstractC25236BEt.A08(bitmap), A012, A003);
                int A013 = (int) (EqT * AbstractC25232BEp.A01(c47686L3t.A00));
                int i3 = A013 / 2;
                interfaceC1129057z2.AQk(new C5YU(j3, 5), interfaceC137546La, c119815bf, 1.0f, 3, 1, 0L, AbstractC25236BEt.A08(bitmap), C119235af.A01(A002, AbstractC113765Bo.A00(i2 - i3, ((int) (0.75f * A02)) - i3)), AbstractC119215ad.A00(A013, A013));
                int A014 = (int) (EqT2 * AbstractC25232BEp.A01(c47686L3t.A02));
                int i4 = A014 / 2;
                interfaceC1129057z2.AQk(new C5YU(j3, 5), interfaceC137546La, c119815bf, 1.0f, 3, 1, 0L, AbstractC25236BEt.A08(bitmap), C119235af.A01(A002, AbstractC113765Bo.A00(((int) (0.67f * A02)) - i4, ((int) (A02 * 0.33f)) - i4)), AbstractC119215ad.A00(A014, A014));
                break;
            default:
                C137576Ld c137576Ld = (C137576Ld) obj;
                C14360o3.A0B(c137576Ld, 0);
                return c137576Ld.A00(new C29923DHl(2, this.A01, this.A02, this.A03, this.A04));
        }
        return C0eB.A00;
    }
}
