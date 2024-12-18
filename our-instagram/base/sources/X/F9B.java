package X;

import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class F9B {
    public static final void A00(Drawable drawable, View.OnClickListener onClickListener, View view, AbstractC59962oe abstractC59962oe, String str, String str2, String str3, List list) {
        AbstractC167007dF.A1D(view, 1, str);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(view, R.id.headline);
        igdsHeadline.setImageDrawable(drawable);
        igdsHeadline.setHeadline(str);
        igdsHeadline.setBody(str2);
        igdsHeadline.setAction(str3, onClickListener);
        C35228FgL A01 = C35228FgL.A01(abstractC59962oe.requireContext(), true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34936FaM c34936FaM = (C34936FaM) it.next();
            A01.A04(null, c34936FaM.A01, c34936FaM.A00);
        }
        List A03 = A01.A03();
        Iterator it2 = A03.iterator();
        while (it2.hasNext()) {
            ((IgdsBulletCell) it2.next()).setMovementMethod(LinkMovementMethod.getInstance(), LinkMovementMethod.getInstance());
        }
        igdsHeadline.setBulletList(A03);
    }
}
