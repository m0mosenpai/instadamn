package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.VwJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69833VwJ {
    static {
        TimeUnit.MICROSECONDS.convert(10L, TimeUnit.MILLISECONDS);
    }

    public static float A00(List list) {
        float f;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f2 = 1.0f;
            while (it.hasNext()) {
                MediaEffect mediaEffect = (MediaEffect) it.next();
                if (mediaEffect instanceof C23503AbJ) {
                    f = ((C23503AbJ) mediaEffect).A00;
                } else {
                    f = 1.0f;
                }
                f2 *= f;
            }
            if (f2 <= 1.0f) {
                return f2;
            }
        }
        return 1.0f;
    }
}
