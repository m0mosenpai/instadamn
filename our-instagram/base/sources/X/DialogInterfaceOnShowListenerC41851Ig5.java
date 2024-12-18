package X;

import android.content.DialogInterface;

/* renamed from: X.Ig5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnShowListenerC41851Ig5 implements DialogInterface.OnShowListener {
    public final /* synthetic */ InterfaceC1118853a A00;
    public final /* synthetic */ C149126nM A01;

    public DialogInterfaceOnShowListenerC41851Ig5(InterfaceC1118853a interfaceC1118853a, C149126nM c149126nM) {
        this.A01 = c149126nM;
        this.A00 = interfaceC1118853a;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C149126nM c149126nM = this.A01;
        AbstractC31175DnJ.A1N(c149126nM.A01, "ig_stories_unified_feedback_disclosure_impression");
        this.A00.EJE("dialog");
        c149126nM.A02.A00();
    }
}
