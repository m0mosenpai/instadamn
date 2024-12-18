package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1;

/* renamed from: X.OEt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54716OEt {
    public int A00;
    public final int A01;
    public final Context A02;
    public final RecyclerView A03;
    public final C51142Mil A04;
    public final ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1 A05;
    public final C87H A06;
    public final InterfaceC16820sZ A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.instagram.creation.capture.quickcapture.sundial.edit.ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1] */
    public C54716OEt(final Context context, RecyclerView recyclerView, C51142Mil c51142Mil, C87H c87h, InterfaceC16820sZ interfaceC16820sZ, int i) {
        C14360o3.A0B(recyclerView, 3);
        this.A02 = context;
        this.A04 = c51142Mil;
        this.A03 = recyclerView;
        this.A06 = c87h;
        this.A01 = i;
        this.A07 = interfaceC16820sZ;
        this.A05 = new CustomScrollingLinearLayoutManager(context) { // from class: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsPostCapMiniTimelineController$scrollingLinearLayoutManager$1
        };
    }
}
