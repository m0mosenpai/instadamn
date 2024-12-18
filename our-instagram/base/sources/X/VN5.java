package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VN5 {
    public static final String A00(C69492VoF c69492VoF) {
        String str = c69492VoF.A0P;
        C54371O1d c54371O1d = c69492VoF.A0J;
        if (c54371O1d != null) {
            MediaComposition mediaComposition = c54371O1d.A00;
            EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
            ArrayList arrayList = new ArrayList();
            HashMap A07 = mediaComposition.A07(enumC1125356h);
            if (A07 != null) {
                int size = A07.size();
                for (int i = 0; i < size; i++) {
                    List A08 = mediaComposition.A08(enumC1125356h, i);
                    if (A08 != null) {
                        arrayList.addAll(A08);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = ((C1125756l) it.next()).A04;
                file.getClass();
                arrayList2.add(file.getCanonicalPath());
            }
            if (!arrayList2.isEmpty()) {
                return (String) AbstractC31173DnH.A0i(arrayList2, 0);
            }
        }
        return str;
    }
}
