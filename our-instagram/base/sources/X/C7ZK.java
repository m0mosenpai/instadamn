package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ZK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7ZK implements TextView.OnEditorActionListener {
    public InterfaceC41501vz A00;
    public C7LK A01;
    public InterfaceC83733oI A02;
    public Float A03;
    public Integer A04;
    public boolean A05;
    public final AbstractC59962oe A06;
    public final InterfaceC11380iw A07;
    public final C25671My A08;
    public final UserSession A09;
    public final InterfaceC16820sZ A0A;
    public final C41761wQ A0B;
    public final C2056398n A0C;

    public C7ZK(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C41761wQ c41761wQ, UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c41761wQ, 4);
        C14360o3.A0B(interfaceC16820sZ, 5);
        this.A06 = abstractC59962oe;
        this.A09 = userSession;
        this.A07 = interfaceC11380iw;
        this.A0B = c41761wQ;
        this.A0A = interfaceC16820sZ;
        this.A08 = AbstractC25651Mw.A00(userSession);
        this.A0C = AbstractC2056298m.A00(userSession);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 == i) {
            C7LK c7lk = this.A01;
            if (c7lk != null) {
                EditText editText = c7lk.A01;
                if (editText != null) {
                    String obj = editText.getText().toString();
                    InterfaceC16820sZ interfaceC16820sZ = this.A0A;
                    C7U0 c7u0 = (C7U0) interfaceC16820sZ.invoke();
                    InterfaceC163837Ux C7r = c7u0.C7r();
                    InterfaceC83733oI CCa = C7r.CCa();
                    if (CCa != null) {
                        InterfaceC163837Ux C7r2 = ((C7U0) interfaceC16820sZ.invoke()).C7r();
                        AbstractC59962oe abstractC59962oe = this.A06;
                        Context requireContext = abstractC59962oe.requireContext();
                        UserSession userSession = this.A09;
                        if (!AbstractC34133F4j.A00(abstractC59962oe.requireActivity(), requireContext, abstractC59962oe, userSession, C7r2)) {
                            InterfaceC11380iw interfaceC11380iw = this.A07;
                            C3o9 B90 = C7r.B90();
                            C14360o3.A07(B90);
                            String C7l = C7r.C7l();
                            List BSH = C7r.BSH();
                            C14360o3.A0B(interfaceC11380iw, 1);
                            C19280xC A00 = C19280xC.A00(interfaceC11380iw, "direct_thread_name_group");
                            A00.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, JRE.A06(B90));
                            A00.A09("is_e2ee", Boolean.valueOf(JRE.A09(B90)));
                            A00.A0C("where", "top_banner");
                            A00.A0C("existing_name", C7l);
                            if (!BSH.isEmpty()) {
                                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BSH, 10));
                                Iterator it = BSH.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((C17D) it.next()).getId());
                                }
                                A00.A0D("recipient_ids", arrayList);
                            }
                            AbstractC11060iN.A00(userSession).EHW(A00);
                            c7u0.C78().AGz(abstractC59962oe.requireContext(), CCa, obj, C7r.CVY());
                        }
                        C162337Ov.A07(EnumC33487ErM.THREAD_VIEW_BANNER, null, this.A07, userSession, AbstractC1345466e.A07(CCa));
                        return true;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        return false;
    }

    public static final void A00(C7ZK c7zk) {
        C7LK c7lk;
        java.util.Set A00;
        String str;
        InterfaceC83733oI interfaceC83733oI = c7zk.A02;
        if (interfaceC83733oI != null && (c7lk = c7zk.A01) != null) {
            boolean z = interfaceC83733oI instanceof MsysThreadId;
            C2056398n c2056398n = c7zk.A0C;
            if (z) {
                A00 = C2056398n.A00(c2056398n, "direct_v2_secure_threads_inline_group_naming_dismissed", new HashSet(0));
                str = String.valueOf(AbstractC1345466e.A03(interfaceC83733oI).A00);
            } else {
                A00 = C2056398n.A00(c2056398n, "direct_v2_threads_inline_group_naming_dismissed", new HashSet(0));
                str = AbstractC1345466e.A01(interfaceC83733oI).A00;
            }
            if (!A00.contains(str) && c7zk.A05) {
                c7lk.A03.setVisibility(0);
                View view = c7lk.A00;
                if (view != null) {
                    view.setVisibility(0);
                    return;
                }
                return;
            }
            c7lk.A00();
        }
    }

    public final void A01(float f) {
        View view;
        Float f2;
        this.A03 = Float.valueOf(f);
        C7LK c7lk = this.A01;
        if (c7lk != null && (view = c7lk.A00) != null && (f2 = c7lk.A05.A03) != null) {
            view.setAlpha(f2.floatValue());
        }
    }
}
