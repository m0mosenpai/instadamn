package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.LEl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47917LEl {
    public final AbstractC69586Vrp A00;
    public final Map A01;
    public final Map A02;
    public final java.util.Set A03;
    public static final byte[] A05 = new byte[0];
    public static final Object A04 = new Object();

    public AbstractC47917LEl(AbstractC69586Vrp abstractC69586Vrp) {
        this.A00 = abstractC69586Vrp;
        abstractC69586Vrp.A00(new LVT());
        this.A01 = new ConcurrentHashMap();
        this.A02 = new ConcurrentHashMap();
        this.A03 = AbstractC166987dD.A1H();
    }
}
