package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0K8;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class RuntimeImageHelper {
    public static final String TAG = "RuntimeImageHelper";
    public File apk;
    public Context ctx;

    public boolean tryRemovingImage() {
        try {
            Iterator it = getPresumedImagePaths().iterator();
            while (it.hasNext()) {
                File file = new File((String) it.next());
                if (file.exists()) {
                    file.delete();
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C0K8.A0L(TAG, "Error deleting runtime image for split %s.", e, this.apk);
            return false;
        }
    }

    private String getImageName() {
        String name = this.apk.getName();
        if (name.endsWith(".apk")) {
            name = name.substring(0, name.length() - 4);
        }
        return AnonymousClass001.A0R(name, ".art");
    }

    private List getPresumedImagePaths() {
        LinkedList linkedList = new LinkedList();
        try {
            String canonicalPath = this.ctx.getCacheDir().getCanonicalPath();
            String[] strArr = {"arm", "arm64", "x86", "x86_64"};
            for (int i = 0; i < 4; i++) {
                linkedList.add(AnonymousClass001.A11(canonicalPath, "/oat_primary/", strArr[i], "/", getImageName()));
            }
        } catch (IOException e) {
            C0K8.A0I(TAG, "Error getting app file dir path", e);
        }
        return linkedList;
    }

    public RuntimeImageHelper(Context context, File file) {
        this.ctx = context;
        this.apk = file;
    }
}
