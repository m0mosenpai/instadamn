package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.CTd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27944CTd {
    public final Map A00 = AbstractC166987dD.A1I();

    public final InterfaceC30961DjI A00(Context context, C27987CVk c27987CVk, Object obj) {
        InterfaceC30961DjI interfaceC30961DjI;
        Object remove = this.A00.remove(new CVL(c27987CVk.A00, obj));
        if (!(remove instanceof InterfaceC30961DjI) || (interfaceC30961DjI = (InterfaceC30961DjI) remove) == null) {
            return (InterfaceC30961DjI) c27987CVk.A01.invoke(new CPW(AbstractC166987dD.A0O(context)), obj);
        }
        return interfaceC30961DjI;
    }
}
