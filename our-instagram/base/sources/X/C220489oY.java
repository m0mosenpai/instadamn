package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9oY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220489oY extends C33H {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C220489oY(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A01 = obj;
        this.A02 = z2;
    }

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        if (1 - this.A00 != 0) {
            return super.Dtk(c5sw);
        }
        C14360o3.A0B(c5sw, 0);
        c5sw.A08(true);
        return true;
    }

    @Override // X.C33H, X.C33I
    public final void Dto(C5SW c5sw) {
        if (1 - this.A00 != 0) {
            super.Dto(c5sw);
        } else {
            ((C65867TvU) this.A01).A0E = null;
        }
    }

    @Override // X.C33H, X.C33I
    public final void Dtt(C5SW c5sw) {
        InterfaceC19610xo ARD;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        boolean z;
        int i2;
        if (this.A00 != 0) {
            if (this.A02) {
                z = true;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((C65867TvU) this.A01).A0R));
                i2 = 2328;
            } else {
                if (!this.A03) {
                    return;
                }
                z = true;
                ARD = AbstractC166987dD.A0w(AbstractC23021Ah.A00(((C65867TvU) this.A01).A0R));
                i2 = 2329;
            }
            ARD.E77(AbstractC111324zv.A00(i2), z);
        } else {
            if (this.A03) {
                UserSession userSession = ((C202848y2) this.A01).A03;
                boolean z2 = this.A02;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (z2) {
                    interfaceC16530ry = A00.A5M;
                    c0yrArr = C23031Ai.A8c;
                    i = 57;
                } else {
                    interfaceC16530ry = A00.A5N;
                    c0yrArr = C23031Ai.A8c;
                    i = 58;
                }
                AbstractC167007dF.A1L(A00, interfaceC16530ry, c0yrArr, i, true);
                return;
            }
            InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
            ARD = interfaceC19630xq.ARD();
            ARD.E7D("text_emphasis_button_tooltip_impressions", interfaceC19630xq.getInt("text_emphasis_button_tooltip_impressions", 0) + 1);
        }
        ARD.apply();
    }
}
