package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P1l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56376P1l implements InterfaceC37290Gbr {
    public final /* synthetic */ C54792OJk A00;

    @Override // X.InterfaceC37290Gbr
    public final boolean CLb() {
        return false;
    }

    @Override // X.InterfaceC37290Gbr
    public final void CiI() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void CvO(boolean z) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void Cvk() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void D5j() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DAR(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DAT(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DAe() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DAf() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DBh() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DN4() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DVX() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DYM(C26055Bfi c26055Bfi) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DYN() {
    }

    @Override // X.InterfaceC37151GYo
    public final void DdI(DirectShareTarget directShareTarget) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DdM(DirectShareTarget directShareTarget, List list, int i, int i2, int i3, boolean z) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void Dgb(RectF rectF, int i) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void Dkb(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        long j;
        boolean z;
        Long A0j;
        C54792OJk c54792OJk = this.A00;
        ((C2UU) c54792OJk.A08.getValue()).notifyDataSetChanged();
        if (C18U.A06(C06090Tz.A05, c54792OJk.A04, 36311891198346028L)) {
            PendingRecipient pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(AbstractC31175DnJ.A0f(directShareTarget));
            C55902Orq c55902Orq = c54792OJk.A05;
            String str = c54792OJk.A02;
            long j2 = i3;
            if (pendingRecipient != null && (A0j = AbstractC166997dE.A0j(pendingRecipient.getId())) != null) {
                j = A0j.longValue();
            } else {
                j = -1;
                if (pendingRecipient == null) {
                    z = false;
                    boolean z2 = c54792OJk.A03;
                    String str2 = c54792OJk.A01;
                    C14360o3.A0B(str, 0);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c55902Orq.A01, "instagram_rtc_call_recipients_click");
                    A0f.AAP("creation_session_id", str);
                    A0f.A9K("absolute_position", Long.valueOf(j2));
                    A0f.A9K("target_id", Long.valueOf(j));
                    A0f.A7v("is_search", AbstractC31173DnH.A0d(A0f, Boolean.valueOf(z), "is_fb_friend", z2));
                    A0f.AAP("section_type", "SUGGESTED");
                    A0f.AAP("mnet_request_id", str2);
                    A0f.Cht();
                }
            }
            z = pendingRecipient.A0N;
            boolean z22 = c54792OJk.A03;
            String str22 = c54792OJk.A01;
            C14360o3.A0B(str, 0);
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c55902Orq.A01, "instagram_rtc_call_recipients_click");
            A0f2.AAP("creation_session_id", str);
            A0f2.A9K("absolute_position", Long.valueOf(j2));
            A0f2.A9K("target_id", Long.valueOf(j));
            A0f2.A7v("is_search", AbstractC31173DnH.A0d(A0f2, Boolean.valueOf(z), "is_fb_friend", z22));
            A0f2.AAP("section_type", "SUGGESTED");
            A0f2.AAP("mnet_request_id", str22);
            A0f2.Cht();
        }
    }

    @Override // X.InterfaceC37290Gbr
    public final void Dla() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void Dlf() {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DpI(E4B e4b) {
    }

    @Override // X.InterfaceC37290Gbr
    public final void DpJ(C3Ow c3Ow) {
    }

    @Override // X.InterfaceC37290Gbr
    public final boolean EiR(UserSession userSession, DirectShareTarget directShareTarget) {
        if (directShareTarget.A0L() && directShareTarget.A0Q.size() == 1) {
            return !((PendingRecipient) directShareTarget.A0Q.get(0)).A0R;
        }
        return false;
    }

    public C56376P1l(C54792OJk c54792OJk) {
        this.A00 = c54792OJk;
    }

    @Override // X.InterfaceC37151GYo
    public final void DdJ(FKH fkh, DirectShareTarget directShareTarget, float f) {
        long j;
        boolean z;
        Long A0j;
        C54792OJk c54792OJk = this.A00;
        if (C18U.A06(C06090Tz.A05, c54792OJk.A04, 36311891198346028L)) {
            PendingRecipient pendingRecipient = (PendingRecipient) AbstractC001800i.A0J(AbstractC31175DnJ.A0f(directShareTarget));
            if (!c54792OJk.A03) {
                C55902Orq c55902Orq = c54792OJk.A05;
                String str = c54792OJk.A02;
                long j2 = fkh.A00;
                if (pendingRecipient != null && (A0j = AbstractC166997dE.A0j(pendingRecipient.getId())) != null) {
                    j = A0j.longValue();
                } else {
                    j = -1;
                    if (pendingRecipient == null) {
                        z = false;
                        boolean z2 = c54792OJk.A03;
                        String str2 = c54792OJk.A01;
                        C14360o3.A0B(str, 0);
                        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c55902Orq.A01, "instagram_rtc_call_recipients_impression"), 314);
                        A0A.A0R("creation_session_id", str);
                        A0A.A0Q("absolute_position", Long.valueOf(j2));
                        Long valueOf = Long.valueOf(j);
                        A0A.A0Q("target_id", valueOf);
                        A0A.A0O("is_fb_friend", Boolean.valueOf(z));
                        A0A.A0O("is_search", Boolean.valueOf(z2));
                        A0A.A0R("section_type", "SUGGESTED");
                        A0A.A0R("mnet_request_id", str2);
                        c55902Orq.A00.put(valueOf, A0A);
                    }
                }
                z = pendingRecipient.A0N;
                boolean z22 = c54792OJk.A03;
                String str22 = c54792OJk.A01;
                C14360o3.A0B(str, 0);
                C25531Mh A0A2 = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c55902Orq.A01, "instagram_rtc_call_recipients_impression"), 314);
                A0A2.A0R("creation_session_id", str);
                A0A2.A0Q("absolute_position", Long.valueOf(j2));
                Long valueOf2 = Long.valueOf(j);
                A0A2.A0Q("target_id", valueOf2);
                A0A2.A0O("is_fb_friend", Boolean.valueOf(z));
                A0A2.A0O("is_search", Boolean.valueOf(z22));
                A0A2.A0R("section_type", "SUGGESTED");
                A0A2.A0R("mnet_request_id", str22);
                c55902Orq.A00.put(valueOf2, A0A2);
            }
        }
    }

    @Override // X.InterfaceC37290Gbr
    public final void DjF() {
        O56 o56 = this.A00.A06.A00.A00;
        if (o56 != null) {
            o56.A00.A03.A03(C56617PBn.A00);
        } else {
            C14360o3.A0F("candidatesListener");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC37290Gbr
    public final void DjR(CharSequence charSequence) {
        C54792OJk c54792OJk = this.A00;
        O56 o56 = c54792OJk.A06.A00.A00;
        if (o56 != null) {
            o56.A00.A03.A03(new C56605PBb(charSequence));
            boolean z = true;
            if (charSequence.length() == 0) {
                z = false;
            }
            c54792OJk.A03 = z;
            return;
        }
        C14360o3.A0F("candidatesListener");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37290Gbr
    public final void DjV() {
        Context context = this.A00.A06.A00.A02;
        if (AbstractC56862jK.A01(context, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.setClassName(MSY.A0h(obtain));
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(context.getString(2131954508));
            AbstractC50523MSb.A09(context).sendAccessibilityEvent(obtain);
        }
    }

    @Override // X.InterfaceC37290Gbr
    public final void DlZ(DirectShareTarget directShareTarget, String str, int i, int i2, int i3, boolean z, boolean z2) {
        Integer num;
        C51895Mwd c51895Mwd;
        O56 o56 = this.A00.A06.A00.A00;
        if (o56 != null) {
            C0x9 c0x9 = new C0x9();
            Iterator it = directShareTarget.A0B().iterator();
            while (it.hasNext()) {
                c0x9.A04(AbstractC166987dD.A1B(it));
            }
            NTD ntd = o56.A00;
            C51867MwB c51867MwB = ntd.A00;
            if (c51867MwB == null || (num = c51867MwB.A00) == null) {
                num = C05F.A00;
            }
            if (num == C05F.A00) {
                ntd.A02.A00(new C56569P9p(c0x9));
                ntd.A03.A03(new PBU(directShareTarget));
            }
            C51895Mwd c51895Mwd2 = (C51895Mwd) ((AbstractC55206OeJ) ntd).A01;
            if (c51895Mwd2 != null) {
                boolean z3 = c51895Mwd2.A06;
                List list = c51895Mwd2.A02;
                String str2 = c51895Mwd2.A01;
                boolean z4 = c51895Mwd2.A08;
                boolean z5 = c51895Mwd2.A05;
                boolean z6 = c51895Mwd2.A03;
                boolean z7 = c51895Mwd2.A09;
                Integer num2 = c51895Mwd2.A00;
                boolean z8 = c51895Mwd2.A07;
                AbstractC167017dG.A1R(list, str2);
                C14360o3.A0B(num2, 8);
                c51895Mwd = new C51895Mwd(num2, str2, list, z3, true, z4, z5, z6, z7, z8);
            } else {
                c51895Mwd = null;
            }
            ntd.A0J(c51895Mwd);
            return;
        }
        C14360o3.A0F("candidatesListener");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37290Gbr
    public final void DwA(DirectShareTarget directShareTarget, int i) {
        ((C2UU) this.A00.A08.getValue()).notifyDataSetChanged();
    }
}
