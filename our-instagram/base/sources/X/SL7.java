package X;

import com.facebook.systrace.SystraceMessage;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class SL7 {
    public final SB8 A00;
    public final HashMap A01 = new HashMap(64);

    public final synchronized C72756XmX A00(String str) {
        C72756XmX c72756XmX;
        String[] list;
        HashMap hashMap = this.A01;
        c72756XmX = (C72756XmX) hashMap.get(str);
        if (c72756XmX == null) {
            try {
                SB8 sb8 = this.A00;
                InterfaceC09730eq interfaceC09730eq = SystraceMessage.A00;
                AbstractC09720ep A00 = SystraceMessage.A00(interfaceC09730eq, "MetadataDeserializer.readEntireNamespace", 4L);
                A00.A00(str, "firstTypeClassName");
                A00.A02();
                try {
                    String parent = AbstractC166987dD.A11(str.replace(".", "/")).getParent();
                    if (parent == null) {
                        list = new String[0];
                    } else {
                        list = sb8.A00.list(parent);
                    }
                    for (String str2 : list) {
                        if (str2.endsWith(".meta")) {
                            AbstractC09720ep A002 = SystraceMessage.A00(interfaceC09730eq, "MetadataDeserializer.parse", 4L);
                            A002.A00(str2, "structGroup");
                            A002.A02();
                            try {
                                THR thr = new THR(new DataInputStream(sb8.A00.open(AnonymousClass001.A0g(parent, "/", str2))), hashMap);
                                try {
                                    DataInputStream dataInputStream = thr.A02;
                                    thr.A00 = dataInputStream.readBoolean();
                                    int readShort = dataInputStream.readShort();
                                    thr.A01 = new String[readShort];
                                    for (int i = 0; i < readShort; i++) {
                                        thr.A01[i] = dataInputStream.readUTF();
                                    }
                                    short readShort2 = dataInputStream.readShort();
                                    for (int i2 = 0; i2 < readShort2; i2++) {
                                        int readShort3 = dataInputStream.readShort();
                                        C72755XmW[] c72755XmWArr = new C72755XmW[readShort3];
                                        for (int i3 = 0; i3 < readShort3; i3++) {
                                            short readShort4 = dataInputStream.readShort();
                                            String str3 = null;
                                            if (thr.A00) {
                                                str3 = dataInputStream.readUTF();
                                            }
                                            c72755XmWArr[i3] = new C72755XmW(THR.A00(thr), str3, readShort4);
                                        }
                                        thr.A03.put(thr.A01[i2], new C72756XmX(c72755XmWArr));
                                    }
                                    thr.close();
                                    C0fY.A00(4L, -916237450);
                                } catch (Throwable th) {
                                    try {
                                        thr.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                C0fY.A00(4L, 706125580);
                                throw th3;
                            }
                        }
                    }
                    C0fY.A00(4L, -586043676);
                    c72756XmX = (C72756XmX) hashMap.get(str);
                    if (c72756XmX == null) {
                        throw MSY.A0d("No type found for ", str);
                    }
                } catch (Throwable th4) {
                    C0fY.A00(4L, 912372005);
                    throw th4;
                }
            } catch (IOException e) {
                throw AbstractC58318PtA.A0e(AnonymousClass001.A0R("Failed to find ", str), e);
            }
        }
        return c72756XmX;
    }

    public SL7(SB8 sb8) {
        this.A00 = sb8;
    }
}
