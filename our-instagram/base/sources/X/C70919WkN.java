package X;

import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.WkN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70919WkN implements C74M {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70919WkN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str2, 2);
                Fragment fragment = (Fragment) this.A02;
                if (fragment.mView == null) {
                    return;
                }
                AbstractC23641Du.A05(C12L.A00.CPG(480314591, 3), new MC9(fragment, this.A01, str2, (InterfaceC23621Ds) null, 4), AbstractC25235BEs.A0S(fragment));
                return;
            case 1:
                C14360o3.A0B(xec, 1);
                ImageView imageView = (ImageView) this.A01;
                if (imageView.getTag() != this) {
                    return;
                }
                C68712Vao c68712Vao = (C68712Vao) this.A02;
                ChoreographerFrameCallbackC66314U8n choreographerFrameCallbackC66314U8n = new ChoreographerFrameCallbackC66314U8n(xec);
                c68712Vao.A00 = choreographerFrameCallbackC66314U8n;
                imageView.setImageDrawable(choreographerFrameCallbackC66314U8n);
                return;
            case 2:
                C14360o3.A0B(str2, 2);
                ((InterfaceC16660sJ) this.A02).invoke(str2);
                return;
            case 3:
                return;
            default:
                C14360o3.A0B(str2, 2);
                ((AtomicReference) this.A02).set(str2);
                ((CountDownLatch) this.A01).countDown();
                return;
        }
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
        switch (this.A00) {
            case 4:
            case 5:
                C14360o3.A0B(str2, 2);
                ((AtomicReference) this.A02).set(str2);
                ((CountDownLatch) this.A01).countDown();
                return;
            default:
                return;
        }
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }

    @Override // X.C74M
    public final void onError(String str) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                AbstractC25241Le.A02("BloksGif", AnonymousClass001.A0R("Failed to load gif: ", str));
                return;
            case 2:
                ((InterfaceC16820sZ) this.A01).invoke();
                return;
            case 3:
                ((OMQ) this.A02).A02();
                C51018MgQ.A00(((NYU) this.A01).A06);
                return;
            default:
                ((CountDownLatch) this.A01).countDown();
                return;
        }
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }
}
