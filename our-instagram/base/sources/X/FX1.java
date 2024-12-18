package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FX1 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.EfU, X.EfR, X.1um] */
    public static EfR parseFromJson(C16L c16l) {
        Integer num;
        int i;
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
                    HashMap hashMap = null;
                    if ("step_name".equals(A0s)) {
                        c40791um.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("step_data".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        }
                        c40791um.A09 = hashMap;
                    } else if ("action".equals(A0s)) {
                        c40791um.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                        c40791um.A08 = AbstractC167017dG.A0m(c16l);
                    } else if ("nonce_code".equals(A0s)) {
                        c40791um.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("bloks_action".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("cni".equals(A0s)) {
                        c40791um.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("actor_gateway_enrollment_id".equals(A0s)) {
                        c40791um.A01 = AbstractC31173DnH.A0h(c16l);
                    } else if ("flow_render_type".equals(A0s)) {
                        int A1D = c16l.A1D();
                        Integer[] A00 = C05F.A00(6);
                        int length = A00.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                num = A00[i2];
                                switch (num.intValue()) {
                                    case 1:
                                        i = 1;
                                        break;
                                    case 2:
                                        i = 2;
                                        break;
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 7;
                                        break;
                                    case 5:
                                        i = 18;
                                        break;
                                    default:
                                        i = 0;
                                        break;
                                }
                                if (i != A1D) {
                                    i2++;
                                }
                            } else {
                                num = C05F.A0j;
                            }
                        }
                        c40791um.A00 = num;
                    } else if ("challenge_context".equals(A0s)) {
                        c40791um.A05 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C35072Fcj.A00(c16l, c40791um, A0s);
                    }
                    c16l.A0z();
                } else {
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
