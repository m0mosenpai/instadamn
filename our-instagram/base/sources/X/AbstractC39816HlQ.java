package X;

import com.instagram.api.schemas.ClipsMerchandisingPillType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HlQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39816HlQ {
    public static Map A00(C5HM c5hm) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        c5hm.getLoopTime();
        A1I.put("loop_time", Integer.valueOf(c5hm.getLoopTime()));
        if (c5hm.BSV() != null) {
            List<ClipsMerchandisingPillType> BSV = c5hm.BSV();
            if (BSV != null) {
                arrayList = AbstractC167017dG.A0q(BSV);
                for (ClipsMerchandisingPillType clipsMerchandisingPillType : BSV) {
                    C14360o3.A0B(clipsMerchandisingPillType, 0);
                    arrayList.add(clipsMerchandisingPillType.A00);
                }
            } else {
                arrayList = null;
            }
            A1I.put(AbstractC111324zv.A00(1108), arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
