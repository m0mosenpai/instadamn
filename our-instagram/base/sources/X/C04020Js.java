package X;

import android.content.Intent;

/* renamed from: X.0Js, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04020Js implements InterfaceC41471vw {
    public final Intent A00;
    public final Runnable A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public /* synthetic */ C04020Js(Intent intent, Runnable runnable, String str, String str2, int i, boolean z) {
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        intent = (i & 16) != 0 ? null : intent;
        z = (i & 32) != 0 ? false : z;
        runnable = (i & 64) != 0 ? null : runnable;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = intent;
        this.A04 = z;
        this.A01 = runnable;
    }
}
