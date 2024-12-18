package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.ui.LoadingSpinnerView;

/* renamed from: X.MmH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51356MmH extends C3OO {
    public C9J0 A00;
    public BDL A01;
    public JXC A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final C8QJ A08;
    public final LoadingSpinnerView A09;
    public final Context A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51356MmH(View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, UserSession userSession, LoadingSpinnerView loadingSpinnerView) {
        super(view);
        boolean A1a = AbstractC31175DnJ.A1a(imageView);
        AbstractC25234BEr.A0k(4, textView, imageView2, imageView3, imageView4);
        C14360o3.A0B(loadingSpinnerView, 8);
        this.A03 = imageView;
        this.A07 = textView;
        this.A04 = imageView2;
        this.A06 = imageView3;
        this.A05 = imageView4;
        this.A09 = loadingSpinnerView;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0A = A0L;
        this.A08 = new C8QJ(A0L, userSession, Integer.valueOf(R.drawable.dup_draft_overflow_menu_background), A1a);
        this.A00 = new C9J0(null, C5JK.A05, null, null, "defaultId", null, null, null, null, A0L.getString(2131955462), -1, -1L, -1L, false, false, false);
    }
}
