package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VMz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68339VMz {
    public static MediaComposition A00(Context context, C1125456i c1125456i, File file, List list, List list2) {
        C1125956n c1125956n;
        C1126256q c1126256q = new C1126256q();
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        C1125656k c1125656k = new C1125656k(file);
        c1125656k.A03 = c1125456i;
        C1125756l A00 = c1125656k.A00();
        C1125856m c1125856m = new C1125856m(enumC1125356h);
        c1125856m.A02(A00);
        C1125956n c1125956n2 = new C1125956n(c1125856m);
        if (!new C55773Oph(context, false).AUI(android.net.Uri.fromFile(file)).A0K) {
            c1125956n = null;
        } else {
            EnumC1125356h enumC1125356h2 = EnumC1125356h.AUDIO;
            C1125656k c1125656k2 = new C1125656k(file);
            c1125656k2.A03 = c1125456i;
            C1125756l A002 = c1125656k2.A00();
            C1125856m c1125856m2 = new C1125856m(enumC1125356h2);
            c1125856m2.A02(A002);
            c1125956n = new C1125956n(c1125856m2);
        }
        c1126256q.A04(c1125956n2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C69688VtY c69688VtY = (C69688VtY) it.next();
            c1126256q.A01(c69688VtY.A00, enumC1125356h, c69688VtY.A01);
        }
        if (c1125956n != null) {
            c1126256q.A04(c1125956n);
            EnumC1125356h enumC1125356h3 = EnumC1125356h.AUDIO;
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C69688VtY c69688VtY2 = (C69688VtY) it2.next();
                c1126256q.A01(c69688VtY2.A00, enumC1125356h3, c69688VtY2.A01);
            }
        }
        return new MediaComposition(c1126256q);
    }
}
