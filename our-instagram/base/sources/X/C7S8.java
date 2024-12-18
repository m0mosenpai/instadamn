package X;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;

/* renamed from: X.7S8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7S8 implements C7QD {
    public boolean A00;
    public final Activity A01;
    public final UserSession A02;
    public final C57012jc A03;
    public final C7Y8 A04;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2.A00 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r4 = this;
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324612892406041(0x810d0b000e3119, double:3.035169688408898E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L15
            X.2jc r2 = r4.A03
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L22
        L15:
            X.2jc r2 = r4.A03
            android.view.View r1 = r2.A01()
            X.C14360o3.A07(r1)
            r0 = 0
            r1.setOnClickListener(r0)
        L22:
            boolean r0 = r4.A00
            if (r0 == 0) goto L3a
            android.view.View r0 = r2.A01()
            X.C14360o3.A07(r0)
            X.2jm r1 = X.AbstractC58982mw.A00(r0)
            if (r1 == 0) goto L3a
            android.view.View r0 = r2.A01()
            r1.A04(r0)
        L3a:
            r0 = 8
            r2.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7S8.A00():void");
    }

    public final void A01(C76K c76k) {
        String str;
        HashMap hashMap = c76k.A08;
        if (hashMap != null && !this.A00) {
            this.A00 = true;
            View A01 = this.A03.A01();
            C14360o3.A07(A01);
            C57112jm A00 = AbstractC58982mw.A00(A01);
            String str2 = null;
            C51688MsJ c51688MsJ = new C51688MsJ(10);
            MessageIdentifier messageIdentifier = c76k.A04;
            if (messageIdentifier != null) {
                str2 = messageIdentifier.A01;
            }
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c76k, c51688MsJ, str2);
            c59072n8.A00(new C23715Aeo(this, hashMap));
            C59062n7 A012 = c59072n8.A01();
            if (A00 != null) {
                A00.A05(BKF(), A012);
            }
        }
        C57012jc c57012jc = this.A03;
        c57012jc.A03(0);
        View A013 = c57012jc.A01();
        C14360o3.A07(A013);
        TextView textView = (TextView) A013;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(c76k.A03);
        InterfaceC165197a8 interfaceC165197a8 = (InterfaceC165197a8) this.A04;
        CharSequence charSequence = c76k.A05;
        Context context = textView.getContext();
        C14360o3.A07(context);
        MessageIdentifier messageIdentifier2 = c76k.A04;
        String str3 = null;
        if (messageIdentifier2 != null) {
            str = messageIdentifier2.A01;
        } else {
            str = null;
        }
        int i = c76k.A00;
        Spannable CoX = interfaceC165197a8.CoX(context, charSequence, str, i, true);
        if (messageIdentifier2 != null) {
            str3 = messageIdentifier2.A01;
        }
        Spannable CoX2 = interfaceC165197a8.CoX(context, CoX, str3, i, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(CoX2);
        String string = context.getString(2131959867);
        C14360o3.A07(string);
        if (new C60352pJ(this.A02).A00() && AbstractC001900j.A0a(CoX2, string, false)) {
            AnonymousClass773.A06(spannableStringBuilder, new C46057KaE(this), string, context.getColor(R.color.igds_prism_blue_05));
        }
        textView.setText(spannableStringBuilder);
        int A04 = (int) AbstractC13880nE.A04(context, c76k.A01);
        textView.setPadding(A04, 0, A04, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
        textView.setGravity(c76k.A02);
        String str4 = c76k.A06;
        if (str4 != null) {
            C0fQ.A00(new LP4(this, c76k, str4), textView);
        }
    }

    @Override // X.C7QD
    public final View BKF() {
        C57012jc c57012jc = this.A03;
        if (c57012jc.A00 != null) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            return A01;
        }
        ViewStub viewStub = c57012jc.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("View Stub must not be null");
    }

    public C7S8(Activity activity, UserSession userSession, C57012jc c57012jc, C7Y8 c7y8) {
        this.A02 = userSession;
        this.A03 = c57012jc;
        this.A04 = c7y8;
        this.A01 = activity;
    }
}
