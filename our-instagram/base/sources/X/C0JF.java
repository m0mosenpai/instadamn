package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;

/* renamed from: X.0JF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0JF extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JF(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.13O
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "FacebookAccountInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                C18720vz c18720vz = AbstractC12960li.A00;
                C226418s A01 = C226218q.A01(c18720vz);
                A01.A0P(A01.A02, "FB_ACCOUNT_INIT_START");
                Context context2 = this.A00;
                CallerContext callerContext = C1L2.A00;
                C14360o3.A0B(context2, 0);
                AbstractC12880la.A04(context2);
                synchronized (C1L4.class) {
                    if (!C1L4.A01.booleanValue()) {
                        C1L4.A00 = context2.getApplicationContext();
                        C1L4.A02 = "124024574287414";
                        C1L4.A01 = true;
                    }
                }
                C226418s A012 = C226218q.A01(c18720vz);
                A012.A0P(A012.A02, "FB_ACCOUNT_INIT_END");
            }
        };
    }
}
