package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.8nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197168nm implements InterfaceC197178nn {
    public int A00;
    public int A01;
    public String A02;
    public Boolean A03;
    public final android.net.Uri A04;
    public final android.net.Uri A05;
    public final ContentResolver A06;

    public C197168nm(ContentResolver contentResolver, android.net.Uri uri, android.net.Uri uri2) {
        C14360o3.A0B(contentResolver, 1);
        C14360o3.A0B(uri, 2);
        this.A06 = contentResolver;
        this.A05 = uri;
        this.A04 = uri2;
    }

    @Override // X.InterfaceC197178nn
    public final Bitmap E35(int i, boolean z) {
        Bitmap bitmap = null;
        try {
            android.net.Uri uri = this.A04;
            if (uri != null) {
                bitmap = AbstractC209959Qh.A01(this.A06, uri, i);
                return bitmap;
            }
        } catch (Exception e) {
            C0K8.A0F("UriImage", "got exception decoding bitmap ", e);
        }
        return bitmap;
    }

    private final ParcelFileDescriptor A00() {
        try {
            android.net.Uri uri = this.A05;
            if ("file".equals(uri.getScheme())) {
                String path = uri.getPath();
                if (path != null) {
                    return ParcelFileDescriptor.open(new File(path), 268435456);
                }
                throw new IllegalStateException("Required value was null.");
            }
            return this.A06.openFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static final void A01(C197168nm c197168nm) {
        if (c197168nm.A02 == null) {
            ParcelFileDescriptor A00 = c197168nm.A00();
            String str = "";
            if (A00 == null) {
                c197168nm.A02 = "";
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(A00.getFileDescriptor(), null, options);
                String str2 = options.outMimeType;
                if (str2 != null) {
                    str = str2;
                }
                c197168nm.A02 = str;
                c197168nm.A01 = options.outWidth;
                c197168nm.A00 = options.outHeight;
            } finally {
                try {
                    A00.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC197178nn
    public final String Avl() {
        return this.A05.getPath();
    }

    @Override // X.InterfaceC197178nn
    public final int AwT() {
        return 0;
    }

    @Override // X.InterfaceC197178nn
    public final byte[] BGb() {
        return null;
    }

    @Override // X.InterfaceC197178nn
    public final android.net.Uri Ba0() {
        return this.A04;
    }

    @Override // X.InterfaceC197178nn
    public final boolean Cev() {
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        AKG akg = AKG.A00;
        String path = this.A05.getPath();
        if (path != null) {
            boolean A01 = akg.A01(path);
            this.A03 = Boolean.valueOf(A01);
            return A01;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC197178nn
    public final String getTitle() {
        String obj = this.A05.toString();
        C14360o3.A07(obj);
        return obj;
    }

    @Override // X.InterfaceC197178nn
    public final android.net.Uri getUri() {
        return this.A05;
    }

    @Override // X.InterfaceC197178nn
    public final Bitmap AWj(int i, int i2, boolean z) {
        try {
            ParcelFileDescriptor A00 = A00();
            if (A00 != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPurgeable = true;
                options.inInputShareable = true;
                if (z) {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return AbstractC209959Qh.A00(null, options, null, A00, i);
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Exception e) {
            C0K8.A0F("UriImage", "got exception decoding bitmap ", e);
            return null;
        }
    }

    @Override // X.InterfaceC197178nn
    public final boolean CXA() {
        A01(this);
        return "image/jpeg".equals(this.A02);
    }

    @Override // X.InterfaceC197178nn
    public final int getHeight() {
        A01(this);
        return this.A00;
    }

    @Override // X.InterfaceC197178nn
    public final int getWidth() {
        A01(this);
        return this.A01;
    }
}
