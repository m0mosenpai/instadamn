package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class UH8 extends AbstractC70653Fc {
    public final int A00;
    public final C69369VmF A01;
    public final C6FG A02;
    public final C102884kP A03;
    public final Rect[] A04;

    public UH8(C6FG c6fg, C102884kP c102884kP) {
        int i;
        this.A03 = c102884kP;
        this.A02 = c6fg;
        C70102W3s c70102W3s = C70102W3s.A00;
        Context context = c6fg.A00;
        C69369VmF A00 = c70102W3s.A00(context, c102884kP);
        this.A01 = A00;
        int i2 = A00.A01;
        this.A00 = i2;
        boolean A002 = VSF.A00(context);
        if (i2 == 1) {
            i = A00.A00;
        } else {
            i = A00.A03;
        }
        this.A04 = AbstractC68292VLe.A00(i2, i, A00.A02, A002);
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        AnonymousClass807 anonymousClass807;
        int i;
        List unmodifiableList;
        Rect rect2;
        boolean A1b = AbstractC25233BEq.A1b(rect, view, recyclerView);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof AnonymousClass807) && (anonymousClass807 = (AnonymousClass807) layoutParams) != null) {
            int A02 = RecyclerView.A02(view);
            C102884kP c102884kP = this.A03;
            Object obj = c102884kP.A0M().get(A02);
            C14360o3.A07(obj);
            C102884kP A08 = ((C102884kP) obj).A08(132);
            boolean z = false;
            if (A08 != null && A08.A05 == 16482) {
                z = A08.A0S(36, false);
            }
            anonymousClass807.A01 = z;
            Object A06 = AnonymousClass634.A06(this.A02, c102884kP);
            A06.getClass();
            List list = ((U4G) A06).A08;
            if (list != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (rect2 = (Rect) AbstractC001800i.A0O(unmodifiableList, A02)) != null) {
                if (this.A00 == A1b) {
                    rect.top = rect2.top;
                    rect.bottom = rect2.bottom;
                } else {
                    rect.left = rect2.left;
                    rect.right = rect2.right;
                }
            }
            Rect[] rectArr = this.A04;
            C9GM c9gm = anonymousClass807.A00;
            if (c9gm == null) {
                i = -1;
            } else {
                i = c9gm.A04;
            }
            Rect rect3 = (Rect) AbstractC009903n.A06(rectArr, i);
            if (!z && rect3 != null) {
                if (this.A00 == A1b) {
                    rect.left = rect3.left;
                    rect.right = rect3.right;
                } else {
                    rect.top = rect3.top;
                    rect.bottom = rect3.bottom;
                }
            }
        }
    }
}
