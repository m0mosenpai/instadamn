package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class LME implements DialogInterface.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public LME(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C141796aw A00;
        InterfaceC16620sF d4z;
        if (this.A00 != 0) {
            AbstractC52184N7v abstractC52184N7v = (AbstractC52184N7v) this.A02;
            C147896lL c147896lL = abstractC52184N7v.A03;
            if (c147896lL != null) {
                String str = abstractC52184N7v.A04;
                if (str != null) {
                    long j = this.A01;
                    HashMap hashMap = c147896lL.A08.A08;
                    Long valueOf = Long.valueOf(j);
                    Object obj = hashMap.get(valueOf);
                    if (obj != null) {
                        if (hashMap.containsKey(valueOf)) {
                            hashMap.remove(valueOf);
                        }
                        C147896lL.A00(c147896lL);
                        C2GS c2gs = c147896lL.A03;
                        OM6 om6 = (OM6) c2gs.A02();
                        if (om6 != null && om6.A01 == j) {
                            c2gs.A0B(null);
                        }
                        A00 = AbstractC141776au.A00(c147896lL);
                        d4z = new MBZ(obj, c147896lL, str, null, 2, j);
                    } else {
                        return;
                    }
                } else {
                    C14360o3.A0F("broadcastId");
                    throw C00O.createAndThrow();
                }
            } else {
                return;
            }
        } else {
            C26747BrT c26747BrT = (C26747BrT) this.A02;
            long j2 = this.A01;
            C28458ChA c28458ChA = C28458ChA.A00;
            UserSession A0r = AbstractC166987dD.A0r(c26747BrT.A01);
            InterfaceC09390do interfaceC09390do = c26747BrT.A00;
            c28458ChA.A08(A0r, "challenge_end_dialog", "confirm_end_challenge", ((C25872BcU) interfaceC09390do.getValue()).A04, null, null, null, AbstractC43594JPz.A10(j2), null);
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
            A00 = AbstractC141776au.A00(A0Z);
            d4z = new D4z(A0Z, null, 25);
        }
        AbstractC166987dD.A1Z(d4z, A00);
    }
}
