package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Draft;

/* renamed from: X.Ldh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48544Ldh implements C3Se {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C48544Ldh(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C3Se
    public final void CzZ(Bitmap bitmap) {
        Object obj;
        switch (this.A00) {
            case 0:
                if (bitmap == null) {
                    return;
                }
                C44658Jq3 c44658Jq3 = (C44658Jq3) this.A02;
                LZX lzx = (LZX) this.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C46077KaZ c46077KaZ = c44658Jq3.A01;
                c46077KaZ.Dt2(bitmap, new Draft(null, String.valueOf(lzx.A00), null, null, 0, false, true, false, false));
                ViewOnClickListenerC48066LPr.A00(c46077KaZ, 6, lzx, c44658Jq3);
                return;
            case 1:
            case 2:
            default:
                ((C73163Pr) this.A01).A0W(C0eB.A00);
                obj = this.A02;
                ((C3PR) obj).A02(this);
                return;
            case 3:
                ((C3PR) this.A02).A02(this);
                ((InterfaceC23621Ds) this.A01).resumeWith(bitmap);
                return;
            case 4:
                X1v x1v = ((C72793XnE) this.A01).A02;
                if (x1v != null) {
                    x1v.A07(new RunnableC73520YHk(bitmap, this));
                }
                obj = (Drawable) this.A02;
                ((C3PR) obj).A02(this);
                return;
        }
    }
}
