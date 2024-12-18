package X;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class Q50 extends BaseAdapter implements ListAdapter {
    public final ArrayList A00;
    public final Context A01;
    public final InterfaceC65339TiK A02;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A00.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A00.get(i);
    }

    public Q50(Context context, InterfaceC65339TiK interfaceC65339TiK, ArrayList arrayList) {
        this.A00 = arrayList;
        this.A01 = context;
        this.A02 = interfaceC65339TiK;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r0 != null) goto L18;
     */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.getItem(r9)
            X.Sev r5 = (X.C63193Sev) r5
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "navigation"
            boolean r0 = r1.equals(r0)
            r6 = 0
            if (r0 != 0) goto L70
            boolean r0 = r10 instanceof com.facebook.browser.lite.chrome.widgets.menu.MenuItemTextView
            if (r0 != 0) goto L22
            android.content.Context r0 = r8.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626030(0x7f0e082e, float:1.8879285E38)
            android.view.View r10 = r1.inflate(r0, r11, r6)
        L22:
            X.TiK r3 = r8.A02
            java.util.ArrayList r2 = r8.A00
            int r0 = r8.getCount()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r2.get(r0)
            if (r0 == r5) goto L33
            r1 = 0
        L33:
            r7 = r1 ^ 1
            r0 = 2131442979(0x7f0b3d23, float:1.8508013E38)
            android.widget.TextView r2 = X.AbstractC166997dE.A0T(r10, r0)
            java.lang.String r0 = r5.A03
            r2.setText(r0)
            int r0 = r5.A00
            r4 = 0
            if (r0 <= 0) goto L49
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r6, r6, r6)
        L49:
            int r1 = r5.A01
            if (r1 <= 0) goto L52
            java.util.regex.Pattern r0 = X.SUV.A01
            r2.setTextAppearance(r1)
        L52:
            r1 = 1
            X.SoX r0 = new X.SoX
            r0.<init>(r1, r3, r10, r5)
            r10.setOnClickListener(r0)
            r1 = 2131436175(0x7f0b228f, float:1.8494213E38)
            android.view.View r0 = r10.findViewById(r1)
            if (r0 == 0) goto L6f
        L64:
            android.view.View r0 = r10.requireViewById(r1)
            if (r7 != 0) goto L6c
            r4 = 8
        L6c:
            r0.setVisibility(r4)
        L6f:
            return r10
        L70:
            boolean r0 = r10 instanceof com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView
            if (r0 != 0) goto L81
            android.content.Context r0 = r8.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626031(0x7f0e082f, float:1.8879287E38)
            android.view.View r10 = r1.inflate(r0, r11, r6)
        L81:
            com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView r10 = (com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView) r10
            X.TiK r3 = r8.A02
            java.util.ArrayList r2 = r8.A00
            int r0 = r8.getCount()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r2.get(r0)
            if (r0 == r5) goto L94
            r1 = 0
        L94:
            r7 = r1 ^ 1
            java.util.ArrayList r2 = r5.A04
            r4 = 0
            java.lang.Object r1 = r2.get(r6)
            X.Sev r1 = (X.C63193Sev) r1
            r0 = 2131433630(0x7f0b189e, float:1.8489051E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView.A00(r0, r1, r3, r10)
            r0 = 1
            java.lang.Object r1 = r2.get(r0)
            X.Sev r1 = (X.C63193Sev) r1
            r0 = 2131433631(0x7f0b189f, float:1.8489053E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView.A00(r0, r1, r3, r10)
            r1 = 2131436175(0x7f0b228f, float:1.8494213E38)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q50.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
