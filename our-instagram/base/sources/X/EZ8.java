package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class EZ8 extends C2AH {
    public final Fragment A00;
    public final C8J0 A01;
    public final InterfaceC16660sJ A02;
    public final Context A03;
    public final C6WQ A04;

    public EZ8(Context context, Fragment fragment, C8J0 c8j0, C6WQ c6wq, InterfaceC16660sJ interfaceC16660sJ) {
        AbstractC25234BEr.A0j(1, context, c6wq, c8j0, interfaceC16660sJ);
        this.A03 = context;
        this.A00 = fragment;
        this.A04 = c6wq;
        this.A01 = c8j0;
        this.A02 = interfaceC16660sJ;
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14360o3.A0B(obj, 0);
        if (AbstractC34290FAk.A00(this.A00)) {
            this.A01.A01("activity_destroyed-media_save_task_on_success");
        } else {
            this.A02.invoke(obj);
        }
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        if (!AbstractC34290FAk.A00(this.A00)) {
            AbstractC31176DnK.A10(this.A04);
        }
        this.A01.A01("media_save_task_on_fail");
        C9GR.A0B(this.A03, "ReelMentionUploadCallback_something_went_wrong");
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        if (AbstractC34290FAk.A00(this.A00)) {
            this.A01.A01("activity_destroyed-media_save_task_on_start");
        } else {
            C0fJ.A00(this.A04);
        }
    }
}
