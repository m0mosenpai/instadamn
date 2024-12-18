package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55952hg {
    public final C55962hh A01;
    public final Map A02 = new HashMap();
    public final java.util.Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public boolean A00 = true;

    public static C55952hg A01(Choreographer choreographer) {
        return new C55952hg(new C55962hh(choreographer));
    }

    public final C55982hj A02() {
        C55982hj c55982hj = new C55982hj(this);
        Map map = this.A02;
        String str = c55982hj.A0C;
        if (!map.containsKey(str)) {
            map.put(str, c55982hj);
            return c55982hj;
        }
        throw new IllegalArgumentException("spring is already registered");
    }

    public final void A03(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                C55962hh c55962hh = this.A01;
                if (!c55962hh.A02) {
                    c55962hh.A02 = true;
                    c55962hh.A00 = SystemClock.uptimeMillis();
                    Choreographer choreographer = c55962hh.A04;
                    Choreographer.FrameCallback frameCallback = c55962hh.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0g("springId ", str, " does not reference a registered spring"));
    }

    public C55952hg(C55962hh c55962hh) {
        this.A01 = c55962hh;
        c55962hh.A01 = this;
    }

    public static C55952hg A00() {
        return new C55952hg(new C55962hh(Choreographer.getInstance()));
    }
}
