package X;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TDe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64420TDe implements InterfaceC65523Tls, InterfaceC65524Tlt {
    public final JsonWriter A00;
    public final boolean A01;
    public final InterfaceC65668Tqy A02;
    public final Map A03;
    public final Map A04;

    public final void A00(Object obj) {
        JsonWriter jsonWriter;
        JsonWriter jsonWriter2;
        int i = 0;
        if (obj != null) {
            if (obj instanceof Number) {
                this.A00.value((Number) obj);
                return;
            }
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        this.A00.value(Base64.encodeToString(bArr, 2));
                        return;
                    }
                } else {
                    jsonWriter2 = this.A00;
                    jsonWriter2.beginArray();
                    if (obj instanceof int[]) {
                        int length = ((int[]) obj).length;
                        while (i < length) {
                            jsonWriter2.value(r7[i]);
                            i++;
                        }
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        int length2 = jArr.length;
                        while (i < length2) {
                            jsonWriter2.value(jArr[i]);
                            i++;
                        }
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        int length3 = dArr.length;
                        while (i < length3) {
                            jsonWriter2.value(dArr[i]);
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        int length4 = zArr.length;
                        while (i < length4) {
                            jsonWriter2.value(zArr[i]);
                            i++;
                        }
                    } else if (obj instanceof Number[]) {
                        for (Number number : (Number[]) obj) {
                            A00(number);
                        }
                    } else {
                        for (Object obj2 : (Object[]) obj) {
                            A00(obj2);
                        }
                    }
                }
            } else if (obj instanceof Collection) {
                jsonWriter2 = this.A00;
                jsonWriter2.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    A00(it.next());
                }
            } else {
                if (obj instanceof Map) {
                    jsonWriter = this.A00;
                    jsonWriter.beginObject();
                    Iterator A15 = AbstractC166997dE.A15((Map) obj);
                    while (A15.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                        Object key = A1K.getKey();
                        try {
                            String str = (String) key;
                            Object value = A1K.getValue();
                            if (this.A01) {
                                if (value != null) {
                                    jsonWriter.name(str);
                                    A00(value);
                                }
                            } else {
                                jsonWriter.name(str);
                                if (value == null) {
                                    jsonWriter.nullValue();
                                } else {
                                    A00(value);
                                }
                            }
                        } catch (ClassCastException e) {
                            throw new RuntimeException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                        }
                    }
                } else {
                    InterfaceC65435Tk7 interfaceC65435Tk7 = (InterfaceC65435Tk7) this.A03.get(cls);
                    if (interfaceC65435Tk7 == null) {
                        InterfaceC65435Tk7 interfaceC65435Tk72 = (InterfaceC65435Tk7) this.A04.get(cls);
                        if (interfaceC65435Tk72 != null) {
                            interfaceC65435Tk72.ARz(obj, this);
                            return;
                        } else {
                            if (obj instanceof Enum) {
                                this.A00.value(((Enum) obj).name());
                                return;
                            }
                            interfaceC65435Tk7 = this.A02;
                        }
                    }
                    jsonWriter = this.A00;
                    jsonWriter.beginObject();
                    interfaceC65435Tk7.ARz(obj, this);
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter2.endArray();
            return;
        }
        this.A00.nullValue();
    }

    @Override // X.InterfaceC65523Tls
    public final InterfaceC65523Tls A7V(C63200Sf3 c63200Sf3, long j) {
        String str = c63200Sf3.A00;
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        jsonWriter.value(j);
        return this;
    }

    @Override // X.InterfaceC65523Tls
    public final InterfaceC65523Tls A7W(C63200Sf3 c63200Sf3, Object obj) {
        String str = c63200Sf3.A00;
        if (this.A01) {
            if (obj != null) {
                this.A00.name(str);
            }
            return this;
        }
        JsonWriter jsonWriter = this.A00;
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        A00(obj);
        return this;
    }

    @Override // X.InterfaceC65524Tlt
    public final /* bridge */ /* synthetic */ InterfaceC65524Tlt A7X(String str) {
        this.A00.value(str);
        return this;
    }

    @Override // X.InterfaceC65524Tlt
    public final /* bridge */ /* synthetic */ InterfaceC65524Tlt A7Y(boolean z) {
        this.A00.value(z);
        return this;
    }

    public C64420TDe(InterfaceC65668Tqy interfaceC65668Tqy, Writer writer, Map map, Map map2, boolean z) {
        this.A00 = new JsonWriter(writer);
        this.A03 = map;
        this.A04 = map2;
        this.A02 = interfaceC65668Tqy;
        this.A01 = z;
    }
}
