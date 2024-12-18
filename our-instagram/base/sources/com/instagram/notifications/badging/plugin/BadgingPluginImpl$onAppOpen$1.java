package com.instagram.notifications.badging.plugin;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC12960li;
import X.AbstractC16960so;
import X.AbstractC19730y1;
import X.AbstractC23611Dp;
import X.AbstractC84703qJ;
import X.AbstractC89993zf;
import X.C06090Tz;
import X.C09530e4;
import X.C09540e5;
import X.C0eB;
import X.C126775oH;
import X.C14360o3;
import X.C16930sl;
import X.C18720vz;
import X.C18U;
import X.C1JX;
import X.C207099Eo;
import X.C54412ev;
import X.C54432ex;
import X.C54702fS;
import X.C72053Ld;
import X.C9F9;
import X.C9FL;
import X.C9FM;
import X.CAG;
import X.EnumC126785oI;
import X.EnumC54222eY;
import X.EnumC58122lU;
import X.EnumC58162lY;
import X.GAO;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.notifications.badging.plugin.BadgingPluginImpl$onAppOpen$1", f = "BadgingPluginImpl.kt", i = {0}, l = {103}, m = "invokeSuspend", n = {"logger"}, s = {"L$1"})
/* loaded from: classes2.dex */
public final class BadgingPluginImpl$onAppOpen$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ int A0B;
    public final /* synthetic */ UserSession A0C;
    public final /* synthetic */ C54702fS A0D;
    public final /* synthetic */ InterfaceC16820sZ A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgingPluginImpl$onAppOpen$1(UserSession userSession, C54702fS c54702fS, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC23621Ds);
        this.A0D = c54702fS;
        this.A0C = userSession;
        this.A0E = interfaceC16820sZ;
        this.A0F = z;
        this.A0G = z2;
        this.A0H = z3;
        this.A0B = i;
        this.A09 = i2;
        this.A0A = i3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C54702fS c54702fS = this.A0D;
        BadgingPluginImpl$onAppOpen$1 badgingPluginImpl$onAppOpen$1 = new BadgingPluginImpl$onAppOpen$1(this.A0C, c54702fS, interfaceC23621Ds, this.A0E, this.A0B, this.A09, this.A0A, this.A0F, this.A0G, this.A0H);
        badgingPluginImpl$onAppOpen$1.A08 = obj;
        return badgingPluginImpl$onAppOpen$1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BadgingPluginImpl$onAppOpen$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        InterfaceC16820sZ interfaceC16820sZ;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        C54412ev A01;
        C18720vz c18720vz;
        EnumC58122lU enumC58122lU;
        C09530e4 c09530e4;
        C72053Ld c72053Ld;
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A03 != 0) {
                i3 = this.A02;
                i2 = this.A01;
                i = this.A00;
                z3 = this.A07;
                z2 = this.A06;
                z = this.A05;
                A01 = (C54412ev) this.A04;
                interfaceC16820sZ = (InterfaceC16820sZ) this.A08;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C54702fS c54702fS = this.A0D;
                UserSession userSession = this.A0C;
                interfaceC16820sZ = this.A0E;
                z = this.A0F;
                z2 = this.A0G;
                z3 = this.A0H;
                i = this.A0B;
                i2 = this.A09;
                i3 = this.A0A;
                A01 = c54702fS.A01();
                long A012 = C18U.A01(C06090Tz.A05, userSession, 36592137815392586L);
                this.A08 = interfaceC16820sZ;
                this.A04 = A01;
                this.A05 = z;
                this.A06 = z2;
                this.A07 = z3;
                this.A00 = i;
                this.A01 = i2;
                this.A02 = i3;
                this.A03 = 1;
                if (AbstractC89993zf.A01(this, A012) == c1jx) {
                    return c1jx;
                }
            }
            c18720vz = AbstractC12960li.A00;
        } catch (Throwable th) {
            new C09540e5(th);
        }
        if (AbstractC19730y1.A00(c18720vz).A00.getLong("notification_clicked_timestamp", 0L) + 15000 > System.currentTimeMillis()) {
            return C0eB.A00;
        }
        if (!((Boolean) interfaceC16820sZ.invoke()).booleanValue()) {
            return C0eB.A00;
        }
        if (z) {
            if (z2) {
                EnumC54222eY enumC54222eY = EnumC54222eY.A0p;
                C14360o3.A0B(EnumC58162lY.A07, 0);
                if (A01.A05) {
                    C54432ex c54432ex = CAG.A01;
                    if (c54432ex != null && (c72053Ld = CAG.A00) != null) {
                        c09530e4 = new C09530e4(c54432ex, c72053Ld);
                    } else {
                        c09530e4 = null;
                    }
                    CAG.A01 = null;
                    CAG.A00 = null;
                    if (c09530e4 != null) {
                        C54432ex c54432ex2 = (C54432ex) c09530e4.A00;
                        C72053Ld c72053Ld2 = (C72053Ld) c09530e4.A01;
                        Object obj2 = c72053Ld2.A02;
                        if (obj2 == null) {
                            obj2 = new GAO("invalid", "invalid");
                        }
                        C54432ex c54432ex3 = (C54432ex) A01.A03.get();
                        List singletonList = Collections.singletonList(A01.A02.get());
                        C14360o3.A07(singletonList);
                        Iterable iterable = c54432ex3.A04;
                        if (iterable == null) {
                            iterable = C16930sl.A00;
                        }
                        C54432ex c54432ex4 = new C54432ex(enumC54222eY, AbstractC001800i.A0S(iterable, singletonList), 0, 0);
                        C54412ev.A01(EnumC126785oI.TAP, A01, null, null, AbstractC84703qJ.A03(c54432ex2), AbstractC84703qJ.A02(c72053Ld2.A01), AbstractC84703qJ.A01(c72053Ld2.A00), new C9FM(49, c54432ex2, A01, obj2), new C9F9(29, c54432ex4, A01), C126775oH.A00, c54432ex2.A01, c54432ex4.A00);
                    }
                }
            }
        } else if (z3) {
            C54432ex c54432ex5 = new C54432ex(EnumC54222eY.A0V, AbstractC16960so.A1N(new C54432ex(EnumC54222eY.A09, null, i, i), new C54432ex(EnumC54222eY.A0I, null, i2, i2)), 0, 0);
            EnumC58162lY enumC58162lY = EnumC58162lY.A05;
            C14360o3.A0B(enumC58162lY, 0);
            if (AbstractC19730y1.A00(c18720vz).A00.getBoolean("launcher_badge_supported", false)) {
                enumC58122lU = EnumC58122lU.A05;
            } else {
                enumC58122lU = EnumC58122lU.A03;
            }
            C72053Ld c72053Ld3 = new C72053Ld(enumC58122lU, enumC58162lY, null, null);
            C54432ex c54432ex6 = (C54432ex) A01.A03.get();
            int i4 = c54432ex6.A01 + c54432ex6.A00;
            C54432ex c54432ex7 = (C54432ex) A01.A02.get();
            int i5 = c54432ex7.A01 + c54432ex7.A00;
            C54412ev.A01(EnumC126785oI.TAP, A01, null, Integer.valueOf(i3), AbstractC84703qJ.A03(c54432ex5), AbstractC84703qJ.A02(c72053Ld3.A01), AbstractC84703qJ.A01(c72053Ld3.A00), new C9FL(0, c54432ex5, c72053Ld3, A01), new C207099Eo(A01, i4, i5, 4), C126775oH.A00, c54432ex5.A00, i4 + i5);
        }
        return C0eB.A00;
    }
}
