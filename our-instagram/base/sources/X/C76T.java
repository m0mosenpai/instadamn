package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.io.File;

/* renamed from: X.76T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76T {
    public final Context A00;
    public final InterfaceC26681Qx A01;
    public final UserSession A02;
    public final C76W A03;
    public final C76X A04;
    public final C76U A05;
    public final C76V A06;

    public final C158797Aq A02(Medium medium, boolean z) {
        C09530e4 c09530e4;
        SimpleImageUrl A01;
        VideoUrlImpl videoUrlImpl;
        Integer num;
        Long l;
        boolean Cff = medium.Cff();
        String str = null;
        if (Cff) {
            String str2 = medium.A0X;
            float A00 = medium.A00();
            C14360o3.A0B(str2, 0);
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str2);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                if (extractMetadata != null) {
                    num = AbstractC003100w.A0i(extractMetadata);
                } else {
                    num = null;
                }
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata2 != null) {
                    l = AbstractC003100w.A0k(10, extractMetadata2);
                } else {
                    l = null;
                }
                if (num != null && l != null) {
                    int intValue = num.intValue();
                    if (intValue == 90 || intValue == 270) {
                        A00 = 1.0f / A00;
                    }
                    c09530e4 = new C09530e4(Float.valueOf(A00), l);
                }
            } catch (Exception e) {
                C0w9.A06("DirectMediaViewerVideoMetadataTask_doInBackground_setDataSource", "File does not exist ", e);
            }
            c09530e4 = new C09530e4(Float.valueOf(1.0f), 0L);
        } else {
            c09530e4 = new C09530e4(Float.valueOf(medium.A00()), null);
        }
        float floatValue = ((Number) c09530e4.A00).floatValue();
        Long l2 = (Long) c09530e4.A01;
        String str3 = medium.A0X;
        if (Cff) {
            A01 = null;
            videoUrlImpl = new VideoUrlImpl(str3);
            str = str3;
        } else {
            A01 = AbstractC81033jX.A01(new File(str3));
            videoUrlImpl = null;
        }
        UserSession userSession = this.A02;
        AbstractC42051wv abstractC42051wv = C137776Lz.A00;
        C42221xC c42221xC = new C42221xC(abstractC42051wv);
        C42221xC c42221xC2 = new C42221xC(abstractC42051wv);
        C42221xC A002 = A00(str);
        C42221xC A003 = A00(videoUrlImpl);
        int i = 0;
        int i2 = 8;
        if (Cff) {
            i = 8;
            i2 = 0;
        }
        C42221xC A004 = A00(A01);
        final GWH gwh = new GWH(this, 33);
        return new C158797Aq(null, c42221xC, c42221xC2, A002, A003, A004.A0L(new C6D2() { // from class: X.Ada
            @Override // X.C6D2
            public final /* synthetic */ Object apply(Object obj) {
                return InterfaceC16660sJ.this.invoke(obj);
            }
        }).A0B(), userSession, null, null, null, null, null, null, null, null, null, null, l2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, floatValue, i, i2, 8, 0, Cff, true, false, z, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r70.A01.C98().A0C.contains("ig_zero_rating_data_banner") == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C158797Aq A03(com.instagram.common.session.UserSession r71, X.C35169FfL r72, X.C3o9 r73, java.lang.Long r74, java.lang.Long r75, java.lang.String r76, java.lang.String r77, boolean r78, boolean r79) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76T.A03(com.instagram.common.session.UserSession, X.FfL, X.3o9, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean):X.7Aq");
    }

    public /* synthetic */ C76T(Context context, InterfaceC26681Qx interfaceC26681Qx, UserSession userSession) {
        C76U c76u = new C76U(userSession);
        C76V c76v = new C76V(userSession);
        C76W c76w = new C76W(userSession);
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC26681Qx;
        this.A05 = c76u;
        this.A06 = c76v;
        this.A03 = c76w;
        this.A04 = new C76X(context);
    }

    public static final C42221xC A00(Object obj) {
        if (obj == null) {
            return new C42221xC(C137776Lz.A00);
        }
        return C42221xC.A09(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C158797Aq A04(X.C83403nh r115, com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r116, X.C7Q4 r117, java.lang.Long r118, boolean r119, boolean r120) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76T.A04(X.3nh, com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel, X.7Q4, java.lang.Long, boolean, boolean):X.7Aq");
    }

    public final C158797Aq A05(C83403nh c83403nh, Long l, boolean z) {
        C38321qM c38321qM;
        String str;
        synchronized (c83403nh) {
            C101584hT c101584hT = c83403nh.A0d;
            if (c101584hT != null) {
                c38321qM = c101584hT.A05;
            } else {
                c38321qM = null;
            }
        }
        if (c38321qM != null) {
            String str2 = c83403nh.A1u;
            String A0h = c83403nh.A0h();
            C2EY c2ey = c83403nh.A10;
            C14360o3.A07(c2ey);
            EnumC40111tc BRp = c38321qM.BRp();
            String A0g = c83403nh.A0g();
            boolean z2 = c83403nh.A2P;
            boolean A1T = c83403nh.A1T();
            long C8i = c83403nh.C8i();
            return A01(this, null, c38321qM, c2ey, null, BRp, Boolean.valueOf(c83403nh.A1S()), Long.valueOf(C8i), l, null, str2, A0h, A0g, null, null, null, null, null, null, z, z2, A1T, c83403nh.A2G, false, true, false, true, false, false, false, false, false, false, false);
        }
        PendingMediaStore A00 = C25A.A00(this.A02);
        C7Q5 c7q5 = c83403nh.A0w;
        if (c7q5 != null) {
            str = c7q5.A03;
        } else {
            str = null;
        }
        C47Z A03 = A00.A03(str);
        if (A03 == null) {
            return null;
        }
        return A04(c83403nh, null, AbstractC47064KrL.A00(A03), c83403nh.A1K, z, c83403nh.A1T());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003f, code lost:
    
        if (r59.A01.C98().A0C.contains("ig_zero_rating_data_banner") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C158797Aq A01(X.C76T r59, com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r60, X.C38321qM r61, X.C2EY r62, X.InterfaceC83733oI r63, X.EnumC40111tc r64, java.lang.Boolean r65, java.lang.Long r66, java.lang.Long r67, java.lang.Long r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, boolean r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, boolean r89, boolean r90, boolean r91, boolean r92) {
        /*
            r42 = 0
            r6 = 0
            r15 = r61
            float r38 = r15.A0m()
            X.1tc r1 = r15.BRp()
            X.1tc r0 = X.EnumC40111tc.A0a
            r3 = r59
            r45 = r91
            if (r1 != r0) goto Lc1
            r43 = 1
            com.instagram.common.typedurl.ImageUrl r5 = r15.A1S()
            java.lang.String r2 = r15.A0M
            java.lang.String r1 = r15.getId()
            X.1rF r0 = r15.A0C
            java.util.List r0 = r0.CFe()
            java.util.ArrayList r0 = X.AbstractC75353a2.A00(r0)
            com.instagram.model.mediasize.VideoUrlImpl r4 = X.AbstractC88593xJ.A01(r1, r0)
            X.1Qx r0 = r3.A01
            X.1R0 r0 = r0.C98()
            java.lang.String r1 = "ig_zero_rating_data_banner"
            java.util.Set r0 = r0.A0C
            boolean r0 = r0.contains(r1)
            r41 = 0
            if (r0 != 0) goto L43
        L41:
            r41 = 8
        L43:
            r39 = 8
            if (r5 == 0) goto L49
            r39 = 0
        L49:
            r40 = 8
            if (r43 == 0) goto L4f
            r40 = 0
        L4f:
            com.instagram.common.session.UserSession r12 = r3.A02
            X.1xC r7 = A00(r5)
            X.1xC r8 = A00(r5)
            X.1xC r9 = A00(r2)
            X.1xC r10 = A00(r4)
            java.lang.String r26 = r15.getId()
            X.1wv r0 = X.C137776Lz.A00
            X.1xC r11 = new X.1xC
            r11.<init>(r0)
            X.7Aq r5 = new X.7Aq
            r57 = r87
            r56 = r86
            r55 = r85
            r54 = r84
            r53 = r83
            r21 = r67
            r24 = r69
            r25 = r70
            r27 = r71
            r58 = r88
            r59 = r89
            r14 = r60
            r19 = r64
            r60 = r90
            r20 = r65
            r17 = r62
            r22 = r66
            r61 = r92
            r18 = r63
            r30 = r72
            r32 = r73
            r31 = r74
            r33 = r75
            r34 = r76
            r36 = r77
            r46 = r78
            r47 = r79
            r48 = r80
            r51 = r81
            r52 = r82
            r13 = r6
            r16 = r6
            r23 = r6
            r28 = r6
            r29 = r6
            r35 = r6
            r37 = r6
            r44 = r42
            r49 = r42
            r50 = r42
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            return r5
        Lc1:
            r43 = 0
            if (r91 == 0) goto Lcf
            r0 = r68
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r15.A1r(r0)
        Lcb:
            r4 = 0
            r2 = r6
            goto L41
        Lcf:
            android.content.Context r0 = r3.A00
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r15.A1q(r0)
            goto Lcb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76T.A01(X.76T, com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel, X.1qM, X.2EY, X.3oI, X.1tc, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):X.7Aq");
    }
}
