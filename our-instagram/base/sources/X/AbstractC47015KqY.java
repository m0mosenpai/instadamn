package X;

import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.KqY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47015KqY {
    public static void A00(C18920wW c18920wW, AbstractC115105If abstractC115105If, String str) {
        String str2;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "hidden_words_opening_bottom_sheet");
        if (A0f.isSampled()) {
            Number number = 0;
            C9CD c9cd = (C9CD) abstractC115105If.A00();
            Long l = null;
            if (c9cd != null) {
                number = (Number) c9cd.A00;
                str2 = c9cd.A01;
            } else {
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    if (A01 instanceof C53093Ne6) {
                        C53093Ne6 c53093Ne6 = (C53093Ne6) A01;
                        if (c53093Ne6 != null) {
                            number = Integer.valueOf(c53093Ne6.A00);
                        } else {
                            number = null;
                        }
                    }
                    str2 = A01.getMessage();
                } else {
                    str2 = null;
                }
            }
            A0f.AAP("surface_type", str);
            if (number != null) {
                l = AbstractC25229BEm.A0n(number);
            }
            A0f.A9K(TraceFieldType.ErrorCode, l);
            A0f.AAP("error_info", str2);
            A0f.Cht();
        }
    }
}
