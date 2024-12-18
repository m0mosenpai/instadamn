package org.webrtc;

import X.AbstractC166987dD;

/* loaded from: classes7.dex */
public class TurnCustomizer {
    public long nativeTurnCustomizer;

    public static native void nativeFreeTurnCustomizer(long j);

    private void checkTurnCustomizerExists() {
        if (this.nativeTurnCustomizer != 0) {
        } else {
            throw AbstractC166987dD.A14("TurnCustomizer has been disposed.");
        }
    }

    public TurnCustomizer(long j) {
        this.nativeTurnCustomizer = j;
    }

    public void dispose() {
        checkTurnCustomizerExists();
        nativeFreeTurnCustomizer(this.nativeTurnCustomizer);
        this.nativeTurnCustomizer = 0L;
    }

    public long getNativeTurnCustomizer() {
        checkTurnCustomizerExists();
        return this.nativeTurnCustomizer;
    }
}
