package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53262Nh0 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53262Nh0[] A03;
    public static final EnumC53262Nh0 A04;
    public static final EnumC53262Nh0 A05;
    public static final EnumC53262Nh0 A06;
    public static final EnumC53262Nh0 A07;
    public static final EnumC53262Nh0 A08;
    public static final EnumC53262Nh0 A09;
    public static final EnumC53262Nh0 A0A;
    public static final EnumC53262Nh0 A0B;
    public static final EnumC53262Nh0 A0C;
    public static final EnumC53262Nh0 A0D;
    public static final EnumC53262Nh0 A0E;
    public static final EnumC53262Nh0 A0F;
    public static final EnumC53262Nh0 A0G;
    public static final EnumC53262Nh0 A0H;
    public static final EnumC53262Nh0 A0I;
    public OLG A00 = null;
    public final String A01;

    public EnumC53262Nh0(String str, String str2, int i) {
        this.A01 = str2;
    }

    static {
        EnumC53262Nh0 enumC53262Nh0 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusExtractingFrame", "extracting_frame_start", 0);
        A09 = enumC53262Nh0;
        EnumC53262Nh0 enumC53262Nh02 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusClientSegmenting", "client_segmentation_start", 1);
        A04 = enumC53262Nh02;
        EnumC53262Nh0 enumC53262Nh03 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusTranscoding", "transcoding_start", 2);
        A0F = enumC53262Nh03;
        EnumC53262Nh0 enumC53262Nh04 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusUploading", "upload_start", 3);
        A0H = enumC53262Nh04;
        EnumC53262Nh0 enumC53262Nh05 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusUploadingMask", "upload_mask_start", 4);
        A0I = enumC53262Nh05;
        EnumC53262Nh0 enumC53262Nh06 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusRequestingEdit", "upload_edit_start", 5);
        A0D = enumC53262Nh06;
        EnumC53262Nh0 enumC53262Nh07 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusEditStatusPolling", "polling_edit_status", 6);
        A08 = enumC53262Nh07;
        EnumC53262Nh0 enumC53262Nh08 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusPolling", "polling_start", 7);
        A0C = enumC53262Nh08;
        EnumC53262Nh0 enumC53262Nh09 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusDownloading", "downloading_start", 8);
        A07 = enumC53262Nh09;
        EnumC53262Nh0 enumC53262Nh010 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusFinished", "download_finish", 9);
        A0A = enumC53262Nh010;
        EnumC53262Nh0 enumC53262Nh011 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusRequestingSaveEdit", "save_edit_start", 10);
        A0E = enumC53262Nh011;
        EnumC53262Nh0 enumC53262Nh012 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusConfigureSticker", "configure_sticker_start", 11);
        A05 = enumC53262Nh012;
        EnumC53262Nh0 enumC53262Nh013 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusConfigureStickerFinished", "configure_sticker_finished", 12);
        A06 = enumC53262Nh013;
        EnumC53262Nh0 enumC53262Nh014 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusNotificationReceived", "notification_received", 13);
        A0B = enumC53262Nh014;
        EnumC53262Nh0 enumC53262Nh015 = new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusUploadFinish", "upload_finish", 14);
        A0G = enumC53262Nh015;
        EnumC53262Nh0[] enumC53262Nh0Arr = {enumC53262Nh0, enumC53262Nh02, enumC53262Nh03, enumC53262Nh04, enumC53262Nh05, enumC53262Nh06, enumC53262Nh07, enumC53262Nh08, enumC53262Nh09, enumC53262Nh010, enumC53262Nh011, enumC53262Nh012, enumC53262Nh013, enumC53262Nh014, enumC53262Nh015, new EnumC53262Nh0("IGMLSegmentAnythingVideoStatusRequestFinish", "upload_edit_finish", 15)};
        A03 = enumC53262Nh0Arr;
        A02 = AbstractC12190kN.A00(enumC53262Nh0Arr);
    }

    public static EnumC53262Nh0 valueOf(String str) {
        return (EnumC53262Nh0) Enum.valueOf(EnumC53262Nh0.class, str);
    }

    public static EnumC53262Nh0[] values() {
        return (EnumC53262Nh0[]) A03.clone();
    }
}
