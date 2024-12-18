package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.OeV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55211OeV {
    public boolean A00;
    public boolean A01;
    public final AtomicBoolean A02 = AbstractC166997dE.A17();

    public static JSONObject A06(JSONArray jSONArray) {
        JSONObject jSONObject = jSONArray.getJSONObject(jSONArray.length() - 1);
        jSONObject.put("end_time_ms", -1L);
        return jSONObject;
    }

    public final synchronized void A0G(boolean z) {
        this.A00 = z;
    }

    public final synchronized void A0H(boolean z) {
        Object obj;
        InterfaceC09390do interfaceC09390do;
        if (z) {
            if (this.A02.get()) {
                A0A();
            }
            if (this instanceof C52048N0z) {
                C52048N0z c52048N0z = (C52048N0z) this;
                JSONObject jSONObject = c52048N0z.A06;
                if (jSONObject != null) {
                    c52048N0z.A02.put(jSONObject);
                }
                JSONObject jSONObject2 = c52048N0z.A08;
                if (jSONObject2 != null) {
                    c52048N0z.A04.put(jSONObject2);
                }
                JSONObject jSONObject3 = c52048N0z.A05;
                if (jSONObject3 != null) {
                    c52048N0z.A01.put(jSONObject3);
                }
                JSONObject jSONObject4 = c52048N0z.A07;
                if (jSONObject4 != null) {
                    c52048N0z.A03.put(jSONObject4);
                }
            } else {
                C52047N0y c52047N0y = (C52047N0y) this;
                if (c52047N0y.A00 == 4) {
                    C51430Mnc c51430Mnc = c52047N0y.A02;
                    if (c51430Mnc != null) {
                        AbstractC50523MSb.A1M(c51430Mnc, c52047N0y.A0A);
                    }
                    C51433Mnf c51433Mnf = c52047N0y.A04;
                    if (c51433Mnf != null) {
                        AbstractC50523MSb.A1M(c51433Mnf, c52047N0y.A0E);
                    }
                    C51429Mnb c51429Mnb = c52047N0y.A01;
                    if (c51429Mnb != null) {
                        AbstractC50523MSb.A1M(c51429Mnb, c52047N0y.A09);
                    }
                    obj = c52047N0y.A03;
                    if (obj != null) {
                        interfaceC09390do = c52047N0y.A0D;
                        AbstractC50523MSb.A1M(obj, interfaceC09390do);
                    }
                } else {
                    C51437Mnj c51437Mnj = c52047N0y.A06;
                    if (c51437Mnj != null) {
                        AbstractC50523MSb.A1M(c51437Mnj, c52047N0y.A0C);
                    }
                    C51440Mnm c51440Mnm = c52047N0y.A08;
                    if (c51440Mnm != null) {
                        AbstractC50523MSb.A1M(c51440Mnm, c52047N0y.A0G);
                    }
                    C51436Mni c51436Mni = c52047N0y.A05;
                    if (c51436Mni != null) {
                        AbstractC50523MSb.A1M(c51436Mni, c52047N0y.A0B);
                    }
                    obj = c52047N0y.A07;
                    if (obj != null) {
                        interfaceC09390do = c52047N0y.A0F;
                        AbstractC50523MSb.A1M(obj, interfaceC09390do);
                    }
                }
            }
        } else {
            this.A02.set(true);
        }
        this.A01 = z;
    }

    public final synchronized boolean A0I() {
        return this.A01;
    }

    public static Long A03(C0Zx c0Zx, C51664Mrv c51664Mrv, long j) {
        c0Zx.A05("sample_rate", Long.valueOf(c51664Mrv.A02));
        c0Zx.A05(TraceFieldType.Bitrate, Long.valueOf(c51664Mrv.A00));
        c0Zx.A05("channels", Long.valueOf(c51664Mrv.A01));
        c0Zx.A06("codec_profile", AbstractC53760NqC.A00(c51664Mrv.A04));
        Long valueOf = Long.valueOf(j);
        c0Zx.A05("start_time_ms", valueOf);
        return valueOf;
    }

    public static Long A04(C0Zx c0Zx, C51712Msh c51712Msh, long j) {
        c0Zx.A05(TraceFieldType.Bitrate, Long.valueOf(c51712Msh.A00));
        Long valueOf = Long.valueOf(j);
        c0Zx.A05("start_time_ms", valueOf);
        return valueOf;
    }

    public static boolean A08(C0Zx c0Zx, C52047N0y c52047N0y, Long l) {
        boolean z;
        String str;
        c0Zx.A05("end_time_ms", l);
        synchronized (c52047N0y) {
            z = ((AbstractC55211OeV) c52047N0y).A00;
        }
        if (z) {
            str = "live";
        } else {
            str = "in_preview";
        }
        c0Zx.A06("livestream_stage", str);
        return c52047N0y.A0I();
    }

    public static boolean A09(C0Zx c0Zx, C52047N0y c52047N0y, Long l) {
        boolean z;
        String str;
        c0Zx.A05("end_time_ms", l);
        synchronized (c52047N0y) {
            z = ((AbstractC55211OeV) c52047N0y).A00;
        }
        if (z) {
            str = "call";
        } else {
            str = "ringing";
        }
        c0Zx.A06("call_stage", str);
        return c52047N0y.A0I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0A() {
        C52047N0y c52047N0y;
        if (this instanceof C52048N0z) {
            C52048N0z c52048N0z = (C52048N0z) this;
            c52048N0z.A02 = AbstractC31171DnF.A0p();
            c52048N0z.A04 = AbstractC31171DnF.A0p();
            c52048N0z.A01 = AbstractC31171DnF.A0p();
            c52048N0z.A03 = AbstractC31171DnF.A0p();
            c52047N0y = c52048N0z;
        } else {
            C52047N0y c52047N0y2 = (C52047N0y) this;
            A07(c52047N0y2.A0C);
            A07(c52047N0y2.A0G);
            A07(c52047N0y2.A0B);
            A07(c52047N0y2.A0F);
            A07(c52047N0y2.A0A);
            A07(c52047N0y2.A0E);
            A07(c52047N0y2.A09);
            A07(c52047N0y2.A0D);
            c52047N0y = c52047N0y2;
        }
        ((AbstractC55211OeV) c52047N0y).A02.set(false);
    }

    public final void A0B() {
        if (this instanceof C52048N0z) {
            C52048N0z c52048N0z = (C52048N0z) this;
            JSONArray jSONArray = c52048N0z.A02;
            if (AbstractC167007dF.A1O(jSONArray.length())) {
                c52048N0z.A06 = A06(jSONArray);
            } else {
                c52048N0z.A06 = null;
            }
            JSONArray jSONArray2 = c52048N0z.A04;
            if (jSONArray2.length() > 0) {
                c52048N0z.A08 = A06(jSONArray2);
            } else {
                c52048N0z.A08 = null;
            }
            JSONArray jSONArray3 = c52048N0z.A01;
            if (jSONArray3.length() > 0) {
                c52048N0z.A05 = A06(jSONArray3);
            } else {
                c52048N0z.A05 = null;
            }
            JSONArray jSONArray4 = c52048N0z.A03;
            if (jSONArray4.length() > 0) {
                c52048N0z.A07 = A06(jSONArray4);
            } else {
                c52048N0z.A07 = null;
            }
            c52048N0z.A0A();
            return;
        }
        C52047N0y c52047N0y = (C52047N0y) this;
        synchronized (c52047N0y) {
            C51437Mnj c51437Mnj = (C51437Mnj) A05(c52047N0y.A0C);
            C51432Mne c51432Mne = null;
            if (c51437Mnj == null) {
                c51437Mnj = null;
            } else {
                AbstractC50523MSb.A16(c51437Mnj, -1L);
            }
            c52047N0y.A06 = c51437Mnj;
            C51440Mnm c51440Mnm = (C51440Mnm) A05(c52047N0y.A0G);
            if (c51440Mnm == null) {
                c51440Mnm = null;
            } else {
                AbstractC50523MSb.A16(c51440Mnm, -1L);
            }
            c52047N0y.A08 = c51440Mnm;
            C51436Mni c51436Mni = (C51436Mni) A05(c52047N0y.A0B);
            if (c51436Mni == null) {
                c51436Mni = null;
            } else {
                AbstractC50523MSb.A16(c51436Mni, -1L);
            }
            c52047N0y.A05 = c51436Mni;
            C51439Mnl c51439Mnl = (C51439Mnl) A05(c52047N0y.A0F);
            if (c51439Mnl == null) {
                c51439Mnl = null;
            } else {
                AbstractC50523MSb.A16(c51439Mnl, -1L);
            }
            c52047N0y.A07 = c51439Mnl;
            C51430Mnc c51430Mnc = (C51430Mnc) A05(c52047N0y.A0A);
            if (c51430Mnc == null) {
                c51430Mnc = null;
            } else {
                AbstractC50523MSb.A16(c51430Mnc, -1L);
            }
            c52047N0y.A02 = c51430Mnc;
            C51433Mnf c51433Mnf = (C51433Mnf) A05(c52047N0y.A0E);
            if (c51433Mnf == null) {
                c51433Mnf = null;
            } else {
                AbstractC50523MSb.A16(c51433Mnf, -1L);
            }
            c52047N0y.A04 = c51433Mnf;
            C51429Mnb c51429Mnb = (C51429Mnb) A05(c52047N0y.A09);
            if (c51429Mnb == null) {
                c51429Mnb = null;
            } else {
                AbstractC50523MSb.A16(c51429Mnb, -1L);
            }
            c52047N0y.A01 = c51429Mnb;
            C51432Mne c51432Mne2 = (C51432Mne) A05(c52047N0y.A0D);
            if (c51432Mne2 != null) {
                AbstractC50523MSb.A16(c51432Mne2, -1L);
                c51432Mne = c51432Mne2;
            }
            c52047N0y.A03 = c51432Mne;
            c52047N0y.A0A();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, java.lang.Object, X.Mni] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Zx, X.Mnb, java.lang.Object] */
    public final void A0C(C51664Mrv c51664Mrv) {
        if (this instanceof C52048N0z) {
            C52048N0z c52048N0z = (C52048N0z) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A01 = C52048N0z.A01(c52048N0z, c51664Mrv, currentTimeMillis);
            if (c52048N0z.A0I()) {
                if (c52048N0z.A01.length() > 0) {
                    AbstractC50523MSb.A1V(c52048N0z.A01, currentTimeMillis);
                }
                c52048N0z.A01.put(A01);
                return;
            }
            c52048N0z.A05 = A01;
            return;
        }
        C52047N0y c52047N0y = (C52047N0y) this;
        synchronized (c52047N0y) {
            if (c52047N0y.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                ?? c0Zx = new C0Zx();
                Long A03 = A03(c0Zx, c51664Mrv, currentTimeMillis2);
                if (A09(c0Zx, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do = c52047N0y.A09;
                    C51429Mnb c51429Mnb = (C51429Mnb) A05(interfaceC09390do);
                    if (c51429Mnb != null) {
                        c51429Mnb.A05("end_time_ms", A03);
                    }
                    AbstractC50523MSb.A1M(c0Zx, interfaceC09390do);
                } else {
                    c52047N0y.A01 = c0Zx;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                ?? c0Zx2 = new C0Zx();
                Long A032 = A03(c0Zx2, c51664Mrv, currentTimeMillis3);
                if (A08(c0Zx2, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do2 = c52047N0y.A0B;
                    C51436Mni c51436Mni = (C51436Mni) A05(interfaceC09390do2);
                    if (c51436Mni != null) {
                        c51436Mni.A05("end_time_ms", A032);
                    }
                    AbstractC50523MSb.A1M(c0Zx2, interfaceC09390do2);
                } else {
                    c52047N0y.A05 = c0Zx2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, java.lang.Object, X.Mnl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Mne, X.0Zx, java.lang.Object] */
    public final void A0D(C51664Mrv c51664Mrv) {
        if (this instanceof C52048N0z) {
            C52048N0z c52048N0z = (C52048N0z) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A01 = C52048N0z.A01(c52048N0z, c51664Mrv, currentTimeMillis);
            if (c52048N0z.A0I()) {
                if (c52048N0z.A03.length() > 0) {
                    AbstractC50523MSb.A1V(c52048N0z.A03, currentTimeMillis);
                }
                c52048N0z.A03.put(A01);
                return;
            }
            c52048N0z.A07 = A01;
            return;
        }
        C52047N0y c52047N0y = (C52047N0y) this;
        synchronized (c52047N0y) {
            if (c52047N0y.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                ?? c0Zx = new C0Zx();
                Long A03 = A03(c0Zx, c51664Mrv, currentTimeMillis2);
                if (A09(c0Zx, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do = c52047N0y.A0D;
                    C51432Mne c51432Mne = (C51432Mne) A05(interfaceC09390do);
                    if (c51432Mne != null) {
                        c51432Mne.A05("end_time_ms", A03);
                    }
                    AbstractC50523MSb.A1M(c0Zx, interfaceC09390do);
                } else {
                    c52047N0y.A03 = c0Zx;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                ?? c0Zx2 = new C0Zx();
                Long A032 = A03(c0Zx2, c51664Mrv, currentTimeMillis3);
                if (A08(c0Zx2, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do2 = c52047N0y.A0F;
                    C51439Mnl c51439Mnl = (C51439Mnl) A05(interfaceC09390do2);
                    if (c51439Mnl != null) {
                        c51439Mnl.A05("end_time_ms", A032);
                    }
                    AbstractC50523MSb.A1M(c0Zx2, interfaceC09390do2);
                } else {
                    c52047N0y.A07 = c0Zx2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, java.lang.Object, X.Mnj] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Mnc, X.0Zx, java.lang.Object] */
    public final void A0E(C51712Msh c51712Msh) {
        if (this instanceof C52048N0z) {
            C52048N0z c52048N0z = (C52048N0z) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A02 = C52048N0z.A02(c52048N0z, c51712Msh, currentTimeMillis);
            if (c52048N0z.A0I()) {
                if (c52048N0z.A02.length() > 0) {
                    AbstractC50523MSb.A1V(c52048N0z.A02, currentTimeMillis);
                }
                c52048N0z.A02.put(A02);
                return;
            }
            c52048N0z.A06 = A02;
            return;
        }
        C52047N0y c52047N0y = (C52047N0y) this;
        synchronized (c52047N0y) {
            if (c52047N0y.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                ?? c0Zx = new C0Zx();
                C51712Msh.A00(c0Zx, c51712Msh);
                Long A04 = A04(c0Zx, c51712Msh, currentTimeMillis2);
                if (A09(c0Zx, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do = c52047N0y.A0A;
                    C51430Mnc c51430Mnc = (C51430Mnc) A05(interfaceC09390do);
                    if (c51430Mnc != null) {
                        c51430Mnc.A05("end_time_ms", A04);
                    }
                    AbstractC50523MSb.A1M(c0Zx, interfaceC09390do);
                } else {
                    c52047N0y.A02 = c0Zx;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                ?? c0Zx2 = new C0Zx();
                C51712Msh.A00(c0Zx2, c51712Msh);
                Long A042 = A04(c0Zx2, c51712Msh, currentTimeMillis3);
                if (A08(c0Zx2, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do2 = c52047N0y.A0C;
                    C51437Mnj c51437Mnj = (C51437Mnj) A05(interfaceC09390do2);
                    if (c51437Mnj != null) {
                        c51437Mnj.A05("end_time_ms", A042);
                    }
                    AbstractC50523MSb.A1M(c0Zx2, interfaceC09390do2);
                } else {
                    c52047N0y.A06 = c0Zx2;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, X.Mnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Mnf, X.0Zx, java.lang.Object] */
    public final void A0F(C51712Msh c51712Msh) {
        if (this instanceof C52048N0z) {
            C52048N0z c52048N0z = (C52048N0z) this;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject A02 = C52048N0z.A02(c52048N0z, c51712Msh, currentTimeMillis);
            if (c52048N0z.A0I()) {
                if (c52048N0z.A04.length() > 0) {
                    AbstractC50523MSb.A1V(c52048N0z.A04, currentTimeMillis);
                }
                c52048N0z.A04.put(A02);
                return;
            }
            c52048N0z.A08 = A02;
            return;
        }
        C52047N0y c52047N0y = (C52047N0y) this;
        synchronized (c52047N0y) {
            if (c52047N0y.A00 == 4) {
                long currentTimeMillis2 = System.currentTimeMillis();
                ?? c0Zx = new C0Zx();
                C51712Msh.A00(c0Zx, c51712Msh);
                Long A04 = A04(c0Zx, c51712Msh, currentTimeMillis2);
                if (A09(c0Zx, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do = c52047N0y.A0E;
                    C51433Mnf c51433Mnf = (C51433Mnf) A05(interfaceC09390do);
                    if (c51433Mnf != null) {
                        c51433Mnf.A05("end_time_ms", A04);
                    }
                    AbstractC50523MSb.A1M(c0Zx, interfaceC09390do);
                } else {
                    c52047N0y.A04 = c0Zx;
                }
            } else {
                long currentTimeMillis3 = System.currentTimeMillis();
                ?? c0Zx2 = new C0Zx();
                C51712Msh.A00(c0Zx2, c51712Msh);
                Long A042 = A04(c0Zx2, c51712Msh, currentTimeMillis3);
                if (A08(c0Zx2, c52047N0y, AbstractC37302Gc3.A0T())) {
                    InterfaceC09390do interfaceC09390do2 = c52047N0y.A0G;
                    C51440Mnm c51440Mnm = (C51440Mnm) A05(interfaceC09390do2);
                    if (c51440Mnm != null) {
                        c51440Mnm.A05("end_time_ms", A042);
                    }
                    AbstractC50523MSb.A1M(c0Zx2, interfaceC09390do2);
                } else {
                    c52047N0y.A08 = c0Zx2;
                }
            }
        }
    }

    public static Object A05(InterfaceC09390do interfaceC09390do) {
        return AbstractC001800i.A0L((List) interfaceC09390do.getValue());
    }

    public static void A07(InterfaceC09390do interfaceC09390do) {
        ((List) interfaceC09390do.getValue()).clear();
    }
}
