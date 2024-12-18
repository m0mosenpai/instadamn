package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Bundle;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Cf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69963Cf implements InterfaceC69973Cg {
    public int A00;
    public File A01;
    public EnumC69983Ch A02 = EnumC69983Ch.A02;
    public final Context A03;
    public final UserSession A04;
    public final InterfaceC69913Ca A05;

    public final void A04(Bundle bundle, EnumC33447EqK enumC33447EqK, EnumC69983Ch enumC69983Ch) {
        A03(bundle, enumC33447EqK, this, new MediaCaptureConfig(new C43846JaA(enumC69983Ch)), enumC69983Ch, null, null, null, -1, 10001, true, false);
    }

    @Override // X.InterfaceC69973Cg
    public final void Emy(EnumC33447EqK enumC33447EqK, EnumC69983Ch enumC69983Ch) {
        C14360o3.A0B(enumC33447EqK, 1);
        A03(null, enumC33447EqK, this, new MediaCaptureConfig(new C43846JaA(enumC69983Ch)), enumC69983Ch, null, null, null, -1, 10001, true, false);
    }

    @Override // X.InterfaceC69973Cg
    public final void Emz(EnumC33447EqK enumC33447EqK, MediaCaptureConfig mediaCaptureConfig, EnumC69983Ch enumC69983Ch) {
        A03(null, enumC33447EqK, this, mediaCaptureConfig, enumC69983Ch, null, null, null, -1, 10001, true, false);
    }

    @Override // X.InterfaceC69973Cg
    public final void EnC(android.net.Uri uri, C22P c22p, String str, int i, int i2) {
        C14360o3.A0B(uri, 0);
        EnD(uri, c22p, null, null, str, null, null, null, null, null, null, i, i2, false);
    }

    @Override // X.InterfaceC69973Cg
    public final void Eo7(android.net.Uri uri, C22P c22p, String str, String str2, int i, boolean z) {
        C14360o3.A0B(uri, 0);
        this.A00 = i;
        C14H.A03.A00();
        Intent intent = new Intent(this.A03, (Class<?>) MediaCaptureActivity.class);
        intent.putExtra("videoFilePath", uri);
        intent.putExtra("mediaSource", i);
        intent.putExtra("cameraEntryPoint", c22p);
        intent.putExtra(MSV.A00(1710), false);
        intent.putExtra("autoCenterCrop", false);
        intent.putExtra("sourceMediaId", str);
        intent.putExtra("linked_highlight_id", str2);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A04.token);
        this.A05.EnX(intent, 10004);
    }

    @Override // X.InterfaceC69973Cg
    public final void EoI(EnumC33447EqK enumC33447EqK, MediaCaptureConfig mediaCaptureConfig, EnumC69983Ch enumC69983Ch) {
        A03(null, enumC33447EqK, this, mediaCaptureConfig, enumC69983Ch, null, null, null, 0, 10001, true, false);
    }

    @Override // X.InterfaceC69973Cg
    public final void EoK(EnumC33447EqK enumC33447EqK, MediaCaptureConfig mediaCaptureConfig, EnumC69983Ch enumC69983Ch) {
        A03(null, enumC33447EqK, this, mediaCaptureConfig, enumC69983Ch, null, null, null, 1, 10001, true, false);
    }

    private final void A01() {
        File file = this.A01;
        if (file != null && file.isFile() && !file.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to delete ");
            sb.append(file);
            C0K8.A0D("CaptureFlowHelper", sb.toString());
        }
    }

    public static final void A02(android.net.Uri uri, CreationSession creationSession, C69963Cf c69963Cf, C47Z c47z, PendingMediaStore pendingMediaStore, String str, boolean z) {
        C47Z A01;
        AbstractC224309vG abstractC224309vG;
        UserSession userSession = c69963Cf.A04;
        AnonymousClass840 A00 = MX9.A00(C22P.A2d, userSession, creationSession, new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false));
        AnonymousClass841 A002 = A00.A00();
        int i = c69963Cf.A00;
        ((MX5) A002).A01.A02 = i;
        String valueOf = String.valueOf(System.nanoTime());
        if (z) {
            A01 = AbstractC44068Jdt.A00(valueOf, i);
            AbstractC44068Jdt.A05(A00.A00(), A01, c47z.A35, str, c69963Cf.A00);
            C44059Jdk A003 = C44059Jdk.A00(str, 0);
            C14360o3.A07(A003);
            AbstractC44068Jdt.A02(userSession, A00.A00(), A01, A003, 1.0f, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
            Point A02 = ALe.A02(c69963Cf.A03, userSession, 1.0f, A01.A1N.A09);
            File A012 = AbstractC916948n.A01();
            int A013 = (int) C18U.A01(C06090Tz.A05, userSession, 36609287619417978L);
            if (A013 == 0) {
                A013 = C55187Ods.A00(A02.x);
            }
            C55201OeB.A02(A01, A012, A02.x, A02.y, A013);
            A01.A33 = A012.getCanonicalPath();
            pendingMediaStore.A0D(A01, A01.A35);
            String str2 = A01.A35;
            MediaSession mediaSession = creationSession.A07;
            if (mediaSession != null) {
                mediaSession.Eac(str2);
            }
        } else {
            String str3 = null;
            A01 = AbstractC209399Nx.A01(valueOf);
            A01.A3O = c47z.A3t;
            A01.A0K = c69963Cf.A00;
            Context context = c69963Cf.A03;
            C14360o3.A0B(uri, 1);
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        C60782q2 c60782q2 = new C60782q2(openInputStream);
                        String[] strArr = {c60782q2.A0N("MakerNote"), c60782q2.A0N("ImageDescription"), c60782q2.A0N("Model")};
                        C14360o3.A0B(strArr, 0);
                        abstractC224309vG = AbstractC178007vZ.A01(userSession, "", AbstractC009903n.A0I(strArr));
                        openInputStream.close();
                    } finally {
                    }
                } else {
                    abstractC224309vG = null;
                }
            } catch (Throwable unused) {
                abstractC224309vG = null;
            }
            MediaUploadMetadata mediaUploadMetadata = A01.A13;
            if (abstractC224309vG != null) {
                str3 = abstractC224309vG.A02();
            }
            mediaUploadMetadata.A03 = str3;
            creationSession.A07(str, uri.toString(), false);
            MediaSession mediaSession2 = creationSession.A07;
            if (mediaSession2 != null) {
                mediaSession2.EYz(c69963Cf.A00);
            }
            String str4 = A01.A35;
            if (mediaSession2 != null) {
                mediaSession2.Eac(str4);
            }
        }
        pendingMediaStore.A0D(A01, A01.A35);
    }

    public static final void A03(Bundle bundle, EnumC33447EqK enumC33447EqK, C69963Cf c69963Cf, MediaCaptureConfig mediaCaptureConfig, EnumC69983Ch enumC69983Ch, UpcomingEvent upcomingEvent, String str, List list, int i, int i2, boolean z, boolean z2) {
        c69963Cf.A02 = enumC69983Ch;
        AbstractC208269Jl.A00(c69963Cf.A04).A07(A00(enumC33447EqK, c69963Cf), true);
        C6WI.A0Z = null;
        C1QE.A01("capture_flow_v2").A08();
        C6WI.A01().A0C = enumC33447EqK.A00;
        Context context = c69963Cf.A03;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            AbstractC175047qe.A00(context.getApplicationContext(), null, AnonymousClass820.A00(context), false).BYA(new C51968My5(bundle, enumC33447EqK, c69963Cf, mediaCaptureConfig, enumC69983Ch, upcomingEvent, str, list, i, i2, packageManager.hasSystemFeature(AbstractC58317Pt9.A00(221)), packageManager.hasSystemFeature(AbstractC58317Pt9.A00(222)), z, z2));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC69973Cg
    public final void Dgs(Bundle bundle) {
        if (bundle != null) {
            if (bundle.getString("tempPhotoFile") != null) {
                this.A01 = new File(bundle.getString("tempPhotoFile"));
            }
            this.A02 = EnumC69983Ch.values()[bundle.getInt("captureType", 0)];
            ClassLoader classLoader = MediaCaptureConfig.class.getClassLoader();
            if (classLoader != null) {
                C52912bY.A00(bundle, classLoader);
                this.A00 = bundle.getInt("mediaSource");
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.InterfaceC69973Cg
    public final void E2N(AbstractC018607g abstractC018607g, C22P c22p, String str, List list, List list2, List list3, int i, int i2) {
        C14360o3.A0B(abstractC018607g, 6);
        this.A00 = i;
        EnumC69983Ch enumC69983Ch = EnumC69983Ch.A02;
        C43846JaA c43846JaA = new C43846JaA(enumC69983Ch);
        c43846JaA.A01 = str;
        c43846JaA.A02 = list3;
        MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(c43846JaA);
        CreationSession creationSession = new CreationSession();
        creationSession.A0A = enumC69983Ch;
        creationSession.A09 = mediaCaptureConfig;
        UserSession userSession = this.A04;
        AnonymousClass840 A00 = MX9.A00(c22p, userSession, creationSession, new C1815483h(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, true, false, false, false, false));
        ((MX5) A00.A00()).A01.A02 = i;
        ArrayList arrayList = new ArrayList(list2);
        Context context = this.A03;
        AbstractC46688Kl5.A00(context, userSession, A00.A00(), arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Medium medium = (Medium) it.next();
            arrayList2.add(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
        }
        if (arrayList2.size() == list.size()) {
            C195428ki A002 = AbstractC195408kg.A00(userSession);
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                C38321qM c38321qM = (C38321qM) list.get(i3);
                String id = c38321qM.getId();
                ImageUrl A1S = c38321qM.A1S();
                if (id != null && A1S != null) {
                    boolean Cff = c38321qM.Cff();
                    A002.A02((Medium) list2.get(i3), new RemoteMedia(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), A1S, A1S, null, null, null, id, A1S.getUrl(), (int) c38321qM.A1C(), Cff, false, false));
                }
            }
        }
        C43871Jab c43871Jab = new C43871Jab(context, abstractC018607g, c22p, userSession, null, null, A00, null, null, i2);
        float f = creationSession.A00;
        if (f == 0.0f) {
            f = 1.0f;
        }
        c43871Jab.A05(EnumC114925Hg.FEED, null, null, arrayList2, AbstractC43847JaB.A00(userSession).A04, new HashMap(), f, false, false, false);
    }

    @Override // X.InterfaceC69973Cg
    public final void EnD(android.net.Uri uri, C22P c22p, EnumC33447EqK enumC33447EqK, C5L6 c5l6, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        EnumC33447EqK enumC33447EqK2;
        if (i == 3) {
            enumC33447EqK2 = EnumC33447EqK.A0Z;
        } else {
            enumC33447EqK2 = EnumC33447EqK.A09;
        }
        C6WI.A0Z = null;
        C1QE.A01("capture_flow_v2").A08();
        C6WI.A01().A0C = enumC33447EqK2.A00;
        this.A00 = i;
        Context context = this.A03;
        Bundle bundle = new O2L(context).A00;
        bundle.putParcelable(MSV.A00(156), uri);
        bundle.putInt(MSV.A00(157), C3OO.FLAG_MOVED);
        bundle.putInt(MSV.A00(727), 200);
        bundle.putInt("mediaSource", this.A00);
        EnumC69983Ch enumC69983Ch = this.A02;
        bundle.putSerializable("captureType", enumC69983Ch);
        ClassLoader classLoader = MediaCaptureConfig.class.getClassLoader();
        if (classLoader != null) {
            C52912bY.A00(bundle, classLoader);
            bundle.putParcelable(MSV.A00(1016), new MediaCaptureConfig(new C43846JaA(enumC69983Ch)));
            C14H.A03.A00();
            Intent intent = new Intent(context, (Class<?>) MediaCaptureActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("autoCenterCrop", z);
            intent.putExtra("sourceMediaId", str);
            intent.putExtra("cameraEntryPoint", c22p);
            intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", this.A04.token);
            intent.putExtra(MSV.A00(579), str2);
            intent.putExtra("content_url", str3);
            if (str5 != null) {
                intent.putExtra("linked_highlight_id", str5);
            }
            if (list != null) {
                intent.putStringArrayListExtra(MSV.A00(1230), new ArrayList<>(list));
            }
            if (str6 != null) {
                intent.putExtra("media_info", str6);
            }
            if (c5l6 != null) {
                intent.putExtra(MSV.A00(1492), c5l6);
            }
            if (str4 != null) {
                intent.putExtra(AbstractC43591JPw.A00(292), str4);
            }
            this.A05.EnX(intent, i2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x006b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // X.InterfaceC69973Cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r20, int r21, android.content.Intent r22) {
        /*
            r19 = this;
            r17 = 0
            r0 = 9
            r2 = r20
            r1 = r21
            if (r2 == r0) goto Le
            r0 = 10001(0x2711, float:1.4014E-41)
            if (r2 != r0) goto L42
        Le:
            r0 = 2
            if (r1 != r0) goto L42
            X.2dB r1 = X.AbstractC54852fj.A00()
            boolean r0 = r1 instanceof X.InterfaceC53742dD
            if (r0 == 0) goto L41
            X.2dD r1 = (X.InterfaceC53742dD) r1
            r0 = 1
            X.AbstractC72153Lo.A00 = r0
            X.1QO r0 = X.C1QO.A0C
            r1.EfJ(r0)
            r3 = 0
            r0 = 5234(0x1472, float:7.334E-42)
            java.lang.String r6 = X.AbstractC111324zv.A00(r0)
            r16 = 0
            com.instagram.ui.swipenavigation.PositionConfig r2 = new com.instagram.ui.swipenavigation.PositionConfig
            r4 = r3
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r15 = r3
            r18 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1.FBp(r2)
        L41:
            return
        L42:
            r0 = -1
            r13 = r19
            if (r1 == r0) goto L69
            r13.A01()
            X.6WI r4 = X.C6WI.A01()
            com.instagram.common.session.UserSession r3 = r13.A04
            boolean r0 = r4.A0M
            java.lang.String r1 = "exit"
            if (r0 == 0) goto L61
            r4.A05(r3, r1)
        L59:
            X.3Ca r1 = r13.A05
            int r0 = r13.A00
            r1.Cv3(r2, r0)
            return
        L61:
            boolean r0 = r4.A0L
            if (r0 == 0) goto L59
            r4.A04(r3, r1)
            goto L59
        L69:
            r3 = r22
            switch(r20) {
                case 10001: goto L88;
                case 10002: goto L9a;
                case 10003: goto L6e;
                case 10004: goto L88;
                case 10005: goto L76;
                default: goto L6e;
            }
        L6e:
            X.3Ca r1 = r13.A05
            int r0 = r13.A00
            r1.Cv4(r2, r0)
            return
        L76:
            X.2dB r1 = X.AbstractC54852fj.A00()
            boolean r0 = r1 instanceof X.InterfaceC53742dD
            if (r0 == 0) goto L88
            X.2dD r1 = (X.InterfaceC53742dD) r1
            r0 = 1
            X.AbstractC72153Lo.A00 = r0
            X.1QO r0 = X.C1QO.A0E
            r1.EfJ(r0)
        L88:
            int r1 = r13.A00
            if (r1 == 0) goto L8f
            r0 = 2
            if (r1 != r0) goto L92
        L8f:
            r13.A01()
        L92:
            if (r22 == 0) goto L6e
            X.3Ca r0 = r13.A05
            r0.CKE(r3)
            goto L6e
        L9a:
            java.lang.String r1 = "Required value was null."
            if (r22 == 0) goto Lb9
            java.io.File r0 = r13.A01
            if (r0 == 0) goto Lb3
            android.net.Uri r14 = X.LJR.A01(r3, r0)
            X.C14360o3.A07(r14)
            X.22P r15 = X.C22P.A5N
            r18 = 10001(0x2711, float:1.4014E-41)
            r16 = 0
            r13.EnC(r14, r15, r16, r17, r18)
            goto L6e
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lb9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69963Cf.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.InterfaceC69973Cg
    public final void onSaveInstanceState(Bundle bundle) {
        File file = this.A01;
        if (file != null) {
            bundle.putString("tempPhotoFile", file.toString());
        }
        bundle.putInt("captureType", this.A02.ordinal());
        bundle.putInt("mediaSource", this.A00);
    }

    public C69963Cf(Context context, UserSession userSession, InterfaceC69913Ca interfaceC69913Ca) {
        this.A03 = context;
        this.A05 = interfaceC69913Ca;
        this.A04 = userSession;
    }

    public static final C22P A00(EnumC33447EqK enumC33447EqK, C69963Cf c69963Cf) {
        switch (enumC33447EqK.ordinal()) {
            case 4:
                return C22P.A2d;
            case 5:
                return C22P.A2i;
            case 6:
                return C22P.A2h;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
            case 17:
            case 21:
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 30:
            default:
                return C22P.A5N;
            case 14:
                if (c69963Cf.A02 == EnumC69983Ch.A05) {
                    return C22P.A37;
                }
                return C22P.A43;
            case 16:
                return C22P.A3x;
            case 18:
                return C22P.A2n;
            case Process.SIGSTOP /* 19 */:
                return C22P.A4I;
            case 20:
                return C22P.A0h;
            case 23:
                return C22P.A4P;
            case 24:
                return C22P.A4M;
            case 25:
                return C22P.A4O;
            case 26:
                return C22P.A4N;
            case 27:
                return C22P.A4Q;
            case 28:
                return C22P.A4R;
            case 31:
                return C22P.A3I;
        }
    }
}
