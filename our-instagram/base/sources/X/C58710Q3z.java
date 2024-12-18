package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.Q3z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58710Q3z extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C58710Q3z(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Long l;
        int i = this.A00;
        Context context = (Context) this.A01;
        if (i != 0) {
            if (context != null) {
                C63397SjR c63397SjR = new C63397SjR(context, (UserSession) this.A02, C2Fb.A49, this.A03, false);
                c63397SjR.A0S = this.A04;
                c63397SjR.A0A();
                return;
            }
            return;
        }
        UserSession userSession = (UserSession) this.A02;
        QER qer = new QER(context, userSession, "LITE_CHECKOUT");
        String str = this.A04;
        String str2 = this.A03;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(qer.A0C(), "user_click_shopslitecheckouteligibility_atomic");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("checkout_flow", "checkout_init");
            c0Zx.A06("external_session_id", qer.A02);
            c0Zx.A06("navigation_chain", qer.A01);
            if (str2 != null) {
                l = AbstractC25228BEl.A13(str2);
            } else {
                l = null;
            }
            c0Zx.A05("ad_id", l);
            c0Zx.A06("iaw_session_id", str);
            AbstractC63399SjU.A08(c0Zx, qer);
            A0f.AAP(AbstractC58347Ptn.A00(9, 10, 87), "");
            AbstractC58321PtD.A1E(C2O5.A0G, A0f);
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A06("target_name", "lite_checkout");
            c0Zx2.A06("view_name", "lite_checkout");
            A0f.AAQ(c0Zx2, "event_payload");
            A0f.AAQ(c0Zx, "custom_fields");
            A0f.Cht();
        }
        C35205Ffx c35205Ffx = new C35205Ffx();
        c35205Ffx.A00 = EnumC68205VFx.A06;
        c35205Ffx.A02 = U6G.A05;
        C65981Txa A03 = c35205Ffx.A03();
        IgBloksScreenConfig igBloksScreenConfig = new C34397FEn(userSession).A00;
        igBloksScreenConfig.A0R = "com.bloks.www.bloks.commerce.lite.checkout.disclaimer";
        igBloksScreenConfig.A0C = A03;
        C66277U6x.A02("com.bloks.www.bloks.commerce.lite.checkout.disclaimer", AbstractC06930Yk.A02(AbstractC25230BEn.A1b(AbstractC111324zv.A00(266), AbstractC31175DnJ.A0d(AbstractC06930Yk.A02(AbstractC25229BEm.A1b("ad_id", str2, AbstractC166987dD.A1L("iaw_session_id", str)))))), Collections.emptyMap()).A06(context, igBloksScreenConfig);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color;
        if (this.A00 != 0) {
            C14360o3.A0B(textPaint, 0);
            super.updateDrawState(textPaint);
            color = textPaint.linkColor;
        } else {
            C14360o3.A0B(textPaint, 0);
            Context context = (Context) this.A01;
            if (context != null) {
                color = context.getColor(R.color.igds_link);
            }
            textPaint.setUnderlineText(false);
        }
        textPaint.setColor(color);
        textPaint.setUnderlineText(false);
    }
}
