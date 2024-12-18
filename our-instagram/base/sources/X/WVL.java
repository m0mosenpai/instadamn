package X;

import com.facebook.flipper.plugins.bloksdebugger.CoreInstruction$Companion;
import com.facebook.flipper.plugins.bloksdebugger.Instruction;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVL implements Instruction {
    public static final CoreInstruction$Companion Companion = new Object();
    public final String A00;

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVL(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C71712Wzd.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }
}
