package X;

import com.facebook.flipper.plugins.uidebugger.model.Action$BooleanAction$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVQ implements X7Q {
    public static final Action$BooleanAction$Companion Companion = new Object();
    public final String A00;
    public final boolean A01;
    public final InterfaceC16660sJ A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WVQ) {
                WVQ wvq = (WVQ) obj;
                if (!C14360o3.A0K(this.A00, wvq.A00) || this.A01 != wvq.A01 || !C14360o3.A0K(this.A02, wvq.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVQ(String str, int i, boolean z) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71720Wzl.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
        this.A01 = z;
        this.A02 = X5I.A00;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A01, this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BooleanAction(title=");
        sb.append(this.A00);
        sb.append(", value=");
        sb.append(this.A01);
        sb.append(", action=");
        return AbstractC167017dG.A0o(this.A02, sb);
    }
}
