package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDict;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class ONS {
    public static GenAIToolInfoDict parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            CameraTool cameraTool = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("content_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("prompt".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("recipe_caption".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (TraceFieldType.RequestID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("response_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("sticker_style_str".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("tool_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    cameraTool = C51T.A00(A1P);
                } else if ("topic".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (cameraTool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("tool_type", c16l, "GenAIToolInfoDict");
                throw C00O.createAndThrow();
            }
            return new GenAIToolInfoDict(cameraTool, str, str2, str3, str4, str5, str6, str7, str8);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, GenAIToolInfoDict genAIToolInfoDict) {
        anonymousClass182.A0d();
        String str = genAIToolInfoDict.A01;
        if (str != null) {
            anonymousClass182.A0S("background_color", str);
        }
        String str2 = genAIToolInfoDict.A02;
        if (str2 != null) {
            anonymousClass182.A0S("content_id", str2);
        }
        String str3 = genAIToolInfoDict.A03;
        if (str3 != null) {
            anonymousClass182.A0S("prompt", str3);
        }
        String str4 = genAIToolInfoDict.A04;
        if (str4 != null) {
            anonymousClass182.A0S("recipe_caption", str4);
        }
        String str5 = genAIToolInfoDict.A05;
        if (str5 != null) {
            anonymousClass182.A0S(TraceFieldType.RequestID, str5);
        }
        String str6 = genAIToolInfoDict.A06;
        if (str6 != null) {
            anonymousClass182.A0S("response_id", str6);
        }
        String str7 = genAIToolInfoDict.A07;
        if (str7 != null) {
            anonymousClass182.A0S("sticker_style_str", str7);
        }
        CameraTool cameraTool = genAIToolInfoDict.A00;
        if (cameraTool != null) {
            anonymousClass182.A0S("tool_type", cameraTool.A00);
        }
        String str8 = genAIToolInfoDict.A08;
        if (str8 != null) {
            anonymousClass182.A0S("topic", str8);
        }
        anonymousClass182.A0a();
    }
}
