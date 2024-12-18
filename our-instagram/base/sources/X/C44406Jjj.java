package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.smartcapture.ui.PhotoRequirementsView;
import com.instagram.creation.photo.crop.LayoutImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Jjj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44406Jjj extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;

    public C44406Jjj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public final boolean onContextClick(MotionEvent motionEvent) {
        if (2 - this.A00 != 0) {
            return super.onContextClick(motionEvent);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C22809A4c c22809A4c = ((C9X1) this.A01).A06;
                if (c22809A4c != null) {
                    motionEvent.getX();
                    motionEvent.getY();
                    C180027ys c180027ys = c22809A4c.A00;
                    if (c180027ys.A0O) {
                        c180027ys.Epf();
                        return true;
                    }
                    return false;
                }
                return false;
            case 1:
            default:
                return super.onDoubleTap(motionEvent);
            case 2:
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
            case 2:
            case 4:
            case 5:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return true;
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                return super.onDown(motionEvent);
            case 11:
                return !((C3DP) ((ViewOnTouchListenerC48080LQf) this.A01).A03.A0H).A0h;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        switch (this.A00) {
            case 2:
                C14360o3.A0B(motionEvent2, 1);
                float y = motionEvent2.getY();
                if (motionEvent != null) {
                    f3 = motionEvent.getY();
                } else {
                    f3 = 0.0f;
                }
                float f4 = y - f3;
                if (Math.abs(f4) > 100.0f && Math.abs(f2) > 100.0f) {
                    if (f4 > 0.0f) {
                        PhotoRequirementsView photoRequirementsView = (PhotoRequirementsView) this.A01;
                        C44427JkQ c44427JkQ = photoRequirementsView.A01;
                        if (c44427JkQ != null) {
                            c44427JkQ.A00();
                            photoRequirementsView.A01 = null;
                        }
                        photoRequirementsView.A02 = false;
                        return true;
                    }
                    return true;
                }
                return false;
            case 11:
                if (Math.abs(f2) > Math.abs(f)) {
                    if (motionEvent2.getRawY() < motionEvent.getRawY()) {
                        ViewOnTouchListenerC48080LQf viewOnTouchListenerC48080LQf = (ViewOnTouchListenerC48080LQf) this.A01;
                        OW8 ow8 = viewOnTouchListenerC48080LQf.A03;
                        if (!((C3DP) ow8.A0H).A0h) {
                            String str = ow8.A07;
                            String str2 = viewOnTouchListenerC48080LQf.A05;
                            String str3 = viewOnTouchListenerC48080LQf.A06;
                            long j = viewOnTouchListenerC48080LQf.A02;
                            String str4 = viewOnTouchListenerC48080LQf.A07;
                            long j2 = viewOnTouchListenerC48080LQf.A01;
                            boolean z = viewOnTouchListenerC48080LQf.A0C;
                            boolean z2 = viewOnTouchListenerC48080LQf.A09;
                            boolean z3 = viewOnTouchListenerC48080LQf.A0D;
                            boolean z4 = viewOnTouchListenerC48080LQf.A0A;
                            OW8.A00(ow8, viewOnTouchListenerC48080LQf.A04, str, str2, str3, str4, viewOnTouchListenerC48080LQf.A08, j, j2, z, z2, z3, z4, viewOnTouchListenerC48080LQf.A0B);
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                if (motionEvent2.getRawY() > motionEvent.getRawY()) {
                    ((ReelDashboardFragment) this.A01).A0H();
                    return true;
                }
                return true;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        MQV mqv;
        InterfaceC65577TnB interfaceC65577TnB;
        switch (this.A00) {
            case 7:
                mqv = (MQV) this.A01;
                break;
            case 8:
                mqv = ((LayoutImageView) this.A01).A00;
                if (mqv == null) {
                    return;
                }
                break;
            case 10:
                C14360o3.A0B(motionEvent, 0);
                C3DP c3dp = (C3DP) this.A01;
                if (!C18U.A06(C06090Tz.A06, c3dp.A0w, 36321537695163958L)) {
                    return;
                }
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
                if (viewOnTouchListenerC65896Tw0 != null && viewOnTouchListenerC65896Tw0.A09 != 2 && (interfaceC65577TnB = c3dp.A0G) != null && interfaceC65577TnB.DQq()) {
                    c3dp.A0U(c3dp.A0b(Float.valueOf(motionEvent.getY())));
                }
                break;
            case 9:
            default:
                super.onLongPress(motionEvent);
                return;
        }
        mqv.DQT();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                C22808A4b c22808A4b = ((C9X1) this.A01).A05;
                if (c22808A4b != null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    C180027ys c180027ys = c22808A4b.A00;
                    AbstractC176767tY A0A = c180027ys.A0A();
                    if (A0A != null) {
                        float[] A1b = AbstractC43592JPx.A1b();
                        A1b[0] = x;
                        A1b[1] = y;
                        InterfaceC175067qg interfaceC175067qg = c180027ys.A0e;
                        interfaceC175067qg.Cmt(A1b);
                        if (c180027ys.A0R) {
                            if (AbstractC166987dD.A1a(A0A.A01(AbstractC176767tY.A0V)) || AbstractC166987dD.A1a(A0A.A01(AbstractC176767tY.A0W))) {
                                interfaceC175067qg.AWH((int) A1b[0], (int) A1b[1]);
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            case 1:
            case 2:
                return true;
            case 10:
                C14360o3.A0B(motionEvent, 0);
                C3DP c3dp = (C3DP) this.A01;
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = c3dp.A0D;
                if (viewOnTouchListenerC65896Tw0 != null && viewOnTouchListenerC65896Tw0.A09 != 2) {
                    c3dp.A0U(c3dp.A0b(Float.valueOf(motionEvent.getY())));
                    InterfaceC65577TnB interfaceC65577TnB = c3dp.A0G;
                    if (interfaceC65577TnB != null) {
                        interfaceC65577TnB.DmX();
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapUp(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44406Jjj.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
