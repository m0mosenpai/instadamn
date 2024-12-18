package com.google.mlkit.vision.common.internal;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC61524Roz;
import X.C62995SaJ;
import X.C63180Sef;
import X.C63194Sew;
import X.C64324T9h;
import X.RND;
import X.RNK;
import X.RNL;
import X.SCB;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes10.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C63194Sew A00 = C63194Sew.A00(SCB.class);
        C62995SaJ.A00(A00, AbstractC61524Roz.class, 2);
        C63180Sef A01 = C63194Sew.A01(A00, C64324T9h.A00);
        RND rnd = RNL.A00;
        Object[] objArr = {A01};
        if (objArr[0] != null) {
            return new RNK(objArr, 1);
        }
        throw AbstractC166987dD.A15(AbstractC58320PtC.A12("at index ", AbstractC58318PtA.A0q(20), 0));
    }
}
