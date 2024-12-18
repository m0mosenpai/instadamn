package X;

import android.content.Context;
import android.os.Bundle;
import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;
import com.instagram.modal.TransparentBackgroundModalActivity;

/* renamed from: X.9Jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208379Jw implements InterfaceC191378do {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static void A00(C208379Jw c208379Jw, String str, String str2) {
        AbstractC12120kG.A07(IgVoltronModelLoader.TAG, AnonymousClass001.A0R(str, str2), null);
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c208379Jw.A01;
        Throwable th = new Throwable(str2);
        C14360o3.A0B(th, 0);
        interfaceC16660sJ.invoke(new C09550e6(new C09540e5(th)));
    }

    public C208379Jw(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(str, 0);
                A00(this, "fetchExecuTorchVoltronModule onFailure ", str);
                return;
            case 1:
                C14360o3.A0B(str, 0);
                A00(this, "fetchSentencePieceVoltronModule onFailure ", str);
                return;
            case 2:
                C9GR.A01((Context) this.A02, null, 2131974293, 1);
                return;
            default:
                C14360o3.A0B(str, 0);
                C129805tk c129805tk = (C129805tk) this.A01;
                if (c129805tk != null) {
                    c129805tk.A00.markerPoint(331812717, "LIBRARY_DOWNLOAD_END");
                    C129805tk.A00(c129805tk, str, false);
                }
                ((C73163Pr) this.A02).A0W(false);
                return;
        }
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        switch (this.A00) {
            case 0:
                try {
                    C09170dP.A0D("executorch", 16);
                    ((IgVoltronModelLoader) this.A02).areExecuTorchLibrariesLoaded.set(true);
                    ((InterfaceC16660sJ) this.A01).invoke(new C09550e6(C0eB.A00));
                    return;
                } catch (UnsatisfiedLinkError e) {
                    AbstractC12120kG.A07(IgVoltronModelLoader.TAG, AnonymousClass001.A0R("SoLoader exception ", e.getLocalizedMessage()), null);
                    return;
                }
            case 1:
                ((IgVoltronModelLoader) this.A02).areSentencePieceLibrariesLoaded.set(true);
                ((InterfaceC16660sJ) this.A01).invoke(new C09550e6(C0eB.A00));
                return;
            case 2:
                Context context = (Context) this.A01;
                Bundle A00 = AbstractC22972AAq.A00();
                A00.putString("bottom_sheet_title", context.getString(2131958552));
                A00.putString("dogfooding_assistant_surface", "discovery");
                C6XJ.A06(context, A00, TransparentBackgroundModalActivity.class, "bottom_sheet");
                return;
            default:
                C129805tk c129805tk = (C129805tk) this.A01;
                if (c129805tk != null) {
                    c129805tk.A00.markerPoint(331812717, "LIBRARY_DOWNLOAD_END");
                }
                ((C73163Pr) this.A02).A0W(true);
                return;
        }
    }
}
