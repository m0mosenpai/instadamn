package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.effect.AREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.user.model.Product;
import java.util.LinkedHashSet;

/* renamed from: X.NFp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52373NFp extends C3PD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C52373NFp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        String str;
        int i;
        int i2;
        InterfaceC57843Pl9 p7w;
        Object value;
        switch (this.A00) {
            case 0:
                C51173MjH c51173MjH = (C51173MjH) this.A01;
                ProductAREffectContainer productAREffectContainer = c51173MjH.A0F;
                if (productAREffectContainer != null) {
                    ProductItemWithAR productItemWithAR = productAREffectContainer.A00;
                    AbstractC51363MmO abstractC51363MmO = (AbstractC51363MmO) this.A02;
                    ImageView A00 = abstractC51363MmO.A00();
                    TextView A01 = abstractC51363MmO.A01();
                    Context context = A00.getContext();
                    boolean z = !AbstractC1563570f.A00(c51173MjH.A09).A03(AbstractC38048Gob.A01(productAREffectContainer.A00.A01));
                    int i3 = R.drawable.instagram_save_pano_outline_24;
                    if (z) {
                        i3 = R.drawable.instagram_save_pano_filled_24;
                    }
                    AbstractC166997dE.A19(context, A00, i3);
                    int i4 = 2131953141;
                    if (z) {
                        i4 = 2131953143;
                    }
                    AbstractC166987dD.A1P(context, A01, i4);
                    C55907Ory c55907Ory = c51173MjH.A02;
                    if (c55907Ory == null) {
                        return true;
                    }
                    N75 n75 = c55907Ory.A0D;
                    Context context2 = n75.getContext();
                    FragmentActivity activity = n75.getActivity();
                    if (activity == null || context2 == null) {
                        return true;
                    }
                    Product A012 = AbstractC38048Gob.A01(productItemWithAR.A01);
                    C64972wv A02 = AbstractC64962wu.A02(context2, activity, c55907Ory.A0B, c55907Ory.A0F, C55907Ory.__redex_internal_original_name, null, null, true);
                    String A002 = AbstractC76433bn.A00(A012.A0B);
                    A002.getClass();
                    A02.A02(A012, A002).A00();
                    return true;
                }
                AbstractC12120kG.A01("EffectInfoOptionsAdapter", "Attempting to save product to wishlist, but product is null");
                return true;
            case 1:
                Context context3 = ((C51173MjH) this.A01).A07;
                String obj = this.A02.toString();
                String string = context3.getString(2131961684);
                AbstractC167017dG.A1P(obj, string);
                C69797Vvh c69797Vvh = new C69797Vvh(context3);
                c69797Vvh.A01.A0C = obj;
                c69797Vvh.A08(string);
                c69797Vvh.A04(DialogInterfaceOnClickListenerC55295OgI.A00, 2131961683);
                AbstractC50523MSb.A0p(c69797Vvh);
                return false;
            case 2:
                C51173MjH c51173MjH2 = (C51173MjH) this.A01;
                String str2 = c51173MjH2.A0H;
                AREffect aREffect = c51173MjH2.A0E;
                AbstractC51363MmO abstractC51363MmO2 = (AbstractC51363MmO) this.A02;
                ImageView A003 = abstractC51363MmO2.A00();
                TextView A013 = abstractC51363MmO2.A01();
                C55907Ory c55907Ory2 = c51173MjH2.A01;
                c55907Ory2.getClass();
                Context context4 = A003.getContext();
                boolean z2 = !c51173MjH2.A04;
                int i5 = R.drawable.instagram_save_pano_outline_24;
                if (z2) {
                    i5 = R.drawable.instagram_save_pano_filled_24;
                }
                AbstractC166997dE.A19(context4, A003, i5);
                int i6 = 2131953140;
                if (z2) {
                    i6 = 2131953142;
                }
                AbstractC166987dD.A1P(context4, A013, i6);
                int i7 = c51173MjH2.A06;
                switch (i7) {
                    case 0:
                        i2 = 2891;
                        str = AbstractC111324zv.A00(i2);
                        break;
                    case 1:
                        i2 = 2886;
                        str = AbstractC111324zv.A00(i2);
                        break;
                    case 2:
                        i2 = 2919;
                        str = AbstractC111324zv.A00(i2);
                        break;
                    case 3:
                        i2 = 2416;
                        str = AbstractC111324zv.A00(i2);
                        break;
                    case 4:
                        i2 = 2254;
                        str = AbstractC111324zv.A00(i2);
                        break;
                    case 5:
                        i = 210;
                        str = AbstractC43591JPw.A00(i);
                        break;
                    case 6:
                    case 7:
                    default:
                        AbstractC12120kG.A01("EffectInfoBottomSheetUtil", AnonymousClass001.A0O("Unsupported surface for bottomsheet:", i7));
                        i = 315;
                        str = AbstractC43591JPw.A00(i);
                        break;
                    case 8:
                        i2 = 2355;
                        str = AbstractC111324zv.A00(i2);
                        break;
                    case 9:
                        i = 1394;
                        str = AbstractC43591JPw.A00(i);
                        break;
                    case 10:
                        i = 461;
                        str = AbstractC43591JPw.A00(i);
                        break;
                    case 11:
                        str = "ig_map";
                        break;
                }
                if (z2) {
                    InterfaceC149856oe interfaceC149856oe = c55907Ory2.A0E;
                    if (interfaceC149856oe != null) {
                        interfaceC149856oe.DD6(true, str2);
                    }
                    C50881MeC c50881MeC = c55907Ory2.A01;
                    String str3 = c55907Ory2.A0G;
                    AbstractC166987dD.A1Z(new PZ9(c55907Ory2.A09, null, aREffect, c50881MeC, str, str3, null, 1), AbstractC37302Gc3.A08(c50881MeC, aREffect));
                    int i8 = c55907Ory2.A04;
                    if (i8 != 0 && i8 != 1) {
                        AbstractC23021Ah.A00(c55907Ory2.A0B).A0S();
                    }
                } else {
                    InterfaceC149856oe interfaceC149856oe2 = c55907Ory2.A0E;
                    if (interfaceC149856oe2 != null) {
                        interfaceC149856oe2.DD6(false, str2);
                    }
                    C50881MeC c50881MeC2 = c55907Ory2.A01;
                    AbstractC166987dD.A1Z(new C57161PZf(c55907Ory2.A09, null, c50881MeC2, aREffect, str, null, 9), AbstractC37302Gc3.A08(c50881MeC2, aREffect));
                }
                c51173MjH2.A04 = z2;
                return true;
            case 3:
                C50649MXo c50649MXo = (C50649MXo) this.A02;
                Integer num = (Integer) this.A01;
                UserSession userSession = c50649MXo.A04;
                AnonymousClass229.A01(userSession);
                C50649MXo.A00(c50649MXo, num);
                C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A004, A004.A3p, C23031Ai.A8c, 20, true);
                return true;
            case 4:
                C14360o3.A0B(view, 0);
                if (view.isEnabled()) {
                    view.performHapticFeedback(3);
                    C51354MmF c51354MmF = (C51354MmF) this.A02;
                    int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    QuickSnapArchiveViewModel quickSnapArchiveViewModel = c51354MmF.A0A;
                    String str4 = ((ODx) this.A01).A04;
                    C05A c05a = quickSnapArchiveViewModel.A0G;
                    if (((C9BR) c05a.getValue()).A02) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet((LinkedHashSet) ((C9BR) c05a.getValue()).A01);
                        if (linkedHashSet.contains(str4)) {
                            linkedHashSet.remove(str4);
                        } else {
                            linkedHashSet.add(str4);
                        }
                        do {
                            value = c05a.getValue();
                        } while (!c05a.AIi(value, new C9BR(linkedHashSet, ((C9BR) value).A02)));
                        p7w = C24001Akf.A00;
                    } else {
                        C191138dB.A00(EnumC53366NjH.TAP_ON_IMAGE_IN_ARCHIVE, quickSnapArchiveViewModel.A07, str4);
                        p7w = new P7W(str4);
                    }
                    QuickSnapArchiveViewModel.A01(p7w, quickSnapArchiveViewModel);
                    return true;
                }
                return false;
            case 5:
                ((AbstractC52184N7v) this.A01).A0E(((C70797WhA) this.A02).A02);
                return true;
            default:
                ((C51822MvQ) this.A01).A08.invoke(this.A02);
                return true;
        }
    }
}
