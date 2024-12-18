package X;

import android.content.Context;
import com.facebook.common.mallochooks.jni.NativeAllocationHooksUtil$NativeImpl;
import java.io.IOException;

/* renamed from: X.0I7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0I7 {
    public static boolean A00(Context context, boolean z) {
        try {
            return NativeAllocationHooksUtil$NativeImpl.verifyMallocHooksNative(context.getDir("mallocHooks", 0).getCanonicalPath(), false, z);
        } catch (IOException e) {
            NativeAllocationHooksUtil$NativeImpl.sErrorMessage = "Error getting directory to run mallocHooks verification";
            C0K8.A05(C0I7.class, "Error getting directory to run mallocHooks verification", e);
            return false;
        }
    }
}
