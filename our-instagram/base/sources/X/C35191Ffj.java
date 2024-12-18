package X;

import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.Ffj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35191Ffj {
    public static final C35191Ffj A00 = new Object();

    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2) {
        A01(abstractC12990ll, str, str2, null);
    }

    public static final void A01(AbstractC12990ll abstractC12990ll, String str, String str2, String str3) {
        String str4;
        EnumC72430Xda enumC72430Xda;
        Long l = null;
        if (abstractC12990ll instanceof UserSession) {
            str4 = ((UserSession) abstractC12990ll).userId;
        } else {
            str4 = null;
        }
        String A0s = AbstractC31174DnI.A0s();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "fxcal_linking_product");
        AbstractC31171DnF.A1B(A0f, str);
        try {
            enumC72430Xda = EnumC72430Xda.valueOf(AbstractC166997dE.A10(Locale.ROOT, str2));
        } catch (IllegalArgumentException unused) {
            enumC72430Xda = EnumC72430Xda.A04;
        }
        A0f.A8R(enumC72430Xda, "linking_flow_entry_point");
        if (str4 != null) {
            l = AbstractC166997dE.A0j(str4);
        }
        A0f.A9K("initiator_account_id", l);
        A0f.A8R(EnumC31511Dsv.INSTAGRAM, "initiator_account_type");
        A0f.AAP("app_device_id", A0s);
        A0f.AAP("debug_data", str3);
        A0f.Cht();
    }
}
