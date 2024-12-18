package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FrL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35783FrL implements CallerContextable {
    public static final String __redex_internal_original_name = "InteropRecipientAdapterDataController";
    public Integer A00;
    public final FNQ A01;
    public final InterfaceC37223GaY A02;
    public final C31773DxW A03;
    public final InterfaceC37293Gbu A04;
    public final UserSession A05;
    public final C35128FeV A06;
    public final java.util.Set A07;
    public final boolean A08;
    public final boolean A09;

    public final void A03(DirectShareTarget directShareTarget, boolean z) {
        List list;
        PendingRecipient pendingRecipient;
        C14360o3.A0B(directShareTarget, 0);
        Integer A04 = directShareTarget.A04(this.A05.userId, false);
        C14360o3.A07(A04);
        if (((!directShareTarget.A0O() && ((pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(AbstractC31175DnJ.A0f(directShareTarget))) == null || !pendingRecipient.A0X)) || !z) && (!directShareTarget.A0F() || !directShareTarget.A0T())) {
            if (!z && directShareTarget.A0S) {
                list = this.A01.A05;
            } else {
                switch (A04.intValue()) {
                    case 0:
                    case 17:
                        break;
                    case 1:
                        list = this.A01.A03;
                        break;
                    case 6:
                        if (this.A09 && !directShareTarget.A0R()) {
                            InterfaceC37223GaY interfaceC37223GaY = this.A02;
                            if (interfaceC37223GaY.CLm()) {
                                Iterator it = interfaceC37223GaY.Bsn().iterator();
                                while (it.hasNext()) {
                                    DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                                    if (!A0m.A0M() && AbstractC31172DnG.A18(directShareTarget).contains(AbstractC31172DnG.A18(A0m).get(0))) {
                                    }
                                }
                                list = this.A01.A02;
                                break;
                            }
                        }
                        if (!this.A08) {
                            return;
                        }
                        break;
                    case 18:
                        list = this.A01.A01;
                        break;
                    case Process.SIGSTOP /* 19 */:
                        list = this.A01.A00;
                        break;
                    default:
                        return;
                }
            }
            list.add(directShareTarget);
        }
        list = this.A01.A04;
        list.add(directShareTarget);
    }

    public final void A04(String str, List list) {
        C14360o3.A0B(str, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            if (this.A07.add(AbstractC31173DnH.A0o(A0m))) {
                A03(A0m, AbstractC167007dF.A1N(str.length()));
            }
        }
        A02();
        this.A04.DyO();
    }

    public C35783FrL(Context context, C66362zD c66362zD, UserSession userSession, InterfaceC37223GaY interfaceC37223GaY, InterfaceC37293Gbu interfaceC37293Gbu, C41951wl c41951wl, C169487hO c169487hO, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        AbstractC167017dG.A1R(userSession, str);
        C14360o3.A0B(c169487hO, 10);
        AbstractC25229BEm.A1L(c66362zD, 11, interfaceC37293Gbu);
        C14360o3.A0B(interfaceC37223GaY, 13);
        this.A05 = userSession;
        this.A08 = z2;
        this.A09 = z3;
        this.A04 = interfaceC37293Gbu;
        this.A01 = new FNQ();
        this.A07 = AbstractC166987dD.A1H();
        this.A02 = interfaceC37223GaY;
        this.A06 = new C35128FeV(context, c66362zD, userSession, interfaceC37223GaY, c41951wl, z, z3, z4, z5, z6);
        this.A03 = new C31773DxW(new FIY(this, str), c169487hO);
        this.A00 = C05F.A00;
    }

    public final ArrayList A00() {
        FNQ fnq = this.A01;
        UserSession userSession = this.A05;
        boolean A1N = AbstractC167007dF.A1N(this.A04.BrI().length());
        this.A02.CLm();
        List list = fnq.A04;
        int size = list.size();
        if (!A1N) {
            size += AbstractC31172DnG.A02(fnq.A00, fnq.A03.size());
        }
        ArrayList A17 = AbstractC25225BEi.A17(size);
        A17.addAll(AbstractC35052FcP.A00(userSession, list));
        if (!A1N) {
            A17.addAll(AbstractC35052FcP.A00(userSession, fnq.A00));
            A17.addAll(AbstractC35052FcP.A00(userSession, fnq.A03));
        }
        return A17;
    }

    public final void A01() {
        FNQ fnq = this.A01;
        fnq.A02.clear();
        fnq.A04.clear();
        fnq.A03.clear();
        fnq.A01.clear();
        fnq.A00.clear();
        fnq.A05.clear();
        this.A07.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0160, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r12, 36326438252918653L) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        if (X.AbstractC166987dD.A1b(r9) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0185, code lost:
    
        if (X.AbstractC166987dD.A1b(r3) == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35783FrL.A02():void");
    }

    public final void A05(List list) {
        A01();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            A03(A0m, true);
            this.A07.add(AbstractC31173DnH.A0o(A0m));
        }
        A02();
        this.A04.DyO();
        C31773DxW c31773DxW = this.A03;
        ArrayList A00 = A00();
        C195248kQ c195248kQ = c31773DxW.A00;
        c195248kQ.A01();
        Iterator it2 = A00.iterator();
        while (it2.hasNext()) {
            c195248kQ.A02(it2.next());
        }
    }
}
