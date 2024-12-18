package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AG0 {
    public final String A00 = AbstractC166997dE.A0o();

    public static final C214129eC A00(C23432Aa5 c23432Aa5, boolean z) {
        Object A16;
        InterfaceC178067vf Aq0 = c23432Aa5.A00.Aq0(InterfaceC180087yy.A00);
        C14360o3.A07(Aq0);
        List Bmt = ((InterfaceC180087yy) Aq0).Bmt();
        C14360o3.A07(Bmt);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : Bmt) {
            if (obj instanceof C214129eC) {
                A1E.add(obj);
            }
        }
        if (A1E.isEmpty()) {
            return null;
        }
        if (A1E.size() != 1 && !z) {
            A16 = A1E.get(1);
        } else {
            A16 = AbstractC166987dD.A16(A1E);
        }
        C14360o3.A0C(A16, "null cannot be cast to non-null type com.facebook.videocodec.effects.renderers.touchuprenderer.iglu.IgluColorFilterRenderer");
        return (C214129eC) A16;
    }
}
