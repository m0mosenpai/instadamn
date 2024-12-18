package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance;

/* renamed from: X.6x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154596x9 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C156136zh A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154596x9(C156136zh c156136zh, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(1);
        this.A02 = z;
        this.A00 = c156136zh;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        RecyclerView recyclerView;
        View view2;
        RecyclerView recyclerView2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (this.A02) {
            if (booleanValue && (view2 = this.A00.A0C.mView) != null && (recyclerView2 = (RecyclerView) view2.findViewById(R.id.highlights_reel_tray_recycler_view)) != null) {
                recyclerView2.A0n(0);
            }
            C156136zh c156136zh = this.A00;
            StoryHighlightsTrayManager$Instance storyHighlightsTrayManager$Instance = c156136zh.A0D;
            if (storyHighlightsTrayManager$Instance.CLh() && (view = c156136zh.A0C.mView) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.highlights_reel_tray_recycler_view)) != null) {
                recyclerView.A14(new C3GI(c156136zh.A0A, storyHighlightsTrayManager$Instance));
            }
        }
        this.A01.invoke();
        return C0eB.A00;
    }
}
