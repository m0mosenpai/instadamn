package com.google.android.play.core.splitinstall;

import X.AbstractC25230BEn;
import X.AbstractC62642SJz;
import X.C0f9;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzbe extends zzbh {
    @Override // com.google.android.play.core.splitinstall.zzbh, com.google.android.play.core.splitinstall.internal.zzbq
    public final void FGg(List list) {
        int A03 = C0f9.A03(2119863800);
        super.FGg(list);
        ArrayList A0q = AbstractC25230BEn.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC62642SJz.A00((Bundle) it.next()));
        }
        this.A00.A00.A0G(A0q);
        C0f9.A0A(357027513, A03);
    }
}
