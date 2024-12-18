package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.adapter.CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter;

/* renamed from: X.IKa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41161IKa {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC70653Fc A02;
    public final C1I4 A03;
    public final UserSession A04;
    public final CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter A05;
    public final C38336GtW A06;
    public final Gt6 A07;
    public final String A08;
    public final C42408IqB A09;
    public final J2X A0A;

    public C41161IKa(Context context, FragmentActivity fragmentActivity, AbstractC70653Fc abstractC70653Fc, C1I4 c1i4, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC678133v interfaceC678133v, Gt6 gt6, String str, String str2, int i, int i2) {
        AbstractC167007dF.A1F(str, 1, userSession);
        C14360o3.A0B(gt6, 6);
        AbstractC25232BEp.A1P(c1i4, abstractC70653Fc);
        this.A08 = str;
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A07 = gt6;
        this.A03 = c1i4;
        this.A02 = abstractC70653Fc;
        J2X j2x = new J2X(this, str2);
        this.A0A = j2x;
        O9V o9v = new O9V("signals_playground", null);
        Resources resources = context.getResources();
        this.A06 = new C38336GtW(userSession, j2x, o9v, resources != null ? Integer.valueOf(AbstractC166997dE.A05(resources)) : null, Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_loading_shimmer_dark)), i, i2, false, false, false, false);
        C42408IqB c42408IqB = new C42408IqB(this);
        this.A09 = c42408IqB;
        this.A05 = new CreatorInspirationSignalsPlaygroundAudioRecommendationsAdapter(i, i2, interfaceC678133v, interfaceC11380iw, c42408IqB);
    }
}
