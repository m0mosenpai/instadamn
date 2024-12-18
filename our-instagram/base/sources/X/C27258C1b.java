package X;

import android.os.Bundle;
import com.facebook.R;
import java.util.List;

/* renamed from: X.C1b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27258C1b extends AbstractC26735BrG {
    public static final String __redex_internal_original_name = "DefaultOptOutHighlightsToGridFragment";
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new C57244PbS(this, 4));

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1077222484);
        super.onCreate(bundle);
        List A1Q = AbstractC16960so.A1Q(AbstractC25225BEi.A0d(2131963622, R.drawable.instagram_calendar_pano_outline_24, 20), AbstractC25225BEi.A0d(2131963624, R.drawable.instagram_story_highlight_pano_outline_24, 20), AbstractC25225BEi.A0d(2131963626, R.drawable.instagram_photo_grid_pano_outline_24, 20));
        String A15 = AbstractC25225BEi.A15(this.A00);
        super.A00 = 2131963629;
        this.A04 = A1Q;
        this.A03 = "default_opt_out_highlights_to_grid_fragment";
        this.A01 = A15;
        C0f9.A09(-1598917734, A02);
    }
}
