package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vx5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69880Vx5 {
    public static URM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList2 = null;
            String str7 = null;
            Integer num2 = null;
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("correct_answer".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("default_prompt".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("end_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("finished".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("options".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38784H5y parseFromJson = IPE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("quiz_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("start_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("tallies".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38784H5y parseFromJson2 = IPE.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("viewer_answer".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("viewer_can_answer".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new URM(bool, bool2, num, num2, str, str2, str3, str4, str5, str6, str7, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URM urm, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        Integer num = urm.A02;
        if (num != null) {
            anonymousClass182.A0Q("correct_answer", num.intValue());
        }
        String str = urm.A04;
        if (str != null) {
            anonymousClass182.A0S("default_prompt", str);
        }
        String str2 = urm.A05;
        if (str2 != null) {
            anonymousClass182.A0S("end_background_color", str2);
        }
        Boolean bool = urm.A00;
        if (bool != null) {
            anonymousClass182.A0T("finished", bool.booleanValue());
        }
        AbstractC37301Gc2.A1D(anonymousClass182, urm.A06);
        List list = urm.A0B;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "options", list);
            while (A0q.hasNext()) {
                InterfaceC43540JLa interfaceC43540JLa = (InterfaceC43540JLa) A0q.next();
                if (interfaceC43540JLa != null) {
                    IPE.A00(anonymousClass182, interfaceC43540JLa.F1Z());
                }
            }
            anonymousClass182.A0Z();
        }
        String str3 = urm.A07;
        if (str3 != null) {
            anonymousClass182.A0S("question", str3);
        }
        String str4 = urm.A08;
        if (str4 != null) {
            anonymousClass182.A0S("quiz_id", str4);
        }
        String str5 = urm.A09;
        if (str5 != null) {
            anonymousClass182.A0S("start_background_color", str5);
        }
        List list2 = urm.A0C;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "tallies", list2);
            while (A0q2.hasNext()) {
                InterfaceC43540JLa interfaceC43540JLa2 = (InterfaceC43540JLa) A0q2.next();
                if (interfaceC43540JLa2 != null) {
                    IPE.A00(anonymousClass182, interfaceC43540JLa2.F1Z());
                }
            }
            anonymousClass182.A0Z();
        }
        String str6 = urm.A0A;
        if (str6 != null) {
            anonymousClass182.A0S("text_color", str6);
        }
        Integer num2 = urm.A03;
        if (num2 != null) {
            anonymousClass182.A0Q("viewer_answer", num2.intValue());
        }
        Boolean bool2 = urm.A01;
        if (bool2 != null) {
            anonymousClass182.A0T("viewer_can_answer", bool2.booleanValue());
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
