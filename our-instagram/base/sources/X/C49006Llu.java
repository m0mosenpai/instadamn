package X;

import android.view.MotionEvent;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Llu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49006Llu implements C7Q6 {
    public final /* synthetic */ C49120Lnx A00;

    public C49006Llu(C49120Lnx c49120Lnx) {
        this.A00 = c49120Lnx;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C45895KSy c45895KSy = (C45895KSy) obj;
        boolean BCt = c45895KSy.BCt();
        MessageIdentifier BSy = c45895KSy.BSy();
        InterfaceC165247aD interfaceC165247aD = this.A00.A04;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) interfaceC165247aD, BSy, BCt)) {
            AbstractC46444Kh4 abstractC46444Kh4 = c45895KSy.A01;
            if (abstractC46444Kh4 instanceof C45939KUq) {
                C7Y8 c7y8 = (C7Y8) interfaceC165247aD;
                C14360o3.A0C(abstractC46444Kh4, "null cannot be cast to non-null type com.instagram.direct.messagethread.linkmessage.model.LinkContentViewModel.PreviewFields.Preview");
                String str = ((C45939KUq) abstractC46444Kh4).A05;
                if (str == null) {
                    str = "";
                }
                c7y8.Cs6(str, c45895KSy.A03, null);
            } else {
                return false;
            }
        }
        return true;
    }
}
