package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes7.dex */
public final class HFW extends AbstractC65632xz {
    public final Context A00;
    public final ReelDashboardFragment A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public HFW(Context context, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = reelDashboardFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(396029252);
        C39694HjQ c39694HjQ = (C39694HjQ) AbstractC31172DnG.A0x(view);
        Context context = this.A00;
        ReelDashboardFragment reelDashboardFragment = this.A01;
        AbstractC167007dF.A1D(c39694HjQ, 0, reelDashboardFragment);
        C14360o3.A0A(context);
        C124385ju c124385ju = new C124385ju(context, 1.0f, R.color.grey_2, 48);
        c124385ju.A00(0, 0, 0, 0);
        TextView textView = c39694HjQ.A01;
        textView.setBackground(c124385ju);
        C0fQ.A00(new ViewOnClickListenerC37847Gl1(reelDashboardFragment, 26), textView);
        C0f9.A0A(-440404546, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.HjQ, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1377914404);
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.reel_dashboard_group_message_row, false);
        C14360o3.A0B(A0C, 1);
        ?? obj = new Object();
        obj.A00 = A0C;
        TextView A0N = AbstractC167007dF.A0N(A0C, R.id.group_message_title);
        obj.A01 = A0N;
        Context context = A0N.getContext();
        Drawable drawable = context.getDrawable(R.drawable.instagram_chevron_right_pano_outline_16);
        C14360o3.A0A(drawable);
        drawable.setColorFilter(AbstractC31174DnI.A01(context), PorterDuff.Mode.SRC_IN);
        obj.A01.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.instagram_chevron_right_pano_outline_16, 0);
        A0C.setTag(obj);
        C0f9.A0A(-1290543796, A03);
        return A0C;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(255624641);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        C0f9.A0A(546391658, A03);
        return view;
    }
}
