package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AjN implements BDS {
    public final Context A00;
    public final C193158gv A01;

    @Override // X.BDS
    public final String getName() {
        return "ImageSceneUnderstandingScanner";
    }

    @Override // X.BDS
    public final List AE2() {
        return AbstractC16960so.A1Q(new C220289oE(224), new C220279oD());
    }

    @Override // X.BDS
    public final boolean EM1(Bitmap bitmap, Medium medium, C189328a9 c189328a9) {
        String str;
        Context context = this.A00;
        boolean z = false;
        C15900qk.A01();
        if (C15900qk.A00(context, false) < 314572800) {
            z = true;
        }
        if (!z) {
            if (bitmap == null) {
                str = "Bitmap is null";
            } else {
                AbstractC223599u2 E58 = this.A01.E58(new ACP(AbstractC166987dD.A1J("CONCEPTS")), AbstractC166987dD.A1J(new C9VC(bitmap)), C25093B8p.A00);
                if (E58 instanceof C9VJ) {
                    List list = ((C9VJ) E58).A00;
                    ArrayList<C9VH> A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        if (obj instanceof C9VH) {
                            A1E.add(obj);
                        }
                    }
                    ArrayList A0q = AbstractC167017dG.A0q(A1E);
                    for (C9VH c9vh : A1E) {
                        A0q.add(new AKS(C8KX.A03, c9vh.A00, c9vh.A01, null));
                    }
                    AbstractC23112AHb.A02(c189328a9, A0q);
                    return true;
                }
                str = "Failed to predict scene recognition output";
            }
            C0K8.A0C("ImageSceneUnderstandingScanner", str);
        }
        return false;
    }

    public AjN(Context context, C8EC c8ec) {
        this.A00 = context;
        C193158gv c193158gv = new C193158gv(c8ec);
        c193158gv.Chb();
        this.A01 = c193158gv;
    }
}
