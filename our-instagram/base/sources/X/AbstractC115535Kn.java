package X;

import com.instagram.api.schemas.CameraTool;
import com.instagram.feed.media.CameraToolInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5Kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115535Kn {
    public static final ArrayList A00(C1810981l c1810981l) {
        Float f;
        ArrayList arrayList = new ArrayList();
        Iterator it = c1810981l.A09((C55U) c1810981l.A08.A00).A00().iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            C81W c81w = (C81W) next;
            C14360o3.A0B(c81w, 0);
            C81X c81x = c81w.A00;
            if (c81x != null && c1810981l.A0W(c81w)) {
                C81W c81w2 = C81W.A0t;
                Float f2 = null;
                if (c81w == c81w2 && c1810981l.A0W(c81w2)) {
                    EnumC1828489f enumC1828489f = (EnumC1828489f) AbstractC001800i.A0O(AbstractC171697kz.A01(), c1810981l.A06(c81w2));
                    if (enumC1828489f == null) {
                        enumC1828489f = EnumC1828489f.A09;
                    }
                    f = Float.valueOf(enumC1828489f.A00);
                } else {
                    f = null;
                }
                C81W c81w3 = C81W.A0y;
                if (c81w == c81w3 && c1810981l.A0W(c81w3)) {
                    f2 = Float.valueOf(((float) c1810981l.A07(c81w3)) / 1000.0f);
                }
                CameraTool A00 = C51T.A00(Long.valueOf(c81x.A00).toString());
                float f3 = 0.0f;
                Float valueOf = Float.valueOf(0.0f);
                if (f != null) {
                    f3 = f.floatValue();
                }
                arrayList.add(new CameraToolInfo(A00, valueOf, Float.valueOf(f3), f2));
            }
        }
        return arrayList;
    }
}
