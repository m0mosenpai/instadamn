package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* loaded from: classes8.dex */
public final class JYK extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static BottomSheetFragment A00(MotionEvent motionEvent, JYK jyk) {
        Integer num;
        C14360o3.A0B(motionEvent, 0);
        BottomSheetFragment bottomSheetFragment = (BottomSheetFragment) jyk.A02;
        C3DN bottomSheetNavigator = bottomSheetFragment.A04.getBottomSheetNavigator();
        if (bottomSheetNavigator != null) {
            float y = motionEvent.getY();
            if (Float.valueOf(y) == null) {
                num = C05F.A1F;
            } else {
                ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) ((C3DN) jyk.A01)).A0D;
                if (viewOnTouchListenerC65896Tw0 != null && viewOnTouchListenerC65896Tw0.A0J(y)) {
                    num = C05F.A0u;
                } else {
                    num = C05F.A0j;
                }
            }
            bottomSheetNavigator.A0U(num);
        }
        return bottomSheetFragment;
    }

    public JYK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (X.C4AC.A08(r3.A02) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r0 == false) goto L45;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTap(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 2: goto L1b;
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r0 = super.onDoubleTap(r10)
            return r0
        La:
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r0 = A00(r10, r9)
            X.8aO r0 = r0.A03
            if (r0 == 0) goto L19
            X.TnB r0 = r0.A0W
            if (r0 == 0) goto L19
            r0.DBZ()
        L19:
            r0 = 0
            return r0
        L1b:
            java.lang.Object r6 = r9.A02
            X.4qU r6 = (X.C106144qU) r6
            java.lang.Object r5 = r9.A01
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            X.4F5 r4 = r6.A00
            if (r4 == 0) goto Ld7
            X.4FE r3 = r6.A0A
            boolean r0 = X.C106144qU.A06(r4, r6)
            if (r0 != 0) goto Ld7
            boolean r2 = r3.A09
            if (r2 != 0) goto L3c
            com.instagram.common.session.UserSession r0 = r3.A02
            boolean r0 = X.C4AC.A08(r0)
            r1 = 1
            if (r0 != 0) goto L3d
        L3c:
            r1 = 0
        L3d:
            boolean r0 = r4.A0R
            if (r0 != 0) goto Ld7
            boolean r0 = r4.A0S
            if (r0 != 0) goto Ld7
            boolean r0 = r4.A0Q
            if (r0 != 0) goto Ld7
            java.util.List r8 = r4.A0J
            boolean r0 = X.AbstractC166987dD.A1b(r8)
            if (r0 == 0) goto Ld7
            if (r1 != 0) goto L5d
            if (r2 == 0) goto Ld7
            com.instagram.common.session.UserSession r0 = r3.A02
            boolean r0 = X.C4AC.A05(r0)
            if (r0 == 0) goto Ld7
        L5d:
            X.2UY r0 = X.C2UY.A01
            r0.A04()
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0Tz r2 = X.AbstractC166997dE.A0U(r7)
            r0 = 36324264999268404(0x810cba00023034, double:3.034949679387803E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto L94
            X.LL7 r2 = X.LL7.A01
            java.lang.Object r0 = X.AbstractC001800i.A0J(r8)
            X.MOe r0 = (X.InterfaceC50424MOe) r0
            if (r0 == 0) goto L87
            X.6C9 r0 = r0.BXJ()
            if (r0 == 0) goto L87
            java.lang.String r1 = r0.A0J
            if (r1 != 0) goto L89
        L87:
            java.lang.String r1 = ""
        L89:
            android.content.Context r0 = X.AbstractC37301Gc2.A03(r6)
            boolean r0 = r2.A04(r0, r1)
            r2 = 1
            if (r0 != 0) goto L95
        L94:
            r2 = 0
        L95:
            com.instagram.direct.inbox.notes.ui.NoteAvatarView r8 = r6.A08
            boolean r1 = X.C106144qU.A05(r4)
            r0 = 12
            X.ME4 r7 = new X.ME4
            r7.<init>(r0, r4, r3, r5)
            com.instagram.common.ui.base.IgSimpleImageView r6 = r8.A07
            if (r1 == 0) goto Ldb
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A0N
        La8:
            if (r2 == 0) goto Ld9
            android.content.Context r4 = X.AbstractC166997dE.A0L(r8)
            android.graphics.drawable.Drawable r0 = r8.A00
            if (r0 != 0) goto Ld4
            r0 = 2130970234(0x7f04067a, float:1.7549172E38)
            int r3 = X.AbstractC167007dF.A09(r4, r0)
            r0 = 2130970233(0x7f040679, float:1.754917E38)
            int r2 = X.AbstractC167007dF.A09(r4, r0)
            r0 = 2130970232(0x7f040678, float:1.7549168E38)
            int r0 = X.AbstractC167007dF.A09(r4, r0)
            r1 = 2131238063(0x7f081caf, float:1.8092394E38)
            int[] r0 = new int[]{r3, r2, r0}
            android.graphics.drawable.BitmapDrawable r0 = X.C3LQ.A04(r4, r0, r1)
            r8.A00 = r0
        Ld4:
            X.F3Y.A00(r0, r5, r6, r7)
        Ld7:
            r0 = 1
            return r0
        Ld9:
            r0 = 0
            goto Ld4
        Ldb:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r8.A0O
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYK.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
            case 2:
            case 4:
                return true;
            case 1:
            case 3:
            default:
                return super.onDown(motionEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (r13 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dd, code lost:
    
        if (r13 != null) goto L22;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLongPress(android.view.MotionEvent r32) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JYK.onLongPress(android.view.MotionEvent):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC65577TnB interfaceC65577TnB;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(motionEvent, 0);
                C26573BoW c26573BoW = (C26573BoW) this.A02;
                C26573BoW.A03(c26573BoW.A00, (C76223bS) this.A01, c26573BoW);
            case 1:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 2:
                C106144qU c106144qU = (C106144qU) this.A02;
                EnumC152696tw enumC152696tw = (EnumC152696tw) this.A01;
                IgTextView igTextView = c106144qU.A05;
                Typeface typeface = igTextView.getTypeface();
                if (typeface != null && typeface.isBold()) {
                    igTextView.setTypeface(null, 0);
                    SpannableStringBuilder A0H = AbstractC25225BEi.A0H(igTextView.getText());
                    C4GL.A05(A0H, ImageSpan.class);
                    igTextView.setText(A0H);
                }
                C4F5 c4f5 = c106144qU.A00;
                if (c4f5 != null) {
                    c106144qU.A0A.A05.A01(enumC152696tw, c4f5);
                    return true;
                }
                return true;
            case 3:
                C189448aO c189448aO = A00(motionEvent, this).A03;
                if (c189448aO != null && (interfaceC65577TnB = c189448aO.A0W) != null) {
                    interfaceC65577TnB.DmX();
                    return false;
                }
                return false;
            case 4:
                C51361MmM c51361MmM = (C51361MmM) this.A02;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c51361MmM.A04.performHapticFeedback(16);
                c51361MmM.A0B.invoke(this.A01);
                return true;
        }
    }
}
