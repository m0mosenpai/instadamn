package X;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;

/* renamed from: X.Sx8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63982Sx8 implements InterfaceC65341TiM {
    public final ComponentName A00;
    public final String A01;
    public final Messenger A02;

    @Override // X.InterfaceC65341TiM
    public final void CgT(int i) {
        Messenger messenger = this.A02;
        Message obtain = Message.obtain();
        obtain.what = 3;
        obtain.arg1 = i;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("tag", this.A01);
        A0b.putParcelable("component", this.A00);
        obtain.setData(A0b);
        messenger.send(obtain);
    }

    public C63982Sx8(ComponentName componentName, Messenger messenger, String str) {
        this.A02 = messenger;
        this.A01 = str;
        this.A00 = componentName;
    }
}
