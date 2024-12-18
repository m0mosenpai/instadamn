package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetView;

/* renamed from: X.OnO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55639OnO implements InterfaceGestureDetectorOnGestureListenerC149756oS {
    public final /* synthetic */ ClipsTimelineBottomSheetView A00;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r10 <= 0) goto L44;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r12, android.view.MotionEvent r13, float r14, float r15) {
        /*
            r11 = this;
            r4 = 1
            X.C14360o3.A0B(r13, r4)
            if (r12 == 0) goto L90
            float r0 = X.MSZ.A02(r13, r12)
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetView r5 = r11.A00
            float r2 = r5.A03
            float r2 = r2 - r0
            r5.A03 = r0
            boolean r0 = r5.A0A
            if (r0 == 0) goto Lb2
            boolean r0 = r5.A07
            if (r0 == 0) goto Lb2
            X.Pki r3 = r5.A05
            if (r3 == 0) goto L90
            boolean r0 = r5.A08
            if (r0 != 0) goto L4d
            boolean r0 = r5.A09
            if (r0 != 0) goto L4d
            float r7 = r12.getRawX()
            float r1 = r12.getRawY()
            r0 = r3
            X.Oyr r0 = (X.C56280Oyr) r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r6 = r0.A00
            android.view.ViewGroup r0 = r6.A03
            if (r0 == 0) goto L4b
            boolean r0 = X.AbstractC13880nE.A0z(r0, r7, r1)
            if (r0 == 0) goto L4b
            X.Psb r0 = r6.A07
            if (r0 == 0) goto Lb0
            boolean r0 = r0.CRl()
        L44:
            r1 = 0
            if (r0 == 0) goto L9e
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9e
        L4b:
            r5.A08 = r4
        L4d:
            boolean r0 = r5.A08
            if (r0 == 0) goto L81
            r0 = r3
            X.Oyr r0 = (X.C56280Oyr) r0
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r7 = r0.A00
            r7.A0A = r4
            int r0 = (int) r2
            int r10 = java.lang.Integer.signum(r0)
            X.2hj r8 = r7.A05
            X.2hk r6 = r8.A09
            double r0 = r6.A00
            float r9 = (float) r0
            float r1 = r7.A00
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r0 = r0 * r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L92
            if (r10 <= 0) goto L92
            r0 = 0
        L71:
            float r1 = r2 * r0
            android.view.ViewGroup r0 = r7.A0C
            float r7 = X.MSX.A00(r1, r0)
            double r0 = r6.A00
            float r6 = (float) r0
            float r6 = r6 + r7
            double r0 = (double) r6
            r8.A08(r0, r4)
        L81:
            boolean r0 = r5.A09
            if (r0 == 0) goto L90
            X.Oyr r3 = (X.C56280Oyr) r3
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r0 = r3.A00
            X.Psb r0 = r0.A07
            if (r0 == 0) goto L90
            r0.AQM(r2)
        L90:
            r0 = 0
            return r0
        L92:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L9b
            r0 = 1041865114(0x3e19999a, float:0.15)
            if (r10 > 0) goto L71
        L9b:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L71
        L9e:
            X.Psb r0 = r6.A07
            if (r0 == 0) goto Lad
            boolean r0 = r0.CRk()
            if (r0 == 0) goto Lad
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lad
            goto L4b
        Lad:
            r5.A09 = r4
            goto L4d
        Lb0:
            r0 = 0
            goto L44
        Lb2:
            r5.A0A = r4
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55639OnO.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C55639OnO(ClipsTimelineBottomSheetView clipsTimelineBottomSheetView) {
        this.A00 = clipsTimelineBottomSheetView;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC57816Pki interfaceC57816Pki;
        ClipsTimelineBottomSheetView clipsTimelineBottomSheetView = this.A00;
        if (clipsTimelineBottomSheetView.A09 && (interfaceC57816Pki = clipsTimelineBottomSheetView.A05) != null) {
            float f3 = -f2;
            InterfaceC58283Psb interfaceC58283Psb = ((C56280Oyr) interfaceC57816Pki).A00.A07;
            if (interfaceC58283Psb != null) {
                interfaceC58283Psb.DHV(0.0f, f3);
            }
        }
        if (clipsTimelineBottomSheetView.A07 && clipsTimelineBottomSheetView.A08) {
            clipsTimelineBottomSheetView.A04 = f2;
            return false;
        }
        return false;
    }
}
