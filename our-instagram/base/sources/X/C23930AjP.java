package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.AjP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23930AjP implements BDS {
    public final long A00;
    public final Context A01;
    public final C8KY A02;

    @Override // X.BDS
    public final boolean EM1(Bitmap bitmap, Medium medium, C189328a9 c189328a9) {
        ArrayList A01;
        Context context = this.A01;
        C15900qk.A01();
        if (C15900qk.A00(context, false) >= 314572800) {
            if (!medium.Cff() && medium.A0C * 1000 >= this.A00) {
                C8KY c8ky = this.A02;
                if (bitmap != null) {
                    c8ky.A00 = new C203498z8(bitmap);
                    String str = c8ky.A02;
                    if (str != null) {
                        C193208h0 c193208h0 = c8ky.A03;
                        if (c193208h0 == null) {
                            c193208h0 = AbstractC193188gy.A00(str);
                            c8ky.A03 = c193208h0;
                        }
                        AbstractC203508z9 abstractC203508z9 = c8ky.A00;
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
                                C8KU c8ku = c8ky.A04;
                                c8ku.A01 = true;
                                Tensor[] tensorList = forward.toTensorList();
                                AKI aki = AKI.A00;
                                List list = c8ky.A05;
                                C14360o3.A0A(tensorList);
                                A01 = aki.A01(c8ku, list, tensorList, true);
                            } else {
                                IValue[] tuple = forward.toTuple();
                                List list2 = c8ky.A05;
                                C14360o3.A0A(tuple);
                                A01 = akh.A01(c8ky.A04, list2, tuple);
                            }
                            AbstractC23112AHb.A01(c189328a9, A01);
                        }
                    } else {
                        InterfaceC203488z7 interfaceC203488z7 = c8ky.A01;
                        if (interfaceC203488z7 != null) {
                            interfaceC203488z7.DaC(AbstractC166987dD.A1E());
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.BDS
    public final String getName() {
        return "SceneUnderstandingScanner";
    }

    @Override // X.BDS
    public final List AE2() {
        return AbstractC16960so.A1Q(new C220289oE(256), new C220279oD());
    }

    public C23930AjP(Context context, C8KU c8ku, UserSession userSession) {
        this.A01 = context;
        this.A02 = new C8KY(c8ku, AbstractC16960so.A1Q(C8KX.A03, C8KX.A02, C8KX.A06, C8KX.A04));
        this.A00 = System.currentTimeMillis() - (C60322pF.A00(userSession) * 86400000);
    }
}
