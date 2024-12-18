package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* loaded from: classes6.dex */
public final class G30 implements InterfaceC37156GYt {
    public final UserSession A00;
    public final E70 A01;
    public final Context A02;
    public final Fragment A03;
    public final boolean A04;

    public G30(Context context, Fragment fragment, UserSession userSession, E70 e70, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = e70;
        this.A03 = fragment;
        this.A02 = context;
        this.A04 = z;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A01;
        if (((e70.A08() instanceof DirectThreadKey) || (e70.A08() instanceof DirectMsysMixedThreadKey)) && !E70.A05(e70) && !C4GR.A04(e70.A09)) {
            if (AbstractC31177DnL.A1U(C06090Tz.A05, this.A00, 36329642298196438L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if (com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r11.A00, false) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    @Override // X.InterfaceC37156GYt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List getItems() {
        /*
            r11 = this;
            r4 = 2131963978(0x7f13304a, float:1.9564725E38)
            X.E70 r10 = r11.A01
            int r0 = r10.A03
            r3 = 0
            r8 = 1
            boolean r2 = X.AbstractC167007dF.A1P(r0, r8)
            r1 = 18
            X.Fqd r0 = new X.Fqd
            r0.<init>(r11, r1)
            X.GHa r4 = X.C36731GHa.A02(r0, r4, r2)
            r0 = 2131963972(0x7f133044, float:1.9564712E38)
            r4.A02 = r0
            androidx.fragment.app.Fragment r7 = r11.A03
            android.content.Context r5 = r7.requireContext()
            X.PzS r0 = X.AbstractC31668DvY.A00(r5)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L36
            com.instagram.common.session.UserSession r0 = r11.A00
            boolean r0 = com.instagram.direct.lockedchat.LockedChatKillSwitch.isLockedChatEnabled(r0, r3)
            r2 = 1
            if (r0 != 0) goto L37
        L36:
            r2 = 0
        L37:
            boolean r1 = r10.A13
            boolean r0 = r11.A04
            r3 = 0
            if (r1 == 0) goto Lda
            r0 = 2131963977(0x7f133049, float:1.9564723E38)
            if (r2 == 0) goto L46
            r0 = 2131963976(0x7f133048, float:1.956472E38)
        L46:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L4a:
            int r0 = r10.A02
            boolean r2 = X.AbstractC167007dF.A1P(r0, r8)
            boolean r1 = r10.A0k
            X.52z r0 = r10.A0H
            boolean r0 = r0.A08
            java.lang.String r6 = "thread_details"
            if (r2 != 0) goto L5e
            if (r1 != 0) goto L5e
            if (r0 == 0) goto Lbc
        L5e:
            if (r9 == 0) goto Lbc
            com.instagram.common.session.UserSession r1 = r11.A00
            java.lang.String r2 = X.E70.A03(r10)
            java.lang.String r0 = "igd_notification_preview_control"
            X.0wW r1 = X.AbstractC31176DnK.A0O(r1, r0)
            java.lang.String r0 = "igd_notification_preview_control_events"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L7d
            java.lang.String r0 = "show_disabled_hide_message_previews_toggle"
            X.AbstractC31181DnP.A0i(r1, r0, r6, r2)
        L7d:
            r4.A0D = r8
            r4.A0F = r8
            int r0 = r9.intValue()
            java.lang.String r0 = X.AbstractC25227BEk.A0v(r7, r0)
            android.text.SpannableStringBuilder r0 = X.AbstractC25225BEi.A0H(r0)
            X.Fgf r3 = new X.Fgf
            r3.<init>(r0)
            r0 = 2132017967(0x7f14032f, float:1.9674227E38)
            r3.A01 = r0
        L97:
            com.instagram.common.ui.base.IgView r2 = new com.instagram.common.ui.base.IgView
            r2.<init>(r5)
            r1 = -1
            r0 = 16
            X.AbstractC31174DnI.A1D(r2, r1, r0)
            r0 = 2130970297(0x7f0406b9, float:1.75493E38)
            int r0 = X.AbstractC167007dF.A09(r5, r0)
            r2.setBackgroundColor(r0)
            if (r3 == 0) goto Lb7
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r4, r3}
        Lb2:
            java.util.List r0 = X.AbstractC16960so.A1Q(r0)
            return r0
        Lb7:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r4}
            goto Lb2
        Lbc:
            com.instagram.common.session.UserSession r1 = r11.A00
            java.lang.String r2 = X.E70.A03(r10)
            java.lang.String r0 = "igd_notification_preview_control"
            X.0wW r1 = X.AbstractC31176DnK.A0O(r1, r0)
            java.lang.String r0 = "igd_notification_preview_control_events"
            X.0Ai r1 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L97
            java.lang.String r0 = "show_hide_message_previews_toggle"
            X.AbstractC31181DnP.A0i(r1, r0, r6, r2)
            goto L97
        Lda:
            if (r0 == 0) goto Le6
            r0 = 2131963973(0x7f133045, float:1.9564715E38)
            if (r2 == 0) goto L46
            r0 = 2131963975(0x7f133047, float:1.9564719E38)
            goto L46
        Le6:
            if (r2 == 0) goto Led
            r0 = 2131963974(0x7f133046, float:1.9564717E38)
            goto L46
        Led:
            r9 = r3
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G30.getItems():java.util.List");
    }
}
