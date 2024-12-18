package X;

import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class A0V {
    public static final Capabilities A00(UserSession userSession) {
        ArrayList A1N = AbstractC16960so.A1N(EnumC2054697t.A0K, EnumC2054697t.A0H, EnumC2054697t.A0L);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342156051468977840L)) {
            A1N.add(EnumC2054697t.A0F);
        }
        if (C18U.A06(c06090Tz, userSession, 36313042255152814L)) {
            A1N.add(EnumC2054697t.A0G);
        }
        if (C18U.A06(c06090Tz, userSession, 2342156051468781229L)) {
            A1N.add(EnumC2054697t.A0u);
        }
        Parcelable.Creator creator = Capabilities.CREATOR;
        return AbstractC2054797v.A00(A1N);
    }
}
