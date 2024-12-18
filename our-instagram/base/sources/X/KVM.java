package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;

/* loaded from: classes8.dex */
public final class KVM extends AbstractC46453KhD {
    public final long A00;
    public final ImageUrl A01;
    public final ImageInfo A02;
    public final boolean A03;

    public KVM(ImageUrl imageUrl, ImageInfo imageInfo, long j, boolean z) {
        C14360o3.A0B(imageUrl, 2);
        this.A03 = z;
        this.A01 = imageUrl;
        this.A02 = imageInfo;
        this.A00 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KVM) {
                KVM kvm = (KVM) obj;
                if (this.A03 != kvm.A03 || !C14360o3.A0K(this.A01, kvm.A01) || !C14360o3.A0K(this.A02, kvm.A02) || this.A00 != kvm.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, AbstractC25225BEi.A08(this.A03)) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25228BEl.A03(this.A00);
    }
}
