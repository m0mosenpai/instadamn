package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.IvM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42726IvM implements JI4 {
    public final ProductCollectionLink A00;

    @Override // X.JI4
    public final User BSW() {
        return null;
    }

    @Override // X.JI4
    public final String Ax2() {
        return this.A00.A03;
    }

    @Override // X.JI4
    public final String Ax4() {
        return this.A00.A04;
    }

    @Override // X.JI4
    public final String Ax5() {
        return this.A00.A05;
    }

    @Override // X.JI4
    public final Integer Ax9() {
        switch (this.A00.A00.ordinal()) {
            case 0:
                return C05F.A0B;
            case 1:
                return C05F.A0Y;
            case 2:
                return C05F.A06;
            case 3:
                return C05F.A0C;
            case 4:
                return C05F.A05;
            case 5:
                return C05F.A04;
            case 6:
                return C05F.A02;
            case 7:
                return C05F.A03;
            case 8:
                return C05F.A0j;
            case 9:
                return C05F.A0u;
            case 10:
                return C05F.A15;
            case 11:
                return C05F.A1F;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C05F.A1I;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C05F.A07;
            default:
                throw B4Z.A00();
        }
    }

    @Override // X.JI4
    public final String getText() {
        return this.A00.A02;
    }

    public C42726IvM(ProductCollectionLink productCollectionLink) {
        this.A00 = productCollectionLink;
    }
}
