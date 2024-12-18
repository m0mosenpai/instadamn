package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class OY9 {
    public static final Long A00(String str) {
        List A0m;
        String str2;
        if (str != null && (A0m = AbstractC167007dF.A0m(str, "_", 0)) != null && (str2 = (String) AbstractC001800i.A0J(A0m)) != null) {
            return AbstractC166997dE.A0j(str2);
        }
        return null;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, String str) {
        Long A00 = A00(str);
        if (interfaceC02590Ai.isSampled() && A00 != null) {
            interfaceC02590Ai.A9K("media_id", A00);
            interfaceC02590Ai.AAP("entrypoint", "media_edit");
            interfaceC02590Ai.Cht();
        }
    }
}
