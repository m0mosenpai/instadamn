package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class T6F implements InterfaceC65417Tjo {
    public final List A00;

    @Override // X.InterfaceC65417Tjo
    public final void FFi(SGX sgx) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC65417Tjo) it.next()).FFi(sgx);
        }
    }

    public T6F(Context context, AbstractC61503Roe abstractC61503Roe) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = A1E;
        if (((C60715RNv) abstractC61503Roe).A02) {
            A1E.add(new T6G(context, abstractC61503Roe));
        }
    }
}
