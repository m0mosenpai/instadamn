package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.model.BoostGuidanceItemResponse;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.Dzs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31886Dzs extends C2UU {
    public List A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C31886Dzs(Context context, FragmentActivity fragmentActivity, BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 7);
        this.A08 = z;
        this.A03 = businessFlowAnalyticsLogger;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = context;
        this.A02 = fragmentActivity;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A00 = C16930sl.A00;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        E2E e2e = (E2E) c3oo;
        if (i < this.A00.size()) {
            BoostGuidanceItemResponse boostGuidanceItemResponse = (BoostGuidanceItemResponse) this.A00.get(i);
            String str = boostGuidanceItemResponse.A01;
            View view = e2e.A00;
            Context context = view.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.boost_guidance_preview_height);
            e2e.A02.setUrl(this.A05, new SimpleImageUrl(str, context.getResources().getDimensionPixelSize(R.dimen.boost_guidance_preview_width), dimensionPixelSize), this.A04);
            ViewOnClickListenerC35683FpI.A00(view, 9, boostGuidanceItemResponse, this);
            view.setVisibility(0);
            e2e.A01.setText(boostGuidanceItemResponse.A02);
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        boolean z = this.A08;
        int i2 = R.layout.boost_guidance_preview_item;
        if (z) {
            i2 = R.layout.boost_guidance_list_preview_item;
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new E2E(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, i2, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-333334979);
        int size = this.A00.size();
        C0f9.A0A(-620012711, A03);
        return size;
    }
}
