package X;

import com.facebook.flipper.plugins.bloksdebugger.InstructionWithTs;
import com.facebook.flipper.plugins.bloksdebugger.SLog$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVN implements InstructionWithTs {
    public static final SLog$Companion Companion = new Object();
    public final long A00;
    public final Object A01;
    public final String A02;

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVN(Object obj, String str, @Serializable(with = C71699Wz8.class) int i, long j) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71716Wzh.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A02 = str;
        this.A01 = obj;
        this.A00 = j;
    }
}
