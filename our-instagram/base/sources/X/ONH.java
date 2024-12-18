package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class ONH {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r8.A05 != null) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.MYB A00(X.InterfaceC58019Po5 r35, X.InterfaceC58019Po5 r36, com.facebook.videolite.transcoder.base.composition.MediaComposition r37, boolean r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ONH.A00(X.Po5, X.Po5, com.facebook.videolite.transcoder.base.composition.MediaComposition, boolean, boolean, boolean):X.MYB");
    }

    public static void A01(InterfaceC58019Po5 interfaceC58019Po5, InterfaceC58019Po5 interfaceC58019Po52, EnumC1125356h enumC1125356h, MediaComposition mediaComposition, HashMap hashMap) {
        MYB AUI;
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            hashMap.put(enumC1125356h, A1G);
            Iterator A14 = AbstractC166997dE.A14(A07);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                ArrayList A1E = AbstractC166987dD.A1E();
                A1G.put(A1K.getKey(), A1E);
                Iterator it = AbstractC166987dD.A1F(((C1125956n) A1K.getValue()).A04).iterator();
                while (it.hasNext()) {
                    C1125756l c1125756l = (C1125756l) it.next();
                    File file = c1125756l.A04;
                    java.net.URL url = c1125756l.A05;
                    if (c1125756l.A01(false)) {
                        AbstractC1126356r.A07(AbstractC167007dF.A1W(file), null);
                        interfaceC58019Po5.getClass();
                        AbstractC1126356r.A06(file);
                        AUI = interfaceC58019Po5.AUI(android.net.Uri.fromFile(file));
                    } else {
                        interfaceC58019Po52.getClass();
                        if (file != null) {
                            AUI = interfaceC58019Po52.AUI(android.net.Uri.fromFile(file));
                        } else if (url != null) {
                            AUI = interfaceC58019Po52.AUJ(url);
                        }
                    }
                    A1E.add(AUI);
                }
            }
        }
    }
}
