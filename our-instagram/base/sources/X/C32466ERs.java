package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.ERs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32466ERs extends AbstractC65632xz {
    public final Context A00;
    public final C684436h A01;
    public final UserSession A02;
    public final IngestSessionShim A03;
    public final C54409O2p A04;
    public final InterfaceC58149PqE A05;
    public final InterfaceC58010Pnu A06;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Integer num;
        int A03 = C0f9.A03(-108522699);
        C36005Fv3 c36005Fv3 = (C36005Fv3) obj;
        C34635FNs c34635FNs = (C34635FNs) AbstractC31172DnG.A0x(view);
        InterfaceC58010Pnu interfaceC58010Pnu = this.A06;
        UserSession userSession = this.A02;
        P22 p22 = new P22(this.A00, null, userSession, this.A03, this.A05, c36005Fv3.A0A, null, interfaceC58010Pnu, false);
        C54409O2p c54409O2p = this.A04;
        C14360o3.A0B(c34635FNs, 0);
        AbstractC25229BEm.A1I(interfaceC58010Pnu, 3, c54409O2p);
        c34635FNs.A02.setActivated(c36005Fv3.A00);
        View view2 = c34635FNs.A00;
        ViewOnClickListenerC35666Fp0.A00(view2, 50, c54409O2p);
        InterfaceC56392iX interfaceC56392iX = c34635FNs.A05;
        interfaceC56392iX.setVisibility(0);
        ViewOnClickListenerC35666Fp0.A00(interfaceC56392iX.getView(), 51, c54409O2p);
        C14360o3.A0A(userSession);
        int A00 = AbstractC34041F0u.A00(userSession);
        TextView textView = (TextView) interfaceC56392iX.getView();
        if (A00 > 0) {
            textView.setText(AbstractC167017dG.A0k(view2.getResources(), A00, R.plurals.recipient_picker_close_friends_count));
        } else {
            textView.setText(2131969959);
        }
        interfaceC56392iX.getView();
        C35168FfK AXK = interfaceC58010Pnu.AXK();
        boolean z = true;
        if (AXK != null) {
            Integer num2 = AXK.A01(C51690MsL.A03).A01;
            C35168FfK AXK2 = interfaceC58010Pnu.AXK();
            C14360o3.A0A(AXK2);
            Integer num3 = AXK2.A01(C51690MsL.A07).A01;
            Integer num4 = C05F.A0N;
            if (num2 != num4 && num2 != (num = C05F.A0C) && num3 != num4 && num3 != num) {
                z = false;
            }
        }
        View view3 = c34635FNs.A01;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A01 = AbstractC125325le.A01(view3, 0);
        A01.A0G();
        if (z) {
            A01.A0I(0.0f);
            A01.A03 = 4;
            A01.A0H();
            AbstractC125325le A012 = AbstractC125325le.A01(view2, 0);
            A012.A0G();
            A012.A0I(0.5f);
            A012.A0H();
            c34635FNs.A06.A01.setClickable(false);
            view2.setClickable(false);
            interfaceC56392iX.getView().setClickable(false);
        } else {
            A01.A0I(1.0f);
            A01.A04 = 0;
            A01.A0H();
            AbstractC125325le A013 = AbstractC125325le.A01(view2, 0);
            A013.A0G();
            A013.A0I(1.0f);
            A013.A0H();
            C55096Ob7 c55096Ob7 = c34635FNs.A06;
            c55096Ob7.A01.setClickable(true);
            view2.setClickable(true);
            interfaceC56392iX.getView().setClickable(true);
            C51690MsL c51690MsL = C51690MsL.A05;
            C35168FfK AXK3 = interfaceC58010Pnu.AXK();
            if (AXK3 != null) {
                c55096Ob7.A03(AXK3.A01(c51690MsL), p22);
                c55096Ob7.A05(AbstractC25228BEl.A0M(view2).getString(2131960540), C05F.A00);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0A(1140282506, A03);
    }

    public C32466ERs(Context context, C684436h c684436h, UserSession userSession, IngestSessionShim ingestSessionShim, C54409O2p c54409O2p, InterfaceC58149PqE interfaceC58149PqE, InterfaceC58010Pnu interfaceC58010Pnu) {
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = interfaceC58149PqE;
        this.A04 = c54409O2p;
        this.A01 = c684436h;
        this.A06 = interfaceC58010Pnu;
        this.A03 = ingestSessionShim;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1292247303);
        UserSession userSession = this.A02;
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(A06), viewGroup, R.layout.recipient_picker_add_to_favorites_story, false);
        C34635FNs c34635FNs = new C34635FNs(A0C, userSession);
        ImageView imageView = c34635FNs.A02;
        C14360o3.A0A(A06);
        imageView.setImageDrawable(AbstractC172497mJ.A00(A06));
        c34635FNs.A03.setText(2131956264);
        A0C.setTag(c34635FNs);
        C0f9.A0A(-2124839340, A03);
        return A0C;
    }
}
