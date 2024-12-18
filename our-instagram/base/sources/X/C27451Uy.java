package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.1Uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27451Uy {
    public final long A00;
    public final C1V7 A01;
    public final C1V7 A02;
    public final C1V7 A03;
    public final C1V7 A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public C27451Uy(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = AbstractC09440dt.A01(new C9EM(this, 5));
        this.A07 = AbstractC09440dt.A01(new C9EM(this, 6));
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36320773192098700L);
        this.A0N = A06;
        boolean z = true;
        if (!A06 && !(!((java.util.Set) this.A06.getValue()).isEmpty()) && !(!((Map) this.A07.getValue()).isEmpty())) {
            z = false;
        }
        this.A0J = z;
        this.A0I = C18U.A06(c06090Tz, userSession, 2342163782404547452L);
        this.A0K = C18U.A06(c06090Tz, userSession, 36320773190919037L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36320773190787963L);
        this.A0C = C18U.A06(c06090Tz, userSession, 36320773191967626L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36320773192164237L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36320773191312258L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36320773191574406L);
        this.A04 = new C1V7() { // from class: X.1V6
            @Override // X.C1V7
            public final /* bridge */ /* synthetic */ Object get() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C27451Uy.this.A05, 36320773191377795L));
            }
        };
        this.A03 = new C1V7() { // from class: X.1VA
            @Override // X.C1V7
            public final /* bridge */ /* synthetic */ Object get() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C27451Uy.this.A05, 2342163782405137284L));
            }
        };
        this.A02 = new C1V7() { // from class: X.1VB
            @Override // X.C1V7
            public final /* bridge */ /* synthetic */ Object get() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C27451Uy.this.A05, 2342163782405399432L));
            }
        };
        this.A01 = new C1V7() { // from class: X.1VD
            @Override // X.C1V7
            public final /* bridge */ /* synthetic */ Object get() {
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, C27451Uy.this.A05, 36320773191771017L));
            }
        };
        this.A0L = C18U.A06(c06090Tz, userSession, 36320773191508869L);
        this.A0H = C18U.A06(c06090Tz, userSession, 36320773191639943L);
        this.A00 = C18U.A01(c06090Tz, userSession, 36602248168542844L);
        this.A0M = C18U.A06(c06090Tz, userSession, 36320773192033163L);
        this.A0D = C18U.A06(c06090Tz, userSession, 2342163782405923726L);
        this.A0F = C18U.A06(c06090Tz, userSession, 2342163782405989263L);
        this.A0E = C18U.A06(c06090Tz, userSession, 2342163782406054800L);
        this.A0G = C18U.A06(c06090Tz, userSession, 36327314425919988L);
    }

    public final boolean A00(String str, boolean z) {
        if (!this.A0N && !AbstractC001800i.A0u((Iterable) this.A06.getValue(), str) && !C14360o3.A0K(((Map) this.A07.getValue()).get(str), Boolean.valueOf(z))) {
            return false;
        }
        return true;
    }
}
