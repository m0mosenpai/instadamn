package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.realtimeclient.bugreport.RealtimeLogsProvider;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8Jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC185288Jt {
    public static final /* synthetic */ EnumEntries A08;
    public static final /* synthetic */ EnumC185288Jt[] A09;
    public static final EnumC185288Jt A0A;
    public static final EnumC185288Jt A0B;
    public static final EnumC185288Jt A0C;
    public static final EnumC185288Jt A0D;
    public static final EnumC185288Jt A0E;
    public static final EnumC185288Jt A0F;
    public static final EnumC185288Jt A0G;
    public static final EnumC185288Jt A0H;
    public MediaEffect A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final AudioFilterType A04;
    public final Float A05;
    public final Integer A06;
    public final String A07;

    static {
        AudioFilterType audioFilterType = AudioFilterType.A0A;
        Integer num = C05F.A00;
        EnumC185288Jt enumC185288Jt = new EnumC185288Jt(audioFilterType, null, num, "None", "", 1.0f, 0, 2131955581, R.drawable.instagram_circle_x_pano_outline_24);
        A0C = enumC185288Jt;
        EnumC185288Jt enumC185288Jt2 = new EnumC185288Jt(AudioFilterType.A08, Float.valueOf(1.3f), num, "Spedup", "", 1.3f, 1, 2131955832, R.drawable.instagram_audio_sped_up_pano_outline_24);
        A0F = enumC185288Jt2;
        EnumC185288Jt enumC185288Jt3 = new EnumC185288Jt(AudioFilterType.A07, Float.valueOf(0.75f), num, "Slowed", "", 0.75f, 2, 2131955831, R.drawable.instagram_audio_slowed_down_pano_outline_24);
        A0E = enumC185288Jt3;
        EnumC185288Jt enumC185288Jt4 = new EnumC185288Jt(AudioFilterType.A04, null, num, "Crunchy", "fba/effect_graphs/crunchy.json", 1.0f, 3, 2131955828, R.drawable.instagram_audio_crunchy_pano_outline_24);
        A0A = enumC185288Jt4;
        EnumC185288Jt enumC185288Jt5 = new EnumC185288Jt(AudioFilterType.A05, null, num, "Dreamy", "fba/effect_graphs/dreamy.json", 1.0f, 4, 2131955829, R.drawable.instagram_moon_pano_outline_24);
        A0B = enumC185288Jt5;
        EnumC185288Jt enumC185288Jt6 = new EnumC185288Jt(AudioFilterType.A06, null, num, "Radio", "fba/effect_graphs/radio.json", 1.0f, 5, 2131955830, R.drawable.instagram_audio_radio_pano_outline_24);
        A0D = enumC185288Jt6;
        AudioFilterType audioFilterType2 = AudioFilterType.A09;
        Integer num2 = C05F.A01;
        EnumC185288Jt enumC185288Jt7 = new EnumC185288Jt(audioFilterType2, null, num2, "Swirl", "cvat/engines/multifxprocessor/resources/json/psychedelic.json", 1.0f, 6, 2131955833, R.drawable.instagram_audio_swirl_pano_outline_24);
        A0G = enumC185288Jt7;
        EnumC185288Jt enumC185288Jt8 = new EnumC185288Jt(AudioFilterType.A0B, null, num2, "Vinyl", "cvat/engines/multifxprocessor/resources/json/vinyl.json", 1.0f, 7, 2131955834, R.drawable.instagram_audio_vinyl_pano_outline_24);
        A0H = enumC185288Jt8;
        EnumC185288Jt[] enumC185288JtArr = {enumC185288Jt, enumC185288Jt2, enumC185288Jt3, enumC185288Jt4, enumC185288Jt5, enumC185288Jt6, enumC185288Jt7, enumC185288Jt8};
        A09 = enumC185288JtArr;
        A08 = AbstractC12190kN.A00(enumC185288JtArr);
    }

    public static EnumC185288Jt valueOf(String str) {
        return (EnumC185288Jt) Enum.valueOf(EnumC185288Jt.class, str);
    }

    public static EnumC185288Jt[] values() {
        return (EnumC185288Jt[]) A09.clone();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.AbG] */
    public final MediaEffect A00(Context context) {
        C23501AbH A00;
        String A002;
        MediaEffect mediaEffect = this.A00;
        if (mediaEffect == null) {
            Integer num = this.A06;
            Integer num2 = C05F.A01;
            String str = this.A07;
            if (num == num2) {
                C14360o3.A0B(str, 1);
                A00 = null;
                try {
                    File createTempFile = File.createTempFile(AnonymousClass001.A0Q("ct-voice-effect-", System.currentTimeMillis()), RealtimeLogsProvider.LOG_SUFFIX);
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    try {
                        InputStream open = context.getAssets().open(str);
                        try {
                            C14360o3.A0A(open);
                            AbstractC54919OQu.A00(open, fileOutputStream);
                            if (open != null) {
                                open.close();
                            }
                            fileOutputStream.close();
                            String path = createTempFile.getPath();
                            C14360o3.A07(path);
                            ?? obj = new Object();
                            obj.A00 = path;
                            A00 = obj;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            C20I.A00(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (FileNotFoundException e) {
                    e = e;
                    A002 = AnonymousClass001.A0R("Unable to open temp file ", str);
                    AbstractC12120kG.A05("AudioEffectUtil_toCTVoiceEffect", A002, e);
                    C23501AbH c23501AbH = A00;
                    this.A00 = c23501AbH;
                    return c23501AbH;
                } catch (IOException e2) {
                    e = e2;
                    A002 = MSV.A00(168);
                    AbstractC12120kG.A05("AudioEffectUtil_toCTVoiceEffect", A002, e);
                    C23501AbH c23501AbH2 = A00;
                    this.A00 = c23501AbH2;
                    return c23501AbH2;
                }
            } else {
                A00 = AbstractC226929zo.A00(context, str);
            }
            C23501AbH c23501AbH22 = A00;
            this.A00 = c23501AbH22;
            return c23501AbH22;
        }
        return mediaEffect;
    }

    public EnumC185288Jt(AudioFilterType audioFilterType, Float f, Integer num, String str, String str2, float f2, int i, int i2, int i3) {
        this.A04 = audioFilterType;
        this.A07 = str2;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = f2;
        this.A05 = f;
        this.A06 = num;
    }
}
