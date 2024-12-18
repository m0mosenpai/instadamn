package X;

import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.OkH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55462OkH implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC55462OkH(N5Z n5z, int i) {
        this.A00 = i;
        switch (i) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
                this.A01 = n5z;
                return;
            default:
                this.A01 = n5z;
                return;
        }
    }

    public static C50725MaQ A00(ViewOnClickListenerC55462OkH viewOnClickListenerC55462OkH) {
        return C50724MaP.A01((C50724MaP) viewOnClickListenerC55462OkH.A01);
    }

    public static void A01(View view, int i, Object obj) {
        C0fQ.A00(new ViewOnClickListenerC55462OkH(obj, i), view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0452, code lost:
    
        if (r1.A00.getBoolean("PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING", false) != false) goto L159;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x093f  */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r1v167, types: [java.lang.Object, X.1vN] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instructions count: 3796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC55462OkH.onClick(android.view.View):void");
    }

    public ViewOnClickListenerC55462OkH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
