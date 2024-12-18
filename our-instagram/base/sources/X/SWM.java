package X;

import com.facebook.react.modules.dialog.DialogModule;

/* loaded from: classes10.dex */
public final class SWM {
    public Object A00;
    public final AbstractC10360h2 A01;
    public final /* synthetic */ DialogModule A02;

    public SWM(AbstractC10360h2 abstractC10360h2, DialogModule dialogModule) {
        this.A02 = dialogModule;
        this.A01 = abstractC10360h2;
    }

    public static void A00(SWM swm) {
        C0SG c0sg;
        if (swm.A02.mIsInForeground && (c0sg = (C0SG) swm.A01.A0Q(DialogModule.FRAGMENT_TAG)) != null && c0sg.isResumed()) {
            c0sg.A07();
        }
    }
}
