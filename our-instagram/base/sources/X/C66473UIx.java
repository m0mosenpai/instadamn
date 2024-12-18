package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.UIx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66473UIx extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final ViewGroup A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66473UIx(ViewGroup viewGroup) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 1);
        this.A02 = viewGroup;
        this.A00 = AbstractC167007dF.A0N(viewGroup, R.id.primary_text);
        this.A01 = AbstractC167007dF.A0N(viewGroup, R.id.subtitle_text);
    }
}
