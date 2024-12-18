package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* loaded from: classes11.dex */
public abstract class WUC implements InterfaceC65636Tpx {
    public void A00(Object obj) {
        if (this instanceof C66540ULv) {
            C66540ULv c66540ULv = (C66540ULv) this;
            c66540ULv.A01.execute(new RunnableC71415Wtd(c66540ULv, obj));
            return;
        }
        C66542ULx c66542ULx = ((C66539ULu) this).A00;
        if (!((AbstractC68892Vdo) c66542ULx).A00) {
            return;
        }
        if (obj != null) {
            AbstractC66543ULy.A04(c66542ULx, obj, "LIVE_LOCATION_STARTED");
        } else {
            LiveLocationSession liveLocationSession = C66542ULx.A00(c66542ULx).A03;
            if (liveLocationSession == null) {
                AbstractC66543ULy.A04(c66542ULx, null, "LIVE_LOCATION_STOPPED");
            } else {
                C66542ULx.A03(c66542ULx, liveLocationSession, false);
            }
        }
        C1LC it = C66542ULx.A00(c66542ULx).A09.iterator();
        while (it.hasNext()) {
            it.next();
            System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC65636Tpx
    public final void onSuccess(Object obj) {
        A00(obj);
    }
}
