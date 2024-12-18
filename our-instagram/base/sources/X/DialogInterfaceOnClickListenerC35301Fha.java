package X;

import android.content.DialogInterface;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Fha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35301Fha implements DialogInterface.OnClickListener {
    public final int A00;

    public DialogInterfaceOnClickListenerC35301Fha(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
            case 1:
                if (dialogInterface == null) {
                    return;
                }
                dialogInterface.dismiss();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return;
            case 7:
            case 8:
            case 9:
                dialogInterface.dismiss();
                return;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGTERM /* 15 */:
            case 16:
                C14360o3.A0B(dialogInterface, 0);
                dialogInterface.dismiss();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                return;
        }
    }
}
