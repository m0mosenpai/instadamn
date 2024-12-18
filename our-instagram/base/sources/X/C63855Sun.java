package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;
import java.io.FileInputStream;
import java.util.List;

/* renamed from: X.Sun, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63855Sun implements InterfaceC65561Tmh {
    public final C63780Sta A00;
    public final C63361SiK A01;
    public final List A02;

    @Override // X.InterfaceC65561Tmh
    public final void EoZ() {
    }

    @Override // X.InterfaceC65561Tmh
    public final Bitmap ANq(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.A00.A00.rewind().getFileDescriptor(), null, options);
    }

    @Override // X.InterfaceC65561Tmh
    public final int BGk() {
        ParcelFileDescriptorRewinder$InternalRewinder parcelFileDescriptorRewinder$InternalRewinder;
        C61005RdY c61005RdY;
        List list = this.A02;
        C63780Sta c63780Sta = this.A00;
        C63361SiK c63361SiK = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC65557Tmd interfaceC65557Tmd = (InterfaceC65557Tmd) list.get(i);
            try {
                parcelFileDescriptorRewinder$InternalRewinder = c63780Sta.A00;
                c61005RdY = new C61005RdY(c63361SiK, new FileInputStream(parcelFileDescriptorRewinder$InternalRewinder.rewind().getFileDescriptor()));
            } catch (Throwable th) {
                th = th;
            }
            try {
                int BZf = interfaceC65557Tmd.BZf(c63361SiK, c61005RdY);
                c61005RdY.A01();
                parcelFileDescriptorRewinder$InternalRewinder.rewind();
                if (BZf != -1) {
                    return BZf;
                }
            } catch (Throwable th2) {
                th = th2;
                c61005RdY.A01();
                c63780Sta.A00.rewind();
                throw th;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC65561Tmh
    public final ImageHeaderParser$ImageType BGr() {
        ParcelFileDescriptorRewinder$InternalRewinder parcelFileDescriptorRewinder$InternalRewinder;
        C61005RdY c61005RdY;
        List list = this.A02;
        C63780Sta c63780Sta = this.A00;
        C63361SiK c63361SiK = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            InterfaceC65557Tmd interfaceC65557Tmd = (InterfaceC65557Tmd) list.get(i);
            try {
                parcelFileDescriptorRewinder$InternalRewinder = c63780Sta.A00;
                c61005RdY = new C61005RdY(c63361SiK, new FileInputStream(parcelFileDescriptorRewinder$InternalRewinder.rewind().getFileDescriptor()));
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser$ImageType CBI = interfaceC65557Tmd.CBI(c61005RdY);
                c61005RdY.A01();
                parcelFileDescriptorRewinder$InternalRewinder.rewind();
                if (CBI != ImageHeaderParser$ImageType.UNKNOWN) {
                    return CBI;
                }
            } catch (Throwable th2) {
                th = th2;
                c61005RdY.A01();
                c63780Sta.A00.rewind();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public C63855Sun(ParcelFileDescriptor parcelFileDescriptor, C63361SiK c63361SiK, List list) {
        Rs8.A00(c63361SiK);
        this.A01 = c63361SiK;
        Rs8.A00(list);
        this.A02 = list;
        this.A00 = new C63780Sta(parcelFileDescriptor);
    }
}
