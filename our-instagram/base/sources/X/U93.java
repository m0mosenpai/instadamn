package X;

import android.os.FileObserver;

/* loaded from: classes11.dex */
public final class U93 extends FileObserver {
    public final /* synthetic */ WZ8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U93(WZ8 wz8, String str) {
        super(str, 2);
        this.A00 = wz8;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
    }
}
