package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.Vwq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69865Vwq {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UyY, X.1um, X.1ul] */
    public static C67799UyY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("challenges_title".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Achievement parseFromJson = AbstractC53769NqL.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if ("earned_challenges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Challenge parseFromJson2 = VO7.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A06 = arrayList;
                } else if ("earned_title".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(549).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Achievement parseFromJson3 = AbstractC53769NqL.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    c40791um.A07 = arrayList;
                } else if ("unearned_challenges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Challenge parseFromJson4 = VO7.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList.add(parseFromJson4);
                            }
                        }
                    }
                    c40791um.A08 = arrayList;
                } else if ("unearned_title".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A01;
            C14360o3.A0A(str);
            List list = c40791um.A05;
            C14360o3.A0A(list);
            List list2 = c40791um.A06;
            C14360o3.A0A(list2);
            String str2 = c40791um.A02;
            C14360o3.A0A(str2);
            String str3 = c40791um.A03;
            C14360o3.A0A(str3);
            List list3 = c40791um.A07;
            C14360o3.A0A(list3);
            List list4 = c40791um.A08;
            C14360o3.A0A(list4);
            String str4 = c40791um.A04;
            C14360o3.A0A(str4);
            c40791um.A00 = new C26130BhH(str, str2, str3, str4, list, list2, list3, list4);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
