package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.HashMap;

/* renamed from: X.HbY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39446HbY extends AbstractC85803s9 {
    public FrameLayout A00;
    public final Context A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39446HbY(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A01 = context;
    }

    @Override // X.AbstractC85803s9
    public final View A03(Context context, ViewGroup viewGroup) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(context), viewGroup, R.layout.ifu_feed_component, false);
        A0D.setTag(new C38420Guv(A0D));
        return A0D;
    }

    @Override // X.AbstractC85803s9
    public final void A05(View view) {
    }

    @Override // X.AbstractC85803s9
    public final int A02() {
        return R.layout.ifu_feed_component;
    }

    public final void A06(C206329Bp c206329Bp, C38420Guv c38420Guv) {
        ViewParent viewParent;
        FrameLayout frameLayout;
        AbstractC167017dG.A1N(c38420Guv, c206329Bp);
        this.A00 = c38420Guv.A00;
        HashMap hashMap = C3MF.A05;
        String str = c206329Bp.A01;
        View view = (View) hashMap.get(str);
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.removeView((View) hashMap.get(str));
        }
        View view2 = (View) hashMap.get(str);
        if (view2 != null && (frameLayout = this.A00) != null) {
            frameLayout.addView(view2);
        }
    }
}
