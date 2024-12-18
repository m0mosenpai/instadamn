package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.UIr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66467UIr extends C3OO {
    public final FrameLayout A00;
    public final ViewGroup A01;
    public final /* synthetic */ UuP A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66467UIr(ViewGroup viewGroup, UuP uuP) {
        super(viewGroup);
        C14360o3.A0B(viewGroup, 2);
        this.A02 = uuP;
        this.A01 = viewGroup;
        FrameLayout frameLayout = (FrameLayout) AbstractC166997dE.A0R(viewGroup, R.id.bloks_container);
        this.A00 = frameLayout;
        AbstractC70177WFc.A04(frameLayout, 35, false);
    }
}
