package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;
import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes7.dex */
public final class HHG extends AbstractC60592pi implements View.OnTouchListener {
    public static final List A0U = AbstractC166987dD.A1J(Hd5.A02);
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public ViewGroup A05;
    public InterfaceC56002hn A06;
    public ProductTile A07;
    public C39699HjV A08;
    public Integer A09;
    public Runnable A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public int[] A0F;
    public final int A0G;
    public final int A0H;
    public final Activity A0I;
    public final Context A0J;
    public final InterfaceC11380iw A0K;
    public final UserSession A0L;
    public final AbstractC668830f A0M;
    public final C42570Iso A0N;
    public final String A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final Resources A0T;

    public HHG(Activity activity, Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        AbstractC167007dF.A1G(userSession, 3, str);
        this.A0I = activity;
        this.A0J = context;
        this.A0L = userSession;
        this.A0K = interfaceC11380iw;
        this.A0O = str;
        this.A0N = new C42570Iso();
        this.A0P = J8X.A00(this, 26);
        this.A0R = J8X.A00(this, 28);
        this.A0Q = J8X.A00(this, 27);
        this.A0S = J8X.A00(this, 29);
        this.A09 = C05F.A00;
        this.A0F = new int[2];
        Resources resources = context.getResources();
        this.A0T = resources;
        this.A0G = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A0H = resources.getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        this.A0E = true;
        this.A0M = new HLO(this);
    }

    public static final boolean A03(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= i || f >= i + view.getWidth() || f2 <= i2 || f2 >= i2 + view.getHeight()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A0B = null;
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            viewGroup.removeView(this.A04);
        }
        this.A05 = null;
        this.A06 = null;
        this.A04 = null;
        this.A08 = null;
        this.A07 = null;
        this.A01 = 0;
        this.A00 = 0;
        this.A0E = true;
        this.A0A = null;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        this.A06 = C71Q.A00(view);
        ViewGroup A03 = AbstractC669130i.A03(this.A0I);
        this.A05 = A03;
        if (A03 != null) {
            A03.addView(this.A04, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    public static final void A00(HHG hhg) {
        ((ViewOnTouchListenerC668930g) hhg.A0S.getValue()).A01();
        ((C55982hj) hhg.A0Q.getValue()).A04();
        hhg.A09 = C05F.A0C;
    }

    public static final void A01(HHG hhg) {
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView;
        ProductTile productTile;
        Product product;
        C39699HjV c39699HjV = hhg.A08;
        if (c39699HjV != null && (igBouncyUfiButtonImageView = c39699HjV.A05) != null && (productTile = hhg.A07) != null && (product = productTile.A07) != null) {
            boolean A03 = AbstractC1563570f.A00(hhg.A0L).A03(product);
            igBouncyUfiButtonImageView.setSelected(A03);
            Context context = igBouncyUfiButtonImageView.getContext();
            int i = 2131972784;
            if (A03) {
                i = 2131972246;
            }
            AbstractC166997dE.A18(context, igBouncyUfiButtonImageView, i);
        }
    }

    public static final void A02(HHG hhg, double d) {
        RoundedCornerConstraintLayout roundedCornerConstraintLayout;
        Integer num = hhg.A09;
        if (num == C05F.A0N || num == C05F.A0C) {
            C39699HjV c39699HjV = hhg.A08;
            if (c39699HjV != null) {
                roundedCornerConstraintLayout = c39699HjV.A07;
            } else {
                roundedCornerConstraintLayout = null;
            }
            C14360o3.A0C(roundedCornerConstraintLayout, AbstractC111324zv.A00(2));
            float f = (float) d;
            float f2 = (0.19999999f * f) + 0.8f;
            roundedCornerConstraintLayout.setScaleX(f2);
            roundedCornerConstraintLayout.setScaleY(f2);
            View view = hhg.A04;
            if (view != null) {
                view.setAlpha(f);
                view.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.HjV, java.lang.Object] */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        Activity activity = this.A0I;
        C14360o3.A0B(activity, 0);
        boolean z = C50802Vb.A03;
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        C14360o3.A07(layoutInflater);
        View A01 = C50802Vb.A01(layoutInflater, null, R.layout.product_card_peek_preview);
        C14360o3.A0B(A01, 1);
        ?? obj = new Object();
        obj.A00 = (FrameLayout) AbstractC166997dE.A0R(A01, R.id.peek_container);
        obj.A07 = (RoundedCornerConstraintLayout) AbstractC166997dE.A0R(A01, R.id.product_image_container);
        obj.A02 = AbstractC31176DnK.A0D(A01, R.id.button_share);
        obj.A03 = AbstractC31176DnK.A0D(A01, R.id.button_shop);
        obj.A05 = (IgBouncyUfiButtonImageView) AbstractC166997dE.A0R(A01, R.id.button_save);
        obj.A01 = AbstractC31176DnK.A0D(A01, R.id.button_options);
        obj.A04 = AbstractC167007dF.A0N(A01, R.id.hold_indicator);
        C684336g c684336g = new C684336g();
        c684336g.A04(AbstractC25225BEi.A16(obj.A05));
        obj.A06 = c684336g;
        A01.setTag(obj);
        A01.setVisibility(8);
        Object tag = A01.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.widget.productcard.peek.ProductCardPeekViewBinder.Holder");
        this.A08 = (C39699HjV) tag;
        this.A04 = A01;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A09 = C05F.A00;
        InterfaceC56002hn interfaceC56002hn = this.A06;
        if (interfaceC56002hn != null) {
            interfaceC56002hn.COs(null);
        }
        AbstractC167007dF.A0x(this.A04);
        ((ViewOnTouchListenerC668930g) this.A0S.getValue()).A00();
    }

    public static final boolean A04(View view, HHG hhg, String str, float f, float f2) {
        TextView textView;
        if (view.getVisibility() == 0 && A03(view, f, f2)) {
            C39699HjV c39699HjV = hhg.A08;
            if (c39699HjV != null && (textView = c39699HjV.A04) != null) {
                textView.setAlpha(0.0f);
                textView.bringToFront();
                textView.setText(str);
            }
            hhg.A02 = view;
            view.getLocationInWindow(hhg.A0F);
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC56002hn interfaceC56002hn;
        boolean A1a = AbstractC167017dG.A1a(view, motionEvent);
        if ((motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == A1a) && (interfaceC56002hn = this.A06) != null) {
            interfaceC56002hn.COs(null);
        }
        ((ViewOnTouchListenerC668930g) this.A0S.getValue()).onTouch(view, motionEvent);
        if (this.A09 != C05F.A00) {
            return true;
        }
        return false;
    }
}
