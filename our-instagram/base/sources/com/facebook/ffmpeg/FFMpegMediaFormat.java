package com.facebook.ffmpeg;

import X.AbstractC65702TsY;
import X.C64905TZf;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.AndroidVideoDecoder;

/* loaded from: classes11.dex */
public class FFMpegMediaFormat {
    public static final C64905TZf ALL_KEYS;
    public final Map mMap = new HashMap();

    /* JADX WARN: Type inference failed for: r0v28, types: [X.TZf, java.util.HashMap] */
    static {
        HashMap hashMap = new HashMap();
        hashMap.put("mime", String.class);
        hashMap.put("language", String.class);
        hashMap.put("sample-rate", Integer.class);
        hashMap.put("channel-count", Integer.class);
        hashMap.put(IgReactMediaPickerNativeModule.WIDTH, Integer.class);
        hashMap.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.class);
        hashMap.put("max-width", Integer.class);
        hashMap.put("max-height", Integer.class);
        hashMap.put("max-input-size", Integer.class);
        hashMap.put(TraceFieldType.Bitrate, Integer.class);
        hashMap.put("color-format", Integer.class);
        hashMap.put("frame-rate", Integer.class);
        hashMap.put("i-frame-interval", Integer.class);
        hashMap.put(AndroidVideoDecoder.MEDIA_FORMAT_KEY_STRIDE, Integer.class);
        hashMap.put(AndroidVideoDecoder.MEDIA_FORMAT_KEY_SLICE_HEIGHT, Integer.class);
        hashMap.put("repeat-previous-frame-after", Long.class);
        hashMap.put("push-blank-buffers-on-shutdown", Integer.class);
        hashMap.put("durationUs", Long.class);
        hashMap.put("is-adts", Integer.class);
        hashMap.put("channel-mask", Integer.class);
        hashMap.put("aac-profile", Integer.class);
        hashMap.put("flac-compression-level", Integer.class);
        hashMap.put("is-autoselect", Integer.class);
        hashMap.put("is-default", Integer.class);
        hashMap.put("is-forced-subtitle", Integer.class);
        hashMap.put("rotation", Integer.class);
        hashMap.put("csd-0", ByteBuffer.class);
        hashMap.put("csd-1", ByteBuffer.class);
        ALL_KEYS = new HashMap(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.facebook.ffmpeg.FFMpegMediaFormat toFFMpegMediaFormat(android.media.MediaFormat r12) {
        /*
            com.facebook.ffmpeg.FFMpegMediaFormat r9 = new com.facebook.ffmpeg.FFMpegMediaFormat
            r9.<init>()
            X.TZf r0 = com.facebook.ffmpeg.FFMpegMediaFormat.ALL_KEYS
            java.util.Iterator r11 = X.AbstractC166997dE.A14(r0)
        Lb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Ld4
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r6 = r0.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.getValue()
            boolean r0 = r12.containsKey(r6)
            if (r0 == 0) goto Lb
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 != r0) goto L33
            java.lang.String r0 = r12.getString(r6)     // Catch: java.lang.ClassCastException -> L63
            r9.setString(r6, r0)     // Catch: java.lang.ClassCastException -> L63
            goto Lb
        L33:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L3f
            int r0 = r12.getInteger(r6)     // Catch: java.lang.ClassCastException -> L63
            r9.setInteger(r6, r0)     // Catch: java.lang.ClassCastException -> L63
            goto Lb
        L3f:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r5 != r0) goto L4b
            long r0 = r12.getLong(r6)     // Catch: java.lang.ClassCastException -> L63
            r9.setLong(r6, r0)     // Catch: java.lang.ClassCastException -> L63
            goto Lb
        L4b:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r5 != r0) goto L57
            float r0 = r12.getFloat(r6)     // Catch: java.lang.ClassCastException -> L63
            r9.setFloat(r6, r0)     // Catch: java.lang.ClassCastException -> L63
            goto Lb
        L57:
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            if (r5 != r0) goto Lb
            java.nio.ByteBuffer r0 = r12.getByteBuffer(r6)     // Catch: java.lang.ClassCastException -> L63
            r9.setByteBuffer(r6, r0)     // Catch: java.lang.ClassCastException -> L63
            goto Lb
        L63:
            r10 = move-exception
            r4 = 0
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L74
            float r1 = r12.getFloat(r6)     // Catch: java.lang.ClassCastException -> L74
            java.lang.Float r3 = java.lang.Float.valueOf(r1)     // Catch: java.lang.ClassCastException -> L74
            if (r3 == 0) goto L75
            goto L93
        L74:
            r3 = r4
        L75:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto La4
            long r0 = r12.getLong(r6)     // Catch: java.lang.ClassCastException -> L81
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.ClassCastException -> L81
        L81:
            if (r4 == 0) goto La4
            long r7 = r4.longValue()
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto La4
            int r0 = r4.intValue()
            goto L9f
        L93:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 % r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L75
            int r0 = r3.intValue()
        L9f:
            r9.setInteger(r6, r0)
            goto Lb
        La4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r10.getMessage()
            r1.append(r0)
            java.lang.String r0 = " : name="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ",type="
            r1.append(r0)
            X.AbstractC58318PtA.A1V(r1, r5)
            java.lang.String r0 = ",possibleFloatValue="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ",possibleLongValue="
            java.lang.String r1 = X.AbstractC167017dG.A0n(r4, r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        Ld4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegMediaFormat.toFFMpegMediaFormat(android.media.MediaFormat):com.facebook.ffmpeg.FFMpegMediaFormat");
    }

    public final boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public final ByteBuffer getByteBuffer(String str) {
        return (ByteBuffer) this.mMap.get(str);
    }

    public final float getFloat(String str) {
        return ((Number) this.mMap.get(str)).floatValue();
    }

    public final int getInteger(String str) {
        return AbstractC65702TsY.A0E(str, this.mMap);
    }

    public final long getLong(String str) {
        return ((Number) this.mMap.get(str)).longValue();
    }

    public final String getString(String str) {
        return (String) this.mMap.get(str);
    }

    public final void setByteBuffer(String str, ByteBuffer byteBuffer) {
        this.mMap.put(str, byteBuffer);
    }

    public final void setFloat(String str, float f) {
        this.mMap.put(str, new Float(f));
    }

    public final void setInteger(String str, int i) {
        this.mMap.put(str, new Integer(i));
    }

    public final void setLong(String str, long j) {
        this.mMap.put(str, new Long(j));
    }

    public final void setString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public String toString() {
        return this.mMap.toString();
    }

    public final int getInteger(String str, int i) {
        try {
            return AbstractC65702TsY.A0E(str, this.mMap);
        } catch (ClassCastException | NullPointerException unused) {
            return i;
        }
    }

    public final long getLong(String str, long j) {
        try {
            return getLong(str);
        } catch (ClassCastException | NullPointerException unused) {
            return j;
        }
    }
}
