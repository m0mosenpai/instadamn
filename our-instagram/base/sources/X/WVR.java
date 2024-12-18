package X;

import com.facebook.flipper.plugins.uidebugger.model.Action$UnitAction$Companion;
import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class WVR implements X7Q {
    public static final C3R9[] A03;
    public static final Action$UnitAction$Companion Companion = new Object();
    public final X7R A00;
    public final String A01;
    public final InterfaceC16820sZ A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.flipper.plugins.uidebugger.model.Action$UnitAction$Companion, java.lang.Object] */
    static {
        PolymorphicSerializer polymorphicSerializer = new PolymorphicSerializer(new C0YZ(X7R.class));
        polymorphicSerializer.A00 = AbstractC06960Yn.A0S(new Annotation[0]);
        A03 = new C3R9[]{null, polymorphicSerializer};
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WVR) {
                WVR wvr = (WVR) obj;
                if (!C14360o3.A0K(this.A01, wvr.A01) || !C14360o3.A0K(this.A00, wvr.A00) || !C14360o3.A0K(this.A02, wvr.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ WVR(X7R x7r, String str, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C71721Wzm.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A01 = str;
        this.A00 = x7r;
        this.A02 = C71768X3a.A00;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnitAction(title=");
        sb.append(this.A01);
        sb.append(", actionIcon=");
        sb.append(this.A00);
        sb.append(", action=");
        return AbstractC167017dG.A0o(this.A02, sb);
    }
}
