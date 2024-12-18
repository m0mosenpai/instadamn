package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class AEM {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM) {
        Object obj;
        PromptStickerModel A0E;
        C14360o3.A0B(c38321qM, 0);
        AbstractC167017dG.A1R(userSession, fragmentActivity);
        Iterator it = c38321qM.A3N().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C84823qW) obj).A0E() != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C84823qW c84823qW = (C84823qW) obj;
        if (c84823qW != null && (A0E = c84823qW.A0E()) != null) {
            bundle.putString(AbstractC111324zv.A00(2933), A0E.A03);
            bundle.putParcelable(AbstractC43591JPw.A00(9), C0B1.A00(A0E.A02()));
            bundle.putSerializable(AbstractC111324zv.A00(1194), C8JW.A0R);
            new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(361)).A0C(fragmentActivity);
        }
    }

    public static final void A01(C23108AGw c23108AGw, Float f) {
        C221649qT c221649qT;
        c23108AGw.A0F = true;
        c23108AGw.A0H = true;
        c23108AGw.A01 = 1.0f;
        c23108AGw.A00 = 2.0f;
        if (f != null) {
            c221649qT = new C221649qT(f.floatValue());
        } else {
            c221649qT = new C221649qT();
        }
        c23108AGw.A06 = c221649qT;
        c23108AGw.A05 = 7;
        c23108AGw.A0P = true;
    }
}
