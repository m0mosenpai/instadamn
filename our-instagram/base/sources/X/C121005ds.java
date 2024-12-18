package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

/* renamed from: X.5ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121005ds extends AbstractC96044Tn implements Handler.Callback {
    public int A00;
    public int A01;
    public List A02;
    public long A03;
    public C4YU A04;
    public boolean A05;
    public final Handler A06;
    public final InterfaceC96274Uk A07;
    public final Metadata[] A08;
    public final InterfaceC96284Ul A09;
    public final C96304Uo A0A;
    public final long[] A0B;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.4Ts, X.4Uo] */
    public C121005ds(Looper looper, InterfaceC96284Ul interfaceC96284Ul, InterfaceC96274Uk interfaceC96274Uk, String str) {
        super(5);
        Handler handler;
        this.A07 = interfaceC96274Uk;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A06 = handler;
        interfaceC96284Ul.getClass();
        this.A09 = interfaceC96284Ul;
        this.A0A = new C96094Ts(1);
        this.A08 = new Metadata[5];
        this.A0B = new long[5];
        if (str != null && !str.isEmpty()) {
            try {
                this.A02 = S1W.A00(str);
            } catch (JSONException unused) {
                AbstractC46512Bo.A03("MetadataRenderer", "Error in parsing IMF spec");
            }
        }
    }

    private void A00(Metadata metadata, List list) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i < entryArr.length) {
                C4B6 CHw = entryArr[i].CHw();
                if (CHw != null) {
                    InterfaceC96284Ul interfaceC96284Ul = this.A09;
                    if (interfaceC96284Ul.EpT(CHw)) {
                        C4YT AM1 = interfaceC96284Ul.AM1(CHw);
                        byte[] CHv = entryArr[i].CHv();
                        CHv.getClass();
                        C96304Uo c96304Uo = this.A0A;
                        c96304Uo.clear();
                        c96304Uo.A01(CHv.length);
                        c96304Uo.A02.put(CHv);
                        c96304Uo.A00();
                        Metadata ANl = AM1.ANl(c96304Uo);
                        if (ANl != null) {
                            A00(ANl, list);
                        }
                        i++;
                    }
                }
                list.add(entryArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC96054To
    public final boolean CbZ() {
        return true;
    }

    @Override // X.InterfaceC96054To, X.InterfaceC96074Tq
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // X.AbstractC96044Tn
    public final void A0K() {
        Arrays.fill(this.A08, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
    }

    @Override // X.AbstractC96044Tn
    public final void A0L(long j, boolean z) {
        Arrays.fill(this.A08, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
    }

    @Override // X.AbstractC96044Tn
    public final void A0N(C4B6[] c4b6Arr, long j, long j2) {
        this.A04 = this.A09.AM1(c4b6Arr[0]);
    }

    @Override // X.InterfaceC96054To
    public final boolean CTt() {
        return this.A05;
    }

    @Override // X.InterfaceC96054To
    public final void EGW(long j, long j2) {
        List list = this.A02;
        if (list != null) {
            UUID uuid = C4YL.A03;
            long A08 = Util.A08(j);
            Handler handler = this.A06;
            if (handler != null) {
                handler.obtainMessage(1, Long.valueOf(A08)).sendToTarget();
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        if (!this.A05 && this.A00 < 5) {
            C96304Uo c96304Uo = this.A0A;
            c96304Uo.clear();
            C96084Tr c96084Tr = this.A0C;
            c96084Tr.A01 = null;
            c96084Tr.A00 = null;
            int A0E = A0E(c96084Tr, c96304Uo, 0);
            if (A0E == -4) {
                int i = ((AbstractC96104Tt) c96304Uo).A00;
                if ((i & 4) == 4) {
                    this.A05 = true;
                } else if ((i & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    c96304Uo.A00 = this.A03;
                    c96304Uo.A00();
                    Metadata ANl = this.A04.ANl(c96304Uo);
                    if (ANl != null) {
                        ArrayList arrayList = new ArrayList(ANl.A01.length);
                        A00(ANl, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i2 = this.A01;
                            int i3 = this.A00;
                            int i4 = (i2 + i3) % 5;
                            this.A08[i4] = metadata;
                            this.A0B[i4] = c96304Uo.A01;
                            this.A00 = i3 + 1;
                        }
                    }
                }
            } else if (A0E == -5) {
                C4B6 c4b6 = c96084Tr.A00;
                c4b6.getClass();
                this.A03 = c4b6.A0M;
            }
        }
        if (this.A00 > 0) {
            long[] jArr = this.A0B;
            int i5 = this.A01;
            long j3 = jArr[i5];
            if (j3 <= j) {
                Metadata[] metadataArr = this.A08;
                Metadata metadata2 = metadataArr[i5];
                UUID uuid2 = C4YL.A03;
                long A082 = Util.A08(j - j3);
                Handler handler2 = this.A06;
                if (handler2 != null) {
                    handler2.obtainMessage(0, new Object[]{metadata2, Long.valueOf(A082)}).sendToTarget();
                } else {
                    this.A07.DTZ(metadata2, A082);
                }
                int i6 = this.A01;
                metadataArr[i6] = null;
                this.A01 = (i6 + 1) % 5;
                this.A00--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 == 2) goto L8;
     */
    @Override // X.InterfaceC96074Tq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int EpR(X.C4B6 r4) {
        /*
            r3 = this;
            X.4Ul r0 = r3.A09
            boolean r0 = r0.EpT(r4)
            if (r0 == 0) goto L17
            int r1 = r4.A07
            if (r1 == 0) goto L10
            r0 = 2
            r2 = 2
            if (r1 != r0) goto L11
        L10:
            r2 = 4
        L11:
            r1 = 0
            r0 = 128(0x80, float:1.8E-43)
            r2 = r2 | r1
            r2 = r2 | r0
            return r2
        L17:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121005ds.EpR(X.4B6):int");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                List list = this.A02;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            Object[] objArr = (Object[]) message.obj;
            this.A07.DTZ((Metadata) objArr[0], ((Number) objArr[1]).longValue());
        }
        return true;
    }
}
