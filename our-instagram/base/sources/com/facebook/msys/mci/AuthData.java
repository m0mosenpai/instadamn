package com.facebook.msys.mci;

import X.C2NJ;
import com.facebook.simplejni.NativeHolder;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AuthData {
    public static final AuthData $redex_init_class = null;
    public final NativeHolder mNativeHolder;

    public AuthData(RedactedString redactedString, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i, Map map) {
        this.mNativeHolder = initNativeHolder(redactedString, null, str2, str3, str4, null, null, null, null, null, null, 2, null);
    }

    private native boolean equalsNative(long j, Object obj, long j2);

    private native RedactedString getAccessTokenNative(long j);

    private native String getAnalyticsClaimNative(long j);

    private native Map getAssetIdsNative(long j);

    private native int getAuthTypeNative(long j);

    private native String getDeviceIDNative(long j);

    private native String getFacebookUserIDNative(long j);

    private native String getFamilyDeviceIDNative(long j);

    private native String getFirstNameNative(long j);

    private native String getFullNameNative(long j);

    private native String getMachineIDNative(long j);

    private native List getSessionCookiesNative(long j);

    private native String getUnderlyingAdminUserIDNative(long j);

    private native String getUsernameNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(RedactedString redactedString, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, String str9, int i, Map map);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AuthData)) {
            return equalsNative(this.mNativeHolder.mNativePointer, obj, ((AuthData) obj).mNativeHolder.mNativePointer);
        }
        return false;
    }

    public RedactedString getAccessToken() {
        return getAccessTokenNative(this.mNativeHolder.mNativePointer);
    }

    public String getDeviceID() {
        return getDeviceIDNative(this.mNativeHolder.mNativePointer);
    }

    public String getFacebookUserID() {
        return getFacebookUserIDNative(this.mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    static {
        C2NJ.A00();
    }

    public AuthData(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
