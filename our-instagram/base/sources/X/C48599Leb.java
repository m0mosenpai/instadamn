package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Leb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48599Leb implements MOP {
    public String A00 = "";
    public final C13400mQ A01 = JX1.A00(AbstractC167007dF.A0J(), this, 9);
    public final C44421JkH A02;
    public final InterfaceC50442MOw A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.MOP
    public final void Dh9(String str, List list) {
        ?? r2;
        C14360o3.A0B(str, 0);
        if (str.equals(this.A00)) {
            if (list != null) {
                r2 = AbstractC166987dD.A1E();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C148336m3 B1F = ((InterfaceC148316m1) it.next()).B1F();
                    if (B1F != null) {
                        r2.add(B1F);
                    }
                }
            } else {
                r2 = C16930sl.A00;
            }
            this.A03.DjL(str, AbstractC001800i.A0U(r2));
        }
    }

    public C48599Leb(UserSession userSession, InterfaceC50442MOw interfaceC50442MOw) {
        this.A03 = interfaceC50442MOw;
        this.A02 = new C44421JkH(userSession, this);
    }
}
