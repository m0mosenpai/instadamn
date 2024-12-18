package com.instagram.debug.devoptions.section.xme;

import X.AbstractC12190kN;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC43594JPz;
import X.AbstractC50633MWu;
import X.AbstractC59962oe;
import X.AnonymousClass001;
import X.B4Z;
import X.C05F;
import X.C0K8;
import X.C121275eQ;
import X.C12L;
import X.C14360o3;
import X.C1GJ;
import X.C2AH;
import X.C3LV;
import X.C3LW;
import X.C3LX;
import X.C60782q2;
import X.C9GR;
import X.MSW;
import X.MSY;
import X.OUQ;
import X.X9U;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.xme.L;
import com.instagram.debug.devoptions.section.xme.remotefiles.WearableMediaDownloadToolRemoteFiles;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class WearableMediaDownloadManager {
    public static final String COMMENT_FIELD_STELLA_VIDEO = "app=Meta View&device=Ray-Ban Stories&gid=6ba9ac5c-25bd-44a7-ba1c-0a00ff03ba02";
    public static final Companion Companion = new Object();
    public static final String MOCK_MEDIA_ID = "6ba9ac5c-25bd-44a7-ba1c-0a00ff03ba02";
    public static final String MODEL_FIELD_STELLA_PHOTO = "Ray-Ban Stories";
    public static final String TAG = "WearableMediaDownloadMediaSaver";
    public final Context context;
    public final String deviceNameSn;
    public final UserSession userSession;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes11.dex */
    public final class MediaType {
        public static final /* synthetic */ EnumEntries $ENTRIES;
        public static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType SN_PHOTO = new MediaType("SN_PHOTO", 0);
        public static final MediaType SN_VIDEO = new MediaType("SN_VIDEO", 1);
        public static final MediaType STELLA_PHOTO = new MediaType("STELLA_PHOTO", 2);
        public static final MediaType STELLA_VIDEO = new MediaType("STELLA_VIDEO", 3);

        public static final /* synthetic */ MediaType[] $values() {
            return new MediaType[]{SN_PHOTO, SN_VIDEO, STELLA_PHOTO, STELLA_VIDEO};
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        static {
            MediaType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC12190kN.A00($values);
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }

        public MediaType(String str, int i) {
        }
    }

    public static final String getCommentFieldSnVideo(String str) {
        return Companion.getCommentFieldSnVideo(str);
    }

    public final void downloadFile(MediaType mediaType, final boolean z) {
        C3LX c3lx;
        final String str;
        int A05 = AbstractC25227BEk.A05(mediaType, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    if (A05 == 3) {
                        c3lx = WearableMediaDownloadToolRemoteFiles.STELLA_VIDEO;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    c3lx = WearableMediaDownloadToolRemoteFiles.STELLA_PHOTO;
                }
            } else {
                c3lx = WearableMediaDownloadToolRemoteFiles.SN_VIDEO;
            }
        } else {
            c3lx = WearableMediaDownloadToolRemoteFiles.SN_PHOTO;
        }
        C3LV c3lv = ((C3LW) c3lx).A00;
        C14360o3.A07(c3lv);
        String str2 = c3lv.A02;
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 != 2) {
                    str = COMMENT_FIELD_STELLA_VIDEO;
                } else {
                    str = MODEL_FIELD_STELLA_PHOTO;
                }
            } else {
                str = Companion.getCommentFieldSnVideo(this.deviceNameSn);
            }
        } else {
            str = this.deviceNameSn;
        }
        C121275eQ A04 = AbstractC50633MWu.A04(this.context, this.userSession, new OUQ(str2, TAG, z, false, false), -1L, true);
        A04.A00 = new C2AH() { // from class: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$downloadFile$1
            @Override // X.C2AH
            public void onSuccess(File file) {
                C14360o3.A0B(file, 0);
                boolean z2 = z;
                WearableMediaDownloadManager wearableMediaDownloadManager = this;
                String str3 = str;
                if (z2) {
                    wearableMediaDownloadManager.writeExifCommentField(file, str3);
                } else {
                    wearableMediaDownloadManager.writeExifImageFields(file, str3);
                }
                AbstractC50633MWu.A09(this.context, file);
            }

            @Override // X.C2AH
            public void onFail(Exception exc) {
                C9GR.A03(this.context, "Failed to save media", "wearable_media_tool_download_failed", 0);
            }
        };
        C1GJ.A03(A04);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.PzK, java.lang.Object] */
    public final void writeExifCommentField(File file, String str) {
        AbstractC167017dG.A1N(file, str);
        try {
            ThreadPoolExecutor A02 = new Object().A02(C05F.A01, null);
            X9U x9u = new X9U() { // from class: com.instagram.debug.devoptions.section.xme.WearableMediaDownloadManager$writeExifCommentField$tempFileProvider$1
                @Override // X.X9U
                public final File createTempFile(String str2, String str3) {
                    C14360o3.A0B(str2, 0);
                    return File.createTempFile(str2, str3, WearableMediaDownloadManager.this.context.getCacheDir());
                }
            };
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            AbstractC166987dD.A1Z(new WearableMediaDownloadManager$writeExifCommentField$1(mediaMetadataRetriever, file, this, str, A02, x9u, null), AbstractC43594JPz.A13(C12L.A00, 480314591));
        } catch (Exception e) {
            C0K8.A0F(TAG, "Error saving video EXIF information", e);
        }
    }

    /* loaded from: classes11.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                MSY.A1I(MediaType.SN_PHOTO, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                MSY.A1J(MediaType.SN_VIDEO, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MSY.A1K(MediaType.STELLA_PHOTO, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MSY.A1L(MediaType.STELLA_VIDEO, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyFile(File file, File file2) {
        FileChannel channel = new FileInputStream(file).getChannel();
        FileChannel channel2 = MSW.A0x(file2).getChannel();
        try {
            channel.transferTo(0L, channel.size(), channel2);
            channel.close();
            if (channel2 != null) {
                channel2.close();
            }
        } catch (Throwable th) {
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
            throw th;
        }
    }

    private final String getFilePath(C3LX c3lx) {
        C3LV c3lv = ((C3LW) c3lx).A00;
        C14360o3.A07(c3lv);
        return c3lv.A02;
    }

    public WearableMediaDownloadManager(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.userSession = userSession;
        this.context = abstractC59962oe.requireContext();
        this.deviceNameSn = L.ig_rbs_hammerhead_attribution.external_device_name.getAndExpose(userSession);
    }

    public final void writeExifImageFields(File file, String str) {
        AbstractC167017dG.A1N(file, str);
        try {
            boolean z = C60782q2.A0N;
            C60782q2 c60782q2 = new C60782q2(file.getCanonicalPath());
            c60782q2.A0P("Model", str);
            c60782q2.A0P("ImageUniqueID", MOCK_MEDIA_ID);
            c60782q2.A0O();
        } catch (Exception e) {
            C0K8.A0F(TAG, "Error saving image EXIF information", e);
        }
    }

    /* loaded from: classes9.dex */
    public final class Companion {
        public final String getCommentFieldSnVideo(String str) {
            C14360o3.A0B(str, 0);
            return AnonymousClass001.A0g("app=Meta View&device=", str, "&gid=6ba9ac5c-25bd-44a7-ba1c-0a00ff03ba02");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
