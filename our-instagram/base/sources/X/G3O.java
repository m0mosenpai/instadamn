package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3O implements InterfaceC37207GaI {
    public final UserSession A00;
    public final C7U0 A01;
    public final C33092Eiu A02;
    public final InterfaceC41501vz A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C37028GTk.A00);
    public final InterfaceC09390do A05 = C37058GUs.A01(this, 7);
    public final InterfaceC09390do A03 = C37058GUs.A01(this, 6);

    @Override // X.InterfaceC37207GaI
    public final boolean APD() {
        return false;
    }

    @Override // X.InterfaceC37207GaI
    public final void F8Y(C7TT c7tt, List list, boolean z, boolean z2) {
        InterfaceC83733oI interfaceC83733oI;
        C83693oE A02;
        String str;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C160787Im c160787Im = (C160787Im) obj;
                UserSession userSession = this.A00;
                C83403nh c83403nh = c160787Im.A0e;
                C14360o3.A07(c83403nh);
                if (AbstractC31323Dpl.A00(userSession, c83403nh) && (!C1580877s.A02(c160787Im) || c160787Im.A0N == C05F.A00)) {
                    A1E.add(obj);
                }
            }
            if (!A1E.isEmpty() && (interfaceC83733oI = c7tt.A0P) != null && (A02 = AbstractC1345466e.A02(interfaceC83733oI)) != null && (str = A02.A00) != null) {
                InterfaceC163837Ux C7r = this.A01.C7r();
                int AdZ = C7r.AdZ();
                String C7q = C7r.C7q();
                String A00 = C1Q2.A00();
                WeakReference A16 = AbstractC25225BEi.A16(this.A08.invoke());
                C33092Eiu c33092Eiu = this.A02;
                ArrayList A0i = AbstractC167007dF.A0i(A1E);
                Iterator it = A1E.iterator();
                while (it.hasNext()) {
                    A0i.add(((C160787Im) it.next()).A0e);
                }
                AbstractC166987dD.A1Z(new MVR(new C34633FNq(this, str, C7q, A00, A16, A1E, AdZ), c33092Eiu, A0i, str, (InterfaceC23621Ds) null, 9), ((C4A7) c33092Eiu).A01);
                C142846ck A0d = AbstractC31172DnG.A0d(this.A03);
                int size = A1E.size();
                C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, A0d);
                    AbstractC31174DnI.A1J(A0I, "channel_translation_request_sent");
                    A0I.A0o("channel_translation");
                    AbstractC31178DnM.A1H(A0I, "thread_view", AdZ);
                    A0I.A0r(str);
                    AbstractC31174DnI.A1H(A0I, A0d, AbstractC31177DnL.A0Z(C7q));
                    A0I.A0v(AbstractC25233BEq.A0p("target_locale", A00, AbstractC166987dD.A1L("message_counts", String.valueOf(size))));
                    A0I.Cht();
                }
                C006802i c006802i = ((C34495FIh) this.A05.getValue()).A00;
                c006802i.markerStart(25631742);
                c006802i.markerPoint(25631742, "Translation_Request_Sent");
            }
        }
    }

    @Override // X.InterfaceC37207GaI
    public final void onDestroy() {
        AbstractC25651Mw.A00(this.A00).A02(this.A06, C36082FwI.class);
    }

    public G3O(UserSession userSession, C33092Eiu c33092Eiu, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ) {
        this.A08 = interfaceC16820sZ;
        this.A00 = userSession;
        this.A02 = c33092Eiu;
        this.A07 = interfaceC08830cm;
        this.A01 = (C7U0) AbstractC31172DnG.A0y(interfaceC08830cm);
        C31650DvG A00 = C31650DvG.A00(this, 30);
        this.A06 = A00;
        AbstractC25651Mw.A00(userSession).A01(A00, C36082FwI.class);
    }

    @Override // X.InterfaceC37207GaI
    public final SpannableString BVr(Context context, InterfaceC164947Zj interfaceC164947Zj, MessageIdentifier messageIdentifier, Integer num, int i) {
        String A0p = AbstractC166997dE.A0p(context, 2131958858);
        String A0p2 = AbstractC166997dE.A0p(context, 2131958857);
        SpannableStringBuilder append = AbstractC25225BEi.A0H(A0p).append((CharSequence) AnonymousClass001.A0D(A0p2, ' '));
        C14360o3.A0A(append);
        AnonymousClass773.A05(append, new C32966Eex(context, this, interfaceC164947Zj, i), A0p2);
        SpannableString valueOf = SpannableString.valueOf(append);
        C14360o3.A07(valueOf);
        return valueOf;
    }

    @Override // X.InterfaceC37207GaI
    public final void Dtc(MessageIdentifier messageIdentifier, Integer num) {
        Object obj;
        String str;
        boolean A1Y = AbstractC25229BEm.A1Y(num);
        String str2 = messageIdentifier.A01;
        C7U0 c7u0 = this.A01;
        InterfaceC163557Ts BT6 = c7u0.BT6();
        Iterator it = BT6.BSu(str2).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C160787Im) obj).A0e.A0i(), str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C160787Im c160787Im = (C160787Im) obj;
        boolean z = false;
        if (c160787Im != null) {
            if (num != C05F.A00 && !C1580877s.A02(c160787Im)) {
                C7TT A0V = AbstractC31174DnI.A0V(c7u0);
                C14360o3.A07(A0V);
                F8Y(A0V, AbstractC166987dD.A1J(c160787Im), A1Y, A1Y);
            } else {
                BT6.EZ9(num, str2, A1Y);
            }
        }
        C142846ck A0d = AbstractC31172DnG.A0d(this.A03);
        InterfaceC163837Ux C7r = c7u0.C7r();
        int AdZ = C7r.AdZ();
        if (num == C05F.A01) {
            z = true;
        }
        String C7I = C7r.C7I();
        String C7q = C7r.C7q();
        C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A0d);
            if (z) {
                str = "translated_text_enabled";
            } else {
                str = "translated_text_disabled";
            }
            AbstractC31174DnI.A1I(A0I, str);
            A0I.A0o("message_options");
            AbstractC31177DnL.A1H(A0I, A0d, AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ));
        }
    }
}
