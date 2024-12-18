package org.webrtc;

import org.webrtc.Logging;

/* loaded from: classes12.dex */
public class JNILogging {
    public final Loggable loggable;

    public void logToInjectable(String str, Integer num, String str2) {
        this.loggable.onLogMessage(str, Logging.Severity.values()[num.intValue()], str2);
    }

    public JNILogging(Loggable loggable) {
        this.loggable = loggable;
    }
}
