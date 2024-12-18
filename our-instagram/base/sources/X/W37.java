package X;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
public final class W37 {
    public WIM A00;
    public File A01;
    public InterfaceC16620sF A02;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;
    public final Map A04 = new LinkedHashMap();
    public final AtomicInteger A05 = new AtomicInteger(0);
    public volatile EnumC185018Iq A09 = EnumC185018Iq.A08;
    public final C70458WWv A03 = new C70458WWv(this);
    public final InterfaceC16590sC A08 = new C30753Dfq(this, 2);

    public W37(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        this.A06 = interfaceC16820sZ;
        this.A02 = interfaceC16620sF;
        this.A07 = interfaceC16660sJ;
    }

    public static final void A00(InterfaceC16820sZ interfaceC16820sZ) {
        C14120nc.A00().ATO(new V66(interfaceC16820sZ));
    }
}
