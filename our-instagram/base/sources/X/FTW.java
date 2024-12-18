package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FTW {
    public static final List A01(Context context, EnumC222416a enumC222416a, boolean z) {
        C34951Fab[] c34951FabArr;
        String string;
        int i;
        String string2;
        String string3;
        int i2;
        int i3;
        int ordinal = enumC222416a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return C16930sl.A00;
                }
                c34951FabArr = new C34951Fab[3];
                c34951FabArr[0] = new C34951Fab(context.getString(2131957150), context.getString(2131957147), R.drawable.instagram_user_pano_outline_24, R.drawable.instagram_creator_experience_assets_creator_controls_illustration);
                c34951FabArr[1] = new C34951Fab(context.getString(2131957149), context.getString(2131957146), R.drawable.instagram_direct_pano_outline_24, R.drawable.instagram_creator_experience_assets_creator_inbox_illustration);
                string2 = context.getString(2131957148);
                string3 = context.getString(2131957145);
                i2 = R.drawable.instagram_insights_pano_outline_24;
                i3 = R.drawable.instagram_creator_experience_assets_creator_insights_illustration;
                c34951FabArr[2] = new C34951Fab(string2, string3, i2, i3);
                return AbstractC16960so.A1Q(c34951FabArr);
            }
            c34951FabArr = new C34951Fab[3];
            c34951FabArr[0] = C34951Fab.A00(context);
            string = context.getString(2131971497);
            i = 2131971496;
        } else {
            if (z) {
                CallerContext callerContext = C35792FrU.A00;
            }
            c34951FabArr = new C34951Fab[3];
            c34951FabArr[0] = C34951Fab.A00(context);
            string = context.getString(2131971495);
            i = 2131971494;
        }
        c34951FabArr[1] = new C34951Fab(string, context.getString(i), R.drawable.instagram_ads_pano_outline_24, R.drawable.ig_illustrations_illo_ads_megaphone_refresh);
        string2 = context.getString(2131977180);
        string3 = context.getString(2131977179);
        i2 = R.drawable.instagram_mail_pano_outline_24;
        i3 = R.drawable.ig_illustrations_illo_contact_buttons_refresh;
        c34951FabArr[2] = new C34951Fab(string2, string3, i2, i3);
        return AbstractC16960so.A1Q(c34951FabArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    public static final ArrayList A00(SlideCardViewModel slideCardViewModel, List list, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (slideCardViewModel != null) {
            A1E.add(slideCardViewModel);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34951Fab c34951Fab = (C34951Fab) it.next();
            if (z) {
                CallerContext callerContext = C35792FrU.A00;
            }
            String str = c34951Fab.A03;
            String str2 = c34951Fab.A02;
            if (str != null && str2 != null) {
                int i = c34951Fab.A00;
                ?? obj = new Object();
                obj.A00 = 0;
                obj.A01 = i;
                obj.A06 = null;
                obj.A05 = null;
                obj.A0B = str;
                obj.A0A = str2;
                obj.A08 = null;
                obj.A09 = null;
                obj.A07 = null;
                obj.A02 = null;
                obj.A03 = null;
                obj.A04 = null;
                A1E.add(obj);
            }
        }
        return A1E;
    }
}
