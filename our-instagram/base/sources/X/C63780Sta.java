package X;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* renamed from: X.Sta, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63780Sta implements InterfaceC65473Tkq {
    public final ParcelFileDescriptorRewinder$InternalRewinder A00;

    @Override // X.InterfaceC65473Tkq
    public final void cleanup() {
    }

    @Override // X.InterfaceC65473Tkq
    public final /* bridge */ /* synthetic */ Object EL4() {
        return this.A00.rewind();
    }

    public C63780Sta(ParcelFileDescriptor parcelFileDescriptor) {
        this.A00 = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
}
