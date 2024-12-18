package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class W5D {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public FragmentActivity A03;
    public UserSession A04;
    public Drawable A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;

    public W5D(UserSession userSession, FragmentActivity fragmentActivity, View view) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A03 = fragmentActivity;
        this.A06 = view;
        View findViewById = view.findViewById(R.id.audience_potential_reach_view);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById.findViewById(R.id.potential_reach_number_view);
            ImageView imageView = null;
            if (textView != null) {
                textView.setText(2131970377);
            } else {
                textView = null;
            }
            this.A02 = textView;
            Context context = findViewById.getContext();
            Drawable drawable = context.getDrawable(R.drawable.instagram_info_pano_outline_24);
            this.A05 = drawable;
            if (drawable != null) {
                AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A08(context));
            }
            ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.audience_size_education_icon);
            if (imageView2 != null) {
                imageView2.setImageDrawable(this.A05);
                WNT.A00(imageView2, 14, this);
                imageView = imageView2;
            }
            this.A01 = imageView;
            this.A00 = findViewById.findViewById(R.id.potential_reach_progress_bar);
            this.A09 = findViewById.findViewById(R.id.rating_too_specific_bar_container);
            this.A07 = findViewById.findViewById(R.id.rating_great_bar_container);
            this.A08 = findViewById.findViewById(R.id.rating_too_broad_bar_container);
            TextView textView2 = (TextView) findViewById.findViewById(R.id.potential_reach_number_sub_title);
            if (textView2 != null) {
                textView2.setText(2131970379);
            }
        }
    }

    public final void A01() {
        this.A03 = null;
        this.A06 = null;
        this.A02 = null;
        this.A01 = null;
        this.A05 = null;
        this.A00 = null;
        this.A09 = null;
        this.A07 = null;
        this.A08 = null;
    }

    public final void A02(C51758Mth c51758Mth) {
        AudiencePotentialReachRating audiencePotentialReachRating;
        C14360o3.A0B(c51758Mth, 0);
        if (c51758Mth.A01) {
            A00(null);
            TextView textView = this.A02;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.A01;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        PromoteAudiencePotentialReach promoteAudiencePotentialReach = (PromoteAudiencePotentialReach) c51758Mth.A00;
        if (promoteAudiencePotentialReach != null) {
            int i = promoteAudiencePotentialReach.A01;
            int i2 = promoteAudiencePotentialReach.A02;
            boolean A0R = WGs.A0R(promoteAudiencePotentialReach);
            TextView textView2 = this.A02;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            ImageView imageView2 = this.A01;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            AbstractC167007dF.A0x(this.A00);
            TextView textView3 = this.A02;
            if (textView3 != null) {
                if (A0R) {
                    textView3.setText(AnonymousClass001.A0g(WGs.A04(i), " - ", WGs.A04(i2)));
                } else {
                    textView3.setText(2131970377);
                }
            }
            audiencePotentialReachRating = promoteAudiencePotentialReach.A03;
        } else {
            TextView textView4 = this.A02;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            ImageView imageView3 = this.A01;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            AbstractC167007dF.A0x(this.A00);
            TextView textView5 = this.A02;
            if (textView5 != null) {
                textView5.setText(2131970377);
            }
            audiencePotentialReachRating = AudiencePotentialReachRating.A06;
        }
        A00(audiencePotentialReachRating);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(com.instagram.business.promote.model.AudiencePotentialReachRating r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.A09
            r4 = 8
            if (r3 == 0) goto L23
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L1d
            android.content.Context r1 = r3.getContext()
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC31172DnG.A1B(r1, r2, r0)
        L1d:
            r0 = 2131439274(0x7f0b2eaa, float:1.8500499E38)
            X.AbstractC31176DnK.A1E(r3, r0, r4)
        L23:
            android.view.View r3 = r6.A07
            if (r3 == 0) goto L44
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L3e
            android.content.Context r1 = r3.getContext()
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC31172DnG.A1B(r1, r2, r0)
        L3e:
            r0 = 2131439274(0x7f0b2eaa, float:1.8500499E38)
            X.AbstractC31176DnK.A1E(r3, r0, r4)
        L44:
            android.view.View r3 = r6.A08
            if (r3 == 0) goto L65
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L5f
            android.content.Context r1 = r3.getContext()
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC31172DnG.A1B(r1, r2, r0)
        L5f:
            r0 = 2131439274(0x7f0b2eaa, float:1.8500499E38)
            X.AbstractC31176DnK.A1E(r3, r0, r4)
        L65:
            if (r7 == 0) goto Laa
            int r4 = r7.A00
            int r1 = r7.ordinal()
            r0 = 4
            r5 = 0
            if (r1 == r0) goto Ld5
            r0 = 2
            if (r1 == r0) goto Lc0
            r0 = 3
            if (r1 == r0) goto Lab
            r0 = 1
            if (r1 == r0) goto Lab
            if (r1 != r5) goto Laa
            android.view.View r3 = r6.A07
            if (r3 == 0) goto Laa
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L97
            android.content.Context r1 = r3.getContext()
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
        L90:
            int r0 = X.AbstractC53242c7.A0H(r1, r0)
            X.AbstractC31172DnG.A1B(r1, r2, r0)
        L97:
            r0 = 2131439274(0x7f0b2eaa, float:1.8500499E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto Laa
            if (r4 == 0) goto Laa
            r0.setVisibility(r5)
            r0.setText(r4)
        Laa:
            return
        Lab:
            android.view.View r3 = r6.A08
            if (r3 == 0) goto Laa
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L97
            android.content.Context r1 = r3.getContext()
            r0 = 2130970234(0x7f04067a, float:1.7549172E38)
            goto L90
        Lc0:
            android.view.View r3 = r6.A09
            if (r3 == 0) goto Laa
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L97
            android.content.Context r1 = r3.getContext()
            r0 = 2130970217(0x7f040669, float:1.7549138E38)
            goto L90
        Ld5:
            android.view.View r3 = r6.A07
            if (r3 == 0) goto Laa
            r0 = 2131439273(0x7f0b2ea9, float:1.8500496E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L97
            android.content.Context r1 = r3.getContext()
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5D.A00(com.instagram.business.promote.model.AudiencePotentialReachRating):void");
    }
}
