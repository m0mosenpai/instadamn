package X;

import com.instagram.api.schemas.ClipsTemplatesStickerType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.9x7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225429x7 {
    public static Map A00(BE5 be5) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        be5.B27();
        A1I.put("end_time_ms", AbstractC166997dE.A0e(be5.B27()));
        be5.BDQ();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0e(be5.BDQ()));
        be5.BYd();
        A1I.put("offset_x", AbstractC166997dE.A0e(be5.BYd()));
        be5.BYf();
        A1I.put("offset_y", AbstractC166997dE.A0e(be5.BYf()));
        be5.Bpb();
        A1I.put("rotation_degree", AbstractC166997dE.A0e(be5.Bpb()));
        be5.BqP();
        A1I.put("scale", AbstractC166997dE.A0e(be5.BqP()));
        be5.Bzo();
        A1I.put("start_time_ms", AbstractC166997dE.A0e(be5.Bzo()));
        if (be5.C0c() != null) {
            A1I.put("sticker_id", be5.C0c());
        }
        if (be5.C0l() != null) {
            ClipsTemplatesStickerType C0l = be5.C0l();
            C14360o3.A0B(C0l, 0);
            A1I.put("sticker_type", C0l.A00);
        }
        be5.CHe();
        A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0e(be5.CHe()));
        be5.getZIndex();
        return AbstractC167017dG.A0v(A1I, be5.getZIndex());
    }
}
