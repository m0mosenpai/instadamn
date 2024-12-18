package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G3R implements InterfaceC37170GZh {
    public DirectVisualMessageActionLogPriorityFragment A00;
    public final Context A01;
    public final UserSession A02;
    public final C2DS A03;
    public final DirectThreadKey A04;
    public final String A05;

    public G3R(Context context, UserSession userSession, DirectThreadKey directThreadKey, String str) {
        AbstractC167007dF.A1F(userSession, 2, directThreadKey);
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A04 = directThreadKey;
        this.A03 = C2JD.A00(userSession);
    }

    @Override // X.InterfaceC37170GZh
    public final void cleanup() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x007b, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    @Override // X.InterfaceC37170GZh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11R EnM() {
        /*
            r14 = this;
            com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment r0 = r14.A00
            java.lang.String r6 = "Required value was null."
            if (r0 == 0) goto Laa
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.spinner
            if (r0 == 0) goto La0
            X.AbstractC31171DnF.A1M(r0)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            X.2DS r3 = r14.A03
            com.instagram.model.direct.DirectThreadKey r2 = r14.A04
            java.lang.String r0 = r14.A05
            X.3nh r5 = r3.BSh(r2, r0)
            X.3kb r4 = r3.B3U(r2)
            r3 = 0
            if (r5 == 0) goto L8e
            X.4hT r2 = r5.A0e
            if (r2 == 0) goto L8c
            X.4hc r0 = r2.A03
            if (r0 == 0) goto L8c
            X.4hb r0 = r0.A02
        L2c:
            X.4hb r10 = X.EnumC101664hb.A08
            if (r0 == r10) goto L7b
            if (r2 == 0) goto L71
            X.4hc r0 = r2.A03
            if (r0 == 0) goto L71
            X.4hb r0 = r0.A02
        L38:
            X.4hb r10 = X.EnumC101664hb.A07
            if (r0 == r10) goto L7b
            if (r2 == 0) goto L73
            int r0 = r2.A00
            if (r0 <= 0) goto L73
            X.4hb r10 = X.EnumC101664hb.A06
        L44:
            X.4hc r0 = r2.A03
            if (r0 == 0) goto L90
            long r12 = r0.A01
        L4a:
            if (r4 == 0) goto L93
            java.util.List r0 = r4.BSH()
            java.util.Iterator r2 = r0.iterator()
        L54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L93
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A15(r2)
            java.lang.String r11 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r9 = r0.Bhu()
            android.content.Context r8 = r14.A01
            X.FLz r7 = new X.FLz
            r7.<init>(r8, r9, r10, r11, r12)
            r1.add(r7)
            goto L54
        L71:
            r0 = 0
            goto L38
        L73:
            boolean r0 = r5.A1P()
            if (r0 == 0) goto L7e
            X.4hb r10 = X.EnumC101664hb.A04
        L7b:
            if (r2 == 0) goto L90
            goto L44
        L7e:
            if (r2 == 0) goto L89
            X.4hc r0 = r2.A03
            if (r0 == 0) goto L89
            X.4hb r10 = r0.A02
            if (r10 == 0) goto L89
            goto L44
        L89:
            X.4hb r10 = X.EnumC101664hb.A09
            goto L7b
        L8c:
            r0 = 0
            goto L2c
        L8e:
            X.4hb r10 = X.EnumC101664hb.A09
        L90:
            r12 = 0
            goto L4a
        L93:
            com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment r0 = r14.A00
            if (r0 == 0) goto L9b
            r0.A00(r1)
            return r3
        L9b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r6)
            throw r0
        La0:
            java.lang.String r0 = "spinner"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Laa:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G3R.EnM():X.11R");
    }

    @Override // X.InterfaceC37170GZh
    public final void ET9(DirectVisualMessageActionLogPriorityFragment directVisualMessageActionLogPriorityFragment) {
        this.A00 = directVisualMessageActionLogPriorityFragment;
    }
}
