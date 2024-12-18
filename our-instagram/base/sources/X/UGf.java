package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UGf extends C2UU {
    public final Activity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C63752uw A03;
    public final C69453Vnc A04;
    public final C42526Is5 A05;
    public final List A06;

    public UGf(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63752uw c63752uw, C69453Vnc c69453Vnc, C42526Is5 c42526Is5, List list) {
        AbstractC25233BEq.A0x(1, activity, interfaceC11380iw, c63752uw);
        C14360o3.A0B(userSession, 7);
        this.A00 = activity;
        this.A05 = c42526Is5;
        this.A06 = list;
        this.A01 = interfaceC11380iw;
        this.A03 = c63752uw;
        this.A04 = c69453Vnc;
        this.A02 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r12, int r13) {
        /*
            r11 = this;
            r10 = r12
            X.UJb r10 = (X.C66477UJb) r10
            r6 = 0
            X.C14360o3.A0B(r10, r6)
            java.util.List r0 = r11.A06
            r7 = r13
            java.lang.Object r2 = r0.get(r13)
            X.IHr r2 = (X.C41100IHr) r2
            com.instagram.user.model.User r9 = r2.A02
            if (r9 == 0) goto La4
            com.instagram.user.follow.FollowButton r5 = r10.A08
            r8 = 1
            r5.A0A = r8
            X.4yT r1 = r5.A0J
            com.instagram.common.session.UserSession r0 = r11.A02
            X.0iw r4 = r11.A01
            r1.A04(r4, r0, r9)
            boolean r3 = r9.A2A()
            r1 = 8
            android.view.View r0 = r10.A02
            if (r3 == 0) goto Laa
            r0.setVisibility(r6)
            r5.setVisibility(r1)
        L32:
            android.widget.TextView r3 = r10.A06
            boolean r0 = r9.isVerified()
            X.C85963sQ.A0B(r3, r0)
            android.widget.TextView r1 = r10.A04
            boolean r0 = r1 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L46
            r0 = r1
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            r0.A00 = r8
        L46:
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            java.lang.String r0 = r9.getFullName()
            if (r0 == 0) goto L6c
            int r0 = r0.length()
            if (r0 == 0) goto L6c
            java.lang.String r0 = r9.getFullName()
            r3.setText(r0)
            java.lang.CharSequence r0 = r1.getText()
            X.C14360o3.A07(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L6f
            r3 = r1
        L6c:
            X.AbstractC31173DnH.A1F(r3, r9)
        L6f:
            X.XFB r0 = r2.A00
            if (r0 == 0) goto La5
            X.UQn r0 = (X.C66635UQn) r0
            java.lang.String r3 = r0.A02
            int r2 = r0.A01
            int r0 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>(r3, r2, r0)
        L80:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r10.A07
            r0.setUrl(r1, r4)
            android.view.View r1 = r10.A00
            X.WMc r0 = new X.WMc
            r0.<init>(r13, r8, r11, r9)
            X.C0fQ.A00(r0, r1)
            android.widget.TextView r0 = r10.A03
            X.WMh r6 = new X.WMh
            r6.<init>(r7, r8, r9, r10, r11)
            X.C0fQ.A00(r6, r0)
            android.widget.TextView r0 = r10.A05
            r8 = 2
            X.WMh r6 = new X.WMh
            r6.<init>(r7, r8, r9, r10, r11)
            X.C0fQ.A00(r6, r0)
        La4:
            return
        La5:
            com.instagram.common.typedurl.ImageUrl r1 = r9.Bhu()
            goto L80
        Laa:
            r0.setVisibility(r1)
            r5.setVisibility(r6)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UGf.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Activity activity = this.A00;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.suggested_entity_card, viewGroup, false);
        Resources resources = activity.getResources();
        C14360o3.A07(resources);
        int A0A = AbstractC13880nE.A0A(activity);
        Integer num = C05F.A00;
        int A00 = AbstractC123565iV.A00(resources, num, A0A);
        inflate.setLayoutParams(new C3OP(A00, -1));
        C66477UJb c66477UJb = new C66477UJb(inflate);
        AbstractC126205nH.A00(c66477UJb.A00, c66477UJb.A07, null, c66477UJb.A04, num, false);
        c66477UJb.A01.setVisibility(8);
        TextView textView = c66477UJb.A03;
        Resources A0M = AbstractC25228BEl.A0M(textView);
        textView.getLayoutParams().width = ((A00 - A0M.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material)) - (A0M.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2)) / 2;
        c66477UJb.A05.getLayoutParams().width = textView.getLayoutParams().width;
        return c66477UJb;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(173874936);
        int size = this.A06.size();
        C0f9.A0A(1763839783, A03);
        return size;
    }
}
