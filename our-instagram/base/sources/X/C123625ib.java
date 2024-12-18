package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.5ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123625ib {
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final HashMap A00 = new HashMap();

    public static final void A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        C5LV c5lv = C5LV.A00;
        if (c5lv.A05(userSession, c38321qM, interfaceC60442pS) && c5lv.A03(userSession, c38321qM, interfaceC60442pS) && !c75113Zb.A1i) {
            c75113Zb.A1i = true;
            C75113Zb.A00(c75113Zb, 76);
        }
    }

    public final void A01(C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 0);
        int hashCode = c75113Zb.hashCode();
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
    }

    public final void A02(C75113Zb c75113Zb, long j) {
        C14360o3.A0B(c75113Zb, 0);
        A01(c75113Zb);
        RunnableC29582D1j runnableC29582D1j = new RunnableC29582D1j(this, c75113Zb);
        this.A00.put(Integer.valueOf(c75113Zb.hashCode()), runnableC29582D1j);
        this.A01.postDelayed(runnableC29582D1j, j);
    }
}
