package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4Ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96254Ui extends AbstractC96044Tn implements Handler.Callback {
    public int A00;
    public long A01;
    public long A02;
    public InterfaceC126705oA A03;
    public AbstractC126725oC A04;
    public int A05;
    public long A06;
    public C4B6 A07;
    public C126715oB A08;
    public AbstractC126725oC A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final C96084Tr A0E;
    public final InterfaceC96244Uh A0F;
    public final InterfaceC96224Uf A0G;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4Tr, java.lang.Object] */
    public C96254Ui(Looper looper, InterfaceC96244Uh interfaceC96244Uh, InterfaceC96224Uf interfaceC96224Uf) {
        super(3);
        Handler handler;
        this.A0G = interfaceC96224Uf;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A0D = handler;
        this.A0F = interfaceC96244Uh;
        this.A0E = new Object();
        this.A01 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02() {
        /*
            r4 = this;
            r0 = 1
            r4.A0C = r0
            X.4Uh r3 = r4.A0F
            X.4B6 r1 = r4.A07
            r1.getClass()
            X.4Ug r3 = (X.C96234Ug) r3
            java.lang.String r2 = r1.A0W
            int r0 = r2.hashCode()
            switch(r0) {
                case 930165504: goto L42;
                case 1566015601: goto L3f;
                case 1668750253: goto L25;
                default: goto L15;
            }
        L15:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L52
            X.Ux7 r1 = new X.Ux7
            r1.<init>()
        L22:
            r4.A03 = r1
            return
        L25:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A00
            boolean r0 = r0.A3H
            if (r0 == 0) goto L39
            X.5o8 r1 = new X.5o8
            r1.<init>()
            goto L22
        L39:
            X.Ux8 r1 = new X.Ux8
            r1.<init>()
            goto L22
        L3f:
            java.lang.String r0 = "application/cea-608"
            goto L44
        L42:
            java.lang.String r0 = "application/x-mp4-cea-608"
        L44:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L15
            int r0 = r1.A03
            X.Wc2 r1 = new X.Wc2
            r1.<init>(r2, r0)
            goto L22
        L52:
            java.lang.String r1 = "Attempted to create decoder for unsupported format"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96254Ui.A02():void");
    }

    private void A03() {
        this.A08 = null;
        this.A05 = -1;
        AbstractC126725oC abstractC126725oC = this.A04;
        if (abstractC126725oC != null) {
            abstractC126725oC.release();
            this.A04 = null;
        }
        AbstractC126725oC abstractC126725oC2 = this.A09;
        if (abstractC126725oC2 != null) {
            abstractC126725oC2.release();
            this.A09 = null;
        }
    }

    @Override // X.AbstractC96044Tn
    public final void A0K() {
        this.A07 = null;
        this.A01 = -9223372036854775807L;
        A01();
        this.A02 = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        A03();
        InterfaceC126705oA interfaceC126705oA = this.A03;
        interfaceC126705oA.getClass();
        interfaceC126705oA.release();
        this.A03 = null;
        this.A00 = 0;
    }

    @Override // X.InterfaceC96054To
    public final boolean CbZ() {
        return true;
    }

    @Override // X.InterfaceC96054To, X.InterfaceC96074Tq
    public final String getName() {
        return "TextRenderer";
    }

    private long A00() {
        if (this.A05 == -1) {
            return Long.MAX_VALUE;
        }
        this.A04.getClass();
        if (this.A05 >= this.A04.B2o()) {
            return Long.MAX_VALUE;
        }
        return this.A04.B2n(this.A05);
    }

    private void A01() {
        C4WP c4wp = C4WP.A01;
        C16930sl c16930sl = C16930sl.A00;
        boolean z = true;
        boolean z2 = false;
        if (this.A06 != -9223372036854775807L) {
            z2 = true;
        }
        C4B8.A04(z2);
        if (this.A02 == -9223372036854775807L) {
            z = false;
        }
        C4B8.A04(z);
        C4WP c4wp2 = new C4WP(c16930sl);
        Handler handler = this.A0D;
        if (handler != null) {
            handler.obtainMessage(0, c4wp2).sendToTarget();
        } else {
            A05(c4wp2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, X.5wK] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.5wK] */
    private void A05(C4WP c4wp) {
        InterfaceC96224Uf interfaceC96224Uf = this.A0G;
        List list = c4wp.A00;
        C96214Ue c96214Ue = (C96214Ue) interfaceC96224Uf;
        if (!c96214Ue.A03) {
            c96214Ue.A00 = 0L;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = ((C4WQ) it.next()).A0C;
                ?? obj = new Object();
                obj.A00 = charSequence;
                arrayList.add(obj);
            }
            c96214Ue.A01.A0v.onCues(arrayList);
        }
        c96214Ue.A00 = 0L;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            CharSequence charSequence2 = ((C4WQ) it2.next()).A0C;
            ?? obj2 = new Object();
            obj2.A00 = charSequence2;
            arrayList2.add(obj2);
        }
        c96214Ue.A01.A0v.onCues(arrayList2);
    }

    private void A06(C4YA c4ya) {
        StringBuilder sb = new StringBuilder();
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(this.A07);
        AbstractC46512Bo.A05("TextRenderer", sb.toString(), c4ya);
        SEM sem = new SEM(this.A07, c4ya);
        Handler handler = this.A0D;
        if (handler != null) {
            handler.obtainMessage(1, sem).sendToTarget();
        } else {
            A07(sem);
        }
        A01();
        A04();
    }

    private void A07(SEM sem) {
        String str;
        C96214Ue c96214Ue = (C96214Ue) this.A0G;
        long j = c96214Ue.A00;
        c96214Ue.A00 = 1 + j;
        if (j < 0) {
            if (sem != null) {
                str = sem.A01.getMessage();
            } else {
                str = "null";
            }
            C95844St c95844St = c96214Ue.A01.A0v;
            StringBuilder sb = new StringBuilder();
            sb.append("Subtitle decoding failed. streamFormat=");
            sb.append(sem.A00);
            sb.append(", exception.msg=");
            sb.append(str);
            c95844St.E1k("CAPTIONING", "PLAYBACK_EXCEPTION", sb.toString());
        }
    }

    @Override // X.AbstractC96044Tn
    public final void A0L(long j, boolean z) {
        this.A06 = j;
        A01();
        this.A0A = false;
        this.A0B = false;
        this.A01 = -9223372036854775807L;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A03();
        InterfaceC126705oA interfaceC126705oA = this.A03;
        interfaceC126705oA.getClass();
        interfaceC126705oA.flush();
    }

    @Override // X.AbstractC96044Tn
    public final void A0N(C4B6[] c4b6Arr, long j, long j2) {
        this.A02 = j2;
        this.A07 = c4b6Arr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            A02();
        }
    }

    @Override // X.InterfaceC96054To
    public final boolean CTt() {
        return this.A0B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x00a3, code lost:
    
        if (r8 != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108 A[EXC_TOP_SPLITTER, LOOP:1: B:43:0x0108->B:63:0x0108, LOOP_START, SYNTHETIC] */
    @Override // X.InterfaceC96054To
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EGW(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96254Ui.EGW(long, long):void");
    }

    @Override // X.InterfaceC96074Tq
    public final int EpR(C4B6 c4b6) {
        int i;
        String str = c4b6.A0W;
        if (!"application/x-mp4-vtt".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str)) {
            i = 0;
            if (C2IH.A05(str)) {
                i = 1;
            }
        } else {
            i = 4;
        }
        return i | 0 | 128;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                A07((SEM) message.obj);
                return true;
            }
            throw new IllegalStateException();
        }
        A05((C4WP) message.obj);
        return true;
    }

    private void A04() {
        A03();
        InterfaceC126705oA interfaceC126705oA = this.A03;
        interfaceC126705oA.getClass();
        interfaceC126705oA.release();
        this.A03 = null;
        this.A00 = 0;
        A02();
    }
}
