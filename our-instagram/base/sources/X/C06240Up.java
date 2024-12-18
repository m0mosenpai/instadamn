package X;

import android.util.SparseArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06240Up implements InterfaceC06740Xq {
    public final SparseArray A00;
    public final C07410aF A01;
    public final IntBuffer A02;
    public final C07360aA A03;
    public final InterfaceC08830cm A04;

    public C06240Up(C07360aA c07360aA, C07410aF c07410aF, IntBuffer intBuffer, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(intBuffer, 2);
        this.A01 = c07410aF;
        this.A02 = intBuffer;
        this.A03 = c07360aA;
        this.A04 = interfaceC08830cm;
        this.A00 = new SparseArray();
    }

    private final boolean A00(Object obj, String str) {
        C10390h6 c10390h6;
        Map map;
        AbstractC07400aE abstractC07400aE;
        boolean A0K;
        if (str != null && (map = this.A01.A04) != null && map.containsKey(str) && (abstractC07400aE = (AbstractC07400aE) map.get(str)) != null) {
            Class cls = abstractC07400aE.A02;
            if (obj == null) {
                A0K = cls.equals(String.class);
            } else {
                A0K = C14360o3.A0K(obj.getClass(), cls);
            }
            if (A0K) {
                return true;
            }
        }
        InterfaceC08830cm interfaceC08830cm = this.A04;
        if (interfaceC08830cm != null && (c10390h6 = (C10390h6) interfaceC08830cm.get()) != null) {
            c10390h6.A02(this.A01.A01, str, "annotation key not matches schema definition");
        }
        return false;
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EET(int i, int i2, String str, int i3) {
        AbstractC07400aE abstractC07400aE;
        if (A00(Integer.valueOf(i3), str)) {
            C07360aA c07360aA = this.A03;
            if (str == null) {
                str = "";
            }
            Map map = c07360aA.A03.A04;
            if (map != null && (abstractC07400aE = (AbstractC07400aE) map.get(str)) != null) {
                ByteBuffer byteBuffer = c07360aA.A05;
                byteBuffer.putInt(0, i3);
                byte[] array = byteBuffer.array();
                C14360o3.A07(array);
                C07360aA.A00(c07360aA, abstractC07400aE, array, i2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
    @Override // X.InterfaceC06740Xq
    public final synchronized void EEU(int i, int i2, String str, String str2) {
        AbstractC07400aE abstractC07400aE;
        String str3;
        Object sb;
        C10390h6 c10390h6;
        if (A00(str2, str)) {
            C07360aA c07360aA = this.A03;
            if (str == null) {
                str = "";
            }
            InterfaceC08830cm interfaceC08830cm = this.A04;
            C07410aF c07410aF = c07360aA.A03;
            Map map = c07410aF.A04;
            if (map != null && (abstractC07400aE = (AbstractC07400aE) map.get(str)) != null && (abstractC07400aE instanceof C0TV)) {
                C0TV c0tv = (C0TV) abstractC07400aE;
                if (str2 == null) {
                    str3 = "null";
                } else {
                    str3 = str2;
                }
                int i3 = c0tv.A00;
                if (str3.length() > i3) {
                    C17u A0C = C17s.A0C(0, i3);
                    str3 = str3.substring(A0C.A00, A0C.A01 + 1);
                    C14360o3.A07(str3);
                    if (interfaceC08830cm != null && (c10390h6 = (C10390h6) interfaceC08830cm.get()) != null) {
                        c10390h6.A03(c07410aF.A01, c0tv.A03, str2);
                    }
                }
                int length = str3.length();
                if (i3 <= length) {
                    sb = str3.subSequence(0, length);
                } else {
                    sb = new StringBuilder(i3);
                    sb.append(str3);
                    int i4 = i3 - length;
                    int i5 = 1;
                    if (1 <= i4) {
                        while (true) {
                            sb.append(' ');
                            if (i5 == i4) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                byte[] bytes = sb.toString().getBytes(C15W.A05);
                C14360o3.A07(bytes);
                C07360aA.A00(c07360aA, abstractC07400aE, bytes, i2);
            }
        }
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEV(int i, int i2) {
        EEW(i, i2);
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEW(int i, int i2) {
        this.A03.A01(i2);
        SparseArray sparseArray = this.A00;
        boolean z = false;
        if (sparseArray.get(i2) != null) {
            z = true;
        }
        sparseArray.remove(i2);
        if (z) {
            IntBuffer intBuffer = this.A02;
            intBuffer.put(0, intBuffer.get(0) - 1);
        }
    }

    @Override // X.InterfaceC06740Xq
    public final void EEX(int i, int i2, String str) {
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEZ() {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = this.A00;
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) sparseArray2.valueAt(i)).booleanValue()) {
                sparseArray.put(sparseArray2.keyAt(i), sparseArray2.valueAt(i));
            }
        }
        int size2 = sparseArray.size();
        if (size2 == this.A01.A02) {
            C07360aA c07360aA = this.A03;
            c07360aA.A04.clear();
            c07360aA.A00 = -1;
            c07360aA.A01 = 0;
            sparseArray2.clear();
        } else {
            int size3 = sparseArray.size();
            for (int i2 = 0; i2 < size3; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                this.A03.A01(keyAt);
                sparseArray2.remove(keyAt);
            }
        }
        IntBuffer intBuffer = this.A02;
        intBuffer.put(0, intBuffer.get(0) - size2);
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEa(int i, int i2, boolean z) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.get(i2) != null) {
            sparseArray.put(i2, Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC06740Xq
    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
    }

    @Override // X.InterfaceC06740Xq
    public final synchronized void EEY(int i, int i2, boolean z) {
        C10390h6 c10390h6;
        SparseArray sparseArray = this.A00;
        if (sparseArray.get(i2) == null) {
            C07360aA c07360aA = this.A03;
            int i3 = c07360aA.A01;
            while (true) {
                ByteBuffer byteBuffer = c07360aA.A04;
                if (byteBuffer.limit() > i3) {
                    if (byteBuffer.get(i3) == 1) {
                        i3 += c07360aA.A02;
                        byteBuffer.position(i3);
                    } else {
                        c07360aA.A01 = i3;
                        byteBuffer.position(i3);
                        int position = byteBuffer.position();
                        byteBuffer.putInt(position + 1, i2);
                        byteBuffer.put(position, (byte) 1);
                        if (c07360aA.A00 < position) {
                            c07360aA.A00 = position;
                        }
                    }
                } else {
                    int limit = byteBuffer.limit();
                    c07360aA.A01 = limit;
                    byteBuffer.position(limit);
                    InterfaceC08830cm interfaceC08830cm = this.A04;
                    if (interfaceC08830cm != null && (c10390h6 = (C10390h6) interfaceC08830cm.get()) != null) {
                        C07410aF c07410aF = this.A01;
                        c10390h6.A00.A06(TimeUnit.NANOSECONDS, new int[]{c07410aF.A01, 1, c07410aF.A03, c07410aF.A02}, new int[]{2, 2, 2, 2}, new String[]{"marker_id", "storage_version", "schema_version", "max_concurrent_events"}, 27800211);
                    }
                }
            }
            sparseArray.put(i2, Boolean.valueOf(z));
            int size = sparseArray.size();
            IntBuffer intBuffer = this.A02;
            intBuffer.put(0, size);
            if (intBuffer.get(1) < size) {
                intBuffer.put(1, size);
            }
        }
    }
}
