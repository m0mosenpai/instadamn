package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Hz0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40580Hz0 {
    public static C4FM parseFromJson(C16L c16l) {
        String A00;
        String A002;
        SimpleImageUrl simpleImageUrl;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            String str = null;
            User user = null;
            HashMap hashMap = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool3 = null;
            NoteCustomThemeImpl noteCustomThemeImpl = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                A00 = AbstractC111324zv.A00(2764);
                A002 = AbstractC58317Pt9.A00(103);
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("is_self_note".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("thumbnail_urls".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P = c16l.A1P();
                            if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                simpleImageUrl = null;
                            } else {
                                simpleImageUrl = AbstractC222616c.A00(c16l);
                                if (simpleImageUrl != null) {
                                }
                            }
                            hashMap.put(A1P, simpleImageUrl);
                        }
                    } else {
                        hashMap = null;
                    }
                } else if ("inventory_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (A002.equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("users".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("index".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("last_visible_content_note_timestamp".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (A00.equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("stack_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("pog_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("cover_note_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("cover_note_text".equals(A0s)) {
                    str5 = AbstractC167017dG.A0m(c16l);
                } else if ("viewer_has_liked".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("custom_theme".equals(A0s)) {
                    noteCustomThemeImpl = AbstractC103504lQ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "MediaNoteStack");
            } else if (user != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_self_note", c16l, "MediaNoteStack");
                } else if (hashMap == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thumbnail_urls", c16l, "MediaNoteStack");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("inventory_count", c16l, "MediaNoteStack");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A002, c16l, "MediaNoteStack");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("index", c16l, "MediaNoteStack");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("last_visible_content_note_timestamp", c16l, "MediaNoteStack");
                } else if (num4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "MediaNoteStack");
                } else {
                    return new C4FM(noteCustomThemeImpl, user, bool3, str, str2, str3, str4, str5, arrayList, hashMap, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "MediaNoteStack");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
