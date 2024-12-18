package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class RFq extends AbstractC63157Se6 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("category", this.A01);
        A1G.put("action", this.A03);
        A1G.put("label", this.A02);
        return AbstractC63157Se6.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, Long.valueOf(this.A00), A1G);
    }
}
