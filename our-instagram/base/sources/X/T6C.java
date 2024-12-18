package X;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T6C implements InterfaceC65415Tjm {
    public InterfaceC65438TkA A00;
    public final AbstractC61401Rn0 A01;
    public final InterfaceC65438TkA A02;

    @Override // X.InterfaceC65415Tjm
    public final void FFh(SEX sex) {
        InterfaceC65438TkA interfaceC65438TkA;
        byte[] byteArray;
        C64417TDb c64417TDb;
        Class<?> cls;
        InterfaceC65435Tk7 interfaceC65435Tk7;
        int i = ((RNF) this.A01).A00;
        if (i == 0) {
            interfaceC65438TkA = this.A00;
            if (interfaceC65438TkA == null) {
                return;
            }
        } else {
            interfaceC65438TkA = this.A02;
        }
        InterfaceC65394TjR interfaceC65394TjR = (InterfaceC65394TjR) interfaceC65438TkA.get();
        SJQ sjq = sex.A00;
        boolean z = true;
        if (1 != (i ^ 1)) {
            z = false;
        }
        sjq.A03 = Boolean.valueOf(z);
        sjq.A01 = false;
        SGT sgt = sex.A01;
        sgt.A02 = new SJR(sjq);
        try {
            C62846STt.A00();
            if (i == 0) {
                SGU sgu = new SGU(sgt);
                C64434TDs c64434TDs = new C64434TDs();
                C64429TDn.A00.AJ7(c64434TDs);
                c64434TDs.A01 = true;
                C62651SKk c62651SKk = new C62651SKk(c64434TDs);
                StringWriter stringWriter = new StringWriter();
                try {
                    c62651SKk.A00(stringWriter, sgu);
                } catch (IOException unused) {
                }
                byteArray = stringWriter.toString().getBytes("utf-8");
            } else {
                SGU sgu2 = new SGU(sgt);
                C64431TDp c64431TDp = new C64431TDp();
                C64429TDn.A00.AJ7(c64431TDp);
                HashMap A10 = AbstractC58318PtA.A10(c64431TDp.A01);
                HashMap A102 = AbstractC58318PtA.A10(c64431TDp.A02);
                InterfaceC65668Tqy interfaceC65668Tqy = c64431TDp.A00;
                ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                try {
                    c64417TDb = new C64417TDb(interfaceC65668Tqy, A0U, A10, A102);
                    Map map = c64417TDb.A02;
                    cls = sgu2.getClass();
                    interfaceC65435Tk7 = (InterfaceC65435Tk7) map.get(cls);
                } catch (IOException unused2) {
                }
                if (interfaceC65435Tk7 != null) {
                    interfaceC65435Tk7.ARz(sgu2, c64417TDb);
                    byteArray = A0U.toByteArray();
                } else {
                    String valueOf = String.valueOf(cls);
                    String.valueOf(valueOf);
                    throw new RuntimeException("No encoder for ".concat(String.valueOf(valueOf)));
                }
            }
            interfaceC65394TjR.EN0(new C60630REp(EnumC61103RfI.VERY_LOW, byteArray));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }

    public T6C(Context context, AbstractC61401Rn0 abstractC61401Rn0) {
        this.A01 = abstractC61401Rn0;
        T42 t42 = T42.A01;
        T43.A01(context);
        final T40 A02 = T43.A00().A02(t42);
        if (T42.A03.contains(new SOM("json"))) {
            this.A00 = new TE8(new InterfaceC65438TkA() { // from class: X.TDz
                @Override // X.InterfaceC65438TkA
                public final Object get() {
                    return InterfaceC65395TjS.this.CAn(new SOM("json"), C64206T3v.A00, byte[].class, "FIREBASE_ML_SDK");
                }
            });
        }
        this.A02 = new TE8(new InterfaceC65438TkA() { // from class: X.TE0
            @Override // X.InterfaceC65438TkA
            public final Object get() {
                return InterfaceC65395TjS.this.CAn(new SOM("proto"), C64207T3w.A00, byte[].class, "FIREBASE_ML_SDK");
            }
        });
    }
}
