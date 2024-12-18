package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;

/* renamed from: X.MmF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51354MmF extends C3OO {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final InterfaceC11380iw A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgImageView A09;
    public final QuickSnapArchiveViewModel A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51354MmF(View view, InterfaceC11380iw interfaceC11380iw, QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        super(view);
        AbstractC167017dG.A1R(interfaceC11380iw, quickSnapArchiveViewModel);
        this.A05 = interfaceC11380iw;
        this.A0A = quickSnapArchiveViewModel;
        this.A09 = AbstractC37302Gc3.A0K(view, R.id.quick_snap_archive_item_image_view);
        this.A04 = AbstractC166987dD.A0c(view, R.id.quick_snap_archive_item_reaction_container);
        this.A06 = AbstractC31175DnJ.A0L(view, R.id.quick_snap_archive_item_reaction_emoji);
        this.A08 = AbstractC31175DnJ.A0L(view, R.id.quick_snap_archive_item_reaction_count);
        this.A02 = AbstractC166987dD.A0c(view, R.id.quick_snap_archive_item_overlay);
        this.A03 = AbstractC166987dD.A0c(view, R.id.quick_snap_archive_item_progress);
        this.A01 = AbstractC166987dD.A0c(view, R.id.quick_snap_archive_item_error);
        this.A07 = AbstractC31175DnJ.A0L(view, R.id.quick_snap_archive_multi_select_indicator);
    }
}
