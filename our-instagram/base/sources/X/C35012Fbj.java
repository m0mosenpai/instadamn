package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Fbj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35012Fbj {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AbstractC59962oe A03;
    public final C41761wQ A04;
    public final UserSession A05;
    public final InterfaceC83733oI A06;
    public final EnumC31337Dq2 A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final C7TQ A0B;
    public final C31600DuS A0C;
    public final ArrayList A0D;
    public final boolean A0E;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r18.A07 != X.EnumC31337Dq2.A02) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.util.ArrayList r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35012Fbj.A01(java.util.ArrayList):void");
    }

    public static final void A00(C35012Fbj c35012Fbj, ArrayList arrayList) {
        FragmentActivity activity;
        Integer num;
        String str;
        C83693oE c83693oE;
        ArrayList A02 = AbstractC35052FcP.A02(arrayList);
        Context context = c35012Fbj.A02;
        C6WQ c6wq = new C6WQ(context, true);
        c6wq.A00(c6wq.getContext().getString(2131958687));
        int i = c35012Fbj.A01;
        if (i != 29) {
            if (i == 47) {
                UserSession userSession = c35012Fbj.A05;
                AbstractC59962oe abstractC59962oe = c35012Fbj.A03;
                String A07 = AbstractC1345466e.A07(c35012Fbj.A06);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(abstractC59962oe, userSession, A07, 2), "direct_group_add_member");
                if (A0f.isSampled()) {
                    AbstractC31171DnF.A1H(A0f, A07);
                    A0f.Cht();
                }
            }
        } else if (c35012Fbj.A07 == EnumC31337Dq2.A03) {
            C142846ck A00 = AbstractC147806l5.A00(c35012Fbj.A05);
            int i2 = c35012Fbj.A00;
            String A072 = AbstractC1345466e.A07(c35012Fbj.A06);
            String str2 = c35012Fbj.A08;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass016.A16(AbstractC31172DnG.A0m(it).A0B(), A1E);
            }
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("collaborator_igids", AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A1E, GVP.A00));
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1I(A0I, "thread_add_collaborators");
                A0I.A0o("invite_button");
                AbstractC31175DnJ.A1C(A0I, AbstractC31179DnN.A0a(A0I, "add_collaborators_sheet", A072, str2, i2), A1G);
            }
        }
        C41761wQ c41761wQ = c35012Fbj.A04;
        C7TQ c7tq = c35012Fbj.A0B;
        InterfaceC83733oI interfaceC83733oI = c35012Fbj.A06;
        ArrayList arrayList2 = c35012Fbj.A0D;
        ArrayList A0i = AbstractC167007dF.A0i(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            A0i.add(AbstractC31172DnG.A0p(it2).A08);
        }
        GKM.A00(c7tq.A9t(context, interfaceC83733oI, c35012Fbj.A07, AbstractC001800i.A0X(A0i), AbstractC35052FcP.A00(c35012Fbj.A05, arrayList), i), c41761wQ, c6wq, c35012Fbj, 0);
        C0fJ.A00(c6wq);
        C31600DuS c31600DuS = c35012Fbj.A0C;
        if (c31600DuS != null) {
            ArrayList A0i2 = AbstractC167007dF.A0i(arrayList2);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                A0i2.add(AbstractC31176DnK.A0s(it3));
            }
            EnumC92794Ds A002 = AbstractC1345466e.A00(interfaceC83733oI);
            boolean z = c35012Fbj.A0E;
            Iterator A13 = AbstractC166997dE.A13(arrayList);
            boolean z2 = true;
            boolean z3 = false;
            while (A13.hasNext()) {
                if (((DirectShareTarget) AbstractC166997dE.A0l(A13)).A0E()) {
                    z3 = true;
                }
            }
            if (!c35012Fbj.A09 && !z3) {
                z2 = false;
            }
            C32872EdE c32872EdE = c31600DuS.A02;
            if (c32872EdE != null) {
                c32872EdE.A02();
            }
            C31641Dv7 c31641Dv7 = c31600DuS.A03;
            if (c31641Dv7 != null && !c31600DuS.A0A) {
                c31600DuS.A0A = true;
                HashSet A0k = AbstractC31171DnF.A0k(A0i2);
                A0k.addAll(A02);
                Integer num2 = C05F.A0C;
                if (z) {
                    num = C05F.A15;
                } else {
                    num = C05F.A0u;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                if (A002 == EnumC92794Ds.A05) {
                    if (interfaceC83733oI instanceof C83693oE) {
                        c83693oE = (C83693oE) interfaceC83733oI;
                    } else if (!(interfaceC83733oI instanceof MsysThreadId)) {
                        if (interfaceC83733oI instanceof EgH) {
                            c83693oE = ((EgH) interfaceC83733oI).A00;
                        } else {
                            throw AbstractC166987dD.A14(AbstractC167017dG.A0n(interfaceC83733oI, AbstractC111324zv.A00(1616), AbstractC166987dD.A1C()));
                        }
                    }
                    str = c83693oE.A00;
                    c31641Dv7.A09(A002, valueOf, num2, num, null, str, A0k);
                }
                str = null;
                c31641Dv7.A09(A002, valueOf, num2, num, null, str, A0k);
            }
        }
        AbstractC59962oe abstractC59962oe2 = c35012Fbj.A03;
        if (!abstractC59962oe2.mDetached && (activity = abstractC59962oe2.getActivity()) != null) {
            AbstractC31175DnJ.A0i(activity);
        }
    }

    public C35012Fbj(AbstractC59962oe abstractC59962oe, UserSession userSession, C7TQ c7tq, C31600DuS c31600DuS, InterfaceC83733oI interfaceC83733oI, EnumC31337Dq2 enumC31337Dq2, String str, ArrayList arrayList, int i, int i2, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1Q(userSession, interfaceC83733oI);
        AbstractC167017dG.A1T(arrayList, c7tq);
        C14360o3.A0B(enumC31337Dq2, 12);
        this.A05 = userSession;
        this.A03 = abstractC59962oe;
        this.A06 = interfaceC83733oI;
        this.A08 = str;
        this.A0D = arrayList;
        this.A0B = c7tq;
        this.A0A = z;
        this.A0E = z2;
        this.A09 = z3;
        this.A01 = i;
        this.A00 = i2;
        this.A07 = enumC31337Dq2;
        this.A0C = c31600DuS;
        this.A02 = abstractC59962oe.requireContext();
        this.A04 = AbstractC31173DnH.A0S();
    }
}
