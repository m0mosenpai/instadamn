package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.stacked.actionbar.ClipsTimelineActionBarRecyclerView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PM0 implements Runnable {
    public final /* synthetic */ ClipsTimelineActionBarViewController A00;

    public PM0(ClipsTimelineActionBarViewController clipsTimelineActionBarViewController) {
        this.A00 = clipsTimelineActionBarViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ClipsTimelineActionBarRecyclerView clipsTimelineActionBarRecyclerView;
        C3OO A0V;
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A00;
        EnumC53325Ni3 enumC53325Ni3 = EnumC53325Ni3.A0f;
        C51155Miy c51155Miy = clipsTimelineActionBarViewController.adapter;
        if (c51155Miy != null && (list = c51155Miy.A00) != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((C51960Mxi) it.next()).A00 == enumC53325Ni3) {
                    if (i >= 0 && (clipsTimelineActionBarRecyclerView = clipsTimelineActionBarViewController.actionBarRecyclerView) != null && (A0V = clipsTimelineActionBarRecyclerView.A0V(i)) != null) {
                        AbstractC59962oe abstractC59962oe = clipsTimelineActionBarViewController.A02;
                        C5SU A0b = MSZ.A0b(abstractC59962oe.requireActivity(), abstractC59962oe.requireActivity().getText(2131955918).toString());
                        A0b.A02();
                        A0b.A03(AbstractC31171DnF.A06(A0V));
                        A0b.A0B = false;
                        KYR.A00(A0b, clipsTimelineActionBarViewController, 3).A07(clipsTimelineActionBarViewController.A03);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }
}
