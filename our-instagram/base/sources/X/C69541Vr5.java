package X;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Vr5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69541Vr5 {
    public final java.util.Set A01 = new HashSet();
    public final java.util.Set A00 = new HashSet();

    public final void A00(Bundle bundle) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC71991XEe) it.next()).DxI(bundle);
        }
    }
}
