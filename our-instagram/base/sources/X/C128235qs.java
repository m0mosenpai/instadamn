package X;

import android.os.Process;

/* renamed from: X.5qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128235qs extends C25591Mp {
    public final int A00;

    @Override // X.C25591Mp, X.InterfaceC25601Mq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final InterfaceC55612h1 then(C3JY c3jy) {
        C14360o3.A0B(c3jy, 0);
        int i = this.A00;
        boolean z = false;
        if (i > -20) {
            z = true;
        }
        int threadPriority = Process.getThreadPriority(Process.myTid());
        if (z) {
            Process.setThreadPriority(i);
        }
        InterfaceC55612h1 interfaceC55612h1 = (InterfaceC55612h1) super.then(c3jy);
        C23781El A01 = c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE");
        if (A01 != null) {
            String str = A01.A01;
            C14360o3.A06(str);
            interfaceC55612h1.EQi(Long.parseLong(str));
        }
        Process.setThreadPriority(threadPriority);
        return interfaceC55612h1;
    }

    public C128235qs(C222015v c222015v, C1EY c1ey, int i) {
        super(c222015v, c1ey, C23741Eg.class, true);
        this.A00 = i;
    }
}
