package com.facebook.rsys.filelogging.gen;

import X.AbstractC166987dD;
import X.AbstractC50523MSb;
import X.C2N9;
import X.YAN;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes12.dex */
public class LogFileData {
    public static C2N9 CONVERTER = YAN.A00(52);
    public static long sMcfTypeId;
    public final boolean isStreamValid;
    public final String line;

    public static native LogFileData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFileData)) {
            return false;
        }
        LogFileData logFileData = (LogFileData) obj;
        return this.line.equals(logFileData.line) && this.isStreamValid == logFileData.isStreamValid;
    }

    public int hashCode() {
        return AbstractC50523MSb.A02(this.line) + (this.isStreamValid ? 1 : 0);
    }

    public LogFileData(String str, boolean z) {
        str.getClass();
        this.line = str;
        this.isStreamValid = z;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LogFileData{line=");
        A1C.append(this.line);
        A1C.append(",isStreamValid=");
        return AbstractC50523MSb.A0X(A1C, this.isStreamValid);
    }
}
