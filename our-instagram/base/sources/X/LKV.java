package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public abstract class LKV {
    public static final void A01(Activity activity, int i) {
        C14360o3.A0B(activity, 0);
        A03(activity, AbstractC166997dE.A0p(activity, 2131957422), null, i);
    }

    public static final boolean A04(AbstractC46405KgR abstractC46405KgR, WeakReference weakReference, int i) {
        EnumC53262Nh0 enumC53262Nh0;
        Context context;
        Integer num;
        C14360o3.A0B(weakReference, 0);
        if (abstractC46405KgR instanceof KNB) {
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                A03(context2, AbstractC166997dE.A0p(context2, 2131957436), null, i);
                return true;
            }
        } else if ((abstractC46405KgR instanceof KN9) && (((enumC53262Nh0 = ((KN9) abstractC46405KgR).A00) == EnumC53262Nh0.A0E || enumC53262Nh0 == EnumC53262Nh0.A05) && (context = (Context) weakReference.get()) != null)) {
            Resources A0M = AbstractC166997dE.A0M(context);
            OLG olg = enumC53262Nh0.A00;
            if (olg != null) {
                num = olg.A00;
            } else {
                num = null;
            }
            A02(context, A0M, num, i);
            return true;
        }
        return false;
    }

    public static final void A02(Context context, Resources resources, Integer num, int i) {
        String A0p;
        String str;
        int intValue;
        if (num != null && (intValue = num.intValue()) > 0) {
            String A03 = C84963qk.A03(resources, num);
            A0p = AbstractC166997dE.A0p(context, 2131957433);
            str = resources.getQuantityString(R.plurals.cutout_anything_sticker_not_saved_due_to_max_saved_limit_description, intValue, num, A03);
        } else {
            A0p = AbstractC166997dE.A0p(context, 2131957432);
            str = null;
        }
        A03(context, A0p, str, i);
    }

    public static final void A03(Context context, String str, String str2, int i) {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A0D = str;
        A0Y.A0I = str2;
        A0Y.A02();
        A0Y.A04 = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
        A0Y.A0R = true;
        A0Y.A02 = i;
        AbstractC31178DnM.A1N(c41451vu, A0Y);
    }

    public static final void A00(Activity activity, int i) {
        A03(activity, AbstractC166997dE.A0p(activity, 2131957394), null, i);
    }
}
