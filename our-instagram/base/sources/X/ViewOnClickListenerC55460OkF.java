package X;

import android.view.View;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;

/* renamed from: X.OkF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55460OkF implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC55460OkF(N7W n7w, int i) {
        this.A00 = i;
        if (62 - i != 0) {
            this.A01 = n7w;
        } else {
            this.A01 = n7w;
        }
    }

    public static void A00(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC55460OkF(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f1, code lost:
    
        if (com.instagram.creation.fragment.EditMediaInfoFragment.A0O(r1) == false) goto L32;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0ba0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v272, types: [X.Osu, java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r0v278, types: [X.Osu, java.lang.Object, X.1vN] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r34) {
        /*
            Method dump skipped, instructions count: 4628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55460OkF.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC55460OkF(EditMediaInfoFragment editMediaInfoFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                this.A01 = editMediaInfoFragment;
                return;
            default:
                this.A01 = editMediaInfoFragment;
                return;
        }
    }

    public ViewOnClickListenerC55460OkF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
