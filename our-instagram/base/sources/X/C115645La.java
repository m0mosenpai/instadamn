package X;

import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5La, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115645La {
    public final UserSession A00;
    public final C115655Lb A01;
    public final HashMap A02;
    public final C115665Lc A03;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.5Ld, X.5Lc] */
    public C115645La(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C115655Lb(userSession);
        this.A02 = new HashMap();
        this.A03 = new AbstractC115675Ld(0L, TimeUnit.HOURS.toMillis(24L));
    }

    public final void A00(C75113Zb c75113Zb) {
        int hashCode = c75113Zb.hashCode();
        HashMap hashMap = this.A02;
        Integer valueOf = Integer.valueOf(hashCode);
        CountDownTimer countDownTimer = (CountDownTimer) hashMap.get(valueOf);
        if (countDownTimer != null) {
            countDownTimer.cancel();
            hashMap.remove(valueOf);
        }
    }
}
