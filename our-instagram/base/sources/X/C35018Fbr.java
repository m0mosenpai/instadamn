package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fbr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35018Fbr {
    public Integer A00 = null;
    public Integer A01 = 100;
    public final UserSession A02;

    public static String A00(Context context, C35018Fbr c35018Fbr, EnumC31337Dq2 enumC31337Dq2, int i, boolean z) {
        Resources resources;
        int i2;
        Object[] objArr;
        int A00;
        int A07;
        Resources resources2;
        int i3;
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    A07 = c35018Fbr.A01(enumC31337Dq2, i, z);
                    resources2 = context.getResources();
                    boolean A05 = C18U.A05(C06090Tz.A05, c35018Fbr.A02);
                    i3 = R.plurals.direct_max_recipients_reached_body;
                    if (A05) {
                        i3 = R.plurals.direct_max_recipients_in_chat_reached_body;
                    }
                }
            } else {
                EnumC31337Dq2 enumC31337Dq22 = EnumC31337Dq2.A02;
                UserSession userSession = c35018Fbr.A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (enumC31337Dq2 == enumC31337Dq22) {
                    A00 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597321843149605L);
                    resources = context.getResources();
                    i2 = 2131958795;
                    objArr = new Object[1];
                    objArr[0] = Integer.valueOf(A00);
                    return resources.getString(i2, objArr);
                }
                A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36597970380262478L);
                resources2 = context.getResources();
                i3 = R.plurals.direct_broadcast_chats_max_collaborators_message;
            }
            return AbstractC167017dG.A0k(resources2, A07, i3);
        }
        resources = context.getResources();
        i2 = 2131957219;
        objArr = new Object[1];
        A00 = AbstractC2051396d.A00(c35018Fbr.A02);
        objArr[0] = Integer.valueOf(A00);
        return resources.getString(i2, objArr);
    }

    public final int A01(EnumC31337Dq2 enumC31337Dq2, int i, boolean z) {
        long j;
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    Integer num = this.A00;
                    if (z && num != null) {
                        return num.intValue();
                    }
                    return C8S8.DEFAULT_SWIPE_ANIMATION_DURATION;
                }
            } else {
                EnumC31337Dq2 enumC31337Dq22 = EnumC31337Dq2.A02;
                UserSession userSession = this.A02;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (enumC31337Dq2 == enumC31337Dq22) {
                    j = 36597321843149605L;
                } else {
                    j = 36597970380262478L;
                }
                return AbstractC25225BEi.A07(c06090Tz, userSession, j);
            }
        }
        return AbstractC2051396d.A00(this.A02) + 1;
    }

    public C35018Fbr(UserSession userSession) {
        this.A02 = userSession;
        if (((int) AbstractC166987dD.A0N(AbstractC47132Ef.A00(userSession).A1J.getValue())) == 4) {
            C1334460n.A01(this.A02, "UnifiedGroupsHelper").A03(new M8M(this, 15));
        }
    }

    public final Dialog A02(Context context, EnumC31337Dq2 enumC31337Dq2, int i, boolean z) {
        int i2;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        if (i != 28) {
            if (i != 29) {
                if (i != 61) {
                    i2 = 2131959851;
                    if (C18U.A05(C06090Tz.A05, this.A02)) {
                        i2 = 2131959850;
                    }
                }
            } else {
                i2 = 2131958793;
                if (enumC31337Dq2 == EnumC31337Dq2.A02) {
                    i2 = 2131958794;
                }
            }
            A0I.A0A(i2);
            A0I.A0r(A00(context, this, enumC31337Dq2, i, z));
            A0I.A07();
            return A0I.A02();
        }
        i2 = 2131957220;
        A0I.A0A(i2);
        A0I.A0r(A00(context, this, enumC31337Dq2, i, z));
        A0I.A07();
        return A0I.A02();
    }
}
