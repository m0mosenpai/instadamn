package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2fD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54562fD {
    public final List A00 = AbstractC16960so.A1Q(EnumC54222eY.A0I, EnumC54222eY.A0G, EnumC54222eY.A0f, EnumC54222eY.A0T, EnumC54222eY.A0X);
    public final List A01;

    public C54562fD() {
        List singletonList = Collections.singletonList(EnumC54222eY.A0k);
        C14360o3.A07(singletonList);
        this.A01 = singletonList;
    }

    public final List A00(Context context, UserSession userSession) {
        if (AbstractC14490oL.A09(context) && C18U.A06(C06090Tz.A05, userSession, 36327799757224820L)) {
            return this.A01;
        }
        return this.A00;
    }
}
