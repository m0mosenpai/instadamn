package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.Ely, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33264Ely extends AnonymousClass522 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33264Ely(FragmentActivity fragmentActivity, UserSession userSession, C34493FIf c34493FIf, int i) {
        super(Integer.valueOf(i));
        this.A03 = c34493FIf;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        switch (this.A00) {
            case 0:
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                Context context = (Context) this.A01;
                C14360o3.A0A(context);
                C35133Fea.A01(context, ((C50649MXo) this.A03).A04, c35133Fea, AbstractC31171DnF.A0R(MSV.A00(51)), ((Resources) this.A02).getString(2131965052));
                return;
            case 1:
                Context context2 = (Context) this.A01;
                UserSession userSession = (UserSession) this.A03;
                OA5 oa5 = (OA5) this.A02;
                AbstractC31177DnL.A0u(context2, userSession, C2Fb.A1W, oa5.A01);
                oa5.A02.invoke();
                return;
            case 2:
                A0y = AbstractC25228BEl.A0y((Context) this.A01, (UserSession) this.A03, C2Fb.A1n, ((C50679MYx) this.A02).A01);
                break;
            case 3:
                ((C34493FIf) this.A03).A00.onActionClicked();
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                AbstractC25228BEl.A1G((Activity) this.A01, AbstractC31178DnM.A06("origin", "MESSAGING_LED"), abstractC12990ll, ModalActivity.class, "fan_club_creator_settings");
                return;
            case 4:
                UserSession userSession2 = (UserSession) this.A03;
                A0y = AbstractC25228BEl.A0y((Context) this.A01, userSession2, C2Fb.A1V, ((E99) ((InterfaceC37092GWb) this.A02)).A02);
                break;
            default:
                ((TextView) this.A03).setHighlightColor(((Context) this.A02).getColor(R.color.fds_transparent));
                AbstractC32317ELg abstractC32317ELg = (AbstractC32317ELg) this.A01;
                EfC efC = new EfC();
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC31175DnJ.A0r(A0b, abstractC32317ELg.A00);
                efC.setArguments(A0b);
                C3DN A01 = C3DN.A00.A01(abstractC32317ELg.getContext());
                A01.getClass();
                A01.A0J(efC);
                return;
        }
        A0y.A0A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33264Ely(Context context, UserSession userSession, OA5 oa5, int i) {
        super(Integer.valueOf(i));
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = oa5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33264Ely(Context context, TextView textView, Ef8 ef8, Integer num) {
        super(num);
        this.A01 = ef8;
        this.A03 = textView;
        this.A02 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33264Ely(Context context, C50679MYx c50679MYx, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = c50679MYx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33264Ely(Context context, Resources resources, C50649MXo c50649MXo, int i) {
        super(Integer.valueOf(i));
        this.A01 = context;
        this.A03 = c50649MXo;
        this.A02 = resources;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33264Ely(Context context, UserSession userSession, InterfaceC37092GWb interfaceC37092GWb, int i) {
        super(Integer.valueOf(i));
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = interfaceC37092GWb;
    }
}
