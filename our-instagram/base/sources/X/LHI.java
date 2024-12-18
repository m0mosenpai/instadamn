package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.GenAIToolInfoDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.reels.prompt.model.PromptStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LHI {
    public static final void A00(Activity activity, C22P c22p, UserSession userSession, PromptStickerModel promptStickerModel) {
        AbstractC167027dH.A12(activity, userSession, promptStickerModel);
        Bundle A0b = AbstractC166987dD.A0b();
        PromptStickerModel A04 = promptStickerModel.A04();
        A04.A08(AbstractC166997dE.A0Y(userSession));
        A0b.putParcelable("prompt_sticker_model", A04.A02());
        A0b.putParcelable(AbstractC111324zv.A00(78), null);
        A0b.putSerializable("ReelDashboardAddToStoryCameraFragment.ARGUMENTS_KEY_ENTRY_POINT", c22p);
        C6XJ.A02(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(5186)).A0C(activity);
    }

    public static final void A01(Activity activity, UserSession userSession, List list) {
        C0T6 c0t6;
        boolean A1R = AbstractC167007dF.A1R(0, activity, userSession);
        ArrayList<? extends Parcelable> A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5NL c5nl = (C5NL) it.next();
            if (c5nl instanceof PromptStickerModel) {
                PromptStickerModel A04 = ((PromptStickerModel) c5nl).A04();
                A04.A08(AbstractC166997dE.A0Y(userSession));
                c0t6 = A04.A02();
            } else if (c5nl instanceof C24011Akp) {
                c0t6 = ((C24011Akp) c5nl).A00;
            }
            A1E.add(c0t6);
        }
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList(MSV.A00(393), A1E);
        AbstractC70197WGf.A06(activity, new C23681AeG(activity, A0b, userSession, A1R ? 1 : 0), C50472Tr.A01(), 0.2f, activity.getColor(R.color.black), activity.getColor(R.color.black), false);
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, MQS mqs, PromptStickerModel promptStickerModel, Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        String str2;
        String str3;
        String Bid;
        AbstractC167017dG.A1Q(userSession, promptStickerModel);
        mqs.CmC(z);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        if (C6PX.A00(context) && C18U.A06(C06090Tz.A05, userSession, 36327172692326760L) && C47966LHm.A00(userSession, C9H2.A03)) {
            if (z) {
                LBW.A01(fragmentActivity, userSession, EnumC27378C6h.A04, num);
                return;
            }
            PromptStickerModel A04 = promptStickerModel.A04();
            A04.A08(AbstractC166997dE.A0Y(userSession));
            C57527Pg1 c57527Pg1 = new C57527Pg1(interfaceC16820sZ, 35);
            EnumC27378C6h enumC27378C6h = EnumC27378C6h.A04;
            String A0j = AbstractC167017dG.A0j();
            GenAIToolInfoDictIntf B9Z = A04.A00.B9Z();
            if (B9Z != null && (Bid = B9Z.Bid()) != null) {
                str2 = AbstractC25228BEl.A1A(AbstractC001900j.A0F(AbstractC111324zv.A00(1663), Bid));
            } else {
                str2 = null;
            }
            GenAIToolInfoDictIntf B9Z2 = A04.A00.B9Z();
            if (B9Z2 != null) {
                str3 = B9Z2.Bl1();
            } else {
                str3 = null;
            }
            LBW.A00(fragmentActivity, userSession, enumC27378C6h, A04, num, A0j, str2, str3, MF3.A00, MF4.A00, c57527Pg1, null, false, false);
            return;
        }
        CYA.A00(fragmentActivity, userSession, mqs, promptStickerModel, str);
    }
}
