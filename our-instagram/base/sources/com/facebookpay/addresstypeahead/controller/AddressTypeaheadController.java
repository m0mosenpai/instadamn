package com.facebookpay.addresstypeahead.controller;

import X.AbstractC166987dD;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC58318PtA;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass195;
import X.AnonymousClass197;
import X.C05A;
import X.C10E;
import X.C12V;
import X.C12X;
import X.C14360o3;
import X.C17u;
import X.C19K;
import X.C19L;
import X.C2FP;
import X.C2GS;
import X.C2GT;
import X.C2JS;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.PZA;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.facebookpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class AddressTypeaheadController {
    public String A00;
    public AnonymousClass195 A01;
    public boolean A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GS A05;
    public final AddressTypeaheadRepositoryImpl A06;
    public final LoggingContext A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16660sJ A09;
    public final C19L A0A;
    public final C05A A0B;
    public final C2GS A0C;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r22, java.lang.String r23, java.lang.String r24, X.InterfaceC23621Ds r25) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.addresstypeahead.controller.AddressTypeaheadController.A00(com.facebookpay.addresstypeahead.controller.AddressTypeaheadController, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public AddressTypeaheadController(LoggingContext loggingContext, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A07 = loggingContext;
        this.A09 = interfaceC16660sJ;
        this.A08 = interfaceC16820sZ;
        C2GS A0J = AbstractC58318PtA.A0J();
        this.A0C = A0J;
        this.A04 = A0J;
        C2GS A0J2 = AbstractC58318PtA.A0J();
        this.A05 = A0J2;
        this.A03 = A0J2;
        this.A06 = C2FP.A01().A00;
        AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
        C12V c12v = C2FP.A0B().A00.A00.AOT(568, 3).get(C12X.A00);
        C14360o3.A0C(c12v, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        C19K A02 = AnonymousClass194.A02(anonymousClass197.plus(c12v));
        this.A0A = A02;
        this.A0B = C10E.A00(null);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZA(this, (InterfaceC23621Ds) null, 39), A02);
    }

    public static final ArrayList A01(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2JS A0l = AbstractC25225BEi.A0l(it);
            if (A0l.getCoercedIntField(0, "length") > 0) {
                A1E.add(new C17u(A0l.getCoercedIntField(1, "offset"), (A0l.getCoercedIntField(1, "offset") + A0l.getCoercedIntField(0, "length")) - 1));
            }
        }
        return A1E;
    }
}
