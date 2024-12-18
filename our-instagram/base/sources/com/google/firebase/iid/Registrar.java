package com.google.firebase.iid;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.C62995SaJ;
import X.C63180Sef;
import X.C63194Sew;
import X.C63342Shx;
import X.C64437TDv;
import X.SC4;
import X.SSV;
import X.SW7;
import X.T9V;
import X.T9W;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class Registrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C63194Sew A00 = C63194Sew.A00(FirebaseInstanceId.class);
        C62995SaJ.A00(A00, C63342Shx.class, 1);
        C62995SaJ.A00(A00, C64437TDv.class, 1);
        C62995SaJ.A00(A00, SW7.class, 1);
        A00.A02 = T9W.A00;
        if (AbstractC167007dF.A1N(A00.A00)) {
            A00.A00 = 1;
            C63180Sef A02 = A00.A02();
            C63194Sew A002 = C63194Sew.A00(SC4.class);
            C62995SaJ.A00(A002, FirebaseInstanceId.class, 1);
            return Arrays.asList(A02, C63194Sew.A01(A002, T9V.A00), SSV.A01("fire-iid", "18.0.0"));
        }
        throw AbstractC166987dD.A14("Instantiation type has already been set.");
    }
}
