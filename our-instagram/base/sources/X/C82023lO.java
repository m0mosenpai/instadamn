package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82023lO extends AbstractC82033lP {
    public final /* synthetic */ C82013lN A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ WeakReference A02;

    public C82023lO(C82013lN c82013lN, String str, WeakReference weakReference) {
        this.A00 = c82013lN;
        this.A02 = weakReference;
        this.A01 = str;
    }

    public static final void A00(C82023lO c82023lO, java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C82013lN c82013lN = c82023lO.A00;
            Reel A0M = ReelStore.A03(c82013lN.A01).A0M(str);
            if (A0M != null) {
                A0M.A1X = true;
            }
            c82013lN.A04.remove(str);
            Map map = c82013lN.A02;
            List list = (List) map.get(str);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC81993lL interfaceC81993lL = (InterfaceC81993lL) ((Reference) it2.next()).get();
                    if (interfaceC81993lL != null) {
                        interfaceC81993lL.DPz(str, false);
                    }
                }
            }
            map.remove(str);
        }
    }
}
