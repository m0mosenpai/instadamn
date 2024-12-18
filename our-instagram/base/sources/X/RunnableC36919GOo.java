package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GOo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36919GOo implements Runnable {
    public final /* synthetic */ C38288GsX A00;
    public final /* synthetic */ SavedCollection A01;

    public RunnableC36919GOo(C38288GsX c38288GsX, SavedCollection savedCollection) {
        this.A00 = c38288GsX;
        this.A01 = savedCollection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C38288GsX c38288GsX = this.A00;
        if (c38288GsX.isResumed()) {
            SavedCollection savedCollection = c38288GsX.A0C;
            if (savedCollection == null) {
                str = "collection";
            } else {
                SavedCollection savedCollection2 = this.A01;
                savedCollection.A0F = savedCollection2.A0F;
                savedCollection.A0G = savedCollection2.A0G;
                savedCollection.A0H = savedCollection2.A0H;
                savedCollection.A04 = savedCollection2.A04;
                UserSession userSession = c38288GsX.A03;
                str = "userSession";
                if (userSession != null) {
                    C55772hI.A00(userSession).A0C(c38288GsX, null, c38288GsX.getParentFragmentManager().A0L());
                    if (AbstractC167007dF.A1Z(c38288GsX.A0U)) {
                        C36117Fwr.A00(AbstractC25651Mw.A00(c38288GsX.getSession()), savedCollection2, C05F.A00);
                        UserSession userSession2 = c38288GsX.A03;
                        if (userSession2 != null) {
                            AbstractC35087Fcy.A00(c38288GsX, userSession2, savedCollection2);
                        }
                    }
                    AbstractC25227BEk.A1B(c38288GsX);
                    List Bse = c38288GsX.Bse();
                    C25671My c25671My = c38288GsX.A02;
                    if (c25671My == null) {
                        str = "igEventBus";
                    } else {
                        AbstractC35086Fcx.A00(c25671My, savedCollection2, Bse);
                        C39410Hau c39410Hau = c38288GsX.A05;
                        if (c39410Hau == null) {
                            str = "selectStateProvider";
                        } else {
                            ArrayList A1F = AbstractC166987dD.A1F(c39410Hau.A02.keySet());
                            UserSession userSession3 = c38288GsX.A03;
                            if (userSession3 != null) {
                                AbstractC35087Fcy.A02(userSession3, c38288GsX, savedCollection2, A1F);
                                return;
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
