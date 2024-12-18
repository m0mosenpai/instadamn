package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.4FV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FV {
    public final ImageView A00;
    public final TextView A01;
    public final C92854Eb A02;
    public final View A03;
    public final RecyclerView A04;
    public final C4FA A05;

    public C4FV(View view, C4FA c4fa, C92854Eb c92854Eb) {
        this.A03 = view;
        this.A05 = c4fa;
        this.A02 = c92854Eb;
        View findViewById = view.findViewById(R.id.notes_netego_see_all_button);
        C14360o3.A07(findViewById);
        this.A01 = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cf_hub_recycler_view);
        C14360o3.A07(findViewById2);
        this.A04 = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.overflow_button);
        C14360o3.A07(findViewById3);
        this.A00 = (ImageView) findViewById3;
    }
}
