package X;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.LrQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49332LrQ implements XLV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DirectVisualMessageViewerController A01;

    @Override // X.InterfaceC144626fi
    public final boolean DrU() {
        return false;
    }

    @Override // X.InterfaceC144626fi
    public final boolean DrW() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x03b9, code lost:
    
        if (r0.A00 != (-1)) goto L215;
     */
    @Override // X.XLV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DsQ(android.view.View r26, float r27, float r28) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49332LrQ.DsQ(android.view.View, float, float):boolean");
    }

    public C49332LrQ(DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        this.A01 = directVisualMessageViewerController;
        this.A00 = i;
    }

    @Override // X.XLV
    public final void DBc(float f) {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        float A01 = C1H4.A01(f);
        boolean z = directVisualMessageViewerController.A0V;
        float f2 = directVisualMessageViewerController.A01;
        if (z) {
            if (A01 < f2) {
                return;
            }
        } else if (A01 > f2) {
            return;
        }
        C148536mO c148536mO = directVisualMessageViewerController.A0M;
        if (c148536mO == null) {
            C14360o3.A0F("reelInteractiveController");
            throw C00O.createAndThrow();
        }
        if (!c148536mO.A04() && DirectVisualMessageViewerController.A0T(directVisualMessageViewerController)) {
            C47946LGa c47946LGa = directVisualMessageViewerController.A0G;
            boolean z2 = false;
            if (c47946LGa != null && c47946LGa.A00 > 0) {
                z2 = true;
            }
            DirectVisualMessageViewerController.A0P(directVisualMessageViewerController, z2);
        }
    }

    @Override // X.XLV
    public final void DC6(float f) {
        L22 l22 = this.A01.reelViewerShadowAnimator;
        if (l22 != null) {
            float A00 = JQ0.A00(f);
            l22.A00 = A00;
            l22.A02.A00(l22.A01, A00);
        }
    }

    @Override // X.XLV
    public final void DRR() {
        DirectVisualMessageViewerController.A0L(this.A01, 6, false);
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean DrS(float f, float f2) {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (directVisualMessageViewerController.replyComposerContainer != null && directVisualMessageViewerController.A0X) {
            EditText editText = directVisualMessageViewerController.composerEditText;
            if (editText != null) {
                editText.clearFocus();
            }
            AbstractC13880nE.A0O(directVisualMessageViewerController.composerEditText);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC144626fi, X.InterfaceC144636fj
    public final boolean Drb(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0V(directVisualMessageViewerController) || directVisualMessageViewerController.replyComposerContainer == null || directVisualMessageViewerController.A0X) {
            return false;
        }
        EditText editText = directVisualMessageViewerController.composerEditText;
        if (editText != null) {
            editText.requestFocus();
            AbstractC13880nE.A0R(editText);
        }
        return true;
    }

    @Override // X.XLV
    public final void DsN(float f, float f2) {
        C57012jc c57012jc;
        View A01;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0T(directVisualMessageViewerController)) {
            directVisualMessageViewerController.A0W("tapped");
            View view = directVisualMessageViewerController.replyComposerContainer;
            if (view != null || (view = directVisualMessageViewerController.selfViewFooterContainer) != null) {
                C150956qv.A08(new View[]{view}, true);
            }
            C150956qv.A08(new View[]{directVisualMessageViewerController.viewerInfoContainer}, true);
            DirectVisualMessageViewerController.A0P(directVisualMessageViewerController, false);
            return;
        }
        if (!DirectVisualMessageViewerController.A0U(directVisualMessageViewerController) || (c57012jc = directVisualMessageViewerController.sparklerAnimationStubHolder) == null || (A01 = c57012jc.A01()) == null) {
            return;
        }
        int i = this.A00;
        C150956qv.A09(new View[]{A01}, true);
        float f3 = i;
        A01.setX(f - f3);
        A01.setY(f2 - f3);
        Drawable background = A01.getBackground();
        C14360o3.A0C(background, MSV.A00(1435));
        ((AnimationDrawable) background).start();
    }

    @Override // X.XLV
    public final void DsO() {
        View view;
        AnimationDrawable animationDrawable;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0T(directVisualMessageViewerController)) {
            directVisualMessageViewerController.A0X("resume");
            View view2 = directVisualMessageViewerController.replyComposerContainer;
            if (view2 != null || (view2 = directVisualMessageViewerController.selfViewFooterContainer) != null) {
                C150956qv.A09(new View[]{view2}, true);
            }
            C150956qv.A09(new View[]{directVisualMessageViewerController.viewerInfoContainer}, true);
            return;
        }
        if (!DirectVisualMessageViewerController.A0U(directVisualMessageViewerController)) {
            return;
        }
        C57012jc c57012jc = directVisualMessageViewerController.sparklerAnimationStubHolder;
        Drawable drawable = null;
        if (c57012jc != null) {
            view = c57012jc.A01();
            if (view != null) {
                drawable = view.getBackground();
            }
        } else {
            view = null;
        }
        if ((drawable instanceof AnimationDrawable) && (animationDrawable = (AnimationDrawable) drawable) != null) {
            animationDrawable.stop();
        }
        C150956qv.A08(new View[]{view}, true);
    }

    @Override // X.XLV
    public final void DsP(float f, float f2) {
        C57012jc c57012jc;
        View A01;
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A01;
        if (DirectVisualMessageViewerController.A0U(directVisualMessageViewerController) && (c57012jc = directVisualMessageViewerController.sparklerAnimationStubHolder) != null && (A01 = c57012jc.A01()) != null) {
            float f3 = this.A00;
            A01.setX(f - f3);
            A01.setY(f2 - f3);
        }
    }

    @Override // X.XLV
    public final void Dwm() {
        DirectVisualMessageViewerController.A0P(this.A01, false);
    }
}
