package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161727Mh extends AbstractC161677Mc implements InterfaceC161737Mi {
    public final C7ST A00;

    @Override // X.AbstractC161677Mc, X.AbstractC161687Md
    public final void A03(C7VC c7vc) {
        C160787Im c160787Im;
        if (c7vc instanceof C160787Im) {
            c160787Im = (C160787Im) c7vc;
        } else {
            c160787Im = null;
        }
        C7ST c7st = this.A00;
        if (c160787Im != null) {
            c160787Im.A0e.A0L = c7st.A01;
        }
        super.A03(c7vc);
    }

    public InterfaceC66482zP A05(C160787Im c160787Im) {
        Context context;
        UserSession userSession;
        C18A c18a;
        C7IM c7im;
        AnonymousClass988 anonymousClass988;
        C129535tI A05;
        C162777Qo c162777Qo;
        if (this instanceof C159047Bq) {
            C159047Bq c159047Bq = (C159047Bq) this;
            C14360o3.A0B(c160787Im, 0);
            C7BO c7bo = c159047Bq.A01;
            Context context2 = c159047Bq.itemView.getContext();
            C14360o3.A07(context2);
            UserSession userSession2 = c159047Bq.A00;
            C18A c18a2 = c159047Bq.A04;
            return c7bo.AWm(context2, userSession2, c159047Bq.A02, c160787Im, c159047Bq.A03, c18a2, false);
        }
        if (this instanceof AnonymousClass768) {
            AnonymousClass768 anonymousClass768 = (AnonymousClass768) this;
            int intValue = anonymousClass768.A05.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        AnonymousClass769 anonymousClass769 = anonymousClass768.A01;
                        Context context3 = anonymousClass768.itemView.getContext();
                        UserSession userSession3 = anonymousClass768.A00;
                        C18A c18a3 = anonymousClass768.A04;
                        return anonymousClass769.AWm(context3, userSession3, anonymousClass768.A02, c160787Im, anonymousClass768.A03, c18a3, false);
                    }
                    throw new IllegalStateException(AnonymousClass001.A0R("Unknown reel share type ", "SHARE"));
                }
                context = anonymousClass768.itemView.getContext();
                userSession = anonymousClass768.A00;
                c18a = anonymousClass768.A04;
                c7im = anonymousClass768.A03;
                anonymousClass988 = anonymousClass768.A02;
                A05 = C158727Ai.A04(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
                if (A05.A04 instanceof C158807As) {
                    c162777Qo = C7QZ.A04(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
                    C14360o3.A0B(userSession, 0);
                    return new AnonymousClass765(c162777Qo, A05, c160787Im.A0e.A0i());
                }
            } else {
                context = anonymousClass768.itemView.getContext();
                userSession = anonymousClass768.A00;
                c18a = anonymousClass768.A04;
                c7im = anonymousClass768.A03;
                anonymousClass988 = anonymousClass768.A02;
                A05 = C158727Ai.A05(context, userSession, anonymousClass988, c160787Im, c7im, c18a);
            }
            c162777Qo = C7QZ.A05(context, userSession, anonymousClass988, c160787Im, c7im, c18a, false);
            C14360o3.A0B(userSession, 0);
            return new AnonymousClass765(c162777Qo, A05, c160787Im.A0e.A0i());
        }
        if (this instanceof C1579577f) {
            C1579577f c1579577f = (C1579577f) this;
            C1579777h c1579777h = c1579577f.A01;
            Context context4 = c1579577f.itemView.getContext();
            UserSession userSession4 = c1579577f.A00;
            C18A c18a4 = c1579577f.A04;
            return c1579777h.AWm(context4, userSession4, c1579577f.A02, c160787Im, c1579577f.A03, c18a4, false);
        }
        C7D9 c7d9 = (C7D9) this;
        C14360o3.A0B(c160787Im, 0);
        C43703JUo c43703JUo = c7d9.A01;
        Context context5 = c7d9.itemView.getContext();
        C14360o3.A07(context5);
        UserSession userSession5 = c7d9.A00;
        C18A c18a5 = c7d9.A04;
        return c43703JUo.AWm(context5, userSession5, c7d9.A02, c160787Im, c7d9.A03, c18a5, false);
    }

    @Override // X.InterfaceC161737Mi
    public final C7S5 Bkh() {
        return ((InterfaceC161737Mi) ((AbstractC161677Mc) this).A00).Bkh();
    }

    @Override // X.AbstractC161687Md, X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
        Object obj = ((AbstractC161677Mc) this).A00;
        if (obj instanceof InterfaceC161707Mf) {
            ((InterfaceC161707Mf) obj).DBy(f, f2);
        } else {
            super.DBy(f, f2);
        }
    }

    public AbstractC161727Mh(C3OO c3oo, AbstractC66422zJ abstractC66422zJ, C7ZX c7zx) {
        super(c3oo, abstractC66422zJ);
        this.A00 = new C7ST(c3oo.itemView, c7zx);
    }

    @Override // X.AbstractC161677Mc, X.AbstractC161687Md
    public final void A02() {
        C160787Im c160787Im;
        super.A02();
        C7VC c7vc = ((AbstractC161687Md) this).A00;
        if ((c7vc instanceof C160787Im) && (c160787Im = (C160787Im) c7vc) != null) {
            c160787Im.A0e.A0L = null;
        }
    }
}
