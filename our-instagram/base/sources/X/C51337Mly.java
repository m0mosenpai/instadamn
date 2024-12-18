package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Mly, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51337Mly extends C3OO {
    public C7IK A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final C54639OBo A05;

    public C51337Mly(View view) {
        super(view);
        this.A01 = view;
        this.A04 = AbstractC25231BEo.A0d(view, R.id.title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.cta);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.live_pill);
        this.A05 = new C54639OBo(view);
    }
}
