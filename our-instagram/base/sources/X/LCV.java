package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class LCV {
    public static C114675Fx parseFromJson(C16L c16l) {
        Integer num;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            Boolean bool = null;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            EnumC46247KdO enumC46247KdO = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool6 = null;
            EnumC81843l3 enumC81843l3 = null;
            HashMap hashMap = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("failure_domain".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    C14360o3.A0B(A1P2, 0);
                    enumC46247KdO = (EnumC46247KdO) EnumC46247KdO.A02.get(A1P2);
                    if (enumC46247KdO == null) {
                        enumC46247KdO = EnumC46247KdO.A0G;
                    }
                } else if (TraceFieldType.ErrorCode.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("server_error_code".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("send_attempt_channel".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("should_allow_automatic_retry".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("should_allow_manual_retry".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("client_facing_error_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("is_epd_error".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("biz_thread_throttled_state".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    enumC81843l3 = (EnumC81843l3) EnumC81843l3.A01.get(A1P);
                    if (enumC81843l3 == null) {
                        enumC81843l3 = EnumC81843l3.A06;
                    }
                } else if ("can_see_notes".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("can_see_broadcast_chats".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("media_ids_to_intervention_type".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            String A1P3 = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                num = null;
                            } else {
                                num = AbstractC166997dE.A0h(c16l);
                                if (num != null) {
                                }
                            }
                            hashMap.put(A1P3, num);
                        }
                    } else {
                        hashMap = null;
                    }
                } else {
                    bool6 = AbstractC37303Gc4.A0K(c16l, bool6, A0s, "should_automatic_retry_immediately");
                }
                c16l.A0z();
            }
            if (enumC46247KdO == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("failure_domain", c16l, "SendError");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("send_attempt_channel", c16l, "SendError");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_allow_automatic_retry", c16l, "SendError");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_allow_manual_retry", c16l, "SendError");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_epd_error", c16l, "SendError");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_see_notes", c16l, "SendError");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_see_broadcast_chats", c16l, "SendError");
                } else if (hashMap == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_ids_to_intervention_type", c16l, "SendError");
                } else if (bool6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_automatic_retry_immediately", c16l, "SendError");
                } else {
                    return new C114675Fx(enumC81843l3, enumC46247KdO, str, str2, str3, str4, str5, str6, hashMap, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue(), bool6.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(TraceFieldType.ErrorCode, c16l, "SendError");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C114675Fx c114675Fx) {
        anonymousClass182.A0d();
        EnumC46247KdO enumC46247KdO = c114675Fx.A01;
        if (enumC46247KdO != null) {
            anonymousClass182.A0S("failure_domain", enumC46247KdO.A01);
        }
        String str = c114675Fx.A03;
        if (str != null) {
            anonymousClass182.A0S(TraceFieldType.ErrorCode, str);
        }
        String str2 = c114675Fx.A06;
        if (str2 != null) {
            anonymousClass182.A0S("server_error_code", str2);
        }
        String str3 = c114675Fx.A05;
        if (str3 != null) {
            anonymousClass182.A0S("send_attempt_channel", str3);
        }
        anonymousClass182.A0T("should_allow_automatic_retry", c114675Fx.A0C);
        anonymousClass182.A0T("should_allow_manual_retry", c114675Fx.A0D);
        String str4 = c114675Fx.A07;
        if (str4 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str4);
        }
        String str5 = c114675Fx.A04;
        if (str5 != null) {
            anonymousClass182.A0S(DialogModule.KEY_MESSAGE, str5);
        }
        String str6 = c114675Fx.A02;
        if (str6 != null) {
            anonymousClass182.A0S("client_facing_error_message", str6);
        }
        anonymousClass182.A0T("is_epd_error", c114675Fx.A0B);
        EnumC81843l3 enumC81843l3 = c114675Fx.A00;
        if (enumC81843l3 != null) {
            anonymousClass182.A0S("biz_thread_throttled_state", enumC81843l3.A00);
        }
        anonymousClass182.A0T("can_see_notes", c114675Fx.A0A);
        anonymousClass182.A0T("can_see_broadcast_chats", c114675Fx.A09);
        if (c114675Fx.A08 != null) {
            anonymousClass182.A0r("media_ids_to_intervention_type");
            anonymousClass182.A0d();
            Iterator A15 = AbstractC166997dE.A15(c114675Fx.A08);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (!C16V.A04(anonymousClass182, A1K)) {
                    anonymousClass182.A0h(AbstractC43593JPy.A04(A1K));
                }
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("should_automatic_retry_immediately", c114675Fx.A0E);
        anonymousClass182.A0a();
    }
}
