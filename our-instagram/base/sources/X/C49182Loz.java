package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import java.util.List;

/* renamed from: X.Loz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49182Loz implements InterfaceC50437MOr {
    public final C98K A00;

    @Override // X.InterfaceC50437MOr
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ALW(Context context, C99E c99e, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C7IM c7im, MessagingUser messagingUser, InterfaceC50520MRx interfaceC50520MRx, MsysThreadSubtype msysThreadSubtype, String str, List list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, userSession, anonymousClass988, messagingUser, interfaceC50520MRx);
        AbstractC167017dG.A1U(c7ql, c7im);
        C14360o3.A0B(msysThreadSubtype, 12);
        boolean A02 = InterfaceC50520MRx.A02(messagingUser, interfaceC50520MRx, i);
        C7IJ A04 = AbstractC162737Qk.A04(c7im, A02);
        String C5u = interfaceC50520MRx.C5u(i);
        if (C5u == null) {
            C0w9.A03("LinkMessageContentViewModelInstructionGenerator", "No text found for link message");
            C5u = "No Text found for link message";
        }
        if (c99e != null) {
            C5u = c99e.ANm(C5u);
        }
        List A07 = AbstractC85433rY.A07(C5u);
        CharSequence A00 = AbstractC1581477z.A00(context, AnonymousClass541.A0J, userSession, this.A00, A04, new C115955Ml(478, AbstractC1581477z.A03(A07, C5u), null, A07), C5u, true, false);
        C45938KUp c45938KUp = new C45938KUp(AbstractC162737Qk.A04(c7im, A02).A04, (int) AbstractC13880nE.A04(context, 10));
        if (A00 == null) {
            A00 = "";
        }
        String valueOf = String.valueOf(interfaceC50520MRx.BtD(i));
        return new C45895KSy(LLL.A01(context, anonymousClass988, messagingUser, interfaceC50520MRx, C2EY.A19, new ME2(userSession, anonymousClass988, interfaceC50520MRx), i, false, true, true, true, false, z, z2, true), Ko8.A00(c99e, anonymousClass988, c7im, messagingUser, interfaceC50520MRx, Boolean.valueOf(LJT.A00(c99e, interfaceC50520MRx, i)), Boolean.valueOf(LJT.A01(c99e, interfaceC50520MRx, i)), AbstractC09440dt.A01(MGH.A00), i), c45938KUp, A00, valueOf);
    }

    public C49182Loz(C98K c98k) {
        this.A00 = c98k;
    }
}
