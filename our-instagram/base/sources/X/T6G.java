package X;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T6G implements InterfaceC65417Tjo {
    public InterfaceC65438TkA A00;
    public final AbstractC61503Roe A01;
    public final InterfaceC65438TkA A02;

    @Override // X.InterfaceC65417Tjo
    public final void FFi(SGX sgx) {
        InterfaceC65438TkA interfaceC65438TkA;
        byte[] byteArray;
        C64418TDc c64418TDc;
        Class<?> cls;
        InterfaceC65435Tk7 interfaceC65435Tk7;
        EnumC61103RfI enumC61103RfI;
        int i = ((C60715RNv) this.A01).A00;
        if (i == 0) {
            interfaceC65438TkA = this.A00;
            if (interfaceC65438TkA == null) {
                return;
            }
        } else {
            interfaceC65438TkA = this.A02;
        }
        InterfaceC65394TjR interfaceC65394TjR = (InterfaceC65394TjR) interfaceC65438TkA.get();
        int i2 = sgx.A01;
        SJS sjs = sgx.A00;
        boolean z = true;
        if (1 != (i ^ 1)) {
            z = false;
        }
        sjs.A03 = Boolean.valueOf(z);
        sjs.A01 = false;
        SIT sit = sgx.A02;
        sit.A04 = new SJT(sjs);
        try {
            C62847STu.A00();
            if (i == 0) {
                SIU siu = new SIU(sit);
                C64434TDs c64434TDs = new C64434TDs();
                C64430TDo.A00.AJ7(c64434TDs);
                c64434TDs.A01 = true;
                C62651SKk c62651SKk = new C62651SKk(c64434TDs);
                StringWriter stringWriter = new StringWriter();
                try {
                    c62651SKk.A00(stringWriter, siu);
                } catch (IOException unused) {
                }
                byteArray = stringWriter.toString().getBytes("utf-8");
            } else {
                SIU siu2 = new SIU(sit);
                C64432TDq c64432TDq = new C64432TDq();
                C64430TDo.A00.AJ7(c64432TDq);
                HashMap A10 = AbstractC58318PtA.A10(c64432TDq.A01);
                HashMap A102 = AbstractC58318PtA.A10(c64432TDq.A02);
                InterfaceC65668Tqy interfaceC65668Tqy = c64432TDq.A00;
                ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                try {
                    c64418TDc = new C64418TDc(interfaceC65668Tqy, A0U, A10, A102);
                    Map map = c64418TDc.A02;
                    cls = siu2.getClass();
                    interfaceC65435Tk7 = (InterfaceC65435Tk7) map.get(cls);
                } catch (IOException unused2) {
                }
                if (interfaceC65435Tk7 != null) {
                    interfaceC65435Tk7.ARz(siu2, c64418TDc);
                    byteArray = A0U.toByteArray();
                } else {
                    String valueOf = String.valueOf(cls);
                    String.valueOf(valueOf);
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(valueOf)));
                }
            }
            if (i2 != 0) {
                enumC61103RfI = EnumC61103RfI.DEFAULT;
            } else {
                enumC61103RfI = EnumC61103RfI.VERY_LOW;
            }
            interfaceC65394TjR.EN0(new C60630REp(enumC61103RfI, byteArray));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public T6G(Context context, AbstractC61503Roe abstractC61503Roe) {
        this.A01 = abstractC61503Roe;
        T42 t42 = T42.A01;
        T43.A01(context);
        final T40 A02 = T43.A00().A02(t42);
        if (T42.A03.contains(new SOM("json"))) {
            this.A00 = new TE8(new InterfaceC65438TkA() { // from class: X.TE1
                @Override // X.InterfaceC65438TkA
                public final Object get() {
                    return InterfaceC65395TjS.this.CAn(new SOM("json"), C64208T3x.A00, byte[].class, "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new TE8(new InterfaceC65438TkA() { // from class: X.TE2
            @Override // X.InterfaceC65438TkA
            public final Object get() {
                return InterfaceC65395TjS.this.CAn(new SOM("proto"), C64209T3y.A00, byte[].class, "FIREBASE_ML_SDK");
            }
        });
    }
}
