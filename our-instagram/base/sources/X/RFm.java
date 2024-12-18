package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class RFm extends AbstractC63157Se6 {
    public String A00;
    public boolean A01;

    public final String toString() {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(DevServerEntity.COLUMN_DESCRIPTION, this.A00);
        return AbstractC63157Se6.A01("fatal", Boolean.valueOf(this.A01), A1G);
    }
}
