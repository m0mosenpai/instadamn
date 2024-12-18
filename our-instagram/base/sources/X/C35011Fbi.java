package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.List;

/* renamed from: X.Fbi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35011Fbi {
    public MessagingUser A00;
    public List A01;
    public final ViewGroup A02;
    public final C56352iT A03;
    public final UserSession A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final CircularImageView A07;
    public final C7EJ A08;
    public final View A09;
    public final View A0A;
    public final View A0B;

    public C35011Fbi(ViewGroup viewGroup, UserSession userSession, C7EJ c7ej) {
        AbstractC25233BEq.A0v(1, userSession, viewGroup, c7ej);
        this.A04 = userSession;
        this.A02 = viewGroup;
        this.A08 = c7ej;
        viewGroup.setClickable(true);
        C56352iT c56352iT = new C56352iT(ViewOnClickListenerC35656Foq.A00, viewGroup);
        this.A03 = c56352iT;
        C3LO A0I = AbstractC31176DnK.A0I();
        A0I.A05 = 2131954754;
        A0I.A0G = ViewOnClickListenerC35681FpG.A00(this, 64);
        c56352iT.Ehd(new C3LY(A0I));
        Context context = viewGroup.getContext();
        c56352iT.EPD(context.getDrawable(AbstractC53242c7.A0D(context)));
        c56352iT.EkG(false);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_more_horizontal_pano_outline_24;
        A0B.A05 = 2131966337;
        A0B.A0G = ViewOnClickListenerC35681FpG.A00(this, 65);
        this.A0A = c56352iT.AA9(new C3LY(A0B));
        C3LO A0B2 = AbstractC31171DnF.A0B();
        A0B2.A06 = R.drawable.instagram_download_pano_outline_24;
        A0B2.A05 = 2131961143;
        A0B2.A0G = ViewOnClickListenerC35681FpG.A00(this, 66);
        this.A09 = c56352iT.AA9(new C3LY(A0B2));
        C3LO A0B3 = AbstractC31171DnF.A0B();
        A0B3.A06 = R.drawable.instagram_direct_pano_outline_24;
        A0B3.A05 = 2131973639;
        A0B3.A0G = ViewOnClickListenerC35681FpG.A00(this, 67);
        this.A0B = c56352iT.AA9(new C3LY(A0B3));
        c56352iT.A0L.setVisibility(4);
        View ESm = c56352iT.ESm(R.layout.intermediate_permanent_media_viewer_action_bar_title, 0, 0, true);
        C14360o3.A0C(ESm, "null cannot be cast to non-null type android.view.ViewGroup");
        CircularImageView A0T = AbstractC31173DnH.A0T(ESm, R.id.sender_profile_picture);
        this.A07 = A0T;
        IgTextView A0X = AbstractC31172DnG.A0X(ESm, R.id.sender_name);
        this.A06 = A0X;
        ViewOnClickListenerC35681FpG.A01(A0X, 68, this);
        ViewOnClickListenerC35681FpG.A01(A0T, 69, this);
        this.A05 = AbstractC31172DnG.A0X(ESm, R.id.timestamp);
    }

    public final void A01(List list) {
        this.A01 = AbstractC001800i.A0a(list);
        View view = this.A0B;
        view.setVisibility(8);
        if (list.contains(EnumC33362Eov.A06)) {
            view.setVisibility(0);
        }
        if (list.isEmpty()) {
            this.A09.setVisibility(8);
        } else {
            boolean equals = list.equals(AbstractC166987dD.A1J(EnumC33362Eov.A03));
            View view2 = this.A09;
            if (equals) {
                view2.setVisibility(0);
            } else {
                view2.setVisibility(8);
                this.A0A.setVisibility(0);
                return;
            }
        }
        this.A0A.setVisibility(8);
    }

    public static final C199928sw A00(C35011Fbi c35011Fbi, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        Integer num;
        Context context = c35011Fbi.A02.getContext();
        String A0p = AbstractC166997dE.A0p(context, i);
        Drawable drawable = context.getDrawable(i2);
        G85 g85 = new G85(interfaceC16820sZ, 5);
        if (z) {
            num = AbstractC31174DnI.A0p(context);
        } else {
            num = null;
        }
        return new C199928sw(null, drawable, null, g85, num, A0p, 0, 0, 0, false, false, false, true, false, false, false);
    }
}
