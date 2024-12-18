package X;

import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDI {
    public static Map A00(InterfaceC104874ny interfaceC104874ny) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104874ny.B80() != null) {
            IGFormatLiquidityUseCaseEnum B80 = interfaceC104874ny.B80();
            if (B80 != null) {
                str = B80.A00;
            } else {
                str = null;
            }
            A1I.put("format_liquidity_use_case", str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
