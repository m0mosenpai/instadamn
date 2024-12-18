package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.CrY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29045CrY implements C2YT {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        LayoutInflater from = LayoutInflater.from(c2yr.A00.A04);
        View inflate = from.inflate(R.layout.comment_poll_consumption, (ViewGroup) null);
        if (this.A03) {
            inflate.findViewById(R.id.header_section).setVisibility(0);
        }
        if (this.A01) {
            boolean z = this.A02;
            int i = R.id.creator_view_footer_text_aligned_right;
            if (z) {
                i = R.id.creator_view_footer_text_aligned_left;
            }
            inflate.findViewById(i).setVisibility(0);
            inflate.findViewById(R.id.footer_nux).setVisibility(0);
        }
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0R(inflate, R.id.option_rows);
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2; i3++) {
            viewGroup.addView(from.inflate(R.layout.comment_poll_consumption_option_row, viewGroup, false));
        }
        return AbstractC25234BEr.A0R(inflate, j);
    }

    public C29045CrY(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
