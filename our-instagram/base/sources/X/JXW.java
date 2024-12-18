package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JXW extends AbstractC66412zI {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final MRS A03;
    public final InterfaceC50464MPs A04;
    public final C69433Ad A05;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate;
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322516949543210L)) {
            inflate = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.direct_inbox_row_layout, 0, false, true);
        } else {
            inflate = layoutInflater.inflate(R.layout.direct_inbox_row_layout, viewGroup, false);
            C14360o3.A07(inflate);
        }
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C69433Ad c69433Ad = this.A05;
        C14360o3.A0B(userSession, 0);
        return new C43767JXg(inflate, c69433Ad, C18U.A06(c06090Tz, userSession, 36328332333235667L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0533, code lost:
    
        r0 = com.facebook.R.drawable.instagram_call_filled_12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0531, code lost:
    
        if (r9.A01 != false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0629, code lost:
    
        if (r0 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0146, code lost:
    
        if (X.C14360o3.A0K(r0.Bhu(), r1) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        if (X.AbstractC73003Pb.A02(r5, r0) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0157, code lost:
    
        if (X.C18U.A06(r11, r5, 36319480405827030L) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0159, code lost:
    
        r13.setVisibility(0);
        X.AbstractC73003Pb.A00(X.AbstractC166997dE.A0L(r13), r13);
        X.AbstractC73003Pb.A01(r13.getDrawable());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02be, code lost:
    
        if (r8 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c0, code lost:
    
        r0 = com.facebook.R.drawable.instagram_video_chat_filled_12;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f5 A[ADDED_TO_REGION] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r38, X.C3OO r39) {
        /*
            Method dump skipped, instructions count: 1751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JXW.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return JRL.class;
    }

    public JXW(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MRS mrs, InterfaceC50464MPs interfaceC50464MPs, C69433Ad c69433Ad) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = interfaceC11380iw;
        this.A03 = mrs;
        this.A04 = interfaceC50464MPs;
        this.A05 = c69433Ad;
    }
}
