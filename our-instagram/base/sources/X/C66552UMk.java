package X;

import com.facebook.flipper.plugins.uidebugger.model.Inspectable;
import com.facebook.flipper.plugins.uidebugger.model.InspectableArray$Companion;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.UMk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66552UMk extends Inspectable {
    public final List A00;
    public static final InspectableArray$Companion Companion = new Object();
    public static final C3R9[] A01 = {new C3SG((C3R9) Inspectable.A00.getValue())};

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66552UMk) && C14360o3.A0K(this.A00, ((C66552UMk) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Deprecated(level = AbstractC68219VIb.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C66552UMk(List list, int i) {
        if (1 != (i & 1)) {
            AbstractC68612VXn.A00(X00.A01, i, 1);
            throw C00O.createAndThrow();
        }
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InspectableArray(items=");
        return AbstractC167017dG.A0o(this.A00, sb);
    }
}
