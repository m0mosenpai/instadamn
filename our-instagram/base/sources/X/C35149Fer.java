package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Fer, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35149Fer {
    public ComposerAutoCompleteTextView A00;
    public final Context A01;
    public final MWT A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final GXX A05;

    public C35149Fer(Context context, MWT mwt, InterfaceC11380iw interfaceC11380iw, UserSession userSession, GXX gxx) {
        C14360o3.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = mwt;
        this.A05 = gxx;
    }

    public static final void A00(C35149Fer c35149Fer) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = c35149Fer.A00;
        if (composerAutoCompleteTextView != null) {
            String A1A = AbstractC25228BEl.A1A(AbstractC167007dF.A0g(composerAutoCompleteTextView));
            if (A1A != null && A1A.length() != 0) {
                GXX gxx = c35149Fer.A05;
                if (gxx != null) {
                    ComposerAutoCompleteTextView composerAutoCompleteTextView2 = c35149Fer.A00;
                    if (composerAutoCompleteTextView2 != null) {
                        gxx.Dkf(AbstractC25228BEl.A1A(AbstractC167007dF.A0g(composerAutoCompleteTextView2)));
                    }
                }
                ComposerAutoCompleteTextView composerAutoCompleteTextView3 = c35149Fer.A00;
                if (composerAutoCompleteTextView3 != null) {
                    AbstractC31171DnF.A14(composerAutoCompleteTextView3);
                    c35149Fer.A02();
                    A01(c35149Fer);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("composerEditTextView");
        throw C00O.createAndThrow();
    }

    public static final void A01(C35149Fer c35149Fer) {
        C2DS A00 = AbstractC28761aE.A00(c35149Fer.A04);
        User user = (User) c35149Fer.A02.A02;
        List A0j = AbstractC31177DnL.A0j(user);
        C81663kb BZR = A00.BZR(null, null, null, A0j);
        DirectShareTarget directShareTarget = new DirectShareTarget(AbstractC31232DoF.A00(BZR.C7I(), A0j), BZR.C7l(), A0j, true);
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A0B(EnumC142006bJ.A03);
        A0K.A06();
        A0K.A0L = true;
        A0K.A09 = user.Bhu();
        Context context = c35149Fer.A01;
        A0K.A0D = AbstractC31178DnM.A0c(context, user, 2131960438);
        AbstractC31175DnJ.A0l(context, A0K, 2131960830);
        G9A.A00(A0K, directShareTarget, c35149Fer, 7);
        AbstractC25233BEq.A1F(A0K);
    }

    public final void A02() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null) {
            C14360o3.A0F("composerEditTextView");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0O(composerAutoCompleteTextView);
    }
}
