package com.instagram.debug.network;

import X.AbstractC167027dH;
import X.C14360o3;
import X.C3JQ;
import X.InterfaceC26491Qe;
import X.MSW;
import X.MSX;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes9.dex */
public final class NetworkShapingRequestCallback implements InterfaceC26491Qe {
    public final NetworkShapingConfiguration configuration;
    public final Random random;
    public boolean simulateFailure;
    public final String tag;
    public int totalData;
    public final String uri;
    public final InterfaceC26491Qe wrappedCallback;

    public NetworkShapingRequestCallback(InterfaceC26491Qe interfaceC26491Qe, NetworkShapingConfiguration networkShapingConfiguration, String str, String str2) {
        AbstractC167027dH.A0a(1, interfaceC26491Qe, networkShapingConfiguration, str, str2);
        this.wrappedCallback = interfaceC26491Qe;
        this.configuration = networkShapingConfiguration;
        this.uri = str;
        this.tag = str2;
        this.random = new Random();
    }

    @Override // X.InterfaceC26491Qe
    public void onFailed(IOException iOException) {
        C14360o3.A0B(iOException, 0);
        this.wrappedCallback.onFailed(iOException);
    }

    @Override // X.InterfaceC26491Qe
    public void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        if (!this.simulateFailure) {
            maybeSimulateFailure();
            if (!this.simulateFailure) {
                long sleepTimePerChunk = (this.configuration.getSleepTimePerChunk() * byteBuffer.remaining()) / OdexSchemeArtXdex.STATE_PGO_NEEDED;
                if (sleepTimePerChunk > 0) {
                    C14360o3.A07(String.format(Locale.US, "Slowing down network download by %dms: %s", MSX.A1b(Long.valueOf(sleepTimePerChunk), this.uri, 2)));
                    try {
                        Thread.sleep(sleepTimePerChunk);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                this.wrappedCallback.onNewData(byteBuffer);
                this.totalData += byteBuffer.remaining();
                maybeSimulateFailure();
            }
        }
    }

    @Override // X.InterfaceC26491Qe
    public void onResponseStarted(C3JQ c3jq) {
        C14360o3.A0B(c3jq, 0);
        this.wrappedCallback.onResponseStarted(c3jq);
    }

    private final void maybeSimulateFailure() {
        NetworkShapingConfiguration networkShapingConfiguration;
        int failNetworkRequestAfterBytesCount;
        int i;
        if (!this.simulateFailure && (failNetworkRequestAfterBytesCount = (networkShapingConfiguration = this.configuration).getFailNetworkRequestAfterBytesCount()) != -1 && (i = this.totalData) >= failNetworkRequestAfterBytesCount && this.random.nextInt(networkShapingConfiguration.getFailNetworkRequestProbability()) < 1) {
            this.simulateFailure = true;
            C14360o3.A07(String.format(Locale.US, "Failing request after %d bytes: %s", MSX.A1b(Integer.valueOf(i), this.uri, 2)));
        }
    }

    @Override // X.InterfaceC26491Qe
    public void onComplete() {
        boolean z = this.simulateFailure;
        InterfaceC26491Qe interfaceC26491Qe = this.wrappedCallback;
        if (z) {
            interfaceC26491Qe.onFailed(MSW.A0y("IG Dev Tools: Simulated Network Failure"));
        } else {
            interfaceC26491Qe.onComplete();
        }
    }
}
