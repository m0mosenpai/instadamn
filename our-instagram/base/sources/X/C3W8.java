package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3W8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W8 implements C33R {
    public Activity A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View A03;
    public C9C3 A04;
    public UserSession A05;
    public InterfaceC60442pS A06;
    public C41167IKg A07;
    public C75113Zb A08;
    public Runnable A09;
    public final float A0A;
    public final Handler A0B = new Handler(Looper.getMainLooper());
    public final ViewStub A0C;
    public final InterfaceC11380iw A0D;

    public final View A00() {
        View view = this.A03;
        if (view == null) {
            view = this.A0C.inflate();
            if (view != null) {
                this.A03 = view;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        View.OnClickListener onClickListener = this.A01;
        View.OnClickListener onClickListener2 = this.A02;
        C41167IKg c41167IKg = this.A07;
        if (c41167IKg == null && onClickListener != null && onClickListener2 != null) {
            View findViewById = view.findViewById(R.id.row_feed_cta_redesign);
            C14360o3.A07(findViewById);
            c41167IKg = new C41167IKg(onClickListener, onClickListener2, (ViewStub) findViewById);
            this.A07 = c41167IKg;
        }
        C9C3 c9c3 = this.A04;
        if (c9c3 != null && c41167IKg != null) {
            c41167IKg.A00 = (ImageUrl) c9c3.A04;
            c41167IKg.A07.setText(2131972778);
            c41167IKg.A06.setVisibility(8);
            c41167IKg.A05.setText(2131972779);
        }
        return view;
    }

    public final void A01(int i) {
        C41167IKg c41167IKg;
        if (this.A03 != null && (c41167IKg = this.A07) != null) {
            c41167IKg.A04.setVisibility(i);
        }
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C75113Zb c75113Zb2;
        if (i == 9 && (c75113Zb2 = this.A08) != null && !c75113Zb2.A2X) {
            InterfaceC11380iw interfaceC11380iw = this.A0D;
            UserSession userSession = this.A05;
            Activity activity = this.A00;
            View A00 = A00();
            A01(0);
            C75113Zb c75113Zb3 = this.A08;
            if (c75113Zb3 != null) {
                c75113Zb3.A2X = true;
            }
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A0F = AbstractC125325le.A01(A00, 0).A0F(true);
            A0F.A0T(this.A0A, 0.0f);
            A0F.A05 = new J0N(activity, A00, userSession, this);
            A0F.A0H();
            C41167IKg c41167IKg = this.A07;
            if (c41167IKg != null) {
                ImageUrl imageUrl = c41167IKg.A00;
                if (imageUrl != null) {
                    c41167IKg.A0A.setUrl(imageUrl, interfaceC11380iw);
                }
                View view = c41167IKg.A02;
                if (view != null) {
                    view.setVisibility(8);
                    View view2 = c41167IKg.A03;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            AbstractC77703du.A05(A00, EnumC77673dr.A0R);
        }
    }

    public C3W8(ViewStub viewStub, InterfaceC11380iw interfaceC11380iw) {
        float f;
        this.A0C = viewStub;
        this.A0D = interfaceC11380iw;
        C41167IKg c41167IKg = this.A07;
        if (c41167IKg != null) {
            f = c41167IKg.A01;
        } else {
            f = 0.0f;
        }
        this.A0A = f;
    }
}
