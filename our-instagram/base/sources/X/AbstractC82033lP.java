package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3lP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82033lP {
    public void A02(Map map) {
        C51R c51r;
        C82023lO c82023lO = (C82023lO) this;
        c82023lO.A00.A03.removeAll(map.keySet());
        C82023lO.A00(c82023lO, map.keySet());
        WeakReference weakReference = c82023lO.A02;
        if (weakReference != null && (c51r = (C51R) weakReference.get()) != null) {
            c51r.DqI(map);
        }
    }

    public final void A01(C3W0 c3w0) {
        if (this instanceof C82023lO) {
            C82023lO c82023lO = (C82023lO) this;
            List BQP = c3w0.BQP();
            if (BQP != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = BQP.iterator();
                while (it.hasNext()) {
                    List Boc = ((InterfaceC74423Vy) it.next()).Boc();
                    if (Boc == null) {
                        Boc = C16930sl.A00;
                    }
                    AnonymousClass016.A16(Boc, arrayList);
                }
                C82013lN c82013lN = c82023lO.A00;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ExtendedImageUrl BGU = ((InterfaceC74403Vw) it2.next()).BGU();
                    if (BGU != null) {
                        C19L c19l = c82013lN.A05;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new PZI(c82013lN, BGU, null, 37), c19l);
                    }
                }
            }
        }
    }

    public void A03(java.util.Set set) {
        C51R c51r;
        if (this instanceof C82023lO) {
            C82023lO c82023lO = (C82023lO) this;
            C14360o3.A0B(set, 0);
            C82013lN c82013lN = c82023lO.A00;
            c82013lN.A03.addAll(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                UserSession userSession = c82013lN.A01;
                Reel A0M = ReelStore.A03(userSession).A0M(str);
                if (A0M != null) {
                    A0M.A1X = false;
                }
                c82013lN.A04.remove(str);
                Map map = c82013lN.A02;
                List list = (List) map.get(str);
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC81993lL interfaceC81993lL = (InterfaceC81993lL) ((Reference) it2.next()).get();
                        if (interfaceC81993lL != null) {
                            interfaceC81993lL.DPm(str);
                            AbstractC115975Mo.A01(userSession, str, "reel_media_and_segments_fail_to_load", c82023lO.A01);
                        }
                    }
                }
                map.remove(str);
            }
            WeakReference weakReference = c82023lO.A02;
            if (weakReference != null && (c51r = (C51R) weakReference.get()) != null) {
                c51r.onFailure();
            }
        }
    }

    public final void A04(java.util.Set set) {
        C51R c51r;
        if (this instanceof C82023lO) {
            C82023lO c82023lO = (C82023lO) this;
            c82023lO.A00.A03.removeAll(set);
            C82023lO.A00(c82023lO, set);
            WeakReference weakReference = c82023lO.A02;
            if (weakReference != null && (c51r = (C51R) weakReference.get()) != null) {
                c51r.onFailure();
            }
        }
    }
}
