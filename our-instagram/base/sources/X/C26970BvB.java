package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimation;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;

/* renamed from: X.BvB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26970BvB extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        ShowreelNativeMediaView showreelNativeMediaView = (ShowreelNativeMediaView) view;
        UserSession A01 = AbstractC03270Dk.A01(C6BQ.A0A(c6fg));
        if (A01 == null) {
            AbstractC25241Le.A02("BKShowreelNativeBinderUtils", "Attempt to render Bloks showreel native component outside a logged in user context.");
        } else {
            String A0I = c102884kP.A0I();
            String A0H = c102884kP.A0H();
            String A0F = c102884kP.A0F();
            if (A0I != null && A0H != null && A0F != null) {
                IgShowreelNativeAnimation igShowreelNativeAnimation = new IgShowreelNativeAnimation(null, null, null, A0I, A0F, A0H, c102884kP.A0O(36), null);
                showreelNativeMediaView.setShowreelAnimation(AbstractC37415Gdv.A00(igShowreelNativeAnimation), A01, C6BQ.A07(c6fg).getModuleName(), new C139366Sr(c102884kP.A0E(), c102884kP.A0K()));
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return new ShowreelNativeMediaView(context, new C9C9(AbstractC111324zv.A00(1272), "IG_FEED", 0), (C64Z) null, C29072Crz.A00);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    public C26970BvB(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
