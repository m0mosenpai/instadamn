package X;

import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDP {
    public static Map A00(NoteCustomTheme noteCustomTheme) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (noteCustomTheme.AYn() != null) {
            NoteActivationType AYn = noteCustomTheme.AYn();
            if (AYn != null) {
                str = AYn.A00;
            } else {
                str = null;
            }
            A1I.put(AbstractC111324zv.A00(1891), str);
        }
        if (noteCustomTheme.Aev() != null) {
            A1I.put(AbstractC111324zv.A00(349), noteCustomTheme.Aev());
        }
        if (noteCustomTheme.AvG() != null) {
            A1I.put(AbstractC111324zv.A00(2229), noteCustomTheme.AvG());
        }
        if (noteCustomTheme.C31() != null) {
            A1I.put(AbstractC111324zv.A00(3183), noteCustomTheme.C31());
        }
        if (noteCustomTheme.C6B() != null) {
            A1I.put(AbstractC111324zv.A00(5475), noteCustomTheme.C6B());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
