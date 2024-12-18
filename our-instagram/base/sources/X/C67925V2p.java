package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* renamed from: X.V2p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67925V2p extends AbstractC65632xz {
    public Context A00;
    public XA0 A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1608820144);
        C68932VeW c68932VeW = (C68932VeW) AbstractC31172DnG.A0x(view);
        AnalyticsEventDebugInfo analyticsEventDebugInfo = (AnalyticsEventDebugInfo) obj;
        XA0 xa0 = this.A01;
        AbstractC167027dH.A12(c68932VeW, analyticsEventDebugInfo, xa0);
        TextView textView = c68932VeW.A01;
        C14360o3.A0A(textView);
        textView.setText(analyticsEventDebugInfo.A00);
        LinearLayout linearLayout = c68932VeW.A00;
        C14360o3.A0A(linearLayout);
        WNV.A00(linearLayout, 33, analyticsEventDebugInfo, xa0);
        C0f9.A0A(196373218, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.VeW] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2102072552);
        Context context = this.A00;
        C14360o3.A0B(context, 0);
        ?? obj = new Object();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        obj.A01 = textView;
        textView.setTextSize(12.0f);
        TextView textView2 = obj.A01;
        C14360o3.A0A(textView2);
        textView2.setPadding(50, 50, 50, 50);
        View view = new View(context);
        AbstractC31174DnI.A1C(view, context.getColor(R.color.darker_gray));
        view.setMinimumHeight(1);
        linearLayout.addView(obj.A01);
        linearLayout.addView(view);
        linearLayout.setTag(obj);
        obj.A00 = linearLayout;
        C0f9.A0A(-2125326138, A03);
        return linearLayout;
    }
}
