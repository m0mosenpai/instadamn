package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

/* renamed from: X.4Un, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Un extends AbstractC96044Tn implements Handler.Callback {
    public long A00;
    public long A01;
    public Metadata A02;
    public C4YU A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final InterfaceC96284Ul A08;
    public final C96304Uo A09;
    public final InterfaceC96274Uk A0A;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4Ts, X.4Uo] */
    public C4Un(Looper looper, InterfaceC96284Ul interfaceC96284Ul, InterfaceC96274Uk interfaceC96274Uk, String str) {
        super(5);
        Handler handler;
        this.A0A = interfaceC96274Uk;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A07 = handler;
        interfaceC96284Ul.getClass();
        this.A08 = interfaceC96284Ul;
        this.A09 = new C96094Ts(1);
        this.A00 = -9223372036854775807L;
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = S1W.A00(str);
            } catch (JSONException unused) {
                android.util.Log.e("MetadataRenderer", AbstractC111324zv.A00(3593));
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
                    InterfaceC96284Ul interfaceC96284Ul = this.A08;
                    if (interfaceC96284Ul.EpT(CHw)) {
                        C4YT AM1 = interfaceC96284Ul.AM1(CHw);
                        byte[] CHv = entryArr[i].CHv();
                        CHv.getClass();
                        C96304Uo c96304Uo = this.A09;
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

    @Override // X.AbstractC96044Tn
    public final void A0K() {
        this.A02 = null;
        this.A03 = null;
        this.A00 = -9223372036854775807L;
    }

    @Override // X.AbstractC96044Tn
    public final void A0L(long j, boolean z) {
        this.A02 = null;
        this.A05 = false;
        this.A06 = false;
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
    public final void A0N(C4B6[] c4b6Arr, long j, long j2) {
        this.A03 = this.A08.AM1(c4b6Arr[0]);
        Metadata metadata = this.A02;
        if (metadata != null) {
            long j3 = metadata.A00;
            long j4 = (j3 + this.A00) - j2;
            if (j3 != j4) {
                metadata = new Metadata(metadata.A01, j4);
            }
            this.A02 = metadata;
        }
        this.A00 = j2;
    }

    @Override // X.InterfaceC96054To
    public final boolean CTt() {
        return this.A06;
    }

    @Override // X.InterfaceC96054To
    public final void EGW(long j, long j2) {
        boolean z;
        List list = this.A04;
        if (list != null) {
            UUID uuid = C4YL.A04;
            long A08 = Util.A08(j);
            Handler handler = this.A07;
            if (handler != null) {
                handler.obtainMessage(1, Long.valueOf(A08)).sendToTarget();
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        do {
            if (!this.A05 && this.A02 == null) {
                C96304Uo c96304Uo = this.A09;
                c96304Uo.clear();
                C96084Tr c96084Tr = this.A0C;
                c96084Tr.A01 = null;
                c96084Tr.A00 = null;
                int A0E = A0E(c96084Tr, c96304Uo, 0);
                if (A0E == -4) {
                    if ((((AbstractC96104Tt) c96304Uo).A00 & 4) == 4) {
                        this.A05 = true;
                    } else {
                        c96304Uo.A00 = this.A01;
                        c96304Uo.A00();
                        Metadata ANl = this.A03.ANl(c96304Uo);
                        if (ANl != null) {
                            ArrayList arrayList = new ArrayList(ANl.A01.length);
                            A00(ANl, arrayList);
                            if (!arrayList.isEmpty()) {
                                long j3 = c96304Uo.A01;
                                boolean z2 = true;
                                boolean z3 = false;
                                if (j3 != -9223372036854775807L) {
                                    z3 = true;
                                }
                                C4B8.A04(z3);
                                long j4 = this.A00;
                                if (j4 == -9223372036854775807L) {
                                    z2 = false;
                                }
                                C4B8.A04(z2);
                                this.A02 = new Metadata((Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]), j3 - j4);
                            }
                        }
                    }
                } else if (A0E == -5) {
                    C4B6 c4b6 = c96084Tr.A00;
                    c4b6.getClass();
                    this.A01 = c4b6.A0M;
                }
            }
            Metadata metadata = this.A02;
            if (metadata != null) {
                long j5 = metadata.A00;
                boolean z4 = true;
                boolean z5 = false;
                if (j != -9223372036854775807L) {
                    z5 = true;
                }
                C4B8.A04(z5);
                long j6 = this.A00;
                if (j6 == -9223372036854775807L) {
                    z4 = false;
                }
                C4B8.A04(z4);
                if (j5 <= j - j6) {
                    UUID uuid2 = C4YL.A04;
                    long A082 = Util.A08(j - j5);
                    Handler handler2 = this.A07;
                    if (handler2 != null) {
                        handler2.obtainMessage(0, new Object[]{metadata, Long.valueOf(A082)}).sendToTarget();
                    } else {
                        this.A0A.DTZ(metadata, A082);
                    }
                    metadata = null;
                    this.A02 = null;
                    z = true;
                    if (this.A05 && metadata == null) {
                        this.A06 = true;
                    }
                }
            }
            z = false;
            if (this.A05) {
                this.A06 = true;
            }
        } while (z);
    }

    @Override // X.InterfaceC96074Tq
    public final int EpR(C4B6 c4b6) {
        int i;
        if (this.A08.EpT(c4b6)) {
            i = 2;
            if (c4b6.A07 == 0) {
                i = 4;
            }
        } else {
            i = 0;
        }
        return i | 0 | 128;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                List list = this.A04;
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
            this.A0A.DTZ((Metadata) objArr[0], ((Number) objArr[1]).longValue());
        }
        return true;
    }
}
