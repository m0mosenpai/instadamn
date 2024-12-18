package X;

import android.graphics.Bitmap;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51756Mtf extends C0T6 {
    public Object A00;
    public final int A01;

    public static int A00(C51756Mtf c51756Mtf) {
        return c51756Mtf.A00.hashCode();
    }

    public static boolean A02(Object obj, int i) {
        if ((obj instanceof C51756Mtf) && ((C51756Mtf) obj).A01 == i) {
            return true;
        }
        return false;
    }

    public final AnonymousClass693 A03(EnumC46207Kcj enumC46207Kcj) {
        return (AnonymousClass693) ((Map) this.A00).get(enumC46207Kcj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51756Mtf.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0H;
        String str;
        switch (this.A01) {
            case 0:
                return A00(this);
            case 1:
                return A00(this);
            case 2:
            case 3:
            case 6:
            case 14:
            case 22:
            case 24:
            case 28:
            case 31:
            case 33:
                return A00(this);
            case 4:
                return A00(this);
            case 5:
                Integer num = (Integer) this.A00;
                if (num != null) {
                    return AbstractC25230BEn.A0C(num, SQk.A01(num));
                }
                return 0;
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 44:
                return A00(this);
            case 8:
                A0H = AbstractC166987dD.A0H(this.A00);
                switch (A0H) {
                    case 1:
                        str = AbstractC58317Pt9.A00(625);
                        break;
                    case 2:
                        str = "Ineligible";
                        break;
                    default:
                        str = AbstractC58317Pt9.A00(626);
                        break;
                }
            case 9:
                return A00(this);
            case 10:
            case Process.SIGTERM /* 15 */:
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 21:
            case 23:
            case 26:
            case 35:
            case 37:
            case 39:
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            case 45:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
            case 47:
            case 49:
                Object obj = this.A00;
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            case 11:
            default:
                return super.hashCode();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return A00(this);
            case 17:
                return A00(this);
            case 18:
                return A00(this);
            case 25:
                A0H = AbstractC166987dD.A0H(this.A00);
                switch (A0H) {
                    case 1:
                        str = "SHOW_TRANSLATED_CAPTIONS_ONLY";
                        break;
                    case 2:
                        str = "NEVER_SHOW_CAPTIONS";
                        break;
                    default:
                        str = "ALWAYS_SHOW_CAPTIONS";
                        break;
                }
            case 27:
                return A00(this);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return A00(this);
            case 30:
                return A00(this);
            case 32:
                return A00(this);
            case 34:
                return A00(this);
            case 36:
                return A00(this);
            case 38:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return A00(this);
            case 48:
                return A00(this);
        }
        return AbstractC25226BEj.A02(str, A0H);
    }

    public final String toString() {
        StringBuilder A1C;
        String str;
        switch (this.A01) {
            case 10:
                A1C = AbstractC166987dD.A1C();
                str = "GraphQLInAppPurchaseOffer(subscriptionOffers=";
                break;
            case 11:
                A1C = AbstractC166987dD.A1C();
                str = "ShowreelNativeMetadata(visibleLayers=";
                break;
            case 24:
                A1C = AbstractC166987dD.A1C();
                str = "AccessTokenRequestOrder(orders=";
                break;
            case 32:
                A1C = AbstractC166987dD.A1C();
                str = "SocialContextBubbleActions(currentCarouselSlideMediaId=";
                break;
            case 35:
                A1C = AbstractC166987dD.A1C();
                str = "DrawableMetadata(drawable=";
                break;
            case 36:
                A1C = AbstractC166987dD.A1C();
                str = "CtaInfo(type=";
                break;
            case 49:
                A1C = AbstractC166987dD.A1C();
                str = "UiState(threadsPrivacyInfo=";
                break;
            default:
                return super.toString();
        }
        A1C.append(str);
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public static Object A01(C50724MaP c50724MaP) {
        return ((C51756Mtf) C50724MaP.A01(c50724MaP).A0P.getValue()).A00;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(C50627MWo c50627MWo, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 46);
        this.A01 = 46;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(C51685MsG c51685MsG, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 45);
        this.A01 = 45;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(InterfaceC58189Pqv interfaceC58189Pqv, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 40);
        this.A01 = 40;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(MediaGenAIDetectionMethod mediaGenAIDetectionMethod, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 47);
        this.A01 = 47;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(AudioOverlayTrack audioOverlayTrack, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this((Object) null, 43);
        this.A01 = 43;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(InterfaceC16820sZ interfaceC16820sZ, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(C57332Pcs.A00);
        this.A01 = 32;
    }

    public C51756Mtf(MediaTrialGraduationStrategy mediaTrialGraduationStrategy) {
        this.A01 = 48;
        this.A00 = mediaTrialGraduationStrategy;
    }

    public C51756Mtf(XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint) {
        this.A01 = 17;
        this.A00 = xFBFXIGPCEntryPoint;
    }

    public C51756Mtf(InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = 32;
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A00 = interfaceC16820sZ;
    }

    public C51756Mtf(C8Z4 c8z4) {
        this.A01 = 34;
        C14360o3.A0B(c8z4, 1);
        this.A00 = c8z4;
    }

    public C51756Mtf(C51656Mrn c51656Mrn) {
        this.A01 = 9;
        C14360o3.A0B(c51656Mrn, 1);
        this.A00 = c51656Mrn;
    }

    public C51756Mtf(EnumC53223NgL enumC53223NgL) {
        this.A01 = 36;
        C14360o3.A0B(enumC53223NgL, 1);
        this.A00 = enumC53223NgL;
    }

    public C51756Mtf(List list, int i) {
        this.A01 = i;
        switch (i) {
            case 2:
            case 3:
            case 6:
            case 11:
            case 14:
            case 22:
            case 24:
            case 31:
            case 33:
                C14360o3.A0B(list, 1);
                break;
        }
        this.A00 = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf() {
        this(MediaTrialGraduationStrategy.A04);
        this.A01 = 48;
        this.A01 = 48;
    }

    public C51756Mtf(int i, Integer num) {
        this.A01 = i;
        if (5 - i != 0) {
            C14360o3.A0B(num, 1);
        }
        this.A00 = num;
    }

    public C51756Mtf(C51688MsJ c51688MsJ, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A01 = 0;
        C51688MsJ c51688MsJ2 = new C51688MsJ(0);
        this.A01 = 0;
        this.A00 = c51688MsJ2;
    }

    public C51756Mtf(C63010SaY c63010SaY, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A01 = 30;
        C63010SaY c63010SaY2 = C63010SaY.A01;
        this.A01 = 30;
        C14360o3.A0B(c63010SaY2, 1);
        this.A00 = c63010SaY2;
    }

    public C51756Mtf(Bitmap bitmap, int i) {
        this.A01 = i;
        this.A00 = bitmap;
    }

    public C51756Mtf(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public C51756Mtf(Map map, int i) {
        this.A01 = i;
        this.A00 = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51756Mtf(int r3) {
        /*
            r2 = this;
            r2.A01 = r3
            r1 = 0
            int r3 = 37 - r3
            if (r3 == 0) goto Ld
            r0 = 41
        L9:
            r2.<init>(r1, r0)
            return
        Ld:
            r0 = 37
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51756Mtf.<init>(int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51756Mtf(Integer num, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this(8, C05F.A0C);
        this.A01 = 8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51756Mtf(java.util.List r3, kotlin.jvm.internal.DefaultConstructorMarker r4, int r5, int r6) {
        /*
            r2 = this;
            r2.A01 = r6
            switch(r6) {
                case 2: goto L1d;
                case 3: goto L17;
                case 4: goto L5;
                case 5: goto L5;
                case 6: goto L11;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto Ld;
                default: goto L5;
            }
        L5:
            X.0sl r1 = X.C16930sl.A00
            r0 = 14
        L9:
            r2.<init>(r1, r0)
            return
        Ld:
            r1 = 0
            r0 = 10
            goto L9
        L11:
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            r0 = 6
            goto L9
        L17:
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            r0 = 3
            goto L9
        L1d:
            X.0sl r1 = X.C16930sl.A00
            r0 = 2
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51756Mtf.<init>(java.util.List, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public C51756Mtf(C51756Mtf c51756Mtf, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        this.A01 = 4;
        C51756Mtf c51756Mtf2 = new C51756Mtf(5, (Integer) null);
        this.A01 = 4;
        this.A00 = c51756Mtf2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51756Mtf(java.util.Map r3, kotlin.jvm.internal.DefaultConstructorMarker r4, int r5, int r6) {
        /*
            r2 = this;
            r2.A01 = r6
            int r6 = 7 - r6
            if (r6 == 0) goto L10
            X.0sk r1 = X.AbstractC06930Yk.A0E()
            r0 = 44
        Lc:
            r2.<init>(r1, r0)
            return
        L10:
            java.util.LinkedHashMap r1 = X.AbstractC166987dD.A1I()
            r0 = 7
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51756Mtf.<init>(java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }
}
