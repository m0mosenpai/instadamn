package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Lm0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49012Lm0 implements C7Q6 {
    public final /* synthetic */ C49112Lnp A00;

    public C49012Lm0(C49112Lnp c49112Lnp) {
        this.A00 = c49112Lnp;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        KTA kta = (KTA) obj;
        C49112Lnp c49112Lnp = this.A00;
        C14360o3.A0A(kta);
        boolean BCt = kta.BCt();
        MessageIdentifier BSy = kta.BSy();
        InterfaceC165247aD interfaceC165247aD = c49112Lnp.A01;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165247aD, BSy, BCt)) {
            C45948KUz c45948KUz = kta.A04;
            String str = c45948KUz.A04;
            ((InterfaceC165147a3) interfaceC165247aD).CrG(c45948KUz.A01, str, c45948KUz.A02, kta.BSy().A01, c45948KUz.A03, c45948KUz.A05, -1, c45948KUz.A07);
            return true;
        }
        return true;
    }
}
