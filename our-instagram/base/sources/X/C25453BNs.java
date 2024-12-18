package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;

/* renamed from: X.BNs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25453BNs extends AbstractC51572Yf {
    public final float A00;
    public final long A01;
    public final long A02;
    public final Animator A03;
    public final C37669Gi2 A04;
    public final C51762Yz A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final EnumC85043qs A08;
    public final AbstractC25398BLp A09;
    public final InterfaceC31061Dl3 A0A;
    public final boolean A0B;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C37669Gi2 c37669Gi2 = this.A04;
        if (C37669Gi2.A00(c37669Gi2, 4)) {
            InterfaceC31061Dl3 interfaceC31061Dl3 = this.A0A;
            UserSession userSession = this.A07;
            InterfaceC11380iw interfaceC11380iw = this.A06;
            long j = this.A01;
            long j2 = this.A02;
            float f = this.A00;
            boolean z = this.A0B;
            return new C25456BNv(this.A03, c37669Gi2, this.A05, interfaceC11380iw, userSession, this.A08, this.A09, interfaceC31061Dl3, f, j, j2, z);
        }
        throw B4Z.A00();
    }

    public C25453BNs(Animator animator, C37669Gi2 c37669Gi2, C51762Yz c51762Yz, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC85043qs enumC85043qs, AbstractC25398BLp abstractC25398BLp, InterfaceC31061Dl3 interfaceC31061Dl3, float f, long j, long j2, boolean z) {
        AbstractC25234BEr.A1P(interfaceC31061Dl3, c37669Gi2, interfaceC11380iw);
        C14360o3.A0B(enumC85043qs, 9);
        this.A0A = interfaceC31061Dl3;
        this.A04 = c37669Gi2;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A0B = z;
        this.A08 = enumC85043qs;
        this.A03 = animator;
        this.A05 = c51762Yz;
        this.A09 = abstractC25398BLp;
    }
}
