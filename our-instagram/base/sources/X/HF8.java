package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HF8 extends AbstractC65632xz {
    public final InterfaceC43444JHi A00;
    public final InterfaceC11380iw A01;
    public final HH9 A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C39695HjR c39695HjR = (C39695HjR) obj;
        AbstractC167007dF.A1K(anonymousClass306, c39695HjR);
        InterfaceC43444JHi interfaceC43444JHi = this.A00;
        User user = c39695HjR.A00;
        C14360o3.A07(user);
        interfaceC43444JHi.A8F(user);
        anonymousClass306.A7a(0);
    }

    public HF8(InterfaceC11380iw interfaceC11380iw, HH9 hh9, InterfaceC43444JHi interfaceC43444JHi) {
        this.A01 = interfaceC11380iw;
        this.A00 = interfaceC43444JHi;
        this.A02 = hh9;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(65867584);
        AbstractC167017dG.A1P(view, obj);
        this.A00.EDC(view);
        Object tag = view.getTag();
        if (tag != null) {
            C38476Gvx c38476Gvx = (C38476Gvx) tag;
            C39695HjR c39695HjR = (C39695HjR) obj;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            String str = c39695HjR.A02;
            C14360o3.A07(str);
            String str2 = c39695HjR.A01;
            ImageUrl Bhu = c39695HjR.A00.Bhu();
            ViewOnClickListenerC38053Gog A02 = ViewOnClickListenerC38053Gog.A02(obj, this, 25);
            AbstractC167017dG.A1N(c38476Gvx, interfaceC11380iw);
            C0fQ.A00(A02, c38476Gvx.A00);
            c38476Gvx.A02.setText(str);
            c38476Gvx.A01.setText(str2);
            c38476Gvx.A03.setUrl(Bhu, interfaceC11380iw);
            C0f9.A0A(1586750567, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-827677120, A03);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -2025024343);
        View A0D = AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.account_section, false);
        A0D.setTag(new C38476Gvx(A0D));
        C0f9.A0A(1529786192, A0G);
        return A0D;
    }
}
