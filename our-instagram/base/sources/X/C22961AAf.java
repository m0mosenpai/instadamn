package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.AAf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22961AAf {
    public final C210679Tk A00(Context context, CharSequence charSequence, int i) {
        View inflate;
        C53192c1 c53192c1;
        C14360o3.A0B(context, 0);
        LayoutInflater from = LayoutInflater.from(context);
        try {
            if (C14640oc.A06()) {
                inflate = from.inflate(R.layout.igds_prism_toast, (ViewGroup) null, false);
            } else {
                inflate = from.inflate(R.layout.ig_toast, (ViewGroup) null, false);
            }
        } catch (InflateException e) {
            AbstractC53172bz.A03(context, e);
            context.getTheme().applyStyle(AbstractC53172bz.A00(), true);
            if (C14640oc.A06()) {
                inflate = from.inflate(R.layout.igds_prism_toast, (ViewGroup) null, false);
            } else {
                inflate = from.inflate(R.layout.ig_toast, (ViewGroup) null, false);
            }
        }
        AbstractC167007dF.A0N(inflate, R.id.text_view).setText(charSequence);
        C210679Tk c210679Tk = new C210679Tk(context);
        c210679Tk.setDuration(i);
        c210679Tk.setGravity(17, 0, 0);
        c210679Tk.setView(inflate);
        Drawable background = inflate.getBackground();
        if ((background instanceof GradientDrawable) && (c53192c1 = C53192c1.A01) != null) {
            AbstractC12990ll A00 = C53192c1.A00(c53192c1);
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A00, 36320296449941828L) && C18U.A06(c06090Tz, C53192c1.A00(c53192c1), 36328306563431879L)) {
                ((GradientDrawable) background).setColor(context.getColor(R.color.igds_prism_gray_08_alpha_80));
            }
        }
        return c210679Tk;
    }
}
