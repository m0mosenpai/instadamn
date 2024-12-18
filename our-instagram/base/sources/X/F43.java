package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F43 {
    public static C7BW parseFromJson(C16L c16l) {
        int i;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            C51752Mtb c51752Mtb = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            Integer num2 = null;
            String str9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("response_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("streaming_state".equals(A0s)) {
                    int A1D = c16l.A1D();
                    Integer[] A00 = C05F.A00(2);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            if (1 - num.intValue() != 0) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            if (i != A1D) {
                                i2++;
                            }
                        } else {
                            num = C05F.A00;
                            break;
                        }
                    }
                } else if ("sentiment".equals(A0s)) {
                    c51752Mtb = F42.parseFromJson(c16l);
                } else if ("bot_invocation_otid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(5488).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("message_image_source".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("prompt".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("bot_response_additional_message_otids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC111324zv.A00(5489).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(4023).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("bot_invocation_message_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("bot_proactive_message_type".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(4918).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("response_id", c16l, "DirectBotMessageMetadata");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("streaming_state", c16l, "DirectBotMessageMetadata");
            } else {
                return new C7BW(c51752Mtb, num, num2, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
