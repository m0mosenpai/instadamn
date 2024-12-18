package com.instagram.service.tigon;

import X.AbstractC12990ll;
import X.C09170dP;
import X.C1JO;
import X.InterfaceC16820sZ;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonAuthHandler;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.instagram.service.tigon.IGAuthedTigonService;

/* loaded from: classes.dex */
public final class IGAuthedTigonService extends TigonServiceHolder {
    public final TigonAuthHandler mAuthHandler;

    public static native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, TigonAuthHandler tigonAuthHandler);

    public static IGAuthedTigonService getInstance(final AbstractC12990ll abstractC12990ll) {
        return (IGAuthedTigonService) abstractC12990ll.A01(IGAuthedTigonService.class, new InterfaceC16820sZ() { // from class: X.4Hm
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return IGAuthedTigonService.lambda$getInstance$0(AbstractC12990ll.this);
            }
        });
    }

    static {
        C09170dP.A0C("igtigon-jni");
    }

    public IGAuthedTigonService(TigonServiceHolder tigonServiceHolder, TigonAuthHandler tigonAuthHandler) {
        super(initHybrid(tigonServiceHolder, tigonAuthHandler));
        this.mAuthHandler = tigonAuthHandler;
    }

    public static /* synthetic */ IGAuthedTigonService lambda$getInstance$0(AbstractC12990ll abstractC12990ll) {
        return new IGAuthedTigonService(IGTigonService.getTigonService(abstractC12990ll), new IGTigonAuthHandler(new C1JO(abstractC12990ll), new TigonUnexpectedErrorReporter()));
    }
}
