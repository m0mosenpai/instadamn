package X;

import com.facebook.flipper.plugins.bloksdebugger.InstructionWithTs;
import com.facebook.flipper.plugins.bloksdebugger.StateUpdate$Companion;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVP implements InstructionWithTs {
    public final long A00;
    public final Object A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public static final StateUpdate$Companion Companion = new Object();
    public static final C3R9[] A06 = {null, null, null, null, null, new C3SG(C192398fh.A00)};

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVP(Object obj, String str, String str2, String str3, @Serializable(with = C71699Wz8.class) List list, int i, long j) {
        if (63 != (i & 63)) {
            AbstractC68612VXn.A00(C71718Wzj.A01, i, 63);
            throw C00O.createAndThrow();
        }
        this.A00 = j;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = obj;
        this.A02 = str3;
        this.A05 = list;
    }
}
