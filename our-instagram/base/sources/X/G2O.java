package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectMessageSearchMessage;
import com.instagram.model.direct.DirectMessageSearchThread;
import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class G2O implements InterfaceC37168GZf {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C36010Fv8 A01;

    @Override // X.InterfaceC37168GZf
    public final void Dh4(View view, DirectSearchResult directSearchResult, int i, int i2, int i3, int i4) {
        if (view != null) {
            this.A01.A0I.Dqk(view, null, directSearchResult, "inbox_search", 25, i, i2, i4, false);
        }
    }

    public G2O(Activity activity, C36010Fv8 c36010Fv8) {
        this.A01 = c36010Fv8;
        this.A00 = activity;
    }

    @Override // X.InterfaceC37168GZf
    public final void DTF(DirectMessageSearchMessage directMessageSearchMessage, int i, int i2, int i3, int i4) {
        InterfaceC83713oG msysThreadId;
        C36010Fv8 c36010Fv8 = this.A01;
        c36010Fv8.A0I.Dld(null, directMessageSearchMessage, "inbox_search", i, i2, i3, i4, 25);
        if (!directMessageSearchMessage.A00()) {
            C36294Fzo A00 = C36294Fzo.A00(c36010Fv8.A0D);
            A00.A05(c36010Fv8.A0F.A06, "thread_deeplinking", "integrated_message_search", false);
            String A03 = c36010Fv8.A03();
            String str = directMessageSearchMessage.A0A;
            A00.A04(A03, str, "thread_deeplinking", directMessageSearchMessage.A02);
            A00.A03(c36010Fv8.A03(), str);
        }
        Activity activity = this.A00;
        String str2 = directMessageSearchMessage.A0A;
        if (!str2.equals("secure_group") && !str2.equals("secure_one_to_one")) {
            msysThreadId = AbstractC31171DnF.A0N(directMessageSearchMessage.A09);
        } else {
            msysThreadId = new MsysThreadId(EnumC92794Ds.A04, null, Long.parseLong(directMessageSearchMessage.A09));
        }
        AbstractC31181DnP.A0M(activity, c36010Fv8, c36010Fv8.A0D, directMessageSearchMessage, msysThreadId);
    }

    @Override // X.InterfaceC37168GZf
    public final void DTL(DirectMessageSearchThread directMessageSearchThread, int i, int i2, int i3, int i4) {
        C36010Fv8 c36010Fv8 = this.A01;
        c36010Fv8.A0I.Dld(null, directMessageSearchThread, "inbox_search", i, i2, i3, i4, 25);
        ImmutableList immutableList = directMessageSearchThread.A03;
        if (!(immutableList instanceof Collection) || !immutableList.isEmpty()) {
            Iterator<E> it = immutableList.iterator();
            while (it.hasNext()) {
                PendingRecipient A0p = AbstractC31172DnG.A0p(it);
                C14360o3.A0A(A0p);
                if (A0p.A02 == 1) {
                    break;
                }
            }
        }
        C36294Fzo A00 = C36294Fzo.A00(c36010Fv8.A0D);
        A00.A05(c36010Fv8.A0F.A06, "message_list", "integrated_message_search", false);
        A00.A03(c36010Fv8.A03(), directMessageSearchThread.A0A);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", directMessageSearchThread.A08);
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_NAME", directMessageSearchThread.A09);
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_QUERY", c36010Fv8.A03());
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_TYPE", directMessageSearchThread.A0A);
        A0b.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CATEGORY", directMessageSearchThread.A07);
        A0b.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_SEE_ALL_SECTION_RANK_INDEX", i3);
        AbstractC31174DnI.A0a(this.A00, A0b, c36010Fv8.A0D, ModalActivity.class, AbstractC111324zv.A00(882)).A0C(c36010Fv8.A07);
    }
}
