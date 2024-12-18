package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.R;

/* renamed from: X.7KQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KQ {
    public C09530e4 A00;
    public final int A01;
    public final int A02;
    public final LinearLayoutManager A03;

    public static final C09530e4 A00(C7KQ c7kq) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        LinearLayoutManager linearLayoutManager = c7kq.A03;
        int A1a = linearLayoutManager.A1a();
        if (A1a == -1) {
            return null;
        }
        View A0d = linearLayoutManager.A0d(A1a);
        int i2 = 0;
        if (A0d == null) {
            return null;
        }
        Object tag = A0d.getTag(R.id.direct_thread_view_layout_tag_key);
        if (!(tag instanceof java.util.Set) || !((java.util.Set) tag).contains(EnumC222629s3.A03)) {
            return null;
        }
        int top = A0d.getTop();
        ViewGroup.LayoutParams layoutParams = A0d.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.topMargin;
        } else {
            i = 0;
        }
        Integer valueOf = Integer.valueOf(top - i);
        int bottom = A0d.getBottom();
        ViewGroup.LayoutParams layoutParams2 = A0d.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams.bottomMargin;
        }
        return new C09530e4(valueOf, Integer.valueOf(bottom - i2));
    }

    public C7KQ(Context context, LinearLayoutManager linearLayoutManager, int i) {
        int A04 = (int) AbstractC13880nE.A04(context, i);
        int A042 = (int) AbstractC13880nE.A04(context, 12);
        this.A03 = linearLayoutManager;
        this.A01 = A04;
        this.A02 = A042;
    }
}
