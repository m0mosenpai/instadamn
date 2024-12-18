package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* loaded from: classes9.dex */
public final class N9G extends AbstractC168697g3 {
    public final int A00 = 3;
    public final Context A01;
    public final InterfaceC57914PmK A02;
    public final N7V A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;

    public N9G(Context context, InterfaceC57914PmK interfaceC57914PmK, N7V n7v, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = context;
        this.A04 = interfaceC11380iw;
        this.A03 = n7v;
        this.A02 = interfaceC57914PmK;
        this.A05 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int dimensionPixelSize;
        O71 o71;
        View view2 = view;
        int A03 = C0f9.A03(1427200249);
        if (view == null) {
            int A032 = C0f9.A03(-1458442190);
            Context context = this.A01;
            int i2 = this.A00;
            C14360o3.A0B(context, 0);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
            int i3 = i2 - 1;
            int i4 = (AbstractC13880nE.A0I(context).widthPixels - (dimensionPixelSize2 * i3)) / i2;
            LinearLayout linearLayout = new LinearLayout(context);
            O72 o72 = new O72(linearLayout);
            for (int i5 = 0; i5 < i2; i5++) {
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_highlights_media_item, (ViewGroup) linearLayout, false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.framelayout.MediaFrameLayout");
                MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate;
                mediaFrameLayout.A00 = 0.5625f;
                C54676ODc c54676ODc = new C54676ODc(AbstractC166997dE.A0S(mediaFrameLayout, R.id.selected_item_overlay), (CheckBox) AbstractC166997dE.A0R(mediaFrameLayout, R.id.media_toggle), AbstractC167007dF.A0T(mediaFrameLayout, R.id.media_image), mediaFrameLayout);
                mediaFrameLayout.setTag(c54676ODc);
                o72.A01.add(c54676ODc);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i4, -2);
                int i6 = dimensionPixelSize2;
                if (i5 == i3) {
                    i6 = 0;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
                linearLayout.addView(c54676ODc.A05, layoutParams);
            }
            linearLayout.setTag(o72);
            C0f9.A0A(-399935966, A032);
            view2 = linearLayout;
        }
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        int A033 = C0f9.A03(-1528826987);
        O72 o722 = (O72) AbstractC31172DnG.A0x(view2);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        N7V n7v = this.A03;
        java.util.Set Bsh = this.A02.Bsh();
        UserSession userSession = this.A05;
        C14360o3.A0B(o722, 0);
        JQ0.A1O(c153126ug, interfaceC11380iw, n7v, c153336v2, Bsh);
        C14360o3.A0B(userSession, 6);
        View view3 = o722.A00;
        boolean z = c153336v2.A04;
        if (z) {
            dimensionPixelSize = 0;
        } else {
            dimensionPixelSize = view3.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        }
        AbstractC13880nE.A0Y(view3, dimensionPixelSize);
        List list = o722.A01;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C54676ODc c54676ODc2 = (C54676ODc) list.get(i7);
            if (i7 < c153126ug.A01()) {
                C38321qM c38321qM = (C38321qM) c153126ug.A02(i7);
                boolean A0u = AbstractC001800i.A0u(Bsh, c38321qM.getId());
                C14360o3.A0B(c54676ODc2, 0);
                c54676ODc2.A03.A02();
                MediaFrameLayout mediaFrameLayout2 = c54676ODc2.A05;
                mediaFrameLayout2.setVisibility(0);
                CheckBox checkBox = c54676ODc2.A02;
                checkBox.setVisibility(0);
                checkBox.setChecked(A0u);
                c54676ODc2.A01.setVisibility(AbstractC167007dF.A05(A0u ? 1 : 0));
                IgImageView igImageView = c54676ODc2.A04;
                igImageView.setVisibility(0);
                ExtendedImageUrl A1o = c38321qM.A1o(mediaFrameLayout2.getMeasuredWidth());
                if (c38321qM.A6i(userSession)) {
                    Context context2 = mediaFrameLayout2.getContext();
                    igImageView.setImageDrawable(context2.getResources().getDrawable(R.drawable.deleted_media_error_warning_archive_drawable, context2.getTheme()));
                } else if (A1o != null && !AbstractC81033jX.A03(A1o)) {
                    igImageView.setUrl(A1o, interfaceC11380iw);
                }
                o71 = new O71(n7v, c38321qM);
            } else {
                C14360o3.A0B(c54676ODc2, 0);
                c54676ODc2.A05.setVisibility(8);
                c54676ODc2.A04.setVisibility(8);
                c54676ODc2.A02.setVisibility(8);
                c54676ODc2.A01.setVisibility(8);
                c54676ODc2.A03.A02();
                o71 = null;
            }
            c54676ODc2.A00 = o71;
        }
        C0f9.A0A(-1672234637, A033);
        C0f9.A0A(1722911341, A03);
        return view2;
    }
}
