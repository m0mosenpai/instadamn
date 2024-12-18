package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.34J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C34J extends AbstractC64162vb {
    public final Context A00;
    public final UserSession A01;
    public final C30W A02;
    public final InterfaceC60442pS A03;
    public final AbstractC61692rW A04;
    public final C34E A05;

    public C34J(Context context, C1BX c1bx, final UserSession userSession, C30W c30w, InterfaceC60442pS interfaceC60442pS, AbstractC61692rW abstractC61692rW, C34E c34e) {
        super(c1bx, new InterfaceC62702t9() { // from class: X.34K
            @Override // X.InterfaceC62702t9
            public final String BKe(C59062n7 c59062n7) {
                int i;
                C14360o3.A0B(c59062n7, 0);
                UserSession userSession2 = UserSession.this;
                Object obj = c59062n7.A03;
                C14360o3.A06(obj);
                C38321qM c38321qM = (C38321qM) obj;
                String A0F = AbstractC41071vF.A0F(userSession2, c38321qM);
                if (A0F != null) {
                    i = A0F.hashCode();
                } else {
                    i = 0;
                }
                return AnonymousClass001.A0R(Integer.toHexString(i), c38321qM.getId());
            }
        });
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c30w;
        this.A03 = interfaceC60442pS;
        this.A05 = c34e;
        this.A04 = abstractC61692rW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x00e4, code lost:
    
        if (r11 == 2) goto L19;
     */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.0iw, java.lang.Object] */
    @Override // X.AbstractC64162vb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A03(java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34J.A03(java.lang.Object, java.lang.Object):void");
    }
}
