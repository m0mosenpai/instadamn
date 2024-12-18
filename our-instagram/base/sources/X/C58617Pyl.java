package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Pyl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58617Pyl {
    public static final java.util.Set A00;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        r8 = X.C0fT.A00(r6, 1543809183);
        r15.setInteger("max-input-size", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r8.getName();
        X.C0fT.A07(r8, null, r15, r16, 0, -1934378656);
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r16 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r1 = new X.MYN(r8, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1.A03.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        X.C0w9.A06("decoder_init_error_details", X.AbstractC63080Sc2.A01(r8, r15), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        throw new X.C60982RdA(r8.getName(), r15.toString(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        throw new X.C60982RdA(r6, r15.toString(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        X.C0K8.A0O("MediaCodecFactory", "no decoder found %s, block list %s", r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ae, code lost:
    
        throw new java.lang.IllegalArgumentException("No decoder can be found");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.MYN A00(android.media.MediaFormat r15, android.view.Surface r16, com.instagram.common.session.UserSession r17, java.util.List r18) {
        /*
            r14 = this;
            r4 = 10
            java.util.ArrayList r3 = X.AbstractC166987dD.A1F(r18)
            r0 = 0
        L7:
            int r2 = r0 + 1
            if (r0 >= r4) goto Lc4
            r9 = 0
            java.lang.String r0 = "mime"
            r10 = r15
            java.lang.String r5 = r15.getString(r0)     // Catch: java.lang.Exception -> Laf
            int r7 = android.media.MediaCodecList.getCodecCount()     // Catch: java.lang.Exception -> Laf
            r1 = 0
        L18:
            if (r1 >= r7) goto L9c
            android.media.MediaCodecInfo r6 = android.media.MediaCodecList.getCodecInfoAt(r1)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r6.isEncoder()     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L4b
            java.lang.String[] r0 = r6.getSupportedTypes()     // Catch: java.lang.Exception -> Laf
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L4b
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Exception -> Laf
            java.util.Set r0 = X.C58617Pyl.A00     // Catch: java.lang.Exception -> Laf
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Exception -> Laf
            if (r0 == 0) goto L44
            java.lang.String r0 = "blacklisted_decoders_4.2"
            X.C0w9.A03(r0, r6)     // Catch: java.lang.Exception -> Laf
            goto L4b
        L44:
            boolean r0 = r3.contains(r6)     // Catch: java.lang.Exception -> Laf
            if (r0 != 0) goto L4b
            goto L4e
        L4b:
            int r1 = r1 + 1
            goto L18
        L4e:
            r12 = 0
            if (r6 == 0) goto L9c
            r0 = 1543809183(0x5c04a89f, float:1.4936039E17)
            android.media.MediaCodec r8 = X.C0fT.A00(r6, r0)     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            java.lang.String r0 = "max-input-size"
            r15.setInteger(r0, r12)     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            r8.getName()     // Catch: java.lang.RuntimeException -> L79 java.lang.Exception -> L91 java.lang.Exception -> Laf
            r13 = -1934378656(0xffffffff8cb3b960, float:-2.7690885E-31)
            r11 = r16
            X.C0fT.A07(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.RuntimeException -> L79 java.lang.Exception -> L91 java.lang.Exception -> Laf
            r0 = 0
            if (r16 == 0) goto L6c
            r0 = 1
        L6c:
            X.MYN r1 = new X.MYN     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            r5 = r17
            r1.<init>(r8, r5, r0)     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            android.media.MediaCodec r0 = r1.A03     // Catch: java.lang.Exception -> Laf
            r0.getName()     // Catch: java.lang.Exception -> Laf
            goto Lc3
        L79:
            r7 = move-exception
            java.lang.String r1 = X.AbstractC63080Sc2.A01(r8, r15)     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            java.lang.String r0 = "decoder_init_error_details"
            X.C0w9.A06(r0, r1, r7)     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            java.lang.String r5 = r8.getName()     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            java.lang.String r1 = r15.toString()     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            X.RdA r0 = new X.RdA     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            r0.<init>(r5, r1, r7)     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
            throw r0     // Catch: java.lang.Exception -> L91 java.lang.Exception -> Laf
        L91:
            r5 = move-exception
            java.lang.String r1 = r15.toString()     // Catch: java.lang.Exception -> Laf
            X.RdA r0 = new X.RdA     // Catch: java.lang.Exception -> Laf
            r0.<init>(r6, r1, r5)     // Catch: java.lang.Exception -> Laf
            throw r0     // Catch: java.lang.Exception -> Laf
        L9c:
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r3}     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "MediaCodecFactory"
            java.lang.String r0 = "no decoder found %s, block list %s"
            X.C0K8.A0O(r1, r0, r5)     // Catch: java.lang.Exception -> Laf
            java.lang.String r1 = "No decoder can be found"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> Laf
            r0.<init>(r1)     // Catch: java.lang.Exception -> Laf
            throw r0     // Catch: java.lang.Exception -> Laf
        Laf:
            r1 = move-exception
            boolean r0 = r1 instanceof X.C60982RdA
            if (r0 == 0) goto Lb9
            r0 = r1
            X.RdA r0 = (X.C60982RdA) r0
            java.lang.String r9 = r0.A00
        Lb9:
            if (r2 > r4) goto Lca
            if (r9 == 0) goto Lc0
            r3.add(r9)
        Lc0:
            r0 = r2
            goto L7
        Lc3:
            return r1
        Lc4:
            java.lang.String r0 = "Method either return a codec or throw an init exception"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
        Lca:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58617Pyl.A00(android.media.MediaFormat, android.view.Surface, com.instagram.common.session.UserSession, java.util.List):X.MYN");
    }

    public final MYN A01(MediaFormat mediaFormat, UserSession userSession) {
        Exception exc;
        Object obj;
        String str;
        String string = mediaFormat.getString("mime");
        string.getClass();
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        ArrayList A002 = S5N.A00(string);
        C14360o3.A0B(A002, 2);
        c006802i.markerStart(54460417);
        c006802i.markerAnnotate(54460417, "mime", string);
        c006802i.markerAnnotate(54460417, "format", mediaFormat.toString());
        c006802i.markerAnnotate(54460417, "codec_candidates", (String[]) AbstractC58576Pxu.A00(A002).A04());
        if (!string.equals("video/avc") && !string.equals("video/hevc")) {
            C0K8.A0O("MediaCodecFactory", "unsupported encoder mimetype %s", string);
            exc = new Exception(AnonymousClass001.A0R("Unsupported codec for ", string));
        } else {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = C0fT.A02(string, 1821076643);
                if (mediaFormat.containsKey("profile") && mediaFormat.getInteger("profile") == 8) {
                    String string2 = mediaFormat.getString("mime");
                    try {
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodec.getCodecInfo().getCapabilitiesForType(string2).profileLevels;
                        codecProfileLevelArr.getClass();
                        HashMap A1G = AbstractC166987dD.A1G();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                            if (AbstractC58319PtB.A0n(A1G, codecProfileLevel.profile) == null) {
                                A1G.put(Integer.valueOf(codecProfileLevel.profile), AbstractC166987dD.A1H());
                            }
                            Object A0n = AbstractC58319PtB.A0n(A1G, codecProfileLevel.profile);
                            A0n.getClass();
                            ((java.util.Set) A0n).add(Integer.valueOf(codecProfileLevel.level));
                        }
                        Integer valueOf = Integer.valueOf(mediaFormat.getInteger("profile"));
                        if (A1G.containsKey(valueOf)) {
                            if (mediaFormat.containsKey("level") && !AbstractC58319PtB.A1W((java.util.Set) A1G.get(valueOf), mediaFormat.getInteger("level"))) {
                                obj = A1G.get(valueOf);
                            }
                        } else if (A1G.containsKey(2)) {
                            mediaFormat.setInteger("profile", 2);
                            obj = A1G.get(2);
                        }
                        mediaFormat.setInteger("level", AbstractC58318PtA.A07(((java.util.Set) obj).iterator().next()));
                    } catch (IllegalStateException e) {
                        C0w9.A06("check_and_adjust_output_format_error", StringFormatUtil.formatStrLocaleSafe("Failed to get profile levels. media codec:%s mimeType:%s outputFormat:%s", mediaCodec.getName(), string2, mediaFormat), e);
                    }
                }
                try {
                    mediaCodec.getName();
                    C0fT.A07(mediaCodec, null, mediaFormat, null, 1, -879956188);
                    MYN myn = new MYN(mediaCodec, userSession, false);
                    String name = mediaCodec.getName();
                    C14360o3.A0B(name, 0);
                    c006802i.markerAnnotate(54460417, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, name);
                    c006802i.markerEnd(54460417, (short) 2);
                    return myn;
                } catch (RuntimeException e2) {
                    C0w9.A06("encoder_init_error_details", AbstractC63080Sc2.A01(mediaCodec, mediaFormat), e2);
                    if (e2 instanceof MediaCodec.CodecException) {
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) e2;
                        C0w9.A06("encoder_codec_exception_details", AbstractC63080Sc2.A00(codecException), e2);
                        C14360o3.A0B(codecException, 0);
                        int errorCode = codecException.getErrorCode();
                        if (errorCode != Integer.MIN_VALUE && errorCode != -2147479551 && errorCode != -2147479543 && errorCode != -1622321339 && errorCode != -5001 && errorCode != -1021) {
                            if (errorCode != -1010) {
                                if (errorCode != -32 && errorCode != -12) {
                                    if (errorCode != 1100) {
                                        if (errorCode != 1101) {
                                            C0w9.A03("CodecExceptionUtil", AnonymousClass001.A0O("Uncategorized error with code:", codecException.getErrorCode()));
                                            if (!codecException.isRecoverable()) {
                                                if (codecException.isTransient()) {
                                                    throw new Rkd(codecException, "Codec cannot proceed, try again later.");
                                                }
                                                throw codecException;
                                            }
                                            throw new Rkd(codecException, "Codec cannot proceed, but can be fixed by stopping, configuring, and starting again");
                                        }
                                        throw new Rkd(codecException, "Resource manager reclaimed to media resource used by the codec. You must release the codec");
                                    }
                                    throw new Rkd(codecException, "This indicates required resource was not able to be allocated.");
                                }
                                throw new Rkd(codecException, "");
                            }
                            throw new Rkd(codecException, "ERROR_UNSUPPORTED - Configure was probably called with some unsupported parameters.");
                        }
                        throw new Rkd(codecException, "");
                    }
                    throw e2;
                }
            } catch (Throwable th) {
                String obj2 = mediaFormat.toString();
                if (mediaCodec != null) {
                    obj2 = AbstractC63080Sc2.A01(mediaCodec, mediaFormat);
                }
                String message = th.getMessage();
                if (th instanceof MediaCodec.CodecException) {
                    message = AbstractC63080Sc2.A00(th);
                }
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("codecInfo=%s, exceptionInfo=%s", obj2, message);
                exc = new Exception(formatStrLocaleSafe, th);
                C0w9.A01(EnumC12410kj.A03, "media_codec_factory_create_encoder", formatStrLocaleSafe);
                C0K8.A0O("MediaCodecFactory", "::createEncoder error. Debug information: %s", formatStrLocaleSafe, th);
                if (mediaCodec != null) {
                    c006802i.markerAnnotate(54460417, "details", AbstractC63080Sc2.A01(mediaCodec, mediaFormat));
                }
            }
        }
        String message2 = exc.getMessage();
        if (message2 == null) {
            message2 = "null_message";
        }
        c006802i.markerAnnotate(54460417, "error", message2);
        Throwable cause = exc.getCause();
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "null_cause";
        }
        c006802i.markerAnnotate(54460417, "cause", str);
        c006802i.markerEnd(54460417, (short) 3);
        throw exc;
    }

    static {
        HashSet A1H = AbstractC166987dD.A1H();
        A00 = A1H;
        A1H.add("OMX.ittiam.video.decoder.avc");
        A1H.add("OMX.Exynos.AVC.Decoder");
    }
}
