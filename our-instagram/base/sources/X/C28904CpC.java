package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* renamed from: X.CpC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28904CpC implements C1WA {
    public final /* synthetic */ AbstractC27080Bx4 A00;

    @Override // X.C1WA
    public final Drawable AM6(Resources resources, C27771Wf c27771Wf, C3QA c3qa) {
        C14360o3.A0B(c3qa, 1);
        if (c3qa instanceof C3QE) {
            AbstractC27080Bx4 abstractC27080Bx4 = this.A00;
            Bitmap CCP = ((C3QE) c3qa).CCP();
            if (CCP != null) {
                return new C210209Rj(AbstractC166997dE.A0L(abstractC27080Bx4), CCP, 16.0f, (int) (abstractC27080Bx4.A03 + abstractC27080Bx4.A02));
            }
            return null;
        }
        return null;
    }

    public C28904CpC(AbstractC27080Bx4 abstractC27080Bx4) {
        this.A00 = abstractC27080Bx4;
    }
}
