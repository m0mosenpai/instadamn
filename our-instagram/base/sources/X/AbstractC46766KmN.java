package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KmN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46766KmN {
    public static final C45658KIv A00(UserSession userSession, EnumC43799JYm enumC43799JYm, EnumC44049Jda enumC44049Jda, AbstractC46972Dl abstractC46972Dl) {
        int i;
        int i2;
        int i3;
        Integer num;
        C45084JxE c45084JxE;
        AbstractC46972Dl abstractC46972Dl2;
        C14360o3.A0B(userSession, 0);
        if (!C2E9.A07(userSession)) {
            return null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        if (enumC44049Jda == EnumC44049Jda.A03 || enumC44049Jda == EnumC44049Jda.A04) {
            A1E2.add(EnumC46214Kcq.A0A);
        }
        if (C2E9.A00(userSession)) {
            A1E2.add(EnumC46214Kcq.A06);
        }
        if (C2E9.A0A(userSession)) {
            A1E2.add(EnumC46214Kcq.A09);
            if (!C14360o3.A0K(abstractC46972Dl, C132705yt.A00)) {
                A1E2.add(EnumC46214Kcq.A08);
            }
        }
        A1E2.add(EnumC46214Kcq.A07);
        Iterator it = A1E2.iterator();
        while (it.hasNext()) {
            EnumC46214Kcq enumC46214Kcq = (EnumC46214Kcq) it.next();
            if (enumC46214Kcq == EnumC46214Kcq.A0A) {
                if (C14360o3.A0K(abstractC46972Dl, C47062Du.A00)) {
                    if (enumC44049Jda == EnumC44049Jda.A04) {
                        abstractC46972Dl2 = C132695ys.A00;
                    } else {
                        abstractC46972Dl2 = C47032Dr.A00;
                    }
                } else {
                    abstractC46972Dl2 = abstractC46972Dl;
                }
                if (abstractC46972Dl2 != null) {
                    Integer A01 = LIF.A01(abstractC46972Dl2);
                    int A00 = LIF.A00(abstractC46972Dl2);
                    if (A01 != null) {
                        c45084JxE = new C45084JxE(enumC43799JYm, enumC46214Kcq, abstractC46972Dl2, A00, A01.intValue(), R.drawable.instagram_chevron_down_pano_filled_12);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    continue;
                }
            } else {
                if (enumC46214Kcq == EnumC46214Kcq.A06 && C14360o3.A0K(abstractC46972Dl, C47062Du.A00)) {
                    num = LIF.A01(abstractC46972Dl);
                    i = LIF.A00(abstractC46972Dl);
                    if (num == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else if (enumC43799JYm.A01 != C4I3.A03 && ((List) EnumC46214Kcq.A03.A02(userSession, enumC46214Kcq, abstractC46972Dl).A00).contains(enumC43799JYm)) {
                    num = enumC43799JYm.A02;
                    i = enumC43799JYm.A00;
                    if (num == null) {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    i = enumC46214Kcq.A02;
                    i2 = enumC46214Kcq.A00;
                    i3 = enumC46214Kcq.A01;
                    c45084JxE = new C45084JxE(enumC43799JYm, enumC46214Kcq, abstractC46972Dl, i, i2, i3);
                }
                i2 = num.intValue();
                i3 = R.drawable.instagram_x_pano_filled_12;
                c45084JxE = new C45084JxE(enumC43799JYm, enumC46214Kcq, abstractC46972Dl, i, i2, i3);
            }
            A1E.add(c45084JxE);
        }
        return new C45658KIv(A1E);
    }
}
