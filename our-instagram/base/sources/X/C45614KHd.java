package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.KHd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45614KHd extends AbstractC66412zI {
    public final L6T A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44641Jpl(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_timeline_visual_message_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45197Jzd c45197Jzd = (C45197Jzd) interfaceC66482zP;
        C44641Jpl c44641Jpl = (C44641Jpl) c3oo;
        AbstractC167017dG.A1N(c45197Jzd, c44641Jpl);
        LQ1.A00(c44641Jpl.itemView, 42, this, c45197Jzd);
        c44641Jpl.itemView.setOnLongClickListener(LQK.A00);
        IgSimpleImageView igSimpleImageView = c44641Jpl.A00;
        AbstractC46463KhN abstractC46463KhN = c45197Jzd.A00;
        boolean z = abstractC46463KhN instanceof KX7;
        int i = R.drawable.instagram_photo_filled_44;
        if (z) {
            i = R.drawable.instagram_video_chat_outline_44;
        }
        igSimpleImageView.setImageResource(i);
        int dimensionPixelSize = AbstractC25228BEl.A0M(c44641Jpl.itemView).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        long j = dimensionPixelSize / 5;
        if (z) {
            AbstractC43592JPx.A1G(c44641Jpl.itemView, (int) (j * ((KX7) abstractC46463KhN).A00));
        } else {
            AbstractC43592JPx.A1G(c44641Jpl.itemView, dimensionPixelSize);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45197Jzd.class;
    }

    public C45614KHd(L6T l6t) {
        this.A00 = l6t;
    }
}
