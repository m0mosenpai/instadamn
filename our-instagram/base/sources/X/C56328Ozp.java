package X;

import android.graphics.PointF;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.publishscreen.fragment.feed.FollowersShareFragment;
import com.instagram.model.people.PeopleTag;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ozp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56328Ozp implements InterfaceC58041PoR {
    public final /* synthetic */ FollowersShareFragment A00;

    @Override // X.InterfaceC58041PoR
    public final void DxU(User user, boolean z) {
        C47Z A00;
        C47Z BcC;
        FollowersShareFragment followersShareFragment = this.A00;
        if (MSX.A1V(followersShareFragment)) {
            List CpK = FollowersShareFragment.A00(followersShareFragment).CpK();
            A00 = FollowersShareFragment.A01(followersShareFragment).A03.BcC(((MediaSession) CpK.get(0)).BcD());
        } else {
            A00 = AbstractC55082Oac.A00(followersShareFragment);
        }
        if (A00 != null) {
            ArrayList arrayList = A00.A40;
            PeopleTag peopleTag = new PeopleTag(new PointF(), user);
            peopleTag.A09(user);
            if (z) {
                arrayList.add(0, peopleTag);
            } else {
                arrayList.add(peopleTag);
            }
            A00.A40 = arrayList;
            if (z) {
                C47Z A002 = AbstractC55082Oac.A00(followersShareFragment);
                UserSession A0r = AbstractC166987dD.A0r(followersShareFragment.A0e);
                NJK njk = followersShareFragment.A0G;
                if (njk == null) {
                    MSW.A1K();
                    throw C00O.createAndThrow();
                }
                boolean A0F = AbstractC55229Oez.A0F(njk.A0F, A0r, false);
                Collection collection = A002.A4L;
                if (collection == null) {
                    collection = AbstractC166987dD.A1E();
                }
                ArrayList A1F = AbstractC166987dD.A1F(collection);
                A1F.add(0, user.getId());
                String id = peopleTag.getId();
                C14360o3.A07(id);
                if (MSX.A1V(followersShareFragment)) {
                    Iterator A0n = MSX.A0n(FollowersShareFragment.A00(followersShareFragment));
                    while (A0n.hasNext()) {
                        String BcD = MSW.A0R(A0n).BcD();
                        if (BcD != null && (BcC = FollowersShareFragment.A01(followersShareFragment).A03.BcC(BcD)) != null) {
                            if (A0F) {
                                BcC.A4L = A1F;
                            } else {
                                BcC.A2d = id;
                            }
                        }
                    }
                }
                if (A0F) {
                    A002.A4L = A1F;
                } else {
                    A002.A2d = id;
                }
            }
            FollowersShareFragment.A01(followersShareFragment).A03.AIe();
        }
    }

    public C56328Ozp(FollowersShareFragment followersShareFragment) {
        this.A00 = followersShareFragment;
    }

    @Override // X.InterfaceC58041PoR
    public final void DwE(User user, boolean z) {
        C47Z BcC;
        ArrayList arrayList;
        boolean z2;
        FollowersShareFragment followersShareFragment = this.A00;
        CallerContext callerContext = FollowersShareFragment.A0z;
        PeopleTag peopleTag = new PeopleTag(new PointF(), user);
        Iterator A0n = MSX.A0n(FollowersShareFragment.A00(followersShareFragment));
        while (A0n.hasNext()) {
            String BcD = MSW.A0R(A0n).BcD();
            if (BcD != null && (BcC = FollowersShareFragment.A01(followersShareFragment).A03.BcC(BcD)) != null) {
                ArrayList arrayList2 = BcC.A40;
                List list = BcC.A4L;
                if (list != null) {
                    arrayList = AbstractC166987dD.A1F(list);
                } else {
                    arrayList = null;
                }
                String str = BcC.A2d;
                boolean A1A = AnonymousClass016.A1A(arrayList2, new C57744PjX(peopleTag, 49));
                if (arrayList != null) {
                    z2 = arrayList.remove(peopleTag.getId());
                } else {
                    z2 = false;
                }
                if (A1A || z2) {
                    C14360o3.A0B(arrayList2, 0);
                    BcC.A40 = arrayList2;
                    if (z2) {
                        BcC.A4L = arrayList;
                        if (FollowersShareFragment.A01(followersShareFragment).A05()) {
                            AbstractC55082Oac.A00(followersShareFragment).A4L = arrayList;
                        }
                    }
                }
                if (AbstractC31174DnI.A1Y(user, str)) {
                    BcC.A2d = null;
                    if (FollowersShareFragment.A01(followersShareFragment).A05()) {
                        AbstractC55082Oac.A00(followersShareFragment).A2d = null;
                    }
                }
            }
        }
        FollowersShareFragment.A01(followersShareFragment).A03.AIe();
    }
}
