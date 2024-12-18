package X;

import com.facebook.flipper.plugins.bloksdebugger.ClientState;
import com.facebook.flipper.plugins.bloksdebugger.InstructionWithTs;
import com.facebook.flipper.plugins.bloksdebugger.Log$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVO implements InstructionWithTs {
    public static final Log$Companion Companion = new Object();
    public final long A00;
    public final ClientState A01;
    public final Object A02;
    public final String A03;

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVO(ClientState clientState, Object obj, @Serializable(with = C71699Wz8.class) String str, int i, long j) {
        if (15 != (i & 15)) {
            AbstractC68612VXn.A00(C71715Wzg.A01, i, 15);
            throw C00O.createAndThrow();
        }
        this.A03 = str;
        this.A02 = obj;
        this.A01 = clientState;
        this.A00 = j;
    }
}
