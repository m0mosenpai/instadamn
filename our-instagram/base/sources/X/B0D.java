package X;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes4.dex */
public final class B0D implements Runnable {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public final AbstractC224249v8 A01;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        C60782q2 c60782q2;
        boolean z;
        Handler handler;
        Runnable runnableC24709Awq;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            A00(options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            AbstractC224249v8 abstractC224249v8 = this.A01;
            int i3 = abstractC224249v8.A01;
            int i4 = abstractC224249v8.A00;
            if (abstractC224249v8 instanceof C221699qY) {
                SimpleDateFormat simpleDateFormat = C60782q2.A0K;
                c60782q2 = new C60782q2(((C221699qY) abstractC224249v8).A00);
            } else if (abstractC224249v8 instanceof C221709qZ) {
                C221709qZ c221709qZ = (C221709qZ) abstractC224249v8;
                ContentResolver contentResolver = c221709qZ.A00;
                android.net.Uri uri = c221709qZ.A01;
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                if (openAssetFileDescriptor != null) {
                    try {
                        SimpleDateFormat simpleDateFormat2 = C60782q2.A0K;
                        c60782q2 = new C60782q2(openAssetFileDescriptor.getFileDescriptor());
                        openAssetFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(openAssetFileDescriptor, th);
                            throw th2;
                        }
                    }
                } else {
                    throw new IOException(AbstractC167017dG.A0n(uri, "Failed to open file descriptor for ", AbstractC166987dD.A1C()));
                }
            } else {
                throw B4Z.A00();
            }
            int i5 = 90;
            switch (c60782q2.A0M("Orientation", 1)) {
                case 2:
                    z = true;
                    i5 = 0;
                    break;
                case 3:
                    z = false;
                    i5 = 180;
                    break;
                case 4:
                    z = true;
                    i5 = 180;
                    break;
                case 5:
                    abstractC224249v8.A01 = i4;
                    abstractC224249v8.A00 = i3;
                    z = true;
                    break;
                case 6:
                    abstractC224249v8.A01 = i4;
                    abstractC224249v8.A00 = i3;
                    z = false;
                    break;
                case 7:
                    i5 = -90;
                    abstractC224249v8.A01 = i4;
                    abstractC224249v8.A00 = i3;
                    z = true;
                    break;
                case 8:
                    i5 = 270;
                    abstractC224249v8.A01 = i4;
                    abstractC224249v8.A00 = i3;
                    z = false;
                    break;
                default:
                    z = false;
                    i5 = 0;
                    break;
            }
            C206409Bx A01 = AbstractC60562pf.A01(c60782q2);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            int i6 = 1;
            while (true) {
                if (i / i6 <= i3 && i2 / i6 <= i4) {
                    options2.inSampleSize = i6;
                    options2.inJustDecodeBounds = false;
                    Bitmap A00 = A00(options2);
                    String obj = abstractC224249v8.toString();
                    if (A00 == null) {
                        C0K8.A0O("HighQualityBitmapManager", "Failed to decode high quality bitmap: %s", obj);
                    }
                    AbstractC23082AFo.A01.remove(obj);
                    if (A00 == null) {
                        NullPointerException A15 = AbstractC166987dD.A15(AnonymousClass001.A0R(obj, ": on decoding high quality bitmap is null"));
                        handler = AbstractC23082AFo.A00;
                        runnableC24709Awq = new RunnableC24709Awq(this, A15);
                    } else {
                        handler = AbstractC23082AFo.A00;
                        runnableC24709Awq = new RunnableC24876Azb(A00, A01, this, i5, z);
                    }
                    handler.post(runnableC24709Awq);
                    return;
                }
                i6 *= 2;
            }
        } catch (IOException | SecurityException e) {
            C0w9.A06("HighQualityBitmapManager", "Failed to decode high quality photo", e);
            AbstractC23082AFo.A00.post(new RunnableC24709Awq(this, e));
        }
    }

    private final Bitmap A00(BitmapFactory.Options options) {
        AbstractC224249v8 abstractC224249v8 = this.A01;
        if (abstractC224249v8 instanceof C221699qY) {
            return BitmapFactory.decodeFile(((C221699qY) abstractC224249v8).A00, options);
        }
        if (abstractC224249v8 instanceof C221709qZ) {
            C221709qZ c221709qZ = (C221709qZ) abstractC224249v8;
            ContentResolver contentResolver = c221709qZ.A00;
            android.net.Uri uri = c221709qZ.A01;
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor != null) {
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor.getFileDescriptor(), null, options);
                    openAssetFileDescriptor.close();
                    return decodeFileDescriptor;
                } finally {
                }
            } else {
                throw new IOException(AbstractC167017dG.A0n(uri, "Failed to open file descriptor for ", AbstractC166987dD.A1C()));
            }
        } else {
            throw B4Z.A00();
        }
    }

    public B0D(AbstractC224249v8 abstractC224249v8) {
        this.A01 = abstractC224249v8;
    }
}
