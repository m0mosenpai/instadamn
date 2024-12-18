package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mja, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51192Mja extends AbstractC70653Fc {
    public static final List A00;
    public static final List A01;
    public static final List A02 = AbstractC16960so.A1Q(Float.valueOf(3.0f), Float.valueOf(-4.0f), Float.valueOf(-17.0f), Float.valueOf(-25.0f));

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        float A04;
        C14360o3.A0B(rect, 0);
        AbstractC25233BEq.A0v(1, view, recyclerView, c3f5);
        super.getItemOffsets(rect, view, recyclerView, c3f5);
        int A022 = RecyclerView.A02(view);
        Integer valueOf = Integer.valueOf(A022);
        if (A022 == -1 || valueOf == null) {
            A022 = 3;
        }
        Context A0L = AbstractC166997dE.A0L(view);
        int A002 = (int) AbstractC13880nE.A00(A0L, AbstractC167007dF.A04(C51170MjE.A01, A022));
        AbstractC43592JPx.A1F(view, A002);
        AbstractC43592JPx.A1G(view, A002);
        rect.set(0, (int) AbstractC13880nE.A00(A0L, AbstractC167007dF.A04(A01, A022)), (int) AbstractC13880nE.A00(A0L, AbstractC167007dF.A04(A00, A022)), 0);
        if (c3f5.A00() == 1) {
            A04 = 0.0f;
        } else {
            A04 = AbstractC167007dF.A04(A02, A022);
        }
        view.setRotation(A04);
        view.setTranslationZ(3.0f - A022);
    }

    static {
        float f;
        int i = 0;
        List list = C51170MjE.A01;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MSX.A1Q(A0i, AbstractC25227BEk.A00(AbstractC166987dD.A09(AbstractC001800i.A0I(list)), AbstractC166987dD.A09(it.next())));
        }
        A01 = A0i;
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            float A09 = AbstractC166987dD.A09(obj);
            if (i == 0) {
                f = 0.0f;
            } else {
                f = 8.0f - A09;
            }
            MSX.A1Q(A0i2, f);
            i = i2;
        }
        A00 = A0i2;
    }
}
