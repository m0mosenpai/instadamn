package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.FBv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34327FBv {
    public static final void A00(C211739Zk c211739Zk, C31902E0i c31902E0i) {
        AbstractC167007dF.A1K(c31902E0i, c211739Zk);
        IgdsBanner igdsBanner = c31902E0i.A00;
        AbstractC31172DnG.A1U(igdsBanner, (CharSequence) c211739Zk.A04, false);
        Number number = (Number) c211739Zk.A00;
        if (number != null) {
            igdsBanner.setAction(number.intValue());
        } else {
            igdsBanner.setAction((CharSequence) null);
        }
        Number number2 = (Number) c211739Zk.A05;
        if (number2 != null) {
            igdsBanner.setIcon(number2.intValue());
        } else {
            igdsBanner.setIcon((Drawable) null);
        }
        igdsBanner.A00 = (GZA) c211739Zk.A01;
        boolean z = c211739Zk.A02;
        int i = 0;
        igdsBanner.A02.setVisibility(8);
        View view = igdsBanner.A01;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
