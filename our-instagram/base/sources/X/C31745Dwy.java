package X;

import android.app.Dialog;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.HashMap;

/* renamed from: X.Dwy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31745Dwy extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public C31745Dwy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        switch (this.A00) {
            case 0:
                C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03(MSV.A00(50)));
                return;
            case 1:
                C33210Eky c33210Eky = (C33210Eky) this.A01;
                A0y = AbstractC25228BEl.A0y(c33210Eky.requireActivity(), AbstractC166987dD.A0r(c33210Eky.A03), C2Fb.A49, MSV.A00(1238));
                A0y.A0S = c33210Eky.A02;
                break;
            case 2:
                C14360o3.A0B(view, 0);
                AbstractC25225BEi.A1U(this.A01, view);
                return;
            case 3:
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                C32275EJk c32275EJk = (C32275EJk) this.A01;
                c35133Fea.A02(c32275EJk.requireContext(), AbstractC166987dD.A0o(c32275EJk.A0B), new SimpleWebViewConfig((String) null, (String) null, true, false, false, false, false, true, false, false, true, false, false, false, c32275EJk.getString(2131956653), AbstractC63260SgI.A01(c32275EJk.requireContext(), "https://help.instagram.com/227486307449481")));
                return;
            case 4:
                return;
            case 5:
                FQM fqm = (FQM) this.A01;
                A0y = AbstractC25228BEl.A0y(fqm.A01, fqm.A04, C2Fb.A2R, "https://help.instagram.com/3256192917954293");
                break;
            case 6:
                C55626OnB c55626OnB = (C55626OnB) this.A01;
                Dialog dialog = c55626OnB.A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                C34395FEl c34395FEl = c55626OnB.A05;
                UserSession userSession = c55626OnB.A06;
                AbstractC59962oe abstractC59962oe = c55626OnB.A04;
                String A00 = AbstractC111324zv.A00(2508);
                C913045j c913045j = C913045j.A00;
                C54s c54s = new C54s(c913045j);
                c54s.A0F("entrypoint", A00);
                c54s.A0F("account_id", userSession.userId);
                c54s.A0F("newly_linked", "false");
                c54s.A0F("platform", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                C54s c54s2 = new C54s(c913045j);
                c54s2.A0F("entrypoint", A00);
                c54s2.A0F("deeplink_destination", "cross_posting_skip_profiles_screen");
                c54s2.A0C(c54s, "deeplink_params");
                HashMap A0f = AbstractC31179DnN.A0f(c54s2, c913045j);
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                if (c34395FEl.A00) {
                    return;
                }
                c34395FEl.A00 = true;
                AbstractC34209F7h.A00().A00(requireActivity, requireActivity.getWindow(), true, true);
                AbstractC192798gL A05 = C192108fB.A05(userSession, "com.bloks.www.fxcal.settings.async", A0f);
                A05.A00(new C32385EOl(abstractC59962oe, c34395FEl, userSession));
                abstractC59962oe.scheduleAndGetLoaderId(A05);
                return;
            default:
                C34568FLc c34568FLc = ((EID) this.A01).A00;
                if (c34568FLc != null) {
                    ReelDashboardFragment reelDashboardFragment = c34568FLc.A02;
                    C41181vS c41181vS = c34568FLc.A01;
                    C189478aR c189478aR = c34568FLc.A00;
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM != null && c38321qM.A38() != null) {
                        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(reelDashboardFragment.A05, "reel_viewer_dashboard_fb_viewers_bottom_sheet_story_settings_click");
                        AbstractC31171DnF.A1D(A0f2, reelDashboardFragment.getModuleName());
                        AbstractC25236BEt.A0r(A0f2, c38321qM.A38());
                        A0f2.Cht();
                    }
                    reelDashboardFragment.A0E = true;
                    c189478aR.A0L(null);
                    return;
                }
                return;
        }
        A0y.A0A();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        Context context;
        int A09;
        int color;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(textPaint, 0);
                context = (Context) this.A01;
                A09 = AbstractC53242c7.A06(context);
                color = context.getColor(A09);
                textPaint.setColor(color);
                return;
            case 1:
                C14360o3.A0B(textPaint, 0);
                context = AbstractC31172DnG.A07(this.A01);
                textPaint.setUnderlineText(false);
                A09 = AbstractC53242c7.A06(context);
                color = context.getColor(A09);
                textPaint.setColor(color);
                return;
            case 2:
                z = false;
                C14360o3.A0B(textPaint, 0);
                textPaint.setUnderlineText(z);
                return;
            case 3:
                z = false;
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(z);
                return;
            case 4:
                C14360o3.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                context = AbstractC31172DnG.A06(this.A01);
                if (context != null) {
                    A09 = AbstractC53242c7.A09(context);
                    color = context.getColor(A09);
                    textPaint.setColor(color);
                    return;
                }
                throw AbstractC166987dD.A14("Context is null");
            case 5:
                AbstractC25229BEm.A13(textPaint);
                context = ((FQM) this.A01).A02;
                A09 = AbstractC53242c7.A06(context);
                color = context.getColor(A09);
                textPaint.setColor(color);
                return;
            case 6:
                AbstractC25229BEm.A13(textPaint);
                AbstractC59962oe abstractC59962oe = ((C55626OnB) this.A01).A04;
                context = abstractC59962oe.requireContext();
                A09 = AbstractC53242c7.A06(abstractC59962oe.requireContext());
                color = context.getColor(A09);
                textPaint.setColor(color);
                return;
            default:
                color = textPaint.linkColor;
                textPaint.setColor(color);
                return;
        }
    }
}
