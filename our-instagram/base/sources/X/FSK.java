package X;

import com.instagram.user.model.FriendshipStatusImpl;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FSK {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.EAY, X.1um, X.1ul] */
    public static EAY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("friendship_statuses".equals(A0s)) {
                        HashMap hashMap = null;
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    FriendshipStatusImpl parseFromJson = AbstractC38881rL.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c40791um.A02 = hashMap;
                    } else if ("removal_in_progress".equals(A0s)) {
                        c40791um.A01 = AbstractC166997dE.A0d(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                    c16l.A0z();
                } else {
                    HashMap hashMap2 = c40791um.A02;
                    C14360o3.A0A(hashMap2);
                    c40791um.A00 = new E63(c40791um.A01, hashMap2);
                    return c40791um;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
