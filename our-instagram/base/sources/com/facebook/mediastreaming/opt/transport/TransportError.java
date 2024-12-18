package com.facebook.mediastreaming.opt.transport;

import X.AbstractC25234BEr;

/* loaded from: classes9.dex */
public final class TransportError {
    public final String description;
    public final String domain;
    public final int errorCode;
    public final String fullDescription;
    public final boolean isConnectionLost;
    public final boolean isStreamTerminated;
    public final boolean isTransient;
    public final String reason;

    public TransportError(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        AbstractC25234BEr.A0j(2, str, str2, str3, str4);
        this.errorCode = i;
        this.domain = str;
        this.reason = str2;
        this.description = str3;
        this.fullDescription = str4;
        this.isTransient = z;
        this.isConnectionLost = z2;
        this.isStreamTerminated = z3;
    }
}
