package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Vsr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69650Vsr {
    public Runnable A00;
    public final int A01;
    public final Context A02;
    public final Handler A03;
    public final InterfaceC1116050z A04;
    public final UserSession A05;
    public final AnonymousClass503 A06;
    public final List A07;
    public final List A08;

    public final synchronized void A00() {
        List list = this.A08;
        if (list.isEmpty() && this.A07.isEmpty()) {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A03.removeCallbacks(runnable);
            }
            AnonymousClass503 anonymousClass503 = this.A06;
            if (AnonymousClass503.A00(anonymousClass503)) {
                anonymousClass503.A01.flowEndSuccess(anonymousClass503.A00);
            }
            this.A04.AVi(AbstractC111324zv.A00(394));
        } else {
            list.size();
            this.A07.size();
        }
    }

    public C69650Vsr(Context context, InterfaceC1116050z interfaceC1116050z, UserSession userSession, AnonymousClass503 anonymousClass503) {
        AbstractC167017dG.A1T(interfaceC1116050z, anonymousClass503);
        this.A05 = userSession;
        this.A02 = context;
        this.A04 = interfaceC1116050z;
        this.A06 = anonymousClass503;
        this.A08 = AbstractC58322PtE.A0z();
        this.A07 = AbstractC58322PtE.A0z();
        this.A03 = new Handler(C1CG.A00());
        this.A01 = (int) C18U.A01(C06090Tz.A05, userSession, 36606324091786680L);
    }
}
