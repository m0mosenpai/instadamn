package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.PendingShareToFriendsStoryBadgePreviewState;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HRb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39243HRb extends C17T implements InterfaceC114865Gw {
    @Override // X.InterfaceC114865Gw
    public final PendingShareToFriendsStoryBadgePreviewState AfG() {
        return (PendingShareToFriendsStoryBadgePreviewState) A0N(-377361986, JAV.A00);
    }

    @Override // X.InterfaceC114865Gw
    public final List BRB() {
        return null;
    }

    @Override // X.InterfaceC114865Gw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40138Hr6.A00(this));
    }

    @Override // X.InterfaceC114865Gw
    public final String AvB() {
        return A0i(-1349119146);
    }

    @Override // X.InterfaceC114865Gw
    public final C114855Gv Exu(C1DY c1dy) {
        ArrayList arrayList;
        PendingShareToFriendsStoryBadgePreviewState AfG = AfG();
        String A0i = A0i(-1349119146);
        ImmutableList A08 = A08(-3719259, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0i2 = AbstractC167007dF.A0i(A08);
            Iterator<E> it = A08.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1F(c1dy, A0i2, it);
            }
            arrayList = AbstractC167007dF.A0i(A0i2);
            Iterator it2 = A0i2.iterator();
            while (it2.hasNext()) {
                AbstractC37304Gc5.A1H(c1dy, arrayList, it2);
            }
        } else {
            arrayList = null;
        }
        return new C114855Gv(AfG, A0i, arrayList);
    }
}
