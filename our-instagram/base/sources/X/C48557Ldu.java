package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout;

/* renamed from: X.Ldu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48557Ldu implements InterfaceC69513Al {
    public final /* synthetic */ C48733Lh1 A00;
    public final /* synthetic */ boolean A01;

    public C48557Ldu(C48733Lh1 c48733Lh1, boolean z) {
        this.A00 = c48733Lh1;
        this.A01 = z;
    }

    @Override // X.InterfaceC69513Al
    public final /* bridge */ /* synthetic */ void DLu(View view) {
        C14360o3.A0B(view, 0);
        C48733Lh1 c48733Lh1 = this.A00;
        View requireViewById = view.requireViewById(R.id.direct_sticker_results_list);
        boolean z = this.A01;
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(c48733Lh1.A0K.A00);
        recyclerView.setLayoutManager(c48733Lh1.A0E);
        Context context = c48733Lh1.A0D;
        recyclerView.A10(AbstractC46752Km9.A00(context, null, 0, false, z));
        Resources resources = context.getResources();
        recyclerView.A10(new JoE(resources.getDimensionPixelOffset(R.dimen.album_music_sticker_text_vertical_padding), resources.getDimensionPixelOffset(R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin)));
        recyclerView.setItemAnimator(null);
        c48733Lh1.A06 = recyclerView;
        c48733Lh1.A01 = view.findViewById(R.id.direct_sticker_results_empty_view);
        c48733Lh1.A04 = view.findViewById(R.id.sticker_tray_overflow_nav_contents);
        c48733Lh1.A07 = AbstractC31172DnG.A0Y(view, R.id.sticker_tray_overflow_header);
        c48733Lh1.A03 = view.findViewById(R.id.sticker_tray_overflow_back_button);
        c48733Lh1.A02 = view.findViewById(R.id.direct_sticker_results_loading_spinner);
        if (c48733Lh1.A0Z) {
            c48733Lh1.A08 = (IgdExpressionTrayHscrollLayout) AbstractC37301Gc2.A0D(view, R.id.direct_sticker_tray_hscroll_container).getView();
        }
    }
}
