package X;

import android.os.Parcelable;
import com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class I8E {
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    public static Parcelable[] A00(List list) {
        HeroCarouselItemConverter$ParcelableHeroCarouselItemModel heroCarouselItemConverter$ParcelableHeroCarouselItemModel;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < list.size(); i++) {
            IN1 in1 = (IN1) list.get(i);
            Integer num = in1.A02;
            switch (num.intValue()) {
                case 0:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C39354HZt) in1);
                    A1E.add(heroCarouselItemConverter$ParcelableHeroCarouselItemModel);
                case 1:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C39350HZp) in1);
                    A1E.add(heroCarouselItemConverter$ParcelableHeroCarouselItemModel);
                case 2:
                case 3:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C39351HZq) in1);
                    A1E.add(heroCarouselItemConverter$ParcelableHeroCarouselItemModel);
                case 4:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C39349HZo) in1);
                    A1E.add(heroCarouselItemConverter$ParcelableHeroCarouselItemModel);
                case 5:
                    heroCarouselItemConverter$ParcelableHeroCarouselItemModel = new HeroCarouselItemConverter$ParcelableHeroCarouselItemModel((C39352HZr) in1);
                    A1E.add(heroCarouselItemConverter$ParcelableHeroCarouselItemModel);
                default:
                    throw AbstractC31175DnJ.A0V(AbstractC111324zv.A00(341), AbstractC41360ISn.A01(num));
            }
        }
        return (Parcelable[]) A1E.toArray(new Parcelable[A1E.size()]);
    }
}
