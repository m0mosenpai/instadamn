package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.facebook.R;

/* renamed from: X.MmQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51365MmQ extends C3OO {
    public final Context A00;
    public final C50809McW A01;
    public final InterfaceC58200Pr6 A02;
    public final View A03;
    public final C216599iG A04;

    public static void A00(Resources resources, C50809McW c50809McW) {
        c50809McW.A09(resources.getColor(R.color.track_background_color, null), resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
    }

    public AbstractC51365MmQ(Context context, View view, C50809McW c50809McW, InterfaceC58200Pr6 interfaceC58200Pr6, C216599iG c216599iG, boolean z) {
        super(view);
        this.A00 = context;
        this.A02 = interfaceC58200Pr6;
        this.A01 = c50809McW;
        this.A03 = view;
        this.A04 = c216599iG;
        c50809McW.setupTrimmer(c216599iG);
        c50809McW.setEnableTrim(z);
        c50809McW.setWillNotDraw(false);
        c50809McW.A0E = 100;
        if (interfaceC58200Pr6 != null) {
            c50809McW.A0L = new C56165OwX(this);
        }
    }
}
