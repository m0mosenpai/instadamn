package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.9Nf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209239Nf {
    public static final boolean A00(Drawable drawable) {
        if (!(drawable instanceof C194808jg)) {
            return false;
        }
        Drawable A04 = ((C194808jg) drawable).A04();
        C14360o3.A07(A04);
        if (!(A04 instanceof AbstractC202348xE) && !(A04 instanceof AbstractC202358xF) && !(A04 instanceof AbstractC202368xG) && !(A04 instanceof AbstractC202378xH) && !(A04 instanceof C202408xK) && !(A04 instanceof C217739k6) && !(A04 instanceof C217629jv)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C84823qW c84823qW) {
        String str;
        String A0J = c84823qW.A0J();
        if (A0J != null) {
            int hashCode = A0J.hashCode();
            if (hashCode != 1080478002) {
                if (hashCode != 1221159847) {
                    if (hashCode == 1408761647) {
                        str = "product_item_list_cell_sticker_black_white";
                    } else {
                        return true;
                    }
                } else {
                    if (!A0J.equals("product_item_list_cell_sticker_subtle")) {
                        return true;
                    }
                    return false;
                }
            } else {
                str = "product_item_tile_sticker_black_white";
            }
            if (!A0J.equals(str)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
