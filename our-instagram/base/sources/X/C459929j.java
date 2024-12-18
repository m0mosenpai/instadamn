package X;

import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;

/* renamed from: X.29j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C459929j extends AbstractC460029k {
    public final ServiceEventCallbackImpl A00;

    @Override // X.AbstractC460029k
    public final void A00(int i, Integer num) {
        this.A00.callback(new C53302cE(null, C05F.A0j, null, null, i, RealtimeSinceBootClock.A00.now()));
    }

    @Override // X.AbstractC460029k
    public final void A01(int i, Integer num) {
        this.A00.callback(new C53302cE(null, C05F.A0Y, null, null, i, RealtimeSinceBootClock.A00.now()));
    }

    @Override // X.AbstractC460029k
    public final void A02(int i, Integer num) {
        Integer num2;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A00;
        long now = RealtimeSinceBootClock.A00.now();
        Integer num3 = C05F.A0N;
        if (num.intValue() != 1) {
            num2 = C05F.A00;
        } else {
            num2 = C05F.A01;
        }
        serviceEventCallbackImpl.callback(new C53302cE(null, num3, num2, null, i, now));
    }

    @Override // X.AbstractC460029k
    public final void A03(C2VT c2vt, int i) {
        Integer num;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A00;
        long j = c2vt.A00;
        String str = c2vt.A02;
        Integer num2 = C05F.A00;
        if (c2vt.A01.intValue() != 1) {
            num = num2;
        } else {
            num = C05F.A01;
        }
        serviceEventCallbackImpl.callback(new C53302cE(Boolean.valueOf(c2vt.A03), num2, num, str, i, j));
        serviceEventCallbackImpl.callback(new C53302cE(null, C05F.A01, null, null, i, RealtimeSinceBootClock.A00.now()));
    }

    @Override // X.AbstractC460029k
    public final void A04(Integer num, String str, int i, boolean z) {
        Integer num2;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A00;
        long now = RealtimeSinceBootClock.A00.now();
        Integer num3 = C05F.A0C;
        if (num.intValue() != 1) {
            num2 = C05F.A00;
        } else {
            num2 = C05F.A01;
        }
        serviceEventCallbackImpl.callback(new C53302cE(Boolean.valueOf(z), num3, num2, str, i, now));
    }

    public C459929j(ServiceEventCallbackImpl serviceEventCallbackImpl) {
        this.A00 = serviceEventCallbackImpl;
    }
}
