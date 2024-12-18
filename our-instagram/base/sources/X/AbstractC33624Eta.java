package X;

import java.util.ArrayList;
import java.util.List;
import libraries.fxcallauncher.model.FxUnifiedLauncherAddedAccount;

/* renamed from: X.Eta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33624Eta {
    public String A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;

    public final List A00() {
        List list = this.A03;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                if (C14360o3.A0K(((FxUnifiedLauncherAddedAccount) obj).A00, "FACEBOOK")) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        C14360o3.A0F("addedAccounts");
        throw C00O.createAndThrow();
    }
}
