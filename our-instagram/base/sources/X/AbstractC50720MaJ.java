package X;

import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MaJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50720MaJ {
    public static boolean A02(InterfaceC58019Po5 interfaceC58019Po5, EnumC1125356h enumC1125356h, MediaComposition mediaComposition, InterfaceC58105PpU interfaceC58105PpU) {
        if (interfaceC58105PpU != null) {
            try {
                HashMap A07 = mediaComposition.A07(enumC1125356h);
                A07.getClass();
                ArrayList A0n = AbstractC31180DnO.A0n(A07);
                Collections.sort(A0n, new C50583MUt(1));
                Iterator it = A0n.iterator();
                long j = -1;
                while (it.hasNext()) {
                    C1125956n c1125956n = (C1125956n) it.next();
                    if (j != -1 && j != c1125956n.A00) {
                        return false;
                    }
                    j = c1125956n.A00 + AbstractC66047Tyk.A01(interfaceC58019Po5, c1125956n);
                }
                HashMap A072 = mediaComposition.A07(enumC1125356h);
                if (A072 != null) {
                    HashMap A073 = mediaComposition.A07(enumC1125356h);
                    if (A073 != null) {
                        Iterator A0k = AbstractC167007dF.A0k(A073);
                        while (A0k.hasNext()) {
                            Iterator it2 = AbstractC166987dD.A1F(((C1125956n) A0k.next()).A04).iterator();
                            while (it2.hasNext()) {
                                if (((C1125756l) it2.next()).A03.A03(TimeUnit.MICROSECONDS) > 0) {
                                    return false;
                                }
                            }
                        }
                    }
                    InterfaceC57910PmG interfaceC57910PmG = null;
                    Iterator A0k2 = AbstractC167007dF.A0k(A072);
                    boolean z = true;
                    while (A0k2.hasNext()) {
                        Iterator it3 = AbstractC166987dD.A1F(((C1125956n) A0k2.next()).A04).iterator();
                        while (it3.hasNext()) {
                            File file = ((C1125756l) it3.next()).A04;
                            if (file != null) {
                                String canonicalPath = file.getCanonicalPath();
                                if (z) {
                                    interfaceC57910PmG = A01(enumC1125356h, interfaceC58105PpU, canonicalPath);
                                    z = false;
                                } else {
                                    InterfaceC57910PmG A01 = A01(enumC1125356h, interfaceC58105PpU, canonicalPath);
                                    if (interfaceC57910PmG == null || !interfaceC57910PmG.CTw(A01)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.PpU, java.lang.Object] */
    public static int A00(String str) {
        try {
            C50719MaI A00 = C50719MaI.A00(new Object(), str);
            if (A00 != null) {
                return A00.A02;
            }
            return 3;
        } catch (Exception e) {
            C0K8.A0F("MediaFormatUtil", "Exception while extracting video media format metadata:", e);
            return 3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Opq, java.lang.Object, X.PmG] */
    public static InterfaceC57910PmG A01(EnumC1125356h enumC1125356h, InterfaceC58105PpU interfaceC58105PpU, String str) {
        String string;
        if (enumC1125356h == EnumC1125356h.AUDIO) {
            InterfaceC58194Pr0 ALI = interfaceC58105PpU.ALI();
            try {
                ALI.ESw(str);
                C50671MYp A01 = AbstractC50670MYo.A01(ALI, false);
                if (A01 != null) {
                    MediaFormat mediaFormat = A01.A01;
                    ?? obj = new Object();
                    if (mediaFormat.containsKey("channel-count")) {
                        obj.A00 = mediaFormat.getInteger("channel-count");
                        if (mediaFormat.containsKey("sample-rate")) {
                            obj.A01 = mediaFormat.getInteger("sample-rate");
                            if (mediaFormat.containsKey("mime") && (string = mediaFormat.getString("mime")) != null) {
                                obj.A02 = string;
                                return obj;
                            }
                        }
                    }
                }
                return null;
            } catch (C52036N0k | IOException unused) {
                return null;
            } finally {
                ALI.release();
            }
        }
        if (enumC1125356h == EnumC1125356h.VIDEO) {
            return C50719MaI.A00(interfaceC58105PpU, str);
        }
        return null;
    }
}
