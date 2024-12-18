package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.G3w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36395G3w implements GXY {
    public final int A00;
    public final Object A01;

    public C36395G3w(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C36881nl c36881nl, Object obj, int i) {
        c36881nl.A06 = new C36395G3w(obj, i);
        c36881nl.A06();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.GXY
    public final void Dsp() {
        DirectSearchInboxFragment directSearchInboxFragment;
        Activity activity;
        switch (this.A00) {
            case 0:
            case 1:
            case 7:
            case Process.SIGTERM /* 15 */:
                activity = (Activity) this.A01;
                activity.finish();
                return;
            case 2:
                activity = AbstractC31172DnG.A0C(this.A01);
                activity.finish();
                return;
            case 3:
            case 6:
            case 9:
                activity = ((Fragment) this.A01).getActivity();
                if (activity == null) {
                    return;
                }
                activity.finish();
                return;
            case 4:
                activity = AbstractC31172DnG.A0C(this.A01);
                activity.finish();
                return;
            case 5:
                C32324ELs c32324ELs = (C32324ELs) this.A01;
                if (c32324ELs.getActivity() == null) {
                    return;
                }
                AbstractC31171DnF.A1L(c32324ELs);
                activity = c32324ELs.getActivity();
                activity.finish();
                return;
            case 8:
                activity = ((C36373G2z) this.A01).A01;
                activity.finish();
                return;
            case 10:
                directSearchInboxFragment = ((C36010Fv8) this.A01).A0K;
                if (directSearchInboxFragment == null) {
                    return;
                }
                directSearchInboxFragment.A03();
                return;
            case 11:
            case 14:
                activity = ((Fragment) this.A01).getActivity();
                if (activity == null) {
                    return;
                }
                activity.setResult(-1);
                activity.finish();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                directSearchInboxFragment = (DirectSearchInboxFragment) this.A01;
                directSearchInboxFragment.A03();
                return;
            case 16:
                AbstractC167017dG.A0y((Activity) this.A01, C3DN.A00);
                return;
            case 17:
                activity = ((C34959Faj) this.A01).A00;
                activity.finish();
                return;
            default:
                return;
        }
    }
}
