package X;

import com.instagram.api.schemas.GraphGuardianContent;
import java.util.List;

/* renamed from: X.WoA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71113WoA implements InterfaceC37231Gag {
    public final C33298Ent A00;

    public C71113WoA(C33298Ent c33298Ent) {
        C14360o3.A0B(c33298Ent, 1);
        this.A00 = c33298Ent;
    }

    @Override // X.InterfaceC37231Gag
    public final int BD5() {
        return 0;
    }

    @Override // X.InterfaceC37231Gag
    public final long Ajf() {
        return this.A00.A01.A01;
    }

    @Override // X.InterfaceC37231Gag
    public final InterfaceC37287Gbo B8k() {
        C2JS A02 = this.A00.A00.A02(C67490Umq.class, "friend_requests", 1931829463);
        if (A02 != null) {
            return (InterfaceC37287Gbo) A02.A01(C67599UsK.class, 839552330);
        }
        return null;
    }

    @Override // X.InterfaceC37231Gag
    public final List BAk() {
        return ((YFT) this.A00).A00.BAk();
    }

    @Override // X.InterfaceC37231Gag
    public final boolean BUw() {
        return this.A00.A00.getCoercedBooleanField(4, "more_groups_available");
    }

    @Override // X.InterfaceC37231Gag
    public final List BWm() {
        List CEC = ((YFT) this.A00).A00.CEC();
        if (CEC == null) {
            return C16930sl.A00;
        }
        return CEC;
    }

    @Override // X.InterfaceC37231Gag
    public final List Bfn() {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC37231Gag
    public final boolean BvA() {
        return this.A00.A00.getCoercedBooleanField(7, "should_limit_list_of_followers");
    }

    @Override // X.InterfaceC37231Gag
    public final GraphGuardianContent Bz6() {
        return ((YFT) this.A00).A00.Bz6();
    }

    @Override // X.InterfaceC37231Gag
    public final List C3u() {
        List C3u = ((YFT) this.A00).A00.C3u();
        if (C3u == null) {
            return C16930sl.A00;
        }
        return C3u;
    }

    @Override // X.InterfaceC37231Gag
    public final boolean CDa() {
        return this.A00.A00.getCoercedBooleanField(11, "use_clickable_see_more");
    }

    @Override // X.InterfaceC37231Gag
    public final boolean CR4() {
        return this.A00.CR4();
    }

    @Override // X.InterfaceC37231Gag
    public final String getNextMaxId() {
        return this.A00.getNextMaxId();
    }
}
