package X;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.HLf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39151HLf extends C33H {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ EnumC39563HdZ A01;
    public final /* synthetic */ C41121IIm A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ Product A05;
    public final /* synthetic */ String A06;

    @Override // X.C33H, X.C33I
    public final boolean Dtk(C5SW c5sw) {
        C14360o3.A0B(c5sw, 0);
        int ordinal = this.A01.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                if (ordinal != 2) {
                    throw B4Z.A00();
                }
            } else {
                C1XJ c1xj = C1XJ.A00;
                Context context = this.A00.getContext();
                AbstractC31171DnF.A1P(context);
                Product product = this.A05;
                String A0d = AbstractC37302Gc3.A0d(product);
                C14360o3.A0A(A0d);
                c1xj.A0m((FragmentActivity) context, EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, this.A03, null, A0d, this.A02.A02, this.A04.getModuleName(), "global_cart_icon", null, null, null, null, null, product.A0H, null, null, this.A06, null, false);
            }
        }
        return true;
    }

    public C39151HLf(ImageView imageView, EnumC39563HdZ enumC39563HdZ, C41121IIm c41121IIm, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str) {
        this.A01 = enumC39563HdZ;
        this.A00 = imageView;
        this.A05 = product;
        this.A03 = userSession;
        this.A02 = c41121IIm;
        this.A04 = interfaceC60442pS;
        this.A06 = str;
    }
}
