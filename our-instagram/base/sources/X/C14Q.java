package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.14Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14Q extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;

    public C14Q(Context context, C211211o c211211o) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "HeroServiceControllerInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C211211o c211211o = this.A01;
        AbstractC12990ll A08 = ((AnonymousClass122) c211211o.A00()).A08();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, A08, 36331098292110496L)) {
            AbstractC12990ll A082 = ((AnonymousClass122) c211211o.A00()).A08();
            AbstractC12990ll abstractC12990ll = null;
            if (A082 instanceof UserSession) {
                abstractC12990ll = A082;
            }
            if (C18U.A06(c06090Tz, abstractC12990ll, 36324007301361422L) && !C50572Uc.A07) {
                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.2Ue
                    {
                        super(166459449, 3, false, true);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C50572Uc.A06.A00(C14Q.this.A00);
                    }
                });
            }
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.2Uf
                {
                    super(337004259, 1, false, true);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    UserSession userSession;
                    AbstractC12990ll A083 = ((AnonymousClass122) C14Q.this.A01.A00()).A08();
                    if ((A083 instanceof UserSession) && (userSession = (UserSession) A083) != null) {
                        C41711wL A01 = C41711wL.A01(userSession);
                        C14360o3.A07(A01);
                        C459529d c459529d = A01.A00;
                        if (c459529d != null) {
                            c459529d.A08();
                        }
                    }
                }
            });
        }
    }
}
