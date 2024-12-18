package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GJ3 implements InterfaceC37205GaG {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onFinish() {
    }

    @Override // X.InterfaceC37205GaG
    public final /* synthetic */ void onStart() {
    }

    public GJ3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC37205GaG
    public final void DFj(Integer num) {
        Context context;
        String str;
        switch (this.A00) {
            case 0:
                LLk lLk = (LLk) this.A01;
                AbstractC46744Km1.A00(lLk.A0h, lLk.A0Y, false);
                return;
            case 1:
            case 2:
            default:
                context = ((Fragment) this.A01).requireContext();
                break;
            case 3:
                context = ((C28189Cbd) this.A01).A02;
                break;
            case 4:
                context = ((AbstractC59962oe) this.A01).getRootActivity();
                str = "something_went_wrong";
                C9GR.A0B(context, str);
        }
        str = "unrestricted_user_failed";
        C9GR.A0B(context, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC37205GaG
    public final void onSuccess() {
        Context context;
        switch (this.A00) {
            case 0:
                LLk lLk = (LLk) this.A01;
                LLk.A0J(lLk);
                AbstractC59962oe abstractC59962oe = lLk.A0b;
                AbstractC31173DnH.A13(abstractC59962oe.getRootActivity(), abstractC59962oe, 2131952120);
                return;
            case 1:
            case 2:
            default:
                context = ((Fragment) this.A01).requireContext();
                C9GR.A07(context, 2131952120);
                return;
            case 3:
                context = ((C28189Cbd) this.A01).A02;
                C9GR.A07(context, 2131952120);
                return;
            case 4:
                C32345EMr c32345EMr = (C32345EMr) this.A01;
                if (c32345EMr.A06) {
                    InterfaceC37142GYd interfaceC37142GYd = c32345EMr.A03;
                    if (interfaceC37142GYd == null) {
                        return;
                    }
                    String str = c32345EMr.A05;
                    if (str == null) {
                        C14360o3.A0F("targetUserId");
                        throw C00O.createAndThrow();
                    }
                    interfaceC37142GYd.Dy6(str);
                    return;
                }
                C3DN A01 = C3DN.A00.A01(c32345EMr.getContext());
                if (A01 == null) {
                    return;
                }
                ((C3DP) A01).A0H = new GHK(14, c32345EMr, A01);
                A01.A0B();
                return;
        }
    }
}
