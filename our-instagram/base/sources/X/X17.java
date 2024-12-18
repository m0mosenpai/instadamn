package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.shopify.checkout.models.ProgressButton;
import com.shopify.checkout.models.ProgressButtonStage;
import com.shopify.checkout.models.ProgressButtonStageSerializer;
import com.shopify.checkout.models.ProgressButtonState;
import com.shopify.checkout.models.ProgressButtonStateSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes11.dex */
public final /* synthetic */ class X17 implements InterfaceC73823Sp {
    public static final X17 A00;
    public static final SerialDescriptor A01;

    @Override // X.C3RB
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        C14360o3.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C3T8 ADQ = decoder.ADQ(serialDescriptor);
        ProgressButtonState progressButtonState = null;
        ProgressButtonStage progressButtonStage = null;
        int i = 0;
        while (true) {
            int ANz = ADQ.ANz(serialDescriptor);
            if (ANz != -1) {
                if (ANz != 0) {
                    if (ANz == 1) {
                        progressButtonStage = (ProgressButtonStage) ADQ.AOF(progressButtonStage, ProgressButtonStageSerializer.A00, serialDescriptor, 1);
                        i |= 2;
                    } else {
                        throw new X6K(ANz);
                    }
                } else {
                    progressButtonState = (ProgressButtonState) ADQ.AOF(progressButtonState, ProgressButtonStateSerializer.A00, serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                ADQ.ASc(serialDescriptor);
                return new ProgressButton(progressButtonStage, progressButtonState, i);
            }
        }
    }

    @Override // X.C3R9, X.C3RA, X.C3RB
    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.X17, X.3Sp, java.lang.Object] */
    static {
        ?? obj = new Object();
        A00 = obj;
        C73833Sq c73833Sq = new C73833Sq("com.shopify.checkout.models.ProgressButton", obj, 2);
        c73833Sq.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        c73833Sq.A00("stage");
        A01 = c73833Sq;
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] childSerializers() {
        return new C3R9[]{ProgressButtonStateSerializer.A00, ProgressButtonStageSerializer.A00};
    }

    @Override // X.C3RA
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ProgressButton progressButton = (ProgressButton) obj;
        boolean A1R = AbstractC167007dF.A1R(0, encoder, progressButton);
        SerialDescriptor serialDescriptor = A01;
        C4D8 ADR = encoder.ADR(serialDescriptor);
        ADR.ASH(progressButton.A01, ProgressButtonStateSerializer.A00, serialDescriptor, 0);
        ADR.ASH(progressButton.A00, ProgressButtonStageSerializer.A00, serialDescriptor, A1R ? 1 : 0);
        ADR.ASc(serialDescriptor);
    }

    @Override // X.InterfaceC73823Sp
    public final C3R9[] typeParametersSerializers() {
        return AbstractC54355O0n.A00;
    }
}
