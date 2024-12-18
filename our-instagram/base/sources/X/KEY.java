package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.gallery.Draft;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.creation.fragment.ManageDraftsFragment;

/* loaded from: classes8.dex */
public final class KEY extends AbstractC168697g3 {
    public final Context A00;
    public final C189038Yt A01;
    public final ManageDraftsFragment A02;

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
        int i2;
        int A03 = C0f9.A03(578729795);
        if (view == null) {
            view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.draft_item);
            view.setTag(new C48280LYd(view));
        }
        C47531Kyy c47531Kyy = (C47531Kyy) obj2;
        C48280LYd c48280LYd = (C48280LYd) AbstractC31172DnG.A0x(view);
        Context context = view.getContext();
        Draft draft = (Draft) obj;
        boolean z = c47531Kyy.A00;
        boolean z2 = c47531Kyy.A01;
        C189038Yt c189038Yt = this.A01;
        ManageDraftsFragment manageDraftsFragment = this.A02;
        ConstrainedImageView constrainedImageView = c48280LYd.A05;
        constrainedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        CheckBox checkBox = c48280LYd.A01;
        if (z) {
            checkBox.setVisibility(0);
            checkBox.setChecked(z2);
        } else {
            checkBox.setVisibility(8);
        }
        ViewOnClickListenerC48066LPr.A00(constrainedImageView, 21, manageDraftsFragment, draft);
        c48280LYd.A00 = draft;
        C14360o3.A0B(draft, 0);
        c189038Yt.A02.ATO(new C217099j4(draft, c189038Yt, AbstractC25225BEi.A16(c48280LYd)));
        c48280LYd.A02.setVisibility(AbstractC167007dF.A05(draft.A07 ? 1 : 0));
        if (draft.A05) {
            c48280LYd.A03.setVisibility(8);
            c48280LYd.A04.setVisibility(0);
            i2 = 2131963051;
        } else {
            boolean z3 = draft.A06;
            TextView textView = c48280LYd.A03;
            if (z3) {
                textView.setText(draft.B8m());
                textView.setVisibility(0);
                c48280LYd.A04.setVisibility(8);
                i2 = 2131963145;
            } else {
                textView.setVisibility(8);
                c48280LYd.A04.setVisibility(8);
                i2 = 2131963110;
            }
        }
        AbstractC166997dE.A18(context, constrainedImageView, i2);
        C0f9.A0A(1984252552, A03);
        return view;
    }

    public KEY(Context context, C189038Yt c189038Yt, ManageDraftsFragment manageDraftsFragment) {
        this.A00 = context;
        this.A01 = c189038Yt;
        this.A02 = manageDraftsFragment;
    }
}
