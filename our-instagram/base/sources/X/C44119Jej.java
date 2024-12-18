package X;

import android.graphics.RectF;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Jej, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44119Jej implements InterfaceC37171GZi {
    public final /* synthetic */ JR2 A00;

    public C44119Jej(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC37171GZi
    public final void D2m(DirectShareTarget directShareTarget, DirectThreadKey directThreadKey, Integer num) {
        Long l;
        if (directShareTarget != null) {
            C35267Fh2 A00 = F3T.A00(this.A00.A0p());
            String A01 = C35267Fh2.A01(directShareTarget);
            if (A01 != null) {
                String A08 = directShareTarget.A08();
                if (num != null) {
                    l = AbstractC25229BEm.A0n(num);
                } else {
                    l = null;
                }
                C35267Fh2.A07(A00, l, A08, A01, "inbox", C35267Fh2.A03(A00, directShareTarget));
            }
        }
    }

    @Override // X.InterfaceC37171GZi
    public final void E2R(DirectShareTarget directShareTarget, C3o9 c3o9) {
        JR2.A0A(null, C22P.A2K, this.A00, directShareTarget, c3o9);
    }

    @Override // X.InterfaceC37171GZi
    public final void EH7(RectF rectF, DirectThreadKey directThreadKey) {
        JR2 jr2 = this.A00;
        if (directThreadKey != null) {
            InterfaceC09390do interfaceC09390do = jr2.A1v;
            ((C43945Jbu) interfaceC09390do.getValue()).A00(rectF, directThreadKey, true);
            C2DS A0w = jr2.A0w();
            String str = ((C43945Jbu) interfaceC09390do.getValue()).A01;
            if (str != null) {
                List CGt = A0w.CGt(directThreadKey, str);
                if (CGt == null || CGt.size() <= 100) {
                    C43945Jbu c43945Jbu = (C43945Jbu) interfaceC09390do.getValue();
                    c43945Jbu.A01 = null;
                    c43945Jbu.A00 = null;
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
