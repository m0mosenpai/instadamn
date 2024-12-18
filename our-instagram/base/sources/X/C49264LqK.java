package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LqK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49264LqK implements InterfaceC50442MOw {
    public final /* synthetic */ C44497Jm3 A00;

    public C49264LqK(C44497Jm3 c44497Jm3) {
        this.A00 = c44497Jm3;
    }

    @Override // X.InterfaceC50442MOw
    public final void DjL(String str, List list) {
        Object value;
        C26087BgG c26087BgG;
        ArrayList A0U;
        C44497Jm3 c44497Jm3 = this.A00;
        if (str.equals(((C26087BgG) c44497Jm3.A05.getValue()).A03)) {
            C05A c05a = c44497Jm3.A04;
            do {
                value = c05a.getValue();
                c26087BgG = (C26087BgG) value;
                A0U = AbstractC001800i.A0U(list);
                AnonymousClass016.A1A(A0U, new C50355MLh(c44497Jm3, 39));
            } while (!c05a.AIi(value, C26087BgG.A00(C05F.A0C, c26087BgG.A03, (List) c26087BgG.A01, A0U)));
        }
    }
}
