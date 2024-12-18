package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.DxD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31760DxD extends ClickableSpan {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C72q A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        C14360o3.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        Context context = this.A00;
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A06(context));
    }

    public C31760DxD(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C72q c72q, User user, String str) {
        this.A03 = c72q;
        this.A04 = user;
        this.A05 = str;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C72q c72q = this.A03;
        String fbidV2 = this.A04.A03.getFbidV2();
        if (fbidV2 != null) {
            Context requireContext = c72q.A07.requireContext();
            HashMap A1G = AbstractC166987dD.A1G();
            HashMap A1G2 = AbstractC166987dD.A1G();
            HashMap A1G3 = AbstractC166987dD.A1G();
            BitSet A0j = AbstractC31171DnF.A0j(1);
            A1G.put("profile_id", fbidV2);
            A0j.set(0);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c72q.A03);
            if (A0j.nextClearBit(0) >= 1) {
                C66277U6x A02 = C66277U6x.A02("com.bloks.www.nme.ig_profile.verified_label_bottom_sheet", AbstractC191768eY.A01(A1G), A1G2);
                AbstractC31178DnM.A1M(A02, 719983200);
                A02.A03 = null;
                A02.A02 = null;
                A02.A04 = null;
                A02.A08(A1G3);
                A02.A05(requireContext, A0C);
            } else {
                throw AbstractC31173DnH.A0f();
            }
        }
        String str = this.A05;
        AbstractC34828FWj.A00(this.A01, this.A02, "ig_profile", str);
    }
}
