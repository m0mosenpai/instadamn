package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6uV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153016uV extends AbstractC65632xz {
    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C14360o3.A0B(anonymousClass306, 0);
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1135784536);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        FM4 fm4 = (FM4) obj;
        C14360o3.A0B(fm4, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.notice.FeedBottomNoticeRowViewBinder.Holder");
        A8M a8m = (A8M) tag;
        a8m.A02.setText(fm4.A03);
        a8m.A01.setText(fm4.A02);
        String str = fm4.A01;
        TextView textView = a8m.A00;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            C0fQ.A00(fm4.A00, textView);
        }
        C0f9.A0A(1134162617, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(663249207);
        C14360o3.A0B(viewGroup, 1);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_feed_bottom_notice, viewGroup, false);
        C14360o3.A0A(inflate);
        inflate.setTag(new A8M(inflate));
        C0f9.A0A(-482058097, A03);
        return inflate;
    }
}
