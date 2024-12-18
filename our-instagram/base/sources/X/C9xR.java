package X;

import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.StoryTemplateCaptionDictIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9xR, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9xR {
    public static Map A00(StoryTemplateCaptionDictIntf storyTemplateCaptionDictIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (storyTemplateCaptionDictIntf.Aau() != null) {
            A1I.put("alignment", storyTemplateCaptionDictIntf.Aau());
        }
        if (storyTemplateCaptionDictIntf.Abs() != null) {
            A1I.put("animation", storyTemplateCaptionDictIntf.Abs());
        }
        if (storyTemplateCaptionDictIntf.ApP() != null) {
            A1I.put("colors", storyTemplateCaptionDictIntf.ApP());
        }
        if (storyTemplateCaptionDictIntf.B0j() != null) {
            A1I.put("effects", storyTemplateCaptionDictIntf.B0j());
        }
        storyTemplateCaptionDictIntf.B7f();
        A1I.put("font_size", AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.B7f()));
        if (storyTemplateCaptionDictIntf.B83() != null) {
            ClipsTextFormatType B83 = storyTemplateCaptionDictIntf.B83();
            C14360o3.A0B(B83, 0);
            A1I.put("format_type", B83.A00);
        }
        storyTemplateCaptionDictIntf.BDQ();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.BDQ()));
        storyTemplateCaptionDictIntf.BpY();
        A1I.put("rotation", AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.BpY()));
        storyTemplateCaptionDictIntf.BqP();
        A1I.put("scale", AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.BqP()));
        if (storyTemplateCaptionDictIntf.BrU() != null) {
            A1I.put("secondary_color", storyTemplateCaptionDictIntf.BrU());
        }
        if (storyTemplateCaptionDictIntf.getText() != null) {
            A1I.put("text", storyTemplateCaptionDictIntf.getText());
        }
        storyTemplateCaptionDictIntf.CHe();
        A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.CHe()));
        storyTemplateCaptionDictIntf.CI0();
        A1I.put("x", AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.CI0()));
        storyTemplateCaptionDictIntf.CIZ();
        A1I.put("y", AbstractC166997dE.A0e(storyTemplateCaptionDictIntf.CIZ()));
        storyTemplateCaptionDictIntf.getZIndex();
        return AbstractC167017dG.A0v(A1I, storyTemplateCaptionDictIntf.getZIndex());
    }
}
