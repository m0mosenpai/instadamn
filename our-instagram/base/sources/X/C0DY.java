package X;

import android.content.Context;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0DY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0DY extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DY(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.14U
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "PrivacyFlowInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                AbstractC03270Dk.A01(((AnonymousClass122) this.A01.A00()).A08());
                C2Nz.A00 = C2O3.A00();
            }
        };
    }
}
