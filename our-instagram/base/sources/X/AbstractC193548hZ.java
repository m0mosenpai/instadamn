package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.RemoteException;
import android.provider.MediaStore;
import android.util.Size;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.8hZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC193548hZ {
    public static final String[] A00 = {"_id", "image_id", "_data"};
    public static final String[] A01 = {"_id", "video_id", "_data"};

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (X.AbstractC13570mj.A00.contains(r1) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.content.Context r5, android.graphics.BitmapFactory.Options r6, com.instagram.common.gallery.Medium r7, boolean r8) {
        /*
            r3 = 0
            r0 = 2
            X.C14360o3.A0B(r6, r0)
            boolean r0 = r7.A05()
            if (r0 == 0) goto L2e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L2e
            java.lang.String r1 = r7.A03()
            if (r1 == 0) goto L62
            java.util.List r0 = X.AbstractC13570mj.A00
            java.lang.String r0 = "image/heic"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L29
            java.lang.String r0 = "image/heif"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L2e
        L29:
            java.lang.String r2 = r7.A0X
        L2b:
            r7.A0a = r2
            return
        L2e:
            if (r8 == 0) goto L6a
            boolean r0 = r7.A05()
            if (r0 == 0) goto L6a
            boolean r0 = r7.isValid()
            if (r0 == 0) goto L6a
            java.lang.String r2 = r7.A0X
            r1 = 46
            X.C14360o3.A0B(r2, r3)
            int r0 = r2.length()
            int r0 = r0 + (-1)
            int r0 = X.AbstractC001900j.A05(r2, r1, r0)
            if (r0 < 0) goto L5f
            java.lang.String r1 = r2.substring(r0)
            X.C14360o3.A07(r1)
        L56:
            java.util.List r0 = X.AbstractC13570mj.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6a
            goto L2b
        L5f:
            java.lang.String r1 = ""
            goto L56
        L62:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L6a:
            java.lang.String r1 = r7.A0a
            if (r1 == 0) goto L77
            java.lang.String r0 = r7.A0X
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L77
            return
        L77:
            boolean r4 = r7.Cff()
            r3 = 1
            android.content.ContentResolver r2 = r5.getContentResolver()
            int r0 = r7.A05
            long r0 = (long) r0
            if (r4 == 0) goto L8c
            android.provider.MediaStore.Video.Thumbnails.getThumbnail(r2, r0, r3, r6)
        L88:
            A02(r5, r7)
            return
        L8c:
            android.provider.MediaStore.Images.Thumbnails.getThumbnail(r2, r0, r3, r6)
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC193548hZ.A01(android.content.Context, android.graphics.BitmapFactory$Options, com.instagram.common.gallery.Medium, boolean):void");
    }

    public static final void A02(Context context, Medium medium) {
        android.net.Uri uri;
        C14360o3.A0B(medium, 1);
        if (medium.Cff()) {
            uri = MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
        }
        Cursor cursor = null;
        C14360o3.A0A(uri);
        ContentProviderClient A002 = AbstractC15910ql.A00(context, uri);
        if (A002 != null) {
            try {
                if (medium.Cff()) {
                    cursor = A002.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, A01, AnonymousClass001.A0O("video_id = ", medium.A05), null, null);
                } else {
                    cursor = A002.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, A00, AnonymousClass001.A0O("image_id = ", medium.A05), null, null);
                }
                if (cursor != null && cursor.moveToFirst()) {
                    if (medium.Cff()) {
                        medium.A0a = cursor.getString(cursor.getColumnIndex("_data"));
                    } else {
                        medium.A0a = cursor.getString(cursor.getColumnIndex("_data"));
                    }
                }
                A002.release();
                if (cursor == null) {
                    return;
                }
            } catch (RemoteException unused) {
                A002.release();
                if (0 == 0) {
                    return;
                }
            } catch (Throwable th) {
                A002.release();
                if (0 != 0 && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
            if (!cursor.isClosed()) {
                cursor.close();
            }
        }
    }

    public static final Bitmap A00(ContentResolver contentResolver, CancellationSignal cancellationSignal, C193528hX c193528hX, Medium medium, UserSession userSession, WeakReference weakReference, int i, int i2) {
        String str;
        InterfaceC193488hT interfaceC193488hT;
        InterfaceC193488hT interfaceC193488hT2;
        Bitmap bitmap = null;
        try {
            if (c193528hX != null) {
                bitmap = C9Af.A01(contentResolver, medium.A02(), cancellationSignal, new Size(i, i2), c193528hX, userSession);
            } else {
                bitmap = contentResolver.loadThumbnail(medium.A02(), new Size(i, i2), cancellationSignal);
            }
            if (bitmap != null && weakReference != null && (interfaceC193488hT2 = (InterfaceC193488hT) weakReference.get()) != null && interfaceC193488hT2.CXZ(medium)) {
                C11T.A02(new RunnableC193558ha(bitmap, cancellationSignal, medium, interfaceC193488hT2));
                return bitmap;
            }
        } catch (OperationCanceledException e) {
            e = e;
            str = "GalleryThumbnailUtil#OperationCanceledException";
            C0K8.A0F("GalleryThumbnailUtil", str, e);
            return bitmap;
        } catch (IOException e2) {
            e = e2;
            str = "GalleryThumbnailUtil#IOException";
            if (!(e instanceof FileNotFoundException) && userSession != null) {
                C0f5 AEp = C18950wb.A01.AEp("GalleryThumbnailUtil#IOException", 817894040);
                AEp.ERI(e);
                AEp.report();
            }
            C0K8.A0F("GalleryThumbnailUtil", str, e);
            return bitmap;
        } catch (NullPointerException e3) {
            e = e3;
            if (weakReference != null && (interfaceC193488hT = (InterfaceC193488hT) weakReference.get()) != null && interfaceC193488hT.CXZ(medium)) {
                interfaceC193488hT.DN1(medium, "GalleryThumbnailUtil#NullPointerException - medium.mUri is null");
            }
            str = "GalleryThumbnailUtil#NullPointerException";
            C0K8.A0F("GalleryThumbnailUtil", str, e);
            return bitmap;
        }
        return bitmap;
    }

    public static final void A03(CancellationSignal cancellationSignal, Medium medium, WeakReference weakReference, int i, int i2) {
        String str;
        Bitmap createVideoThumbnail;
        InterfaceC193488hT interfaceC193488hT;
        try {
            if (medium.A05()) {
                if (Build.VERSION.SDK_INT >= 29) {
                    createVideoThumbnail = ThumbnailUtils.createImageThumbnail(new File(medium.A0X), new Size(i, i2), cancellationSignal);
                } else {
                    return;
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(new File(medium.A0X), new Size(i, i2), cancellationSignal);
            } else {
                createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(medium.A0X, 1);
            }
            if (createVideoThumbnail != null && (interfaceC193488hT = (InterfaceC193488hT) weakReference.get()) != null && interfaceC193488hT.CXZ(medium)) {
                C11T.A02(new RunnableC193558ha(createVideoThumbnail, cancellationSignal, medium, interfaceC193488hT));
            }
        } catch (OperationCanceledException e) {
            e = e;
            str = "GalleryThumbnailUtil.loadThumbnailFromFile#OperationCanceledException";
            C0K8.A0F("GalleryThumbnailUtil", str, e);
        } catch (IOException e2) {
            e = e2;
            C0w9.A07("GalleryThumbnailUti.loadThumbnailFromFilel#IOException", e);
            str = "GalleryThumbnailUtil.loadThumbnailFromFile#IOException";
            C0K8.A0F("GalleryThumbnailUtil", str, e);
        }
    }
}
