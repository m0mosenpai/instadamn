package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.0t4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17090t4 {
    public boolean A00;
    public final LinkedHashSet A01;
    public final java.util.Set A02;

    public final void A01(C0KV c0kv) {
        boolean z;
        UserSession userSession;
        LinkedHashSet linkedHashSet = this.A01;
        synchronized (linkedHashSet) {
            if (!linkedHashSet.contains(c0kv)) {
                linkedHashSet.add(c0kv);
            }
            z = this.A00;
        }
        if (z) {
            AbstractC18680vv A05 = C023409i.A0A.A05(this);
            if ((A05 instanceof UserSession) && (userSession = (UserSession) A05) != null) {
                ((InterfaceC13030lp) c0kv.AXR(userSession)).DyC(false);
            }
        }
    }

    public static final void A00(C17090t4 c17090t4, boolean z) {
        java.util.Set A0k;
        UserSession userSession;
        LinkedHashSet linkedHashSet = c17090t4.A01;
        synchronized (linkedHashSet) {
            if (z) {
                if (!c17090t4.A00) {
                    c17090t4.A00 = true;
                } else {
                    throw new IllegalStateException("We should only call initProviders once");
                }
            }
            A0k = AbstractC001800i.A0k(linkedHashSet);
        }
        AbstractC18680vv A05 = C023409i.A0A.A05(c17090t4);
        if ((A05 instanceof UserSession) && (userSession = (UserSession) A05) != null) {
            Iterator it = A0k.iterator();
            while (it.hasNext()) {
                ((InterfaceC13030lp) ((C0KV) it.next()).AXR(userSession)).DyC(z);
            }
        }
    }

    public C17090t4() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A01 = linkedHashSet;
        this.A02 = linkedHashSet;
    }
}
