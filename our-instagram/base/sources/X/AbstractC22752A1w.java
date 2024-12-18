package X;

import com.instagram.reels.memories.model.MemoryItem;
import java.io.IOException;

/* renamed from: X.A1w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22752A1w {
    public static MemoryItem parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MemoryItem memoryItem = new MemoryItem();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    EnumC222889sT enumC222889sT = (EnumC222889sT) EnumC222889sT.A01.get(A1Q);
                    if (enumC222889sT != null) {
                        memoryItem.A00 = enumC222889sT;
                    } else {
                        throw AbstractC166987dD.A1D(AnonymousClass001.A0R(AbstractC111324zv.A00(1838), A1Q));
                    }
                } else if ("item_payload".equals(A0s)) {
                    memoryItem.A01 = AEK.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return memoryItem;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
