package com.facebook.rsys.roomtypecalling.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import java.util.HashSet;

/* loaded from: classes9.dex */
public abstract class CallingAppContextUtils {

    /* loaded from: classes9.dex */
    public final class CProxy extends CallingAppContextUtils {
        public static native CallContext createCallContext(String str, String str2, String str3, int i, HashSet hashSet, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11);

        public static native CallContext createCallContextFromJson(String str, String str2, byte[] bArr);

        public static native CallingAppContextUtils createFromMcfType(McfReference mcfReference);

        public static native CallContext createInstagramCallContext(String str, String str2, int i, HashSet hashSet, String str3, String str4);

        public static native CallContext createInstagramCallContextFromJson(String str, byte[] bArr);

        public static native byte[] createJsonFromCallContext(CallContext callContext);

        public static native String getCallablePostId(CallContext callContext);

        public static native HashSet getCallingTags(CallContext callContext);

        public static native String getHorizonVoipZoneId(CallContext callContext);

        public static native String getHorizonWorldId(CallContext callContext);

        public static native String getImmersiveModeDoorId(CallContext callContext);

        public static native boolean getIsMetaAiCall(CallContext callContext);

        public static native String getLinkUrl(CallContext callContext);

        public static native String getLiveBroadcastId(CallContext callContext);

        public static native String getPhoneNumber(CallContext callContext);

        public static native String getPstnUserId(CallContext callContext);

        public static native String getRtcDoorId(CallContext callContext);

        public static native String getServerInfoData(CallContext callContext);

        public static native String getThreadId(CallContext callContext);

        public static native int getThreadType(CallContext callContext);

        public static native boolean isCollision(CallContext callContext, CallContext callContext2);

        public static native boolean isCollisionWithDifferentSelfUser(CallContext callContext, CallContext callContext2);

        public static native boolean isGroupCall(CallContext callContext);

        public static native boolean isThreadTypeAdvancedCrypto(CallContext callContext);

        public static native long nativeGetMcfTypeId();
    }
}
