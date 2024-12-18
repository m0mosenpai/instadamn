package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3U implements C7FA {
    public final /* synthetic */ C32705EaW A00;
    public final /* synthetic */ C7IR A01;

    @Override // X.C7FA
    public final boolean Ccl(int i) {
        return true;
    }

    @Override // X.C7FA
    public final void DYV(C26086BgF c26086BgF, C211689Zc c211689Zc, C47Z c47z, C183978Ee c183978Ee, Long l, int i, boolean z) {
    }

    @Override // X.C7FA
    public final void Dkg(C26086BgF c26086BgF, Long l, List list) {
    }

    @Override // X.C7FA
    public final void Dzc(C26086BgF c26086BgF, C211689Zc c211689Zc, ClipInfo clipInfo, C47Z c47z, Long l, String str, int i, boolean z) {
    }

    public G3U(C32705EaW c32705EaW, C7IR c7ir) {
        this.A01 = c7ir;
        this.A00 = c32705EaW;
    }

    @Override // X.C7FA
    public final void Dke(MessageIdentifier messageIdentifier, List list) {
        C7IR c7ir = this.A01;
        C32705EaW c32705EaW = this.A00;
        c7ir.A01(c32705EaW.requireContext(), messageIdentifier, list);
        C34700FQl c34700FQl = c32705EaW.A00;
        if (c34700FQl == null) {
            C14360o3.A0F("sharedStacksLogger");
            throw C00O.createAndThrow();
        }
        c34700FQl.A01("stack_grid_view");
    }
}
