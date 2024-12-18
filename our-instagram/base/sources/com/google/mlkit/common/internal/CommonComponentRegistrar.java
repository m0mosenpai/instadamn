package com.google.mlkit.common.internal;

import X.AbstractC58322PtE;
import X.C62507SEj;
import X.C62508SEk;
import X.C62884SVo;
import X.C62995SaJ;
import X.C63164SeO;
import X.C63180Sef;
import X.C63194Sew;
import X.C64317T9a;
import X.C64318T9b;
import X.C64319T9c;
import X.C64320T9d;
import X.C64321T9e;
import X.C64322T9f;
import X.RN0;
import X.RN4;
import X.RN5;
import X.RNA;
import X.SC7;
import X.SC8;
import X.SC9;
import X.SCA;
import X.SXq;
import X.T9Y;
import X.T9Z;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* loaded from: classes10.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C63180Sef c63180Sef = SXq.A01;
        C63194Sew A00 = C63194Sew.A00(C62884SVo.class);
        C62995SaJ.A00(A00, C63164SeO.class, 1);
        C63180Sef A01 = C63194Sew.A01(A00, T9Y.A00);
        C63180Sef A012 = C63194Sew.A01(C63194Sew.A00(RN0.class), T9Z.A00);
        C63194Sew A002 = C63194Sew.A00(SC8.class);
        C62995SaJ.A00(A002, SC7.class, 2);
        C63180Sef A013 = C63194Sew.A01(A002, C64317T9a.A00);
        C63194Sew A003 = C63194Sew.A00(SCA.class);
        A003.A03(new C62995SaJ(RN0.class, 1, 1));
        C63180Sef A014 = C63194Sew.A01(A003, C64318T9b.A00);
        C63180Sef A015 = C63194Sew.A01(C63194Sew.A00(C62508SEk.class), C64319T9c.A00);
        C63194Sew A004 = C63194Sew.A00(SC9.class);
        C62995SaJ.A00(A004, C62508SEk.class, 1);
        C63180Sef A016 = C63194Sew.A01(A004, C64320T9d.A00);
        C63194Sew A005 = C63194Sew.A00(C62507SEj.class);
        C62995SaJ.A00(A005, C63164SeO.class, 1);
        C63180Sef A017 = C63194Sew.A01(A005, C64321T9e.A00);
        C63194Sew A006 = C63194Sew.A00(SC7.class);
        A006.A01 = 1;
        A006.A03(new C62995SaJ(C62507SEj.class, 1, 1));
        C63180Sef A018 = C63194Sew.A01(A006, C64322T9f.A00);
        RNA rna = RN5.A00;
        Object[] objArr = {c63180Sef, A01, A012, A013, A014, A015, A016, A017, A018};
        int i = 0;
        while (objArr[i] != null) {
            i++;
            if (i >= 9) {
                return new RN4(objArr, 9);
            }
        }
        throw AbstractC58322PtE.A0k(i);
    }
}
