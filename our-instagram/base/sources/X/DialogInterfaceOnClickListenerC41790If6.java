package X;

import android.content.DialogInterface;

/* renamed from: X.If6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41790If6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C38P A00;

    public DialogInterfaceOnClickListenerC41790If6(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C38P c38p = this.A00;
        C38084GpD c38084GpD = c38p.A08;
        if (c38084GpD == null) {
            C14360o3.A0F("exploreMultiHideLogger");
            throw C00O.createAndThrow();
        }
        AbstractC37304Gc5.A16(AbstractC166987dD.A0f(c38084GpD.A00, "discover_media_chaining_alt_topic_nudge"), "ig_explore_controls_multi_hide_unsaved_changes_ignored");
        AbstractC153456vF.A00 = false;
        AbstractC153456vF.A00(c38p.getSession());
        AbstractC31177DnL.A12(c38p);
    }
}
