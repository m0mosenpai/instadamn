package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ProductPivotsButton;
import com.instagram.api.schemas.ProductPivotsButtonActionType;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WlR implements JI4 {
    public final ProductPivotsButton A00;

    @Override // X.JI4
    public final String Ax2() {
        return this.A00.Ax2();
    }

    @Override // X.JI4
    public final String Ax4() {
        return this.A00.Ax4();
    }

    @Override // X.JI4
    public final String Ax5() {
        return this.A00.Ax5();
    }

    @Override // X.JI4
    public final Integer Ax9() {
        ProductPivotsButton productPivotsButton = this.A00;
        ProductPivotsButtonActionType Ax7 = productPivotsButton.Ax7();
        if (Ax7 == null) {
            Ax7 = productPivotsButton.AYO();
        }
        switch (Ax7.ordinal()) {
            case 0:
                return C05F.A0B;
            case 1:
                return C05F.A0Y;
            case 2:
                return C05F.A06;
            case 3:
                return C05F.A0N;
            case 4:
                return C05F.A0C;
            case 5:
                return C05F.A01;
            case 6:
                return C05F.A09;
            case 7:
                return C05F.A0A;
            case 8:
                return C05F.A04;
            case 9:
                return C05F.A02;
            case 10:
                return C05F.A03;
            case 11:
                return C05F.A0j;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C05F.A0u;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return C05F.A15;
            case 14:
                return C05F.A1F;
            case Process.SIGTERM /* 15 */:
                return C05F.A1I;
            case 16:
                return C05F.A08;
            case 17:
                return C05F.A00;
            default:
                throw new RuntimeException();
        }
    }

    @Override // X.JI4
    public final User BSW() {
        return this.A00.BSW();
    }

    @Override // X.JI4
    public final String getText() {
        ProductPivotsButton productPivotsButton = this.A00;
        String text = productPivotsButton.getText();
        if (text == null) {
            return productPivotsButton.Aj7();
        }
        return text;
    }

    public WlR(ProductPivotsButton productPivotsButton) {
        this.A00 = productPivotsButton;
    }
}
