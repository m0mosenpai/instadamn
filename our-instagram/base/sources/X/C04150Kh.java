package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.0Kh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04150Kh implements InterfaceC08580cM {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC08580cM
    public final void ACr(Context context, String str, String str2) {
        ?? emptyList = Collections.emptyList();
        try {
            Bundle bundle = ((PackageItemInfo) AbstractC08120bY.A00(context, str)).metaData;
            if (bundle != null && bundle.size() > 0) {
                emptyList = new ArrayList();
                for (String str3 : bundle.keySet()) {
                    if (str3.contains(".fbpermission.")) {
                        emptyList.add(str3);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            emptyList = Collections.emptyList();
        }
        if (!emptyList.contains(str2)) {
            throw new SecurityException(AnonymousClass001.A11("Caller '", str, "' has not declared the FbPermission: '", str2, "' in its AndroidManifest.xml"));
        }
    }
}
