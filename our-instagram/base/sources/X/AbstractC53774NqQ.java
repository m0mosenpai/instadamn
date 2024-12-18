package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.NqQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53774NqQ {
    public static Map A00(GenAIToolInfoDictIntf genAIToolInfoDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (genAIToolInfoDictIntf.getBackgroundColor() != null) {
            A1I.put("background_color", genAIToolInfoDictIntf.getBackgroundColor());
        }
        if (genAIToolInfoDictIntf.Ar1() != null) {
            A1I.put("content_id", genAIToolInfoDictIntf.Ar1());
        }
        if (genAIToolInfoDictIntf.Bid() != null) {
            A1I.put("prompt", genAIToolInfoDictIntf.Bid());
        }
        if (genAIToolInfoDictIntf.Bl1() != null) {
            A1I.put("recipe_caption", genAIToolInfoDictIntf.Bl1());
        }
        if (genAIToolInfoDictIntf.Bo9() != null) {
            A1I.put(TraceFieldType.RequestID, genAIToolInfoDictIntf.Bo9());
        }
        if (genAIToolInfoDictIntf.Boj() != null) {
            A1I.put("response_id", genAIToolInfoDictIntf.Boj());
        }
        if (genAIToolInfoDictIntf.C0j() != null) {
            A1I.put("sticker_style_str", genAIToolInfoDictIntf.C0j());
        }
        if (genAIToolInfoDictIntf.C9G() != null) {
            CameraTool C9G = genAIToolInfoDictIntf.C9G();
            C14360o3.A0B(C9G, 0);
            A1I.put("tool_type", C9G.A00);
        }
        if (genAIToolInfoDictIntf.C9b() != null) {
            A1I.put("topic", genAIToolInfoDictIntf.C9b());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
