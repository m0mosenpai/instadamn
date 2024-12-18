package com.instagram.direct.stella;

import X.AbstractC07490aO;
import X.AbstractC119915bp;
import X.AbstractC53966Ntd;
import X.C022308u;
import X.C023409i;
import X.C08600cO;
import X.C08610cP;
import X.C09Y;
import X.C41451vu;
import X.C56034Ou6;
import X.InterfaceC41501vz;
import X.N0V;
import X.N0Y;
import X.Q8F;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;

/* loaded from: classes9.dex */
public final class StellaDirectMessagingService extends N0V {
    public ISendDirectMessageCallback A00;
    public final C08610cP A01;
    public final InterfaceC41501vz A02;
    public final StellaDirectMessagingService$binder$1 A03;

    @Override // X.Q8F
    public final void A01() {
        C41451vu.A01.A02(this.A02, C022308u.class);
    }

    @Override // X.Q8F
    public final void A02() {
        C41451vu.A01.A03(this.A02, C022308u.class);
        C09Y c09y = C023409i.A0A;
        if (c09y.A05(this) instanceof UserSession) {
            AbstractC119915bp.A00(AbstractC53966Ntd.A00(c09y.A08(this)).A00).A00();
        }
    }

    public StellaDirectMessagingService() {
        C08600cO c08600cO = new C08600cO();
        c08600cO.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        this.A01 = c08600cO.A00();
        this.A02 = C56034Ou6.A00(this, 4);
        this.A03 = new StellaDirectMessagingService$binder$1(this);
        final N0Y n0y = new N0Y();
        final AbstractC07490aO abstractC07490aO = ((Q8F) this).A00;
        ((Q8F) this).A00 = new AbstractC07490aO(abstractC07490aO, n0y) { // from class: X.0QH
            public final AbstractC07490aO A00;
            public final AbstractC07490aO A01;

            @Override // X.AbstractC07490aO
            public final boolean A00(Context context, Intent intent, InterfaceC08100bW interfaceC08100bW, Object obj) {
                if (this.A00.A00(context, intent, interfaceC08100bW, obj) && this.A01.A00(context, intent, interfaceC08100bW, obj)) {
                    return true;
                }
                return false;
            }

            {
                this.A00 = abstractC07490aO;
                this.A01 = n0y;
            }
        };
    }

    @Override // X.Q8F
    public final IBinder A00(Intent intent) {
        return this.A03;
    }
}
