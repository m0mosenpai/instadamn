package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;

/* renamed from: X.V2o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67924V2o extends AbstractC65632xz {
    public Context A00;
    public V1U A01;

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
        LinearLayout linearLayout;
        WNV wnv;
        String A00;
        int A03 = C0f9.A03(-559855396);
        C69086Vhc c69086Vhc = (C69086Vhc) AbstractC31172DnG.A0x(view);
        C68707Vaj c68707Vaj = (C68707Vaj) obj2;
        AnalyticsEventEntry analyticsEventEntry = (AnalyticsEventEntry) obj;
        V1U v1u = this.A01;
        TextView textView = c69086Vhc.A01;
        String str = analyticsEventEntry.A02;
        String str2 = str;
        String str3 = "null";
        if (str == null) {
            str2 = "null";
        }
        textView.setText(str2);
        TextView textView2 = c69086Vhc.A02;
        Object obj3 = analyticsEventEntry.A01;
        if (obj3 != null) {
            str3 = String.valueOf(obj3);
        }
        textView2.setText(str3);
        AnalyticsEventDebugInfo analyticsEventDebugInfo = analyticsEventEntry.A00;
        if (analyticsEventDebugInfo != null) {
            int i2 = VYZ.A00;
            textView.setTextColor(i2);
            textView2.setTextColor(i2);
            analyticsEventDebugInfo.A00 = str;
            int size = analyticsEventDebugInfo.A01.size();
            MSX.A15(textView2, size);
            if (size == 1) {
                A00 = " item";
            } else {
                A00 = AbstractC111324zv.A00(559);
            }
            textView2.append(A00);
            linearLayout = c69086Vhc.A00;
            wnv = new WNV(31, analyticsEventDebugInfo, v1u);
        } else {
            textView2.setSingleLine(!c68707Vaj.A00);
            linearLayout = c69086Vhc.A00;
            wnv = new WNV(32, analyticsEventEntry, v1u);
        }
        C0fQ.A00(wnv, linearLayout);
        C0f9.A0A(-1943021279, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(163649246);
        Context context = this.A00;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        C69086Vhc c69086Vhc = new C69086Vhc(context, linearLayout);
        View view = new View(context);
        AbstractC31174DnI.A1C(view, context.getColor(R.color.darker_gray));
        view.setMinimumHeight(1);
        linearLayout.addView(c69086Vhc.A01);
        linearLayout.addView(c69086Vhc.A02);
        linearLayout.addView(view);
        linearLayout.setTag(c69086Vhc);
        C0f9.A0A(-1910366250, A03);
        return linearLayout;
    }
}
