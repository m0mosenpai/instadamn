package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Rrp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61675Rrp {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6F7 c6f7;
        Integer num;
        C6FG c6fg = c6fq.A03;
        if (c6fg == null) {
            return null;
        }
        C6F3 A04 = AnonymousClass634.A04(c6fg, "media_store");
        if ((A04 instanceof C6F7) && (c6f7 = (C6F7) A04) != null) {
            Object A01 = c6fw.A01();
            AbstractC25225BEi.A1S(A01);
            String str = (String) A01;
            List list = c6fw.A00;
            List list2 = (List) list.get(1);
            String A0s = AbstractC31173DnH.A0s(list, 2);
            Number number = (Number) list.get(3);
            String A0s2 = AbstractC31173DnH.A0s(list, 4);
            Context context = c6fg.A00;
            if (number != null) {
                num = Integer.valueOf(number.intValue());
            } else {
                num = null;
            }
            C14360o3.A0B(str, 1);
            c6f7.A02.execute(new TRM(context, c6f7, num, A0s, A0s2, str, list2));
            return null;
        }
        AbstractC25241Le.A02("bk.action.media.LoadMediaV3", "Failed to load media: MediaStore data module is not found.");
        return null;
    }
}
