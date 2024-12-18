package X;

import android.content.Context;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

/* renamed from: X.OVr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55009OVr {
    public TextWatcher A00;
    public final Context A01;
    public final N6R A02;
    public final C54735OFm A03;
    public final UserSession A04;

    public C55009OVr(Context context, UserSession userSession, N6R n6r, C54735OFm c54735OFm) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = c54735OFm;
        this.A02 = n6r;
    }

    public static final void A00(C55009OVr c55009OVr) {
        AbstractC13880nE.A0O(c55009OVr.A03.A03);
        N6R n6r = c55009OVr.A02;
        C51626MrJ c51626MrJ = n6r.A03;
        String str = "viewState";
        if (c51626MrJ != null) {
            UpcomingEvent upcomingEvent = c51626MrJ.A01;
            EnumC53233NgW enumC53233NgW = c51626MrJ.A00;
            String str2 = c51626MrJ.A02;
            Date date = c51626MrJ.A04;
            Date date2 = c51626MrJ.A03;
            boolean z = c51626MrJ.A06;
            AbstractC167017dG.A1P(enumC53233NgW, str2);
            C51626MrJ c51626MrJ2 = new C51626MrJ(enumC53233NgW, upcomingEvent, str2, date, date2, false, z);
            n6r.A03 = c51626MrJ2;
            Date date3 = c51626MrJ2.A03;
            if (date3 == null) {
                Date date4 = c51626MrJ2.A04;
                if (date4 != null) {
                    date3 = new Date(date4.getTime() + N6R.A0B);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            OWa oWa = n6r.A00;
            if (oWa == null) {
                str = "datePickerController";
            } else {
                oWa.A02(true, n6r.requireContext().getString(2131952352), date3, null, null, true);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final void A01(Date date, Date date2) {
        Context context;
        C54735OFm c54735OFm = this.A03;
        if (date != null) {
            TextView textView = c54735OFm.A0C;
            context = this.A01;
            textView.setText(MX0.A02(context, this.A04, date.getTime()));
            textView.setVisibility(0);
            ImageView imageView = c54735OFm.A08;
            AbstractC166997dE.A19(context, imageView, R.drawable.instagram_x_pano_outline_12);
            Ok4.A00(imageView, 13, this);
            imageView.setImportantForAccessibility(1);
            AbstractC166997dE.A18(context, imageView, 2131957712);
            AbstractC56952jT.A01(imageView);
            c54735OFm.A01.setVisibility(0);
        } else {
            ImageView imageView2 = c54735OFm.A08;
            context = this.A01;
            AbstractC166997dE.A19(context, imageView2, R.drawable.instagram_chevron_right_pano_outline_12);
            Ok4.A00(imageView2, 14, this);
            imageView2.setImportantForAccessibility(2);
            c54735OFm.A0C.setVisibility(8);
            c54735OFm.A01.setVisibility(8);
        }
        if (date2 != null) {
            TextView textView2 = c54735OFm.A0A;
            textView2.setText(MX0.A02(context, this.A04, date2.getTime()));
            textView2.setVisibility(0);
            ImageView imageView3 = c54735OFm.A06;
            AbstractC166997dE.A19(context, imageView3, R.drawable.instagram_x_pano_outline_12);
            Ok4.A00(imageView3, 15, this);
            imageView3.setImportantForAccessibility(1);
            AbstractC166997dE.A18(context, imageView3, 2131957667);
            AbstractC56952jT.A01(imageView3);
            return;
        }
        ImageView imageView4 = c54735OFm.A06;
        AbstractC166997dE.A19(context, imageView4, R.drawable.instagram_chevron_right_pano_outline_12);
        Ok4.A00(imageView4, 16, this);
        imageView4.setImportantForAccessibility(2);
        c54735OFm.A0A.setVisibility(8);
    }
}
