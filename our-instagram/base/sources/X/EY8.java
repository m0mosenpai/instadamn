package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EY8 extends C4F4 implements C7VC {
    public final C7TT A00;
    public final CharSequence A01;
    public final Integer A02;
    public final String A03;

    public EY8(Context context, UserSession userSession, C7TT c7tt, User user, Integer num) {
        String string;
        String str;
        CharSequence A0t;
        Resources resources;
        int i;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 4 && intValue != 2 && intValue != 3 && intValue != 0) {
                throw B4Z.A00();
            }
            string = null;
        } else {
            string = context.getString(AbstractC455527p.A01(userSession) ? 2131974144 : 2131971383);
        }
        boolean A01 = AbstractC455527p.A01(userSession);
        boolean is24HourFormat = DateFormat.is24HourFormat(context);
        Locale A02 = C1Q2.A02();
        if (is24HourFormat) {
            str = "H:mm";
        } else {
            str = "h:mm a";
        }
        String format = new SimpleDateFormat(str, A02).format(new Date());
        if (intValue != 1) {
            if (intValue != 4) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 0) {
                            A0t = AbstractC07900bA.A01(context.getResources(), new String[]{format, context.getString(R.string.res_0x7f130072_name_removed)}, A01 ? 2131974137 : 2131971374);
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        resources = context.getResources();
                        i = 2131971409;
                        if (A01) {
                            i = 2131974167;
                        }
                    }
                } else {
                    resources = context.getResources();
                    i = 2131971405;
                    if (A01) {
                        i = 2131974163;
                    }
                }
                A0t = AbstractC31173DnH.A0B(resources, user != null ? user.getUsername() : null, i);
            } else {
                A0t = AbstractC167007dF.A0f(context, context.getString(R.string.res_0x7f130072_name_removed), A01 ? 2131974168 : 2131971410);
            }
        } else {
            A0t = AbstractC31174DnI.A0t(context, format, context.getString(R.string.res_0x7f130072_name_removed), A01 ? 2131974143 : 2131971382);
        }
        C14360o3.A07(A0t);
        CharSequence charSequence = A0t;
        C14360o3.A0B(charSequence, 2);
        this.A03 = string;
        this.A01 = charSequence;
        this.A02 = num;
        this.A00 = c7tt;
    }

    @Override // X.C7VC
    public final int getType() {
        return 157;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        EY8 ey8 = (EY8) obj;
        C14360o3.A0B(ey8, 0);
        if (C14360o3.A0K(this.A03, ey8.A03) && C14360o3.A0K(this.A01, ey8.A01)) {
            return true;
        }
        return false;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }
}
