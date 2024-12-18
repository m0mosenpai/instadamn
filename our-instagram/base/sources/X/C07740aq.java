package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.AssetsProvider;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0aq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07740aq {
    public static final String A00;
    public static final ConcurrentLinkedQueue A01;
    public static volatile boolean A02;

    static {
        String obj = C07740aq.class.toString();
        C14360o3.A07(obj);
        A00 = obj;
        A01 = new ConcurrentLinkedQueue();
        A02 = "true".equals(AbstractC02650Ap.A03("fb.enable_resource_coverage"));
    }

    public static final void A00(Context context) {
        if (A02) {
            Resources resources = context.getResources();
            C14360o3.A07(resources);
            List<String> singletonList = Collections.singletonList(context.getPackageResourcePath());
            C14360o3.A07(singletonList);
            if (A02) {
                ResourcesLoader resourcesLoader = new ResourcesLoader();
                Object obj = new Object();
                for (String str : singletonList) {
                    String str2 = A00;
                    try {
                        ResourcesProvider loadFromApk = ResourcesProvider.loadFromApk(ParcelFileDescriptor.open(new File(str), 268435456), (AssetsProvider) obj);
                        C14360o3.A07(loadFromApk);
                        resourcesLoader.addProvider(loadFromApk);
                    } catch (IOException e) {
                        C0K8.A0F(str2, "Failed to load apks due to error: %s", e);
                    }
                }
                resources.addLoaders(resourcesLoader);
                context.createConfigurationContext(resources.getConfiguration());
                C0PX c0px = AbstractC04290Kv.A00;
                if (c0px != null) {
                    c0px.A01(new C10850hu("resource_logging_running", -2, true), "true");
                }
            }
        }
    }
}
