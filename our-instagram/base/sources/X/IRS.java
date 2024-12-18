package X;

import com.instagram.api.schemas.TrackDataImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IRS {
    public static HB0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HB0 hb0 = new HB0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            ICU parseFromJson = I4X.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    hb0.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, hb0, A0q);
                }
                c16l.A0z();
            }
            List list = hb0.A01;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                TrackDataImpl trackDataImpl = ((ICU) it.next()).A00;
                if (trackDataImpl != null) {
                    A1E.add(new C37964Gn6(trackDataImpl));
                }
            }
            hb0.A00 = A1E;
            return hb0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
