package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.LmD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49025LmD implements C7Q6 {
    public final Activity A00;
    public final UserSession A01;
    public final InterfaceC11380iw A02;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != null) goto L11;
     */
    @Override // X.C7Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean DT4(android.view.MotionEvent r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r7 = this;
            X.7Sc r9 = (X.C163177Sc) r9
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            java.lang.String r1 = r9.A04
            if (r1 == 0) goto L36
            int r0 = r1.length()
            if (r0 == 0) goto L36
            android.net.Uri r2 = X.AbstractC08820cl.A03(r1)
            if (r2 == 0) goto L1e
            java.lang.String r0 = "user_ids"
            java.lang.String r1 = r2.getQueryParameter(r0)
            if (r1 != 0) goto L20
        L1e:
            java.lang.String r1 = ""
        L20:
            r0 = 44
            boolean r0 = X.AbstractC001900j.A0U(r1, r0)
            r6 = r0 ^ 1
            if (r2 == 0) goto L34
            java.lang.String r3 = r9.A02
            java.lang.String r4 = r9.A01
            java.lang.String r5 = r9.A03
            r1 = r7
            r1.A00(r2, r3, r4, r5, r6)
        L34:
            r0 = 1
            return r0
        L36:
            r2 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49025LmD.DT4(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
    }

    public C49025LmD(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = interfaceC11380iw;
    }

    public final void A00(android.net.Uri uri, String str, String str2, String str3, boolean z) {
        String str4;
        Bundle A0b = AbstractC166987dD.A0b();
        String queryParameter = uri.getQueryParameter("user_ids");
        if (queryParameter == null) {
            queryParameter = "";
        }
        UserSession userSession = this.A01;
        if (AbstractC31171DnF.A1V(userSession, str2)) {
            str4 = str3;
        } else {
            str4 = userSession.userId;
        }
        A0b.putString("recs_from_friends_user_ids", queryParameter);
        A0b.putString("thread_name", str);
        A0b.putString("thread_user_id", str3);
        A0b.putString("sender_id", str2);
        if (z) {
            InterfaceC11380iw interfaceC11380iw = this.A02;
            String queryParameter2 = uri.getQueryParameter("user_ids");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            C31368DqX A01 = AbstractC31402Dr6.A01(userSession, queryParameter2, "direct_thread_recs_from_friends_message", interfaceC11380iw.getModuleName());
            Activity activity = this.A00;
            C14360o3.A0C(activity, MSV.A00(0));
            C31368DqX.A02(AbstractC31173DnH.A0P((FragmentActivity) activity, userSession), userSession, AbstractC31364DqT.A02(), A01);
        } else {
            AbstractC25228BEl.A1G(this.A00, A0b, userSession, ModalActivity.class, "recs_from_friends_receiver");
        }
        InterfaceC11380iw interfaceC11380iw2 = this.A02;
        L9S l9s = new L9S(interfaceC11380iw2, userSession);
        Long A0n = AbstractC25233BEq.A0n(str4);
        String moduleName = interfaceC11380iw2.getModuleName();
        C14360o3.A0B(moduleName, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(l9s.A00, "ig_recs_from_friends_xma_click_events");
        AbstractC31171DnF.A1C(A0f, "tap_card_stack");
        A0f.A9K("target_id", A0n);
        AbstractC31171DnF.A1D(A0f, moduleName);
        A0f.Cht();
    }
}
