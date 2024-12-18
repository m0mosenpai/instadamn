package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.memorydump.OutOfMemoryExceptionHandler;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0Hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03550Hr extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03550Hr(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.148
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MemoryDumperInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                if ((((AnonymousClass122) this.A01.A00()).A08() instanceof UserSession) && AbstractC14490oL.A0C(this.A00) && C2RR.A03()) {
                    OutOfMemoryExceptionHandler.Companion.init((int) C20150ym.A01(AbstractC20070ye.A00(18577816615584109L)), C20150ym.A07(AbstractC20070ye.A00(18296341638938884L)), (int) C20150ym.A01(AbstractC20070ye.A00(18577816615321961L)));
                }
            }
        };
    }
}
