package X;

import android.content.Context;
import com.instagram.api.schemas.ACRType;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P2y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56411P2y implements InterfaceC199918sv {
    public final /* synthetic */ C22P A00;
    public final /* synthetic */ ACRType A01;
    public final /* synthetic */ C8QJ A02;
    public final /* synthetic */ C41181vS A03;
    public final /* synthetic */ C145176gc A04;

    public C56411P2y(C22P c22p, ACRType aCRType, C8QJ c8qj, C41181vS c41181vS, C145176gc c145176gc) {
        this.A04 = c145176gc;
        this.A03 = c41181vS;
        this.A02 = c8qj;
        this.A00 = c22p;
        this.A01 = aCRType;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        Context context;
        C145176gc c145176gc = this.A04;
        C41181vS c41181vS = this.A03;
        C8QJ c8qj = this.A02;
        int i = 3;
        if (c41181vS.A1K()) {
            i = 108;
        }
        C22P c22p = this.A00;
        ACRType aCRType = this.A01;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) c145176gc.A1B.get();
        if (abstractC59962oe != null && (context = abstractC59962oe.getContext()) != null) {
            UserSession userSession = c145176gc.A09;
            if (userSession != null) {
                C8JY A00 = C8JX.A00(userSession);
                C14360o3.A0B(c22p, 0);
                C1QT c1qt = A00.A02;
                long flowStartForMarker = c1qt.flowStartForMarker(246623994, "auto_created_flow", false);
                A00.A00 = flowStartForMarker;
                c1qt.flowAnnotate(flowStartForMarker, "camera_entry_point", c22p.A00);
                c8qj.dismiss();
                InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
                interfaceC1118853a.EJE("story_feed_creation_loading");
                UserSession userSession2 = c145176gc.A09;
                if (userSession2 != null) {
                    Reel A0M = ReelStore.A03(userSession2).A0M(c41181vS.A0k);
                    if (A0M != null) {
                        UserSession userSession3 = c145176gc.A09;
                        if (userSession3 != null) {
                            List A0O = A0M.A0O(userSession3);
                            if (A0O != null) {
                                ArrayList A1E = AbstractC166987dD.A1E();
                                Iterator it = A0O.iterator();
                                while (it.hasNext()) {
                                    C38321qM c38321qM = ((C41181vS) it.next()).A0b;
                                    if (c38321qM != null) {
                                        A1E.add(c38321qM);
                                    }
                                }
                                List A0a = AbstractC001800i.A0a(A1E);
                                ArrayList A1E2 = AbstractC166987dD.A1E();
                                for (Object obj : A0a) {
                                    if (((C38321qM) obj).A1x() == EnumC76383bi.A06) {
                                        A1E2.add(obj);
                                    }
                                }
                                List A0d = AbstractC001800i.A0d(A1E2, 10);
                                if (A0d != null) {
                                    AbstractC35084Fcv.A02(context, new P97(context, c22p, aCRType, abstractC59962oe, A00, c41181vS, c145176gc, A0d, i), A0d);
                                    return;
                                }
                            }
                        }
                    }
                    C9GR.A0B(context, "NavigateToFeedCreationWithReelItem_NullMediaList");
                    A00.A01("NavigateToFeedCreationWithReelItem_NullMediaList");
                    ReelViewerFragment.A0I((ReelViewerFragment) interfaceC1118853a, false);
                    return;
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
    }
}
