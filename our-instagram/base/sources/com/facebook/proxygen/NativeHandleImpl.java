package com.facebook.proxygen;

/* loaded from: classes10.dex */
public class NativeHandleImpl implements NativeHandle {
    public long mNativeHandle;

    @Override // com.facebook.proxygen.NativeHandle
    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r7 == 0) goto L6;
     */
    @Override // com.facebook.proxygen.NativeHandle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setNativeHandle(long r7) {
        /*
            r6 = this;
            long r4 = r6.mNativeHandle
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto Ld
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto Le
        Ld:
            r0 = 1
        Le:
            com.facebook.proxygen.utils.Preconditions.checkState(r0)
            r6.mNativeHandle = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.proxygen.NativeHandleImpl.setNativeHandle(long):void");
    }
}
