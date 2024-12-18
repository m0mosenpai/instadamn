package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC159127By extends AbstractC159137Bz {
    public final Integer A00;
    public final Integer A01;

    @Override // X.AbstractC159137Bz
    public final AbstractC160207Gg createCommandData() {
        String str;
        C7FY c7fy = this.commandType;
        String str2 = this.title;
        String str3 = this.description;
        if (str3 != null) {
            int i = this.iconDrawableRes;
            C7FZ c7fz = this.loggingId;
            Integer num = this.A00;
            if (this.A01 != null) {
                str = this.trigger;
            } else {
                str = null;
            }
            return new C7CF(c7fz, c7fy, num, str2, str3, str, i);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public AbstractC159127By(Context context, UserSession userSession, C7C2 c7c2, C7FZ c7fz, C7FY c7fy, Integer num, Integer num2, String str, int i, int i2) {
        super(context, userSession, c7fy, str, c7fz, Integer.valueOf(i), i2, c7c2, num2);
        this.A00 = num;
        this.A01 = num2;
    }
}
