package X;

import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.common.gallery.Medium;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* loaded from: classes9.dex */
public final class NNE extends AbstractC53477Nl4 {
    public final Medium A00;
    public final InterfaceC58204PrA A01;
    public final C47Z A02;
    public final boolean A03;

    public NNE(Medium medium, InterfaceC58204PrA interfaceC58204PrA, C47Z c47z, boolean z) {
        C14360o3.A0B(c47z, 3);
        this.A01 = interfaceC58204PrA;
        this.A00 = medium;
        this.A02 = c47z;
        this.A03 = z;
        String str = c47z.A3o;
        interfaceC58204PrA.setTitle(str == null ? "" : str);
        String str2 = c47z.A2Z;
        interfaceC58204PrA.ERB(str2 != null ? str2 : "");
        interfaceC58204PrA.EbD(c47z.A02);
        interfaceC58204PrA.EWs(c47z.A5x);
        interfaceC58204PrA.EaU(c47z.A5i);
        interfaceC58204PrA.EQW(c47z.A4C);
        interfaceC58204PrA.EQV(c47z.A0t);
        interfaceC58204PrA.Edr(c47z.A5T);
    }

    public final long A02() {
        if (this.A03) {
            return this.A02.A0a;
        }
        return this.A00.A03;
    }

    public final void A03() {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        C47Z c47z = this.A02;
        InterfaceC58204PrA interfaceC58204PrA = this.A01;
        c47z.A3o = interfaceC58204PrA.getTitle();
        c47z.A2Z = interfaceC58204PrA.Alc();
        c47z.A02 = interfaceC58204PrA.Bes();
        c47z.A5x = interfaceC58204PrA.CXE();
        c47z.A5i = interfaceC58204PrA.isPaidPartnership();
        c47z.A4C = interfaceC58204PrA.Ai7();
        BrandedContentProjectMetadataIntf Ai4 = interfaceC58204PrA.Ai4();
        if (Ai4 != null) {
            brandedContentProjectMetadata = Ai4.ErO();
        } else {
            brandedContentProjectMetadata = null;
        }
        c47z.A0t = brandedContentProjectMetadata;
        c47z.A5T = interfaceC58204PrA.BuK();
        c47z.A5L = interfaceC58204PrA.CRp();
        c47z.A05 = interfaceC58204PrA.AsK();
    }

    public static C47Z A00(NMX nmx) {
        return NMX.A01(nmx).A02().A02;
    }

    public static C47Z A01(InterfaceC09390do interfaceC09390do) {
        return ((IGTVUploadViewModel) interfaceC09390do.getValue()).A02().A02;
    }
}
