package X;

import android.content.ClipData;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OmT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55590OmT implements C7LD {
    public String A01;
    public final GestureDetector A03;
    public final InterfaceC58185Pqq A04;
    public final boolean A05;
    public final boolean A06;
    public boolean A02 = true;
    public Integer A00 = C05F.A00;

    public C55590OmT(RecyclerView recyclerView, InterfaceC58185Pqq interfaceC58185Pqq, boolean z, boolean z2) {
        this.A05 = z;
        this.A04 = interfaceC58185Pqq;
        this.A06 = z2;
        this.A03 = new GestureDetector(recyclerView.getContext(), new C51472MoJ(recyclerView, this));
    }

    public final void A01(MotionEvent motionEvent, RecyclerView recyclerView) {
        int A02;
        View A0I = MSZ.A0I(motionEvent, recyclerView);
        if (A0I != null && (A02 = RecyclerView.A02(A0I)) >= 0) {
            A0I.startDrag(ClipData.newPlainText("original_position", String.valueOf(A02)), new C50785Mbv(A0I), A0I, 0);
            this.A04.Dt4(A02);
        }
    }

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, motionEvent);
        if (!AbstractC31174DnI.A1a(motionEvent, this.A01) || motionEvent.getAction() != A1R) {
            if (MSZ.A0I(motionEvent, recyclerView) != null) {
                this.A03.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == A1R) {
                this.A04.Du0();
            }
            if (motionEvent.getAction() == 3) {
                this.A04.Du0();
                return false;
            }
        }
        return false;
    }

    @Override // X.C7LD
    public final void Dfm(boolean z) {
    }

    @Override // X.C7LD
    public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    public static final Integer[] A00(MotionEvent motionEvent, RecyclerView recyclerView, C55590OmT c55590OmT) {
        C2UU c2uu;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ArrayList A1E = AbstractC166987dD.A1E();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (x >= childAt.getLeft() + translationX && x <= childAt.getRight() + translationX && y >= childAt.getTop() + translationY && y <= childAt.getBottom() + translationY) {
                A1E.add(childAt);
            }
        }
        Iterator it = A1E.iterator();
        int i2 = -1;
        int i3 = -1;
        while (it.hasNext()) {
            View A09 = AbstractC43592JPx.A09(it);
            int A02 = RecyclerView.A02(A09);
            if (A09.getVisibility() == 0 && (c2uu = recyclerView.A0A) != null && A02 > 0 && A02 < c2uu.getItemCount() - 1) {
                if (!c55590OmT.A06) {
                    if (c55590OmT.A05) {
                        int i4 = A02 % 2;
                        if (i4 != 1) {
                            if (i4 != 0) {
                            }
                        } else {
                            i2 = A02;
                        }
                    } else {
                        int i5 = A02 % 2;
                        if (i5 != 0) {
                            if (i5 == 1) {
                            }
                        } else {
                            i2 = A02;
                        }
                    }
                }
                i3 = A02;
            }
        }
        return new Integer[]{Integer.valueOf(i2), Integer.valueOf(i3)};
    }
}
