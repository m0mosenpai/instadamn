package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PM1 implements Runnable {
    public final /* synthetic */ ClipsTimelineActionBarViewController A00;

    public PM1(ClipsTimelineActionBarViewController clipsTimelineActionBarViewController) {
        this.A00 = clipsTimelineActionBarViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A00;
        EnumC53325Ni3 enumC53325Ni3 = EnumC53325Ni3.A0f;
        C51155Miy c51155Miy = clipsTimelineActionBarViewController.adapter;
        if (c51155Miy != null && (list = c51155Miy.A00) != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((C51960Mxi) it.next()).A00 == enumC53325Ni3) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            if (intValue >= 0) {
                C110814yt c110814yt = new C110814yt(clipsTimelineActionBarViewController.A02.requireContext());
                ((AbstractC110824yu) c110814yt).A00 = intValue;
                LinearLayoutManager linearLayoutManager = clipsTimelineActionBarViewController.linearLayoutManager;
                if (linearLayoutManager != null) {
                    linearLayoutManager.A10(c110814yt);
                }
            }
        }
    }
}
