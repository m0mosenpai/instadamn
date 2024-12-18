package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ezo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34009Ezo {
    public static final EnumC33342Eob A00(C6FQ c6fq, C6FW c6fw) {
        Number number;
        boolean z = false;
        Object A01 = c6fw.A01();
        EnumC33342Eob enumC33342Eob = null;
        if ((A01 instanceof Number) && (number = (Number) A01) != null) {
            int intValue = number.intValue();
            UserSession A0W = AbstractC31172DnG.A0W(c6fq);
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        enumC33342Eob = EnumC33342Eob.A02;
                    }
                } else {
                    enumC33342Eob = EnumC33342Eob.A04;
                }
            } else {
                enumC33342Eob = EnumC33342Eob.A03;
            }
            C23031Ai A00 = AbstractC23021Ah.A00(A0W);
            if (enumC33342Eob != null && enumC33342Eob == EnumC33342Eob.A02) {
                z = true;
            }
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
            A0w.E77("has_story_comments_global_setting_disabled", z);
            A0w.apply();
        }
        return enumC33342Eob;
    }
}
