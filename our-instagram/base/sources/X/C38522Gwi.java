package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.ui.widget.base.AspectRatioFrameLayout;

/* renamed from: X.Gwi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38522Gwi extends C3OO implements C3h2 {
    public DialogInterfaceOnDismissListenerC41846Ig0 A00;
    public JPd A01;
    public final View A02;
    public final TextView A03;
    public final UserSession A04;
    public final UserSession A05;
    public final C44376JjF A06;
    public final C57012jc A07;
    public final C57012jc A08;
    public final C57012jc A09;
    public final InterfaceC60442pS A0A;
    public final InterfaceC60442pS A0B;
    public final C86073se A0C;
    public final JGB A0D;
    public final JPc A0E;
    public final IGTVViewerLoggingToken A0F;
    public final String A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final int A0J;
    public final View A0K;
    public final View A0L;
    public final TextView A0M;
    public final TextView A0N;
    public final JGB A0O;
    public final AspectRatioFrameLayout A0P;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03(android.content.Context r16, com.instagram.common.session.UserSession r17, X.C44376JjF r18, X.C57012jc r19, X.JPd r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38522Gwi.A03(android.content.Context, com.instagram.common.session.UserSession, X.JjF, X.2jc, X.JPd, java.lang.String):boolean");
    }

    @Override // X.C3h2
    public final void D9l(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r2 == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.JPd r10, X.C38522Gwi r11) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38522Gwi.A01(X.JPd, X.Gwi):void");
    }

    public static void A02(C38522Gwi c38522Gwi, boolean z) {
        int i = 0;
        c38522Gwi.A06.setVisible(z, false);
        c38522Gwi.A0L.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        C57012jc c57012jc = c38522Gwi.A07;
        if (z) {
            i = 8;
        }
        c57012jc.A03(i);
    }

    @Override // X.C3h2
    public final void D3H(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        UserSession userSession = this.A05;
        AbstractC41653Ibl.A01(interfaceC38401qU, userSession);
        AbstractC41647Ibf.A01(EnumC39628Hem.CLEAR_MEDIA_COVER, EnumC39624Hei.A00(interfaceC109864xE), interfaceC38401qU, userSession, this.A0B);
    }

    @Override // X.C3h2
    public final void DWg(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        if (interfaceC38401qU instanceof C38321qM) {
            interfaceC109864xE.getActionUrl().getClass();
            UserSession userSession = this.A05;
            InterfaceC60442pS interfaceC60442pS = this.A0B;
            EnumC39628Hem enumC39628Hem = EnumC39628Hem.OPEN_BLOKS_APP;
            enumC39628Hem.A00 = interfaceC109864xE.getActionUrl();
            AbstractC41647Ibf.A01(enumC39628Hem, EnumC39624Hei.A00(interfaceC109864xE), interfaceC38401qU, userSession, interfaceC60442pS);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.instagram.igtv.model.IGTVViewerLoggingToken, java.lang.Object] */
    public C38522Gwi(Context context, View view, UserSession userSession, InterfaceC60442pS interfaceC60442pS, JGB jgb, EnumC39626Hek enumC39626Hek, DialogInterfaceOnDismissListenerC41846Ig0 dialogInterfaceOnDismissListenerC41846Ig0, JPc jPc, boolean z, boolean z2) {
        super(view);
        View requireViewById;
        AbstractC167027dH.A0a(1, view, jgb, userSession, jPc);
        C14360o3.A0B(interfaceC60442pS, 5);
        this.A0D = jgb;
        this.A04 = userSession;
        this.A0E = jPc;
        this.A0A = interfaceC60442pS;
        ?? obj = new Object();
        this.A0F = obj;
        this.A0I = z;
        this.A0H = z2;
        String moduleName = interfaceC60442pS.getModuleName();
        this.A0G = moduleName;
        this.A0B = interfaceC60442pS;
        this.A0O = jgb;
        this.A05 = userSession;
        obj.A03 = enumC39626Hek.A00;
        obj.A05 = moduleName;
        obj.A02 = EnumC39586Hdw.A0M.A00;
        this.A0M = AbstractC166997dE.A0T(view, R.id.item_title);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.username);
        this.A03 = A0T;
        A0T.setVisibility(AbstractC167007dF.A05(this.A0I ? 1 : 0));
        if (view instanceof AspectRatioFrameLayout) {
            requireViewById = view;
        } else {
            requireViewById = view.requireViewById(R.id.aspect_ratio_container);
        }
        this.A0P = (AspectRatioFrameLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.cover_photo_container);
        this.A0K = requireViewById2;
        this.A07 = AbstractC31177DnL.A0V(view, R.id.hidden_media_stub);
        this.A0C = AbstractC86053sc.A00((ViewStub) view.findViewById(R.id.media_cover_view_stub));
        this.A0L = view.requireViewById(R.id.metadata_overlay);
        this.A09 = AbstractC31177DnL.A0V(this.itemView, R.id.selection_checkbox);
        this.A0N = AbstractC166997dE.A0T(view, R.id.view_count);
        View requireViewById3 = view.requireViewById(R.id.series_tag);
        this.A02 = requireViewById3;
        requireViewById3.setVisibility(AbstractC167007dF.A05(this.A0H ? 1 : 0));
        this.A08 = AbstractC31177DnL.A0V(this.itemView, R.id.indicator_icon_viewstub);
        C44376JjF c44376JjF = new C44376JjF(context, 0.2f, 0.5f, 0.0f, 0.2f, 0.6f, -1, context.getColor(R.color.action_bar_semi_transparent_white), context.getColor(AbstractC53242c7.A0D(context)), 300L, false, false, false, false);
        this.A06 = c44376JjF;
        requireViewById2.setBackground(c44376JjF);
        this.A00 = dialogInterfaceOnDismissListenerC41846Ig0;
        int integer = view.getResources().getInteger(R.integer.igtv_destination_grid_columns);
        this.A0J = Math.round(((AbstractC13880nE.A0A(context) - ((r9.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) * 2) + ((integer - 1) * r9.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right)))) / integer) / 0.643f);
        AbstractC56952jT.A01(view);
        ViewOnClickListenerC42029Ijy.A00(view, this, userSession, jgb, 18);
        view.setOnLongClickListener(new ViewOnLongClickListenerC55478OkX(2, this, userSession));
    }

    public static final void A00(C44376JjF c44376JjF, C57012jc c57012jc, JPd jPd, Integer num) {
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        Bitmap bitmap = c44376JjF.A01;
        if (bitmap != null) {
            A19.A00(bitmap, A01);
        }
        if (jPd.CY4()) {
            jPd.BQN();
        } else if (jPd.AiE() == null) {
            return;
        }
        View A012 = c57012jc.A01();
        C14360o3.A07(A012);
        C14360o3.A0B(num, 0);
        View findViewById = A012.findViewById(R.id.hidden_item_title);
        View findViewById2 = A012.findViewById(R.id.hidden_item_description);
        View findViewById3 = A012.findViewById(R.id.hidden_item_button);
        View findViewById4 = A012.findViewById(R.id.hidden_item_see_why);
        ImageView imageView = (ImageView) A012.findViewById(R.id.hidden_item_icon);
        if (num.intValue() == 0) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
            findViewById4.setVisibility(8);
            imageView.setImageResource(R.drawable.instagram_eye_off_pano_outline_24);
        }
    }
}
