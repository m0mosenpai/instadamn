package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.WkM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70918WkM implements InterfaceC154236wY {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C69361Vm7 A02;
    public final /* synthetic */ String A03;

    public C70918WkM(Activity activity, UserSession userSession, C69361Vm7 c69361Vm7, String str) {
        this.A01 = userSession;
        this.A03 = str;
        this.A00 = activity;
        this.A02 = c69361Vm7;
    }

    @Override // X.InterfaceC154236wY
    public final void DE0(InterfaceC81933lD interfaceC81933lD) {
        int intValue = AbstractC154636xD.A00(interfaceC81933lD).intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                InterfaceC81913lB CDh = interfaceC81933lD.CDh();
                CDh.getClass();
                String id = CDh.getId();
                Activity activity = this.A00;
                UserSession userSession = this.A01;
                String str = this.A03;
                Context context = this.A02.A00;
                context.getClass();
                VW5.A00(activity, context, userSession, id, str);
                return;
            }
            return;
        }
        Hashtag BD4 = interfaceC81933lD.BD4();
        BD4.getClass();
        UserSession userSession2 = this.A01;
        String str2 = this.A03;
        Activity activity2 = this.A00;
        Context context2 = this.A02.A00;
        context2.getClass();
        Bundle bundle = new Bundle();
        HashtagImpl F59 = BD4.F59();
        bundle.putParcelable(AbstractC111324zv.A00(156), F59);
        bundle.putString(AbstractC111324zv.A00(640), str2);
        new C6XJ(activity2, WE2.A00(F59, str2, "story_donation_sticker_sheet"), userSession2, ModalActivity.class, AbstractC111324zv.A00(431)).A0C(context2);
    }
}
