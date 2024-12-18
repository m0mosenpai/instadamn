package X;

import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: X.DfP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30727DfP extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ long A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C6GN A02;
    public final /* synthetic */ C64770TTe A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30727DfP(View view, C6GN c6gn, C64770TTe c64770TTe, List list, long j, boolean z) {
        super(4);
        this.A04 = list;
        this.A02 = c6gn;
        this.A03 = c64770TTe;
        this.A01 = view;
        this.A05 = z;
        this.A00 = j;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        boolean z;
        int A0H = AbstractC166987dD.A0H(obj2);
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A0R(c5Tl, obj);
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A09(c5Tl, A0H);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                AbstractC25225BEi.A1J(-1749508201);
            }
            AbstractC35044FcH abstractC35044FcH = (AbstractC35044FcH) this.A04.get(A0H);
            c5Tl.Eno(399973439);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -956930799);
            Object obj5 = C5UI.A00;
            if (A0q == obj5) {
                A0q = AbstractC25232BEp.A0w(c5Tl, Integer.valueOf(abstractC35044FcH.A00));
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) A0q;
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -956928430);
            if (A0q2 == obj5) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, Integer.valueOf(abstractC35044FcH.A04));
            }
            InterfaceC74953Yl interfaceC74953Yl2 = (InterfaceC74953Yl) A0q2;
            C117505Tk.A0I(A0J);
            boolean A08 = abstractC35044FcH.A08();
            if (A08) {
                i2 = AbstractC25231BEo.A0E(interfaceC74953Yl);
            } else {
                i2 = abstractC35044FcH.A00;
            }
            if (A08) {
                i3 = AbstractC25231BEo.A0E(interfaceC74953Yl2);
            } else {
                i3 = abstractC35044FcH.A04;
            }
            C6GN c6gn = this.A02;
            C64770TTe c64770TTe = this.A03;
            Class<?> cls = abstractC35044FcH.getClass();
            Map map = C0YZ.A03;
            C14360o3.A0B(cls, 1);
            Boolean bool = (Boolean) c64770TTe.get(AbstractC13230m9.A01(cls));
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            AbstractC28495Cho.A05(null, null, c6gn, c5Tl, null, null, C5UA.A01(c5Tl, new C30575Dcw(this.A01, interfaceC74953Yl, interfaceC74953Yl2, c64770TTe, abstractC35044FcH, i2, i3, this.A00, this.A05), 547019068), 1572864, 30, z);
            if (AbstractC25227BEk.A1a(A0J)) {
                C0fH.A00(821704285);
            }
        }
        return C0eB.A00;
    }
}
