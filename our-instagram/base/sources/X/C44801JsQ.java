package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.smartcapture.ui.SCImageView;
import java.util.List;

/* renamed from: X.JsQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44801JsQ extends AbstractC021208i {
    public final List A00;

    public C44801JsQ(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.widget.ScrollView, X.Jl0, android.view.View, java.lang.Object, android.view.ViewGroup] */
    @Override // X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        C14360o3.A0B(viewGroup, 0);
        List list = this.A00;
        list.get(i);
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        ?? scrollView = new ScrollView(A0L);
        View.inflate(A0L, R.layout.sc_ig_onboarding_view, scrollView);
        scrollView.A02 = (SCImageView) AbstractC47961LGz.A00(scrollView, R.id.iv_image);
        scrollView.A01 = AbstractC47961LGz.A02(scrollView, R.id.tv_title);
        scrollView.A00 = AbstractC47961LGz.A02(scrollView, R.id.tv_subtitle);
        TextView textView = scrollView.A01;
        if (textView == null) {
            str = "titleView";
        } else {
            Context A0L2 = AbstractC166997dE.A0L(scrollView);
            AbstractC47994LKy.A04(A0L2, textView, R.attr.sc_primary_text);
            TextView textView2 = scrollView.A00;
            if (textView2 == null) {
                str = "subtitleView";
            } else {
                AbstractC47994LKy.A04(A0L2, textView2, R.attr.sc_secondary_text);
                scrollView.set((L2H) list.get(i));
                viewGroup.addView(scrollView);
                return scrollView;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A00.size();
    }

    @Override // X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC167017dG.A1O(viewGroup, obj);
        viewGroup.removeView((View) obj);
    }

    @Override // X.AbstractC021208i
    public final boolean isViewFromObject(View view, Object obj) {
        AbstractC167017dG.A1N(view, obj);
        return AbstractC167007dF.A1X(view, obj);
    }
}
