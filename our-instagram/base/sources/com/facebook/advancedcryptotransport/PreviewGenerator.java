package com.facebook.advancedcryptotransport;

import X.AbstractC166987dD;
import X.C0fK;
import X.C9AD;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes4.dex */
public class PreviewGenerator {
    public static boolean generatePreviewFromFullVideoContent(String str, String str2) {
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(str, 1);
        if (createVideoThumbnail == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            File A11 = AbstractC166987dD.A11(str2);
            A11.createNewFile();
            FileOutputStream fileOutputStream2 = new FileOutputStream(A11);
            try {
                C0fK.A02(Bitmap.CompressFormat.JPEG, createVideoThumbnail, fileOutputStream2, 70);
                fileOutputStream2.flush();
                createVideoThumbnail.recycle();
                try {
                    fileOutputStream2.close();
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
                fileOutputStream = fileOutputStream2;
                createVideoThumbnail.recycle();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                createVideoThumbnail.recycle();
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    static {
        C9AD.A00();
    }
}
