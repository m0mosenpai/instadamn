package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.OCa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54648OCa {
    public final AbstractC12990ll A00;
    public final Map A01;
    public final C53071Ndk A02;
    public final C53070Ndj A03;

    public C54648OCa(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
        C53071Ndk c53071Ndk = new C53071Ndk(this);
        this.A02 = c53071Ndk;
        C53070Ndj c53070Ndj = new C53070Ndj();
        this.A03 = c53070Ndj;
        List A1Q = AbstractC16960so.A1Q(c53071Ndk, c53070Ndj);
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC50522MSa.A09(A1Q));
        for (Object obj : A1Q) {
            AbstractC25227BEk.A1O(obj, A18, ((AbstractC53636Nnh) obj).A00());
        }
        this.A01 = A18;
    }
}
