package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hx4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40471Hx4 {
    public static C38634Gyb parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ThreadHeaderStyle threadHeaderStyle = null;
            String str2 = null;
            C38802H6r c38802H6r = null;
            ArrayList arrayList = null;
            ThreadContainerType threadContainerType = null;
            String str3 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(274);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("header".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("header_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    threadHeaderStyle = (ThreadHeaderStyle) ThreadHeaderStyle.A01.get(A1P2);
                    if (threadHeaderStyle == null) {
                        threadHeaderStyle = ThreadHeaderStyle.A05;
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("show_create_reply_cta".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("thread_header_context".equals(A0s)) {
                    c38802H6r = Hw7.parseFromJson(c16l);
                } else if ("thread_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45150Jyq parseFromJson = AbstractC40419HwA.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    threadContainerType = (ThreadContainerType) ThreadContainerType.A01.get(A1P);
                    if (threadContainerType == null) {
                        threadContainerType = ThreadContainerType.A06;
                    }
                } else if ("view_state_item_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "Thread");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thread_items", c16l, "Thread");
                } else if (threadContainerType == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "Thread");
                } else {
                    return new C38634Gyb(threadContainerType, c38802H6r, threadHeaderStyle, str, str2, str3, arrayList, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("show_create_reply_cta", c16l, "Thread");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
