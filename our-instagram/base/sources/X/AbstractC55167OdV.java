package X;

import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OdV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55167OdV {
    public C108284uF A00;
    public final double A01;
    public final String A02;
    public final List A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.O7w, X.NMF] */
    public static NMF A01(String str, int i) {
        return new AbstractC54544O7w(str, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.NMI, X.52C] */
    public static NMI A02(NML nml, long j) {
        String str = ((AbstractC55167OdV) nml).A02;
        double d = ((AbstractC55167OdV) nml).A01;
        ArrayList A03 = A03(nml);
        C14360o3.A0B(A03, 3);
        ?? c52c = new C52C(str, A03, d, j);
        nml.A05(c52c);
        nml.A00 = c52c;
        return c52c;
    }

    public final void A05(C52C c52c) {
        C108284uF c108284uF = this.A00;
        if (c108284uF != null) {
            c52c.A00 = c108284uF;
        } else {
            C14360o3.A0F("exampleDelegate");
            throw C00O.createAndThrow();
        }
    }

    public /* synthetic */ AbstractC55167OdV(String str, double d) {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = str;
        this.A01 = d;
        this.A03 = A1E;
    }

    public static final ArrayList A03(AbstractC55167OdV abstractC55167OdV) {
        String str;
        int i;
        double d;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (AbstractC54544O7w abstractC54544O7w : abstractC55167OdV.A03) {
            if (abstractC54544O7w instanceof NMF) {
                NMF nmf = (NMF) abstractC54544O7w;
                str = nmf.A01;
                i = ((AbstractC54544O7w) nmf).A00;
                d = nmf.A00;
            } else if (abstractC54544O7w instanceof NMD) {
                NMD nmd = (NMD) abstractC54544O7w;
                str = nmd.A01;
                i = ((AbstractC54544O7w) nmd).A00;
                d = nmd.A00;
            } else {
                NME nme = (NME) abstractC54544O7w;
                str = nme.A01;
                i = ((AbstractC54544O7w) nme).A00;
                d = nme.A00;
            }
            A1E.add(new IgSignalsFeature(i, str, d));
        }
        return A1E;
    }

    public static void A04(Object obj, Object obj2, Object obj3, Object obj4, List list) {
        list.add(obj);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
    }
}
