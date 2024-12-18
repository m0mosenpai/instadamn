package com.instagram.rtc.stateprovider;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25230BEn;
import X.AbstractC54897OPs;
import X.C0eB;
import X.C16930sl;
import X.C17060sy;
import X.C51677Ms8;
import X.C51731MtC;
import X.C51875MwJ;
import X.C57706Piv;
import X.EnumC53143New;
import X.InterfaceC16610sE;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.O4Y;
import X.O5L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.stateprovider.RtcCallOutgoingStateProvider$outgoingModel$1", f = "RtcCallOutgoingStateProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class RtcCallOutgoingStateProvider$outgoingModel$1 extends AbstractC23611Dp implements InterfaceC16610sE {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ O5L A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtcCallOutgoingStateProvider$outgoingModel$1(O5L o5l, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(3, interfaceC23621Ds);
        this.A04 = z;
        this.A05 = z2;
        this.A03 = interfaceC16820sZ;
        this.A02 = o5l;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z = this.A04;
        boolean z2 = this.A05;
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        RtcCallOutgoingStateProvider$outgoingModel$1 rtcCallOutgoingStateProvider$outgoingModel$1 = new RtcCallOutgoingStateProvider$outgoingModel$1(this.A02, (InterfaceC23621Ds) obj3, interfaceC16820sZ, z, z2);
        rtcCallOutgoingStateProvider$outgoingModel$1.A00 = obj;
        rtcCallOutgoingStateProvider$outgoingModel$1.A01 = obj2;
        return rtcCallOutgoingStateProvider$outgoingModel$1.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        EnumC53143New enumC53143New = (EnumC53143New) this.A00;
        O4Y o4y = (O4Y) this.A01;
        EnumC53143New enumC53143New2 = EnumC53143New.A03;
        if (enumC53143New == enumC53143New2) {
            return new C51875MwJ(enumC53143New2, "", C16930sl.A00, false, false, this.A04, this.A05);
        }
        C51677Ms8 c51677Ms8 = (C51677Ms8) this.A03.invoke();
        if (c51677Ms8 != null) {
            return new C51875MwJ(enumC53143New, c51677Ms8.A03, c51677Ms8.A06, AbstractC25230BEn.A1S(c51677Ms8.A07.size(), 1), c51677Ms8.A08, this.A04, this.A05);
        }
        Map map = o4y.A00;
        O5L o5l = this.A02;
        Collection values = map.values();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : values) {
            AbstractC25228BEl.A1Q(obj2, A1E, AbstractC54897OPs.A01((C51731MtC) obj2, C17060sy.A01.A01(o5l.A00)) ? 1 : 0);
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            A0q.add(((C51731MtC) it.next()).A03);
        }
        Collection values2 = map.values();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj3 : values2) {
            AbstractC25228BEl.A1Q(obj3, A1E2, AbstractC54897OPs.A01((C51731MtC) obj3, C17060sy.A01.A01(o5l.A00)) ? 1 : 0);
        }
        return new C51875MwJ(enumC53143New, AbstractC25226BEj.A1H(", ", A1E2, C57706Piv.A00), A0q, AbstractC25230BEn.A1S(map.size(), 2), false, false, false);
    }
}
