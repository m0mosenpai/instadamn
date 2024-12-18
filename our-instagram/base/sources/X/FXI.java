package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FXI {
    public static C33136Ejf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33136Ejf c33136Ejf = new C33136Ejf();
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
                    if ("has_related_media".equals(A0s)) {
                        c33136Ejf.A03 = c16l.A0d();
                    } else {
                        HashMap hashMap = null;
                        ArrayList arrayList = null;
                        if (DialogModule.KEY_ITEMS.equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    C40958ICf parseFromJson = AbstractC31730Dwb.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        arrayList.add(parseFromJson);
                                    }
                                }
                            }
                            c33136Ejf.A01 = arrayList;
                        } else if (AbstractC111324zv.A00(45).equals(A0s)) {
                            c33136Ejf.A02 = c16l.A0d();
                        } else if ("media_contributors".equals(A0s)) {
                            if (c16l.A11() == c16r) {
                                HashMap A1G = AbstractC166987dD.A1G();
                                while (c16l.A1J() != c16r2) {
                                    String A1P = c16l.A1P();
                                    c16l.A1J();
                                    if (c16l.A11() == C16R.A0G) {
                                        A1G.put(A1P, null);
                                    } else {
                                        User A0S = AbstractC31171DnF.A0S(c16l, false);
                                        if (A0S != null) {
                                            A1G.put(A1P, A0S);
                                        }
                                    }
                                }
                                hashMap = A1G;
                            }
                            c33136Ejf.A00 = hashMap;
                        } else {
                            FB4.A00(c16l, c33136Ejf, A0s);
                        }
                    }
                    c16l.A0z();
                } else {
                    return c33136Ejf;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
