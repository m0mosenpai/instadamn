package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.system.Int64Ref;
import android.util.Size;
import com.instagram.common.session.UserSession;
import java.io.BufferedInputStream;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.9Af, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9Af {
    public static final AssetFileDescriptor A00(ContentResolver contentResolver, android.net.Uri uri, CancellationSignal cancellationSignal, Size size, UserSession userSession) {
        try {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.content.extra.SIZE", new Point(size.getWidth(), size.getHeight()));
            return contentResolver.openTypedAssetFile(uri, "image/*", bundle, cancellationSignal);
        } catch (IllegalArgumentException unused) {
            if (userSession != null) {
                C0f5 AEp = C18950wb.A01.AEp("ContentResolverUtil error in openTypedAssetFile", 817898072);
                AEp.ABW("uri", uri.toString());
                AEp.report();
                return null;
            }
            return null;
        }
    }

    public static final Bitmap A01(ContentResolver contentResolver, android.net.Uri uri, CancellationSignal cancellationSignal, Size size, C193528hX c193528hX, UserSession userSession) {
        Bitmap bitmap;
        long j;
        Int64Ref int64Ref = new Int64Ref(0L);
        AssetFileDescriptor A00 = A00(contentResolver, uri, cancellationSignal, size, userSession);
        if (A00 != null) {
            Bundle extras = A00.getExtras();
            if (extras != null) {
                j = extras.getInt("android.provider.extra.ORIENTATION", 0);
            } else {
                j = 0;
            }
            int64Ref.value = j;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = c193528hX.A01;
        if (concurrentLinkedQueue.size() <= 12) {
            bitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            bitmap = (Bitmap) concurrentLinkedQueue.remove();
        }
        if (concurrentLinkedQueue.size() > 25 && userSession != null) {
            C0f5 AEp = C18950wb.A01.AEp("ContentResolverUtil bitmap size exceeds threshold", 817898072);
            AEp.ABU("bitmapPoolSize", concurrentLinkedQueue.size());
            AEp.report();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int width = size.getWidth();
        int height = size.getHeight();
        A00 = A00(contentResolver, uri, cancellationSignal, size, userSession);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        int i = 1;
        options2.inJustDecodeBounds = true;
        if (A00 != null) {
            try {
                BitmapFactory.decodeStream(new BufferedInputStream(A00.createInputStream()), null, options2);
                A00.close();
            } finally {
            }
        }
        int i2 = options2.outHeight;
        int i3 = options2.outWidth;
        if ((i2 <= 0 || i3 <= 0) && userSession != null) {
            C0f5 AEp2 = C18950wb.A01.AEp("ContentResolverUtil output dimensions are invalid", 817898072);
            AEp2.ABW("uri", uri.toString());
            boolean z = false;
            if (A00 == null) {
                z = true;
            }
            AEp2.ABX("assetFileDescriptor is null", z);
            AEp2.ABU("requestWidth", width);
            AEp2.ABU("requestHeight", height);
            AEp2.report();
        }
        while (true) {
            if (i2 <= height && i3 <= width) {
                break;
            }
            i *= 2;
            i2 /= 2;
            i3 /= 2;
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        options.inMutable = true;
        options.inBitmap = bitmap;
        if (A00 != null) {
            try {
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new BufferedInputStream(A00.createInputStream()), null, options);
                    if (decodeStream != bitmap && userSession != null) {
                        C18950wb.A01.AEp("ContentResolverUtil inBitmap is not used", 817898072).report();
                    }
                    if (int64Ref.value != 0 && decodeStream != null) {
                        int width2 = decodeStream.getWidth();
                        int height2 = decodeStream.getHeight();
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) int64Ref.value, width2 / 2.0f, height2 / 2.0f);
                        C0fK.A03(decodeStream);
                        decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, width2, height2, matrix, false);
                    }
                    A00.close();
                    return decodeStream;
                } finally {
                }
            } catch (IllegalArgumentException e) {
                if (userSession != null && bitmap != null) {
                    C0f5 AEp3 = C18950wb.A01.AEp("ContentResolverUtil Problem decoding into existing bitmap", 817903564);
                    AEp3.ABU("thumbnailWidth", size.getWidth());
                    AEp3.ABU("thumbnailHeight", size.getHeight());
                    AEp3.ABU("inBitmapWidth", bitmap.getWidth());
                    AEp3.ABU("inBitmapHeight", bitmap.getHeight());
                    AEp3.ERI(e);
                    AEp3.report();
                }
            }
        }
        return contentResolver.loadThumbnail(uri, size, cancellationSignal);
    }
}
