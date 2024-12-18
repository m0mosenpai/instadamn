package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8S7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8S7 extends C8S8 {
    public int A00;
    public C9V0 A01;
    public final int A02;
    public final InterfaceC11380iw A03;
    public final InterfaceC159417Dc A04;
    public final C8S2 A05;
    public final C187318Ry A06;

    public C8S7(InterfaceC11380iw interfaceC11380iw, InterfaceC159417Dc interfaceC159417Dc, C8S2 c8s2, C187318Ry c187318Ry, int i) {
        C14360o3.A0B(c8s2, 4);
        this.A03 = interfaceC11380iw;
        this.A06 = c187318Ry;
        this.A04 = interfaceC159417Dc;
        this.A05 = c8s2;
        this.A02 = i;
    }

    @Override // X.C8S8
    public final boolean canDropOver(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        C14360o3.A0B(c3oo2, 2);
        return !(c3oo2 instanceof C210879Uk);
    }

    @Override // X.C8S8
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        C14360o3.A0B(c3oo, 1);
        C14360o3.A0B(c3oo2, 2);
        this.A04.Cpv(c3oo.getBindingAdapterPosition(), c3oo2.getBindingAdapterPosition());
        return true;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    private final boolean A00(View view, View view2) {
        if (view2 != null && this.A05.CdI()) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            view.getGlobalVisibleRect(rect);
            view2.getGlobalVisibleRect(rect2);
            return rect2.contains(rect.centerX(), rect.centerY());
        }
        return false;
    }

    @Override // X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return C8S8.makeMovementFlags(13, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    @Override // X.C8S8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChildDraw(android.graphics.Canvas r15, androidx.recyclerview.widget.RecyclerView r16, X.C3OO r17, float r18, float r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8S7.onChildDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, X.3OO, float, float, int, boolean):void");
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        C9V0 c9v0 = (C9V0) c3oo;
        C9V0 c9v02 = this.A01;
        if (c9v02 == null) {
            if (c9v0 != null && i == 2) {
                c9v0.A01(true);
            }
        } else if (c9v0 == null && i == 0) {
            View view = c9v02.itemView;
            C14360o3.A06(view);
            C8S2 c8s2 = this.A05;
            boolean A00 = A00(view, c8s2.A01);
            View view2 = c9v02.itemView;
            if (A00) {
                view2.setVisibility(8);
                InterfaceC25191BCo interfaceC25191BCo = c8s2.A02;
                if (interfaceC25191BCo != null) {
                    interfaceC25191BCo.Dvd();
                }
            } else {
                C14360o3.A06(view2);
                if (A00(view2, c8s2.A00)) {
                    InterfaceC25191BCo interfaceC25191BCo2 = c8s2.A02;
                    if (interfaceC25191BCo2 != null) {
                        interfaceC25191BCo2.DCf();
                    }
                    c9v02.A01(false);
                } else {
                    c9v02.A01(false);
                    C187318Ry c187318Ry = this.A06;
                    if (c187318Ry.A01 != c187318Ry.A02 && c187318Ry.A00 == 5) {
                        UserSession userSession = c187318Ry.A0O;
                        C22C A01 = AnonymousClass229.A01(userSession);
                        long j = c187318Ry.A01;
                        long j2 = c187318Ry.A02;
                        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0C;
                        C448724r c448724r = A01.A0F;
                        C18920wW c18920wW = c448724r.A01;
                        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
                        if (A002.isSampled()) {
                            A002.A8R(C81X.A1v, "tool_type");
                            A002.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_EDIT_REORDER_SEGMENT");
                            C22M c22m = c448724r.A04;
                            String str = c22m.A0L;
                            if (str == null) {
                                str = "";
                            }
                            A002.AAP("camera_session_id", str);
                            A002.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                            A002.A8p("event_type", 2);
                            A002.A8R(enumC50631MWs, "surface");
                            A002.AAP("module", C22F.A08.getModuleName());
                            A002.A9K("prev_index", Long.valueOf(j));
                            A002.A9K("new_index", Long.valueOf(j2));
                            A002.A8R(c448724r.A0J(), "camera_destination");
                            A002.A8R(c448724r.A0I(), "capture_type");
                            A002.A8R(c22m.A0A, "media_type");
                            A002.AAP("nav_chain", C1QM.A00.A02.A00);
                            A002.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
                            A002.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
                            A002.Cht();
                        }
                        C9OT.A00(userSession).A01.add(new C51710Msf("VIDEO", "REORDER", "GALLERY_BOTTOM_EDITOR"));
                    }
                    c187318Ry.A01 = -1;
                    c187318Ry.A02 = -1;
                }
            }
            C187318Ry c187318Ry2 = this.A06;
            if (c187318Ry2.A00 == 5) {
                c187318Ry2.A06.CMI();
            }
        }
        this.A01 = c9v0;
    }
}
