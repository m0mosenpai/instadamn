package X;

import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.camera.sizesetter.Size;
import java.util.List;

/* renamed from: X.SzA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64093SzA implements InterfaceC174637px {
    public final FixedSizes A00;

    @Override // X.InterfaceC174637px
    public final C176997tv ApU(EnumC174667q0 enumC174667q0, EnumC174667q0 enumC174667q02, List list, List list2, List list3, List list4, int i, int i2, int i3) {
        FixedSizes fixedSizes = this.A00;
        Size size = fixedSizes.A01;
        C176877tj c176877tj = new C176877tj(size.A01, size.A00);
        Size size2 = fixedSizes.A00;
        return new C176997tv(c176877tj, new C176877tj(size2.A01, size2.A00), null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bcq(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        FixedSizes fixedSizes = this.A00;
        Size size = fixedSizes.A01;
        C176877tj c176877tj = new C176877tj(size.A01, size.A00);
        Size size2 = fixedSizes.A00;
        return new C176997tv(c176877tj, new C176877tj(size2.A01, size2.A00), null, null);
    }

    @Override // X.InterfaceC174637px
    public final C176997tv Bfv(List list, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("Only photo mode is used");
    }

    @Override // X.InterfaceC174637px
    public final C176997tv CFI(EnumC174667q0 enumC174667q0, List list, List list2, int i, int i2, int i3) {
        throw AbstractC166987dD.A1D("Only photo mode is used");
    }

    public C64093SzA(FixedSizes fixedSizes) {
        this.A00 = fixedSizes;
    }
}
