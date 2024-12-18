package X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.OpT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55760OpT implements InterfaceC58261Ps5 {
    @Override // X.InterfaceC58261Ps5
    public final OTF ALE(Context context, InterfaceC57909PmE interfaceC57909PmE) {
        C14360o3.A0B(context, 0);
        C15370ps A1F = AbstractC25225BEi.A1F();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C11T.A02(new PTO(context, interfaceC57909PmE, countDownLatch, A1F));
        countDownLatch.await();
        Object obj = A1F.A00;
        C14360o3.A0A(obj);
        return (OTF) obj;
    }
}
