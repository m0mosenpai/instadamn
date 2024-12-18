package X;

import android.content.res.AssetManager;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: X.5KQ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5KQ {
    public static byte[] A02(AssetManager assetManager, String str) {
        byte[] bArr;
        try {
            InputStream open = assetManager.open(str, 3);
            if (open != null) {
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int read = open.read(bArr2, 0, 1024);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                            bArr = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        C0K8.A0J("FileParsingUtils", "getFileContentAsByte: failed due to exception: ", e);
                        bArr = null;
                    }
                    open.close();
                    return bArr;
                } finally {
                }
            }
            return null;
        } catch (IOException e2) {
            C0K8.A0Q("FileParsingUtils", "getFileContentAsByteFromAssets: failed to get file %s, due to exception: ", str, e2);
            return null;
        }
    }

    public static int[] A03(ReadableByteChannel readableByteChannel, int i) {
        if (i <= 0) {
            C0K8.A0Q("FileParsingUtils", "loadParamsArrayFromChannel: received unexpected param size: %d", Integer.valueOf(i));
            return new int[0];
        }
        int[] iArr = new int[i];
        int i2 = i * 4;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            if (readableByteChannel.read(allocateDirect) != i2) {
                C0K8.A0Q("FileParsingUtils", "populateTranslationTableNewToNew: Failed loading params_map v4 file, didn't read expected param size: %d", Integer.valueOf(i / 2));
            }
            allocateDirect.flip();
            allocateDirect.asIntBuffer().get(iArr);
            return iArr;
        } catch (IOException e) {
            C0K8.A0K("FileParsingUtils", "buildTranslationTable load into array failed", e);
            return iArr;
        }
    }

    public static C5KR A00(ReadableByteChannel readableByteChannel) {
        String str;
        ByteBuffer allocate;
        String str2;
        Object[] objArr;
        String A0O;
        C5KR c5kr = new C5KR();
        try {
            allocate = ByteBuffer.allocate(2);
        } catch (IOException e) {
            e = e;
            str = "getHeaderInfoFromParamsMapFile: IOException";
            C0K8.A0K("FileParsingUtils", str, e);
            return c5kr;
        } catch (NumberFormatException e2) {
            e = e2;
            str = "getHeaderInfoFromParamsMapFile: NumberFormatException while getting content from v2";
            C0K8.A0K("FileParsingUtils", str, e);
            return c5kr;
        }
        if (readableByteChannel.read(allocate) == 2) {
            allocate.flip();
            CharBuffer decode = Charset.forName("US-ASCII").decode(allocate);
            if (decode == null) {
                C0K8.A0E("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first two byte");
                return c5kr;
            }
            String obj = decode.toString();
            if (obj != null) {
                if (obj.equals("v2")) {
                    ByteBuffer allocate2 = ByteBuffer.allocate(128);
                    if (readableByteChannel.read(allocate2) < 0) {
                        C0K8.A0E("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first line");
                        return c5kr;
                    }
                    allocate2.flip();
                    String[] split = Charset.forName("US-ASCII").decode(allocate2).toString().split("\\r?\\n");
                    int length = split.length;
                    if (length != 0) {
                        String[] split2 = split[0].split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                        int length2 = split2.length;
                        if (length2 >= 2) {
                            c5kr.A01 = split2[1];
                        }
                        if (length2 >= 3) {
                            Integer.parseInt(split2[2]);
                        }
                        if (length >= 2) {
                            String str3 = split[1];
                            if (str3.length() >= 2) {
                                String[] split3 = str3.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                                String str4 = split3[0];
                                if (str4.length() < 2) {
                                    str2 = "getHeaderInfoFromParamsMapFile: Second line had unexpected format: %s";
                                    objArr = new Object[]{split[2]};
                                } else {
                                    if (str4.charAt(0) == '*') {
                                        Character.isLetter(split3[0].charAt(1));
                                        return c5kr;
                                    }
                                    str2 = "getHeaderInfoFromParamsMapFile: Second line didn't start with a config: %s";
                                    objArr = new Object[]{split[2]};
                                }
                            }
                        }
                        str2 = "getHeaderInfoFromParamsMapFile: Failed when reading second line - %s";
                        if (length < 2) {
                            A0O = "Only one line read";
                        } else {
                            A0O = AnonymousClass001.A0O("Line too short - ", split[1].length());
                        }
                        objArr = new Object[]{A0O};
                    }
                    return c5kr;
                }
                if (!obj.equals("v4")) {
                    C0K8.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: failed to get header version");
                    return c5kr;
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(28);
                allocate3.order(ByteOrder.LITTLE_ENDIAN);
                if (readableByteChannel.read(allocate3) != 28) {
                    C0K8.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: failed to get header required info");
                    return c5kr;
                }
                allocate3.flip();
                short s = allocate3.getShort();
                if (allocate3.getShort() != Short.MAX_VALUE) {
                    C0K8.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: magic mismatch");
                    return c5kr;
                }
                allocate3.getShort();
                c5kr.A00 = allocate3.getShort() & 65535;
                allocate3.getShort();
                allocate3.getShort();
                allocate3.getShort();
                allocate3.getShort();
                allocate3.position(24);
                allocate3.getShort();
                allocate3.position(26);
                short s2 = allocate3.getShort();
                ByteBuffer allocate4 = ByteBuffer.allocate(s2);
                int i = s2 + 30;
                if (s != i) {
                    str2 = "getSchemaHashFromMclistFile: header size doesn't match, in file: %d, read: %d";
                    objArr = new Object[]{Integer.valueOf(s), Integer.valueOf(i)};
                } else {
                    if (readableByteChannel.read(allocate4) != s2) {
                        C0K8.A0E("FileParsingUtils", "getSchemaHashFromMclistFile: failed to read hash");
                        return c5kr;
                    }
                    allocate4.flip();
                    c5kr.A01 = Charset.forName("US-ASCII").decode(allocate4).toString();
                    return c5kr;
                }
                C0K8.A0Q("FileParsingUtils", str2, objArr);
                return c5kr;
            }
        }
        C0K8.A0E("FileParsingUtils", "getHeaderInfoFromParamsMapFile: failed to get first two chars");
        return c5kr;
    }

    public static String A01(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(StandardCharsets.UTF_8.name())));
            while (true) {
                try {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        break;
                    }
                    sb.append((char) read);
                } finally {
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            C0K8.A0M("FileParsingUtils", "getFileContentAsString: failed. File does not exist: %s ", e, inputStream);
        } catch (IOException e2) {
            C0K8.A0J("FileParsingUtils", "getFileContentAsString: failed due to exception: ", e2);
        }
        return sb.toString();
    }
}
