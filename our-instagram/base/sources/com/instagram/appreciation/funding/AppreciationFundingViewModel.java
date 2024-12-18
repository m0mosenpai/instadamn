package com.instagram.appreciation.funding;

import X.AbstractC07080Za;
import X.AbstractC141776au;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC25229BEm;
import X.AbstractC37302Gc3;
import X.AbstractC52922bZ;
import X.BHS;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C24721Ip;
import X.C27V;
import X.C32070E6w;
import X.C45063Jws;
import X.C47834LAw;
import X.C47835LAx;
import X.C5QE;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import X.K94;
import X.LHp;
import X.LJB;
import X.Ld1;
import X.MCD;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class AppreciationFundingViewModel extends AbstractC52922bZ {
    public boolean A00;
    public final int A01;
    public final Application A02;
    public final LJB A03;
    public final Ld1 A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C0UO A08;
    public final C47834LAw A09;
    public final C27V A0A;
    public final C47835LAx A0B;
    public final LHp A0C;
    public final String A0D;

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.appreciation.funding.AppreciationFundingViewModel r22, X.AbstractC46370Kfs r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationFundingViewModel.A00(com.instagram.appreciation.funding.AppreciationFundingViewModel, X.Kfs, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.appreciation.funding.AppreciationFundingViewModel r16, X.AbstractC46370Kfs r17, X.InterfaceC23621Ds r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationFundingViewModel.A01(com.instagram.appreciation.funding.AppreciationFundingViewModel, X.Kfs, X.1Ds):java.lang.Object");
    }

    public AppreciationFundingViewModel(Application application, LJB ljb, C47834LAw c47834LAw, C27V c27v, C47835LAx c47835LAx, Ld1 ld1, LHp lHp, String str, int i) {
        AbstractC37302Gc3.A1U(str, ld1);
        AbstractC167007dF.A1J(c27v, 7, lHp);
        this.A02 = application;
        this.A01 = i;
        this.A0D = str;
        this.A04 = ld1;
        this.A0B = c47835LAx;
        this.A03 = ljb;
        this.A0A = c27v;
        this.A09 = c47834LAw;
        this.A0C = lHp;
        C008002u A00 = C10E.A00(K94.A00);
        this.A07 = A00;
        this.A08 = AbstractC208910l.A02(A00);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A05 = A12;
        this.A06 = AbstractC07080Za.A03(A12);
        MCD.A02(this, AbstractC141776au.A00(this), 37);
    }

    private final List A02(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C45063Jws c45063Jws = (C45063Jws) it.next();
            C14360o3.A0B(c45063Jws, 0);
            String str = c45063Jws.A07;
            String str2 = c45063Jws.A06;
            String valueOf = String.valueOf(c45063Jws.A01);
            String str3 = c45063Jws.A05;
            A0q.add(new C32070E6w((C5QE) BHS.A00(new Object[]{c45063Jws.A08, str3}, 2131953038), str, str2, valueOf, str3, c45063Jws.A02, false));
        }
        return A0q;
    }
}
