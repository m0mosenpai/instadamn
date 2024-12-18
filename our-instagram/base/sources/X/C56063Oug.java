package X;

import android.content.Context;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.Oug, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56063Oug implements InterfaceC60072op {
    public boolean A00;
    public final C52164N6q A01;
    public final Context A02;

    public C56063Oug(Context context, C52164N6q c52164N6q, String str) {
        C14360o3.A0B(str, 3);
        this.A02 = context;
        this.A01 = c52164N6q;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        boolean z;
        String str;
        C52164N6q c52164N6q = this.A01;
        InterfaceC09390do interfaceC09390do = c52164N6q.A0D;
        IGTVUploadViewModel A0b = MSW.A0b(interfaceC09390do);
        if (!C14360o3.A0K(A0b.A01, NND.A00) && (A0b.A01 instanceof NNE)) {
            C47Z c47z = A0b.A02().A02;
            if (c47z.A33 == null && ((str = A0b.A0M.A0J) == null || str.length() == 0)) {
                z = false;
            } else {
                z = true;
            }
            boolean A0q = c47z.A0q();
            boolean A04 = C55201OeB.A04(c47z);
            if (z && ((A0q || A04) && !this.A00)) {
                this.A00 = true;
                C193328hC A0I = AbstractC31171DnF.A0I(this.A02);
                A0I.A0A(2131972723);
                A0I.A09(2131972722);
                A0I.A0L(DialogInterfaceOnClickListenerC55320Ogi.A00(this, 1), 2131958590);
                AbstractC31176DnK.A16(DialogInterfaceOnClickListenerC55320Ogi.A00(this, 2), A0I, 2131958587);
                return true;
            }
        }
        if (!this.A00) {
            OPI.A01(c52164N6q, interfaceC09390do);
            return false;
        }
        return false;
    }
}
