package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class BUI {
    public final List A00 = AbstractC166987dD.A1E();

    public final synchronized ArrayList A00() {
        ArrayList A1F;
        List list = this.A00;
        if (list.isEmpty()) {
            A1F = AbstractC166987dD.A1E();
        } else {
            A1F = AbstractC166987dD.A1F(list);
        }
        return A1F;
    }
}
