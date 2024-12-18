package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AMf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23127AMf {
    public C52253NAt A00;
    public final Context A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final AHD A05;
    public final C8NW A06;
    public final OXN A07;
    public final String A08;
    public final InterfaceC57994Pne A09;
    public final String A0A;

    public static void A04(C194808jg c194808jg, C23127AMf c23127AMf, AM0 am0) {
        String str;
        C183748Cz c183748Cz = null;
        Integer num = C05F.A00;
        String str2 = c23127AMf.A0A;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = c194808jg.A05().iterator();
        while (it.hasNext()) {
            Drawable A0Z = AbstractC166987dD.A0Z(it);
            if (A0Z instanceof AbstractC202348xE) {
                A1E.add(((AbstractC202348xE) A0Z).A02());
                if ((A0Z instanceof C221099pX) && ((C221099pX) A0Z).A00 == EnumC53230NgS.A05) {
                    c183748Cz = new C183748Cz(0.5f, 0.85f);
                }
            } else {
                if (A0Z instanceof AbstractC202358xF) {
                    str = ((C221049pS) ((AbstractC202358xF) A0Z)).A01;
                } else if (A0Z instanceof AbstractC202368xG) {
                    str = ((C221059pT) ((AbstractC202368xG) A0Z)).A02;
                } else if (A0Z instanceof AbstractC202378xH) {
                    str = ((C221109pY) ((AbstractC202378xH) A0Z)).A03;
                }
                A1E.add(str);
            }
        }
        c23127AMf.A06.A0w(c194808jg, C5GJ.ASSET_PICKER, null, new C8FC((C8D0) c183748Cz, (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) str2, (String) null, (List) null, 0.4f, 8.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, false, true, true, true, true, true, false, false), am0.A00, null, null, null, null, A1E);
    }

    public C23127AMf(Context context, AbstractC018607g abstractC018607g, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C198308pf c198308pf, C8NW c8nw, String str) {
        C56736PGe c56736PGe = new C56736PGe(this, 0);
        this.A09 = c56736PGe;
        this.A01 = context;
        this.A06 = c8nw;
        this.A0A = "StickerOverlayController";
        this.A04 = userSession;
        this.A05 = new AHD(userSession, c198308pf);
        this.A07 = C1XJ.A00.A0I(context, abstractC018607g, userSession, c56736PGe);
        this.A02 = abstractC59962oe;
        this.A03 = interfaceC11380iw;
        this.A08 = str;
        this.A00 = C1XJ.A00.A0X(userSession);
    }

    public static C194808jg A00(AM0 am0, InteractiveDrawableContainer interactiveDrawableContainer) {
        String Ap3;
        Product product = am0.A00;
        if (product != null) {
            return A01(interactiveDrawableContainer, product);
        }
        List list = am0.A04;
        if (list != null) {
            return A02(interactiveDrawableContainer, list);
        }
        ProductCollection productCollection = am0.A01;
        if (productCollection != null) {
            Iterator it = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
            while (it.hasNext()) {
                C194808jg c194808jg = (C194808jg) it.next();
                if (c194808jg.A0E(AbstractC202368xG.class)) {
                    ArrayList A06 = c194808jg.A06(AbstractC202368xG.class);
                    if (((C221059pT) ((AbstractC202368xG) A06.get(0))).A01.Ap3() != null) {
                        String Ap32 = ((C221059pT) ((AbstractC202368xG) A06.get(0))).A01.Ap3();
                        if (productCollection.Ap3() == null) {
                            Ap3 = "";
                        } else {
                            Ap3 = productCollection.Ap3();
                        }
                        if (Ap32.equals(Ap3)) {
                            return c194808jg;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        User user = am0.A03;
        if (user != null) {
            Iterator it2 = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
            while (it2.hasNext()) {
                C194808jg c194808jg2 = (C194808jg) it2.next();
                if (c194808jg2.A0E(AbstractC202378xH.class)) {
                    String A00 = AbstractC76433bn.A00(((C221109pY) ((AbstractC202378xH) AbstractC166997dE.A0k(c194808jg2.A06(AbstractC202378xH.class)))).A02);
                    A00.getClass();
                    if (A00.equals(AbstractC76433bn.A00(user))) {
                        return c194808jg2;
                    }
                }
            }
            return null;
        }
        throw AbstractC166987dD.A1D("Unsupported Shopping sticker type");
    }

    public static C194808jg A01(InteractiveDrawableContainer interactiveDrawableContainer, Product product) {
        Iterator it = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
        while (it.hasNext()) {
            C194808jg c194808jg = (C194808jg) it.next();
            if (c194808jg.A0E(AbstractC202348xE.class)) {
                ArrayList A06 = c194808jg.A06(AbstractC202348xE.class);
                if (product == null || ((AbstractC202348xE) AbstractC166997dE.A0k(A06)).A01().A0H.equals(product.A0H)) {
                    return c194808jg;
                }
            }
        }
        return null;
    }

    public static C194808jg A02(InteractiveDrawableContainer interactiveDrawableContainer, List list) {
        Iterator it = interactiveDrawableContainer.A0T(C194808jg.class).iterator();
        while (it.hasNext()) {
            C194808jg c194808jg = (C194808jg) it.next();
            if (c194808jg.A0E(AbstractC202358xF.class)) {
                ArrayList A06 = c194808jg.A06(AbstractC202358xF.class);
                if (list == null || ((C221049pS) ((AbstractC202358xF) AbstractC166997dE.A0k(A06))).A02.equals(list)) {
                    return c194808jg;
                }
            }
        }
        return null;
    }

    public static void A03(Spannable spannable, C23127AMf c23127AMf, AM0 am0, EnumC53230NgS enumC53230NgS, C190888ck c190888ck, String str, int i, boolean z, boolean z2) {
        Context context;
        ArrayList A03;
        AbstractC202348xE c221079pV;
        Product product = am0.A00;
        if (product != null) {
            if (C18U.A06(C06090Tz.A05, c23127AMf.A04, 36319836887916231L)) {
                AHD ahd = c23127AMf.A05;
                context = c23127AMf.A01;
                A03 = AbstractC166997dE.A12(context, 0);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size);
                int A01 = AbstractC188878Yd.A01(context);
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -1563501812) {
                        if (hashCode != 1080478002) {
                            if (hashCode == 1408761647 && str.equals("product_item_list_cell_sticker_black_white")) {
                                A03.add(new C221069pU(context, "product_item_list_cell_sticker_black_white"));
                                c221079pV = new C221069pU(context, "product_item_list_cell_sticker_subtle");
                                A03.add(c221079pV);
                            }
                        } else if (str.equals("product_item_tile_sticker_black_white")) {
                            c221079pV = new C221079pV(context);
                            A03.add(c221079pV);
                        }
                    } else if (str.equals("product_item_text_sticker_vibrant")) {
                        A03.add(new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_vibrant"));
                        A03.add(new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_subtle"));
                        A03.add(new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_black_white"));
                        Integer A00 = AHD.A00(ahd.A00);
                        if (A00 != null) {
                            int intValue = A00.intValue();
                            C221099pX c221099pX = new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_media_primary_color");
                            C9SA c9sa = c221099pX.A04;
                            c9sa.A02 = intValue;
                            c9sa.invalidateSelf();
                            A03.add(c221099pX);
                        }
                    }
                }
            } else {
                AHD ahd2 = c23127AMf.A05;
                context = c23127AMf.A01;
                A03 = ahd2.A01(context);
            }
            String obj = spannable.toString();
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                Drawable A0Z = AbstractC166987dD.A0Z(it);
                ((AbstractC202348xE) A0Z).A03(product, obj, i, z);
                if ((A0Z instanceof C221099pX) && enumC53230NgS == EnumC53230NgS.A05) {
                    C221099pX c221099pX2 = (C221099pX) A0Z;
                    c221099pX2.A00 = enumC53230NgS;
                    c221099pX2.A02 = z2;
                }
                AbstractC23114AHd.A02(A0Z, c190888ck);
            }
        } else {
            List list = am0.A04;
            if (list != null) {
                AHD ahd3 = c23127AMf.A05;
                context = c23127AMf.A01;
                A03 = ahd3.A04(context, list);
                Iterator it2 = A03.iterator();
                while (it2.hasNext()) {
                    Drawable A0Z2 = AbstractC166987dD.A0Z(it2);
                    ((AbstractC202358xF) A0Z2).A01(spannable.toString(), i);
                    AbstractC23114AHd.A02(A0Z2, c190888ck);
                }
            } else {
                ProductCollection productCollection = am0.A01;
                if (productCollection != null && am0.A00() != null) {
                    AHD ahd4 = c23127AMf.A05;
                    context = c23127AMf.A01;
                    am0.A00();
                    A03 = ahd4.A02(context, productCollection);
                    Iterator it3 = A03.iterator();
                    while (it3.hasNext()) {
                        Drawable A0Z3 = AbstractC166987dD.A0Z(it3);
                        if (A0Z3 instanceof AbstractC202368xG) {
                            AbstractC202368xG abstractC202368xG = (AbstractC202368xG) A0Z3;
                            abstractC202368xG.A00(i);
                            AbstractC23114AHd.A02(abstractC202368xG, c190888ck);
                        }
                    }
                } else {
                    User user = am0.A03;
                    if (user != null) {
                        AHD ahd5 = c23127AMf.A05;
                        context = c23127AMf.A01;
                        A03 = ahd5.A03(context, user);
                        Iterator it4 = A03.iterator();
                        while (it4.hasNext()) {
                            Drawable A0Z4 = AbstractC166987dD.A0Z(it4);
                            ((AbstractC202378xH) A0Z4).A00(spannable.toString(), i);
                            AbstractC23114AHd.A02(A0Z4, c190888ck);
                        }
                    } else {
                        throw AbstractC166987dD.A1D("Unsupported Shopping sticker type");
                    }
                }
            }
        }
        A04(new C194808jg(context, c23127AMf.A04, A03), c23127AMf, am0);
    }

    public static void A05(C23127AMf c23127AMf, C54567O8t c54567O8t) {
        C193328hC c193328hC = new C193328hC(c23127AMf.A01);
        c193328hC.A05 = c54567O8t.A01;
        c193328hC.A0r(c54567O8t.A00);
        c193328hC.A0s(true);
        c193328hC.A0t(true);
        c193328hC.A07();
        AbstractC166987dD.A1W(c193328hC);
    }
}
