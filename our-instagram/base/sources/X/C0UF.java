package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.0UF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0UF implements MobileConfigCxxChangeListener {
    public ExecutorService A01 = null;
    public Map A00 = new HashMap();

    public final synchronized void A00(String[] strArr) {
        int length;
        Map map = this.A00;
        if (map.containsKey(-2)) {
            Iterator it = ((Map) map.get(-2)).values().iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("listenerV2");
            }
        }
        if (strArr != null && (length = strArr.length) != 0) {
            int i = 0;
            do {
                try {
                    int parseInt = Integer.parseInt(strArr[i]);
                    if (map.containsKey(Integer.valueOf(parseInt))) {
                        Iterator it2 = ((Map) map.get(Integer.valueOf(parseInt))).values().iterator();
                        if (it2.hasNext()) {
                            it2.next();
                            throw new NullPointerException("listenerV2");
                        }
                    }
                    if (map.containsKey(-1)) {
                        Iterator it3 = ((Map) map.get(-1)).values().iterator();
                        if (it3.hasNext()) {
                            it3.next();
                            throw new NullPointerException("listenerV2");
                        }
                    }
                } catch (NumberFormatException e) {
                    e.toString();
                }
                i++;
            } while (i < length);
        }
    }

    @Override // com.facebook.mobileconfig.MobileConfigCxxChangeListener
    public final synchronized void onConfigChanged(final String[] strArr) {
        ExecutorService executorService = this.A01;
        if (executorService == null) {
            A00(strArr);
        } else {
            executorService.execute(new Runnable() { // from class: X.0UC
                @Override // java.lang.Runnable
                public final void run() {
                    C0UF.this.A00(strArr);
                }
            });
        }
    }
}
