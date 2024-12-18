package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.34O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34O extends AbstractC64162vb {
    public final UserSession A00;
    public final C30W A01;
    public final InterfaceC60442pS A02;
    public final C34E A03;

    public C34O(C1BX c1bx, final UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS, C34E c34e) {
        super(c1bx, new InterfaceC62702t9() { // from class: X.34P
            @Override // X.InterfaceC62702t9
            public final String BKe(C59062n7 c59062n7) {
                String id;
                C14360o3.A0B(c59062n7, 0);
                UserSession userSession2 = UserSession.this;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C38321qM c38321qM = (C38321qM) obj;
                String A0F = AbstractC41071vF.A0F(userSession2, c38321qM);
                C38321qM A1e = c38321qM.A1e(((C42C) c59062n7.A04).A00);
                int i = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("carousel_");
                if (A1e == null) {
                    if (A0F != null) {
                        i = A0F.hashCode();
                    }
                    id = Integer.toHexString(i);
                } else {
                    if (A0F != null) {
                        i = A0F.hashCode();
                    }
                    sb.append(Integer.toHexString(i));
                    id = A1e.getId();
                }
                sb.append(id);
                return sb.toString();
            }
        });
        this.A00 = userSession;
        this.A01 = c30w;
        this.A02 = interfaceC60442pS;
        this.A03 = c34e;
    }
}
