package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaGestureType;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CYv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28067CYv {
    public static final boolean A00(MotionEvent motionEvent, C38161q3 c38161q3, UserSession userSession, C141596ac c141596ac, int i, int i2) {
        int i3;
        Integer num;
        if (!(!c141596ac.A0q)) {
            return true;
        }
        if (c38161q3 != null && (num = c38161q3.A04) != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        if (SystemClock.uptimeMillis() - c141596ac.A0O > i3) {
            return true;
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36319029434194838L)) {
            return false;
        }
        float A00 = AbstractC25225BEi.A00(c06090Tz, userSession, 37163454364385567L);
        float A002 = AbstractC25225BEi.A00(c06090Tz, userSession, 37163454364451104L);
        if (A00 <= 0.0f || A002 <= 0.0f) {
            return false;
        }
        float f = (1.0f - A002) / 2.0f;
        float f2 = i2;
        float f3 = f * f2;
        float f4 = f2 - f3;
        float y = motionEvent.getY();
        if (f3 > y || y > f4) {
            return false;
        }
        float f5 = i;
        float f6 = ((1.0f - A00) / 2.0f) * f5;
        float f7 = f5 - f6;
        float x = motionEvent.getX();
        if (f6 > x || x > f7) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C38161q3 c38161q3) {
        List list;
        if (c38161q3 != null && (list = c38161q3.A05) != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == IGAdsStoryInteractiveMediaGestureType.A04) {
                    return true;
                }
            }
        }
        return false;
    }
}
