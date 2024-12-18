package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GOn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36918GOn implements Runnable {
    public final /* synthetic */ C38288GsX A00;
    public final /* synthetic */ SavedCollection A01;

    public RunnableC36918GOn(C38288GsX c38288GsX, SavedCollection savedCollection) {
        this.A00 = c38288GsX;
        this.A01 = savedCollection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C38288GsX c38288GsX = this.A00;
        if (c38288GsX.isResumed()) {
            SavedCollection savedCollection = c38288GsX.A0C;
            String str = "collection";
            if (savedCollection != null) {
                if (C14360o3.A0K(savedCollection.A0F, "my_favs")) {
                    UserSession userSession = c38288GsX.A03;
                    if (userSession != null) {
                        User A0Y = AbstractC166997dE.A0Y(userSession);
                        A0Y.A03.EVN(true);
                        UserSession userSession2 = c38288GsX.A03;
                        if (userSession2 != null) {
                            AbstractC31172DnG.A1R(userSession2, A0Y);
                            UserSession userSession3 = c38288GsX.A03;
                            if (userSession3 != null) {
                                FBA.A00(userSession3).A05("my_favs");
                                C25671My c25671My = c38288GsX.A02;
                                if (c25671My != null) {
                                    SavedCollection savedCollection2 = this.A01;
                                    C36117Fwr.A00(c25671My, savedCollection2, C05F.A00);
                                    UserSession userSession4 = c38288GsX.A03;
                                    if (userSession4 != null) {
                                        AbstractC35087Fcy.A00(c38288GsX, userSession4, savedCollection2);
                                        C39410Hau c39410Hau = c38288GsX.A05;
                                        if (c39410Hau == null) {
                                            str = "selectStateProvider";
                                        } else {
                                            ArrayList A1F = AbstractC166987dD.A1F(c39410Hau.A02.keySet());
                                            UserSession userSession5 = c38288GsX.A03;
                                            if (userSession5 != null) {
                                                AbstractC35087Fcy.A02(userSession5, c38288GsX, savedCollection2, A1F);
                                            }
                                        }
                                    }
                                }
                                C14360o3.A0F("igEventBus");
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                SavedCollection savedCollection3 = c38288GsX.A0C;
                if (savedCollection3 != null) {
                    SavedCollection savedCollection4 = this.A01;
                    savedCollection3.A0F = savedCollection4.A0F;
                    savedCollection3.A0G = savedCollection4.A0G;
                    savedCollection3.A0H = savedCollection4.A0H;
                    savedCollection3.A04 = savedCollection4.A04;
                    UserSession userSession6 = c38288GsX.A03;
                    if (userSession6 != null) {
                        C55782hJ A00 = C55772hI.A00(userSession6);
                        AbstractC10360h2 abstractC10360h2 = c38288GsX.mFragmentManager;
                        abstractC10360h2.getClass();
                        A00.A0C(c38288GsX, null, abstractC10360h2.A0L());
                        AbstractC25227BEk.A1B(c38288GsX);
                        List Bse = c38288GsX.Bse();
                        C25671My c25671My2 = c38288GsX.A02;
                        if (c25671My2 != null) {
                            AbstractC35086Fcx.A00(c25671My2, savedCollection4, Bse);
                            return;
                        }
                        C14360o3.A0F("igEventBus");
                        throw C00O.createAndThrow();
                    }
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
