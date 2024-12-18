package X;

import com.instagram.profile.fragment.ProfileFollowRelationshipFragment;

/* loaded from: classes6.dex */
public final class GMG implements Runnable {
    public final /* synthetic */ ProfileFollowRelationshipFragment A00;

    public GMG(ProfileFollowRelationshipFragment profileFollowRelationshipFragment) {
        this.A00 = profileFollowRelationshipFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GIQ giq = this.A00.A00;
        if (giq == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        InterfaceC1570073e interfaceC1570073e = giq.A06;
        if (interfaceC1570073e != null) {
            interfaceC1570073e.DmJ(giq.A05.getId());
        }
    }
}
