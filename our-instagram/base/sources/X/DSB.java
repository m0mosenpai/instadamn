package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DSB extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSB(String str, Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        Long l;
        String str;
        String str2;
        User BSW;
        String str3;
        switch (this.A00) {
            case 3:
                String str4 = (String) obj;
                ((C5yI) this.A01).DSg(str4, this.A02, AbstractC25231BEo.A1W(obj2, str4), null);
                break;
            case 4:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1088500706, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNineSixteenLayout.<anonymous> (BackdropNineSixteenLayout.kt:123)");
                    }
                    if (((C26197BiN) this.A01).A02 == C77.A03 && (str3 = this.A02) != null && str3.length() != 0) {
                        Modifier A0A = AbstractC118175Wb.A0A(Modifier.A00, 48.0f, 14.0f);
                        InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                        int A00 = C5X2.A00(c5Tl);
                        C117505Tk c117505Tk = (C117505Tk) c5Tl;
                        C59P A04 = C117505Tk.A04(c117505Tk);
                        Modifier A01 = C5X3.A01(c5Tl, A0A);
                        AbstractC25233BEq.A11(c5Tl, c117505Tk);
                        AbstractC25231BEo.A12(c5Tl, A0b, A04);
                        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                        }
                        AbstractC25225BEi.A1K(c5Tl, A01);
                        AbstractC28309Cdv.A02(str3, AbstractC136736Hc.A00(c5Tl, 2131965949), c5Tl, 0);
                        c5Tl.ASW();
                    }
                    if (C0fH.A02()) {
                        i = -1247085508;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 5:
            case 6:
                C38321qM c38321qM = (C38321qM) obj;
                List list = (List) obj2;
                boolean A1R = AbstractC167007dF.A1R(0, c38321qM, list);
                AnonymousClass389 anonymousClass389 = (AnonymousClass389) this.A01;
                C9GR.A01(anonymousClass389.A00.requireContext(), null, 2131962389, 0);
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(((C38819H7k) it.next()).A02);
                }
                List B5P = c38321qM.A0C.B5P();
                if (B5P != null) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = B5P.iterator();
                    while (true) {
                        Object obj3 = null;
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            JLH BcS = ((InterfaceC43546JLg) next).BcS();
                            if (BcS != null) {
                                obj3 = BcS.BF7();
                            }
                            if (A0q.contains(obj3)) {
                                A1E.add(next);
                            }
                        } else {
                            Iterator it3 = A1E.iterator();
                            while (it3.hasNext()) {
                                InterfaceC43546JLg interfaceC43546JLg = (InterfaceC43546JLg) it3.next();
                                C38A c38a = anonymousClass389.A04;
                                JLH BcS2 = interfaceC43546JLg.BcS();
                                if (BcS2 != null) {
                                    l = BcS2.BF7();
                                } else {
                                    l = null;
                                }
                                String valueOf = String.valueOf(l);
                                FeaturedProductPermissionStatus featuredProductPermissionStatus = FeaturedProductPermissionStatus.A09;
                                ProductDetailsProductItemDictIntf Bgl = interfaceC43546JLg.Bgl();
                                if (Bgl == null || (str = Bgl.getProductId()) == null) {
                                    str = "";
                                }
                                ProductDetailsProductItemDictIntf Bgl2 = interfaceC43546JLg.Bgl();
                                if (Bgl2 == null || (BSW = Bgl2.BSW()) == null || (str2 = AbstractC76433bn.A00(BSW)) == null) {
                                    str2 = "";
                                }
                                C14360o3.A0B(valueOf, A1R ? 1 : 0);
                                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c38a.A00, "instagram_shopping_tagged_user_featured_product_permission_status_update_success");
                                A0f.AAP("action", featuredProductPermissionStatus.A00);
                                A0f.A9K("product_id", AbstractC25228BEl.A13(str));
                                A0f.AAK(C4SX.A00(str2), "merchant_id");
                                A0f.A9K(MSV.A00(1488), AbstractC25228BEl.A13(valueOf));
                                A0f.AAQ(C128205qp.A00(c38a.A01, c38321qM), MSV.A00(1177));
                                A0f.Cht();
                            }
                            break;
                        }
                    }
                }
                break;
            case 7:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1143288909, "instagram.features.clips.bottomsheet.blend.ui.BlendSuggestedUsersForReelListComponent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BlendContextBottomSheetComposables.kt:156)");
                    }
                    if (((java.util.Set) ((C26236Bj5) this.A01).A01).contains(this.A02)) {
                        C1130158n c1130158n = Modifier.A00;
                        Modifier A0x = AbstractC25232BEp.A0x(c5Tl, AbstractC118175Wb.A08(C6L7.A03(AbstractC118185Wd.A0C(c1130158n, 18.0f), C5WF.A00, 3.0f, AbstractC25226BEj.A06(c5Tl)), 3.0f));
                        InterfaceC1127857k A0b2 = AbstractC25226BEj.A0b(false);
                        int A002 = C5X2.A00(c5Tl);
                        C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                        C59P A042 = C117505Tk.A04(c117505Tk2);
                        Modifier A012 = C5X3.A01(c5Tl, A0x);
                        AbstractC25233BEq.A11(c5Tl, c117505Tk2);
                        AbstractC25231BEo.A12(c5Tl, A0b2, A042);
                        InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                        if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                        }
                        AbstractC25225BEi.A1K(c5Tl, A012);
                        C5YS.A08(c5Tl, AbstractC118185Wd.A0C(c1130158n, 14.0f), C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_filled_24, 0), C5YD.A00(c5Tl, 2131965099), 384, C5XL.A00(c5Tl).A0Q);
                        c5Tl.ASW();
                    }
                    if (C0fH.A02()) {
                        i = -680405631;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                AbstractC167017dG.A1N(str5, str6);
                ((C5yI) this.A01).DjJ(this.A02, str5, str6);
                break;
        }
        return C0eB.A00;
    }
}
