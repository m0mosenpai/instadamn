package com.google.mlkit.vision.text.internal;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC60708RNk;
import X.AbstractC60714RNu;
import X.C60707RNj;
import X.C62510SEm;
import X.C62995SaJ;
import X.C63164SeO;
import X.C63180Sef;
import X.C63194Sew;
import X.C64325T9i;
import X.C64326T9j;
import X.RW6;
import X.SCA;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes10.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        int i = 0;
        C63194Sew A00 = C63194Sew.A00(RW6.class);
        C62995SaJ.A00(A00, C63164SeO.class, 1);
        C63180Sef A01 = C63194Sew.A01(A00, C64325T9i.A00);
        C63194Sew A002 = C63194Sew.A00(C62510SEm.class);
        C62995SaJ.A00(A002, RW6.class, 1);
        C62995SaJ.A00(A002, SCA.class, 1);
        C63180Sef A012 = C63194Sew.A01(A002, C64326T9j.A00);
        AbstractC60714RNu abstractC60714RNu = AbstractC60708RNk.A00;
        Object[] objArr = {A01, A012};
        while (objArr[i] != null) {
            i++;
            if (i >= 2) {
                return new C60707RNj(objArr, 2);
            }
        }
        throw AbstractC166987dD.A15(AbstractC58320PtC.A12("at index ", AbstractC58318PtA.A0q(20), i));
    }
}
