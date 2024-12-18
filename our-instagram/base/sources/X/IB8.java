package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;

/* loaded from: classes7.dex */
public abstract class IB8 {
    public static final void A00(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Hashtag hashtag) {
        C6XJ A0L = AbstractC31171DnF.A0L(activity, WE2.A00(hashtag, interfaceC11380iw.getModuleName(), "DEFAULT"), userSession, ModalActivity.class, AbstractC111324zv.A00(431));
        A0L.A02 = interfaceC11380iw;
        A0L.A08();
        A0L.A0C(activity);
    }
}
