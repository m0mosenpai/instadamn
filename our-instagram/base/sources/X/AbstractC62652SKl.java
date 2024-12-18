package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.SKl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62652SKl {
    public final Map A00 = AbstractC166987dD.A1G();

    public final Object A00(Object obj) {
        Object sx9;
        Map map = this.A00;
        synchronized (map) {
            if (map.containsKey(obj)) {
                sx9 = map.get(obj);
            } else {
                if (this instanceof RW6) {
                    sx9 = new RW7(((RW6) this).A00, (C63010SaY) obj);
                } else if (this instanceof RW5) {
                    AbstractC61503Roe abstractC61503Roe = (AbstractC61503Roe) obj;
                    C63164SeO A00 = C63164SeO.A00();
                    sx9 = new C63281Sgg((Context) A00.A01(Context.class), new T6F((Context) C63164SeO.A00().A01(Context.class), abstractC61503Roe), (SXq) A00.A01(SXq.class), ((C60715RNv) abstractC61503Roe).A01);
                } else if (this instanceof RW4) {
                    AbstractC61401Rn0 abstractC61401Rn0 = (AbstractC61401Rn0) obj;
                    C63164SeO A002 = C63164SeO.A00();
                    sx9 = new SXH((Context) A002.A01(Context.class), new T6B((Context) C63164SeO.A00().A01(Context.class), abstractC61401Rn0), (SXq) A002.A01(SXq.class), ((RNF) abstractC61401Rn0).A01);
                } else {
                    AbstractC61298RlI abstractC61298RlI = (AbstractC61298RlI) obj;
                    C63164SeO A003 = C63164SeO.A00();
                    sx9 = new SX9((Context) A003.A01(Context.class), new T68((Context) C63164SeO.A00().A01(Context.class), abstractC61298RlI), (SXq) A003.A01(SXq.class), ((RNB) abstractC61298RlI).A01);
                }
                map.put(obj, sx9);
            }
        }
        return sx9;
    }
}
