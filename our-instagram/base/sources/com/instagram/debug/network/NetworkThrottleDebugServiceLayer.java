package com.instagram.debug.network;

import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C14360o3;
import X.C19Q;
import X.C1G4;
import X.C1QW;
import X.C1QY;
import X.C26511Qg;
import X.InterfaceC27191Tt;
import X.MSX;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.nio.ByteBuffer;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class NetworkThrottleDebugServiceLayer implements C1G4 {
    public static final Companion Companion = new Object();
    public static final String TAG = "IgNetworkDebugDevTools";
    public final C1G4 delegate;
    public final AbstractC12990ll session;

    public NetworkThrottleDebugServiceLayer(AbstractC12990ll abstractC12990ll, C1G4 c1g4) {
        AbstractC167017dG.A1P(abstractC12990ll, c1g4);
        this.session = abstractC12990ll;
        this.delegate = c1g4;
    }

    @Override // X.C1G4
    public InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        AbstractC167027dH.A12(c1qw, c1qy, c26511Qg);
        final long sleepTimePerChunk = new DebugNetworkShapingConfigurationFactory$createNetworkShapingServiceLayerConfiguration$1(this.session).getSleepTimePerChunk();
        if (sleepTimePerChunk > 0) {
            c26511Qg.A01(new C19Q() { // from class: com.instagram.debug.network.NetworkThrottleDebugServiceLayer$startRequest$1
                @Override // X.C19Q, X.C19O
                public void onNewData(C1QW c1qw2, C1QY c1qy2, ByteBuffer byteBuffer) {
                    int A06 = AbstractC167007dF.A06(0, c1qw2, byteBuffer);
                    long remaining = (sleepTimePerChunk * byteBuffer.remaining()) / OdexSchemeArtXdex.STATE_PGO_NEEDED;
                    C14360o3.A07(String.format(Locale.US, "Slowing down network download by %dms: %s", MSX.A1b(Long.valueOf(remaining), c1qw2.A09.toString(), A06)));
                    try {
                        Thread.sleep(remaining);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        InterfaceC27191Tt startRequest = this.delegate.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    /* loaded from: classes9.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
