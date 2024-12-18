package X;

import X.AbstractC25225BEi;
import X.C14360o3;
import X.C55867OrH;
import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.lang.ref.WeakReference;

/* renamed from: X.OrH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55867OrH implements InterfaceC449925e {
    public static C55867OrH A02;
    public static final OO9 A03 = new Object();
    public WeakReference A00;
    public final Application.ActivityLifecycleCallbacks A01;

    @Override // X.InterfaceC449925e
    public final String getFilenamePrefix() {
        return "image_cache_state_log";
    }

    @Override // X.InterfaceC449925e
    public final String getFilenameSuffix() {
        return OptSvcAnalyticsStore.FILE_SUFFIX;
    }

    @Override // X.InterfaceC449925e
    public final String getTag() {
        return "ImageCacheBugReportLogsProvider";
    }

    @Override // X.InterfaceC449925e
    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public C55867OrH(Context context) {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.bugreporter.rageshake.common.image.ImageCacheBugReportLogsProvider$lifecycleCallbacks$1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                C14360o3.A0B(activity, 0);
                C55867OrH.this.A00 = AbstractC25225BEi.A16(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
            }
        };
        this.A01 = activityLifecycleCallbacks;
        Context applicationContext = context.getApplicationContext();
        C14360o3.A0C(applicationContext, AbstractC111324zv.A00(19));
        ((Application) applicationContext).registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override // X.InterfaceC449925e
    public final String getContentInBackground(Context context) {
        Activity activity;
        View findViewById;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Disk Cache Journal:\n");
        A1C.append("=========================\n\n");
        A1C.append("Memory Cache Content:\n");
        A1C.append("=========================\n\n");
        A1C.append("Image Views On Screen:\n");
        A1C.append("=========================\n\n");
        WeakReference weakReference = this.A00;
        if (weakReference != null && (activity = (Activity) weakReference.get()) != null && (findViewById = activity.findViewById(R.id.content)) != null) {
            OO9.A00(findViewById, A03, A1C);
        } else {
            A1C.append("Couldn't get views hierarchy");
        }
        return A1C.toString();
    }
}
