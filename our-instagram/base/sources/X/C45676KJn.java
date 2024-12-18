package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.KJn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45676KJn extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;

    public C45676KJn(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44796JsH(this.A00, AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.immersive_catch_up_clips_item_layout, false), this.A01);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        User A14;
        C45192JzY c45192JzY = (C45192JzY) interfaceC66482zP;
        C44796JsH c44796JsH = (C44796JsH) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c45192JzY, c44796JsH);
        C38321qM c38321qM = c45192JzY.A00.A02;
        if (c38321qM != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
            c44796JsH.A01.setUrl(A14.Bhu(), new LXO());
            AbstractC31173DnH.A1F(c44796JsH.A00, A14);
            c44796JsH.A03.A08(c44796JsH.A02, c38321qM.A2H(), new C4S7(c38321qM, 0), c38321qM.A0M, "ImmsersiveCatchUpClipsItemViewHolder", 1.0f, -1, 0, A1R, A1R);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45192JzY.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C44796JsH c44796JsH = (C44796JsH) c3oo;
        C14360o3.A0B(c44796JsH, 0);
        c44796JsH.A03.A0C("stop", false);
    }
}
