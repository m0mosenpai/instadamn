package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class G5H implements C7TQ {
    public final UserSession A00;
    public final C7TP A01;
    public final G5I A02;
    public final C2DS A03;

    public G5H(UserSession userSession, C7TP c7tp, G5I g5i, C2DS c2ds) {
        C14360o3.A0B(c2ds, 1);
        this.A03 = c2ds;
        this.A01 = c7tp;
        this.A02 = g5i;
        this.A00 = userSession;
    }

    @Override // X.C7TQ
    public final C42221xC A9t(Context context, InterfaceC83733oI interfaceC83733oI, EnumC31337Dq2 enumC31337Dq2, List list, List list2, int i) {
        return this.A02.A9t(context, interfaceC83733oI, enumC31337Dq2, list, list2, i);
    }

    @Override // X.C7TQ
    public final C42221xC AGX(InterfaceC83733oI interfaceC83733oI, List list) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC AGy(C3o9 c3o9, String str) {
        C14360o3.A0B(str, 1);
        return this.A02.AGy(c3o9, str);
    }

    @Override // X.C7TQ
    public final void AGz(Context context, InterfaceC83733oI interfaceC83733oI, String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A02.AGz(context, interfaceC83733oI, str, z);
    }

    @Override // X.C7TQ
    public final C42221xC AOp(InterfaceC83733oI interfaceC83733oI, User user) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC APY(InterfaceC83733oI interfaceC83733oI) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC ARs(InterfaceC83733oI interfaceC83733oI) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC Ch5(Context context, C3o9 c3o9) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void Cmy(InterfaceC83733oI interfaceC83733oI, String str, String str2, int i) {
    }

    @Override // X.C7TQ
    public final void Cmz(InterfaceC83733oI interfaceC83733oI) {
    }

    @Override // X.C7TQ
    public final void CnG(C206259Bi c206259Bi, InterfaceC83733oI interfaceC83733oI, boolean z) {
        C81663kb B3U;
        C83693oE A02 = AbstractC1345466e.A02(interfaceC83733oI);
        MsysThreadId A03 = AbstractC1345466e.A03(interfaceC83733oI);
        if (A02 != null && (B3U = this.A03.B3U(C7P4.A00(A02))) != null && B3U.Cf8(this.A00)) {
            this.A01.CnG(c206259Bi, A02, false);
        }
        this.A02.CnH(A03);
    }

    @Override // X.C7TQ
    public final void CnH(InterfaceC83733oI interfaceC83733oI) {
        this.A02.CnH(interfaceC83733oI);
    }

    @Override // X.C7TQ
    public final void CnL(InterfaceC83733oI interfaceC83733oI, String str, boolean z) {
    }

    @Override // X.C7TQ
    public final void CnP(DirectMessageIdentifier directMessageIdentifier) {
        C14360o3.A0B(directMessageIdentifier, 0);
    }

    @Override // X.C7TQ
    public final void Co1(InterfaceC83733oI interfaceC83733oI) {
    }

    @Override // X.C7TQ
    public final void CqA(InterfaceC11380iw interfaceC11380iw, C3o9 c3o9, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC CqC(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, boolean z) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void CqJ(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void CqK(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC E6K(InterfaceC83733oI interfaceC83733oI, User user) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC EF9(InterfaceC83733oI interfaceC83733oI, List list) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC EFn(InterfaceC83733oI interfaceC83733oI, List list) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC EG6(InterfaceC83733oI interfaceC83733oI, List list) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC EGS(C3o9 c3o9) {
        return this.A02.EGS(c3o9);
    }

    @Override // X.C7TQ
    public final void EI8(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
    }

    @Override // X.C7TQ
    public final void F7t(UserSession userSession, C81613kW c81613kW, InterfaceC83733oI interfaceC83733oI, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        this.A02.F7t(userSession, c81613kW, interfaceC83733oI, i, z, z2);
    }

    @Override // X.C7TQ
    public final void F7z(InterfaceC83733oI interfaceC83733oI, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC83733oI, 0);
        this.A02.F7z(interfaceC83733oI, z, false);
    }

    @Override // X.C7TQ
    public final void F9J(InterfaceC11380iw interfaceC11380iw, C3o9 c3o9) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC F9L(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, boolean z) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final C42221xC F9Q(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void FBU(String str, String str2, String str3) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void FBV(String str, String str2, String str3) {
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void D9t(InterfaceC83713oG interfaceC83713oG) {
        this.A02.A00.A01();
    }

    @Override // X.C7TQ
    public final void F7u(UserSession userSession, InterfaceC83733oI interfaceC83733oI, Integer num, int i, int i2) {
        throw AbstractC166987dD.A14("Disappearing Mode isn't supported for msys threads.");
    }

    @Override // X.C7TQ
    public final void Cmu(C34583FLs c34583FLs) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final C42221xC ELf(C3o9 c3o9, String str, String str2, boolean z) {
        return this.A02.ELf(c3o9, str, str2, AbstractC25229BEm.A1Y(c3o9));
    }

    @Override // X.C7TQ
    public final void EpG(String str, String str2) {
        throw AbstractC31179DnN.A0V();
    }
}
