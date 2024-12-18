package X;

import android.content.res.Resources;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Odm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55181Odm {
    public static void A01(View view, UserSession userSession, C4hj c4hj, EnumC76383bi enumC76383bi, String str, Map map, Map map2, Map map3, boolean z, boolean z2) {
        if (!z && enumC76383bi != EnumC76383bi.A0C) {
            if (EditMediaInfoFragment.A0R(c4hj.A00)) {
                A03(view, c4hj, (List) map.get(str), (List) map2.get(str), (List) map3.get(str), z2);
                return;
            }
            Map map4 = new Map[]{map}[0];
            if (map4 != null) {
                Iterator A16 = AbstractC166997dE.A16(map4);
                while (A16.hasNext()) {
                    if (!((List) A16.next()).isEmpty()) {
                        break;
                    }
                }
            }
            Map map5 = new Map[]{map2}[0];
            if (map5 != null) {
                Iterator A162 = AbstractC166997dE.A16(map5);
                while (A162.hasNext()) {
                    if (!((List) A162.next()).isEmpty()) {
                        A02(view, c4hj, AbstractC43592JPx.A12(str, map2));
                        return;
                    }
                }
            }
            if (AbstractC199308rX.A01(userSession)) {
                A00(new Ok3(c4hj, 66), view, view.getResources().getString(2131975133), R.drawable.instagram_add_pano_outline_24);
                return;
            }
            A04(view, c4hj, AbstractC43592JPx.A12(str, map), AbstractC43592JPx.A12(str, map3), z2);
            return;
        }
        view.setVisibility(8);
    }

    public static void A03(View view, C4hj c4hj, List list, List list2, List list3, boolean z) {
        String str;
        int size;
        int i;
        int i2;
        int size2;
        String str2 = null;
        if (A05(list2)) {
            if (list2 == null) {
                size2 = 0;
            } else {
                size2 = list2.size();
            }
            str = AbstractC167017dG.A0k(view.getResources(), size2, R.plurals.num_products_formatted);
        } else {
            str = null;
        }
        if (A05(list) || (A05(list3) && z)) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (list3 != null && A05(list3) && z) {
                i = list3.size();
            } else {
                i = 0;
            }
            str2 = AbstractC167017dG.A0k(view.getResources(), size + i, R.plurals.x_people);
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        Resources resources = view.getResources();
        if (str2 != null) {
            A1C.append(str2);
            if (str != null) {
                A1C.append(" • ");
                A1C.append(str);
                i2 = R.drawable.instagram_shopping_bag_pano_filled_24;
            } else {
                A1C.append(" • ");
                A1C.append(resources.getString(2131970046));
                i2 = R.drawable.instagram_user_circle_pano_filled_24;
            }
        } else if (str != null) {
            A1C.append(str);
            A1C.append(" • ");
            str = resources.getString(2131969519);
            A1C.append(str);
            i2 = R.drawable.instagram_shopping_bag_pano_filled_24;
        } else {
            A1C.append(resources.getString(2131975133));
            i2 = R.drawable.instagram_add_pano_outline_24;
        }
        A00(new Ok4(c4hj, 0), view, A1C.toString(), i2);
    }

    public static void A00(View.OnClickListener onClickListener, View view, String str, int i) {
        AbstractC31173DnH.A0I(view, R.id.tag_indicator_button_icon).setImageResource(i);
        AbstractC31176DnK.A1F(view, str, R.id.tag_indicator_button_text);
        C0fQ.A00(onClickListener, view);
        view.setVisibility(0);
    }

    public static void A02(View view, C4hj c4hj, List list) {
        int i;
        String string;
        int i2;
        int size;
        if (A05(list)) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            i = R.drawable.instagram_shopping_bag_pano_filled_24;
            string = AbstractC167017dG.A0k(view.getResources(), size, R.plurals.num_products_formatted);
            i2 = 69;
        } else {
            i = R.drawable.instagram_shopping_bag_pano_filled_24;
            string = view.getResources().getString(2131970046);
            i2 = 70;
        }
        A00(new Ok3(c4hj, i2), view, string, i);
    }

    public static void A04(View view, C4hj c4hj, List list, List list2, boolean z) {
        int size;
        int i;
        int i2;
        String A0k;
        int i3;
        if (A05(list) || (A05(list2) && z)) {
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (list2 != null && A05(list2) && z) {
                i = list2.size();
            } else {
                i = 0;
            }
            i2 = R.drawable.instagram_user_circle_pano_filled_24;
            A0k = AbstractC167017dG.A0k(view.getResources(), size + i, R.plurals.x_people);
            i3 = 67;
        } else {
            i2 = R.drawable.instagram_user_circle_pano_filled_24;
            A0k = view.getResources().getString(2131969519);
            i3 = 68;
        }
        A00(new Ok3(c4hj, i3), view, A0k, i2);
    }

    public static boolean A05(List list) {
        List list2 = new List[]{list}[0];
        if (list2 == null || list2.isEmpty()) {
            return false;
        }
        return true;
    }
}
