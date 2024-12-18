package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.IfD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41797IfD implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C149126nM A01;

    public DialogInterfaceOnClickListenerC41797IfD(Context context, C149126nM c149126nM) {
        this.A01 = c149126nM;
        this.A00 = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C149126nM c149126nM = this.A01;
        AbstractC31175DnJ.A1N(c149126nM.A01, "ig_stories_unified_feedback_disclosure_click");
        c149126nM.A02.A01(this.A00);
    }
}
