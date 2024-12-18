package com.facebook.quickpromotion.sdk.controllers;

import X.AnonymousClass497;
import X.AnonymousClass499;
import X.C14360o3;
import X.C1LC;
import X.C49C;
import X.C49D;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

/* loaded from: classes2.dex */
public final class QPSdkSurfaceControllerManager {
    public final ImmutableMap A00;

    public QPSdkSurfaceControllerManager(AnonymousClass497 anonymousClass497, ImmutableSet immutableSet, AnonymousClass499 anonymousClass499, String str) {
        C14360o3.A0B(anonymousClass497, 3);
        C14360o3.A0B(anonymousClass499, 4);
        C49C c49c = C49C.A00;
        C49D c49d = C49D.A00;
        C14360o3.A0B(c49c, 5);
        C14360o3.A0B(c49d, 6);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        C1LC it = immutableSet.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C14360o3.A0A(str2);
            builder.put(str2, new QPSdkOnDemandSurfaceController(anonymousClass497, anonymousClass499, str, str2, c49c, c49d));
        }
        this.A00 = builder.buildOrThrow();
    }
}
