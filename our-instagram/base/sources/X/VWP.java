package X;

import com.instagram.save.model.CollaborativeCollectionMetadata;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VWP {
    public static CollaborativeCollectionMetadata parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CollaborativeCollectionMetadata collaborativeCollectionMetadata = new CollaborativeCollectionMetadata();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("facepile_users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    collaborativeCollectionMetadata.A02 = arrayList;
                } else if ("social_context_subtitle".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    collaborativeCollectionMetadata.A01 = A0m;
                } else if (AbstractC111324zv.A00(998).equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    collaborativeCollectionMetadata.A00 = A0m2;
                }
                c16l.A0z();
            }
            return collaborativeCollectionMetadata;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
