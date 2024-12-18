package X;

import com.facebook.flipper.plugins.uidebugger.model.ActionIcon$Fb$Companion;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVT implements X7R {
    public static final ActionIcon$Fb$Companion Companion = new Object();
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof WVT) && C14360o3.A0K(this.A00, ((WVT) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0S("Fb(iconName=", this.A00, ')');
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVT(String str, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(C71723Wzo.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
    }
}
