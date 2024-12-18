package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.io.File;
import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: X.9h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215939h9 extends C2AH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C215939h9(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        if (this.A00 != 0) {
            super.onFinish();
        } else {
            ((C33629Etf) this.A02).A00();
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        switch (this.A00) {
            case 0:
                ((C33629Etf) this.A02).A01();
                return;
            case 1:
            default:
                super.onStart();
                return;
            case 2:
                C218059kd c218059kd = (C218059kd) this.A01;
                final Context context = c218059kd.A07;
                final int height = ((NineSixteenLayoutConfigImpl) c218059kd.A09).A0K.getHeight();
                C38321qM c38321qM = c218059kd.A05;
                c38321qM.getClass();
                final float A0m = c38321qM.A0m();
                Drawable drawable = new Drawable(context, A0m, height) { // from class: X.9Rh
                    public final float A00;
                    public final int A01;
                    public final Paint A02;

                    @Override // android.graphics.drawable.Drawable
                    public final int getOpacity() {
                        return -1;
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setAlpha(int i) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void setColorFilter(ColorFilter colorFilter) {
                    }

                    @Override // android.graphics.drawable.Drawable
                    public final void draw(Canvas canvas) {
                        canvas.drawRect(0.0f, 0.0f, (int) (this.A00 * r4), this.A01, this.A02);
                    }

                    {
                        Paint A0R = AbstractC166987dD.A0R();
                        this.A02 = A0R;
                        AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A09(context));
                        this.A01 = height;
                        this.A00 = A0m;
                    }
                };
                c218059kd.A01 = drawable;
                c218059kd.A0A.A0C(drawable, new C8FC(c218059kd.A0B), false);
                return;
        }
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        switch (this.A00) {
            case 0:
                File A0Z = AbstractC166997dE.A0Z(obj);
                C36325G0u c36325G0u = (C36325G0u) this.A03;
                c36325G0u.A04 = A0Z;
                Intent intent = (Intent) this.A01;
                android.net.Uri fromFile = android.net.Uri.fromFile(A0Z);
                if (fromFile == null && (fromFile = intent.getData()) == null) {
                    throw AbstractC166997dE.A0g();
                }
                C36325G0u.A00(fromFile, c36325G0u);
                return;
            case 1:
                C189368aD c189368aD = (C189368aD) obj;
                C14360o3.A0B(c189368aD, 0);
                ((C9S8) this.A03).A08.clear();
                Iterator it = c189368aD.A01.iterator();
                while (it.hasNext()) {
                    ((C8SF) this.A01).A04((Medium) it.next(), (InterfaceC193488hT) this.A02);
                }
                return;
            case 2:
                File file = (File) obj;
                C38321qM c38321qM = (C38321qM) this.A03;
                int A0J = AbstractC167017dG.A0J(c38321qM);
                C14360o3.A0B(file, 0);
                Medium A03 = C8IU.A03(file, A0J, 0);
                C218059kd c218059kd = (C218059kd) this.A01;
                A03.A0H = AbstractC22750A1u.A00(c218059kd.A08, file, A03.Cff());
                c218059kd.A0C.put(c38321qM.getId(), A03);
                C218059kd.A01((C5GJ) this.A02, c218059kd, c38321qM);
                return;
            default:
                File file2 = (File) obj;
                C38321qM c38321qM2 = (C38321qM) this.A03;
                int A0J2 = AbstractC167017dG.A0J(c38321qM2);
                C14360o3.A0B(file2, 0);
                Medium A032 = C8IU.A03(file2, A0J2, 0);
                ((AbstractMap) this.A02).put(c38321qM2.getId(), A032);
                C9V1 c9v1 = (C9V1) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                if (c38321qM2.equals(c9v1.A00)) {
                    C9V1.A00(A032, c9v1);
                    return;
                }
                return;
        }
    }
}
