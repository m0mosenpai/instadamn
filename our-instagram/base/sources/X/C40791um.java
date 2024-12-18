package X;

/* renamed from: X.1um, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40791um implements InterfaceC40801un {
    public int mStatusCode = -1;
    public long mResponseTimestamp = -1;
    public long mServerElapsedTime = -1;
    public int mResponseId = -1;
    public boolean mFromDiskCache = false;

    public int getResponseId() {
        return this.mResponseId;
    }

    @Override // X.InterfaceC40801un
    public long getResponseTimestamp() {
        return this.mResponseTimestamp;
    }

    public long getServerElapsedTime() {
        return this.mServerElapsedTime;
    }

    @Override // X.InterfaceC40801un
    public int getStatusCode() {
        return this.mStatusCode;
    }

    public boolean isFromDiskCache() {
        return this.mFromDiskCache;
    }

    @Override // X.InterfaceC40801un
    public boolean isOk() {
        int i = this.mStatusCode;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC40801un
    public void setFromDiskCache(boolean z) {
        this.mFromDiskCache = z;
    }

    @Override // X.InterfaceC40801un
    public void setResponseId(int i) {
        this.mResponseId = i;
    }

    @Override // X.InterfaceC40801un
    public void setResponseTimestamp(long j) {
        this.mResponseTimestamp = j;
    }

    @Override // X.InterfaceC40801un
    public void setServerElapsedTime(long j) {
        this.mServerElapsedTime = j;
    }

    @Override // X.InterfaceC40801un
    public void setStatusCode(int i) {
        this.mStatusCode = i;
    }
}
