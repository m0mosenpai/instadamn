package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47382Fl {
    public final C18920wW A00;
    public final C25671My A01;
    public final UserSession A02;
    public final C13920nI A03;
    public final C23031Ai A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    public static C47382Fl A00(final UserSession userSession) {
        return (C47382Fl) userSession.A01(C47382Fl.class, new InterfaceC16820sZ() { // from class: X.2Fm
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47382Fl(UserSession.this);
            }
        });
    }

    public final Integer A01() {
        Boolean bool;
        InterfaceC19630xq interfaceC19630xq = this.A04.A01;
        if (!interfaceC19630xq.contains("has_interop_enable") || (bool = Boolean.valueOf(interfaceC19630xq.getBoolean("has_interop_enable", true))) == null) {
            if (((Boolean) this.A05.getValue()).booleanValue()) {
                bool = true;
            } else {
                return C05F.A0N;
            }
        }
        boolean booleanValue = bool.booleanValue();
        if (!((Boolean) this.A0A.getValue()).booleanValue() && (!((Boolean) this.A09.getValue()).booleanValue() || !((Boolean) this.A07.getValue()).booleanValue())) {
            if (!booleanValue) {
                return C05F.A00;
            }
        } else if (!booleanValue) {
            return C05F.A01;
        }
        return C05F.A0C;
    }

    public C47382Fl(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C13920nI c13920nI = C13920nI.A00;
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("direct_interop_upgrade"), userSession);
        this.A02 = userSession;
        this.A04 = A00;
        this.A03 = c13920nI;
        this.A01 = A002;
        this.A00 = A01;
        this.A05 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Fn
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C47382Fl.this.A02, 36311577665733243L));
            }
        });
        this.A0A = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Fo
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C47382Fl.this.A02, 36311255543185885L));
            }
        });
        this.A09 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Fp
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C47382Fl.this.A02, 36310473859203185L));
            }
        });
        this.A07 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Fq
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C47382Fl.this.A02, 36311414456975885L));
            }
        });
        this.A08 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Fr
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Long.valueOf(C18U.A01(C06090Tz.A05, C47382Fl.this.A02, 36591948835848262L));
            }
        });
        this.A06 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.2Fs
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C47382Fl.this.A02, 36310473859268722L));
            }
        });
    }
}
