package com.facebook.tigon.observers;

import X.AbstractC166987dD;
import X.C14360o3;
import X.Y4b;
import com.facebook.ultralight.UL;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public final class FBTigonXplatObserversHolder extends TigonXplatObserversHolder {
    public FBTigonXplatObserversHolder() {
        Set set = (Set) Y4b.A00(UL.id._UL__ULSEP_java_util_Set_ULLT_com_facebook_tigon_observers_TigonObserver_ULGT__ULSEP_BINDING_ID);
        C14360o3.A07(set);
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("getDisabled");
        }
    }
}
