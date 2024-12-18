package X;

import com.instagram.direct.model.channels.BroadcastChannelXpostingChannelInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FUg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34781FUg {
    public static EBO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            EBO ebo = new EBO();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("all_channels".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            BroadcastChannelXpostingChannelInfo parseFromJson = F4Q.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    ebo.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, ebo, A0s);
                }
                c16l.A0z();
            }
            return ebo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
