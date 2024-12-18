package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.List;

/* loaded from: classes6.dex */
public final class G5C implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C7Ze A02;
    public final C163397Tc A03;
    public final InterfaceC09390do A04;

    public G5C(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7Ze c7Ze) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A02 = c7Ze;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A03 = (C163397Tc) userSession.A01(C163397Tc.class, C163387Tb.A00);
        this.A04 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37059GUt(this, 22));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.generic_xma_vstack, viewGroup, false);
        C14360o3.A0C(inflate, MSV.A00(12));
        return new G5D(layoutInflater, (IgLinearLayout) inflate);
    }

    public static final String A00(E9A e9a) {
        Long l = e9a.A01.A0Q;
        if (l != null) {
            long longValue = l.longValue();
            if (longValue == 1000) {
                return "GENAI_SUBSCRIPTION";
            }
            if (longValue == 1100) {
                return "GENAI_REMINDER";
            }
            return null;
        }
        return null;
    }

    public static final void A01(G5C g5c, E9A e9a, boolean z) {
        C7QY c7qy = e9a.A01;
        String str = c7qy.A0V;
        String valueOf = String.valueOf(c7qy.A0L.A02);
        if (str != null) {
            String str2 = c7qy.A08.A00;
            C7Ze c7Ze = g5c.A02;
            InterfaceC165107Zz interfaceC165107Zz = (InterfaceC165107Zz) c7Ze;
            InterfaceC83733oI interfaceC83733oI = c7qy.A0M;
            List list = e9a.A03;
            if (!z) {
                list = AbstractC001800i.A0d(list, 3);
            }
            interfaceC165107Zz.CiK(interfaceC83733oI, str2, valueOf, str, ((InterfaceC165167a5) c7Ze).B2R(), null, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[SYNTHETIC] */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r25, X.InterfaceC129555tK r26) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G5C.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
    }
}
