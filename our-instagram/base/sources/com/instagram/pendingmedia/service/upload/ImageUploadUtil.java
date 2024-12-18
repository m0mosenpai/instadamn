package com.instagram.pendingmedia.service.upload;

import X.AbstractC06930Yk;
import X.AbstractC13530mf;
import X.AbstractC13670mt;
import X.AbstractC15820qc;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC25233BEq;
import X.AbstractC43594JPz;
import X.AbstractC50522MSa;
import X.AbstractC53512Nle;
import X.AbstractC54088Nvm;
import X.AbstractC54438O3s;
import X.AnonymousClass001;
import X.B4Z;
import X.C06090Tz;
import X.C115435Kd;
import X.C120005by;
import X.C14360o3;
import X.C18U;
import X.C23231Bc;
import X.C47Z;
import X.C50702MZx;
import X.C50703MZy;
import X.C50704MZz;
import X.C55230Of1;
import X.C55654Onf;
import X.C70353Dt;
import X.EnumC115415Kb;
import X.EnumC40111tc;
import X.EnumC915447k;
import X.InterfaceC02590Ai;
import X.InterfaceC70363Du;
import X.MSZ;
import X.NRJ;
import X.NRL;
import X.NRM;
import X.NRT;
import X.NRU;
import X.NRV;
import X.O8O;
import X.OI2;
import X.OVd;
import X.OXD;
import X.OY5;
import X.W63;
import X.WVG;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ImageUploadUtil {
    public static final ImageUploadUtil A00 = new Object();

    public static final AbstractC54438O3s A00(OXD oxd) {
        O8O A02;
        C115435Kd A01;
        ImageUploadUtil imageUploadUtil = A00;
        A05(oxd, 1109);
        C47Z c47z = oxd.A0C;
        oxd.A06 = new NRM(c47z);
        String str = c47z.A33;
        UserSession userSession = oxd.A0B;
        WVG A002 = OVd.A00(userSession);
        LinkedHashMap A0G = C55230Of1.A0G(userSession, c47z, c47z.A3t);
        long uptimeMillis = SystemClock.uptimeMillis();
        imageUploadUtil.A04(oxd);
        EnumC40111tc enumC40111tc = c47z.A1G;
        EnumC40111tc enumC40111tc2 = EnumC40111tc.A06;
        if (enumC40111tc != enumC40111tc2) {
            enumC40111tc2 = EnumC40111tc.A0Q;
        }
        C55654Onf c55654Onf = oxd.A06;
        int i = c47z.A09;
        String str2 = c47z.A3t;
        if (A06(userSession, c47z)) {
            A02 = new O8O(OY5.A01(userSession, enumC40111tc2, c47z, c47z.A2s), enumC40111tc2);
        } else {
            A02 = OY5.A02(enumC40111tc2, c47z.A0E(), A0G);
        }
        AbstractC53512Nle A022 = FbUploaderUtil.A02(A002, c55654Onf, A02, str, str2, i);
        if (A022 instanceof NRT) {
            String str3 = ((NRT) A022).A00;
            A01 = FbUploaderUtil.A00(oxd, str3);
            imageUploadUtil.A07(A01.A01, oxd, AnonymousClass001.A0R("fbupload:Photo upload error:", str3), new FileNotFoundException(str3));
        } else if (A022 instanceof NRU) {
            Throwable th = ((NRU) A022).A00;
            A05(oxd, 1111);
            A01 = FbUploaderUtil.A01(oxd, "image", th);
            imageUploadUtil.A07(A01.A01, oxd, AbstractC166997dE.A0y("fbupload:Photo upload error:", th), th);
        } else {
            if (A022 instanceof NRV) {
                return imageUploadUtil.A01(((NRV) A022).A00, oxd, uptimeMillis);
            }
            throw B4Z.A00();
        }
        return new NRJ(A01);
    }

    private final NRL A01(W63 w63, OXD oxd, long j) {
        Map A0E;
        Map A07;
        String str;
        double d;
        C47Z c47z = oxd.A0C;
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap hashMap = w63.A09;
        if (hashMap != null) {
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                AbstractC43594JPz.A1S(A1G, AbstractC166987dD.A1K(A14));
            }
        }
        c47z.A46 = A1G;
        UserSession userSession = oxd.A0B;
        if (A06(userSession, c47z)) {
            c47z.A2I = AbstractC25228BEl.A13(w63.A05);
        }
        c47z.A0Z(EnumC915447k.A09);
        A05(oxd, 1110);
        if (C18U.A06(C06090Tz.A05, userSession, 36311856838738725L) && (str = c47z.A33) != null) {
            float A03 = (((float) AbstractC13530mf.A03(str)) * 8.0f) / (((float) (SystemClock.uptimeMillis() - j)) / 1000.0f);
            double A01 = C23231Bc.A00().A01();
            if (A01 > 0.0d) {
                d = A01 * 8.0d * 1024.0d;
            } else {
                d = -1.0d;
            }
            A0E = AbstractC25233BEq.A0p("actual_upload_bits_per_second", AbstractC13670mt.A06("%.0f", Float.valueOf(A03)), AbstractC166987dD.A1L("estimated_upload_bits_per_second", AbstractC13670mt.A06("%.0f", Double.valueOf(d))));
        } else {
            A0E = AbstractC06930Yk.A0E();
        }
        OI2 oi2 = oxd.A0E;
        EnumC40111tc enumC40111tc = c47z.A1G;
        EnumC40111tc enumC40111tc2 = EnumC40111tc.A0Q;
        InterfaceC70363Du interfaceC70363Du = oi2.A01;
        if (enumC40111tc == enumC40111tc2) {
            ((C70353Dt) interfaceC70363Du).A08(oi2.A00, A0E, -1L);
        } else {
            C47Z c47z2 = oi2.A00;
            C70353Dt c70353Dt = (C70353Dt) interfaceC70363Du;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c70353Dt.A01, "ig_video_cover_photo_upload_success");
            if (A0f.isSampled()) {
                Context context = c70353Dt.A00;
                UserSession userSession2 = c70353Dt.A02;
                C50703MZy c50703MZy = new C50703MZy(context, userSession2, c47z2);
                C47Z c47z3 = c50703MZy.A02;
                MSZ.A1G(A0f, c47z3);
                C50704MZz.A02(A0f, userSession2, c47z2, c50703MZy);
                C50704MZz.A06(A0f, c50703MZy);
                C50704MZz.A05(A0f, c50703MZy, "target_surface", C50702MZx.A03(userSession2, c47z2, null, true));
                A0f.A9K("file_size_bytes", c50703MZy.A0A());
                C50704MZz.A04(A0f, c50703MZy, c50703MZy.A0A(), "file_size_bytes");
                A0f.A9K("original_file_size_bytes", Long.valueOf(AbstractC13530mf.A03(c47z3.A3K)));
                A03(A0f, c47z3);
                A0f.AAP("ingest_type", c50703MZy.A0I());
                if (c47z2.A5D) {
                    A07 = null;
                } else {
                    A07 = c50703MZy.A07();
                }
                AbstractC50522MSa.A1F(A0f, A07);
                A0f.Cht();
            }
            c70353Dt.Cl0(c47z2, "ig_video_cover_photo_upload_success", null);
        }
        return NRL.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.OXD r22, com.instagram.pendingmedia.service.upload.ImageUploadUtil r23, X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.ImageUploadUtil.A02(X.OXD, com.instagram.pendingmedia.service.upload.ImageUploadUtil, X.1Ds):java.lang.Object");
    }

    public static void A03(InterfaceC02590Ai interfaceC02590Ai, C47Z c47z) {
        interfaceC02590Ai.A9K("original_media_height", Long.valueOf(c47z.A0G));
        interfaceC02590Ai.A9K("original_media_width", Long.valueOf(c47z.A0H));
    }

    private final void A04(OXD oxd) {
        Map A07;
        OI2 oi2 = oxd.A0E;
        EnumC40111tc enumC40111tc = oxd.A0C.A1G;
        EnumC40111tc enumC40111tc2 = EnumC40111tc.A0Q;
        InterfaceC70363Du interfaceC70363Du = oi2.A01;
        if (enumC40111tc == enumC40111tc2) {
            ((C70353Dt) interfaceC70363Du).EHg(oi2.A00);
            return;
        }
        C47Z c47z = oi2.A00;
        C70353Dt c70353Dt = (C70353Dt) interfaceC70363Du;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c70353Dt.A01, "ig_video_cover_photo_upload_start");
        if (A0f.isSampled()) {
            Context context = c70353Dt.A00;
            UserSession userSession = c70353Dt.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            MSZ.A1G(A0f, c47z2);
            C50704MZz.A02(A0f, userSession, c47z, c50703MZy);
            C50704MZz.A06(A0f, c50703MZy);
            C50704MZz.A05(A0f, c50703MZy, "target_surface", C50702MZx.A03(userSession, c47z, null, true));
            C50704MZz.A04(A0f, c50703MZy, c50703MZy.A0A(), "file_size_bytes");
            A0f.A9K("original_file_size_bytes", Long.valueOf(AbstractC13530mf.A03(c47z2.A3K)));
            A03(A0f, c47z2);
            A0f.AAP("ingest_type", c50703MZy.A0I());
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            AbstractC50522MSa.A1F(A0f, A07);
            A0f.Cht();
        }
        c70353Dt.Cl0(c47z, "ig_video_cover_photo_upload_start", null);
    }

    public static final void A05(OXD oxd, int i) {
        C14360o3.A07(C120005by.A00(oxd.A0B));
        String str = oxd.A0C.A3p;
        if (str != null) {
            C120005by.A03(str, null, 4, i, 0);
        }
    }

    public static final boolean A06(UserSession userSession, C47Z c47z) {
        if (c47z.A6C || (c47z.A0D() == ShareType.A0E && C18U.A06(C06090Tz.A05, userSession, 36314167533439466L))) {
            return true;
        }
        return false;
    }

    public final void A07(EnumC115415Kb enumC115415Kb, OXD oxd, String str, Throwable th) {
        Map A07;
        boolean A1a = AbstractC167017dG.A1a(oxd, str);
        OI2 oi2 = oxd.A0E;
        EnumC40111tc enumC40111tc = oxd.A0C.A1G;
        EnumC40111tc enumC40111tc2 = EnumC40111tc.A0Q;
        InterfaceC70363Du interfaceC70363Du = oi2.A01;
        if (enumC40111tc == enumC40111tc2) {
            ((C70353Dt) interfaceC70363Du).EHf(enumC115415Kb, oi2.A00, str, th);
            return;
        }
        C47Z c47z = oi2.A00;
        C70353Dt c70353Dt = (C70353Dt) interfaceC70363Du;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c70353Dt.A01, "ig_video_cover_photo_upload_failure");
        if (A0f.isSampled()) {
            Context context = c70353Dt.A00;
            UserSession userSession = c70353Dt.A02;
            C50703MZy c50703MZy = new C50703MZy(context, userSession, c47z);
            C47Z c47z2 = c50703MZy.A02;
            MSZ.A1G(A0f, c47z2);
            C50704MZz.A05(A0f, c50703MZy, "connection", AbstractC15820qc.A08(((C50704MZz) c50703MZy).A00));
            C50704MZz.A02(A0f, userSession, c47z, c50703MZy);
            A0f.AAP("target_surface", C50702MZx.A03(userSession, c47z, null, A1a));
            A0f.AAP("ingest_type", c50703MZy.A0I());
            C50704MZz.A03(A0f, c50703MZy);
            A0f.A9K("duration_ms", c50703MZy.A08());
            A0f.A9K("file_size_bytes", c50703MZy.A0A());
            C50704MZz.A04(A0f, c50703MZy, Long.valueOf(AbstractC13530mf.A03(c47z2.A3K)), "original_file_size_bytes");
            A03(A0f, c47z2);
            A0f.AAP("reason", C70353Dt.A00(th));
            A0f.AAP("error_message", str);
            A0f.A9M("exception_data", AbstractC54088Nvm.A00(th));
            if (c47z.A5D) {
                A07 = null;
            } else {
                A07 = c50703MZy.A07();
            }
            AbstractC50522MSa.A1F(A0f, A07);
            A0f.Cht();
        }
        c70353Dt.A06(c47z, TraceFieldType.FailureReason, str);
        c70353Dt.A06(c47z, "error_type", enumC115415Kb.name());
        c70353Dt.Cl0(c47z, "ig_video_cover_photo_upload_failure", null);
        C70353Dt.A05(c47z, c70353Dt, th);
    }
}
