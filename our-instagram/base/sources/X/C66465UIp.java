package X;

import android.widget.CheckBox;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.UIp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66465UIp extends C3OO {
    public final CheckBox A00;
    public final ShimmerFrameLayout A01;
    public final /* synthetic */ UuR A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66465UIp(ShimmerFrameLayout shimmerFrameLayout, UuR uuR) {
        super(shimmerFrameLayout);
        C14360o3.A0B(shimmerFrameLayout, 2);
        this.A02 = uuR;
        this.A01 = shimmerFrameLayout;
        this.A00 = (CheckBox) AbstractC166997dE.A0R(shimmerFrameLayout, R.id.email_optin_toggle);
    }
}
