package X;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.TDs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64434TDs implements InterfaceC65437Tk9 {
    public InterfaceC65668Tqy A00;
    public boolean A01;
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A03;
    public static final InterfaceC65668Tqy A04 = new InterfaceC65668Tqy() { // from class: X.T9v
        @Override // X.InterfaceC65435Tk7
        public final void ARz(Object obj, Object obj2) {
            InterfaceC65669Tqz interfaceC65669Tqz = C64434TDs.A05;
            throw new RuntimeException(AnonymousClass001.A0R("Couldn't find encoder for type ", AbstractC58319PtB.A0u(obj)));
        }
    };
    public static final InterfaceC65669Tqz A06 = new InterfaceC65669Tqz() { // from class: X.TDf
        @Override // X.InterfaceC65435Tk7
        public final void ARz(Object obj, Object obj2) {
            InterfaceC65669Tqz interfaceC65669Tqz = C64434TDs.A05;
            ((InterfaceC65524Tlt) obj2).A7X((String) obj);
        }
    };
    public static final InterfaceC65669Tqz A05 = new InterfaceC65669Tqz() { // from class: X.TDg
        @Override // X.InterfaceC65435Tk7
        public final void ARz(Object obj, Object obj2) {
            InterfaceC65669Tqz interfaceC65669Tqz = C64434TDs.A05;
            ((InterfaceC65524Tlt) obj2).A7Y(((Boolean) obj).booleanValue());
        }
    };
    public static final C64423TDh A07 = new Object();

    @Override // X.InterfaceC65437Tk9
    public final /* bridge */ /* synthetic */ InterfaceC65437Tk9 EDF(InterfaceC65668Tqy interfaceC65668Tqy, Class cls) {
        this.A02.put(cls, interfaceC65668Tqy);
        this.A03.remove(cls);
        return this;
    }

    public C64434TDs() {
        HashMap A1G = AbstractC166987dD.A1G();
        this.A03 = A1G;
        this.A00 = A04;
        this.A01 = false;
        A1G.put(String.class, A06);
        this.A02.remove(String.class);
        this.A03.put(Boolean.class, A05);
        this.A02.remove(Boolean.class);
        this.A03.put(Date.class, A07);
        this.A02.remove(Date.class);
    }
}
