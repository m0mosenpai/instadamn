package X;

import com.facebook.odin.model.OdinContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73693Rv implements InterfaceC73623Ro {
    public ArrayList A00;
    public final InterfaceC73623Ro A01;
    public final ReentrantLock A02;

    public C73693Rv(InterfaceC73623Ro interfaceC73623Ro) {
        C14360o3.A0B(interfaceC73623Ro, 2);
        this.A01 = interfaceC73623Ro;
        this.A02 = new ReentrantLock();
        this.A00 = new ArrayList();
    }

    public final void A00(OdinContext odinContext) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            C3SN ATr = this.A01.ATr(odinContext);
            if (ATr.A02) {
                arrayList.addAll((Collection) ATr.A00);
            }
            this.A00 = arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            if (this.A00.isEmpty()) {
                A00(odinContext);
            }
            return new C3SN(this.A00, null, true);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "CachedAll";
    }
}
