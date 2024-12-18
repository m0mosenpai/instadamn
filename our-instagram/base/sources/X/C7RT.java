package X;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RT implements C7QC {
    public final InterfaceC165417aU A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public C7RT(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165417aU interfaceC165417aU) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A00 = interfaceC165417aU;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void ADy(C7SN c7sn, C45272K2a c45272K2a) {
        C14360o3.A0B(c7sn, 0);
        if (c45272K2a != null) {
            UserSession userSession = this.A02;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            InterfaceC56392iX interfaceC56392iX = c7sn.A00;
            interfaceC56392iX.setVisibility(0);
            ImageView imageView = (ImageView) interfaceC56392iX.getView();
            imageView.setBackgroundColor(c45272K2a.A00);
            imageView.setImageTintList(ColorStateList.valueOf(c45272K2a.A01));
            C0fQ.A00(new LPD(interfaceC11380iw, userSession, c7sn, c45272K2a), interfaceC56392iX.getView());
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.clips_stacks_shortcut_stub, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        return new C7SN(AbstractC56372iV.A01(inflate, false, false), this.A00);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C7SN c7sn = (C7SN) c7qd;
        C14360o3.A0B(c7sn, 0);
        InterfaceC56392iX interfaceC56392iX = c7sn.A00;
        interfaceC56392iX.setVisibility(8);
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setOnClickListener(null);
        }
    }
}
