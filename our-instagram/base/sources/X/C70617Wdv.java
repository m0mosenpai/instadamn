package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wdv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70617Wdv implements C97X {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70617Wdv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C97X
    public final void onError(Throwable th) {
        if (this.A00 != 0) {
            C32287EJz.A02((android.net.Uri) ((C15370ps) this.A01).A00, (C32287EJz) this.A02);
        }
    }

    @Override // X.C97X
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A00;
        if (this.A00 != 0) {
            W2M w2m = (W2M) obj;
            C14360o3.A0B(w2m, 0);
            String str = w2m.A01;
            if (str != null && !AbstractC001900j.A0T(str)) {
                ((C15370ps) this.A01).A00 = AbstractC08820cl.A03(str);
            }
            C32287EJz.A02((android.net.Uri) ((C15370ps) this.A01).A00, (C32287EJz) this.A02);
            return;
        }
        C208059Im c208059Im = ((C69093Vhj) obj).A01;
        if (c208059Im == null) {
            A00 = null;
        } else {
            A00 = c208059Im.A00(new C9CN(CallerContext.A01(AbstractC111324zv.A00(3561)), AbstractC111324zv.A00(2487), AbstractC111324zv.A00(165), VG4.A1F.toString(), "promotion_list"), ((C31250DoY) this.A01).A0A);
        }
        C31250DoY c31250DoY = (C31250DoY) this.A01;
        String A09 = ((C5HW) this.A02).A09("media_id");
        UserSession userSession = c31250DoY.A0A;
        W6I A002 = VRC.A00(userSession);
        String obj2 = VG4.A1F.toString();
        String A003 = AbstractC111324zv.A00(165);
        A002.A05(A003, obj2, A09);
        W6f.A01(c31250DoY.A05, new C70622We0(c31250DoY, A09, A00), userSession, A003);
    }
}
