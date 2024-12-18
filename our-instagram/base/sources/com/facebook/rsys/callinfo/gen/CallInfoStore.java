package com.facebook.rsys.callinfo.gen;

import X.C00O;
import java.util.ArrayList;

/* loaded from: classes12.dex */
public abstract class CallInfoStore {
    public abstract void readCallInfo(String str, boolean z, CallInfoReadCallback callInfoReadCallback);

    public abstract void readUserProfiles(ArrayList arrayList, String str, UserProfilesReadCallback userProfilesReadCallback);

    public abstract void registerObserver(CallInfoObserver callInfoObserver);

    public abstract void unregisterObserver(CallInfoObserver callInfoObserver);

    public CallInfoStore() {
        throw C00O.createAndThrow();
    }
}
