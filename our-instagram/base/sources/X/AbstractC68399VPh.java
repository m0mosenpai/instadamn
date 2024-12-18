package X;

import com.instagram.model.mediasize.VideoUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.VPh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68399VPh {
    public static ArrayList A00(List list) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C102884kP c102884kP = (C102884kP) it.next();
            if (c102884kP.A0I() == null) {
                AbstractC25241Le.A02(AbstractC111324zv.A00(3507), "Received invalid null url while trying to create video version");
            } else {
                String str = "regular";
                String A0G = c102884kP.A0G();
                if (A0G != null) {
                    str = A0G;
                }
                if (!str.equals("hd")) {
                    i = 102;
                    if (!str.equals("regular")) {
                        i = -1;
                    }
                } else {
                    i = 101;
                }
                arrayList.add(new VideoUrlImpl(c102884kP.A0I(), c102884kP.A03(41, -1), c102884kP.A03(35, -1), i, c102884kP.A0F()));
            }
        }
        return arrayList;
    }
}
