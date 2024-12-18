package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HsT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40204HsT {
    public static Map A00(JL7 jl7) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jl7.getCount();
        A1I.put("count", Integer.valueOf(jl7.getCount()));
        if (jl7.getName() != null) {
            AbstractC37300Gc1.A14(jl7.getName(), A1I);
        }
        if (jl7.getValue() != null) {
            A1I.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, jl7.getValue());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
