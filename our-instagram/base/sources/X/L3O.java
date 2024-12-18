package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.EvictingQueue;

/* loaded from: classes8.dex */
public final class L3O {
    public final ViewGroup A00;
    public final LinearLayout A01;
    public final EvictingQueue A02;
    public final L6E A03;
    public final C9AU A04;

    public L3O(Context context, View view, C9AU c9au) {
        boolean A1a = AbstractC31175DnJ.A1a(c9au);
        this.A04 = c9au;
        this.A02 = new EvictingQueue(10);
        L6E l6e = new L6E();
        this.A03 = l6e;
        View rootView = view.getRootView();
        AbstractC43592JPx.A1T(rootView);
        ViewGroup viewGroup = (ViewGroup) rootView;
        this.A00 = viewGroup;
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        this.A01 = linearLayout;
        AbstractC31174DnI.A1D(linearLayout, -1, -2);
        linearLayout.setOrientation(A1a ? 1 : 0);
        linearLayout.setPadding(40, 60, 20, 20);
        AbstractC31172DnG.A1B(context, linearLayout, AbstractC53242c7.A0H(context, R.attr.igds_color_photo_border));
        int i = 0;
        do {
            View inflate = AbstractC25228BEl.A0P(linearLayout).inflate(R.layout.direct_thread_osd_debug_info_item, (ViewGroup) linearLayout, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView");
            TextView textView = (TextView) inflate;
            textView.setTextSize(10.0f);
            l6e.A00.add(textView);
            linearLayout.addView(textView);
            i++;
        } while (i < 10);
        viewGroup.addView(linearLayout);
        if (c9au.A04.add(this)) {
            for (C137246Jd c137246Jd : c9au.A03) {
                C11T.A02(new RunnableC49946M3n(this, new C137246Jd(AnonymousClass001.A0R("[old]", c137246Jd.A01), c137246Jd.A00)));
            }
        }
    }
}
