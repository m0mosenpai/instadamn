package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.Iterator;

/* renamed from: X.Wmk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71029Wmk implements XBJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71029Wmk(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A01 = obj;
    }

    @Override // X.XBJ
    public final void EKb() {
        int i = this.A00;
        boolean z = ((Tx0) this.A03).A0F;
        if (i != 0) {
            if (z) {
                Object obj = this.A02;
                U0K u0k = U0K.A06;
                UserSession userSession = ((C66152U1t) this.A04).A01;
                if (obj == u0k) {
                    VWR.A00(userSession).A03((C69794Vvd) this.A01);
                } else {
                    U0z A00 = U0w.A00(userSession);
                    A00.A00.A04(this.A01);
                }
            }
            java.util.Set<XBH> set = ((C66152U1t) this.A04).A07;
            C69794Vvd c69794Vvd = (C69794Vvd) this.A01;
            for (XBH xbh : set) {
                String A05 = c69794Vvd.A00().A05();
                C14360o3.A07(A05);
                xbh.CMr(A05);
            }
            return;
        }
        if (z) {
            Object obj2 = this.A02;
            U0K u0k2 = U0K.A06;
            UserSession userSession2 = ((C66152U1t) this.A04).A01;
            if (obj2 == u0k2) {
                VWR.A00(userSession2).A01((Hashtag) this.A01);
            } else {
                AbstractC66131U0x.A00(userSession2).A00((Hashtag) this.A01);
            }
        }
        java.util.Set set2 = ((C66152U1t) this.A04).A04;
        Hashtag hashtag = (Hashtag) this.A01;
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            ((XBF) it.next()).CMX(String.valueOf(hashtag.getId()));
        }
    }
}
