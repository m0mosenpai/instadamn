package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public abstract class F7G {
    public static final C32353ENa A00(Bundle bundle) {
        C32353ENa c32353ENa = new C32353ENa();
        if (!bundle.containsKey("ExplorePeopleFragment.ARGUMENT_TYPE")) {
            bundle.putString("ExplorePeopleFragment.ARGUMENT_TYPE", "discover_people");
        }
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", bundle.getString("IgSessionManager.SESSION_TOKEN_KEY"));
        c32353ENa.setArguments(bundle);
        return c32353ENa;
    }
}
