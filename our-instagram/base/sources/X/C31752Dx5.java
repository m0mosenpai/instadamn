package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.RangeIntf;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Dx5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31752Dx5 extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C31752Dx5(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.Ef2, X.Fby] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                FI6 fi6 = (FI6) this.A02;
                Entity B2H = ((RangeIntf) this.A03).B2H();
                B2H.getClass();
                String url = B2H.getUrl();
                ENO eno = fi6.A00;
                Context requireContext = eno.requireContext();
                UserSession userSession = eno.A00;
                C14360o3.A0B(userSession, 1);
                AbstractC35261Fgv.A07(requireContext, userSession, url, null);
                return;
            case 1:
                C40964ICl c40964ICl = (C40964ICl) this.A02;
                LinkAction BNM = ((TextWithEntitiesIntf) this.A03).BNM();
                if (BNM == null || BNM.ordinal() != 1) {
                    return;
                }
                C38464Gvl c38464Gvl = c40964ICl.A00;
                Context context = c38464Gvl.A00;
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                HashMap A1G3 = AbstractC166987dD.A1G();
                new BitSet(0);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(c38464Gvl.A02);
                A0C.A0R = "com.bloks.www.ig.shopping.product_tagging_feedback.bottomsheet";
                C66277U6x A0H = AbstractC31179DnN.A0H("com.bloks.www.ig.shopping.product_tagging_feedback.bottomsheet", A1G, A1G2);
                A0H.A03 = null;
                A0H.A02 = null;
                A0H.A04 = null;
                A0H.A08(A1G3);
                A0H.A05(context, A0C);
                return;
            case 2:
                UserSession userSession2 = (UserSession) this.A03;
                Fragment fragment = (Fragment) this.A02;
                C35241Fga.A02(EnumC33507Erg.EDIT_USERNAME, userSession2, "reminder_manage_settings");
                C28361Yx c28361Yx = C28361Yx.A02;
                if (c28361Yx != null) {
                    C14360o3.A0B(userSession2, 0);
                    ?? abstractC35025Fby = new AbstractC35025Fby(fragment, userSession2);
                    abstractC35025Fby.A00 = 0;
                    c28361Yx.A00 = abstractC35025Fby;
                    abstractC35025Fby.A04("USERNAME_SETTINGS");
                    return;
                }
                AbstractC31171DnF.A0v();
                throw C00O.createAndThrow();
            case 3:
                FVP.A01((Fragment) this.A02, (UserSession) this.A03, C05F.A0Y);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        switch (this.A00) {
            case 0:
                textPaint.setUnderlineText(false);
                z = true;
                textPaint.setFakeBoldText(z);
                textPaint.setColor(this.A01);
                return;
            case 1:
                z = false;
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(z);
                textPaint.setColor(this.A01);
                return;
            case 2:
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(this.A01);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
