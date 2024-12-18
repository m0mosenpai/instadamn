package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public abstract class LL2 {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36322809005222558L) != false) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.52W, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C4G2 A00(com.instagram.common.session.UserSession r6, X.C45040JwV r7, com.instagram.direct.armadilloexpress.transportpayload.Media r8, X.EnumC46242KdI r9, boolean r10) {
        /*
            r2 = 0
            boolean r1 = X.AbstractC31175DnJ.A1a(r9)
            int r0 = r8.mediaCase_
            r3 = 2
            boolean r0 = X.AbstractC167007dF.A1P(r0, r3)
            r5 = 0
            if (r0 == 0) goto L24
            int r0 = r9.ordinal()
            if (r0 == r2) goto L35
            if (r0 == r1) goto L25
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322809005222558(0x810b6700002a9e, double:3.034028902890393E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L35
        L24:
            return r5
        L25:
            if (r10 == 0) goto L35
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342163494642590253(0x2081094a000f222d, double:4.065997482763667E-152)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L35
            return r5
        L35:
            int r0 = r8.mediaCase_
            if (r0 != r3) goto L6f
            java.lang.Object r4 = r8.media_
            com.instagram.direct.armadilloexpress.transportpayload.Voice r4 = (com.instagram.direct.armadilloexpress.transportpayload.Voice) r4
        L3d:
            X.C14360o3.A07(r4)
            android.net.Uri r1 = X.LLT.A01(r7, r8)
            if (r1 == 0) goto L24
            java.lang.String r0 = X.AbstractC43593JPy.A0w()
            X.47Z r3 = new X.47Z
            r3.<init>(r0)
            X.1tc r0 = X.EnumC40111tc.A07
            r3.A0T(r0)
            java.lang.String r1 = r1.toString()
            int r2 = r4.duration_
            X.52W r0 = new X.52W
            r0.<init>()
            r0.A01 = r1
            r0.A00 = r2
            r3.A1L = r0
            X.Tr1 r1 = r4.waveforms_
            int r0 = r4.waveformSamplingFrequencyHz_
            X.4G2 r5 = new X.4G2
            r5.<init>(r3, r1, r2, r0)
            return r5
        L6f:
            com.instagram.direct.armadilloexpress.transportpayload.Voice r4 = com.instagram.direct.armadilloexpress.transportpayload.Voice.DEFAULT_INSTANCE
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL2.A00(com.instagram.common.session.UserSession, X.JwV, com.instagram.direct.armadilloexpress.transportpayload.Media, X.KdI, boolean):X.4G2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0024, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36322809005353632L) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C38321qM A03(com.instagram.common.session.UserSession r6, X.C45040JwV r7, com.instagram.direct.armadilloexpress.transportpayload.Media r8, X.EnumC46242KdI r9, boolean r10) {
        /*
            r2 = 0
            r4 = 1
            r3 = 3
            X.C14360o3.A0B(r9, r3)
            int r1 = r8.mediaCase_
            r0 = 1
            if (r1 == r4) goto Lc
            r0 = 0
        Lc:
            r5 = 0
            if (r0 != 0) goto L11
            if (r1 != r3) goto L37
        L11:
            int r0 = r9.ordinal()
            if (r0 == r2) goto L37
            if (r0 == r4) goto L27
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322809005353632(0x810b6700022aa0, double:3.0340289029732845E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L37
        L26:
            return r5
        L27:
            if (r10 == 0) goto L37
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 2342163494642524716(0x2081094a000e222c, double:4.065997482708097E-152)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 != 0) goto L37
            return r5
        L37:
            android.net.Uri r1 = X.LLT.A01(r7, r8)
            if (r1 == 0) goto L26
            int r0 = r8.mediaCase_
            if (r0 != r4) goto L4d
            com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto r0 = r8.A0N()
            X.C14360o3.A07(r0)
            X.1qM r5 = A02(r1, r0)
            return r5
        L4d:
            if (r0 != r3) goto L26
            com.instagram.direct.armadilloexpress.transportpayload.Video r0 = r8.A0O()
            X.C14360o3.A07(r0)
            X.1qM r5 = A01(r1, r7, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL2.A03(com.instagram.common.session.UserSession, X.JwV, com.instagram.direct.armadilloexpress.transportpayload.Media, X.KdI, boolean):X.1qM");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1rE, java.lang.Object] */
    public static final C38321qM A01(android.net.Uri uri, C45040JwV c45040JwV, Video video) {
        String A0w;
        ?? obj = new Object();
        CommonMediaTransport commonMediaTransport = video.mediaTransport_;
        if (commonMediaTransport == null) {
            commonMediaTransport = CommonMediaTransport.DEFAULT_INSTANCE;
        }
        C14360o3.A07(commonMediaTransport);
        if ((commonMediaTransport.bitField0_ & 1) == 0 || (A0w = commonMediaTransport.mediaId_) == null) {
            A0w = AbstractC43593JPy.A0w();
        }
        obj.A5j = A0w;
        if ((video.bitField0_ & 8) != 0) {
            Thumbnail thumbnail = video.thumbnail_;
            if (thumbnail == null) {
                thumbnail = Thumbnail.DEFAULT_INSTANCE;
            }
            C14360o3.A07(thumbnail);
            CommonMediaTransport commonMediaTransport2 = thumbnail.mediaTransport_;
            if (commonMediaTransport2 == null) {
                commonMediaTransport2 = CommonMediaTransport.DEFAULT_INSTANCE;
            }
            C14360o3.A07(commonMediaTransport2);
            obj.EW3(new ImageInfoImpl(null, null, null, AbstractC166987dD.A1J(new ExtendedImageUrl(AbstractC166987dD.A19(LLT.A00(c45040JwV, commonMediaTransport2, null)), thumbnail.width_, thumbnail.height_)), null));
        }
        obj.A4n = Integer.valueOf(video.height_);
        obj.A4o = Integer.valueOf(video.width_);
        obj.Eh0(AbstractC166987dD.A1J(new VideoVersion(null, Integer.valueOf(video.height_), -2, Integer.valueOf(video.width_), null, null, uri.toString())));
        obj.A4m = Integer.valueOf(EnumC40111tc.A0a.A00);
        if ((video.bitField0_ & 16) != 0) {
            VideoExtraMetadata videoExtraMetadata = video.videoExtraMetadata_;
            if (videoExtraMetadata == null) {
                videoExtraMetadata = VideoExtraMetadata.DEFAULT_INSTANCE;
            }
            if ((videoExtraMetadata.bitField0_ & 1) != 0) {
                obj.A4J = Float.valueOf(videoExtraMetadata.uploadMosClientScore_);
            }
        }
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        return C38801rC.A02(obj);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1rE, java.lang.Object] */
    public static final C38321qM A02(android.net.Uri uri, StaticPhoto staticPhoto) {
        String A0w;
        ?? obj = new Object();
        CommonMediaTransport commonMediaTransport = staticPhoto.mediaTransport_;
        if (commonMediaTransport == null) {
            commonMediaTransport = CommonMediaTransport.DEFAULT_INSTANCE;
        }
        C14360o3.A07(commonMediaTransport);
        if ((commonMediaTransport.bitField0_ & 1) == 0 || (A0w = commonMediaTransport.mediaId_) == null) {
            A0w = AbstractC43593JPy.A0w();
        }
        obj.A5j = A0w;
        obj.EW3(new ImageInfoImpl(null, null, null, AbstractC166987dD.A1J(new ExtendedImageUrl(AbstractC166987dD.A19(uri), staticPhoto.width_, staticPhoto.height_)), null));
        obj.A4n = Integer.valueOf(staticPhoto.height_);
        obj.A4o = Integer.valueOf(staticPhoto.width_);
        obj.A4m = Integer.valueOf(EnumC40111tc.A0Q.A00);
        AtomicBoolean atomicBoolean = C38321qM.A0i;
        return C38801rC.A02(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r36.A1S() == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r2v13, types: [X.4hc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, X.Kzj] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, X.Kzj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(com.instagram.common.session.UserSession r33, X.C45040JwV r34, com.instagram.direct.armadilloexpress.transportpayload.Media r35, X.C83403nh r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LL2.A04(com.instagram.common.session.UserSession, X.JwV, com.instagram.direct.armadilloexpress.transportpayload.Media, X.3nh, boolean):void");
    }

    public static final void A05(UserSession userSession, Media media, C83403nh c83403nh, Long l, String str, boolean z) {
        C45040JwV c45040JwV;
        AbstractC167017dG.A1P(userSession, media);
        String A0g = c83403nh.A0g();
        if (A0g != null && str != null) {
            c45040JwV = new C45040JwV(l, str, A0g, c83403nh.C8i(), c83403nh.A1d());
        } else {
            c45040JwV = null;
        }
        A04(userSession, c45040JwV, media, c83403nh, z);
    }
}
