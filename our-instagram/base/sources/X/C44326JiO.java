package X;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* renamed from: X.JiO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44326JiO extends AbstractC55586OmP {
    public Object A00;
    public final int A01;

    public C44326JiO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        DirectVisualMessageViewerController directVisualMessageViewerController;
        C44761Jri A02;
        C45696KKz A00;
        C45696KKz A002;
        Integer valueOf;
        switch (this.A01) {
            case 0:
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    C49675Lx6 c49675Lx6 = (C49675Lx6) this.A00;
                    c49675Lx6.A04 = true;
                    c49675Lx6.A09.A0k();
                    C47949LGf c47949LGf = c49675Lx6.A0C.A00;
                    KBV.A01(c47949LGf.A0C.A00);
                    if (!c47949LGf.A04) {
                        c47949LGf.A04 = true;
                        C49675Lx6 c49675Lx62 = c47949LGf.A03;
                        if (c49675Lx62 == null) {
                            C14360o3.A0F("directVisualTimelineScrollController");
                            throw C00O.createAndThrow();
                        }
                        c49675Lx62.A05 = true;
                        KBV kbv = c47949LGf.A0B.A00;
                        KCV kcv = (KCV) kbv.getChildFragmentManager().A0Q(kbv.A06);
                        if (kcv != null && kcv.isResumed() && (directVisualMessageViewerController = kcv.A01) != null) {
                            directVisualMessageViewerController.A0Z = false;
                        }
                        C47949LGf.A00(c47949LGf);
                        return false;
                    }
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    C49675Lx6 c49675Lx63 = (C49675Lx6) this.A00;
                    c49675Lx63.A04 = false;
                    C49675Lx6.A03(c49675Lx63);
                    C47427KxI c47427KxI = c49675Lx63.A0C;
                    if (c49675Lx63.A01 != -1) {
                        c47427KxI.A00.A0C.A00();
                        return false;
                    }
                    return false;
                }
                return false;
            case 1:
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getAction() == 0) {
                    ((C69457Vng) this.A00).A00 = true;
                    return false;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    ((C69457Vng) this.A00).A00 = false;
                    return false;
                }
                return false;
            case 2:
                C14360o3.A0B(recyclerView, 0);
                C14360o3.A0B(motionEvent, 1);
                if (motionEvent.getActionMasked() == 0) {
                    C44761Jri A022 = C45510KCz.A02((C45510KCz) this.A00);
                    if (A022 != null && (A002 = A022.A00()) != null) {
                        ValueAnimator valueAnimator = A002.A08;
                        if (valueAnimator.isRunning()) {
                            valueAnimator.pause();
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                if (motionEvent.getActionMasked() == 1) {
                    C45510KCz c45510KCz = (C45510KCz) this.A00;
                    if (C45510KCz.A03(c45510KCz).A00 && (A02 = C45510KCz.A02(c45510KCz)) != null && (A00 = A02.A00()) != null) {
                        A00.A0H();
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                C14360o3.A0B(motionEvent, 1);
                int actionMasked = motionEvent.getActionMasked();
                boolean z = false;
                if (actionMasked != 0) {
                    valueOf = null;
                    if (actionMasked != 1) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return false;
                            }
                            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                            Number number = (Number) this.A00;
                            if (number == null || pointerId != number.intValue()) {
                                return true;
                            }
                        }
                    } else if (this.A00 == null) {
                        z = true;
                    }
                } else {
                    valueOf = Integer.valueOf(motionEvent.getPointerId(0));
                }
                this.A00 = valueOf;
                return z;
        }
    }

    public C44326JiO() {
        this.A01 = 3;
    }
}
