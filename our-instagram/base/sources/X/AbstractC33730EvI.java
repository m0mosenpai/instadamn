package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.EvI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33730EvI {
    public static E82 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            String str = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            String str2 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("friend_list_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_default".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_list_name_public".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_list_named".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_user_member_of_friend_list".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("member_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("social_context_members".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("thread_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("friend_list_id", c16l, "PrivateStoriesFriendListDetails");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_list_named", c16l, "PrivateStoriesFriendListDetails");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("member_count", c16l, "PrivateStoriesFriendListDetails");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "PrivateStoriesFriendListDetails");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("social_context_members", c16l, "PrivateStoriesFriendListDetails");
                } else {
                    return new E82(bool3, bool4, str, str2, arrayList, arrayList2, num.intValue(), l.longValue(), bool.booleanValue(), bool2.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_default", c16l, "PrivateStoriesFriendListDetails");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
