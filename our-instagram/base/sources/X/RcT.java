package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class RcT extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C19T A01;
    public final /* synthetic */ C07270a1 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcT(Context context, C19T c19t, C07270a1 c07270a1) {
        super(215, 4, false, true);
        this.A02 = c07270a1;
        this.A01 = c19t;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11820jg c11820jg = C11830jh.A04;
        C07270a1 c07270a1 = this.A02;
        String A02 = c11820jg.A01(c07270a1).A02(this.A01);
        if (A02 != null) {
            S51.A00(this.A00, c07270a1, A02);
            return;
        }
        Context context = this.A00;
        C64457TEt c64457TEt = C64457TEt.A00;
        String A01 = C1Q9.A01();
        C14360o3.A0B(c64457TEt, 2);
        C19240x6 c19240x6 = new C19240x6(context, c64457TEt, A01, 604800L);
        c19240x6.A02(new C64111SzS(context, c19240x6, c07270a1), c07270a1);
    }
}
