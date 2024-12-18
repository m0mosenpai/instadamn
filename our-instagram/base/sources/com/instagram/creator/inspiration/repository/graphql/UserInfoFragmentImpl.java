package com.instagram.creator.inspiration.repository.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.AbstractC58322PtE;
import X.C2JS;
import X.C2JT;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class UserInfoFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class FriendshipStatus extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C95124Py.A00, "following");
        }

        public FriendshipStatus() {
            super(809774099);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0H = AbstractC58319PtB.A0H(c94754Oe);
        C4OW A0E = AbstractC58319PtB.A0E(c94754Oe);
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC166987dD.A0k(new C4OM[]{A0H, A0E, AbstractC58321PtD.A0T(c95124Py), AbstractC58319PtB.A0P(c95124Py), AbstractC58319PtB.A0K(c94754Oe), AbstractC58322PtE.A0S(c94754Oe), AbstractC58319PtB.A0Q(c94754Oe), AbstractC58318PtA.A0P(c94754Oe), AbstractC58321PtD.A0V(c94754Oe), AbstractC166987dD.A0i(C94894Ou.A00, "mutual_followers_count"), AbstractC58319PtB.A0O(c95124Py), AbstractC58322PtE.A0M(FriendshipStatus.class, 809774099), AbstractC58322PtE.A0Q()});
    }

    public UserInfoFragmentImpl() {
        super(1766112135);
    }
}
