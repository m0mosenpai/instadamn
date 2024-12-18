package com.facebook.rsys.filelogging.gen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.C2N9;
import X.C55648OnZ;
import X.JQ0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes9.dex */
public class LogFileStats {
    public static C2N9 CONVERTER = C55648OnZ.A00(32);
    public static long sMcfTypeId;
    public final int droppedLogBytes;
    public final int droppedLogsCount;
    public final int logBytes;
    public final int logsCount;

    public static native LogFileStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFileStats)) {
            return false;
        }
        LogFileStats logFileStats = (LogFileStats) obj;
        return this.logsCount == logFileStats.logsCount && this.logBytes == logFileStats.logBytes && this.droppedLogsCount == logFileStats.droppedLogsCount && this.droppedLogBytes == logFileStats.droppedLogBytes;
    }

    public int hashCode() {
        return ((((JQ0.A01(this.logsCount) + this.logBytes) * 31) + this.droppedLogsCount) * 31) + this.droppedLogBytes;
    }

    public LogFileStats(int i, int i2, int i3, int i4) {
        this.logsCount = i;
        this.logBytes = i2;
        this.droppedLogsCount = i3;
        this.droppedLogBytes = i4;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LogFileStats{logsCount=");
        A1C.append(this.logsCount);
        A1C.append(",logBytes=");
        A1C.append(this.logBytes);
        A1C.append(",droppedLogsCount=");
        A1C.append(this.droppedLogsCount);
        A1C.append(",droppedLogBytes=");
        A1C.append(this.droppedLogBytes);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
