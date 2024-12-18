package X;

import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0dq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09410dq extends AbstractC208410g implements C0Xc {
    public InterfaceC08830cm A00;
    public final SparseArray A01;
    public final C0JO A02;
    public final C0Y9 A03;
    public final List A04;
    public final C06650Xb A05;
    public final boolean A06;

    public C09410dq(C0JO c0jo, C0Y5 c0y5, ExecutorC19230x5 executorC19230x5, java.util.Set set) {
        SparseArray sparseArray = new SparseArray();
        this.A01 = sparseArray;
        this.A02 = c0jo;
        this.A00 = null;
        this.A06 = true;
        this.A03 = new C0Y9(c0jo, c0y5, executorC19230x5, TimeUnit.SECONDS.toMillis(10L));
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC06820Xy interfaceC06820Xy = (InterfaceC06820Xy) it.next();
            if (interfaceC06820Xy.isEnabled()) {
                C0Xz AN5 = interfaceC06820Xy.AN5();
                C15400pv c15400pv = new C15400pv(this.A02, AN5);
                arrayList.add(c15400pv);
                for (int i : AN5.A01) {
                    List list = (List) sparseArray.get(i);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(i, list);
                    }
                    list.add(c15400pv);
                }
            }
        }
        this.A04 = arrayList;
        SparseArray sparseArray2 = this.A01;
        int size = sparseArray2.size() + 2;
        int[] iArr = new int[size];
        iArr[0] = 46333953;
        iArr[1] = 46342759;
        for (int i2 = 2; i2 < size; i2++) {
            iArr[i2] = sparseArray2.keyAt(i2 - 2);
        }
        this.A05 = new C06650Xb(iArr, null);
    }

    @Override // X.C0Xc
    public final String getName() {
        return "local_aggregation";
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkEvent(C0XX c0xx) {
        ExecutorC19230x5 executorC19230x5;
        Runnable runnable;
        ArrayList A00;
        int markerId = c0xx.getMarkerId();
        if (markerId != 46333953) {
            if (markerId != 46342759) {
                A00(c0xx);
            } else {
                final C0Y9 c0y9 = this.A03;
                if (c0y9 != null) {
                    InterfaceC08830cm interfaceC08830cm = this.A00;
                    interfaceC08830cm.getClass();
                    final C06790Xv c06790Xv = (C06790Xv) interfaceC08830cm.get();
                    executorC19230x5 = c0y9.A04;
                    runnable = new Runnable() { // from class: X.0Y6
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0Y5 c0y5;
                            String str;
                            File[] listFiles;
                            C0Y9 c0y92 = c0y9;
                            C06790Xv c06790Xv2 = c06790Xv;
                            synchronized (c0y92.A05) {
                                synchronized (c0y92.A06) {
                                    c0y5 = c0y92.A03;
                                    c0y5.A01();
                                    File file = new File(C0Y5.A00(c0y5, C0Y5.A01));
                                    str = C0Y5.A02;
                                    file.renameTo(new File(C0Y5.A00(c0y5, str)));
                                }
                                c0y92.A07 = true;
                                File file2 = new File(C0Y5.A00(c0y5, str));
                                if (file2.exists() && (listFiles = file2.listFiles()) != null) {
                                    ArrayList arrayList = new ArrayList();
                                    try {
                                        for (File file3 : listFiles) {
                                            FileInputStream fileInputStream = new FileInputStream(file3);
                                            StringBuilder sb = new StringBuilder();
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                                            while (true) {
                                                try {
                                                    String readLine = bufferedReader.readLine();
                                                    if (readLine == null) {
                                                        break;
                                                    } else {
                                                        sb.append(readLine);
                                                    }
                                                } finally {
                                                }
                                            }
                                            bufferedReader.close();
                                            JSONArray jSONArray = new JSONArray(sb.toString());
                                            ArrayList arrayList2 = new ArrayList(jSONArray.length());
                                            for (int i = 0; i < jSONArray.length(); i++) {
                                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                                String[] A01 = C0Y4.A01(jSONObject.getJSONArray("integerDimensions"));
                                                JSONArray jSONArray2 = jSONObject.getJSONArray("integerDimensionValues");
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.getLong(i2);
                                                }
                                                String[] A012 = C0Y4.A01(jSONObject.getJSONArray("stringDimensions"));
                                                String[] A013 = C0Y4.A01(jSONObject.getJSONArray("stringDimensionValues"));
                                                String[] A014 = C0Y4.A01(jSONObject.getJSONArray("integerAggregations"));
                                                JSONArray jSONArray3 = jSONObject.getJSONArray("integerResults");
                                                int length2 = jSONArray3.length();
                                                long[] jArr2 = new long[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    jArr2[i3] = jSONArray3.getLong(i3);
                                                }
                                                String[] A015 = C0Y4.A01(jSONObject.getJSONArray("doubleAggregations"));
                                                JSONArray jSONArray4 = jSONObject.getJSONArray("doubleResults");
                                                int length3 = jSONArray4.length();
                                                double[] dArr = new double[length3];
                                                for (int i4 = 0; i4 < length3; i4++) {
                                                    dArr[i4] = jSONArray4.getDouble(i4);
                                                }
                                                arrayList2.add(new C0Y1(dArr, jArr, jArr2, A01, A012, A013, A014, A015, C0Y4.A01(jSONObject.getJSONArray("stringAggregations")), C0Y4.A01(jSONObject.getJSONArray("stringResults")), jSONObject.getInt("count")));
                                            }
                                            arrayList.add(new C0Y0(file3.getName(), arrayList2));
                                        }
                                    } catch (IOException | JSONException unused) {
                                    }
                                    if (!arrayList.isEmpty()) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            C06790Xv.A05(c06790Xv2, (C0Y0) it.next());
                                        }
                                    }
                                }
                                c0y5.A01();
                            }
                        }
                    };
                    executorC19230x5.execute(runnable);
                }
            }
        } else if (this.A06) {
            InterfaceC08830cm interfaceC08830cm2 = this.A00;
            interfaceC08830cm2.getClass();
            C06790Xv c06790Xv2 = (C06790Xv) interfaceC08830cm2.get();
            ArrayList arrayList = new ArrayList();
            for (C15400pv c15400pv : this.A04) {
                String str = c15400pv.A01.A00;
                synchronized (c15400pv) {
                    A00 = c15400pv.A00();
                    c15400pv.A02.clear();
                }
                arrayList.add(new C0Y0(str, A00));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C06790Xv.A05(c06790Xv2, (C0Y0) it.next());
            }
            final C0Y9 c0y92 = this.A03;
            if (c0y92 != null) {
                executorC19230x5 = c0y92.A04;
                runnable = new Runnable() { // from class: X.0Y8
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0Y9 c0y93 = C0Y9.this;
                        synchronized (c0y93.A06) {
                            File file = new File(C0Y5.A00(c0y93.A03, C0Y5.A01));
                            if (file.exists()) {
                                File[] listFiles = file.listFiles();
                                if (listFiles != null) {
                                    for (File file2 : listFiles) {
                                        file2.delete();
                                    }
                                }
                                file.delete();
                            }
                        }
                    }
                };
                executorC19230x5.execute(runnable);
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final synchronized void onMarkerStop(C0XX c0xx) {
        A00(c0xx);
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [X.0Xx, java.lang.Object] */
    private void A00(C0XX c0xx) {
        List list = (List) this.A01.get(c0xx.getMarkerId());
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C15400pv c15400pv = (C15400pv) list.get(i);
                synchronized (c15400pv) {
                    C0Xz c0Xz = c15400pv.A01;
                    InterfaceC12970lj[] interfaceC12970ljArr = c0Xz.A03;
                    StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    boolean z = false;
                    do {
                        InterfaceC12970lj interfaceC12970lj = interfaceC12970ljArr[i2];
                        if (z) {
                            sb.append(":");
                        } else {
                            z = true;
                        }
                        sb.append(interfaceC12970lj.AxS(c0xx));
                        i2++;
                    } while (i2 < 4);
                    String obj = sb.toString();
                    Map map = c15400pv.A02;
                    C06810Xx c06810Xx = (C06810Xx) map.get(obj);
                    C06810Xx c06810Xx2 = c06810Xx;
                    if (c06810Xx == null) {
                        ?? obj2 = new Object();
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        int i6 = 0;
                        do {
                            InterfaceC12970lj interfaceC12970lj2 = interfaceC12970ljArr[i4];
                            if (!(interfaceC12970lj2 instanceof InterfaceC12170kL)) {
                                if (interfaceC12970lj2 instanceof C08950cz) {
                                    i6++;
                                }
                            } else {
                                i5++;
                            }
                            i4++;
                        } while (i4 < 4);
                        obj2.A02 = new long[i5];
                        obj2.A04 = new String[i6];
                        int i7 = 0;
                        int i8 = 0;
                        do {
                            InterfaceC12970lj interfaceC12970lj3 = interfaceC12970ljArr[i3];
                            if (interfaceC12970lj3 instanceof InterfaceC12170kL) {
                                obj2.A02[i7] = ((InterfaceC12170kL) interfaceC12970lj3).CEQ(c0xx);
                                i7++;
                            } else if (interfaceC12970lj3 instanceof C08950cz) {
                                String[] strArr = obj2.A04;
                                int i9 = i8 + 1;
                                String Ac1 = c0xx.Ac1(((C08950cz) interfaceC12970lj3).A00);
                                if (Ac1 == null) {
                                    Ac1 = "";
                                }
                                strArr[i8] = Ac1;
                                i8 = i9;
                            }
                            i3++;
                        } while (i3 < 4);
                        int i10 = 0;
                        int i11 = 0;
                        for (C0Y3 c0y3 : c0Xz.A02) {
                            if (c0y3.A00().intValue() == 0) {
                                i10++;
                            } else {
                                i11++;
                            }
                        }
                        obj2.A03 = new long[i10];
                        obj2.A01 = new double[i11];
                        obj2.A05 = new String[0];
                        map.put(obj, obj2);
                        c06810Xx2 = obj2;
                    }
                    int i12 = 0;
                    int i13 = 0;
                    for (C0Y3 c0y32 : c0Xz.A02) {
                        if (c0y32 instanceof C14540oS) {
                            InterfaceC12170kL interfaceC12170kL = (InterfaceC12170kL) ((C14540oS) c0y32).A00;
                            long[] jArr = c06810Xx2.A03;
                            jArr[i12] = jArr[i12] + interfaceC12170kL.CEQ(c0xx);
                            i12++;
                        } else if (c0y32 instanceof C14580oW) {
                            InterfaceC12810lT interfaceC12810lT = (InterfaceC12810lT) ((C14580oW) c0y32).A00;
                            double[] dArr = c06810Xx2.A01;
                            dArr[i13] = dArr[i13] + interfaceC12810lT.CEP(c0xx);
                            i13++;
                        } else {
                            throw new UnsupportedOperationException(AnonymousClass001.A0R("Unsupported Aggregation: ", c0y32.getClass().getName()));
                        }
                    }
                    c06810Xx2.A00++;
                    c15400pv.A03 = c15400pv.A00.now();
                }
            }
            final C0Y9 c0y9 = this.A03;
            if (c0y9 != null) {
                final List list2 = this.A04;
                if (c0y9.A07) {
                    long now = c0y9.A02.now();
                    synchronized (c0y9) {
                        final long j = c0y9.A00;
                        if (now >= c0y9.A01 + j) {
                            c0y9.A00 = now;
                            c0y9.A04.execute(new Runnable() { // from class: X.0Y7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0Y9 c0y92 = C0Y9.this;
                                    List<C15400pv> list3 = list2;
                                    long j2 = j;
                                    synchronized (c0y92.A06) {
                                        for (C15400pv c15400pv2 : list3) {
                                            if (c15400pv2.A03 > j2) {
                                                ArrayList A00 = c15400pv2.A00();
                                                try {
                                                    C0Y5 c0y5 = c0y92.A03;
                                                    String str = c15400pv2.A01.A00;
                                                    File file = new File(C0Y5.A00(c0y5, C0Y5.A01));
                                                    file.mkdirs();
                                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
                                                    try {
                                                        JSONArray jSONArray = new JSONArray();
                                                        Iterator it = A00.iterator();
                                                        while (it.hasNext()) {
                                                            C0Y1 c0y1 = (C0Y1) it.next();
                                                            JSONObject jSONObject = new JSONObject();
                                                            jSONObject.put("integerDimensions", C0Y4.A00(c0y1.A06));
                                                            long[] jArr2 = c0y1.A02;
                                                            JSONArray jSONArray2 = new JSONArray();
                                                            for (long j3 : jArr2) {
                                                                jSONArray2.put(j3);
                                                            }
                                                            jSONObject.put("integerDimensionValues", jSONArray2);
                                                            jSONObject.put("stringDimensions", C0Y4.A00(c0y1.A09));
                                                            jSONObject.put("stringDimensionValues", C0Y4.A00(c0y1.A08));
                                                            jSONObject.put("integerAggregations", C0Y4.A00(c0y1.A05));
                                                            long[] jArr3 = c0y1.A03;
                                                            JSONArray jSONArray3 = new JSONArray();
                                                            for (long j4 : jArr3) {
                                                                jSONArray3.put(j4);
                                                            }
                                                            jSONObject.put("integerResults", jSONArray3);
                                                            jSONObject.put("doubleAggregations", C0Y4.A00(c0y1.A04));
                                                            double[] dArr2 = c0y1.A01;
                                                            JSONArray jSONArray4 = new JSONArray();
                                                            for (double d : dArr2) {
                                                                jSONArray4.put(d);
                                                            }
                                                            jSONObject.put("doubleResults", jSONArray4);
                                                            jSONObject.put("stringAggregations", C0Y4.A00(c0y1.A07));
                                                            jSONObject.put("stringResults", C0Y4.A00(c0y1.A0A));
                                                            jSONObject.put("count", c0y1.A00);
                                                            jSONArray.put(jSONObject);
                                                        }
                                                        String obj3 = jSONArray.toString();
                                                        if (obj3 != null) {
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                                                            try {
                                                                outputStreamWriter.write(obj3);
                                                                outputStreamWriter.close();
                                                            } catch (Throwable th) {
                                                                try {
                                                                    outputStreamWriter.close();
                                                                } catch (Throwable th2) {
                                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                                                }
                                                                throw th;
                                                                break;
                                                            }
                                                        }
                                                        fileOutputStream.close();
                                                    } catch (Throwable th3) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (Throwable th4) {
                                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                                        }
                                                        throw th3;
                                                        break;
                                                    }
                                                } catch (IOException | JSONException unused) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC208410g, X.C0Xc
    public final C0Xa getListenerFlags() {
        return C0Xa.A01;
    }

    @Override // X.C0Xc
    public final C06650Xb getListenerMarkers() {
        return this.A05;
    }
}
