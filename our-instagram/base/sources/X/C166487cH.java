package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.comments.mvvm.view.fragment.CommentViewUiEffectHandler$handleCommentUiEffects$1;
import com.instagram.common.session.UserSession;

/* renamed from: X.7cH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166487cH implements InterfaceC65626Tpm {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C166517cK.A00);
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(C166527cL.A00);

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final void onDestroy(C07X c07x) {
        C14360o3.A0B(c07x, 0);
        C68732VbB c68732VbB = (C68732VbB) this.A00.getValue();
        C31349DqE c31349DqE = c68732VbB.A00;
        if (c31349DqE != null) {
            C41451vu.A01.E4s(new C3KF(c31349DqE));
        }
        c68732VbB.A00 = null;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    public static final void A00(Context context, InterfaceC30800Dgb interfaceC30800Dgb) {
        CharSequence A00;
        String quantityString;
        if (C14360o3.A0K(interfaceC30800Dgb, LXJ.A00)) {
            A00 = context.getString(2131976103);
        } else {
            if (C14360o3.A0K(interfaceC30800Dgb, C29126Csr.A00)) {
                C9GR.A07(context, 2131952120);
                return;
            }
            if (interfaceC30800Dgb instanceof H76) {
                C9GR.A0B(context, ((H76) interfaceC30800Dgb).A00);
                return;
            }
            if (interfaceC30800Dgb instanceof C29127Css) {
                quantityString = context.getResources().getQuantityString(R.plurals.selection_max_reached, 1);
            } else {
                if (interfaceC30800Dgb instanceof C9B1) {
                    C9B1 c9b1 = (C9B1) interfaceC30800Dgb;
                    int i = c9b1.A00;
                    if (i == 0) {
                        quantityString = context.getResources().getQuantityString(R.plurals.bulk_block_confirmation_toast, c9b1.A01);
                    } else if (i == 1) {
                        Resources resources = context.getResources();
                        int i2 = c9b1.A01;
                        quantityString = resources.getQuantityString(R.plurals.bulk_restrict_confirmation_toast, i2, Integer.valueOf(i2));
                    }
                }
                if (interfaceC30800Dgb instanceof C26166Bhr) {
                    A00 = BHX.A00(context, ((C26166Bhr) interfaceC30800Dgb).A00);
                } else {
                    throw new RuntimeException();
                }
            }
            C14360o3.A07(quantityString);
            C9GR.A09(context, quantityString);
            return;
        }
        C9GR.A00(context, A00, null, 0);
    }

    public final void A01(FragmentActivity fragmentActivity, InterfaceC43399JFo interfaceC43399JFo, AbstractC59962oe abstractC59962oe, C166887d0 c166887d0, C166867cy c166867cy, C166587cU c166587cU, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38E c38e, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, C19L c19l, boolean z) {
        C14360o3.A0B(c25814BbV, 0);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(c19l, 4);
        C14360o3.A0B(c38e, 6);
        C14360o3.A0B(str, 7);
        C14360o3.A0B(c166887d0, 8);
        C14360o3.A0B(c166587cU, 12);
        C14360o3.A0B(c166867cy, 13);
        AbstractC18560vj.A03(c19l, new C15340po(new CommentViewUiEffectHandler$handleCommentUiEffects$1(fragmentActivity, interfaceC43399JFo, abstractC59962oe, c166887d0, this, c166867cy, c166587cU, c25814BbV, userSession, interfaceC60442pS, c38e, str, null, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, true, z), c25814BbV.A0T));
    }
}
