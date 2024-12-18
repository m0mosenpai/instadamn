package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9H0, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class C9H0 {
    public static Map A00(InterfaceC93104Fm interfaceC93104Fm) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC93104Fm.Aar() != null) {
            ClipsTextAlignment Aar = interfaceC93104Fm.Aar();
            C14360o3.A0B(Aar, 0);
            A1I.put("alignment", Aar.A00);
        }
        if (interfaceC93104Fm.ApQ() != null) {
            List<InterfaceC93074Fh> ApQ = interfaceC93104Fm.ApQ();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC93074Fh interfaceC93074Fh : ApQ) {
                if (interfaceC93074Fh != null) {
                    A1E.add(interfaceC93074Fh.F7o());
                }
            }
            A1I.put("colors", A1E);
        }
        interfaceC93104Fm.B27();
        A1I.put("end_time_ms", AbstractC166997dE.A0e(interfaceC93104Fm.B27()));
        interfaceC93104Fm.B7f();
        A1I.put("font_size", AbstractC166997dE.A0e(interfaceC93104Fm.B7f()));
        interfaceC93104Fm.BDQ();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, AbstractC166997dE.A0e(interfaceC93104Fm.BDQ()));
        if (interfaceC93104Fm.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, interfaceC93104Fm.getId());
        }
        interfaceC93104Fm.isAnimated();
        A1I.put("is_animated", Integer.valueOf(interfaceC93104Fm.isAnimated()));
        interfaceC93104Fm.BYd();
        A1I.put("offset_x", AbstractC166997dE.A0e(interfaceC93104Fm.BYd()));
        interfaceC93104Fm.BYf();
        A1I.put("offset_y", AbstractC166997dE.A0e(interfaceC93104Fm.BYf()));
        interfaceC93104Fm.Bpb();
        A1I.put("rotation_degree", AbstractC166997dE.A0e(interfaceC93104Fm.Bpb()));
        interfaceC93104Fm.BqP();
        A1I.put("scale", AbstractC166997dE.A0e(interfaceC93104Fm.BqP()));
        interfaceC93104Fm.Bzo();
        A1I.put("start_time_ms", AbstractC166997dE.A0e(interfaceC93104Fm.Bzo()));
        if (interfaceC93104Fm.getText() != null) {
            A1I.put("text", interfaceC93104Fm.getText());
        }
        if (interfaceC93104Fm.C6D() != null) {
            ClipsTextEmphasisMode C6D = interfaceC93104Fm.C6D();
            C14360o3.A0B(C6D, 0);
            A1I.put("text_emphasis_mode", C6D.A00);
        }
        if (interfaceC93104Fm.C6K() != null) {
            ClipsTextFormatType C6K = interfaceC93104Fm.C6K();
            C14360o3.A0B(C6K, 0);
            A1I.put("text_format_type", C6K.A00);
        }
        interfaceC93104Fm.CHe();
        A1I.put(IgReactMediaPickerNativeModule.WIDTH, AbstractC166997dE.A0e(interfaceC93104Fm.CHe()));
        interfaceC93104Fm.getZIndex();
        return AbstractC167017dG.A0v(A1I, interfaceC93104Fm.getZIndex());
    }
}
