package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;

/* loaded from: classes9.dex */
public final class N25 extends UDB {
    public DialogInterface.OnDismissListener A00;
    public DialogInterface A01;
    public InterfaceC11380iw A02;
    public UserSession A03;
    public C41181vS A04;
    public InterfaceC58312Pt4 A05;
    public Integer A06;

    @Override // X.C0SG, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C14360o3.A0B(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener == null) {
            C14360o3.A0F("listener");
            throw C00O.createAndThrow();
        }
        onDismissListener.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List list;
        String str;
        C14360o3.A0B(view, 0);
        View A0S = AbstractC166997dE.A0S(view, R.id.reel_report_bottom_sheet_next_button);
        IgRadioGroup igRadioGroup = (IgRadioGroup) AbstractC166987dD.A0c(view, R.id.reel_report_bottom_sheet_radio_group);
        UserSession userSession = this.A03;
        if (userSession == null) {
            str = "userSession";
        } else {
            C41181vS c41181vS = this.A04;
            if (c41181vS == null) {
                str = "reelItem";
            } else {
                InterfaceC11380iw interfaceC11380iw = this.A02;
                if (interfaceC11380iw == null) {
                    str = "analyticsModule";
                } else {
                    Context requireContext = requireContext();
                    C29900DGo c29900DGo = new C29900DGo(44, A0S, this, igRadioGroup);
                    C14360o3.A0B(igRadioGroup, 5);
                    C105794pq c105794pq = c41181vS.A0D;
                    C18C.A07(c105794pq, AbstractC111324zv.A00(43));
                    if (c105794pq != null) {
                        list = c105794pq.A00.BQh();
                    } else {
                        list = null;
                    }
                    int[] iArr = {R.id.reel_netego_threads_in_stories_item_top, R.id.reel_netego_threads_in_stories_item_middle, R.id.reel_netego_threads_in_stories_item_bottom};
                    if (list != null) {
                        int i = 0;
                        do {
                            OFU ofu = new OFU(view, AbstractC166997dE.A0S(view, iArr[i]));
                            ofu.A04.setVisibility(8);
                            ofu.A08.setVisibility(0);
                            OZH.A00(requireContext, interfaceC11380iw, userSession, (C38321qM) list.get(i), null, ofu, igRadioGroup, c29900DGo, i, false, false);
                            i++;
                        } while (i < 3);
                    }
                    ViewOnTouchListenerC50553MTk.A00(A0S, 14, this);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1375364609);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.reel_netego_threads_in_stories_report_bottom_sheet, viewGroup, false);
        C0f9.A09(-2084363819, A02);
        return inflate;
    }
}
