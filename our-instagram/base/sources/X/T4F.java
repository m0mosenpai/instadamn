package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class T4F implements C4BL {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public T4F(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    @Override // X.C4BL
    public final List Aw3(String str, boolean z, boolean z2) {
        C4BL c4bl = C4BL.A00;
        c4bl.getClass();
        ArrayList A1F = AbstractC166987dD.A1F(c4bl.Aw3(str, z, z2));
        AbstractC97794aK.A00(str, A1F, this.A00);
        if ("video/av01".equals(str) || this.A01) {
            Collections.sort(A1F, new TSH(this, str));
            AbstractC459729h.A01("MediaCodecSelectorHelper", "%s dec order (sw first) %s", str, A1F);
        }
        return A1F;
    }
}
