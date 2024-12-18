package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC125175lN {
    public static final ArrayList A00(String str) {
        C14360o3.A0B(str, 0);
        C16L A03 = AbstractC221915u.A00.A03(str);
        A03.A1J();
        ArrayList arrayList = new ArrayList();
        if (A03.A11() == C16R.A0C) {
            while (A03.A1J() != C16R.A08) {
                if (A03.A11() == C16R.A0D) {
                    C5lP parseFromJson = AbstractC125185lO.parseFromJson(A03);
                    if (parseFromJson != null) {
                        arrayList.add(parseFromJson);
                    } else {
                        throw new IOException("Failed to parse IrisSyncMessage from payload");
                    }
                }
            }
        }
        return arrayList;
    }
}
