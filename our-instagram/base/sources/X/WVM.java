package X;

import com.facebook.flipper.plugins.bloksdebugger.FnTableRead$Companion;
import com.facebook.flipper.plugins.bloksdebugger.Instruction;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVM implements Instruction {
    public static final FnTableRead$Companion Companion = new Object();
    public final String A00;
    public final String A01;

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVM(String str, String str2, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71713Wze.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = str2;
    }
}
