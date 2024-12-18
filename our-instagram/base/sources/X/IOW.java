package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IOW {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.H9b, X.1um, X.1ul] */
    public static C38853H9b parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audience".equals(A0s)) {
                    c40791um.A05 = AbstractC166997dE.A0h(c16l);
                } else if ("created_at".equals(A0s)) {
                    c40791um.A06 = AbstractC31173DnH.A0h(c16l);
                } else if ("custom_theme".equals(A0s)) {
                    c40791um.A01 = AbstractC103504lQ.parseFromJson(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("e2ee_mentioned_user_list".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167017dG.A1H(c16l, arrayList);
                            }
                        }
                        c40791um.A0C = arrayList;
                    } else if ("expires_at".equals(A0s)) {
                        c40791um.A07 = AbstractC31173DnH.A0h(c16l);
                    } else if ("has_translation".equals(A0s)) {
                        c40791um.A03 = AbstractC166997dE.A0d(c16l);
                    } else if (AbstractC31171DnF.A1Y(A0s)) {
                        c40791um.A08 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC37300Gc1.A1J(A0s)) {
                        c40791um.A09 = AbstractC167017dG.A0m(c16l);
                    } else if ("reactions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                NoteEmojiReactionInfo parseFromJson = AbstractC41262IOd.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A0D = arrayList;
                    } else if (AbstractC37300Gc1.A1D(A0s)) {
                        c40791um.A0A = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                        c40791um.A02 = AbstractC31171DnF.A0S(c16l, false);
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                        c40791um.A0B = AbstractC167017dG.A0m(c16l);
                    } else if ("viewer_has_liked".equals(A0s)) {
                        c40791um.A04 = AbstractC166997dE.A0d(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            Integer num = c40791um.A05;
            Long l = c40791um.A06;
            NoteCustomThemeImpl noteCustomThemeImpl = c40791um.A01;
            List list = c40791um.A0C;
            Long l2 = c40791um.A07;
            Boolean bool = c40791um.A03;
            String str = c40791um.A08;
            String str2 = c40791um.A09;
            List list2 = c40791um.A0D;
            String str3 = c40791um.A0A;
            c40791um.A00 = new C103514lR(noteCustomThemeImpl, c40791um.A02, bool, c40791um.A04, num, l, l2, str, str2, str3, c40791um.A0B, list, list2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
