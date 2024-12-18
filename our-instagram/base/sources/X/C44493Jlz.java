package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Jlz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44493Jlz extends AbstractC52922bZ {
    public final Map A00;
    public final C05A A01;
    public final C05A A02;
    public final C0UO A03;
    public final Resources A04;
    public final C0UO A05;

    public C44493Jlz(Resources resources) {
        String A00;
        this.A04 = resources;
        C008002u A1H = AbstractC25225BEi.A1H(AbstractC166987dD.A1I());
        this.A02 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
        C008002u A1H2 = AbstractC25225BEi.A1H(AbstractC166987dD.A1I());
        this.A01 = A1H2;
        this.A05 = AbstractC208910l.A02(A1H2);
        this.A00 = AbstractC166987dD.A1I();
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put("nature", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.nature_thumbnail), R.drawable.nature));
        A1I.put("workplace", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.workplace_thumbnail), R.drawable.workplace));
        A1I.put("mars", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.mars_thumbnail), R.drawable.mars));
        A1I.put("snowView", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.snow_view_thumbnail), R.drawable.snow_view));
        A1I.put("stars", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.stars_thumbnail), R.drawable.stars));
        A1I.put("fuji", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.fuji_thumbnail), R.drawable.fuji));
        A1I.put("largeClassroom", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.large_classroom_thumbnail), R.drawable.large_classroom));
        A1I.put("mall", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.mall_thumbnail), R.drawable.mall));
        A1I.put("livingroom", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.livingroom_thumbnail), R.drawable.livingroom));
        A1I.put("spacecraft", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.spacecraft_thumbnail), R.drawable.spacecraft));
        A1I.put("forest", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.forest_thumbnail), R.drawable.forest));
        A1I.put("beach", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.beach_thumbnail), R.drawable.beach));
        A1I.put("stair", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.stair_thumbnail), R.drawable.stair));
        A1I.put("flowerRoad", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.flower_road_thumbnail), R.drawable.flower_road));
        A1I.put("classroom", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.classroom_thumbnail), R.drawable.classroom));
        A1I.put("kitchen", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.kitchen_thumbnail), R.drawable.kitchen));
        A1I.put("rain", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.rain_thumbnail), R.drawable.rain));
        A1I.put("flower", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.flower_thumbnail), R.drawable.flower));
        A1I.put("privateJet", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.private_jet_thumbnail), R.drawable.private_jet));
        A1I.put("autumn", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.autumn_thumbnail), R.drawable.autumn));
        A1I.put(ServerW3CShippingAddressConstants.CITY, AbstractC167007dF.A0o(Integer.valueOf(R.drawable.city_thumbnail), R.drawable.city));
        A1I.put("whiteShoppingMall", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.white_shopping_mall_thumbnail), R.drawable.white_shopping_mall));
        A1I.put("shoppingCenter", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.shopping_center_thumbnail), R.drawable.shopping_center));
        A1I.put("cafe", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.cafe_thumbnail), R.drawable.cafe));
        A1I.put("palace", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.palace_thumbnail), R.drawable.palace));
        A1I.put("town", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.town_thumbnail), R.drawable.town));
        A1I.put("aisle", AbstractC167007dF.A0o(Integer.valueOf(R.drawable.aisle_thumbnail), R.drawable.aisle));
        LinkedHashMap A0y = AbstractC43594JPz.A0y(A1I);
        Iterator A14 = AbstractC166997dE.A14(A1I);
        while (true) {
            boolean hasNext = A14.hasNext();
            A00 = AbstractC111324zv.A00(1139);
            if (!hasNext) {
                break;
            }
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            Object key = A1K.getKey();
            Drawable A002 = AbstractC56412ia.A00(this.A04, AbstractC25230BEn.A0F((C09530e4) A1K.getValue()));
            C14360o3.A0C(A002, A00);
            A0y.put(key, A002);
        }
        A1H.Egh(A0y);
        C05A c05a = this.A01;
        LinkedHashMap A0y2 = AbstractC43594JPz.A0y(A1I);
        Iterator A142 = AbstractC166997dE.A14(A1I);
        while (A142.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A142);
            Object key2 = A1K2.getKey();
            Drawable A003 = AbstractC56412ia.A00(this.A04, AbstractC25229BEm.A0A((C09530e4) A1K2.getValue()));
            C14360o3.A0C(A003, A00);
            A0y2.put(key2, A003);
        }
        c05a.Egh(A0y2);
    }
}
