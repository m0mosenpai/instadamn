package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.T5a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64225T5a implements InterfaceC65587TnR, C69D {
    public int A00;
    public final Context A02;
    public final GoogleApiAvailabilityLight A03;
    public final C61U A04;
    public final C60650RGb A05;
    public final HandlerC60674RLd A06;
    public final TmP A07;
    public final C1340363l A08;
    public final Map A09;
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile InterfaceC65586TnQ A0E;
    public final Map A0A = AbstractC166987dD.A1G();
    public ConnectionResult A01 = null;

    @Override // X.InterfaceC65587TnR
    public final void FFF() {
    }

    @Override // X.InterfaceC65587TnR
    public final boolean FFG() {
        return this.A0E instanceof T5U;
    }

    @Override // X.InterfaceC65587TnR
    public final boolean FFH(InterfaceC65249Tgf interfaceC65249Tgf) {
        return false;
    }

    public final void A00(ConnectionResult connectionResult) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = connectionResult;
            this.A0E = new T5V(this);
            this.A0E.FF2();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C69F
    public final void D75(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.FF8(bundle);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C69F
    public final void D7H(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.FFA(i);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.C69D
    public final void FEx(ConnectionResult connectionResult, C61W c61w, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.FF9(connectionResult, c61w, z);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.InterfaceC65587TnR
    public final void FFC() {
        this.A0E.FF5();
    }

    @Override // X.InterfaceC65587TnR
    public final void FFD() {
        this.A0E.FFB();
        this.A0A.clear();
    }

    public C64225T5a(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, C61U c61u, C60650RGb c60650RGb, TmP tmP, C1340363l c1340363l, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = googleApiAvailabilityLight;
        this.A09 = map;
        this.A08 = c1340363l;
        this.A0B = map2;
        this.A04 = c61u;
        this.A05 = c60650RGb;
        this.A07 = tmP;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((T50) arrayList.get(i)).A00 = this;
        }
        this.A06 = new HandlerC60674RLd(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new T5V(this);
    }

    @Override // X.InterfaceC65587TnR
    public final AbstractC60658RGk FF4(AbstractC60658RGk abstractC60658RGk) {
        abstractC60658RGk.A05();
        this.A0E.FEv(abstractC60658RGk);
        return abstractC60658RGk;
    }

    @Override // X.InterfaceC65587TnR
    public final AbstractC60658RGk FF7(AbstractC60658RGk abstractC60658RGk) {
        abstractC60658RGk.A05();
        return this.A0E.FEy(abstractC60658RGk);
    }

    @Override // X.InterfaceC65587TnR
    public final void FFE(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mState=").println(this.A0E);
        Iterator A12 = AbstractC43593JPy.A12(this.A0B);
        while (A12.hasNext()) {
            String valueOf = String.valueOf(str);
            C61W c61w = (C61W) A12.next();
            printWriter.append((CharSequence) str).append((CharSequence) c61w.A02).println(":");
            Object obj = this.A09.get(c61w.A01);
            C3U5.A02(obj);
            ((InterfaceC1340663q) obj).dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }
}
