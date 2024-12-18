package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6uU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153006uU extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(2).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    public C153006uU(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1745018226);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        int intValue = C05F.A00(2)[i].intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                C14360o3.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.feed.ui.rows.notice.FeedTopNoticeRowWithThumbnailViewBinder.Holder");
                throw new NullPointerException("titleText");
            }
            RuntimeException runtimeException = new RuntimeException();
            C0f9.A0A(652973143, A03);
            throw runtimeException;
        }
        IC8 ic8 = (IC8) obj;
        C14360o3.A0B(ic8, 1);
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.notice.FeedTopNoticeRowViewBinder.Holder");
        C68984VfM c68984VfM = (C68984VfM) tag;
        CharSequence charSequence = ic8.A00;
        TextView textView = c68984VfM.A01;
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        c68984VfM.A00.setVisibility(8);
        C0f9.A0A(141399398, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View inflate;
        Object c68984VfM;
        int A03 = C0f9.A03(1091544462);
        C14360o3.A0B(viewGroup, 1);
        int intValue = C05F.A00(2)[i].intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                Context context = this.A00;
                C14360o3.A0B(context, 0);
                inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_notice_with_thumbnail, viewGroup, false);
                C14360o3.A0A(inflate);
                c68984VfM = new C47670L3d(inflate);
            } else {
                RuntimeException runtimeException = new RuntimeException();
                C0f9.A0A(968097609, A03);
                throw runtimeException;
            }
        } else {
            Context context2 = this.A00;
            C14360o3.A0B(context2, 0);
            inflate = LayoutInflater.from(context2).inflate(R.layout.row_feed_notice, viewGroup, false);
            C14360o3.A0A(inflate);
            c68984VfM = new C68984VfM(inflate);
        }
        inflate.setTag(c68984VfM);
        C0f9.A0A(1766389224, A03);
        return inflate;
    }
}
