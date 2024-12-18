package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.lang.ref.SoftReference;

/* renamed from: X.1CJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CJ {
    public SoftReference A00;
    public boolean A01;
    public C1NJ A02;
    public final Context A03;
    public final UserSession A04;

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ps, java.lang.Object] */
    public static final boolean A00(final ImageUrl imageUrl, final C1CJ c1cj, final String str, final String str2, final boolean z) {
        final ?? obj = new Object();
        final ?? obj2 = new Object();
        if (z) {
            C226418s A01 = C226218q.A01(AbstractC12960li.A00);
            A01.A0P(A01.A02, "FIRST_MEDIA_LOAD_START");
            C1NJ c1nj = new C1NJ() { // from class: X.3WG
                @Override // X.C1NJ
                public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
                    C14360o3.A0B(c73033Pe, 1);
                    C1CJ c1cj2 = C1CJ.this;
                    if (!c1cj2.A01) {
                        c1cj2.A00 = new SoftReference(c73033Pe.A01);
                    }
                    C226418s A012 = C226218q.A01(AbstractC12960li.A00);
                    A012.A0P(A012.A02, "FIRST_MEDIA_LOAD_END");
                }

                @Override // X.C1NJ
                public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
                }

                @Override // X.C1NJ
                public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
                }
            };
            c1cj.A02 = c1nj;
            obj2.A00 = c1nj;
        }
        C14M.A05(new C14M());
        C25821No.A07(new C3WI() { // from class: X.3WH
            @Override // X.C3WI
            public final void DLK(C25821No c25821No) {
                C14360o3.A0B(c25821No, 0);
                C1OG A0J = c25821No.A0J(ImageUrl.this, str);
                A0J.A0I = false;
                A0J.A0H = z;
                A0J.A02((C1NJ) obj2.A00);
                A0J.A09 = str2;
                A0J.A01();
                obj.A00 = true;
            }
        });
        return obj.A00;
    }

    public C1CJ(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }

    public static final boolean A01(C38321qM c38321qM, C1CJ c1cj, String str, int i) {
        C75363a3 CFR = c38321qM.CFR();
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        UserSession userSession = c1cj.A04;
        C4AH A00 = C4AG.A00(userSession);
        Context context = c1cj.A03;
        A00.A00(context);
        C4VX c4vx = new C4VX(context, userSession, CFR, str);
        c4vx.A02 = true;
        c4vx.A03 = z;
        C4VZ.A00(c4vx.A00());
        return true;
    }

    public final boolean A02(C38321qM c38321qM, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C38321qM A1e;
        if (c38321qM.A5M() && (A1e = c38321qM.A1e(c38321qM.A0x())) != null) {
            c38321qM = A1e;
        }
        Context context = this.A03;
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (A1q != null) {
            z4 = A00(A1q, this, "feed_timeline", c38321qM.A0C.getPreview(), z);
        } else {
            z4 = false;
        }
        if (c38321qM.Cff()) {
            C75363a3 CFR = c38321qM.CFR();
            UserSession userSession = this.A04;
            C4AH A00 = C4AG.A00(userSession);
            A00.A00(context);
            boolean z5 = false;
            if (z2) {
                A00.A01(new C4AD(CFR, "feed_timeline"));
                z5 = true;
            }
            if (z3) {
                C4VX c4vx = new C4VX(context, userSession, CFR, "feed_timeline");
                c4vx.A02 = true;
                c4vx.A03 = z;
                C4VZ.A00(c4vx.A00());
                return true;
            }
            return z5;
        }
        return z4;
    }
}
