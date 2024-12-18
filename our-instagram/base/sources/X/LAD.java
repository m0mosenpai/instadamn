package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LAD {
    public final Context A01;
    public final Bitmap A02;
    public final C72768Xmk A03;
    public final boolean A05;
    public final UserSession A06;
    public final List A04 = AbstractC166987dD.A1E();
    public int A00 = -1;

    public final Bitmap A00() {
        float[] fArr;
        Bitmap bitmap = this.A02;
        C50627MWo c50627MWo = (C50627MWo) AbstractC001800i.A0O(this.A04, this.A00);
        if (c50627MWo != null) {
            fArr = (float[]) c50627MWo.A00;
        } else {
            fArr = null;
        }
        int i = AbstractC28121CaU.A00;
        if (fArr == null) {
            return null;
        }
        if (fArr.length != bitmap.getWidth() * bitmap.getHeight()) {
            return null;
        }
        return Y4d.A01(fArr, bitmap.getWidth(), bitmap.getHeight());
    }

    public final Bitmap A01() {
        float[] fArr;
        Bitmap bitmap = this.A02;
        C50627MWo c50627MWo = (C50627MWo) AbstractC001800i.A0O(this.A04, this.A00);
        if (c50627MWo != null) {
            fArr = (float[]) c50627MWo.A00;
        } else {
            fArr = null;
        }
        int i = AbstractC28121CaU.A00;
        Bitmap bitmap2 = null;
        if (fArr != null && bitmap.getWidth() * bitmap.getHeight() == fArr.length) {
            bitmap2 = Y4d.A00.A02(bitmap, fArr);
            Canvas A06 = AbstractC43592JPx.A06(bitmap2);
            List<PointF> A02 = A02();
            if (A02 == null) {
                A02 = C16930sl.A00;
            }
            for (PointF pointF : A02) {
                float f = pointF.x;
                float f2 = pointF.y;
                float dimension = this.A01.getResources().getDimension(R.dimen.abc_control_corner_material);
                Paint A0R = AbstractC166987dD.A0R();
                A0R.setColor(-1);
                AbstractC166987dD.A1R(A0R);
                A0R.setAlpha(128);
                A06.drawCircle(f, f2, dimension, A0R);
            }
        }
        return bitmap2;
    }

    public final List A02() {
        int i;
        List list = this.A04;
        if (!list.isEmpty() && (i = this.A00) >= 0) {
            List subList = list.subList(0, i + 1);
            ArrayList A0q = AbstractC167017dG.A0q(subList);
            Iterator it = subList.iterator();
            while (it.hasNext()) {
                A0q.add(((C50627MWo) it.next()).A01);
            }
            return A0q;
        }
        return C16930sl.A00;
    }

    public final List A03(Integer num, Integer num2) {
        if (num2 != null) {
            int intValue = num2.intValue();
            if (num != null) {
                int intValue2 = num.intValue();
                List<PointF> A0i = AbstractC001800i.A0i(A02(), new C17u(0, this.A00));
                ArrayList A0q = AbstractC167017dG.A0q(A0i);
                for (PointF pointF : A0i) {
                    Integer num3 = C05F.A01;
                    float[] A1b = AbstractC43592JPx.A1b();
                    A1b[0] = pointF.x / intValue2;
                    A1b[1] = pointF.y / intValue;
                    A0q.add(new OLT(num3, A1b));
                }
                return A0q;
            }
        }
        return C16930sl.A00;
    }

    public final boolean A04() {
        List list = this.A04;
        if ((!list.isEmpty()) && this.A00 < AbstractC31172DnG.A03(list, 1)) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if ((!this.A04.isEmpty()) && this.A00 >= 0) {
            return true;
        }
        return false;
    }

    public LAD(Context context, Bitmap bitmap, UserSession userSession, C72768Xmk c72768Xmk, boolean z) {
        this.A01 = context;
        this.A06 = userSession;
        this.A03 = c72768Xmk;
        this.A02 = bitmap;
        this.A05 = z;
    }
}
