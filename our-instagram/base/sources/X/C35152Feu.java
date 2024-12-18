package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.Feu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35152Feu {
    public Integer A00;
    public final Context A01;
    public final View A02;
    public final UserSession A03;
    public final C2EE A04;
    public final C7TH A05;
    public final InterfaceC09390do A06;
    public final View A07;
    public final TextView A08;
    public final IgdsCheckBox A09;

    public C35152Feu(Context context, View view, View view2, UserSession userSession, C2EE c2ee, C7TH c7th) {
        View view3;
        TextView textView;
        AbstractC25234BEr.A0j(2, context, view, view2, c7th);
        this.A03 = userSession;
        this.A01 = context;
        this.A07 = view2;
        this.A05 = c7th;
        this.A04 = c2ee;
        ViewStub A07 = AbstractC31171DnF.A07(view, R.id.enable_crossposting_composer_banner_viewstub);
        if (A07 != null) {
            view3 = A07.inflate();
        } else {
            view3 = null;
        }
        this.A02 = view3;
        if (view3 != null) {
            textView = AbstractC166987dD.A0e(view3, R.id.title);
        } else {
            textView = null;
        }
        this.A08 = textView;
        this.A09 = view3 != null ? (IgdsCheckBox) view3.requireViewById(R.id.crossposting_enabled_checkbox) : null;
        this.A06 = AbstractC09440dt.A01(new MHI(this, 27));
    }

    public static final void A00(C35152Feu c35152Feu, boolean z) {
        C7TH c7th;
        Integer num;
        C2EE c2ee = c35152Feu.A04;
        if (c2ee != null) {
            UserSession userSession = c35152Feu.A03;
            if (A01(userSession, c2ee, c35152Feu, z)) {
                boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36323079588228026L);
                View view = c35152Feu.A02;
                if (A06) {
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    Integer num2 = c35152Feu.A00;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (view != null) {
                            view.setBackgroundColor(intValue);
                        }
                    }
                    Integer num3 = c35152Feu.A00;
                    if (num3 != null) {
                        c35152Feu.A07.setBackgroundColor(num3.intValue());
                    }
                    TextView textView = c35152Feu.A08;
                    if (textView != null) {
                        AbstractC31173DnH.A12(c35152Feu.A01, textView, 2131954254);
                    }
                    IgdsCheckBox igdsCheckBox = c35152Feu.A09;
                    if (igdsCheckBox != null) {
                        igdsCheckBox.setVisibility(0);
                        igdsCheckBox.setChecked(true);
                        C35745Fqd.A01(igdsCheckBox, c35152Feu, 26);
                    }
                }
                c7th = c35152Feu.A05;
                num = C05F.A0N;
                c7th.EhS(num);
            }
        }
        IgdsCheckBox igdsCheckBox2 = c35152Feu.A09;
        if (igdsCheckBox2 != null) {
            igdsCheckBox2.setChecked(false);
        }
        View view2 = c35152Feu.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        c35152Feu.A07.setBackgroundColor(0);
        c7th = c35152Feu.A05;
        if (c7th.CIY() == C05F.A01) {
            return;
        }
        num = C05F.A00;
        c7th.EhS(num);
    }

    public final boolean A02() {
        C2EE c2ee;
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36323079588228026L) && (c2ee = this.A04) != null) {
            return A01(userSession, c2ee, this, false);
        }
        IgdsCheckBox igdsCheckBox = this.A09;
        if (igdsCheckBox == null) {
            return false;
        }
        return igdsCheckBox.isChecked();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (X.AbstractC31174DnI.A1X(r6.A01, "broadcast_chat_creator_has_sent_first_message/", r5) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r1 == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(com.instagram.common.session.UserSession r8, X.C2EE r9, X.C35152Feu r10, boolean r11) {
        /*
            int r1 = r9.C7g()
            r0 = 29
            boolean r5 = X.AbstractC167007dF.A1P(r1, r0)
            java.lang.String r1 = r9.Asv()
            java.lang.String r0 = r8.userId
            r2 = 0
            boolean r4 = X.AbstractC002300n.A0g(r1, r0, r2)
            java.lang.Boolean r0 = r9.CTd()
            r3 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            boolean r1 = X.C14360o3.A0K(r0, r7)
            java.util.List r0 = r9.CIX()
            if (r0 == 0) goto La7
            boolean r0 = X.AbstractC166987dD.A1b(r0)
        L2c:
            if (r5 == 0) goto L71
            if (r4 == 0) goto L71
            if (r1 == 0) goto L71
            if (r0 == 0) goto L71
            X.1Ai r6 = X.AbstractC23021Ah.A00(r8)
            java.lang.Boolean r0 = r9.An1()
            boolean r0 = X.C14360o3.A0K(r0, r7)
            java.lang.String r5 = ""
            if (r0 != 0) goto L56
            if (r11 == 0) goto L56
            java.lang.String r4 = r9.C7I()
            if (r4 != 0) goto L4d
            r4 = r5
        L4d:
            X.0xo r1 = X.AbstractC166987dD.A0w(r6)
            java.lang.String r0 = "broadcast_chat_creator_has_sent_first_message/"
            X.AbstractC31177DnL.A1M(r1, r0, r4, r3)
        L56:
            java.lang.Boolean r0 = r9.An1()
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 != 0) goto L72
            java.lang.String r0 = r9.C7I()
            if (r0 == 0) goto L67
            r5 = r0
        L67:
            X.0xq r1 = r6.A01
            java.lang.String r0 = "broadcast_chat_creator_has_sent_first_message/"
            boolean r0 = X.AbstractC31174DnI.A1X(r1, r0, r5)
            if (r0 != 0) goto L72
        L71:
            return r2
        L72:
            java.util.List r0 = r9.BKM()
            if (r0 == 0) goto L7e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9b
        L7e:
            java.util.List r0 = r9.BKN()
            if (r0 == 0) goto L8a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9b
        L8a:
            r1 = 0
        L8b:
            boolean r0 = X.C7HD.A04(r8, r3)
            if (r0 == 0) goto L9d
            if (r1 == 0) goto L9f
            X.7TH r1 = r10.A05
            java.lang.Integer r0 = X.C05F.A01
            r1.EhS(r0)
            return r2
        L9b:
            r1 = 1
            goto L8b
        L9d:
            if (r1 != 0) goto L71
        L9f:
            boolean r0 = X.C7HD.A04(r8, r2)
            if (r0 == 0) goto L71
            r2 = 1
            return r2
        La7:
            r0 = 0
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35152Feu.A01(com.instagram.common.session.UserSession, X.2EE, X.Feu, boolean):boolean");
    }
}
