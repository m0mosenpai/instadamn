package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class WU6 implements InterfaceC103314l6 {
    public final VWI A00;
    public final Map A01 = new LinkedHashMap();

    @Override // X.InterfaceC103314l6
    public final void E79(String str, String str2) {
        this.A01.put(str, str2);
    }

    public WU6(VWI vwi) {
        this.A00 = vwi;
    }

    @Override // X.InterfaceC103314l6
    public final void EHA(String str, String str2, Throwable th) {
        AbstractC167017dG.A1N(str, str2);
        C0w9.A06(str, str2, th);
    }
}
