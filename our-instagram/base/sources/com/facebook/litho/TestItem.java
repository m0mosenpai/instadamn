package com.facebook.litho;

import X.AbstractC166987dD;
import X.AbstractC25226BEj;
import X.AnonymousClass016;
import X.C5M7;
import X.C79793hU;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class TestItem {
    public ComponentHost A00;
    public Object A01;
    public String A02;
    public final Rect A03 = new Rect();
    public final AcquireKey A04 = new Object();

    /* loaded from: classes5.dex */
    public final class AcquireKey {
    }

    public final String getTextContent() {
        List singletonList;
        List A1J = AbstractC166987dD.A1J(this.A01);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A1J) {
            if (obj instanceof TextContent) {
                A1E.add(obj);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            C5M7 A01 = C79793hU.A01((C79793hU) ((TextContent) it.next()));
            if (A01 == null) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(A01.A06);
            }
            AnonymousClass016.A16(singletonList, A1E2);
        }
        return AbstractC25226BEj.A1H(", ", A1E2, null);
    }

    public final AcquireKey getAcquireKey() {
        return this.A04;
    }

    public final Rect getBounds() {
        return this.A03;
    }

    public final ComponentHost getHost() {
        return this.A00;
    }

    public final String getTestKey() {
        return this.A02;
    }
}
