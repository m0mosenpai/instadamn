package X;

import com.instagram.api.schemas.IGClickToMessagingCardTypeEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Euq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33702Euq {
    public static Map A00(InterfaceC37265GbI interfaceC37265GbI) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC37265GbI.Am0() != null) {
            IGClickToMessagingCardTypeEnum Am0 = interfaceC37265GbI.Am0();
            if (Am0 != null) {
                str = Am0.A00;
            } else {
                str = null;
            }
            A1I.put("cardType", str);
        }
        if (interfaceC37265GbI.BEd() != null) {
            A1I.put("icebreakerDisclaimerText", interfaceC37265GbI.BEd());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
