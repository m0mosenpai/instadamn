package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.W4a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70104W4a {
    public AbstractC12990ll A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public String A04;
    public String A05;
    public Handler A06;

    public static Long A01(String str) {
        Long l = null;
        if (str != null) {
            try {
                l = Long.valueOf(Long.parseLong(str));
                return l;
            } catch (NumberFormatException e) {
                C0w9.A07(AbstractC111324zv.A00(2846), e);
            }
        }
        return l;
    }

    public static C70104W4a A00(AbstractC12990ll abstractC12990ll) {
        return (C70104W4a) abstractC12990ll.A01(C70104W4a.class, new C71678WyW(abstractC12990ll, 0));
    }

    public final void A02(final C38321qM c38321qM, final String str) {
        Handler handler = this.A06;
        if (handler == null) {
            handler = AbstractC167007dF.A0J();
            this.A06 = handler;
        }
        handler.post(new Runnable() { // from class: X.Ww6
            @Override // java.lang.Runnable
            public final void run() {
                C70104W4a c70104W4a = C70104W4a.this;
                String str2 = str;
                C38321qM c38321qM2 = c38321qM;
                c70104W4a.A04 = str2;
                UserSession userSession = (UserSession) c70104W4a.A00;
                if (c38321qM2.A2E(userSession) != null) {
                    String id = c38321qM2.getId();
                    if (id != null) {
                        c70104W4a.A03 = C70104W4a.A01(id.split("_")[0]);
                    }
                    User A2E = c38321qM2.A2E(userSession);
                    A2E.getClass();
                    String id2 = A2E.getId();
                    String A07 = AbstractC41071vF.A07(userSession, c38321qM2);
                    c70104W4a.A01 = C70104W4a.A01(id2);
                    c70104W4a.A02 = C70104W4a.A01(A07);
                }
            }
        });
    }
}
