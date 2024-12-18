package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.base.BoundedLinearLayout;
import com.instagram.user.follow.FollowButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.UGs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66423UGs extends C2UU {
    public int A00;
    public C47K A01;
    public InterfaceC63842v5 A02;
    public final int A03;
    public final Context A04;
    public final InterfaceC11380iw A05;
    public final C25671My A06;
    public final UserSession A07;
    public final C63872v8 A08;
    public final Integer A09;
    public final Runnable A0A;
    public final String A0B;
    public final Map A0D = new HashMap();
    public final List A0C = new ArrayList();

    public final void A01(C47K c47k) {
        this.A01 = c47k;
        List list = this.A0C;
        list.clear();
        List A04 = c47k.A04();
        A04.getClass();
        list.addAll(A04);
        this.A0D.clear();
        notifyDataSetChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r0.B5n() == X.C1XV.A0t) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r11, int r12) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66423UGs.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i == 1) {
                View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A04), viewGroup, R.layout.topic_recommendation_card);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                TextView A06 = AbstractC31180DnO.A06(A0A);
                TextView A0E = AbstractC31176DnK.A0E(A0A);
                String str = this.A0B;
                return new C66481UJf(A0A, null, (ImageView) A0A.findViewById(R.id.topic_facepile), A06, A0E, null, (IgImageView) A0A.findViewById(R.id.topic_image), null, null, null, null, null, str);
            }
            throw new UnsupportedOperationException("Unknown view type");
        }
        Context context = this.A04;
        View inflate = LayoutInflater.from(context).inflate(R.layout.interest_recommendation_card, viewGroup, false);
        IgImageButton igImageButton = new IgImageButton(context);
        IgImageButton igImageButton2 = new IgImageButton(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams.setMargins(0, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing));
        igImageButton2.setLayoutParams(layoutParams);
        IgImageButton igImageButton3 = new IgImageButton(context);
        igImageButton3.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ViewGroup viewGroup2 = (ViewGroup) inflate.requireViewById(R.id.media_grid);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        MSY.A10(linearLayout, -1, -2);
        viewGroup2.addView(linearLayout, 0);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(igImageButton2);
        linearLayout2.addView(igImageButton3);
        int i3 = this.A03;
        int A04 = AbstractC166997dE.A04(context, R.dimen.photo_grid_spacing);
        int i4 = (i3 - (A04 * 2)) / 3;
        int i5 = (i4 * 2) + A04;
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i5, i5);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i5);
        layoutParams3.setMarginEnd(A04);
        linearLayout.addView(linearLayout2, layoutParams3);
        linearLayout.addView(igImageButton, 1, layoutParams2);
        ((BoundedLinearLayout) inflate.requireViewById(R.id.interest_recommendation_info_view)).setMaxWidth(i3);
        MSY.A10(inflate.requireViewById(R.id.gradient), -1, i3 / 3);
        int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        CircularImageView circularImageView = (CircularImageView) inflate.findViewById(R.id.profile_image);
        TextView A062 = AbstractC31180DnO.A06(inflate);
        TextView A0E2 = AbstractC31176DnK.A0E(inflate);
        FollowButton followButton = (FollowButton) inflate.findViewById(R.id.user_follow_button);
        return new C66481UJf(inflate, inflate.findViewById(R.id.interest_recommendation_dismiss_button), null, A062, A0E2, circularImageView, null, (HashtagFollowButton) inflate.findViewById(R.id.hashtag_follow_button), igImageButton, igImageButton2, igImageButton3, followButton, this.A0B);
    }

    public C66423UGs(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63872v8 c63872v8, Integer num, Runnable runnable, String str, int i) {
        this.A04 = context;
        this.A0A = runnable;
        this.A07 = userSession;
        this.A06 = AbstractC25651Mw.A00(userSession);
        this.A05 = interfaceC11380iw;
        this.A00 = i;
        this.A0B = str;
        this.A09 = num;
        this.A08 = c63872v8;
        this.A03 = (int) (AbstractC13880nE.A0A(context) * 0.78f);
    }

    public static void A00(Context context, InterfaceC11380iw interfaceC11380iw, IgImageButton igImageButton, Iterator it, boolean z) {
        int i;
        ImageUrl A1q;
        if (it.hasNext()) {
            C38321qM c38321qM = (C38321qM) it.next();
            if (z) {
                A1q = c38321qM.A1S();
            } else {
                A1q = c38321qM.A1q(context);
            }
            if (A1q == null) {
                A1q = new SimpleImageUrl("");
            }
            igImageButton.setUrl(A1q, interfaceC11380iw);
            i = 0;
            igImageButton.setEnableTouchOverlay(false);
        } else {
            i = 4;
        }
        igImageButton.setVisibility(i);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1883874045);
        int size = this.A0C.size();
        C0f9.A0A(129984350, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(119247348);
        Object obj = this.A0C.get(i);
        if (obj instanceof FOC) {
            Integer A00 = FVZ.A00((FOC) obj);
            int i2 = 0;
            int i3 = 942373628;
            if (A00 == C05F.A0C) {
                i2 = 1;
                i3 = 1085393605;
            }
            C0f9.A0A(i3, A03);
            return i2;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unknown view type");
        C0f9.A0A(-1695906883, A03);
        throw unsupportedOperationException;
    }
}
