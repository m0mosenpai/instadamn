package X;

import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* renamed from: X.Alw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24060Alw implements InterfaceC1810781j {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    public C24060Alw(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        this.A00 = clipsTimelineEditorDrawerController;
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        Fragment fragment;
        C70569Wd3 c70569Wd3;
        EnumC1810181d enumC1810181d = EnumC1810181d.A09;
        if (obj == enumC1810181d) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A00;
            if (clipsTimelineEditorDrawerController.A0w.contains(obj2)) {
                ClipsTimelineEditorDrawerController.A0D(clipsTimelineEditorDrawerController, EnumC187428Sk.A07);
                return;
            }
        }
        if (obj2 == enumC1810181d) {
            ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController2 = this.A00;
            if (clipsTimelineEditorDrawerController2.A0w.contains(obj)) {
                clipsTimelineEditorDrawerController2.A0l.A03(C219629nA.A00);
                return;
            }
        }
        if (obj2 != EnumC1810181d.A0G || obj != EnumC1810181d.A0j) {
            return;
        }
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController3 = this.A00;
        C70569Wd3 c70569Wd32 = clipsTimelineEditorDrawerController3.A0D;
        if (c70569Wd32 != null) {
            fragment = c70569Wd32.A0E.A0O(R.id.fragment_container);
        } else {
            fragment = null;
        }
        if (!(fragment instanceof C52133N5h) || (c70569Wd3 = clipsTimelineEditorDrawerController3.A0D) == null) {
            return;
        }
        c70569Wd3.A05(true);
    }
}
