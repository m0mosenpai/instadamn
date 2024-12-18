package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V3N extends AbstractC168697g3 {
    public C69237Vk5 A00;
    public final Context A01;
    public final C68823Vce A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.VJE, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = C0f9.A03(-1899120828);
        this.A00 = (C69237Vk5) obj;
        View view2 = view;
        if (view == null) {
            View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A01), viewGroup, R.layout.location_page_info_page_stacked_title_row);
            TextView textView = (TextView) A0A.requireViewById(R.id.super_title);
            TextView A06 = AbstractC31180DnO.A06(A0A);
            ?? obj3 = new Object();
            obj3.A00 = textView;
            obj3.A01 = A06;
            A0A.setTag(obj3);
            view2 = A0A;
        }
        Context context = this.A01;
        VJE vje = (VJE) AbstractC31172DnG.A0x(view2);
        C69237Vk5 c69237Vk5 = this.A00;
        C68823Vce c68823Vce = this.A02;
        TextView textView2 = vje.A01;
        CharSequence charSequence = c69237Vk5.A00;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = charSequence.charAt(i2);
            sb.append(charAt);
            if (charAt == '\n') {
                while (i3 < length && AbstractC58319PtB.A1T(charSequence, i3)) {
                    i3++;
                }
            }
            i2 = i3;
        }
        textView2.setText(sb);
        if (c69237Vk5.A03) {
            AbstractC166987dD.A1O(context, textView2, AbstractC53242c7.A06(context));
            WNP.A00(textView2, 50, c69237Vk5, c68823Vce);
        }
        vje.A00.setText(c69237Vk5.A02);
        C0f9.A0A(603244638, A03);
        return view2;
    }

    public V3N(Context context, C68823Vce c68823Vce) {
        this.A01 = context;
        this.A02 = c68823Vce;
    }
}
