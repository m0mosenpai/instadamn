package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.DiscoverableThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;

/* renamed from: X.Dv3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31637Dv3 extends AbstractC66422zJ {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC132405yL A03;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_row_layout, false);
        UserSession userSession = this.A02;
        return new C43767JXg(A0R, null, C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36328332333235667L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        int A09;
        String str2;
        Object obj;
        C32083E8h c32083E8h = (C32083E8h) interfaceC66482zP;
        C43767JXg c43767JXg = (C43767JXg) c3oo;
        ?? A1R = AbstractC167007dF.A1R(0, c32083E8h, c43767JXg);
        DirectShareTarget directShareTarget = c32083E8h.A01;
        boolean z = directShareTarget.A0U;
        String A14 = AbstractC31172DnG.A14(directShareTarget);
        IgTextView igTextView = c43767JXg.A0A;
        igTextView.setText(A14);
        AbstractC31177DnL.A0z(igTextView, igTextView.getContext());
        igTextView.setTypeface(null, z ? 1 : 0);
        IgTextView igTextView2 = c43767JXg.A09;
        if (directShareTarget.A0Q.size() > 0) {
            PendingRecipient A0R = AbstractC31178DnM.A0R(directShareTarget, 0);
            Context context = this.A00;
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(context.getResources(), A0R.A0C, 2131959582));
            str = A0H;
            if (A0R.A0b) {
                int A08 = AbstractC001900j.A08(A0H, A0R.A0C, 0, false);
                str = A0H;
                if (A08 != -1) {
                    C85963sQ.A04(context, A0H, AbstractC001900j.A08(A0H, A0R.A0C, 0, false) + AbstractC167007dF.A0A(A0R.A0C));
                    str = A0H;
                }
            }
        } else {
            str = directShareTarget.A05();
        }
        igTextView2.setText(str);
        Context context2 = igTextView2.getContext();
        if (z) {
            A09 = AbstractC53242c7.A07(context2);
        } else {
            A09 = AbstractC53242c7.A09(context2);
        }
        AbstractC166987dD.A1O(context2, igTextView2, A09);
        igTextView2.setTypeface(null, z ? 1 : 0);
        C31447Drr c31447Drr = c43767JXg.A0O;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
        if (creatorBroadcastThreadInfo != null) {
            ImageUrl imageUrl = creatorBroadcastThreadInfo.A02;
            if (imageUrl != null) {
                c31447Drr.A02(null, this.A01, imageUrl);
            }
        } else {
            DiscoverableThreadInfo discoverableThreadInfo = directShareTarget.A06;
            if (discoverableThreadInfo != null && (str2 = discoverableThreadInfo.A01) != null) {
                C3AY A00 = AbstractC81683kd.A00(null, C17060sy.A01.A01(this.A02), str2, null, AbstractC31172DnG.A18(directShareTarget));
                Object obj2 = A00.A00;
                if (AbstractC31176DnK.A00(directShareTarget) > A1R) {
                    obj = A00.A01;
                } else {
                    obj = null;
                }
                InterfaceC11380iw interfaceC11380iw = this.A01;
                C14360o3.A07(obj2);
                c31447Drr.A03(null, interfaceC11380iw, (ImageUrl) obj2, (ImageUrl) obj);
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c31447Drr.A04;
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        AbstractC31448Drs.A00(c43767JXg.A0K, c43767JXg.A0R, JS4.A00(this.A00, z, false, false, false, false));
        String A082 = directShareTarget.A08();
        if (A082 == null) {
            A082 = AbstractC31173DnH.A0o(directShareTarget);
        }
        ArrayList A0B = directShareTarget.A0B();
        int i = c32083E8h.A00;
        c43767JXg.getAbsoluteAdapterPosition();
        C31446Drq c31446Drq = new C31446Drq(i, A082, null, A0B);
        ViewGroup viewGroup = c43767JXg.A07;
        C0fQ.A00(new ViewOnClickListenerC35610Fo1(6, c31446Drq, c32083E8h, this, directShareTarget), viewGroup);
        viewGroup.setOnLongClickListener(new ViewOnLongClickListenerC35708Fpi(this, c31446Drq, c32083E8h, c43767JXg, directShareTarget, A14));
        this.A03.Dqk(AbstractC31171DnF.A06(c43767JXg), c31446Drq, directShareTarget, "inbox_channel_invitation", 39, i, i, i, false);
    }

    public C31637Dv3(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = interfaceC132405yL;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32083E8h.class;
    }
}
