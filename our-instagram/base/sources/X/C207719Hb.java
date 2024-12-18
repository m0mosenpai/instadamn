package X;

import android.view.View;
import android.widget.Space;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;

/* renamed from: X.9Hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207719Hb extends AbstractC163037Ro {
    public final Space A00;
    public final ObservableVerticalOffsetConstraintLayout A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207719Hb(Space space, ObservableVerticalOffsetConstraintLayout observableVerticalOffsetConstraintLayout) {
        super(observableVerticalOffsetConstraintLayout);
        C14360o3.A0B(space, 2);
        this.A01 = observableVerticalOffsetConstraintLayout;
        this.A00 = space;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C207719Hb) {
                C207719Hb c207719Hb = (C207719Hb) obj;
                if (!C14360o3.A0K(this.A01, c207719Hb.A01) || !C14360o3.A0K(this.A00, c207719Hb.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC163037Ro
    public final /* bridge */ /* synthetic */ View A00() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Constraint(root=");
        A1C.append(this.A01);
        A1C.append(", spacer=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
