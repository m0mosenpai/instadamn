package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3dT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77433dT {
    public final UserSession A00;
    public final Context A01;

    public C77433dT(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A00 = userSession;
    }

    public final void A00(final InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC18280vF abstractC18280vF = new AbstractC18280vF() { // from class: X.3dU
            public final AtomicBoolean A00;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("fetchExploreGridQuickPromotion", 1103551465);
                this.A00 = new AtomicBoolean(false);
            }

            @Override // X.AbstractC18280vF
            public final void loggedRun() {
                if (this.A00.compareAndSet(false, true)) {
                    C77433dT c77433dT = C77433dT.this;
                    InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
                    C93U.A00(c77433dT.A00);
                    if (interfaceC16820sZ2 != null) {
                        interfaceC16820sZ2.invoke();
                    }
                }
            }
        };
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36327516289645193L)) {
            AbstractC24641Ih.A02.EpA(abstractC18280vF);
        } else if (C18U.A06(c06090Tz, userSession, 36327516289579656L)) {
            AbstractC24641Ih.A02.EpA(abstractC18280vF);
            return;
        }
        AbstractC24641Ih.A02.Ep8(abstractC18280vF);
    }
}
