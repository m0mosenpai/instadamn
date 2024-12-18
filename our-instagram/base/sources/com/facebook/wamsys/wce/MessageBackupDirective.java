package com.facebook.wamsys.wce;

import X.C09170dP;
import com.facebook.simplejni.NativeHolder;
import java.util.List;

/* loaded from: classes8.dex */
public class MessageBackupDirective {
    public static final MessageBackupDirective $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Number getActionTypeNative(long j);

    private native List getAttachmentDataNative(long j);

    private native Boolean getIsE2EEAttributedNative(long j);

    private native Boolean getIsLocalOnlyNative(long j);

    private native Boolean getIsOpenEBNative(long j);

    private native Number getMessageEphemeralDurationInSecondsNative(long j);

    private native String getMessageIdNative(long j);

    private native List getMessageTagsNative(long j);

    private native String getSupplementalKeyNative(long j);

    private native List getTagsToDeleteNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, Number number, String str2, Boolean bool, List list, List list2, Number number2, Boolean bool2, Boolean bool3, List list3);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MessageBackupDirective)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((MessageBackupDirective) obj).mNativeHolder.mNativePointer);
        }
        return false;
    }

    static {
        C09170dP.A0C("wamsysjni");
    }

    public Number getActionType() {
        return getActionTypeNative(this.mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    public MessageBackupDirective(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public MessageBackupDirective(String str, Number number, String str2, Boolean bool, List list, List list2, Number number2, Boolean bool2, Boolean bool3, List list3) {
        this.mNativeHolder = initNativeHolder(str, number, str2, bool, list, list2, number2, bool2, bool3, list3);
    }
}
