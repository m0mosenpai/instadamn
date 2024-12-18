package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.0Gb, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Gb extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Gb(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        final boolean A07 = C20150ym.A07(AbstractC20100yh.A00(36326154785076917L));
        return new AbstractC211911v(c211211o, A07) { // from class: X.12G
            public final C211211o A00;
            public final boolean A01;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MsysBootstrapInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                if (this.A01) {
                    AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                    if ((A08 instanceof UserSession) && C08750cd.A04.A02()) {
                        long A01 = C18U.A01(C06090Tz.A05, A08, 36607629761713789L);
                        final C50157MDk c50157MDk = new C50157MDk(A08, 37);
                        boolean z = C11P.A00;
                        Handler handler = new Handler(Looper.getMainLooper());
                        Runnable runnable = new Runnable() { // from class: X.Apv
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                InterfaceC16820sZ.this.invoke();
                            }
                        };
                        if (C11P.A00 && !AbstractC58327PtK.A08()) {
                            AbstractC58327PtK.A05(new B63(A01, handler, runnable, 2));
                        } else {
                            handler.postDelayed(runnable, A01);
                        }
                    }
                }
            }

            {
                this.A00 = c211211o;
                this.A01 = A07;
            }
        };
    }
}
