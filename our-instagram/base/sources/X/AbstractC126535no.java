package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126535no {
    public static void A01(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, Collection collection, Map map, int i, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            Object obj = map.get(reel);
            obj.getClass();
            C43121yf A00 = A00(context, userSession, reel, num, interfaceC11380iw.getModuleName(), i, ((Number) obj).intValue(), z, z2);
            if (A00 != null) {
                arrayList2.add(A00);
            }
        }
        arrayList.add(new C902940o(arrayList2, i, 3));
        AbstractC42951yN.A00(userSession).A05(interfaceC11380iw.getModuleName(), arrayList);
    }

    public static C43121yf A00(Context context, UserSession userSession, Reel reel, Integer num, String str, int i, int i2, boolean z, boolean z2) {
        C38321qM c38321qM;
        C75363a3 c75363a3;
        InterfaceC59502nt A00;
        C41181vS A09 = reel.A09(userSession);
        if (A09 != null && (c38321qM = A09.A0b) != null) {
            if (z) {
                c75363a3 = c38321qM.CFR();
            } else {
                c75363a3 = null;
            }
            String id = c38321qM.getId();
            Resources resources = context.getResources();
            int i3 = R.dimen.clips_netego_card_width;
            if (z2) {
                i3 = R.dimen.alt_text_carousel_card_width;
            }
            ExtendedImageUrl A1o = c38321qM.A1o(resources.getDimensionPixelSize(i3));
            if (A1o == null) {
                A00 = null;
            } else {
                C1OG A0J = C25821No.A00().A0J(A1o, str);
                A0J.A0I = true;
                A0J.A0L = false;
                A0J.A0K = c38321qM.Cff();
                c38321qM.A18();
                c38321qM.getId();
                C1NJ c1nj = C3ZH.A00;
                C42411xV.A00(userSession);
                A0J.A02(c1nj);
                if (!TextUtils.isEmpty(c38321qM.BU6())) {
                    A0J.A09 = c38321qM.BU6();
                }
                A00 = A0J.A00();
            }
            return new C43121yf(new C3ZM(A00, c75363a3, id), new C3ZN(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), num));
        }
        return null;
    }
}
