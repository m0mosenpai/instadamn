package X;

import androidx.compose.ui.Modifier;
import com.facebook.tigon.tigonhuc.HucClient;
import java.util.Iterator;

/* renamed from: X.BGb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25263BGb extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ float A04;
    public final /* synthetic */ C5Hc A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25263BGb(C5Hc c5Hc, float f, float f2, float f3, float f4, float f5) {
        super(2);
        this.A00 = f;
        this.A05 = c5Hc;
        this.A04 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A01 = f5;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-306677218, "com.instagram.compose.ui.facepile.FacePile.<anonymous> (FacePile.kt:59)");
            }
            C6ID A01 = AbstractC118255Wn.A01(-this.A00);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A03;
            C5Hc c5Hc = this.A05;
            float f = this.A04;
            float f2 = this.A03;
            float f3 = this.A02;
            float f4 = this.A01;
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(A01, c5Tl, interfaceC118225Wj, 48);
            int i = 0;
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            Iterator A0x = AbstractC25227BEk.A0x(c5Tl, c5Hc, -1285313981);
            while (A0x.hasNext()) {
                Object next = A0x.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C2DC c2dc = (C2DC) next;
                Modifier A0C = AbstractC118185Wd.A0C(AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, i * f), f2);
                C5WI c5wi = C5WF.A00;
                Modifier A013 = C6L2.A01(A0C, c5wi);
                if (i > 0) {
                    A013 = AbstractC119675bQ.A01(A013, new C25264BGc(f4, f3, f));
                }
                C6LQ.A00(c5Tl, null, C6L7.A03(A013, c5wi, 0.5f, C5XL.A00(c5Tl).A0d), null, c2dc, null, null, 0.0f, 48, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                i = i2;
            }
            C117505Tk.A0I(c117505Tk);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(909606610);
            }
        }
        return C0eB.A00;
    }
}
