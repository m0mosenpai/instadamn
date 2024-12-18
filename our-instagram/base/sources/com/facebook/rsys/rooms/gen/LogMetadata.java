package com.facebook.rsys.rooms.gen;

import X.AbstractC25228BEl;
import X.AnonymousClass001;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes8.dex */
public class LogMetadata {
    public final long eventTime;

    public static native LogMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LogMetadata) && this.eventTime == ((LogMetadata) obj).eventTime;
        }
        return true;
    }

    public final int hashCode() {
        return 527 + AbstractC25228BEl.A03(this.eventTime);
    }

    public final String toString() {
        return AnonymousClass001.A0e("LogMetadata{eventTime=", "}", this.eventTime);
    }

    public LogMetadata(long j) {
        this.eventTime = j;
    }
}
