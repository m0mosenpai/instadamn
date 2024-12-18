package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.MXi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50645MXi implements InterfaceC58111Ppa {
    public final /* synthetic */ C50643MXf A00;

    public C50645MXi(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    @Override // X.InterfaceC58111Ppa
    public final int BxB() {
        View AoS = this.A00.A0U.A00.A1U.A00().AoS();
        if (AoS == null) {
            return 0;
        }
        RectF A0A = AbstractC31174DnI.A0A(AoS);
        return (int) ((AbstractC13880nE.A09(AbstractC166997dE.A0L(AoS)) - A0A.bottom) + (A0A.height() / 2.0f));
    }

    @Override // X.InterfaceC58111Ppa
    public final boolean D9h() {
        InterfaceC58267PsB interfaceC58267PsB;
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H && (interfaceC58267PsB = c50643MXf.A0B) != null) {
            c50643MXf.A0U.A00.A1d(C50643MXf.A00(c50643MXf, C50643MXf.A01(c50643MXf, interfaceC58267PsB)), false);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58111Ppa
    public final boolean Dvo() {
        InterfaceC58267PsB interfaceC58267PsB;
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H && (interfaceC58267PsB = c50643MXf.A0B) != null) {
            c50643MXf.A05 = C50643MXf.A00(c50643MXf, C50643MXf.A01(c50643MXf, interfaceC58267PsB));
            C8RR c8rr = c50643MXf.A0X;
            if (c50643MXf.A0H) {
                C50643MXf.A0A(c50643MXf, true);
                c50643MXf.A0A = c8rr;
                C50643MXf.A0C(c50643MXf, true, true);
            }
        }
        try {
            AnonymousClass229.A01(c50643MXf.A0Q);
            c50643MXf.A0D.A03(c50643MXf.A05);
            return true;
        } catch (Exception e) {
            AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "invalid logging call, assign to @haydenchristensen", e);
            return true;
        }
    }
}
