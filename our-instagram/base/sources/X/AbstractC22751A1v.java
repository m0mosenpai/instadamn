package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.reels.memories.model.MemoryItem;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.A1v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22751A1v {
    public static A68 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if (DialogModule.KEY_ITEMS.equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            MemoryItem parseFromJson = AbstractC22752A1w.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            A68 a68 = new A68();
            if (arrayList != null) {
                a68.A00 = arrayList;
            }
            return a68;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
