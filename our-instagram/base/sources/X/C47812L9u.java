package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;
import java.util.Map;

/* renamed from: X.L9u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47812L9u {
    public C120115cA A00;
    public ImageView A01;
    public AnonymousClass693 A02;
    public Map A03;
    public final Context A04;
    public final UserSession A05;
    public final RewriteTextBubbleViewPager A06;
    public final View A07;

    public C47812L9u(Context context, View view, UserSession userSession, RewriteTextBubbleViewPager rewriteTextBubbleViewPager) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = rewriteTextBubbleViewPager;
        this.A07 = view;
        this.A04 = context;
        this.A00 = AbstractC120095c8.A00(userSession);
        this.A03 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(context.getString(2131972349), "REPHRASE"), AbstractC166987dD.A1L(context.getString(2131965987), "FUNNY"), AbstractC166987dD.A1L(context.getString(2131952305), "EMOJI"), AbstractC166987dD.A1L("Add emojis", "EMOJI"), AbstractC166987dD.A1L(context.getString(2131952350), "PUNS"), AbstractC166987dD.A1L(context.getString(2131965991), "SARCASTIC"), AbstractC166987dD.A1L(context.getString(2131965992), "SHORTER"), AbstractC166987dD.A1L("Shorten", "SHORTER"), AbstractC166987dD.A1L(context.getString(2131962657), "PROOFREAD"), AbstractC166987dD.A1L(context.getString(2131965993), "SUPPORTIVE"));
        this.A01 = AbstractC31173DnH.A0I(view, R.id.loading_animation);
        AnonymousClass693 A00 = C68U.A00(view.getContext(), R.raw.gen_ai_loader_write_with_ai_signals_3s_igd);
        this.A02 = A00;
        ImageView imageView = this.A01;
        if (imageView != null) {
            imageView.setImageDrawable(A00);
        }
    }

    public final void A02(String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C0CA A0T;
        C14360o3.A0B(str2, 1);
        UserSession userSession = this.A05;
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36886398908891860L);
        String A042 = C18U.A04(c06090Tz, userSession, 36886398908826323L);
        if (str != null && str.length() != 0 && A042.length() != 0 && A04.length() != 0 && str2.length() != 0) {
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            C120115cA c120115cA = this.A00;
            if (z) {
                c120115cA.A02("custom");
                A0T = AbstractC25227BEk.A0T(c04060Jx, str2, "custom_modifier");
            } else {
                c120115cA.A02(str2);
                A0T = AbstractC25227BEk.A0T(c04060Jx, this.A03.get(str2), "modifier_type");
            }
            C0CA A02 = c04060Jx.A02();
            A02.A0E(A0T, "write_with_ai");
            C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, "IGD__THREAD__WRITE_WITH_AI", "entrypoint");
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("metagen_key", A042);
            A0b.A04("agent_id", A04);
            A0b.A04("content", str);
            A0b.A04("role", "USER");
            C2JO c2jo = A0b.A00;
            AbstractC31173DnH.A1M(A02, c2jo, "plugin_request_options");
            AbstractC31173DnH.A1M(A0T2, c2jo, "runtime_params");
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGWriteWithAIQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), Qf3.class, false, null, 0, null, "xfb_genai_platform_agent_sync_chat", AbstractC166987dD.A1E());
            A00();
            A01.ATW(new C48147LSw(this, interfaceC16820sZ, interfaceC16660sJ, 5), new LT7(this, str2, str, interfaceC16820sZ, interfaceC16660sJ), pandoGraphQLRequest, new ExecutorC14110nb(1316683298));
        }
    }

    public final void A00() {
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager = this.A06;
        if (rewriteTextBubbleViewPager != null) {
            AbstractC167007dF.A0w(this.A01);
            if (rewriteTextBubbleViewPager instanceof View) {
                rewriteTextBubbleViewPager.setVisibility(8);
            }
            AnonymousClass693 anonymousClass693 = this.A02;
            if (anonymousClass693 != null) {
                anonymousClass693.EH1();
                anonymousClass693.E4S();
            }
        }
    }

    public final void A01() {
        RewriteTextBubbleViewPager rewriteTextBubbleViewPager = this.A06;
        if (rewriteTextBubbleViewPager != null) {
            AnonymousClass693 anonymousClass693 = this.A02;
            if (anonymousClass693 != null) {
                anonymousClass693.stop();
            }
            AbstractC167007dF.A0x(this.A01);
            if (rewriteTextBubbleViewPager instanceof View) {
                rewriteTextBubbleViewPager.setVisibility(0);
            }
        }
    }
}
