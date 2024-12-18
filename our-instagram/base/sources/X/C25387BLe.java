package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.BLe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25387BLe extends C03E implements C0s8 {
    public C25387BLe(Object obj) {
        super(8, obj, BKA.class, "launchVideoEffectSheet", "launchVideoEffectSheet(Lcom/instagram/feed/media/Media;Lcom/instagram/feed/ui/state/MediaState;Ljava/util/List;Ljava/util/List;Lcom/instagram/model/venue/Venue;Ljava/lang/Integer;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;Z)V", 0);
    }

    @Override // X.C0s8
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        List<EffectPreviewIntf> list = (List) obj3;
        List<EnumC25546BRi> list2 = (List) obj4;
        Venue venue = (Venue) obj5;
        Number number = (Number) obj6;
        boolean A1W = AbstractC25231BEo.A1W(obj8, obj);
        AbstractC167027dH.A13(obj2, list, list2);
        C14360o3.A0B(obj7, 6);
        BKA bka = (BKA) this.receiver;
        FragmentActivity fragmentActivity = bka.A01;
        C50674MYs c50674MYs = new C50674MYs(fragmentActivity, bka.A04);
        if (number != null) {
            c50674MYs.A00(number.intValue());
        }
        for (EffectPreviewIntf effectPreviewIntf : list) {
            c50674MYs.A0B(effectPreviewIntf.getName(), new ViewOnClickListenerC35632FoN(4, effectPreviewIntf, obj7, obj2, bka, obj, A1W));
        }
        for (EnumC25546BRi enumC25546BRi : list2) {
            c50674MYs.A03(new ViewOnClickListenerC28665ClD(15, enumC25546BRi, obj, bka), enumC25546BRi.A01);
        }
        if (venue != null) {
            String name = venue.A00.getName();
            if (name == null) {
                name = "";
            }
            c50674MYs.A0B(name, new ViewOnClickListenerC28651Ckz(8, bka, obj2, obj, venue));
        }
        new C31727DwY(c50674MYs).A05(fragmentActivity);
        return C0eB.A00;
    }
}
