package X;

import com.instagram.api.schemas.ClipChainType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HlI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39808HlI {
    public static Map A00(InterfaceC43530JKq interfaceC43530JKq) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC43530JKq.Ao6();
        A1I.put("clip_count", Integer.valueOf(interfaceC43530JKq.Ao6()));
        if (interfaceC43530JKq.AoC() != null) {
            ClipChainType AoC = interfaceC43530JKq.AoC();
            C14360o3.A0B(AoC, 0);
            A1I.put("clips_chain_type", AoC.A00);
        }
        if (interfaceC43530JKq.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC43530JKq.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
