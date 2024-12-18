package X;

import android.view.MotionEvent;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView;

/* renamed from: X.OnN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55638OnN implements InterfaceGestureDetectorOnGestureListenerC149756oS {
    public final /* synthetic */ BottomSheetView A00;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
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
            if (r12 == 0) goto L8e
            float r0 = X.MSZ.A02(r13, r12)
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.content.BottomSheetView r5 = r11.A00
            float r2 = r5.A02
            float r2 = r2 - r0
            r5.A02 = r0
            boolean r0 = r5.A09
            if (r0 == 0) goto Lb0
            boolean r0 = r5.A06
            if (r0 == 0) goto Lb0
            X.Pkh r3 = r5.A04
            if (r3 == 0) goto L8e
            boolean r0 = r5.A07
            if (r0 != 0) goto L4d
            boolean r0 = r5.A08
            if (r0 != 0) goto L4d
            float r7 = r12.getRawX()
            float r1 = r12.getRawY()
            r0 = r3
            X.Oym r0 = (X.C56277Oym) r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r6 = r0.A00
            android.view.ViewGroup r0 = r6.bottomSheetContentView
            if (r0 == 0) goto L4b
            boolean r0 = X.AbstractC13880nE.A0z(r0, r7, r1)
            if (r0 == 0) goto L4b
            X.Psa r0 = r6.A03
            if (r0 == 0) goto Lae
            boolean r0 = r0.CRl()
        L44:
            r1 = 0
            if (r0 == 0) goto L9c
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9c
        L4b:
            r5.A07 = r4
        L4d:
            boolean r0 = r5.A07
            if (r0 == 0) goto L7f
            r0 = r3
            X.Oym r0 = (X.C56277Oym) r0
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r7 = r0.A00
            int r0 = (int) r2
            int r10 = java.lang.Integer.signum(r0)
            X.2hj r8 = r7.A02
            X.2hk r6 = r8.A09
            double r0 = r6.A00
            float r9 = (float) r0
            float r1 = r7.A00
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r0 = r0 * r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L90
            if (r10 <= 0) goto L90
            r0 = 0
        L6f:
            float r1 = r2 * r0
            android.view.ViewGroup r0 = r7.A07
            float r7 = X.MSX.A00(r1, r0)
            double r0 = r6.A00
            float r6 = (float) r0
            float r6 = r6 + r7
            double r0 = (double) r6
            r8.A08(r0, r4)
        L7f:
            boolean r0 = r5.A08
            if (r0 == 0) goto L8e
            X.Oym r3 = (X.C56277Oym) r3
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r3.A00
            X.Psa r0 = r0.A03
            if (r0 == 0) goto L8e
            r0.AQM(r2)
        L8e:
            r0 = 0
            return r0
        L90:
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L99
            r0 = 1041865114(0x3e19999a, float:0.15)
            if (r10 > 0) goto L6f
        L99:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L6f
        L9c:
            X.Psa r0 = r6.A03
            if (r0 == 0) goto Lab
            boolean r0 = r0.CRk()
            if (r0 == 0) goto Lab
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lab
            goto L4b
        Lab:
            r5.A08 = r4
            goto L4d
        Lae:
            r0 = 0
            goto L44
        Lb0:
            r5.A09 = r4
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55638OnN.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public C55638OnN(BottomSheetView bottomSheetView) {
        this.A00 = bottomSheetView;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC57815Pkh interfaceC57815Pkh;
        BottomSheetView bottomSheetView = this.A00;
        if (bottomSheetView.A08 && (interfaceC57815Pkh = bottomSheetView.A04) != null) {
            float f3 = -f2;
            InterfaceC58282Psa interfaceC58282Psa = ((C56277Oym) interfaceC57815Pkh).A00.A03;
            if (interfaceC58282Psa != null) {
                interfaceC58282Psa.DHV(0.0f, f3);
            }
        }
        if (bottomSheetView.A06 && bottomSheetView.A07) {
            bottomSheetView.A03 = f2;
            return false;
        }
        return false;
    }
}
