package X;

import android.os.Bundle;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;

/* renamed from: X.Ln0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49074Ln0 implements InterfaceC165117a0 {
    public final InterfaceC08830cm A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C163867Va A03;
    public final LEK A04;
    public final C7XS A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC16820sZ A07;

    public C49074Ln0(AbstractC59962oe abstractC59962oe, UserSession userSession, C163867Va c163867Va, LEK lek, C7XS c7xs, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(abstractC59962oe, 1);
        AbstractC167017dG.A1U(interfaceC08830cm, interfaceC08830cm2);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = c7xs;
        this.A07 = interfaceC16820sZ;
        this.A03 = c163867Va;
        this.A00 = interfaceC08830cm;
        this.A06 = interfaceC08830cm2;
        this.A04 = lek;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (X.AbstractC167007dF.A1Z(r9.A17) == false) goto L24;
     */
    @Override // X.InterfaceC165117a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cqv(android.graphics.RectF r44, X.InterfaceC50477MQf r45, com.instagram.model.direct.messageid.MessageIdentifier r46, java.util.List r47, java.util.List r48, boolean r49, boolean r50, boolean r51) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49074Ln0.Cqv(android.graphics.RectF, X.MQf, com.instagram.model.direct.messageid.MessageIdentifier, java.util.List, java.util.List, boolean, boolean, boolean):void");
    }

    @Override // X.InterfaceC165137a2
    public final void E2b(MessageIdentifier messageIdentifier, long j) {
        boolean z;
        C7XR c7xr;
        this.A03.CMc();
        String A00 = messageIdentifier.A00();
        C7U0 c7u0 = (C7U0) this.A00.get();
        C3DN A002 = C3DN.A00.A00(this.A01.requireActivity());
        InterfaceC163837Ux C7r = c7u0.C7r();
        InterfaceC83733oI CCa = C7r.CCa();
        if (CCa != null) {
            if ((CCa instanceof MsysThreadId) && c7u0.CZj(messageIdentifier.A01) && (CCa = C7r.BNh()) == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
            UserSession userSession = this.A02;
            String str = messageIdentifier.A01;
            Long valueOf = Long.valueOf(j);
            ArrayList A01 = C4GO.A01(C7r.BSH());
            if (A00 != null) {
                z = c7u0.CYS(A00);
            } else {
                z = false;
            }
            long longValue = valueOf.longValue();
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC35077Fco.A02(A0b, CCa, "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
            A0b.putString(AbstractC111324zv.A00(41), str);
            A0b.putLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS", longValue);
            A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT", A00);
            A0b.putParcelableArrayList("DirectFragment.ARGUMENT_RECIPIENTS", AbstractC166987dD.A1F(A01));
            A0b.putBoolean("is_instamadillo", z);
            AbstractC31173DnH.A1C(A0b, userSession);
            DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment = new DirectVisualMessageActionLogPriorityFragment();
            directVisualMessageActionLogPriorityFragment.setArguments(A0b);
            if (A002 != null) {
                C7XS c7xs = this.A05;
                C7XU c7xu = null;
                if ((c7xs instanceof C7XR) && (c7xr = (C7XR) c7xs) != null) {
                    c7xu = c7xr.A02;
                }
                A002.A0Q(c7xu);
                C14360o3.A0A(directVisualMessageActionLogPriorityFragment);
                A002.A0K(directVisualMessageActionLogPriorityFragment);
                c7xs.D0E();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC165127a1
    public final void EHN(MessageIdentifier messageIdentifier) {
        C7U0 c7u0 = (C7U0) this.A00.get();
        if (c7u0.AHB(EnumC2054697t.A0t)) {
            LEK lek = this.A04;
            UserSession userSession = this.A02;
            C83403nh A00 = LEK.A00(lek, messageIdentifier.A01, "DirectThreadFragment.reportBugForVisualMessage", true);
            if (A00 != null) {
                C452526i c452526i = (C452526i) userSession.A01(C452526i.class, new C452626j());
                C2EC Co6 = c7u0.C7r().Co6();
                if (Co6 != null) {
                    c452526i.A01 = Co6;
                    c452526i.A00 = A00;
                    AbstractC59962oe abstractC59962oe = this.A01;
                    AbstractC35237FgW.A01(abstractC59962oe.requireActivity(), BugReportSource.A0D, userSession, AbstractC166997dE.A0p(abstractC59962oe.requireContext(), 2131971483), AbstractC166997dE.A0p(abstractC59962oe.requireContext(), 2131954361));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }
}
