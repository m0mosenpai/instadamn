package X;

import android.graphics.Bitmap;
import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.8KY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8KY {
    public AbstractC203508z9 A00;
    public InterfaceC203488z7 A01;
    public String A02;
    public C193208h0 A03;
    public final C8KU A04;
    public final List A05;

    public final void A00(Bitmap bitmap) {
        ArrayList A01;
        this.A00 = new C203498z8(bitmap);
        String str = this.A02;
        if (str != null) {
            C193208h0 c193208h0 = this.A03;
            if (c193208h0 == null) {
                c193208h0 = AbstractC193188gy.A00(str);
                this.A03 = c193208h0;
            }
            AbstractC203508z9 abstractC203508z9 = this.A00;
            if ((abstractC203508z9 instanceof C203498z8) && c193208h0 != null) {
                AKH akh = AKH.A00;
                C14360o3.A0C(abstractC203508z9, "null cannot be cast to non-null type com.facebook.onecamera.components.ml.intf.MlInputBitmap");
                Bitmap bitmap2 = ((C203498z8) abstractC203508z9).A00;
                C14360o3.A0B(bitmap2, 0);
                if (bitmap2.getWidth() != 224 && bitmap2.getHeight() != 224) {
                    bitmap2 = AbstractC167027dH.A04(bitmap2);
                }
                IValue forward = c193208h0.A00.forward(IValue.from(AKH.A00(bitmap2)));
                if (forward.isTensorList()) {
                    C8KU c8ku = this.A04;
                    c8ku.A01 = true;
                    Tensor[] tensorList = forward.toTensorList();
                    AKI aki = AKI.A00;
                    List list = this.A05;
                    C14360o3.A0A(tensorList);
                    A01 = aki.A01(c8ku, list, tensorList, false);
                } else {
                    IValue[] tuple = forward.toTuple();
                    List list2 = this.A05;
                    C14360o3.A0A(tuple);
                    A01 = akh.A01(this.A04, list2, tuple);
                }
                InterfaceC203488z7 interfaceC203488z7 = this.A01;
                if (interfaceC203488z7 != null) {
                    interfaceC203488z7.DaC(A01);
                    return;
                }
                return;
            }
            return;
        }
        InterfaceC203488z7 interfaceC203488z72 = this.A01;
        if (interfaceC203488z72 == null) {
            return;
        }
        interfaceC203488z72.DaC(new ArrayList());
    }

    public C8KY(C8KU c8ku, List list) {
        this.A04 = c8ku;
        this.A05 = list;
        if (this.A02 == null) {
            c8ku.A04.A00(new C85Q() { // from class: X.8KZ
                @Override // X.C85Q
                public final void D6S(C1825788b c1825788b, Exception exc) {
                    if (c1825788b != null) {
                        C8KY c8ky = C8KY.this;
                        ModelPathsHolder modelPathsHolder = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.SceneUnderstanding);
                        if (modelPathsHolder != null) {
                            c8ky.A02 = modelPathsHolder.getModelPath(EnumC1825988f.A0W);
                        }
                    }
                }
            });
        }
    }
}
