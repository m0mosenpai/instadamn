package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;

/* renamed from: X.Lf7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48631Lf7 implements C8DK {
    public View A00;
    public View A01;
    public final Activity A02;
    public final Context A03;
    public final View A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC1810081c A07;
    public final DirectThreadKey A08;
    public final Integer A09;
    public final InterfaceC08830cm A0A;

    @Override // X.C8DK
    public final void EQs(boolean z) {
    }

    @Override // X.C8DK
    public final void Ede(boolean z) {
        View[] viewArr = {this.A04};
        if (z) {
            AbstractC125325le.A07(viewArr, true);
        } else {
            AbstractC125325le.A05(viewArr, true);
        }
    }

    public C48631Lf7(Context context, View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1810081c interfaceC1810081c, DirectThreadKey directThreadKey, Integer num, InterfaceC08830cm interfaceC08830cm) {
        String str;
        C81663kb A0h;
        ImageUrl imageUrl;
        AbstractC25234BEr.A1P(view, context, userSession);
        this.A04 = view;
        this.A03 = context;
        this.A07 = interfaceC1810081c;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A08 = directThreadKey;
        this.A09 = num;
        this.A0A = interfaceC08830cm;
        this.A02 = AbstractC13330mJ.A00(context);
        view.setVisibility(0);
        View view2 = this.A04;
        this.A01 = view2.requireViewById(R.id.magic_media_remix_send_button_container);
        TextView A0N = AbstractC167007dF.A0N(view2, R.id.magic_media_remix_send_button_text);
        Context context2 = this.A03;
        AbstractC166987dD.A1P(context2, A0N, 2131960425);
        ViewStub A0M = AbstractC167007dF.A0M(view2, R.id.magic_media_remix_send_button_stub);
        A0M.setLayoutResource(R.layout.direct_multi_media_tray_button_stacked_avatar);
        Context context3 = view2.getContext();
        AbstractC31173DnH.A0z(context3, A0M, R.drawable.direct_large_avatar_button_background);
        DirectThreadKey directThreadKey2 = this.A08;
        InterfaceC11380iw interfaceC11380iw2 = this.A05;
        if (directThreadKey2 != null && (((str = directThreadKey2.A00) != null || (str = directThreadKey2.A01) != null) && (A0h = AbstractC31172DnG.A0h(AbstractC28761aE.A00(this.A06), str)) != null)) {
            View inflate = A0M.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.stackedavatar.StackedAvatarView");
            StackedAvatarView stackedAvatarView = (StackedAvatarView) inflate;
            boolean A1S = AbstractC25230BEn.A1S(A0h.BSH().size(), 1);
            if (AbstractC166987dD.A1b(A0h.BSH())) {
                imageUrl = AbstractC31177DnL.A0T(A0h.BSH(), 0);
            } else {
                imageUrl = null;
            }
            stackedAvatarView.setUrls(imageUrl, A1S ? AbstractC31177DnL.A0T(A0h.BSH(), 1) : null, interfaceC11380iw2);
            JQ1.A0S(context3, stackedAvatarView, A1S);
            stackedAvatarView.setRingColor(AbstractC31173DnH.A03(context2, context3, R.attr.igds_color_primary_button_on_media));
        }
        View view3 = this.A01;
        String str2 = "sendButton";
        if (view3 != null) {
            view3.setVisibility(0);
            View view4 = this.A01;
            if (view4 != null) {
                ViewOnClickListenerC48063LPo.A00(view4, 32, this);
                View requireViewById = this.A04.requireViewById(R.id.magic_media_remix_edit_button_container);
                this.A00 = requireViewById;
                if (requireViewById == null) {
                    str2 = "editButton";
                } else {
                    ViewOnClickListenerC48063LPo.A00(requireViewById, 31, this);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }
}
