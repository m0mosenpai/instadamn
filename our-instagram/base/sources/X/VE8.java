package X;

/* loaded from: classes11.dex */
public enum VE8 {
    CODEC_VIDEO_VP8("video/x-vnd.on2.vp8"),
    CODEC_VIDEO_VP9("video/x-vnd.on2.vp9"),
    CODEC_VIDEO_H264("video/avc"),
    CODEC_VIDEO_HEVC("video/hevc"),
    CODEC_VIDEO_AV1("video/av01"),
    CODEC_VIDEO_MPEG4("video/mp4v-es"),
    CODEC_VIDEO_H263("video/3gpp"),
    CODEC_AUDIO_AMR_NB("audio/3gpp"),
    CODEC_AUDIO_AMR_WB("audio/amr-wb"),
    CODEC_AUDIO_MP3("audio/mpeg"),
    CODEC_AUDIO_AAC("audio/mp4a"),
    CODEC_ANDROID_AUDIO_AAC("audio/mp4a-latm"),
    CODEC_AUDIO_VORBIS("audio/vorbis"),
    CODEC_FFMPEG_VIDEO_MPEG4("video/mp4"),
    /* JADX INFO: Fake field, exist only in values array */
    CODEC_AUDIO_RAW("audio/raw");

    public final String A00;

    VE8(String str) {
        this.A00 = str;
    }
}
