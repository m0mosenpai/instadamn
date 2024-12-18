package X;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextPaint;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.user.model.Product;
import go.Seq;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class J8U extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8U(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new J8U(obj, i));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [X.2pS, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C38685GzQ c38685GzQ;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.A00) {
            case 1:
                C38906HBd c38906HBd = (C38906HBd) this.A01;
                UserSession A0r = AbstractC166987dD.A0r(c38906HBd.A03);
                Bundle bundle = c38906HBd.mArguments;
                String str6 = null;
                if (bundle != null) {
                    str = bundle.getString("displayed_user_id");
                } else {
                    str = null;
                }
                Bundle bundle2 = c38906HBd.mArguments;
                if (bundle2 != null) {
                    arrayList = bundle2.getParcelableArrayList("merchants");
                } else {
                    arrayList = null;
                }
                ?? obj = new Object();
                String string = c38906HBd.requireArguments().getString("prior_module_name", "");
                C14360o3.A07(string);
                String A15 = AbstractC25225BEi.A15(c38906HBd.A04);
                Bundle bundle3 = c38906HBd.mArguments;
                if (bundle3 != null) {
                    str2 = bundle3.getString("media_id");
                } else {
                    str2 = null;
                }
                Bundle bundle4 = c38906HBd.mArguments;
                if (bundle4 != null) {
                    str3 = bundle4.getString("tracking_token");
                } else {
                    str3 = null;
                }
                AbstractC39667Hiw abstractC39667Hiw = c38906HBd.A00;
                if (abstractC39667Hiw == null) {
                    C14360o3.A0F("_delegate");
                    throw C00O.createAndThrow();
                }
                Bundle bundle5 = c38906HBd.mArguments;
                if (bundle5 != null) {
                    str6 = bundle5.getString("prior_submodule_name");
                }
                return new C39061HHl(A0r, obj, abstractC39667Hiw, str, string, A15, str2, str3, str6, arrayList);
            case 2:
                HCa hCa = (HCa) this.A01;
                C66392zG A0R = AbstractC31174DnI.A0R(hCa);
                A0R.A01(new HIK(hCa.requireActivity(), AbstractC166987dD.A0r(hCa.A08)));
                return AbstractC31173DnH.A0R(A0R, new HIA(hCa.requireContext()));
            case 3:
                return AbstractC31179DnN.A04(this.A01);
            case 4:
                return ((BaseBundle) ((HCa) this.A01).A02.getValue()).getString("merchant_id");
            case 5:
                return ((BaseBundle) ((HCa) this.A01).A02.getValue()).getString("prior_module_name");
            case 6:
                return ((BaseBundle) ((HCa) this.A01).A02.getValue()).getString("prior_submodule_name");
            case 7:
                HCa hCa2 = (HCa) this.A01;
                C41636IbR c41636IbR = new C41636IbR(hCa2, AbstractC166987dD.A0r(hCa2.A08), hCa2, EnumC39622HeW.A0T, AbstractC25225BEi.A15(hCa2.A09), AbstractC25225BEi.A15(hCa2.A04), AbstractC25225BEi.A15(hCa2.A05));
                c41636IbR.A00 = (C57112jm) hCa2.A0B.getValue();
                return c41636IbR.A02();
            case 8:
                return ((BaseBundle) ((HCa) this.A01).A02.getValue()).getString("product_id");
            case 9:
                return AbstractC61112qZ.A00((Bundle) ((HCa) this.A01).A02.getValue());
            case 10:
            case 21:
                return this.A01;
            case 11:
            case 22:
                return AbstractC25226BEj.A1C(this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 23:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                HCa hCa3 = (HCa) this.A01;
                String A152 = AbstractC25225BEi.A15(hCa3.A07);
                C14360o3.A0A(A152);
                String A153 = AbstractC25225BEi.A15(hCa3.A03);
                C14360o3.A0A(A153);
                return new C39051HHb(hCa3, AbstractC166987dD.A0r(hCa3.A08), hCa3, A152, A153, AbstractC25225BEi.A15(hCa3.A09));
            case 14:
                HCK hck = (HCK) this.A01;
                return new IL8(hck.requireContext(), hck, (C62862tP) hck.A08.getValue(), hck, AbstractC166987dD.A0r(hck.A0C), hck.A04, hck.A05, (C41046IFp) hck.A0F.getValue());
            case Process.SIGTERM /* 15 */:
                return AbstractC153636vY.A00(AbstractC31179DnN.A04(this.A01), ShoppingTaggingFeedArguments.class, AbstractC111324zv.A00(3202));
            case 16:
                HCK hck2 = (HCK) this.A01;
                return C62862tP.A03(hck2, AbstractC166987dD.A0o(hck2.A0C), null);
            case 17:
                HCK hck3 = (HCK) this.A01;
                return new C41234IMz(hck3, AbstractC166987dD.A0r(hck3.A0C), (ShoppingTaggingFeedArguments) hck3.A07.getValue());
            case 18:
                HCK hck4 = (HCK) this.A01;
                return new C41691IdK(hck4.requireContext(), new C61972ry(hck4.requireContext(), AbstractC018607g.A00(hck4), null), AbstractC166987dD.A0r(hck4.A0C), AbstractC37301Gc2.A0N(hck4), (ShoppingTaggingFeedArguments) hck4.A07.getValue());
            case Process.SIGSTOP /* 19 */:
                HCK hck5 = (HCK) this.A01;
                return new C52942bb(new HHT(AbstractC166987dD.A0r(hck5.A0C), ((ShoppingTaggingFeedArguments) hck5.A07.getValue()).A06), hck5.requireActivity()).A00(C38329GtO.class);
            case 20:
                return AbstractC61112qZ.A00(AbstractC31179DnN.A04(this.A01));
            case 24:
                return new HHN((C41691IdK) ((HCK) this.A01).A0A.getValue());
            case 25:
                HCK hck6 = (HCK) this.A01;
                return new C41046IFp(AbstractC166987dD.A0r(hck6.A0C), (C57112jm) hck6.A0G.getValue(), AbstractC37301Gc2.A0N(hck6));
            case 26:
                TextPaint textPaint = new TextPaint();
                Fragment fragment = (Fragment) this.A01;
                textPaint.setTextSize(AbstractC166997dE.A0N(fragment).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
                fragment.requireContext().getColor(AbstractC53242c7.A07(fragment.getContext()));
                textPaint.setFakeBoldText(true);
                return textPaint;
            case 27:
                return new C36284Fzb((UserSession) this.A01);
            case 28:
                return new C3BU((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C19K A01 = AbstractC24771Iv.A01(1165749434, 3);
                UserSession userSession = (UserSession) this.A01;
                return new C48522LdK(AbstractC40691uc.A01(userSession), C1QS.A00(userSession), A01);
            case 30:
            case 31:
                ((InterfaceC31040Dke) this.A01).DgF();
                break;
            case 32:
                C41172IKl c41172IKl = (C41172IKl) this.A01;
                return new C41593Iag(c41172IKl.A00, c41172IKl.A02, c41172IKl.A03.A0B, c41172IKl.A04, c41172IKl.A07);
            case 33:
                C41172IKl c41172IKl2 = (C41172IKl) this.A01;
                return new C41581IaU(c41172IKl2.A00, c41172IKl2.A02, c41172IKl2.A03.A0D);
            case 34:
                return new IDD(((C41172IKl) this.A01).A03.A0F);
            case 35:
                return new IDC(((C41172IKl) this.A01).A03.A0E);
            case 36:
                C41172IKl c41172IKl3 = (C41172IKl) this.A01;
                return new C41580IaT(c41172IKl3.A02, c41172IKl3.A03.A0G, c41172IKl3.A06);
            case 37:
                C41172IKl c41172IKl4 = (C41172IKl) this.A01;
                return new IIN(c41172IKl4.A00, c41172IKl4.A01, c41172IKl4.A02, c41172IKl4.A03.A0H);
            case 38:
                C41172IKl c41172IKl5 = (C41172IKl) this.A01;
                return new IDE(c41172IKl5.A00, c41172IKl5.A03.A0I);
            case 39:
                C41172IKl c41172IKl6 = (C41172IKl) this.A01;
                return new IIO(c41172IKl6.A00, c41172IKl6.A01, c41172IKl6.A02, c41172IKl6.A03.A0J);
            case 40:
                String str7 = ((C38332GtR) this.A01).A08.A0J;
                if (str7 != null) {
                    return new C69749Vuj(new Object[]{str7}, 2131968154);
                }
                return null;
            case Seq.NULL_REFNUM /* 41 */:
                Product product = ((C38332GtR) this.A01).A08;
                if (!product.A05() || (str4 = product.A0G) == null || (str5 = product.A0L) == null) {
                    return null;
                }
                return new C69749Vuj(new Object[]{str5, str4}, 2131969994);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
            case 43:
                return AnonymousClass189.A00((UserSession) this.A01);
            case 44:
                C38326GtL c38326GtL = (C38326GtL) this.A01;
                return c38326GtL.A03.invoke(AbstractC141776au.A00(c38326GtL));
            case 45:
                C41614Ib4.A00(((C42347Ip9) this.A01).A00);
                return AbstractC166997dE.A0b();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                if (AbstractC37302Gc3.A1a(((C42347Ip9) this.A01).A00)) {
                    c38685GzQ = new C38685GzQ((AbstractC39668Hix) null, (Integer) null, 7);
                } else {
                    c38685GzQ = null;
                }
                return C10E.A00(new C38688GzT(c38685GzQ));
            case 47:
                C42274Iny c42274Iny = new C42274Iny(C13920nI.A00);
                AbstractC25651Mw.A00((AbstractC12990ll) this.A01).A01(c42274Iny, C3HW.class);
                return c42274Iny;
            case 48:
                return new C55056OaB((UserSession) this.A01);
            case 49:
                ((C38648Gyp) this.A01).A06.invoke();
                break;
        }
        return C0eB.A00;
    }
}
