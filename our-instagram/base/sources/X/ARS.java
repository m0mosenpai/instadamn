package X;

import android.view.View;
import android.widget.FrameLayout;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class ARS implements View.OnClickListener {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ ClipsTimelineEditorDrawerController A01;

    public ARS(FrameLayout frameLayout, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A01 = clipsTimelineEditorDrawerController;
        this.A00 = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1541639965);
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A01;
        if (ClipsTimelineEditorDrawerController.A0I(clipsTimelineEditorDrawerController)) {
            InterfaceC1810081c interfaceC1810081c = clipsTimelineEditorDrawerController.A0f;
            if (interfaceC1810081c.CRB(EnumC1810181d.A09)) {
                if (clipsTimelineEditorDrawerController.A0D != null) {
                    ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, EnumC187428Sk.A0B);
                }
            } else if (interfaceC1810081c.CRB(EnumC1810181d.A0j)) {
                AbstractC167007dF.A0x(clipsTimelineEditorDrawerController.A01);
                C191478dz c191478dz = (C191478dz) clipsTimelineEditorDrawerController.A0x.get();
                if (c191478dz != null && c191478dz.A0O && c191478dz.A0w == C5JK.A05) {
                    C8DN c8dn = clipsTimelineEditorDrawerController.A0e.A00.A0d.A0z;
                    C183688Ct.A0E(c8dn.A00, new RunnableC24327AqW(c8dn), false);
                } else {
                    C8Y6 c8y6 = (C8Y6) clipsTimelineEditorDrawerController.A0y.get();
                    if (c8y6 != null) {
                        c8y6.A06();
                    }
                }
            }
        } else if (clipsTimelineEditorDrawerController.ABG()) {
            this.A00.setVisibility(8);
            ClipsTimelineEditorDrawerController.A06(clipsTimelineEditorDrawerController);
            ClipsTimelineEditorDrawerController.A0G(clipsTimelineEditorDrawerController, true, true, false);
            AnonymousClass229.A01(clipsTimelineEditorDrawerController.A0a).A0h();
        }
        C0f9.A0C(-647117912, A05);
    }
}
