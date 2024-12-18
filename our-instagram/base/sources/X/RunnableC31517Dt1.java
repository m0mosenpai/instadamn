package X;

import android.view.View;

/* renamed from: X.Dt1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC31517Dt1 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C31359DqO A01;

    public RunnableC31517Dt1(View view, C31359DqO c31359DqO) {
        this.A01 = c31359DqO;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C31359DqO c31359DqO = this.A01;
        EnumC31378Dqi enumC31378Dqi = EnumC31378Dqi.A02;
        c31359DqO.A01.put(enumC31378Dqi, AbstractC25225BEi.A16(this.A00));
        c31359DqO.A02.get(enumC31378Dqi);
    }
}
