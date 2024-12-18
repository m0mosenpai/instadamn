package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.integrity.s;
import com.google.android.play.integrity.internal.f;
import com.google.android.play.integrity.internal.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TRj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractRunnableC64727TRj implements Runnable {
    public final C58411Pup A00;

    public AbstractRunnableC64727TRj() {
        this.A00 = null;
    }

    public AbstractRunnableC64727TRj(C58411Pup c58411Pup) {
        this.A00 = c58411Pup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        IInterface queryLocalInterface;
        try {
            if (this instanceof RPG) {
                RPG rpg = (RPG) this;
                C63186Sel c63186Sel = rpg.A01.A00;
                IBinder iBinder = rpg.A00;
                if (iBinder == null) {
                    queryLocalInterface = null;
                } else {
                    queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (!(queryLocalInterface instanceof h)) {
                        queryLocalInterface = new f(iBinder);
                    }
                }
                c63186Sel.A01 = queryLocalInterface;
                C62928SXk c62928SXk = c63186Sel.A06;
                c62928SXk.A01("linkToDeath", new Object[0]);
                try {
                    c63186Sel.A01.asBinder().linkToDeath(c63186Sel.A05, 0);
                } catch (RemoteException e) {
                    if (android.util.Log.isLoggable("PlayCore", 6)) {
                        android.util.Log.e("PlayCore", AnonymousClass001.A0g(c62928SXk.A00, " : ", "linkToDeath failed"), e);
                    }
                }
                c63186Sel.A02 = false;
                list = c63186Sel.A09;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC58319PtB.A1N(it);
                }
                list.clear();
                return;
            }
            if (this instanceof RPF) {
                RPF rpf = (RPF) this;
                C63186Sel c63186Sel2 = rpf.A01;
                AbstractRunnableC64727TRj abstractRunnableC64727TRj = rpf.A00;
                if (c63186Sel2.A01 == null && !c63186Sel2.A02) {
                    C62928SXk c62928SXk2 = c63186Sel2.A06;
                    c62928SXk2.A01("Initiate binding to the service.", new Object[0]);
                    list = c63186Sel2.A09;
                    list.add(abstractRunnableC64727TRj);
                    ServiceConnectionC63435SkE serviceConnectionC63435SkE = new ServiceConnectionC63435SkE(c63186Sel2);
                    c63186Sel2.A00 = serviceConnectionC63435SkE;
                    c63186Sel2.A02 = true;
                    if (!c63186Sel2.A03.bindService(c63186Sel2.A04, serviceConnectionC63435SkE, 1)) {
                        c62928SXk2.A01("Failed to bind to the service.", new Object[0]);
                        c63186Sel2.A02 = false;
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((AbstractRunnableC64727TRj) it2.next()).A00(new C64855TXg());
                        }
                        list.clear();
                        return;
                    }
                    return;
                }
                if (c63186Sel2.A02) {
                    c63186Sel2.A06.A01("Waiting to bind to the service.", new Object[0]);
                    c63186Sel2.A09.add(abstractRunnableC64727TRj);
                    return;
                } else {
                    abstractRunnableC64727TRj.run();
                    return;
                }
            }
            if (this instanceof RPH) {
                RPH rph = (RPH) this;
                try {
                    SGY sgy = rph.A02;
                    IInterface iInterface = sgy.A01.A01;
                    byte[] bArr = rph.A03;
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putString("package.name", sgy.A02);
                    A0b.putByteArray("nonce", bArr);
                    A0b.putInt("playcore.integrity.version.major", 1);
                    A0b.putInt("playcore.integrity.version.minor", 1);
                    A0b.putInt("playcore.integrity.version.patch", 0);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    A1E.add(new RPC(System.currentTimeMillis()));
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    Iterator it3 = A1E.iterator();
                    while (it3.hasNext()) {
                        AbstractC61518Rot abstractC61518Rot = (AbstractC61518Rot) it3.next();
                        Bundle A0b2 = AbstractC166987dD.A0b();
                        A0b2.putInt("event_type", 3);
                        A0b2.putLong("event_timestamp", ((RPC) abstractC61518Rot).A00);
                        A1E2.add(A0b2);
                    }
                    A0b.putParcelableArrayList("event_timestamps", AbstractC166987dD.A1F(A1E2));
                    s sVar = new s(rph.A00, sgy);
                    f fVar = (f) iInterface;
                    int A03 = C0f9.A03(-1142241991);
                    int A032 = C0f9.A03(495236924);
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    C0f9.A0A(-1299367711, A032);
                    AbstractC58323PtF.A18(A0b, sVar, obtain);
                    int A033 = C0f9.A03(581613889);
                    try {
                        fVar.A00.transact(2, obtain, null, 1);
                        obtain.recycle();
                        C0f9.A0A(-2122573271, A033);
                        C0f9.A0A(-1909476450, A03);
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        C0f9.A0A(-1965590401, A033);
                        throw th;
                    }
                } catch (RemoteException e2) {
                    C62928SXk c62928SXk3 = rph.A02.A00;
                    Object[] objArr = {rph.A01};
                    if (android.util.Log.isLoggable("PlayCore", 6)) {
                        android.util.Log.e("PlayCore", C62928SXk.A00(c62928SXk3.A00, "requestIntegrityToken(%s)", objArr), e2);
                    }
                    rph.A00.A02(new N21(-100, e2));
                    return;
                }
            }
            if (this instanceof RPD) {
                C63186Sel c63186Sel3 = ((RPD) this).A00;
                if (c63186Sel3.A01 != null) {
                    c63186Sel3.A06.A01("Unbind from service.", new Object[0]);
                    c63186Sel3.A03.unbindService(c63186Sel3.A00);
                    c63186Sel3.A02 = false;
                    c63186Sel3.A01 = null;
                    c63186Sel3.A00 = null;
                }
                C63186Sel.A00(c63186Sel3);
                return;
            }
            C63186Sel c63186Sel4 = ((RPE) this).A00.A00;
            c63186Sel4.A06.A01("unlinkToDeath", new Object[0]);
            c63186Sel4.A01.asBinder().unlinkToDeath(c63186Sel4.A05, 0);
            c63186Sel4.A01 = null;
            c63186Sel4.A02 = false;
        } catch (Exception e3) {
            A00(e3);
        }
    }

    public void A00(Exception exc) {
        C58411Pup c58411Pup = this.A00;
        if (c58411Pup != null) {
            c58411Pup.A02(exc);
        }
    }
}
