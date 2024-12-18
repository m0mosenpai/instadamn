package X;

import android.text.Editable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class B0R implements Comparator {
    public final /* synthetic */ Editable A00;

    public B0R(Editable editable) {
        this.A00 = editable;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Editable editable = this.A00;
        return C2BS.A00(Integer.valueOf(editable.getSpanStart(obj)), Integer.valueOf(editable.getSpanStart(obj2)));
    }
}
