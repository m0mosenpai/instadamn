package X;

import android.app.Activity;

/* renamed from: X.KmK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46763KmK {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A00(Activity activity) {
        if (!(activity instanceof InterfaceC53772dG)) {
            return false;
        }
        InterfaceC53772dG interfaceC53772dG = (InterfaceC53772dG) activity;
        if (!interfaceC53772dG.CYp()) {
            return false;
        }
        C59802oN BUF = interfaceC53772dG.BUF();
        if (BUF != null) {
            BUF.A03();
        }
        return true;
    }
}
