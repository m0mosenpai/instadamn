package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HlW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39822HlW {
    public static Map A00(InterfaceC43579JMn interfaceC43579JMn) {
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        String str3 = null;
        if (interfaceC43579JMn.Aar() != null) {
            ClipsTextAlignment Aar = interfaceC43579JMn.Aar();
            if (Aar != null) {
                str2 = Aar.A00;
            } else {
                str2 = null;
            }
            A1I.put("alignment", str2);
        }
        if (interfaceC43579JMn.ApQ() != null) {
            List<InterfaceC93074Fh> ApQ = interfaceC43579JMn.ApQ();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC93074Fh interfaceC93074Fh : ApQ) {
                if (interfaceC93074Fh != null) {
                    A1E.add(interfaceC93074Fh.F7o());
                }
            }
            A1I.put("colors", A1E);
        }
        if (interfaceC43579JMn.B29() != null) {
            AbstractC37303Gc4.A1N(interfaceC43579JMn.B29(), A1I);
        }
        if (interfaceC43579JMn.B7g() != null) {
            A1I.put("font_size", AbstractC166997dE.A0f(interfaceC43579JMn.B7g()));
        }
        if (interfaceC43579JMn.BDR() != null) {
            AbstractC37303Gc4.A1L(interfaceC43579JMn.BDR(), A1I);
        }
        if (interfaceC43579JMn.CPu() != null) {
            A1I.put("is_animated", interfaceC43579JMn.CPu());
        }
        if (interfaceC43579JMn.CUj() != null) {
            A1I.put("is_feels_like_ig", interfaceC43579JMn.CUj());
        }
        if (interfaceC43579JMn.BYe() != null) {
            A1I.put("offset_x", AbstractC166997dE.A0f(interfaceC43579JMn.BYe()));
        }
        if (interfaceC43579JMn.BYg() != null) {
            A1I.put("offset_y", AbstractC166997dE.A0f(interfaceC43579JMn.BYg()));
        }
        if (interfaceC43579JMn.Bpc() != null) {
            A1I.put("rotation_degree", AbstractC166997dE.A0f(interfaceC43579JMn.Bpc()));
        }
        if (interfaceC43579JMn.BqQ() != null) {
            A1I.put("scale", AbstractC166997dE.A0f(interfaceC43579JMn.BqQ()));
        }
        if (interfaceC43579JMn.Bzq() != null) {
            AbstractC37303Gc4.A1O(interfaceC43579JMn.Bzq(), A1I);
        }
        if (interfaceC43579JMn.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC43579JMn.getText(), A1I);
        }
        if (interfaceC43579JMn.C6D() != null) {
            ClipsTextEmphasisMode C6D = interfaceC43579JMn.C6D();
            if (C6D != null) {
                str = C6D.A00;
            } else {
                str = null;
            }
            A1I.put("text_emphasis_mode", str);
        }
        if (interfaceC43579JMn.C6K() != null) {
            ClipsTextFormatType C6K = interfaceC43579JMn.C6K();
            if (C6K != null) {
                str3 = C6K.A00;
            }
            A1I.put("text_format_type", str3);
        }
        if (interfaceC43579JMn.CHf() != null) {
            AbstractC37303Gc4.A1K(interfaceC43579JMn.CHf(), A1I);
        }
        if (interfaceC43579JMn.CIi() != null) {
            A1I.put("z_index", interfaceC43579JMn.CIi());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
