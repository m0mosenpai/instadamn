package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class SXo {
    public static final SXo A01 = new SXo();
    public final Map A00 = AbstractC166987dD.A1G();

    public final synchronized void A00(Th7 creator, Class parametersClass) {
        Map map = this.A00;
        Th7 th7 = (Th7) map.get(parametersClass);
        if (th7 != null && !th7.equals(creator)) {
            throw AbstractC58318PtA.A0x("Different key creator for parameters class already inserted");
        }
        map.put(parametersClass, creator);
    }
}
