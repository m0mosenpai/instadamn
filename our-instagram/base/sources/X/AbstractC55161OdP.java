package X;

import android.media.MediaMetadataRetriever;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.suggestions.model.GallerySuggestionsInfo;
import com.instagram.pendingmedia.model.ClipInfo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.OdP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55161OdP {
    public static final Integer[] A00 = {C05F.A03, C05F.A04, C05F.A05, C05F.A06, C05F.A07, C05F.A08, C05F.A09, C05F.A0A, C05F.A0B, C05F.A0D};

    /* JADX WARN: Type inference failed for: r1v10, types: [X.OFw, java.lang.Object] */
    public static final C54745OFw A00(C47Z c47z, boolean z) {
        boolean z2;
        boolean z3;
        RingSpecImpl ringSpecImpl;
        RingSpecImpl ringSpecImpl2;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        String str4 = null;
        ArrayList arrayList2 = null;
        ClipsFanClubMetadata clipsFanClubMetadata = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        GallerySuggestionsInfo gallerySuggestionsInfo = null;
        List list2 = null;
        A64 a64 = null;
        Boolean bool = null;
        C47v c47v = null;
        String str9 = null;
        Integer num = null;
        Integer num2 = null;
        String str10 = null;
        C184758Hq c184758Hq = null;
        List list3 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        List list4 = null;
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        LinkedHashSet A0l2 = AbstractC31171DnF.A0l();
        MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        C16930sl c16930sl = C16930sl.A00;
        boolean z4 = c47z.A5j;
        A64 a642 = c47z.A1Z;
        if (a642 != null) {
            a64 = a642;
        }
        long j = (c47z.A0X * 1000) / 1000;
        String str14 = c47z.A3l;
        if (str14 != null) {
            str9 = str14;
        }
        TransformMatrixConfig transformMatrixConfig = c47z.A16;
        GallerySuggestionsInfo gallerySuggestionsInfo2 = c47z.A17;
        if (gallerySuggestionsInfo2 != null) {
            gallerySuggestionsInfo = gallerySuggestionsInfo2;
        }
        String str15 = c47z.A2z;
        if (str15 != null) {
            str8 = str15;
        }
        Boolean bool2 = c47z.A1t;
        if (bool2 != null) {
            bool = bool2;
        }
        List list5 = c47z.A4D;
        if (list5 != null) {
            arrayList = AbstractC167017dG.A0q(list5);
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(((C5JB) it.next()).A01);
            }
        }
        C56Y c56y = c47z.A1g;
        List list6 = c47z.A4g;
        List list7 = c47z.A4Y;
        List list8 = c47z.A4l;
        List list9 = c47z.A4k;
        List list10 = c47z.A4o;
        A0l.addAll(AbstractC54882OPd.A00(c47z.A4u));
        List list11 = c47z.A4h;
        C14360o3.A0B(list11, 0);
        if (z) {
            list3 = c47z.A4b;
        }
        List list12 = c47z.A4P;
        String str16 = c47z.A2o;
        if (str16 != null) {
            str10 = str16;
        }
        String str17 = c47z.A2n;
        if (str17 != null) {
            str6 = str17;
        }
        String str18 = c47z.A2V;
        if (str18 != null) {
            str2 = str18;
        }
        C184758Hq c184758Hq2 = c47z.A1b;
        if (c184758Hq2 != null) {
            c184758Hq = c184758Hq2;
        }
        String str19 = c47z.A2h;
        if (str19 != null) {
            str5 = str19;
        }
        String str20 = c47z.A2Y;
        boolean z5 = false;
        if (str20 != null && str20.length() != 0) {
            str4 = str20;
        }
        MediaUploadMetadata mediaUploadMetadata2 = c47z.A13;
        if (mediaUploadMetadata2 != null) {
            mediaUploadMetadata = mediaUploadMetadata2;
        }
        String str21 = c47z.A2O;
        if (str21 != null) {
            str = str21;
        }
        String str22 = c47z.A3Y;
        if (str22 != null) {
            str12 = str22;
        }
        String str23 = c47z.A2K;
        String str24 = str23 != null ? str23 : null;
        List list13 = c47z.A4Z;
        String str25 = c47z.A2X;
        if (str25 != null) {
            str3 = str25;
        }
        boolean z6 = c47z.A4w;
        String str26 = c47z.A3T;
        if (str26 != null && str26.length() != 0) {
            str11 = str26;
        }
        Integer num3 = c47z.A2D;
        if (num3 != null) {
            num = num3;
        }
        List list14 = c47z.A4j;
        if (list14 != null && !list14.isEmpty()) {
            list4 = list14;
        }
        String str27 = c47z.A2v;
        if (str27 != null) {
            str7 = str27;
        }
        Integer num4 = c47z.A2E;
        if (num4 != null) {
            num2 = num4;
        }
        List list15 = c47z.A4J;
        if (list15 != null) {
            list = list15;
            c47v = c47z.A1V;
        }
        ArrayList A0I = c47z.A0I();
        if (A0I != null) {
            arrayList2 = A0I;
        }
        String str28 = c47z.A3e;
        if (str28 != null) {
            str13 = str28;
        }
        List list16 = c47z.A4S;
        if (list16 != null) {
            list2 = list16;
        }
        ClipsFanClubMetadata clipsFanClubMetadata2 = c47z.A11;
        if (clipsFanClubMetadata2 != null) {
            clipsFanClubMetadata = clipsFanClubMetadata2;
        }
        Integer[] numArr = A00;
        int i = 0;
        while (true) {
            Integer num5 = numArr[i];
            HashMap hashMap = c47z.A44;
            if (hashMap != null && hashMap.containsKey(AbstractC210029Qp.A00(num5))) {
                z2 = true;
                break;
            }
            i++;
            if (i >= 10) {
                z2 = false;
                break;
            }
        }
        if (c47z.A11() && !c47z.A5j) {
            List<ClipInfo> list17 = c47z.A4G;
            if (!(list17 instanceof Collection) || !list17.isEmpty()) {
                for (ClipInfo clipInfo : list17) {
                    String str29 = clipInfo.A0F;
                    Float f = null;
                    if (str29 != null && MSY.A06(str29) > 0) {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(str29);
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(25);
                            if (extractMetadata != null) {
                                f = AnonymousClass010.A0n(extractMetadata);
                            }
                        } catch (Exception unused) {
                            C18950wb c18950wb = C18950wb.A01;
                            StringBuilder A1C = AbstractC166987dD.A1C();
                            A1C.append("Failed to read metadata from video: ");
                            A1C.append(str29);
                            A1C.append(". File size: ");
                            A1C.append(clipInfo.A00());
                            A1C.append(". Mime type: ");
                            A1C.append(clipInfo.A0P);
                            c18950wb.AEp(MSX.A0l(A1C, '.'), 518917599);
                        }
                        try {
                            mediaMetadataRetriever.release();
                        } catch (IOException unused2) {
                        }
                        if (f != null) {
                            z3 = true;
                            break;
                        }
                    }
                    String str30 = clipInfo.A0F;
                    if (str30 != null && AbstractC001900j.A0a(str30, "camera", true)) {
                        z3 = true;
                        break;
                    }
                }
            }
        }
        z3 = false;
        boolean A1P = AbstractC167007dF.A1P(c47z.A0K, 1);
        if (z2 || z3 || A1P) {
            z5 = true;
        }
        boolean z7 = c47z.A57;
        boolean z8 = c47z.A5o;
        boolean z9 = c47z.A5v;
        boolean z10 = c47z.A4z;
        RingSpecImpl ringSpecImpl3 = c47z.A0y;
        if (ringSpecImpl3 != null) {
            ringSpecImpl = ringSpecImpl3.EzF();
        } else {
            ringSpecImpl = null;
        }
        C38561qk c38561qk = c47z.A1m;
        boolean z11 = c47z.A62;
        boolean z12 = c47z.A5m;
        boolean z13 = c47z.A68;
        boolean z14 = c47z.A5H;
        boolean z15 = c47z.A5G;
        boolean z16 = c47z.A5n;
        boolean A1W = AbstractC167007dF.A1W(C48r.A00(EnumC75383a5.A1A, c47z.A4b));
        boolean z17 = c47z.A56;
        boolean z18 = c47z.A5k;
        String str31 = c47z.A3r;
        boolean z19 = c47z.A5W;
        String str32 = c47z.A2e;
        java.util.Set set = c47z.A4t;
        A0l2.clear();
        if (set != null) {
            A0l2.addAll(set);
        }
        C188538Ws c188538Ws = c47z.A1Y;
        List list18 = c47z.A49;
        String str33 = c47z.A31;
        List list19 = c47z.A4Q;
        List list20 = c47z.A4e;
        String str34 = c47z.A3d;
        boolean z20 = c47z.A5d;
        boolean z21 = c47z.A4v;
        if (list3 == null) {
            list3 = c16930sl;
        }
        if (list6 == null) {
            list6 = c16930sl;
        }
        if (list12 == null) {
            list12 = c16930sl;
        }
        if (list7 == null) {
            list7 = c16930sl;
        }
        if (list8 == null) {
            list8 = c16930sl;
        }
        if (list4 == null) {
            list4 = c16930sl;
        }
        if (list9 == null) {
            list9 = c16930sl;
        }
        if (list10 == null) {
            list10 = c16930sl;
        }
        if (str10 == null) {
            str10 = null;
        }
        if (list13 == null) {
            list13 = c16930sl;
        }
        ?? obj = new Object();
        obj.A03 = new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false);
        obj.A11 = z4;
        obj.A08 = a64;
        obj.A00 = j;
        obj.A0R = str9;
        obj.A0A = c56y;
        obj.A0g = list3;
        obj.A0i = list6;
        obj.A0b = list12;
        obj.A0e = list7;
        obj.A0l = list8;
        obj.A0k = list4;
        obj.A0m = list9;
        obj.A0n = list10;
        obj.A0o = AbstractC54882OPd.A01(A0l);
        obj.A0p = A0l2;
        obj.A0N = str10;
        obj.A0M = str6;
        obj.A0H = str2;
        obj.A0L = str5;
        obj.A0J = str4;
        obj.A03 = mediaUploadMetadata;
        obj.A0G = str;
        obj.A0T = str12;
        obj.A0F = str24;
        obj.A0O = str7;
        obj.A0f = list13;
        obj.A0I = str3;
        obj.A0q = z6;
        obj.A0t = z7;
        obj.A15 = z8;
        obj.A16 = z9;
        obj.A0r = z10;
        obj.A17 = z11;
        obj.A13 = z12;
        obj.A0x = z14;
        obj.A09 = c184758Hq;
        obj.A0S = str11;
        obj.A0D = num;
        obj.A0a = list;
        obj.A0Z = arrayList2;
        obj.A0w = z15;
        obj.A14 = z16;
        obj.A0y = A1W;
        obj.A0s = z17;
        obj.A12 = z18;
        obj.A0E = num2;
        obj.A0W = str31;
        obj.A0V = str13;
        if (ringSpecImpl != null) {
            ringSpecImpl2 = ringSpecImpl.EzF();
        } else {
            ringSpecImpl2 = null;
        }
        obj.A01 = ringSpecImpl2;
        obj.A0B = c38561qk;
        obj.A06 = c47v;
        obj.A0z = z19;
        obj.A0K = str32;
        obj.A0j = list11;
        obj.A04 = transformMatrixConfig;
        obj.A0C = bool;
        obj.A05 = gallerySuggestionsInfo;
        obj.A0P = str8;
        obj.A07 = c188538Ws;
        obj.A0d = list2;
        obj.A0Y = arrayList;
        obj.A02 = clipsFanClubMetadata;
        obj.A0X = list18;
        obj.A0Q = str33;
        obj.A0c = list19;
        obj.A0h = list20;
        obj.A0U = str34;
        obj.A0u = z5;
        obj.A18 = z13;
        obj.A10 = z20;
        obj.A0v = z21;
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.InterfaceC23731Ed r2, com.instagram.pendingmedia.model.constants.ShareType r3) {
        /*
            if (r3 == 0) goto L48
            X.NvZ r0 = X.AbstractC54075NvZ.$redex_init_class
            int r1 = r3.ordinal()
            r0 = 16
            if (r1 == r0) goto L45
            r0 = 2
            if (r1 == r0) goto L42
            r0 = 3
            if (r1 == r0) goto L3f
            r0 = 25
            if (r1 != r0) goto L48
            java.lang.Integer r0 = X.C05F.A02
        L18:
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L2b;
                case 2: goto L2d;
                case 3: goto L2f;
                case 4: goto L31;
                case 5: goto L33;
                case 6: goto L35;
                case 7: goto L37;
                case 8: goto L39;
                case 9: goto L3c;
                default: goto L1f;
            }
        L1f:
            r0 = 11
        L21:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "configure_mode"
            r2.A9s(r0, r1)
            return
        L2b:
            r0 = 1
            goto L21
        L2d:
            r0 = 2
            goto L21
        L2f:
            r0 = 3
            goto L21
        L31:
            r0 = 4
            goto L21
        L33:
            r0 = 5
            goto L21
        L35:
            r0 = 6
            goto L21
        L37:
            r0 = 7
            goto L21
        L39:
            r0 = 9
            goto L21
        L3c:
            r0 = 10
            goto L21
        L3f:
            java.lang.Integer r0 = X.C05F.A0C
            goto L18
        L42:
            java.lang.Integer r0 = X.C05F.A01
            goto L18
        L45:
            java.lang.Integer r0 = X.C05F.A15
            goto L18
        L48:
            java.lang.Integer r0 = X.C05F.A0N
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55161OdP.A02(X.1Ed, com.instagram.pendingmedia.model.constants.ShareType):void");
    }

    public static final void A03(InterfaceC23731Ed interfaceC23731Ed, C22932A9c c22932A9c) {
        try {
            String A002 = AbstractC111324zv.A00(5141);
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0O2 = MSW.A0O(A0O);
            AEN.A00(A0O2, c22932A9c);
            interfaceC23731Ed.A9s(A002, AbstractC31175DnJ.A0b(Collections.singletonList(new JSONObject(MSX.A0e(A0O2, A0O)))));
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x048d, code lost:
    
        if (r0.isEmpty() != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0bf9, code lost:
    
        if (r1 != false) goto L614;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (X.C14360o3.A0K(r11.A1h, X.AbstractC111324zv.A00(1168)) != false) goto L72;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x011e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC23731Ed r22, com.instagram.common.session.UserSession r23, X.C54745OFw r24, long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 3442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55161OdP.A01(X.1Ed, com.instagram.common.session.UserSession, X.OFw, long, boolean):void");
    }
}
