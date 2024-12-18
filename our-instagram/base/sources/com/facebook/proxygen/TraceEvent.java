package com.facebook.proxygen;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC31172DnG;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public class TraceEvent extends NativeHandleImpl {
    public final long mEnd;
    public final int mID;
    public final String mName;
    public final int mParentID;
    public final long mStart;

    public native void close();

    public native Map getMetaData();

    public long getEnd() {
        return this.mEnd;
    }

    public int getId() {
        return this.mID;
    }

    public String getName() {
        return this.mName;
    }

    public int getParentID() {
        return this.mParentID;
    }

    public long getStart() {
        return this.mStart;
    }

    public String toPrettyJson() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("{\n  \"name\":\"");
        A1C.append(this.mName);
        A1C.append("\",\n  \"id\":");
        A1C.append(this.mID);
        A1C.append(",\n  \"parentID\":");
        A1C.append(this.mParentID);
        A1C.append(",\n  \"start\":");
        A1C.append(this.mStart);
        A1C.append(",\n  \"end\":");
        A1C.append(this.mEnd);
        stringBuffer.append(AbstractC166997dE.A0x(",\n  \"metaData\":{\n", A1C));
        Iterator A15 = AbstractC166997dE.A15(getMetaData());
        boolean z = true;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (!z) {
                stringBuffer.append(",\n");
            }
            stringBuffer.append(AnonymousClass001.A0g("    \"", AbstractC31172DnG.A17(A1K), "\":\""));
            int length = AbstractC58318PtA.A0p(A1K).length();
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            String A0p = AbstractC58318PtA.A0p(A1K);
            if (length > 100) {
                A1C2.append(A0p.substring(0, 97));
                str = "...\"";
            } else {
                A1C2.append(A0p);
                str = "\"";
            }
            stringBuffer.append(AbstractC166997dE.A0x(str, A1C2));
            z = false;
        }
        stringBuffer.append("\n  }\n}");
        return stringBuffer.toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TraceEvent(name='");
        A1C.append(this.mName);
        A1C.append("', id='");
        A1C.append(this.mID);
        A1C.append("', parentID='");
        A1C.append(this.mParentID);
        A1C.append("', start='");
        A1C.append(this.mStart);
        A1C.append("', end='");
        A1C.append(this.mEnd);
        stringBuffer.append(AbstractC166997dE.A0x("', metaData='{", A1C));
        Iterator A15 = AbstractC166997dE.A15(getMetaData());
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            stringBuffer.append(AnonymousClass001.A0u(AbstractC31172DnG.A17(A1K), ": ", AbstractC58318PtA.A0p(A1K), ", "));
        }
        stringBuffer.append("}')");
        return stringBuffer.toString();
    }

    public TraceEvent(String str) {
        this.mName = str;
        this.mID = 0;
        this.mParentID = 0;
        this.mStart = 0L;
        this.mEnd = 0L;
    }

    public void finalize() {
        close();
    }

    public TraceEvent(String str, int i, int i2, long j, long j2) {
        this.mName = str;
        this.mID = i;
        this.mParentID = i2;
        this.mStart = j;
        this.mEnd = j2;
    }
}
