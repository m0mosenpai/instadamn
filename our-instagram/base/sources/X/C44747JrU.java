package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JrU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44747JrU extends C3OO {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final IgImageView A07;

    public C44747JrU(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A05 = AbstractC167007dF.A0N(view, R.id.rank);
        this.A04 = AbstractC167007dF.A0N(view, R.id.placeholder_rank);
        this.A07 = AbstractC167007dF.A0T(view, R.id.profile_pic);
        this.A06 = AbstractC167007dF.A0N(view, R.id.username);
        this.A02 = AbstractC167007dF.A0N(view, R.id.full_name);
        this.A03 = AbstractC167007dF.A0N(view, R.id.hit_count);
        this.A01 = AbstractC167007dF.A0N(view, R.id.crown);
    }
}
