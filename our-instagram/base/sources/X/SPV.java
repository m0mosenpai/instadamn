package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes10.dex */
public abstract class SPV {
    public final int A00;

    public SPV(int i) {
        this.A00 = i;
    }

    public final void A00(Status status) {
        if (this instanceof RH0) {
            try {
                ((RH0) this).A00.A0A(status);
                return;
            } catch (IllegalStateException e) {
                android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
                return;
            }
        }
        if (this instanceof C60670RGy) {
            ((C60670RGy) this).A01.A02(S2O.A00(status));
        } else {
            ((AbstractC60669RGx) this).A00.A02(new Rk3(status));
        }
    }

    public final void A01(AnonymousClass643 anonymousClass643, boolean z) {
        if (this instanceof C60670RGy) {
            C58411Pup c58411Pup = ((C60670RGy) this).A01;
            anonymousClass643.A01.put(c58411Pup, Boolean.valueOf(z));
            c58411Pup.A00.A03(new C64267T6r(anonymousClass643, c58411Pup));
            return;
        }
        if (!(this instanceof RH0)) {
            return;
        }
        AbstractC60658RGk abstractC60658RGk = ((RH0) this).A00;
        anonymousClass643.A00.put(abstractC60658RGk, Boolean.valueOf(z));
        abstractC60658RGk.A02(new T54(abstractC60658RGk, anonymousClass643));
    }

    public final void A02(C69C c69c) {
        C58411Pup c58411Pup;
        if (this instanceof C60670RGy) {
            C60670RGy c60670RGy = (C60670RGy) this;
            try {
                SWk sWk = c60670RGy.A00;
                sWk.A03.A01.accept(c69c.A04, c60670RGy.A01);
                return;
            } catch (DeadObjectException e) {
                throw e;
            } catch (RemoteException e2) {
                c60670RGy.A00(new Status(19, AnonymousClass001.A0g(AbstractC31173DnH.A0q(e2), ": ", e2.getLocalizedMessage())));
                return;
            } catch (RuntimeException e3) {
                e = e3;
                c58411Pup = c60670RGy.A01;
            }
        } else {
            if (this instanceof RH0) {
                RH0 rh0 = (RH0) this;
                try {
                    rh0.A00.A09(c69c.A04);
                    return;
                } catch (RuntimeException e4) {
                    rh0.A03(e4);
                    return;
                }
            }
            AbstractC60669RGx abstractC60669RGx = (AbstractC60669RGx) this;
            try {
                if (abstractC60669RGx instanceof C60668RGw) {
                    C60668RGw c60668RGw = (C60668RGw) abstractC60669RGx;
                    SGM sgm = (SGM) c69c.A08.remove(c60668RGw.A00);
                    if (sgm != null) {
                        sgm.A01.A01.A02.accept(c69c.A04, ((AbstractC60669RGx) c60668RGw).A00);
                        SGK sgk = sgm.A00.A00;
                        sgk.A02 = null;
                        sgk.A01 = null;
                        return;
                    }
                    C58411Pup c58411Pup2 = ((AbstractC60669RGx) c60668RGw).A00;
                    c58411Pup2.A00.A0G(AbstractC166997dE.A0a());
                    return;
                }
                C60667RGv c60667RGv = (C60667RGv) abstractC60669RGx;
                SGM sgm2 = c60667RGv.A00;
                SGN sgn = sgm2.A00;
                sgn.A02.A01.accept(c69c.A04, ((AbstractC60669RGx) c60667RGv).A00);
                SNO sno = sgn.A00.A01;
                if (sno != null) {
                    c69c.A08.put(sno, sgm2);
                    return;
                }
                return;
            } catch (DeadObjectException e5) {
                abstractC60669RGx.A00(new Status(19, AnonymousClass001.A0g(AbstractC31173DnH.A0q(e5), ": ", e5.getLocalizedMessage())));
                throw e5;
            } catch (RemoteException e6) {
                abstractC60669RGx.A00(new Status(19, AnonymousClass001.A0g(AbstractC31173DnH.A0q(e6), ": ", e6.getLocalizedMessage())));
                return;
            } catch (RuntimeException e7) {
                e = e7;
                c58411Pup = abstractC60669RGx.A00;
            }
        }
        c58411Pup.A02(e);
    }

    public final void A03(Exception exc) {
        C58411Pup c58411Pup;
        if (this instanceof RH0) {
            RH0 rh0 = (RH0) this;
            try {
                rh0.A00.A0A(new Status(10, AnonymousClass001.A0g(AbstractC31173DnH.A0q(exc), ": ", exc.getLocalizedMessage())));
                return;
            } catch (IllegalStateException e) {
                android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
                return;
            }
        }
        if (this instanceof C60670RGy) {
            c58411Pup = ((C60670RGy) this).A01;
        } else {
            c58411Pup = ((AbstractC60669RGx) this).A00;
        }
        c58411Pup.A02(exc);
    }
}
