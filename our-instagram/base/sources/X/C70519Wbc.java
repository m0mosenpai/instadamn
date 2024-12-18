package X;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Wbc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70519Wbc implements C4XR {
    public int A00;
    public Handler A01;
    public Looper A02;
    public C70517Wba A03;
    public InterfaceC72005XEt A04;
    public C4WZ A05;
    public final long A06;
    public final WbX A07;
    public final List A08;
    public final java.util.Set A09;
    public final java.util.Set A0A;
    public final UUID A0B;
    public final int[] A0C;
    public final WbY A0D;
    public final InterfaceC71904X9o A0E;
    public final InterfaceC65243TgZ A0F;
    public final C4XO A0G;
    public final String A0H;
    public final HashMap A0I;
    public volatile U9B A0J;

    @Override // X.C4XR
    public final C5T9 A7O(C4B6 c4b6, C4XY c4xy) {
        A04(false);
        C4B8.A04(this.A00 > 0);
        Looper looper = this.A02;
        C4B8.A01(looper);
        return A01(looper, c4b6, this, c4xy, true);
    }

    @Override // X.C4XR
    public final int AtU(C4B6 c4b6) {
        A04(false);
        InterfaceC72005XEt interfaceC72005XEt = this.A04;
        interfaceC72005XEt.getClass();
        int AtT = interfaceC72005XEt.AtT();
        DrmInitData drmInitData = c4b6.A0O;
        if (drmInitData == null) {
            C2IH.A00(c4b6.A0W);
            return 0;
        }
        UUID uuid = this.A0B;
        if (A02(drmInitData, uuid, true).isEmpty()) {
            if (drmInitData.A01 == 1 && drmInitData.A03[0].A00(C4YL.A01)) {
                AbstractC46512Bo.A04("DefaultDrmSessionMgr", AbstractC167017dG.A0n(uuid, "DrmInitData only contains common PSSH SchemeData. Assuming support for: ", new StringBuilder()));
            }
            return 1;
        }
        String str = drmInitData.A02;
        if (str != null && !"cenc".equals(str) && !"cbcs".equals(str)) {
            if ("cbc1".equals(str) || "cens".equals(str)) {
                return 1;
            }
            return AtT;
        }
        return AtT;
    }

    @Override // X.C4XR
    public final void E5P() {
        A04(true);
        int i = this.A00;
        this.A00 = i + 1;
        if (i == 0) {
            if (this.A04 == null) {
                InterfaceC72005XEt A7M = this.A0E.A7M(this.A0B);
                this.A04 = A7M;
                A7M.EZp(new C70520Wbd(this));
                if (!C2C5.A02(C2C1.A1M)) {
                    String str = this.A0H;
                    if (!str.isEmpty()) {
                        try {
                            this.A04.Ebr("securityLevel", str);
                            return;
                        } catch (Exception unused) {
                            AbstractC46512Bo.A03("DefaultDrmSessionMgr", "Failed to set securityLevel property for defaultDrmSessionManager");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (this.A06 != -9223372036854775807L) {
                int i2 = 0;
                while (true) {
                    List list = this.A08;
                    if (i2 < list.size()) {
                        ((C70517Wba) list.get(i2)).A7J(null);
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.C4XR
    public final void Eb4(Looper looper, C4WZ c4wz) {
        synchronized (this) {
            Looper looper2 = this.A02;
            if (looper2 == null) {
                this.A02 = looper;
                this.A01 = new Handler(looper);
            } else {
                C4B8.A04(AbstractC167007dF.A1X(looper2, looper));
                this.A01.getClass();
            }
        }
        this.A05 = c4wz;
    }

    @Override // X.C4XR
    public final void release() {
        A04(true);
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            if (this.A06 != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.A08);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((C70517Wba) arrayList.get(i2)).EE2(null);
                }
            }
            C1LC it = ImmutableSet.A03(this.A0A).iterator();
            while (it.hasNext()) {
                ((C70518Wbb) it.next()).release();
            }
            A03(this);
        }
    }

    private C70517Wba A00(C4XY c4xy, List list) {
        this.A04.getClass();
        UUID uuid = this.A0B;
        InterfaceC72005XEt interfaceC72005XEt = this.A04;
        WbX wbX = this.A07;
        WbY wbY = this.A0D;
        HashMap hashMap = this.A0I;
        InterfaceC65243TgZ interfaceC65243TgZ = this.A0F;
        Looper looper = this.A02;
        looper.getClass();
        C4XO c4xo = this.A0G;
        C4WZ c4wz = this.A05;
        c4wz.getClass();
        C70517Wba c70517Wba = new C70517Wba(looper, c4wz, wbX, wbY, interfaceC72005XEt, interfaceC65243TgZ, c4xo, hashMap, list, uuid);
        c70517Wba.A7J(c4xy);
        if (this.A06 != -9223372036854775807L) {
            c70517Wba.A7J(null);
        }
        return c70517Wba;
    }

    public static C5T9 A01(Looper looper, C4B6 c4b6, C70519Wbc c70519Wbc, C4XY c4xy, boolean z) {
        if (c70519Wbc.A0J == null) {
            c70519Wbc.A0J = new U9B(looper, c70519Wbc);
        }
        DrmInitData drmInitData = c4b6.A0O;
        if (drmInitData == null) {
            C2IH.A00(c4b6.A0W);
            c70519Wbc.A04.getClass();
            return null;
        }
        UUID uuid = c70519Wbc.A0B;
        ArrayList A02 = A02(drmInitData, uuid, false);
        if (A02.isEmpty()) {
            Exception exc = new Exception(AbstractC167017dG.A0n(uuid, "Media does not support uuid: ", new StringBuilder()));
            AbstractC46512Bo.A05("DefaultDrmSessionMgr", "DRM error", exc);
            if (c4xy != null) {
                c4xy.A04(exc);
            }
            return new WbZ(new C5PN(6003, exc));
        }
        C70517Wba c70517Wba = c70519Wbc.A03;
        if (c70517Wba == null) {
            C70517Wba A00 = c70519Wbc.A00(c4xy, A02);
            C70517Wba.A00(A00);
            if (A00.A00 == 1) {
                C5PN B2Y = A00.B2Y();
                B2Y.getClass();
                if (B2Y.getCause() instanceof ResourceBusyException) {
                    java.util.Set set = c70519Wbc.A09;
                    if (!set.isEmpty()) {
                        C1LC it = ImmutableSet.A03(set).iterator();
                        while (it.hasNext()) {
                            ((C5T9) it.next()).EE2(null);
                        }
                        A00.EE2(c4xy);
                        if (c70519Wbc.A06 != -9223372036854775807L) {
                            A00.EE2(null);
                        }
                        A00 = c70519Wbc.A00(c4xy, A02);
                    }
                }
            }
            C70517Wba.A00(A00);
            if (A00.A00 == 1) {
                C5PN B2Y2 = A00.B2Y();
                B2Y2.getClass();
                if ((B2Y2.getCause() instanceof ResourceBusyException) && z) {
                    java.util.Set set2 = c70519Wbc.A0A;
                    if (!set2.isEmpty()) {
                        C1LC it2 = ImmutableSet.A03(set2).iterator();
                        while (it2.hasNext()) {
                            ((C70518Wbb) it2.next()).release();
                        }
                        java.util.Set set3 = c70519Wbc.A09;
                        if (!set3.isEmpty()) {
                            C1LC it3 = ImmutableSet.A03(set3).iterator();
                            while (it3.hasNext()) {
                                ((C5T9) it3.next()).EE2(null);
                            }
                        }
                        A00.EE2(c4xy);
                        if (c70519Wbc.A06 != -9223372036854775807L) {
                            A00.EE2(null);
                        }
                        A00 = c70519Wbc.A00(c4xy, A02);
                    }
                }
            }
            c70519Wbc.A03 = A00;
            c70519Wbc.A08.add(A00);
            return A00;
        }
        c70517Wba.A7J(c4xy);
        return c70517Wba;
    }

    public static ArrayList A02(DrmInitData drmInitData, UUID uuid, boolean z) {
        int i = drmInitData.A01;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            DrmInitData.SchemeData schemeData = drmInitData.A03[i2];
            if ((schemeData.A00(uuid) || (C4YL.A00.equals(uuid) && schemeData.A00(C4YL.A01))) && (schemeData.A04 != null || z)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    public static void A03(C70519Wbc c70519Wbc) {
        if (c70519Wbc.A04 != null && c70519Wbc.A00 == 0 && c70519Wbc.A08.isEmpty() && c70519Wbc.A0A.isEmpty()) {
            InterfaceC72005XEt interfaceC72005XEt = c70519Wbc.A04;
            interfaceC72005XEt.getClass();
            interfaceC72005XEt.release();
            c70519Wbc.A04 = null;
        }
    }

    private void A04(boolean z) {
        if (z && this.A02 == null) {
            AbstractC46512Bo.A06("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.A02;
        looper.getClass();
        if (currentThread == looper.getThread()) {
            return;
        }
        AbstractC46512Bo.A06("DefaultDrmSessionMgr", AnonymousClass001.A0u("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ", currentThread.getName(), "\nExpected thread: ", this.A02.getThread().getName()), new IllegalStateException());
    }

    @Override // X.C4XR
    public final InterfaceC98614bg E55(final C4B6 c4b6, C4XY c4xy) {
        C4B8.A04(AbstractC167007dF.A1O(this.A00));
        C4B8.A01(this.A02);
        final C70518Wbb c70518Wbb = new C70518Wbb(this, c4xy);
        Handler handler = c70518Wbb.A03.A01;
        handler.getClass();
        handler.post(new Runnable() { // from class: X.WuN
            @Override // java.lang.Runnable
            public final void run() {
                C70518Wbb c70518Wbb2 = c70518Wbb;
                C4B6 c4b62 = c4b6;
                C70519Wbc c70519Wbc = c70518Wbb2.A03;
                if (c70519Wbc.A00 != 0 && !c70518Wbb2.A01) {
                    Looper looper = c70519Wbc.A02;
                    looper.getClass();
                    c70518Wbb2.A00 = C70519Wbc.A01(looper, c4b62, c70519Wbc, c70518Wbb2.A02, false);
                    c70519Wbc.A0A.add(c70518Wbb2);
                }
            }
        });
        return c70518Wbb;
    }

    public C70519Wbc(InterfaceC71904X9o interfaceC71904X9o, InterfaceC65243TgZ interfaceC65243TgZ, C4XO c4xo, String str, HashMap hashMap, UUID uuid, int[] iArr) {
        uuid.getClass();
        C4B8.A05(!C4YL.A01.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.A0B = uuid;
        this.A0E = interfaceC71904X9o;
        this.A0F = interfaceC65243TgZ;
        this.A0I = hashMap;
        this.A0C = iArr;
        this.A0G = c4xo;
        this.A0H = str;
        this.A07 = new WbX(this);
        this.A0D = new WbY(this);
        this.A08 = new ArrayList();
        this.A0A = Collections.newSetFromMap(new IdentityHashMap());
        this.A09 = Collections.newSetFromMap(new IdentityHashMap());
        this.A06 = 300000L;
    }
}
