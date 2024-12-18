package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.react.modules.intent.IntentModule;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TDd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64419TDd implements InterfaceC65523Tls {
    public static final C63200Sf3 A05;
    public static final C63200Sf3 A06;
    public static final InterfaceC65668Tqy A07;
    public static final Charset A08 = AbstractC58318PtA.A0u();
    public OutputStream A00;
    public final C64426TDk A01 = new C64426TDk(this);
    public final Map A02;
    public final InterfaceC65668Tqy A03;
    public final Map A04;

    @Override // X.InterfaceC65523Tls
    public final /* bridge */ /* synthetic */ InterfaceC65523Tls A7V(C63200Sf3 c63200Sf3, long j) {
        A04(c63200Sf3, j, true);
        return this;
    }

    @Override // X.InterfaceC65523Tls
    public final InterfaceC65523Tls A7W(C63200Sf3 c63200Sf3, Object obj) {
        A05(c63200Sf3, obj, true);
        return this;
    }

    public static int A00(C63200Sf3 c63200Sf3) {
        Protobuf protobuf = (Protobuf) C63200Sf3.A01(c63200Sf3, Protobuf.class);
        if (protobuf != null) {
            return ((C64435TDt) protobuf).A00;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    private void A01(int i) {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.A00;
            if (j != 0) {
                outputStream.write((i & StringTreeSet.MAX_SYMBOL_COUNT) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & StringTreeSet.MAX_SYMBOL_COUNT);
                return;
            }
        }
    }

    private void A02(C63200Sf3 c63200Sf3, InterfaceC65668Tqy interfaceC65668Tqy, Object obj, boolean z) {
        C61048ReK c61048ReK = new C61048ReK();
        try {
            OutputStream outputStream = this.A00;
            this.A00 = c61048ReK;
            try {
                interfaceC65668Tqy.ARz(obj, this);
                this.A00 = outputStream;
                long j = c61048ReK.A00;
                c61048ReK.close();
                if (z && j == 0) {
                    return;
                }
                A01((A00(c63200Sf3) << 3) | 2);
                while (true) {
                    long j2 = (-128) & j;
                    OutputStream outputStream2 = this.A00;
                    if (j2 != 0) {
                        j = AbstractC58320PtC.A08(outputStream2, j);
                    } else {
                        outputStream2.write(((int) j) & StringTreeSet.MAX_SYMBOL_COUNT);
                        interfaceC65668Tqy.ARz(obj, this);
                        return;
                    }
                }
            } catch (Throwable th) {
                this.A00 = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c61048ReK.close();
                throw th2;
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                throw th2;
            }
        }
    }

    public final void A03(C63200Sf3 c63200Sf3, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) C63200Sf3.A01(c63200Sf3, Protobuf.class);
        if (protobuf != null) {
            A01(((C64435TDt) protobuf).A00 << 3);
            A01(i);
            return;
        }
        throw new RuntimeException("Field has no @Protobuf config");
    }

    public final void A04(C63200Sf3 c63200Sf3, long j, boolean z) {
        if (z && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) C63200Sf3.A01(c63200Sf3, Protobuf.class);
        if (protobuf != null) {
            A01(((C64435TDt) protobuf).A00 << 3);
            while (true) {
                long j2 = (-128) & j;
                OutputStream outputStream = this.A00;
                if (j2 != 0) {
                    j = AbstractC58320PtC.A08(outputStream, j);
                } else {
                    outputStream.write(((int) j) & StringTreeSet.MAX_SYMBOL_COUNT);
                    return;
                }
            }
        } else {
            throw new RuntimeException("Field has no @Protobuf config");
        }
    }

    public final void A05(C63200Sf3 c63200Sf3, Object obj, boolean z) {
        int ordinal;
        byte[] bArr;
        OutputStream outputStream;
        ByteBuffer A17;
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (z && charSequence.length() == 0) {
                    return;
                }
                A01((A00(c63200Sf3) << 3) | 2);
                bArr = charSequence.toString().getBytes(A08);
            } else {
                if (obj instanceof Collection) {
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        A05(c63200Sf3, it.next(), false);
                    }
                    return;
                }
                if (obj instanceof Map) {
                    Iterator A15 = AbstractC166997dE.A15((Map) obj);
                    while (A15.hasNext()) {
                        A02(c63200Sf3, A07, A15.next(), false);
                    }
                    return;
                }
                if (obj instanceof Double) {
                    double A00 = MSW.A00(obj);
                    if (z && A00 == 0.0d) {
                        return;
                    }
                    A01((A00(c63200Sf3) << 3) | 1);
                    outputStream = this.A00;
                    A17 = AbstractC58320PtC.A17(8);
                    A17.putDouble(A00);
                } else if (obj instanceof Float) {
                    float A09 = AbstractC166987dD.A09(obj);
                    if (z && A09 == 0.0f) {
                        return;
                    }
                    A01((A00(c63200Sf3) << 3) | 5);
                    outputStream = this.A00;
                    A17 = AbstractC58320PtC.A17(4);
                    A17.putFloat(A09);
                } else {
                    if (obj instanceof Number) {
                        A04(c63200Sf3, AbstractC166987dD.A0N(obj), z);
                        return;
                    }
                    if (obj instanceof Boolean) {
                        A03(c63200Sf3, AbstractC166987dD.A1a(obj) ? 1 : 0, z);
                        return;
                    }
                    if (obj instanceof byte[]) {
                        bArr = (byte[]) obj;
                        if (z && bArr.length == 0) {
                            return;
                        } else {
                            A01((A00(c63200Sf3) << 3) | 2);
                        }
                    } else {
                        Map map = this.A02;
                        Class<?> cls = obj.getClass();
                        InterfaceC65668Tqy interfaceC65668Tqy = (InterfaceC65668Tqy) map.get(cls);
                        if (interfaceC65668Tqy == null) {
                            InterfaceC65435Tk7 interfaceC65435Tk7 = (InterfaceC65435Tk7) this.A04.get(cls);
                            if (interfaceC65435Tk7 != null) {
                                C64426TDk c64426TDk = this.A01;
                                c64426TDk.A01 = false;
                                c64426TDk.A00 = c63200Sf3;
                                c64426TDk.A02 = z;
                                interfaceC65435Tk7.ARz(obj, c64426TDk);
                                return;
                            }
                            if (obj instanceof InterfaceC65283ThG) {
                                ordinal = ((Rj4) ((InterfaceC65283ThG) obj)).A00;
                            } else if (obj instanceof Enum) {
                                ordinal = ((Enum) obj).ordinal();
                            } else {
                                interfaceC65668Tqy = this.A03;
                            }
                            A03(c63200Sf3, ordinal, true);
                            return;
                        }
                        A02(c63200Sf3, interfaceC65668Tqy, obj, z);
                        return;
                    }
                }
                outputStream.write(A17.array());
                return;
            }
            A01(bArr.length);
            this.A00.write(bArr);
        }
    }

    static {
        C63407Sjf A03 = C63407Sjf.A03("key");
        EnumC61088Rf2 enumC61088Rf2 = EnumC61088Rf2.DEFAULT;
        A05 = C63407Sjf.A0K(A03, enumC61088Rf2, 1);
        A06 = C63407Sjf.A0K(C63407Sjf.A03(IntentModule.EXTRA_MAP_KEY_FOR_VALUE), enumC61088Rf2, 2);
        A07 = new InterfaceC65668Tqy() { // from class: X.T9p
            @Override // X.InterfaceC65435Tk7
            public final void ARz(Object obj, Object obj2) {
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC65523Tls interfaceC65523Tls = (InterfaceC65523Tls) obj2;
                interfaceC65523Tls.A7W(C64419TDd.A05, entry.getKey());
                interfaceC65523Tls.A7W(C64419TDd.A06, entry.getValue());
            }
        };
    }

    public C64419TDd(InterfaceC65668Tqy interfaceC65668Tqy, OutputStream outputStream, Map map, Map map2) {
        this.A00 = outputStream;
        this.A02 = map;
        this.A04 = map2;
        this.A03 = interfaceC65668Tqy;
    }
}
