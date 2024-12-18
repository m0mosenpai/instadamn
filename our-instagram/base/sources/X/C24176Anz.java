package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* renamed from: X.Anz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24176Anz implements InterfaceC197178nn {
    public int A00;
    public int A01;
    public Boolean A02;
    public final android.net.Uri A03;
    public final boolean A04;
    public final ContentResolver A05;
    public final String A06;
    public final String A07;

    public C24176Anz(ContentResolver contentResolver, android.net.Uri uri, String str, String str2, String str3) {
        C14360o3.A0B(uri, 2);
        this.A05 = contentResolver;
        this.A03 = uri;
        this.A06 = str;
        this.A07 = str3;
        this.A01 = -1;
        this.A00 = -1;
        this.A04 = "image/jpeg".equalsIgnoreCase(str2);
    }

    private final void A00() {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            try {
                try {
                    parcelFileDescriptor = this.A05.openFileDescriptor(this.A03, "r");
                } catch (FileNotFoundException unused) {
                }
            } catch (Throwable th) {
                th = th;
                parcelFileDescriptor = parcelFileDescriptor2;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if (parcelFileDescriptor != null) {
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
                    this.A01 = options.outWidth;
                    this.A00 = options.outHeight;
                    parcelFileDescriptor.close();
                    return;
                }
                throw AbstractC166997dE.A0g();
            } catch (FileNotFoundException unused2) {
                parcelFileDescriptor2 = parcelFileDescriptor;
                this.A01 = 0;
                this.A00 = 0;
                if (parcelFileDescriptor2 != null) {
                    parcelFileDescriptor2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (parcelFileDescriptor != null) {
                    try {
                        parcelFileDescriptor.close();
                    } catch (Throwable unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable unused4) {
        }
    }

    @Override // X.InterfaceC197178nn
    public final Bitmap AWj(int i, int i2, boolean z) {
        return AbstractC209959Qh.A01(this.A05, this.A03, i);
    }

    @Override // X.InterfaceC197178nn
    public final String Avl() {
        return this.A06;
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
        return null;
    }

    @Override // X.InterfaceC197178nn
    public final boolean CXA() {
        return this.A04;
    }

    @Override // X.InterfaceC197178nn
    public final boolean Cev() {
        Boolean bool = this.A02;
        if (bool == null && this.A04) {
            String path = this.A03.getPath();
            if (path != null) {
                bool = Boolean.valueOf(AKG.A00.A01(path));
                this.A02 = bool;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return AbstractC167007dF.A1T(bool);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C24176Anz) && C14360o3.A0K(this.A03, ((C24176Anz) obj).A03)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC197178nn
    public final int getHeight() {
        if (this.A00 == -1) {
            A00();
        }
        return this.A00;
    }

    @Override // X.InterfaceC197178nn
    public final String getTitle() {
        return this.A07;
    }

    @Override // X.InterfaceC197178nn
    public final android.net.Uri getUri() {
        return this.A03;
    }

    @Override // X.InterfaceC197178nn
    public final int getWidth() {
        if (this.A01 == -1) {
            A00();
        }
        return this.A01;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        return AbstractC166987dD.A19(this.A03);
    }

    @Override // X.InterfaceC197178nn
    public final /* synthetic */ Bitmap E35(int i, boolean z) {
        return null;
    }
}
