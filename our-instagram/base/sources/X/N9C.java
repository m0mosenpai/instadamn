package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N9C extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final P27 A04;
    public final DirectPrivateStoryRecipientController A05;
    public final Ef3 A06;
    public final C195918ld A07;
    public final InterfaceC58010Pnu A08;
    public final Map A09;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N9C(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, P27 p27, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, Ef3 ef3, C195918ld c195918ld, InterfaceC58010Pnu interfaceC58010Pnu, Map map) {
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = p27;
        this.A08 = interfaceC58010Pnu;
        this.A03 = ingestSessionShim;
        this.A07 = c195918ld;
        this.A06 = ef3;
        this.A01 = interfaceC11380iw;
        this.A05 = directPrivateStoryRecipientController;
        this.A09 = map;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        String A00;
        int i2;
        int A03 = C0f9.A03(-637401135);
        OEO oeo = (OEO) AbstractC31172DnG.A0x(view);
        UserSession userSession = this.A02;
        Context context = this.A00;
        P27 p27 = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        InterfaceC58010Pnu interfaceC58010Pnu = this.A08;
        IngestSessionShim ingestSessionShim = this.A03;
        C195918ld c195918ld = this.A07;
        P23 p23 = new P23(context, interfaceC11380iw, userSession, ingestSessionShim, p27, this.A05, this.A06, c195918ld, interfaceC58010Pnu, this.A09);
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = p27.A00;
        if (!directPrivateStoryRecipientController.A0h) {
            directPrivateStoryRecipientController.A0h = true;
            UserSession userSession2 = directPrivateStoryRecipientController.A0B;
            AbstractC50568MTz.A00(MU0.VIEW, MU1.STORY, C82G.A0j, null, userSession2);
        }
        C131995xZ A002 = C196068lw.A00(userSession).A00(AbstractC55618On3.A00);
        if (C196068lw.A02(A002)) {
            str = A002.A04;
            A00 = AbstractC200008t4.A00(context, userSession, A002);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = oeo.A06;
            AbstractC76713cJ.A00(context, interfaceC11380iw, gradientSpinnerAvatarView, A002.A05);
            i2 = 0;
            gradientSpinnerAvatarView.setVisibility(0);
            oeo.A01.setVisibility(8);
            TextView textView = oeo.A02;
            int i3 = 2131960273;
            if (C18U.A06(C06090Tz.A05, userSession, 36330432572179312L)) {
                i3 = 2131960274;
            }
            textView.setText(i3);
        } else {
            Integer num = A002.A02;
            if (num != C05F.A01 && num != C05F.A0C) {
                oeo.A06.setVisibility(8);
                oeo.A02.setText(2131960274);
                C55096Ob7 c55096Ob7 = oeo.A05;
                C35168FfK AXK = interfaceC58010Pnu.AXK();
                AXK.getClass();
                c55096Ob7.A03(AXK.A01(C51690MsL.A08), p23);
                C0f9.A0A(-16533846, A03);
            }
            str = A002.A04;
            A00 = AbstractC200008t4.A00(context, userSession, A002);
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = oeo.A06;
            AbstractC76713cJ.A00(context, interfaceC11380iw, gradientSpinnerAvatarView2, A002.A05);
            i2 = 0;
            gradientSpinnerAvatarView2.setVisibility(0);
            oeo.A01.setVisibility(8);
        }
        TextView textView2 = oeo.A04;
        textView2.setVisibility(i2);
        if (A00 != null) {
            str = AbstractC31174DnI.A0t(context, str, A00, 2131964621);
        }
        textView2.setText(str);
        C55096Ob7 c55096Ob72 = oeo.A05;
        C35168FfK AXK2 = interfaceC58010Pnu.AXK();
        AXK2.getClass();
        c55096Ob72.A03(AXK2.A01(C51690MsL.A08), p23);
        C0f9.A0A(-16533846, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1234766355);
        UserSession userSession = this.A02;
        AbstractC35174FfR.A00(EnumC72435Xdf.A0L, userSession, "upsell_impressions");
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.recipient_picker_add_to_fb_story, viewGroup, false);
        OEO oeo = new OEO(inflate, userSession);
        ImageView imageView = oeo.A01;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Resources resources = viewGroup.getResources();
        Typeface A0R = AbstractC167017dG.A0R(context);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        imageView.setLayoutParams(layoutParams);
        oeo.A06.setLayoutParams(layoutParams);
        TextView textView = oeo.A02;
        textView.setTextSize(0, AbstractC166987dD.A04(resources, R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface(A0R);
        TextView textView2 = oeo.A03;
        textView2.setTextSize(0, AbstractC166987dD.A04(resources, R.dimen.abc_text_size_menu_header_material));
        textView2.setTypeface(A0R);
        inflate.setTag(oeo);
        C0f9.A0A(-79788527, A03);
        return inflate;
    }
}
