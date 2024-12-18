package X;

import android.graphics.drawable.Drawable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107574t2 {
    public float A00;
    public Map A03 = null;
    public ArrayList A02 = null;
    public long A01 = 0;

    public float A02(long j) {
        boolean containsKey;
        Object obj;
        if (this instanceof C107624t7) {
            return ((C107624t7) this).A00;
        }
        if (this instanceof C107564t1) {
            C107564t1 c107564t1 = (C107564t1) this;
            Map map = c107564t1.A03;
            if (map != null && map.size() > 1) {
                throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
            }
            Map map2 = c107564t1.A03;
            if (map2 == null) {
                containsKey = false;
            } else {
                containsKey = map2.containsKey("default_input");
            }
            Reference reference = (Reference) c107564t1.A00.A02();
            if (reference != null && (obj = reference.get()) != null) {
                if ((obj instanceof Drawable) && ((Drawable) obj).getCallback() == null) {
                    reference.clear();
                } else {
                    if (!containsKey) {
                        return c107564t1.A01.AX7(obj);
                    }
                    Map map3 = c107564t1.A03;
                    if (map3 != null && map3.size() > 1) {
                        throw new RuntimeException("Trying to get single input of node with multiple inputs!");
                    }
                    float f = c107564t1.A03("default_input").A00;
                    C107564t1.A01(c107564t1, f);
                    return f;
                }
            }
            if (containsKey) {
                Map map4 = c107564t1.A03;
                if (map4 != null && map4.size() > 1) {
                    throw new RuntimeException("Trying to get single input of node with multiple inputs!");
                }
                return c107564t1.A03("default_input").A00;
            }
            return ((AbstractC107574t2) c107564t1).A00;
        }
        if (this instanceof C107604t5) {
            C107604t5 c107604t5 = (C107604t5) this;
            if (c107604t5.A01 == Long.MIN_VALUE) {
                c107604t5.A02 = j;
                c107604t5.A01 = j;
                c107604t5.A00 = j + (c107604t5.A03 * 1000000);
                return 0.0f;
            }
            long j2 = c107604t5.A00;
            c107604t5.A01 = j;
            if (j >= j2) {
                return 1.0f;
            }
            long j3 = c107604t5.A02;
            return ((float) (j - j3)) / ((float) (j2 - j3));
        }
        if (this instanceof C107634t8) {
            float f2 = A03("initial").A00;
            return f2 + (A03("default_input").A00 * (A03("end").A00 - f2));
        }
        C107644t9 c107644t9 = (C107644t9) this;
        return c107644t9.A00.getInterpolation(c107644t9.A03("default_input").A00);
    }

    public final AbstractC107574t2 A03(String str) {
        String A0g;
        AbstractC107574t2 abstractC107574t2;
        Map map = this.A03;
        if (map != null && (abstractC107574t2 = (AbstractC107574t2) map.get(str)) != null) {
            return abstractC107574t2;
        }
        Map map2 = this.A03;
        if (map2 == null) {
            A0g = "[]";
        } else {
            Iterator it = map2.keySet().iterator();
            String str2 = "";
            while (it.hasNext()) {
                str2 = AnonymousClass001.A0u(str2, "'", (String) it.next(), "'");
                if (!it.hasNext()) {
                    str2 = AnonymousClass001.A0R(str2, ", ");
                }
            }
            A0g = AnonymousClass001.A0g("[", str2, "]");
        }
        throw new RuntimeException(AnonymousClass001.A0u("Tried to get non-existent input '", str, "'. Node only has these inputs: ", A0g));
    }
}
