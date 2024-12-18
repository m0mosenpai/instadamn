package X;

import android.content.Context;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.Iir, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41960Iir implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public ViewOnClickListenerC41960Iir(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(914033874);
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
                if (interfaceC16620sF != null) {
                    interfaceC16620sF.invoke(this.A03, true);
                }
                AbstractC41286IPb.A01((UserSession) this.A02, this.A03, true);
                i = 37392563;
                break;
            case 1:
                A05 = C0f9.A05(527579192);
                JGT jgt = (JGT) this.A01;
                if (jgt != null) {
                    jgt.Dyh((ProductVariantDimension) this.A02, this.A03);
                }
                i = 1236284863;
                break;
            case 2:
                A05 = C0f9.A05(-1051994707);
                JGT jgt2 = (JGT) this.A01;
                if (jgt2 != null) {
                    jgt2.Dyh((ProductVariantDimension) this.A02, this.A03);
                }
                i = 2017713403;
                break;
            case 3:
                A05 = C0f9.A05(-771346747);
                HZ7.A00(FeaturedProductPermissionStatus.A04, (HZ7) this.A02, (IN1) this.A01, this.A03);
                i = -1095198990;
                break;
            case 4:
                A05 = C0f9.A05(1834757704);
                Product A02 = ((ProductFeedItem) this.A02).A02();
                if (A02 != null) {
                    ((JII) this.A01).Db4(new C38675GzG(null, this.A03, null, 2045), A02);
                }
                i = -2119295374;
                break;
            case 5:
                A05 = C0f9.A05(-889419176);
                Product A022 = ((ProductFeedItem) this.A02).A02();
                if (A022 != null) {
                    ((JII) this.A01).Db4(new C38675GzG(null, this.A03, null, 2045), A022);
                }
                i = -1903428806;
                break;
            case 6:
                A05 = C0f9.A05(1908124822);
                C153936w2 c153936w2 = (C153936w2) this.A01;
                String str = this.A03;
                C153936w2.A04(C153936w2.A00(null, null, Boolean.valueOf(AbstractC25229BEm.A1Z(str)), null, null, null, null, null, null, null, null, null, null, null, str, null), c153936w2, PublicKeyCredentialControllerUtility.JSON_KEY_USER, MSV.A00(1086), "tap_close", null, null);
                AbstractC31179DnN.A0x((Fragment) this.A02);
                i = -1645464767;
                break;
            case 7:
                A05 = C0f9.A05(-2018826039);
                C38310Gsw c38310Gsw = (C38310Gsw) this.A01;
                if (!c38310Gsw.A04) {
                    C38921HBt c38921HBt = (C38921HBt) this.A02;
                    C38310Gsw c38310Gsw2 = c38921HBt.A00;
                    if (c38310Gsw2 != null) {
                        c38310Gsw2.setIsPlaying(false);
                    }
                    c38310Gsw.setIsPlaying(true);
                    c38921HBt.A00 = c38310Gsw;
                    String str2 = this.A03;
                    c38921HBt.A03 = str2;
                    InterfaceC43431JGv interfaceC43431JGv = c38921HBt.A01;
                    if (interfaceC43431JGv != null) {
                        interfaceC43431JGv.Cy1(str2);
                    }
                }
                i = 1293995683;
                break;
            case 8:
                A05 = C0f9.A05(67625995);
                C38921HBt c38921HBt2 = (C38921HBt) this.A02;
                String str3 = this.A03;
                InterfaceC09390do interfaceC09390do = c38921HBt2.A07;
                boolean z = true;
                if (((List) ((MVS) interfaceC09390do.getValue()).A05.getValue()).size() != 1) {
                    z = false;
                }
                FragmentActivity activity = c38921HBt2.getActivity();
                if (activity != null) {
                    AbstractC40915IAn.A00(activity, (MVS) interfaceC09390do.getValue(), str3, new C57259Pbh(str3, c38921HBt2, 34), z);
                }
                i = -1639360937;
                break;
            default:
                A05 = C0f9.A05(515558907);
                C38921HBt c38921HBt3 = (C38921HBt) this.A02;
                Fragment fragment = c38921HBt3.mParentFragment;
                if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
                    Context context = (Context) this.A01;
                    String str4 = this.A03;
                    InterfaceC09390do interfaceC09390do2 = c38921HBt3.A06;
                    C50674MYs A0W = AbstractC31177DnL.A0W(context, interfaceC09390do2);
                    A0W.A03(new ViewOnClickListenerC41960Iir(context, c38921HBt3, str4, 8), 2131955316);
                    A0W.A01(new ViewOnClickListenerC35670Fp5(31, c38921HBt3, context), 2131972414);
                    new C31727DwY(A0W, c189478aR).A08(AbstractC25225BEi.A0y(AbstractC166987dD.A0o(interfaceC09390do2)));
                }
                i = 1123455439;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
