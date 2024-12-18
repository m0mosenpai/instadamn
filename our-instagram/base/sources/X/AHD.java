package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AHD {
    public C198308pf A00;
    public final UserSession A01;

    public static final Integer A00(C198308pf c198308pf) {
        C18160v1 c18160v1;
        List list;
        Integer num;
        if (c198308pf != null) {
            if (c198308pf.A05.ordinal() != 0) {
                C195868lW c195868lW = c198308pf.A03;
                c195868lW.getClass();
                c18160v1 = c195868lW.A0U;
            } else {
                C183978Ee c183978Ee = c198308pf.A02;
                c183978Ee.getClass();
                c18160v1 = c183978Ee.A0I;
            }
            if (c18160v1 != null && (list = c18160v1.A02) != null && (num = (Integer) AbstractC001800i.A0J(list)) != null && AbstractC13950nL.A01(num.intValue()) <= 0.9f) {
                return num;
            }
        }
        return null;
    }

    public final ArrayList A01(Context context) {
        ArrayList A12 = AbstractC166997dE.A12(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.product_sticker_text_size);
        int A01 = AbstractC188878Yd.A01(context);
        A12.add(new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_vibrant"));
        A12.add(new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_subtle"));
        A12.add(new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_black_white"));
        Integer A00 = A00(this.A00);
        if (A00 != null) {
            int intValue = A00.intValue();
            C221099pX c221099pX = new C221099pX(context, A01, dimensionPixelSize, "product_item_text_sticker_media_primary_color");
            C9SA c9sa = c221099pX.A04;
            c9sa.A02 = intValue;
            c9sa.invalidateSelf();
            A12.add(c221099pX);
            if (C18U.A06(C06090Tz.A05, this.A01, 36319836887850694L)) {
                A12.add(new C221069pU(context, "product_item_list_cell_sticker_black_white"));
                A12.add(new C221069pU(context, "product_item_list_cell_sticker_subtle"));
                A12.add(new C221079pV(context));
            }
        }
        return A12;
    }

    public final ArrayList A02(Context context, ProductCollection productCollection) {
        ArrayList A12 = AbstractC166997dE.A12(context, 0);
        A12.add(new C221059pT(context, productCollection, "seller_collection_text_sticker_vibrant"));
        A12.add(new C221059pT(context, productCollection, "seller_collection_text_sticker_subtle"));
        A12.add(new C221059pT(context, productCollection, "seller_collection_text_sticker_black_white"));
        Integer A00 = A00(this.A00);
        if (A00 != null) {
            int intValue = A00.intValue();
            C221059pT c221059pT = new C221059pT(context, productCollection, "seller_collection_text_sticker_media_primary_color");
            C9SA c9sa = c221059pT.A00;
            c9sa.A02 = intValue;
            c9sa.invalidateSelf();
            A12.add(c221059pT);
        }
        return A12;
    }

    public final ArrayList A03(Context context, User user) {
        ArrayList A12 = AbstractC166997dE.A12(context, 0);
        A12.add(new C221109pY(context, user, "storefront_text_sticker_vibrant"));
        A12.add(new C221109pY(context, user, "storefront_text_sticker_subtle"));
        A12.add(new C221109pY(context, user, "storefront_text_sticker_black_white"));
        Integer A00 = A00(this.A00);
        if (A00 != null) {
            int intValue = A00.intValue();
            C221109pY c221109pY = new C221109pY(context, user, "storefront_text_sticker_media_primary_color");
            C9SA c9sa = c221109pY.A01;
            c9sa.A02 = intValue;
            c9sa.invalidateSelf();
            A12.add(c221109pY);
        }
        return A12;
    }

    public final ArrayList A04(Context context, List list) {
        ArrayList A12 = AbstractC166997dE.A12(context, 0);
        A12.add(new C221049pS(context, "multi_product_item_text_sticker_vibrant", list, AbstractC13880nE.A0A(context), false));
        A12.add(new C221049pS(context, "multi_product_item_text_sticker_subtle", list, AbstractC13880nE.A0A(context), false));
        A12.add(new C221049pS(context, "multi_product_item_text_sticker_black_white", list, AbstractC13880nE.A0A(context), false));
        Integer A00 = A00(this.A00);
        if (A00 != null) {
            int intValue = A00.intValue();
            C221049pS c221049pS = new C221049pS(context, "multi_product_item_text_sticker_media_primary_color", list, AbstractC13880nE.A0A(context), false);
            C9SA c9sa = c221049pS.A00;
            c9sa.A02 = intValue;
            c9sa.invalidateSelf();
            A12.add(c221049pS);
        }
        return A12;
    }

    public AHD(UserSession userSession, C198308pf c198308pf) {
        this.A01 = userSession;
        this.A00 = c198308pf;
    }
}
