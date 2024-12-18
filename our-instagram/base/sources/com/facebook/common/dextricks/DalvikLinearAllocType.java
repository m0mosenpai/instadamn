package com.facebook.common.dextricks;

/* loaded from: classes.dex */
public enum DalvikLinearAllocType {
    FBANDROID_DEBUG(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE),
    FBANDROID_RELEASE(DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE),
    MESSENGER_DEBUG(4194304),
    MESSENGER_RELEASE(4194304),
    SAMPLE_APP(4194304);

    public final int bufferSizeBytes;

    DalvikLinearAllocType(int i) {
        this.bufferSizeBytes = i;
    }
}
