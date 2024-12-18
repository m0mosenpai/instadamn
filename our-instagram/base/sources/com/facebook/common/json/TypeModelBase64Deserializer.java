package com.facebook.common.json;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC61762RtH;
import X.AbstractC63327Shb;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C18C;
import X.C63117SdL;
import X.SQr;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes10.dex */
public class TypeModelBase64Deserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        int position;
        try {
            String A1Q = c16l.A1Q();
            if (A1Q == null) {
                return null;
            }
            if (A1Q.startsWith("fltb:")) {
                String replaceFirst = A1Q.replaceFirst("fltb:", "");
                int A00 = AbstractC61762RtH.A00(replaceFirst);
                if (replaceFirst != null && replaceFirst.startsWith("type_tag:")) {
                    replaceFirst = replaceFirst.substring(18);
                }
                try {
                    this.A00.getDeclaredConstructor(Integer.TYPE, int[].class).newInstance(Integer.valueOf(A00), null);
                    ByteBuffer duplicate = ByteBuffer.wrap(Base64.decode(replaceFirst, 2)).duplicate();
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    duplicate.order(byteOrder);
                    try {
                        duplicate.order(byteOrder);
                        synchronized (duplicate) {
                            position = duplicate.position();
                        }
                        if (duplicate.getInt(position) + position <= 0) {
                            return null;
                        }
                        try {
                            throw AbstractC166987dD.A15("initFromMutableFlatBuffer");
                        } catch (IndexOutOfBoundsException e) {
                            throw new RuntimeException("", e);
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("", e2);
                    }
                } catch (Exception e3) {
                    throw AbstractC58318PtA.A0e("Can't create model object", e3);
                }
            }
            C18C.A0F(A1Q.startsWith("tree:"));
            String replaceFirst2 = A1Q.replaceFirst("tree:", "");
            int A002 = AbstractC61762RtH.A00(replaceFirst2);
            if (replaceFirst2 != null && replaceFirst2.startsWith("type_tag:")) {
                replaceFirst2 = replaceFirst2.substring(18);
            }
            return C63117SdL.A00().deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(replaceFirst2, 2)), this.A00, A002);
        } catch (Exception e4) {
            AbstractC63327Shb.A03(e4);
            SQr.A00(c16l, this.A00, e4);
            throw C00O.createAndThrow();
        }
    }
}
